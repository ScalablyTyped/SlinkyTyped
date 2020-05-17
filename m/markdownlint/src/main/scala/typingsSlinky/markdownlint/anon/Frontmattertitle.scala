package typingsSlinky.markdownlint.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Frontmattertitle extends js.Object {
  var front_matter_title: js.UndefOr[String] = js.native
  var level: js.UndefOr[Double] = js.native
}

object Frontmattertitle {
  @scala.inline
  def apply(): Frontmattertitle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Frontmattertitle]
  }
  @scala.inline
  implicit class FrontmattertitleOps[Self <: Frontmattertitle] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFront_matter_title(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("front_matter_title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFront_matter_title: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("front_matter_title")(js.undefined)
        ret
    }
    @scala.inline
    def withLevel(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("level")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLevel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("level")(js.undefined)
        ret
    }
  }
  
}

