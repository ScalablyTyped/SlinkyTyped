package typingsSlinky.officeUiFabricReact.components

import typingsSlinky.officeUiFabricReact.keytipTypesMod.IKeytipProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object KeytipContent {
  
  @scala.inline
  def apply(content: String, keySequences: js.Array[String]): SharedBuilder_IKeytipProps415083889[js.Object] = {
    val __props = js.Dynamic.literal(content = content.asInstanceOf[js.Any], keySequences = keySequences.asInstanceOf[js.Any])
    new SharedBuilder_IKeytipProps415083889[js.Object](js.Array(this.component, __props.asInstanceOf[IKeytipProps]))
  }
  
  @JSImport("office-ui-fabric-react/lib/components/Keytip/KeytipContent", "KeytipContent")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: IKeytipProps): SharedBuilder_IKeytipProps415083889[js.Object] = new SharedBuilder_IKeytipProps415083889[js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
