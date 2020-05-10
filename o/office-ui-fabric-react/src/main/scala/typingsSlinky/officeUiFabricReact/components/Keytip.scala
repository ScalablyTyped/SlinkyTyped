package typingsSlinky.officeUiFabricReact.components

import typingsSlinky.officeUiFabricReact.keytipTypesMod.IKeytipProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Keytip {
  @JSImport("office-ui-fabric-react", "Keytip")
  @js.native
  object component extends js.Object
  
  def withProps(p: IKeytipProps): SharedBuilder_IKeytipProps415083889[typingsSlinky.officeUiFabricReact.mod.Keytip] = new SharedBuilder_IKeytipProps415083889[typingsSlinky.officeUiFabricReact.mod.Keytip](js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(content: String, keySequences: js.Array[String]): SharedBuilder_IKeytipProps415083889[typingsSlinky.officeUiFabricReact.mod.Keytip] = {
    val __props = js.Dynamic.literal(content = content.asInstanceOf[js.Any], keySequences = keySequences.asInstanceOf[js.Any])
    new SharedBuilder_IKeytipProps415083889[typingsSlinky.officeUiFabricReact.mod.Keytip](js.Array(this.component, __props.asInstanceOf[IKeytipProps]))
  }
}

