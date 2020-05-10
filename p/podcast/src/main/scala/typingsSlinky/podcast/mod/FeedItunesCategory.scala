package typingsSlinky.podcast.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FeedItunesCategory extends js.Object {
  var subcats: js.UndefOr[js.Array[FeedItunesCategory]] = js.native
  var text: String = js.native
}

object FeedItunesCategory {
  @scala.inline
  def apply(text: String): FeedItunesCategory = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[FeedItunesCategory]
  }
  @scala.inline
  implicit class FeedItunesCategoryOps[Self <: FeedItunesCategory] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSubcats(value: js.Array[FeedItunesCategory]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subcats")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubcats: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subcats")(js.undefined)
        ret
    }
  }
  
}

