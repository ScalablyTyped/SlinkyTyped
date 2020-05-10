package typingsSlinky.gapiClientPhotoslibrary.gapi.client.photoslibrary

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FeatureFilter extends js.Object {
  /**
    * The set of features to be included in the media item search results.
    * The items in the set are ORed and may match any of the specified features.
    */
  var includedFeatures: js.UndefOr[js.Array[String]] = js.native
}

object FeatureFilter {
  @scala.inline
  def apply(): FeatureFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FeatureFilter]
  }
  @scala.inline
  implicit class FeatureFilterOps[Self <: FeatureFilter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIncludedFeatures(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includedFeatures")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncludedFeatures: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includedFeatures")(js.undefined)
        ret
    }
  }
  
}

