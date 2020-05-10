package typingsSlinky.googleapis.alphaMod.computeAlpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A Managed Instance resource.
  */
@js.native
trait SchemaManagedInstance extends js.Object {
  /**
    * [Output Only] The current action that the managed instance group has
    * scheduled for the instance. Possible values:  - NONE The instance is
    * running, and the managed instance group does not have any scheduled
    * actions for this instance.  - CREATING The managed instance group is
    * creating this instance. If the group fails to create this instance, it
    * will try again until it is successful.  - CREATING_WITHOUT_RETRIES The
    * managed instance group is attempting to create this instance only once.
    * If the group fails to create this instance, it does not try again and the
    * group&#39;s targetSize value is decreased instead.  - RECREATING The
    * managed instance group is recreating this instance.  - DELETING The
    * managed instance group is permanently deleting this instance.  -
    * ABANDONING The managed instance group is abandoning this instance. The
    * instance will be removed from the instance group and from any target
    * pools that are associated with this group.  - RESTARTING The managed
    * instance group is restarting the instance.  - REFRESHING The managed
    * instance group is applying configuration changes to the instance without
    * stopping it. For example, the group can update the target pool list for
    * an instance without stopping that instance.  - VERIFYING The managed
    * instance group has created the instance and it is in the process of being
    * verified.
    */
  var currentAction: js.UndefOr[String] = js.native
  /**
    * [Output only] The unique identifier for this resource. This field is
    * empty when instance does not exist.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * [Output Only] The URL of the instance. The URL can exist even if the
    * instance has not yet been created.
    */
  var instance: js.UndefOr[String] = js.native
  /**
    * [Output Only] Health state of the instance per health-check.
    */
  var instanceHealth: js.UndefOr[js.Array[SchemaManagedInstanceInstanceHealth]] = js.native
  /**
    * [Output Only] The status of the instance. This field is empty when the
    * instance does not exist.
    */
  var instanceStatus: js.UndefOr[String] = js.native
  /**
    * [Output Only] The intended template of the instance. This field is empty
    * when current_action is one of { DELETING, ABANDONING }.
    */
  var instanceTemplate: js.UndefOr[String] = js.native
  /**
    * [Output Only] Information about the last attempt to create or delete the
    * instance.
    */
  var lastAttempt: js.UndefOr[SchemaManagedInstanceLastAttempt] = js.native
  /**
    * [Output Only] Override defined for this instance.
    */
  var `override`: js.UndefOr[SchemaManagedInstanceOverride] = js.native
  /**
    * [Output Only] Preserved state applied from per-instance config for this
    * instance.
    */
  var preservedStateFromConfig: js.UndefOr[SchemaPreservedState] = js.native
  /**
    * [Output Only] Preserved state generated based on stateful policy for this
    * instance.
    */
  var preservedStateFromPolicy: js.UndefOr[SchemaPreservedState] = js.native
  /**
    * [Output Only] Tag describing the version.
    */
  var tag: js.UndefOr[String] = js.native
  /**
    * [Output Only] Intended version of this instance.
    */
  var version: js.UndefOr[SchemaManagedInstanceVersion] = js.native
}

object SchemaManagedInstance {
  @scala.inline
  def apply(): SchemaManagedInstance = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaManagedInstance]
  }
  @scala.inline
  implicit class SchemaManagedInstanceOps[Self <: SchemaManagedInstance] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCurrentAction(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentAction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCurrentAction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentAction")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
    @scala.inline
    def withInstance(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstance: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instance")(js.undefined)
        ret
    }
    @scala.inline
    def withInstanceHealth(value: js.Array[SchemaManagedInstanceInstanceHealth]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instanceHealth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstanceHealth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instanceHealth")(js.undefined)
        ret
    }
    @scala.inline
    def withInstanceStatus(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instanceStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstanceStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instanceStatus")(js.undefined)
        ret
    }
    @scala.inline
    def withInstanceTemplate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instanceTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstanceTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instanceTemplate")(js.undefined)
        ret
    }
    @scala.inline
    def withLastAttempt(value: SchemaManagedInstanceLastAttempt): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastAttempt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastAttempt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastAttempt")(js.undefined)
        ret
    }
    @scala.inline
    def withOverride(value: SchemaManagedInstanceOverride): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("override")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOverride: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("override")(js.undefined)
        ret
    }
    @scala.inline
    def withPreservedStateFromConfig(value: SchemaPreservedState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preservedStateFromConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreservedStateFromConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preservedStateFromConfig")(js.undefined)
        ret
    }
    @scala.inline
    def withPreservedStateFromPolicy(value: SchemaPreservedState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preservedStateFromPolicy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreservedStateFromPolicy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preservedStateFromPolicy")(js.undefined)
        ret
    }
    @scala.inline
    def withTag(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTag: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tag")(js.undefined)
        ret
    }
    @scala.inline
    def withVersion(value: SchemaManagedInstanceVersion): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(js.undefined)
        ret
    }
  }
  
}

