package typingsSlinky.googleapis

import typingsSlinky.googleapis.v5Mod.pagespeedonlineV5.SchemaLighthouseCategoryV5
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAccessibility extends js.Object {
  var accessibility: js.UndefOr[SchemaLighthouseCategoryV5] = js.native
  var `best-practices`: js.UndefOr[SchemaLighthouseCategoryV5] = js.native
  var performance: js.UndefOr[SchemaLighthouseCategoryV5] = js.native
  var pwa: js.UndefOr[SchemaLighthouseCategoryV5] = js.native
  var seo: js.UndefOr[SchemaLighthouseCategoryV5] = js.native
}

object AnonAccessibility {
  @scala.inline
  def apply(): AnonAccessibility = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonAccessibility]
  }
  @scala.inline
  implicit class AnonAccessibilityOps[Self <: AnonAccessibility] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccessibility(value: SchemaLighthouseCategoryV5): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessibility")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccessibility: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessibility")(js.undefined)
        ret
    }
    @scala.inline
    def `withBest-practices`(value: SchemaLighthouseCategoryV5): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("best-practices")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutBest-practices`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("best-practices")(js.undefined)
        ret
    }
    @scala.inline
    def withPerformance(value: SchemaLighthouseCategoryV5): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("performance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPerformance: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("performance")(js.undefined)
        ret
    }
    @scala.inline
    def withPwa(value: SchemaLighthouseCategoryV5): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pwa")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPwa: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pwa")(js.undefined)
        ret
    }
    @scala.inline
    def withSeo(value: SchemaLighthouseCategoryV5): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSeo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seo")(js.undefined)
        ret
    }
  }
  
}

