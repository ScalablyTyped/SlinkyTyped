package typingsSlinky.antDesignCompatible.anon

import typingsSlinky.antDesignCompatible.mentionMod.MentionPlacement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Loading extends js.Object {
  var loading: Boolean
  var multiLines: Boolean
  var notFoundContent: String
  var placement: MentionPlacement
}

object Loading {
  @scala.inline
  def apply(loading: Boolean, multiLines: Boolean, notFoundContent: String, placement: MentionPlacement): Loading = {
    val __obj = js.Dynamic.literal(loading = loading.asInstanceOf[js.Any], multiLines = multiLines.asInstanceOf[js.Any], notFoundContent = notFoundContent.asInstanceOf[js.Any], placement = placement.asInstanceOf[js.Any])
    __obj.asInstanceOf[Loading]
  }
}

