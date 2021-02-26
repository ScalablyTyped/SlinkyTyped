package typingsSlinky.reactShare.components

import typingsSlinky.reactShare.anon.CommonShareButtonPropstitAdditionalProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TelegramShareButton {
  
  @scala.inline
  def apply(url: String): SharedBuilder_CommonShareButtonPropstitAdditionalProps1781548010 = {
    val __props = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    new SharedBuilder_CommonShareButtonPropstitAdditionalProps1781548010(js.Array(this.component, __props.asInstanceOf[CommonShareButtonPropstitAdditionalProps]))
  }
  
  @JSImport("react-share", "TelegramShareButton")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: CommonShareButtonPropstitAdditionalProps): SharedBuilder_CommonShareButtonPropstitAdditionalProps1781548010 = new SharedBuilder_CommonShareButtonPropstitAdditionalProps1781548010(js.Array(this.component, p.asInstanceOf[js.Any]))
}
