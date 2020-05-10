package typingsSlinky.reactShare.components

import typingsSlinky.reactShare.CommonShareButtonPropstitClassName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object OKShareButton {
  @JSImport("react-share", "OKShareButton")
  @js.native
  object component extends js.Object
  
  def withProps(p: CommonShareButtonPropstitClassName): SharedBuilder_CommonShareButtonPropstitClassName_1383454814 = new SharedBuilder_CommonShareButtonPropstitClassName_1383454814(js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(url: String): SharedBuilder_CommonShareButtonPropstitClassName_1383454814 = {
    val __props = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    new SharedBuilder_CommonShareButtonPropstitClassName_1383454814(js.Array(this.component, __props.asInstanceOf[CommonShareButtonPropstitClassName]))
  }
}

