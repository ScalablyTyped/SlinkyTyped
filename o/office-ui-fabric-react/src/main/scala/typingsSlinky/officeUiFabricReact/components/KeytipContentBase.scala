package typingsSlinky.officeUiFabricReact.components

import typingsSlinky.officeUiFabricReact.keytipTypesMod.IKeytipProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object KeytipContentBase {
  @JSImport("office-ui-fabric-react/lib/components/Keytip/KeytipContent.base", "KeytipContentBase")
  @js.native
  object component extends js.Object
  
  def withProps(p: IKeytipProps): SharedBuilder_IKeytipProps415083889[typingsSlinky.officeUiFabricReact.keytipContentBaseMod.KeytipContentBase] = new SharedBuilder_IKeytipProps415083889[typingsSlinky.officeUiFabricReact.keytipContentBaseMod.KeytipContentBase](js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(content: String, keySequences: js.Array[String]): SharedBuilder_IKeytipProps415083889[typingsSlinky.officeUiFabricReact.keytipContentBaseMod.KeytipContentBase] = {
    val __props = js.Dynamic.literal(content = content.asInstanceOf[js.Any], keySequences = keySequences.asInstanceOf[js.Any])
    new SharedBuilder_IKeytipProps415083889[typingsSlinky.officeUiFabricReact.keytipContentBaseMod.KeytipContentBase](js.Array(this.component, __props.asInstanceOf[IKeytipProps]))
  }
}

