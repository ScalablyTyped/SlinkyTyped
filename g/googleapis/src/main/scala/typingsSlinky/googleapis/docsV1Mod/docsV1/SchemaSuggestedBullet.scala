package typingsSlinky.googleapis.docsV1Mod.docsV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A suggested change to a Bullet.
  */
@js.native
trait SchemaSuggestedBullet extends js.Object {
  /**
    * A Bullet that only includes the changes made in this suggestion. This can
    * be used along with the bullet_suggestion_state to see which fields have
    * changed and their new values.
    */
  var bullet: js.UndefOr[SchemaBullet] = js.native
  /**
    * A mask that indicates which of the fields on the base Bullet have been
    * changed in this suggestion.
    */
  var bulletSuggestionState: js.UndefOr[SchemaBulletSuggestionState] = js.native
}

object SchemaSuggestedBullet {
  @scala.inline
  def apply(): SchemaSuggestedBullet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSuggestedBullet]
  }
  @scala.inline
  implicit class SchemaSuggestedBulletOps[Self <: SchemaSuggestedBullet] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBullet(value: SchemaBullet): Self = {
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
    def withBulletSuggestionState(value: SchemaBulletSuggestionState): Self = {
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

