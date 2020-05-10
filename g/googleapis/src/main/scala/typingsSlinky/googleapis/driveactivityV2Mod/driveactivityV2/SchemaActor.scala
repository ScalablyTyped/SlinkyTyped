package typingsSlinky.googleapis.driveactivityV2Mod.driveactivityV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The actor of a Drive activity.
  */
@js.native
trait SchemaActor extends js.Object {
  /**
    * An administrator.
    */
  var administrator: js.UndefOr[SchemaAdministrator] = js.native
  /**
    * An anonymous user.
    */
  var anonymous: js.UndefOr[SchemaAnonymousUser] = js.native
  /**
    * An account acting on behalf of another.
    */
  var impersonation: js.UndefOr[SchemaImpersonation] = js.native
  /**
    * A non-user actor (i.e. system triggered).
    */
  var system: js.UndefOr[SchemaSystemEvent] = js.native
  /**
    * An end user.
    */
  var user: js.UndefOr[SchemaUser] = js.native
}

object SchemaActor {
  @scala.inline
  def apply(): SchemaActor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaActor]
  }
  @scala.inline
  implicit class SchemaActorOps[Self <: SchemaActor] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdministrator(value: SchemaAdministrator): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("administrator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdministrator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("administrator")(js.undefined)
        ret
    }
    @scala.inline
    def withAnonymous(value: SchemaAnonymousUser): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("anonymous")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnonymous: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("anonymous")(js.undefined)
        ret
    }
    @scala.inline
    def withImpersonation(value: SchemaImpersonation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("impersonation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImpersonation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("impersonation")(js.undefined)
        ret
    }
    @scala.inline
    def withSystem(value: SchemaSystemEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("system")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSystem: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("system")(js.undefined)
        ret
    }
    @scala.inline
    def withUser(value: SchemaUser): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("user")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUser: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("user")(js.undefined)
        ret
    }
  }
  
}

