package typingsSlinky.meteorAstronomy.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Cast extends js.Object {
  var cast: js.UndefOr[Boolean] = js.native
  @JSName("clone")
  var clone_FCast: js.UndefOr[Boolean] = js.native
  var merge: js.UndefOr[Boolean] = js.native
}

object Cast {
  @scala.inline
  def apply(): Cast = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Cast]
  }
  @scala.inline
  implicit class CastOps[Self <: Cast] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCast(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cast")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCast: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cast")(js.undefined)
        ret
    }
    @scala.inline
    def withClone(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClone: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clone")(js.undefined)
        ret
    }
    @scala.inline
    def withMerge(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("merge")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMerge: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("merge")(js.undefined)
        ret
    }
  }
  
}

