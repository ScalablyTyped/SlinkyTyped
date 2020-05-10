package typingsSlinky.pulumiKubernetes.inputMod.core.v1

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a Quobyte mount that lasts the lifetime of a pod. Quobyte volumes do not support
  * ownership management or SELinux relabeling.
  */
@js.native
trait QuobyteVolumeSource extends js.Object {
  /**
    * Group to map volume access to Default is no group
    */
  var group: js.UndefOr[Input[String]] = js.native
  /**
    * ReadOnly here will force the Quobyte volume to be mounted with read-only permissions.
    * Defaults to false.
    */
  var readOnly: js.UndefOr[Input[Boolean]] = js.native
  /**
    * Registry represents a single or multiple Quobyte Registry services specified as a string as
    * host:port pair (multiple entries are separated with commas) which acts as the central
    * registry for volumes
    */
  var registry: Input[String] = js.native
  /**
    * Tenant owning the given Quobyte volume in the Backend Used with dynamically provisioned
    * Quobyte volumes, value is set by the plugin
    */
  var tenant: js.UndefOr[Input[String]] = js.native
  /**
    * User to map volume access to Defaults to serivceaccount user
    */
  var user: js.UndefOr[Input[String]] = js.native
  /**
    * Volume is a string that references an already created Quobyte volume by name.
    */
  var volume: Input[String] = js.native
}

object QuobyteVolumeSource {
  @scala.inline
  def apply(registry: Input[String], volume: Input[String]): QuobyteVolumeSource = {
    val __obj = js.Dynamic.literal(registry = registry.asInstanceOf[js.Any], volume = volume.asInstanceOf[js.Any])
    __obj.asInstanceOf[QuobyteVolumeSource]
  }
  @scala.inline
  implicit class QuobyteVolumeSourceOps[Self <: QuobyteVolumeSource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRegistry(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("registry")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVolume(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("volume")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGroup(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("group")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("group")(js.undefined)
        ret
    }
    @scala.inline
    def withReadOnly(value: Input[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readOnly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReadOnly: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readOnly")(js.undefined)
        ret
    }
    @scala.inline
    def withTenant(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tenant")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTenant: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tenant")(js.undefined)
        ret
    }
    @scala.inline
    def withUser(value: Input[String]): Self = {
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

