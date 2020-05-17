package typingsSlinky.firebase.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Pagelocation
  extends /* key */ StringDictionary[js.Any] {
  var page_location: js.UndefOr[String] = js.native
  var page_path: js.UndefOr[String] = js.native
  var page_title: js.UndefOr[String] = js.native
}

object Pagelocation {
  @scala.inline
  def apply(): Pagelocation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Pagelocation]
  }
  @scala.inline
  implicit class PagelocationOps[Self <: Pagelocation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPage_location(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("page_location")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPage_location: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("page_location")(js.undefined)
        ret
    }
    @scala.inline
    def withPage_path(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("page_path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPage_path: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("page_path")(js.undefined)
        ret
    }
    @scala.inline
    def withPage_title(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("page_title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPage_title: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("page_title")(js.undefined)
        ret
    }
  }
  
}

