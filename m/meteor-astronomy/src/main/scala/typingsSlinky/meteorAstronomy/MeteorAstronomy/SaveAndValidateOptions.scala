package typingsSlinky.meteorAstronomy.MeteorAstronomy

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SaveAndValidateOptions[K] extends js.Object {
  var cast: js.UndefOr[Boolean] = js.native
  var fields: js.UndefOr[js.Array[K]] = js.native
  var simulation: js.UndefOr[Boolean] = js.native
  var stopOnFirstError: js.UndefOr[Boolean] = js.native
}

object SaveAndValidateOptions {
  @scala.inline
  def apply[K](): SaveAndValidateOptions[K] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SaveAndValidateOptions[K]]
  }
  @scala.inline
  implicit class SaveAndValidateOptionsOps[Self[k] <: SaveAndValidateOptions[k], K] (val x: Self[K]) extends AnyVal {
    @scala.inline
    def duplicate: Self[K] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[K]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[K] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[K] with Other]
    @scala.inline
    def withCast(value: Boolean): Self[K] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cast")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCast: Self[K] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cast")(js.undefined)
        ret
    }
    @scala.inline
    def withFields(value: js.Array[K]): Self[K] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fields")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFields: Self[K] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fields")(js.undefined)
        ret
    }
    @scala.inline
    def withSimulation(value: Boolean): Self[K] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("simulation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSimulation: Self[K] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("simulation")(js.undefined)
        ret
    }
    @scala.inline
    def withStopOnFirstError(value: Boolean): Self[K] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stopOnFirstError")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStopOnFirstError: Self[K] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stopOnFirstError")(js.undefined)
        ret
    }
  }
  
}

