package typingsSlinky.antDesignCompatible

import typingsSlinky.antDesignCompatible.mentionMod.MentionPlacement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonLoading extends js.Object {
  var loading: Boolean = js.native
  var multiLines: Boolean = js.native
  var notFoundContent: String = js.native
  var placement: MentionPlacement = js.native
}

object AnonLoading {
  @scala.inline
  def apply(loading: Boolean, multiLines: Boolean, notFoundContent: String, placement: MentionPlacement): AnonLoading = {
    val __obj = js.Dynamic.literal(loading = loading.asInstanceOf[js.Any], multiLines = multiLines.asInstanceOf[js.Any], notFoundContent = notFoundContent.asInstanceOf[js.Any], placement = placement.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonLoading]
  }
  @scala.inline
  implicit class AnonLoadingOps[Self <: AnonLoading] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLoading(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loading")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMultiLines(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiLines")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNotFoundContent(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notFoundContent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPlacement(value: MentionPlacement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placement")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

