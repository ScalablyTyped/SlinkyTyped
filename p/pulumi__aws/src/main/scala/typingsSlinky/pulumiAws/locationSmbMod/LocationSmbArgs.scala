package typingsSlinky.pulumiAws.locationSmbMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.pulumiAws.inputMod.datasync.LocationSmbMountOptions
import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LocationSmbArgs extends js.Object {
  /**
    * A list of DataSync Agent ARNs with which this location will be associated.
    */
  val agentArns: Input[js.Array[Input[String]]] = js.native
  /**
    * The name of the Windows domain the SMB server belongs to.
    */
  val domain: js.UndefOr[Input[String]] = js.native
  /**
    * Configuration block containing mount options used by DataSync to access the SMB Server. Can be `AUTOMATIC`, `SMB2`, or `SMB3`.
    */
  val mountOptions: js.UndefOr[Input[LocationSmbMountOptions]] = js.native
  /**
    * The password of the user who can mount the share and has file permissions in the SMB.
    */
  val password: Input[String] = js.native
  /**
    * Specifies the IP address or DNS name of the SMB server. The DataSync Agent(s) use this to mount the SMB share.
    */
  val serverHostname: Input[String] = js.native
  /**
    * Subdirectory to perform actions as source or destination. Should be exported by the NFS server.
    */
  val subdirectory: Input[String] = js.native
  /**
    * Key-value pairs of resource tags to assign to the DataSync Location.
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.native
  /**
    * The user who can mount the share and has file and folder permissions in the SMB share.
    */
  val user: Input[String] = js.native
}

object LocationSmbArgs {
  @scala.inline
  def apply(
    agentArns: Input[js.Array[Input[String]]],
    password: Input[String],
    serverHostname: Input[String],
    subdirectory: Input[String],
    user: Input[String]
  ): LocationSmbArgs = {
    val __obj = js.Dynamic.literal(agentArns = agentArns.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any], serverHostname = serverHostname.asInstanceOf[js.Any], subdirectory = subdirectory.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocationSmbArgs]
  }
  @scala.inline
  implicit class LocationSmbArgsOps[Self <: LocationSmbArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAgentArns(value: Input[js.Array[Input[String]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("agentArns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPassword(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("password")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withServerHostname(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serverHostname")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSubdirectory(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subdirectory")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUser(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("user")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDomain(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domain")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDomain: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domain")(js.undefined)
        ret
    }
    @scala.inline
    def withMountOptions(value: Input[LocationSmbMountOptions]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mountOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMountOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mountOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withTags(value: Input[StringDictionary[_]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(js.undefined)
        ret
    }
  }
  
}

