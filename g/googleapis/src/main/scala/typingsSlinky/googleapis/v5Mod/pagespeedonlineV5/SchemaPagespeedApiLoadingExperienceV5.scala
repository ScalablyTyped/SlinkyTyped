package typingsSlinky.googleapis.v5Mod.pagespeedonlineV5

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.googleapis.AnonPercentile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaPagespeedApiLoadingExperienceV5 extends js.Object {
  /**
    * The url, pattern or origin which the metrics are on.
    */
  var id: js.UndefOr[String] = js.native
  var initial_url: js.UndefOr[String] = js.native
  var metrics: js.UndefOr[StringDictionary[AnonPercentile]] = js.native
  var overall_category: js.UndefOr[String] = js.native
}

object SchemaPagespeedApiLoadingExperienceV5 {
  @scala.inline
  def apply(): SchemaPagespeedApiLoadingExperienceV5 = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPagespeedApiLoadingExperienceV5]
  }
  @scala.inline
  implicit class SchemaPagespeedApiLoadingExperienceV5Ops[Self <: SchemaPagespeedApiLoadingExperienceV5] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
    @scala.inline
    def withInitial_url(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initial_url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInitial_url: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initial_url")(js.undefined)
        ret
    }
    @scala.inline
    def withMetrics(value: StringDictionary[AnonPercentile]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metrics")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMetrics: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metrics")(js.undefined)
        ret
    }
    @scala.inline
    def withOverall_category(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overall_category")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOverall_category: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overall_category")(js.undefined)
        ret
    }
  }
  
}

