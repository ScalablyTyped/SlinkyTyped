package typingsSlinky.reactShare.components

import typingsSlinky.reactShare.CommonShareButtonPropsquo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object WorkplaceShareButton {
  @JSImport("react-share", "WorkplaceShareButton")
  @js.native
  object component extends js.Object
  
  def withProps(p: CommonShareButtonPropsquo): SharedBuilder_CommonShareButtonPropsquo1795168681 = new SharedBuilder_CommonShareButtonPropsquo1795168681(js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(url: String): SharedBuilder_CommonShareButtonPropsquo1795168681 = {
    val __props = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    new SharedBuilder_CommonShareButtonPropsquo1795168681(js.Array(this.component, __props.asInstanceOf[CommonShareButtonPropsquo]))
  }
}

