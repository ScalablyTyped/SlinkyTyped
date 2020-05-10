package typingsSlinky.gapiClientPhotoslibrary.gapi.client.photoslibrary

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Filters extends js.Object {
  /** Filters the media items based on their content. */
  var contentFilter: js.UndefOr[ContentFilter] = js.native
  /** Filters the media items based on their creation date. */
  var dateFilter: js.UndefOr[DateFilter] = js.native
  /**
    * If set, the results exclude media items that were not created by this app.
    * Defaults to false (all media items are returned). This field is ignored if
    * the photoslibrary.readonly.appcreateddata scope is used.
    */
  var excludeNonAppCreatedData: js.UndefOr[Boolean] = js.native
  /** Filters the media items based on their features. */
  var featureFilter: js.UndefOr[FeatureFilter] = js.native
  /**
    * If set, the results include media items that the user has archived.
    * Defaults to false (archived media items aren't included).
    */
  var includeArchivedMedia: js.UndefOr[Boolean] = js.native
  /** Filters the media items based on the type of media. */
  var mediaTypeFilter: js.UndefOr[MediaTypeFilter] = js.native
}

object Filters {
  @scala.inline
  def apply(): Filters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Filters]
  }
  @scala.inline
  implicit class FiltersOps[Self <: Filters] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContentFilter(value: ContentFilter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentFilter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContentFilter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentFilter")(js.undefined)
        ret
    }
    @scala.inline
    def withDateFilter(value: DateFilter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateFilter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDateFilter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateFilter")(js.undefined)
        ret
    }
    @scala.inline
    def withExcludeNonAppCreatedData(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("excludeNonAppCreatedData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExcludeNonAppCreatedData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("excludeNonAppCreatedData")(js.undefined)
        ret
    }
    @scala.inline
    def withFeatureFilter(value: FeatureFilter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("featureFilter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFeatureFilter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("featureFilter")(js.undefined)
        ret
    }
    @scala.inline
    def withIncludeArchivedMedia(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeArchivedMedia")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncludeArchivedMedia: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeArchivedMedia")(js.undefined)
        ret
    }
    @scala.inline
    def withMediaTypeFilter(value: MediaTypeFilter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mediaTypeFilter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMediaTypeFilter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mediaTypeFilter")(js.undefined)
        ret
    }
  }
  
}

