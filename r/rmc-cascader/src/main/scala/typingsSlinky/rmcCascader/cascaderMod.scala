package typingsSlinky.rmcCascader

import typingsSlinky.react.mod.Component
import typingsSlinky.rmcCascader.anon.Cols
import typingsSlinky.rmcCascader.anon.Value
import typingsSlinky.rmcCascader.cascaderTypesMod.ICascaderProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rmc-cascader/lib/Cascader", JSImport.Namespace)
@js.native
object cascaderMod extends js.Object {
  
  @js.native
  trait Cascader
    extends Component[ICascaderProps, js.Any, js.Any] {
    
    @JSName("componentWillReceiveProps")
    def componentWillReceiveProps_MCascader(nextProps: js.Any): Unit = js.native
    
    def getCols(): js.Any = js.native
    
    def getValue(d: js.Any, `val`: js.Any): js.Any = js.native
    
    def onValueChange(value: js.Any, index: js.Any): Unit = js.native
    
    @JSName("state")
    var state_Cascader: Value = js.native
  }
  
  @js.native
  class default () extends Cascader
  /* static members */
  @js.native
  object default extends js.Object {
    
    var defaultProps: Cols = js.native
  }
}
