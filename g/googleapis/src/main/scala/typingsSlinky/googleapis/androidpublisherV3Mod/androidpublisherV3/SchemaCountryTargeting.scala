package typingsSlinky.googleapis.androidpublisherV3Mod.androidpublisherV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaCountryTargeting extends js.Object {
  var countries: js.UndefOr[js.Array[String]] = js.native
  var includeRestOfWorld: js.UndefOr[Boolean] = js.native
}

object SchemaCountryTargeting {
  @scala.inline
  def apply(): SchemaCountryTargeting = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCountryTargeting]
  }
  @scala.inline
  implicit class SchemaCountryTargetingOps[Self <: SchemaCountryTargeting] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCountries(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("countries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCountries: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("countries")(js.undefined)
        ret
    }
    @scala.inline
    def withIncludeRestOfWorld(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeRestOfWorld")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncludeRestOfWorld: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeRestOfWorld")(js.undefined)
        ret
    }
  }
  
}

