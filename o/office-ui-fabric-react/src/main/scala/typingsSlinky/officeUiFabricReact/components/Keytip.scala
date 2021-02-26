package typingsSlinky.officeUiFabricReact.components

import typingsSlinky.officeUiFabricReact.keytipTypesMod.IKeytipProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Keytip {
  
  @scala.inline
  def apply(content: String, keySequences: js.Array[String]): SharedBuilder_IKeytipProps415083889[typingsSlinky.officeUiFabricReact.mod.Keytip] = {
    val __props = js.Dynamic.literal(content = content.asInstanceOf[js.Any], keySequences = keySequences.asInstanceOf[js.Any])
    new SharedBuilder_IKeytipProps415083889[typingsSlinky.officeUiFabricReact.mod.Keytip](js.Array(this.component, __props.asInstanceOf[IKeytipProps]))
  }
  
  @JSImport("office-ui-fabric-react", "Keytip")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: IKeytipProps): SharedBuilder_IKeytipProps415083889[typingsSlinky.officeUiFabricReact.mod.Keytip] = new SharedBuilder_IKeytipProps415083889[typingsSlinky.officeUiFabricReact.mod.Keytip](js.Array(this.component, p.asInstanceOf[js.Any]))
}
