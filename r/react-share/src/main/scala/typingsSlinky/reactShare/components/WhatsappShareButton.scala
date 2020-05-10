package typingsSlinky.reactShare.components

import typingsSlinky.reactShare.CommonShareButtonPropstitBeforeOnClick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object WhatsappShareButton {
  @JSImport("react-share", "WhatsappShareButton")
  @js.native
  object component extends js.Object
  
  def withProps(p: CommonShareButtonPropstitBeforeOnClick): SharedBuilder_CommonShareButtonPropstitBeforeOnClick614950568 = new SharedBuilder_CommonShareButtonPropstitBeforeOnClick614950568(js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(url: String): SharedBuilder_CommonShareButtonPropstitBeforeOnClick614950568 = {
    val __props = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    new SharedBuilder_CommonShareButtonPropstitBeforeOnClick614950568(js.Array(this.component, __props.asInstanceOf[CommonShareButtonPropstitBeforeOnClick]))
  }
}

