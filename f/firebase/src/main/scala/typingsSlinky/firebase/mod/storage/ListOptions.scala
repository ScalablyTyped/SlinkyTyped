package typingsSlinky.firebase.mod.storage

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The options `list()` accepts.
  */
@js.native
trait ListOptions extends js.Object {
  /**
    * If set, limits the total number of `prefixes` and `items` to return.
    * The default and maximum maxResults is 1000.
    */
  var maxResults: js.UndefOr[Double | Null] = js.native
  /**
    * The `nextPageToken` from a previous call to `list()`. If provided,
    * listing is resumed from the previous position.
    */
  var pageToken: js.UndefOr[String | Null] = js.native
}

object ListOptions {
  @scala.inline
  def apply(): ListOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListOptions]
  }
  @scala.inline
  implicit class ListOptionsOps[Self <: ListOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMaxResults(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxResults")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxResults: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxResults")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxResultsNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxResults")(null)
        ret
    }
    @scala.inline
    def withPageToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPageToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageToken")(js.undefined)
        ret
    }
    @scala.inline
    def withPageTokenNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageToken")(null)
        ret
    }
  }
  
}

