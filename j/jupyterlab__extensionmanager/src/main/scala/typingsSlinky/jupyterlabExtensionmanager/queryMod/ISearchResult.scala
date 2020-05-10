package typingsSlinky.jupyterlabExtensionmanager.queryMod

import typingsSlinky.jupyterlabExtensionmanager.AnonFlags
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISearchResult extends js.Object {
  /**
    * A collection of search results.
    */
  var objects: js.Array[AnonFlags] = js.native
  /**
    * Timestamp of the search result creation.
    */
  var time: String = js.native
  /**
    * The total number of objects found by the search.
    *
    * This can be greater than the number of objects due
    * to pagination of the search results.
    */
  var total: Double = js.native
}

object ISearchResult {
  @scala.inline
  def apply(objects: js.Array[AnonFlags], time: String, total: Double): ISearchResult = {
    val __obj = js.Dynamic.literal(objects = objects.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISearchResult]
  }
  @scala.inline
  implicit class ISearchResultOps[Self <: ISearchResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withObjects(value: js.Array[AnonFlags]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("objects")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("time")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTotal(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("total")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

