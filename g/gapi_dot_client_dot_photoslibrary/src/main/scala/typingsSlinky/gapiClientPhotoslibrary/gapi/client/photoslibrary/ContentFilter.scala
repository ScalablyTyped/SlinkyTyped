package typingsSlinky.gapiClientPhotoslibrary.gapi.client.photoslibrary

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ContentFilter extends js.Object {
  /**
    * The set of categories which are not to be included in the media item search
    * results. The items in the set are ORed. There's a maximum of 10
    * `excludedContentCategories` per request.
    */
  var excludedContentCategories: js.UndefOr[js.Array[String]] = js.native
  /**
    * The set of categories to be included in the media item search results.
    * The items in the set are ORed. There's a maximum of 10
    * `includedContentCategories` per request.
    */
  var includedContentCategories: js.UndefOr[js.Array[String]] = js.native
}

object ContentFilter {
  @scala.inline
  def apply(): ContentFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContentFilter]
  }
  @scala.inline
  implicit class ContentFilterOps[Self <: ContentFilter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExcludedContentCategories(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("excludedContentCategories")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExcludedContentCategories: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("excludedContentCategories")(js.undefined)
        ret
    }
    @scala.inline
    def withIncludedContentCategories(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includedContentCategories")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncludedContentCategories: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includedContentCategories")(js.undefined)
        ret
    }
  }
  
}

