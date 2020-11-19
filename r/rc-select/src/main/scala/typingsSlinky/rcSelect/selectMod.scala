package typingsSlinky.rcSelect

import slinky.core.facade.ReactRef
import typingsSlinky.rcSelect.generateMod.RefSelectProps
import typingsSlinky.rcSelect.generateMod.SelectProps
import typingsSlinky.rcSelect.generatorMod.DefaultValueType
import typingsSlinky.rcSelect.interfaceMod.OptionsType
import typingsSlinky.rcSelect.optGroupMod.OptionGroupFC
import typingsSlinky.rcSelect.optionMod.OptionFC
import typingsSlinky.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rc-select/lib/Select", JSImport.Namespace)
@js.native
object selectMod extends js.Object {
  
  /**
    * Typescript not support generic with function component,
    * we have to wrap an class component to handle this.
    */
  @js.native
  trait Select[VT]
    extends Component[SelectProps[OptionsType, VT], js.Object, js.Any] {
    
    def blur(): Unit = js.native
    
    def focus(): Unit = js.native
    
    var selectRef: ReactRef[RefSelectProps] = js.native
  }
  
  /**
    * Typescript not support generic with function component,
    * we have to wrap an class component to handle this.
    */
  @js.native
  class default[VT] () extends Select[VT]
  /* static members */
  @js.native
  object default extends js.Object {
    
    var OptGroup: OptionGroupFC = js.native
    
    var Option: OptionFC = js.native
  }
  
  type ExportedSelectProps[ValueType /* <: DefaultValueType */] = SelectProps[OptionsType, ValueType]
}
