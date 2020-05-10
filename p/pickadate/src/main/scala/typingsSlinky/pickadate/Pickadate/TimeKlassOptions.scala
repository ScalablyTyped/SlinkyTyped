package typingsSlinky.pickadate.Pickadate

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TimeKlassOptions extends KlassOptions {
   // default 'picker picker--time'
  // List of times
  var list: js.UndefOr[String] = js.native
   // default 'picker__list'
  var listItem: js.UndefOr[String] = js.native
   // default 'picker__list-item'
  // Time states
  var viewset: js.UndefOr[String] = js.native
}

object TimeKlassOptions {
  @scala.inline
  def apply(): TimeKlassOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TimeKlassOptions]
  }
  @scala.inline
  implicit class TimeKlassOptionsOps[Self <: TimeKlassOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withList(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutList: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.undefined)
        ret
    }
    @scala.inline
    def withListItem(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listItem")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutListItem: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listItem")(js.undefined)
        ret
    }
    @scala.inline
    def withViewset(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutViewset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewset")(js.undefined)
        ret
    }
  }
  
}

