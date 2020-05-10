package typingsSlinky.googleapis.appsactivityV1Mod.appsactivityV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the changes associated with an action taken by a user.
  */
@js.native
trait SchemaEvent extends js.Object {
  /**
    * Additional event types. Some events may have multiple types when multiple
    * actions are part of a single event. For example, creating a document,
    * renaming it, and sharing it may be part of a single file-creation event.
    */
  var additionalEventTypes: js.UndefOr[js.Array[String]] = js.native
  /**
    * The time at which the event occurred formatted as Unix time in
    * milliseconds.
    */
  var eventTimeMillis: js.UndefOr[String] = js.native
  /**
    * Whether this event is caused by a user being deleted.
    */
  var fromUserDeletion: js.UndefOr[Boolean] = js.native
  /**
    * Extra information for move type events, such as changes in an
    * object&#39;s parents.
    */
  var move: js.UndefOr[SchemaMove] = js.native
  /**
    * Extra information for permissionChange type events, such as the user or
    * group the new permission applies to.
    */
  var permissionChanges: js.UndefOr[js.Array[SchemaPermissionChange]] = js.native
  /**
    * The main type of event that occurred.
    */
  var primaryEventType: js.UndefOr[String] = js.native
  /**
    * Extra information for rename type events, such as the old and new names.
    */
  var rename: js.UndefOr[SchemaRename] = js.native
  /**
    * Information specific to the Target object modified by the event.
    */
  var target: js.UndefOr[SchemaTarget] = js.native
  /**
    * Represents the user responsible for the event.
    */
  var user: js.UndefOr[SchemaUser] = js.native
}

object SchemaEvent {
  @scala.inline
  def apply(): SchemaEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaEvent]
  }
  @scala.inline
  implicit class SchemaEventOps[Self <: SchemaEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdditionalEventTypes(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("additionalEventTypes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdditionalEventTypes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("additionalEventTypes")(js.undefined)
        ret
    }
    @scala.inline
    def withEventTimeMillis(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventTimeMillis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEventTimeMillis: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventTimeMillis")(js.undefined)
        ret
    }
    @scala.inline
    def withFromUserDeletion(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fromUserDeletion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFromUserDeletion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fromUserDeletion")(js.undefined)
        ret
    }
    @scala.inline
    def withMove(value: SchemaMove): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("move")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMove: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("move")(js.undefined)
        ret
    }
    @scala.inline
    def withPermissionChanges(value: js.Array[SchemaPermissionChange]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("permissionChanges")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPermissionChanges: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("permissionChanges")(js.undefined)
        ret
    }
    @scala.inline
    def withPrimaryEventType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("primaryEventType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrimaryEventType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("primaryEventType")(js.undefined)
        ret
    }
    @scala.inline
    def withRename(value: SchemaRename): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rename")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRename: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rename")(js.undefined)
        ret
    }
    @scala.inline
    def withTarget(value: SchemaTarget): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTarget: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(js.undefined)
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

