package typingsSlinky.officeUiFabricReact

import typingsSlinky.officeUiFabricReact.anon.PartialIChoiceGroupOption
import typingsSlinky.officeUiFabricReact.choiceGroupOptionTypesMod.IChoiceGroupOptionProps
import typingsSlinky.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object choiceGroupOptionBaseMod {
  
  @JSImport("office-ui-fabric-react/lib/components/ChoiceGroup/ChoiceGroupOption/ChoiceGroupOption.base", "ChoiceGroupOptionBase")
  @js.native
  class ChoiceGroupOptionBase protected ()
    extends Component[IChoiceGroupOptionProps, js.Object, js.Any] {
    def this(props: IChoiceGroupOptionProps) = this()
    
    var _classNames: js.Any = js.native
    
    var _onBlur: js.Any = js.native
    
    var _onChange: js.Any = js.native
    
    var _onFocus: js.Any = js.native
    
    var _onRenderField: js.Any = js.native
    
    var _onRenderLabel: js.Any = js.native
  }
  /* static members */
  object ChoiceGroupOptionBase {
    
    @JSImport("office-ui-fabric-react/lib/components/ChoiceGroup/ChoiceGroupOption/ChoiceGroupOption.base", "ChoiceGroupOptionBase")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("office-ui-fabric-react/lib/components/ChoiceGroup/ChoiceGroupOption/ChoiceGroupOption.base", "ChoiceGroupOptionBase.defaultProps")
    @js.native
    def defaultProps: PartialIChoiceGroupOption = js.native
    @scala.inline
    def defaultProps_=(x: PartialIChoiceGroupOption): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
}
