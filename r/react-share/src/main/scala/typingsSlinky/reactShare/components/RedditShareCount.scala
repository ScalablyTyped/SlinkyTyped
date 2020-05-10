package typingsSlinky.reactShare.components

import typingsSlinky.reactShare.mod.ShareCountComponentProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object RedditShareCount {
  @JSImport("react-share", "RedditShareCount")
  @js.native
  object component extends js.Object
  
  def withProps(p: ShareCountComponentProps): SharedBuilder_ShareCountComponentProps_1337477943 = new SharedBuilder_ShareCountComponentProps_1337477943(js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(url: String): SharedBuilder_ShareCountComponentProps_1337477943 = {
    val __props = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    new SharedBuilder_ShareCountComponentProps_1337477943(js.Array(this.component, __props.asInstanceOf[ShareCountComponentProps]))
  }
}

