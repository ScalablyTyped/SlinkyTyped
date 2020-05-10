package typingsSlinky.reactShare.components

import typingsSlinky.reactShare.CommonShareButtonPropstitDescription
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object InstapaperShareButton {
  @JSImport("react-share", "InstapaperShareButton")
  @js.native
  object component extends js.Object
  
  def withProps(p: CommonShareButtonPropstitDescription): SharedBuilder_CommonShareButtonPropstitDescription245950307 = new SharedBuilder_CommonShareButtonPropstitDescription245950307(js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(url: String): SharedBuilder_CommonShareButtonPropstitDescription245950307 = {
    val __props = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    new SharedBuilder_CommonShareButtonPropstitDescription245950307(js.Array(this.component, __props.asInstanceOf[CommonShareButtonPropstitDescription]))
  }
}

