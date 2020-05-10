package typingsSlinky.googleapis.cloudsearchV1Mod.cloudsearchV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents an interaction between a user and an item.
  */
@js.native
trait SchemaInteraction extends js.Object {
  /**
    * The time when the user acted on the item.  If multiple actions of the
    * same type exist for a single user, only the most recent action is
    * recorded.
    */
  var interactionTime: js.UndefOr[String] = js.native
  /**
    * The user that acted on the item.
    */
  var principal: js.UndefOr[SchemaPrincipal] = js.native
  var `type`: js.UndefOr[String] = js.native
}

object SchemaInteraction {
  @scala.inline
  def apply(): SchemaInteraction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInteraction]
  }
  @scala.inline
  implicit class SchemaInteractionOps[Self <: SchemaInteraction] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInteractionTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interactionTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInteractionTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interactionTime")(js.undefined)
        ret
    }
    @scala.inline
    def withPrincipal(value: SchemaPrincipal): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("principal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrincipal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("principal")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
  }
  
}

