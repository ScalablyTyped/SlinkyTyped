package typingsSlinky.jwplayer.jwplayer

import typingsSlinky.jwplayer.jwplayerStrings.googima
import typingsSlinky.jwplayer.jwplayerStrings.mid
import typingsSlinky.jwplayer.jwplayerStrings.post
import typingsSlinky.jwplayer.jwplayerStrings.pre
import typingsSlinky.jwplayer.jwplayerStrings.vast
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AdRequestParam extends js.Object {
  var adposition: pre | mid | post = js.native
  var client: vast | googima = js.native
  var offset: pre | mid | post = js.native
  var tag: String = js.native
}

object AdRequestParam {
  @scala.inline
  def apply(adposition: pre | mid | post, client: vast | googima, offset: pre | mid | post, tag: String): AdRequestParam = {
    val __obj = js.Dynamic.literal(adposition = adposition.asInstanceOf[js.Any], client = client.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdRequestParam]
  }
  @scala.inline
  implicit class AdRequestParamOps[Self <: AdRequestParam] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdposition(value: pre | mid | post): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adposition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClient(value: vast | googima): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("client")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOffset(value: pre | mid | post): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTag(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tag")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

