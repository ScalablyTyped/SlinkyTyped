package typingsSlinky.gapiClientBooks

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonContainsEpubBubbles extends js.Object {
  var containsEpubBubbles: js.UndefOr[Boolean] = js.native
  var containsImageBubbles: js.UndefOr[Boolean] = js.native
  var epubBubbleVersion: js.UndefOr[String] = js.native
  var imageBubbleVersion: js.UndefOr[String] = js.native
}

object AnonContainsEpubBubbles {
  @scala.inline
  def apply(): AnonContainsEpubBubbles = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonContainsEpubBubbles]
  }
  @scala.inline
  implicit class AnonContainsEpubBubblesOps[Self <: AnonContainsEpubBubbles] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContainsEpubBubbles(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containsEpubBubbles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContainsEpubBubbles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containsEpubBubbles")(js.undefined)
        ret
    }
    @scala.inline
    def withContainsImageBubbles(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containsImageBubbles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContainsImageBubbles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containsImageBubbles")(js.undefined)
        ret
    }
    @scala.inline
    def withEpubBubbleVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("epubBubbleVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEpubBubbleVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("epubBubbleVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withImageBubbleVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageBubbleVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImageBubbleVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageBubbleVersion")(js.undefined)
        ret
    }
  }
  
}

