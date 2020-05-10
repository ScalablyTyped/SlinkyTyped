package typingsSlinky.googleAppsScript.GoogleAppsScript.Adsense.Collection

import typingsSlinky.googleAppsScript.GoogleAppsScript.Adsense.Collection.Metadata.DimensionsCollection
import typingsSlinky.googleAppsScript.GoogleAppsScript.Adsense.Collection.Metadata.MetricsCollection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MetadataCollection extends js.Object {
  var Dimensions: js.UndefOr[DimensionsCollection] = js.native
  var Metrics: js.UndefOr[MetricsCollection] = js.native
}

object MetadataCollection {
  @scala.inline
  def apply(): MetadataCollection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MetadataCollection]
  }
  @scala.inline
  implicit class MetadataCollectionOps[Self <: MetadataCollection] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDimensions(value: DimensionsCollection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Dimensions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDimensions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Dimensions")(js.undefined)
        ret
    }
    @scala.inline
    def withMetrics(value: MetricsCollection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Metrics")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMetrics: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Metrics")(js.undefined)
        ret
    }
  }
  
}

