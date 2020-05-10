package typingsSlinky.mfiles

import typingsSlinky.mfiles.MFiles.MFExtApplicationPlatform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IVaultCustomApplicationManagementOperations extends js.Object {
  def DownloadCustomApplicationBlock(DownloadID: Double, BlockSize: Double, Offset: Double): js.Array[Double] = js.native
  def DownloadCustomApplicationBlockBegin(ApplicationID: String): IFileDownloadSession = js.native
  def DownloadCustomApplicationBlockBegin_32bit(ApplicationID: String): IFileDownloadSession = js.native
  def DownloadCustomApplicationBlock_32bit(DownloadID: Double, BlockSize: Double, Offset: Double): js.Array[Double] = js.native
  def EnableCustomApplication(ApplicationID: String, Enabled: Boolean): Unit = js.native
  def GetCustomApplication(ApplicationID: String): ICustomApplication = js.native
  def GetCustomApplications(): ICustomApplications = js.native
  def GetCustomApplicationsEx(Platform: MFExtApplicationPlatform): ICustomApplications = js.native
  def InstallCustomApplication(File: String): Unit = js.native
  def UninstallCustomApplication(ApplicationID: String): Unit = js.native
}

object IVaultCustomApplicationManagementOperations {
  @scala.inline
  def apply(
    DownloadCustomApplicationBlock: (Double, Double, Double) => js.Array[Double],
    DownloadCustomApplicationBlockBegin: String => IFileDownloadSession,
    DownloadCustomApplicationBlockBegin_32bit: String => IFileDownloadSession,
    DownloadCustomApplicationBlock_32bit: (Double, Double, Double) => js.Array[Double],
    EnableCustomApplication: (String, Boolean) => Unit,
    GetCustomApplication: String => ICustomApplication,
    GetCustomApplications: () => ICustomApplications,
    GetCustomApplicationsEx: MFExtApplicationPlatform => ICustomApplications,
    InstallCustomApplication: String => Unit,
    UninstallCustomApplication: String => Unit
  ): IVaultCustomApplicationManagementOperations = {
    val __obj = js.Dynamic.literal(DownloadCustomApplicationBlock = js.Any.fromFunction3(DownloadCustomApplicationBlock), DownloadCustomApplicationBlockBegin = js.Any.fromFunction1(DownloadCustomApplicationBlockBegin), DownloadCustomApplicationBlockBegin_32bit = js.Any.fromFunction1(DownloadCustomApplicationBlockBegin_32bit), DownloadCustomApplicationBlock_32bit = js.Any.fromFunction3(DownloadCustomApplicationBlock_32bit), EnableCustomApplication = js.Any.fromFunction2(EnableCustomApplication), GetCustomApplication = js.Any.fromFunction1(GetCustomApplication), GetCustomApplications = js.Any.fromFunction0(GetCustomApplications), GetCustomApplicationsEx = js.Any.fromFunction1(GetCustomApplicationsEx), InstallCustomApplication = js.Any.fromFunction1(InstallCustomApplication), UninstallCustomApplication = js.Any.fromFunction1(UninstallCustomApplication))
    __obj.asInstanceOf[IVaultCustomApplicationManagementOperations]
  }
  @scala.inline
  implicit class IVaultCustomApplicationManagementOperationsOps[Self <: IVaultCustomApplicationManagementOperations] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDownloadCustomApplicationBlock(value: (Double, Double, Double) => js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DownloadCustomApplicationBlock")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withDownloadCustomApplicationBlockBegin(value: String => IFileDownloadSession): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DownloadCustomApplicationBlockBegin")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDownloadCustomApplicationBlockBegin_32bit(value: String => IFileDownloadSession): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DownloadCustomApplicationBlockBegin_32bit")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDownloadCustomApplicationBlock_32bit(value: (Double, Double, Double) => js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DownloadCustomApplicationBlock_32bit")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withEnableCustomApplication(value: (String, Boolean) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EnableCustomApplication")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withGetCustomApplication(value: String => ICustomApplication): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetCustomApplication")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetCustomApplications(value: () => ICustomApplications): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetCustomApplications")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetCustomApplicationsEx(value: MFExtApplicationPlatform => ICustomApplications): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetCustomApplicationsEx")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withInstallCustomApplication(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstallCustomApplication")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUninstallCustomApplication(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UninstallCustomApplication")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

