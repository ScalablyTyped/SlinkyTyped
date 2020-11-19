package typingsSlinky.officeUiFabricReact.components

import typingsSlinky.officeUiFabricReact.keytipTypesMod.IKeytipProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object KeytipContent {
  
  @JSImport("office-ui-fabric-react/lib/components/Keytip/KeytipContent", "KeytipContent")
  @js.native
  object component extends js.Object
  
  def withProps(p: IKeytipProps): SharedBuilder_IKeytipProps415083889[js.Object] = new SharedBuilder_IKeytipProps415083889[js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply(content: String, keySequences: js.Array[String]): SharedBuilder_IKeytipProps415083889[js.Object] = {
    val __props = js.Dynamic.literal(content = content.asInstanceOf[js.Any], keySequences = keySequences.asInstanceOf[js.Any])
    new SharedBuilder_IKeytipProps415083889[js.Object](js.Array(this.component, __props.asInstanceOf[IKeytipProps]))
  }
}
