package typingsSlinky.reactShare.components

import typingsSlinky.reactShare.mod.ShareCountComponentProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object PinterestShareCount {
  
  @scala.inline
  def apply(url: String): SharedBuilder_ShareCountComponentProps_1337477943 = {
    val __props = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    new SharedBuilder_ShareCountComponentProps_1337477943(js.Array(this.component, __props.asInstanceOf[ShareCountComponentProps]))
  }
  
  @JSImport("react-share", "PinterestShareCount")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: ShareCountComponentProps): SharedBuilder_ShareCountComponentProps_1337477943 = new SharedBuilder_ShareCountComponentProps_1337477943(js.Array(this.component, p.asInstanceOf[js.Any]))
}
