package typingsSlinky.rcSelect

import slinky.core.facade.ReactRef
import typingsSlinky.rcSelect.generateMod.RefSelectProps
import typingsSlinky.rcSelect.generateMod.SelectProps
import typingsSlinky.rcSelect.generatorMod.DefaultValueType
import typingsSlinky.rcSelect.interfaceMod.OptionsType
import typingsSlinky.rcSelect.optGroupMod.OptionGroupFC
import typingsSlinky.rcSelect.optionMod.OptionFC
import typingsSlinky.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object selectMod {
  
  /**
    * Typescript not support generic with function component,
    * we have to wrap an class component to handle this.
    */
  @JSImport("rc-select/lib/Select", JSImport.Default)
  @js.native
  class default[VT] () extends Select[VT]
  object default {
    
    @JSImport("rc-select/lib/Select", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    /* was `typeof OptGroup` */
    @JSImport("rc-select/lib/Select", "default.OptGroup")
    @js.native
    def OptGroup: OptionGroupFC = js.native
    @scala.inline
    def OptGroup_=(x: OptionGroupFC): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("OptGroup")(x.asInstanceOf[js.Any])
    
    /* static member */
    /* was `typeof Option` */
    @JSImport("rc-select/lib/Select", "default.Option")
    @js.native
    def Option: OptionFC = js.native
    @scala.inline
    def Option_=(x: OptionFC): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Option")(x.asInstanceOf[js.Any])
  }
  
  type ExportedSelectProps[ValueType /* <: DefaultValueType */] = SelectProps[OptionsType, ValueType]
  
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
}
