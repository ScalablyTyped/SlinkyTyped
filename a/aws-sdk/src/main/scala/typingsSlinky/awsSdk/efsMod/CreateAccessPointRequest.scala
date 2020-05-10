package typingsSlinky.awsSdk.efsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateAccessPointRequest extends js.Object {
  /**
    * A string of up to 64 ASCII characters that Amazon EFS uses to ensure idempotent creation.
    */
  var ClientToken: typingsSlinky.awsSdk.efsMod.ClientToken = js.native
  /**
    * The ID of the EFS file system that the access point provides access to.
    */
  var FileSystemId: typingsSlinky.awsSdk.efsMod.FileSystemId = js.native
  /**
    * The operating system user and group applied to all file system requests made using the access point.
    */
  var PosixUser: js.UndefOr[typingsSlinky.awsSdk.efsMod.PosixUser] = js.native
  /**
    * Specifies the directory on the Amazon EFS file system that the access point exposes as the root directory of your file system to NFS clients using the access point. The clients using the access point can only access the root directory and below. If the RootDirectory &gt; Path specified does not exist, EFS creates it and applies the CreationInfo settings when a client connects to an access point. When specifying a RootDirectory, you need to provide the Path, and the CreationInfo is optional.
    */
  var RootDirectory: js.UndefOr[typingsSlinky.awsSdk.efsMod.RootDirectory] = js.native
  /**
    * Creates tags associated with the access point. Each tag is a key-value pair.
    */
  var Tags: js.UndefOr[typingsSlinky.awsSdk.efsMod.Tags] = js.native
}

object CreateAccessPointRequest {
  @scala.inline
  def apply(ClientToken: ClientToken, FileSystemId: FileSystemId): CreateAccessPointRequest = {
    val __obj = js.Dynamic.literal(ClientToken = ClientToken.asInstanceOf[js.Any], FileSystemId = FileSystemId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateAccessPointRequest]
  }
  @scala.inline
  implicit class CreateAccessPointRequestOps[Self <: CreateAccessPointRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClientToken(value: ClientToken): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClientToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFileSystemId(value: FileSystemId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FileSystemId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPosixUser(value: PosixUser): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PosixUser")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPosixUser: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PosixUser")(js.undefined)
        ret
    }
    @scala.inline
    def withRootDirectory(value: RootDirectory): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RootDirectory")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRootDirectory: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RootDirectory")(js.undefined)
        ret
    }
    @scala.inline
    def withTags(value: Tags): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tags")(js.undefined)
        ret
    }
  }
  
}

