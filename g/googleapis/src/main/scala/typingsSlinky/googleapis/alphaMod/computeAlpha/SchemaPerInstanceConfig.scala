package typingsSlinky.googleapis.alphaMod.computeAlpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaPerInstanceConfig extends js.Object {
  /**
    * Fingerprint of this per-instance config. This field may be used in
    * optimistic locking. It will be ignored when inserting a per-instance
    * config. An up-to-date fingerprint must be provided in order to update an
    * existing per-instance config or the field needs to be unset.
    */
  var fingerprint: js.UndefOr[String] = js.native
  /**
    * The URL of the instance. Serves as a merge key during
    * UpdatePerInstanceConfigs operation, i.e. if per-instance config with the
    * same instance URL exists then it will be updated, otherwise a new one
    * will be created.
    */
  var instance: js.UndefOr[String] = js.native
  /**
    * The name of the per-instance config and the corresponding instance.
    * Serves as a merge key during UpdatePerInstanceConfigs operation, i.e. if
    * per-instance config with the same name exists then it will be updated,
    * otherwise a new one will be created for the VM instance with the same
    * name. An attempt to create a per-instance config for a VM instance that
    * either doesn&#39;t exist or is not part of the group will result in a
    * failure.
    */
  var name: js.UndefOr[String] = js.native
  var `override`: js.UndefOr[SchemaManagedInstanceOverride] = js.native
  /**
    * Intended preserved state for the given instance. Does not contain state
    * generated based on Stateful Policy.
    */
  var preservedState: js.UndefOr[SchemaPreservedState] = js.native
}

object SchemaPerInstanceConfig {
  @scala.inline
  def apply(): SchemaPerInstanceConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPerInstanceConfig]
  }
  @scala.inline
  implicit class SchemaPerInstanceConfigOps[Self <: SchemaPerInstanceConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withPreservedState(value: SchemaPreservedState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preservedState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreservedState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preservedState")(js.undefined)
        ret
    }
  }
  
}

