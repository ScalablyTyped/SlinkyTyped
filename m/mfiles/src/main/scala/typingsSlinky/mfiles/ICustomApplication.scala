package typingsSlinky.mfiles

import typingsSlinky.mfiles.MFiles.MFCustomApplicationType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICustomApplication extends js.Object {
  val ApplicationType: MFCustomApplicationType = js.native
  val ChecksumHash: String = js.native
  val Description: String = js.native
  val Enabled: Boolean = js.native
  val ID: String = js.native
  val MasterApplication: String = js.native
  val Name: String = js.native
  val Optional: Boolean = js.native
  val Publisher: String = js.native
  val RequireSystemAccess: Boolean = js.native
  val Version: String = js.native
  def Clone(): ICustomApplication = js.native
}

object ICustomApplication {
  @scala.inline
  def apply(
    ApplicationType: MFCustomApplicationType,
    ChecksumHash: String,
    Clone: () => ICustomApplication,
    Description: String,
    Enabled: Boolean,
    ID: String,
    MasterApplication: String,
    Name: String,
    Optional: Boolean,
    Publisher: String,
    RequireSystemAccess: Boolean,
    Version: String
  ): ICustomApplication = {
    val __obj = js.Dynamic.literal(ApplicationType = ApplicationType.asInstanceOf[js.Any], ChecksumHash = ChecksumHash.asInstanceOf[js.Any], Clone = js.Any.fromFunction0(Clone), Description = Description.asInstanceOf[js.Any], Enabled = Enabled.asInstanceOf[js.Any], ID = ID.asInstanceOf[js.Any], MasterApplication = MasterApplication.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Optional = Optional.asInstanceOf[js.Any], Publisher = Publisher.asInstanceOf[js.Any], RequireSystemAccess = RequireSystemAccess.asInstanceOf[js.Any], Version = Version.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICustomApplication]
  }
  @scala.inline
  implicit class ICustomApplicationOps[Self <: ICustomApplication] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApplicationType(value: MFCustomApplicationType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ApplicationType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChecksumHash(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ChecksumHash")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClone(value: () => ICustomApplication): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Clone")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Enabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withID(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMasterApplication(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MasterApplication")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOptional(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Optional")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPublisher(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Publisher")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRequireSystemAccess(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RequireSystemAccess")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Version")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

