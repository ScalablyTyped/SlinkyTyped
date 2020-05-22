package typingsSlinky.jwplayer.jwplayer

import typingsSlinky.jwplayer.jwplayerStrings.googima
import typingsSlinky.jwplayer.jwplayerStrings.mid
import typingsSlinky.jwplayer.jwplayerStrings.post
import typingsSlinky.jwplayer.jwplayerStrings.pre
import typingsSlinky.jwplayer.jwplayerStrings.vast
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdRequestParam extends js.Object {
  var adposition: pre | mid | post
  var client: vast | googima
  var offset: pre | mid | post
  var tag: String
}

object AdRequestParam {
  @scala.inline
  def apply(adposition: pre | mid | post, client: vast | googima, offset: pre | mid | post, tag: String): AdRequestParam = {
    val __obj = js.Dynamic.literal(adposition = adposition.asInstanceOf[js.Any], client = client.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdRequestParam]
  }
}

