package typingsSlinky.officeUiFabricReact

import slinky.core.ReactComponentClass
import typingsSlinky.officeUiFabricReact.choiceGroupOptionTypesMod.IChoiceGroupOptionProps
import typingsSlinky.officeUiFabricReact.choiceGroupTypesMod.IChoiceGroupProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object choiceGroupMod {
  
  @JSImport("office-ui-fabric-react/lib/components/ChoiceGroup", "ChoiceGroup")
  @js.native
  val ChoiceGroup: ReactComponentClass[IChoiceGroupProps] = js.native
  
  @JSImport("office-ui-fabric-react/lib/components/ChoiceGroup", "ChoiceGroupBase")
  @js.native
  class ChoiceGroupBase protected ()
    extends typingsSlinky.officeUiFabricReact.choiceGroupBaseMod.ChoiceGroupBase {
    def this(props: IChoiceGroupProps) = this()
  }
  
  @JSImport("office-ui-fabric-react/lib/components/ChoiceGroup", "ChoiceGroupOption")
  @js.native
  val ChoiceGroupOption: ReactComponentClass[IChoiceGroupOptionProps] = js.native
}
