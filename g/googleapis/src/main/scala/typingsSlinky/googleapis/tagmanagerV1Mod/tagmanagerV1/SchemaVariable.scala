package typingsSlinky.googleapis.tagmanagerV1Mod.tagmanagerV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a Google Tag Manager Variable.
  */
@js.native
trait SchemaVariable extends js.Object {
  /**
    * GTM Account ID.
    */
  var accountId: js.UndefOr[String] = js.native
  /**
    * GTM Container ID.
    */
  var containerId: js.UndefOr[String] = js.native
  /**
    * For mobile containers only: A list of trigger IDs for disabling
    * conditional variables; the variable is enabled if one of the enabling
    * trigger is true while all the disabling trigger are false. Treated as an
    * unordered set.
    */
  var disablingTriggerId: js.UndefOr[js.Array[String]] = js.native
  /**
    * For mobile containers only: A list of trigger IDs for enabling
    * conditional variables; the variable is enabled if one of the enabling
    * triggers is true while all the disabling triggers are false. Treated as
    * an unordered set.
    */
  var enablingTriggerId: js.UndefOr[js.Array[String]] = js.native
  /**
    * The fingerprint of the GTM Variable as computed at storage time. This
    * value is recomputed whenever the variable is modified.
    */
  var fingerprint: js.UndefOr[String] = js.native
  /**
    * Variable display name.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * User notes on how to apply this variable in the container.
    */
  var notes: js.UndefOr[String] = js.native
  /**
    * The variable&#39;s parameters.
    */
  var parameter: js.UndefOr[js.Array[SchemaParameter]] = js.native
  /**
    * Parent folder id.
    */
  var parentFolderId: js.UndefOr[String] = js.native
  /**
    * The end timestamp in milliseconds to schedule a variable.
    */
  var scheduleEndMs: js.UndefOr[String] = js.native
  /**
    * The start timestamp in milliseconds to schedule a variable.
    */
  var scheduleStartMs: js.UndefOr[String] = js.native
  /**
    * GTM Variable Type.
    */
  var `type`: js.UndefOr[String] = js.native
  /**
    * The Variable ID uniquely identifies the GTM Variable.
    */
  var variableId: js.UndefOr[String] = js.native
}

object SchemaVariable {
  @scala.inline
  def apply(): SchemaVariable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaVariable]
  }
  @scala.inline
  implicit class SchemaVariableOps[Self <: SchemaVariable] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccountId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accountId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccountId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accountId")(js.undefined)
        ret
    }
    @scala.inline
    def withContainerId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containerId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContainerId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containerId")(js.undefined)
        ret
    }
    @scala.inline
    def withDisablingTriggerId(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disablingTriggerId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisablingTriggerId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disablingTriggerId")(js.undefined)
        ret
    }
    @scala.inline
    def withEnablingTriggerId(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enablingTriggerId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnablingTriggerId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enablingTriggerId")(js.undefined)
        ret
    }
    @scala.inline
    def withFingerprint(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fingerprint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFingerprint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fingerprint")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withNotes(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNotes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notes")(js.undefined)
        ret
    }
    @scala.inline
    def withParameter(value: js.Array[SchemaParameter]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parameter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParameter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parameter")(js.undefined)
        ret
    }
    @scala.inline
    def withParentFolderId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentFolderId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParentFolderId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentFolderId")(js.undefined)
        ret
    }
    @scala.inline
    def withScheduleEndMs(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scheduleEndMs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScheduleEndMs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scheduleEndMs")(js.undefined)
        ret
    }
    @scala.inline
    def withScheduleStartMs(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scheduleStartMs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScheduleStartMs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scheduleStartMs")(js.undefined)
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
    @scala.inline
    def withVariableId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("variableId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVariableId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("variableId")(js.undefined)
        ret
    }
  }
  
}

