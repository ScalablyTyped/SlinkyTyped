package typingsSlinky.gapiClientDrive.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IndexableText extends js.Object {
  /** Text to be indexed for the file to improve fullText queries. This is limited to 128KB in length and may contain HTML elements. */
  var indexableText: js.UndefOr[String] = js.native
  /** A thumbnail for the file. This will only be used if Drive cannot generate a standard thumbnail. */
  var thumbnail: js.UndefOr[Image] = js.native
}

object IndexableText {
  @scala.inline
  def apply(): IndexableText = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IndexableText]
  }
  @scala.inline
  implicit class IndexableTextOps[Self <: IndexableText] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIndexableText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indexableText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIndexableText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indexableText")(js.undefined)
        ret
    }
    @scala.inline
    def withThumbnail(value: Image): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thumbnail")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThumbnail: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thumbnail")(js.undefined)
        ret
    }
  }
  
}

