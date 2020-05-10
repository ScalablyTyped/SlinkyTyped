package typingsSlinky.csstype.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PageHyphen[TLength] extends js.Object {
  var bleed: js.UndefOr[PageBleedProperty[TLength]] = js.native
  var marks: js.UndefOr[PageMarksProperty] = js.native
}

object PageHyphen {
  @scala.inline
  def apply[TLength](): PageHyphen[TLength] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PageHyphen[TLength]]
  }
  @scala.inline
  implicit class PageHyphenOps[Self[tlength] <: PageHyphen[tlength], TLength] (val x: Self[TLength]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TLength] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TLength]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[TLength] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[TLength] with Other]
    @scala.inline
    def withBleed(value: PageBleedProperty[TLength]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bleed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBleed: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bleed")(js.undefined)
        ret
    }
    @scala.inline
    def withMarks(value: PageMarksProperty): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMarks: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marks")(js.undefined)
        ret
    }
  }
  
}

