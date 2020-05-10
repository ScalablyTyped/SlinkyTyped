package typingsSlinky.firebase

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.firebase.mod.analytics.Item
import typingsSlinky.firebase.mod.analytics.Promotion
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonContentid
  extends /* key */ StringDictionary[js.Any] {
  var content_id: js.UndefOr[String] = js.native
  var content_type: js.UndefOr[String] = js.native
  var items: js.UndefOr[js.Array[Item]] = js.native
  var promotions: js.UndefOr[js.Array[Promotion]] = js.native
}

object AnonContentid {
  @scala.inline
  def apply(): AnonContentid = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonContentid]
  }
  @scala.inline
  implicit class AnonContentidOps[Self <: AnonContentid] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContent_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContent_id: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content_id")(js.undefined)
        ret
    }
    @scala.inline
    def withContent_type(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content_type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContent_type: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content_type")(js.undefined)
        ret
    }
    @scala.inline
    def withItems(value: js.Array[Item]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("items")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItems: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("items")(js.undefined)
        ret
    }
    @scala.inline
    def withPromotions(value: js.Array[Promotion]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("promotions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPromotions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("promotions")(js.undefined)
        ret
    }
  }
  
}

