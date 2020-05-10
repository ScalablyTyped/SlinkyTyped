package typingsSlinky.baconjs.typesFlatmapMod

import typingsSlinky.baconjs.describeMod.Desc
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FlatMapParams extends js.Object {
  var desc: js.UndefOr[Desc] = js.native
  var firstOnly: js.UndefOr[Boolean] = js.native
  var limit: js.UndefOr[Double] = js.native
  var mapError: js.UndefOr[Boolean] = js.native
}

object FlatMapParams {
  @scala.inline
  def apply(): FlatMapParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FlatMapParams]
  }
  @scala.inline
  implicit class FlatMapParamsOps[Self <: FlatMapParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDesc(value: Desc): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("desc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDesc: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("desc")(js.undefined)
        ret
    }
    @scala.inline
    def withFirstOnly(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstOnly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFirstOnly: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstOnly")(js.undefined)
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
    def withMapError(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mapError")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMapError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mapError")(js.undefined)
        ret
    }
  }
  
}

