package typingsSlinky.googleapis.tagmanagerV1Mod.tagmanagerV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a Google Tag Manager Macro.
  */
@js.native
trait SchemaMacro extends js.Object {
  /**
    * GTM Account ID.
    */
  var accountId: js.UndefOr[String] = js.native
  /**
    * GTM Container ID.
    */
  var containerId: js.UndefOr[String] = js.native
  /**
    * For mobile containers only: A list of rule IDs for disabling conditional
    * macros; the macro is enabled if one of the enabling rules is true while
    * all the disabling rules are false. Treated as an unordered set.
    */
  var disablingRuleId: js.UndefOr[js.Array[String]] = js.native
  /**
    * For mobile containers only: A list of rule IDs for enabling conditional
    * macros; the macro is enabled if one of the enabling rules is true while
    * all the disabling rules are false. Treated as an unordered set.
    */
  var enablingRuleId: js.UndefOr[js.Array[String]] = js.native
  /**
    * The fingerprint of the GTM Macro as computed at storage time. This value
    * is recomputed whenever the macro is modified.
    */
  var fingerprint: js.UndefOr[String] = js.native
  /**
    * The Macro ID uniquely identifies the GTM Macro.
    */
  var macroId: js.UndefOr[String] = js.native
  /**
    * Macro display name.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * User notes on how to apply this macro in the container.
    */
  var notes: js.UndefOr[String] = js.native
  /**
    * The macro&#39;s parameters.
    */
  var parameter: js.UndefOr[js.Array[SchemaParameter]] = js.native
  /**
    * Parent folder id.
    */
  var parentFolderId: js.UndefOr[String] = js.native
  /**
    * The end timestamp in milliseconds to schedule a macro.
    */
  var scheduleEndMs: js.UndefOr[String] = js.native
  /**
    * The start timestamp in milliseconds to schedule a macro.
    */
  var scheduleStartMs: js.UndefOr[String] = js.native
  /**
    * GTM Macro Type.
    */
  var `type`: js.UndefOr[String] = js.native
}

object SchemaMacro {
  @scala.inline
  def apply(): SchemaMacro = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMacro]
  }
  @scala.inline
  implicit class SchemaMacroOps[Self <: SchemaMacro] (val x: Self) extends AnyVal {
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
    def withDisablingRuleId(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disablingRuleId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisablingRuleId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disablingRuleId")(js.undefined)
        ret
    }
    @scala.inline
    def withEnablingRuleId(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enablingRuleId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnablingRuleId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enablingRuleId")(js.undefined)
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
    def withMacroId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("macroId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMacroId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("macroId")(js.undefined)
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
  }
  
}

