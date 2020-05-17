package typingsSlinky.gematriya.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Geresh extends js.Object {
  var geresh: js.UndefOr[Boolean] = js.native
  var limit: js.UndefOr[Double] = js.native
  var punctuate: js.UndefOr[Boolean] = js.native
}

object Geresh {
  @scala.inline
  def apply(): Geresh = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Geresh]
  }
  @scala.inline
  implicit class GereshOps[Self <: Geresh] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGeresh(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("geresh")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGeresh: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("geresh")(js.undefined)
        ret
    }
    @scala.inline
    def withLimit(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("limit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLimit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("limit")(js.undefined)
        ret
    }
    @scala.inline
    def withPunctuate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("punctuate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPunctuate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("punctuate")(js.undefined)
        ret
    }
  }
  
}

