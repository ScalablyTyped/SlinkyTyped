package typingsSlinky.expressValidator.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<express-validator.express-validator/src/matched-data.MatchedDataOptions> */
@js.native
trait PartialMatchedDataOptions extends js.Object {
  var includeOptionals: js.UndefOr[Boolean] = js.native
  var locations: js.UndefOr[js.Array[typingsSlinky.expressValidator.baseMod.Location]] = js.native
  var onlyValidData: js.UndefOr[Boolean] = js.native
}

object PartialMatchedDataOptions {
  @scala.inline
  def apply(): PartialMatchedDataOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialMatchedDataOptions]
  }
  @scala.inline
  implicit class PartialMatchedDataOptionsOps[Self <: PartialMatchedDataOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIncludeOptionals(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeOptionals")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncludeOptionals: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeOptionals")(js.undefined)
        ret
    }
    @scala.inline
    def withLocations(value: js.Array[typingsSlinky.expressValidator.baseMod.Location]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locations")(js.undefined)
        ret
    }
    @scala.inline
    def withOnlyValidData(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onlyValidData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnlyValidData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onlyValidData")(js.undefined)
        ret
    }
  }
  
}

