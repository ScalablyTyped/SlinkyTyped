package typingsSlinky.officeUiFabricReact

import slinky.core.ReactComponentClass
import typingsSlinky.officeUiFabricReact.choiceGroupOptionTypesMod.IChoiceGroupOptionProps
import typingsSlinky.officeUiFabricReact.choiceGroupTypesMod.IChoiceGroupProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/components/ChoiceGroup", JSImport.Namespace)
@js.native
object choiceGroupMod extends js.Object {
  @js.native
  class ChoiceGroupBase protected ()
    extends typingsSlinky.officeUiFabricReact.choiceGroupBaseMod.ChoiceGroupBase {
    def this(props: IChoiceGroupProps) = this()
  }
  
  val ChoiceGroup: ReactComponentClass[IChoiceGroupProps] = js.native
  val ChoiceGroupOption: ReactComponentClass[IChoiceGroupOptionProps] = js.native
}

