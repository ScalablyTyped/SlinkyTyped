package typingsSlinky.reactShare.components

import typingsSlinky.reactShare.anon.CommonShareButtonPropstitClassName
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object MailruShareButton {
  
  @scala.inline
  def apply(url: String): SharedBuilder_CommonShareButtonPropstitClassName_1569907912 = {
    val __props = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    new SharedBuilder_CommonShareButtonPropstitClassName_1569907912(js.Array(this.component, __props.asInstanceOf[CommonShareButtonPropstitClassName]))
  }
  
  @JSImport("react-share", "MailruShareButton")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: CommonShareButtonPropstitClassName): SharedBuilder_CommonShareButtonPropstitClassName_1569907912 = new SharedBuilder_CommonShareButtonPropstitClassName_1569907912(js.Array(this.component, p.asInstanceOf[js.Any]))
}
