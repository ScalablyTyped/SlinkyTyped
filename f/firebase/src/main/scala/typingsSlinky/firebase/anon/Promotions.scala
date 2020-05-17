package typingsSlinky.firebase.anon

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.firebase.mod.analytics.Promotion
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Promotions
  extends /* key */ StringDictionary[js.Any] {
  var promotions: js.UndefOr[js.Array[Promotion]] = js.native
}

object Promotions {
  @scala.inline
  def apply(): Promotions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Promotions]
  }
  @scala.inline
  implicit class PromotionsOps[Self <: Promotions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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

