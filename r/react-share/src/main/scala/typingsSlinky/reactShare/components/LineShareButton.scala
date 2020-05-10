package typingsSlinky.reactShare.components

import typingsSlinky.reactShare.CommonShareButtonPropstitAdditionalProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object LineShareButton {
  @JSImport("react-share", "LineShareButton")
  @js.native
  object component extends js.Object
  
  def withProps(p: CommonShareButtonPropstitAdditionalProps): SharedBuilder_CommonShareButtonPropstitAdditionalProps1610606314 = new SharedBuilder_CommonShareButtonPropstitAdditionalProps1610606314(js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(url: String): SharedBuilder_CommonShareButtonPropstitAdditionalProps1610606314 = {
    val __props = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    new SharedBuilder_CommonShareButtonPropstitAdditionalProps1610606314(js.Array(this.component, __props.asInstanceOf[CommonShareButtonPropstitAdditionalProps]))
  }
}

