package typingsSlinky.googleAppsScript.GoogleAppsScript.Docs.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SuggestedBullet extends js.Object {
  var bullet: js.UndefOr[Bullet] = js.native
  var bulletSuggestionState: js.UndefOr[BulletSuggestionState] = js.native
}

object SuggestedBullet {
  @scala.inline
  def apply(): SuggestedBullet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SuggestedBullet]
  }
  @scala.inline
  implicit class SuggestedBulletOps[Self <: SuggestedBullet] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBullet(value: Bullet): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bullet")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBullet: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bullet")(js.undefined)
        ret
    }
    @scala.inline
    def withBulletSuggestionState(value: BulletSuggestionState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bulletSuggestionState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBulletSuggestionState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bulletSuggestionState")(js.undefined)
        ret
    }
  }
  
}

