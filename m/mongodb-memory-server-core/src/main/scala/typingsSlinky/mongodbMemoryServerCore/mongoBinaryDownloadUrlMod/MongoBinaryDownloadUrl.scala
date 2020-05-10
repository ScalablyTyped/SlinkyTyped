package typingsSlinky.mongodbMemoryServerCore.mongoBinaryDownloadUrlMod

import typingsSlinky.mongodbMemoryServerCore.getosMod.AnyOS
import typingsSlinky.mongodbMemoryServerCore.getosMod.LinuxOS
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MongoBinaryDownloadUrl extends js.Object {
  var arch: String = js.native
  var os: js.UndefOr[AnyOS] = js.native
  var platform: String = js.native
  var version: String = js.native
  /**
    * Get the archive
    * Version independent
    */
  def getArchiveName(): js.Promise[String] = js.native
  /**
    * Get the archive for Linux
    * (from: https://www.mongodb.org/dl/linux)
    */
  def getArchiveNameLinux(): js.Promise[String] = js.native
  /**
    * Get the archive for OSX (Mac)
    * (from: https://www.mongodb.org/dl/osx)
    */
  def getArchiveNameOsx(): js.Promise[String] = js.native
  /**
    * Get the archive for Windows
    * (from: https://www.mongodb.org/dl/win32)
    */
  def getArchiveNameWin(): js.Promise[String] = js.native
  /**
    * Get the version string for Debain
    * @param os LinuxOS Object
    */
  def getDebianVersionString(os: LinuxOS): String = js.native
  /**
    * Assemble the URL to download
    * Calls all the necessary functions to determine the URL
    */
  def getDownloadUrl(): js.Promise[String] = js.native
  /**
    * Get the version string for ElementaryOS
    * @param os LinuxOS Object
    */
  def getElementaryOSVersionString(os: LinuxOS): String = js.native
  /**
    * Get the version string for Fedora
    * @param os LinuxOS Object
    */
  def getFedoraVersionString(os: LinuxOS): String = js.native
  /**
    * Linux Fallback
    * @param os LinuxOS Object
    */
  def getLegacyVersionString(os: AnyOS): String = js.native
  /**
    * Get the version string (with distro)
    * @param os LinuxOS Object
    */
  def getLinuxOSVersionString(os: LinuxOS): String = js.native
  /**
    * Get the version string for Linux Mint
    * @param os LinuxOS Object
    */
  def getMintVersionString(os: LinuxOS): String = js.native
  /**
    * Get the version string for Red Hat Enterprise Linux
    * @param os LinuxOS Object
    */
  def getRhelVersionString(os: LinuxOS): String = js.native
  /**
    * Get the version string for Suse / OpenSuse
    * @param os LinuxOS Object
    */
  def getSuseVersionString(os: LinuxOS): String = js.native
  /**
    * Get the version string for Ubuntu
    * @param os LinuxOS Object
    */
  def getUbuntuVersionString(os: LinuxOS): String = js.native
  /**
    * Translate input arch to mongodb useable arch
    * @example
    * x64 -> x86_64
    * @param platform The Platform to translate
    */
  def translateArch(arch: String, mongoPlatform: String): String = js.native
  /**
    * Translate input platform to mongodb useable platfrom
    * @example
    * darwin -> osx
    * @param platform The Platform to translate
    */
  def translatePlatform(platform: String): String = js.native
}

object MongoBinaryDownloadUrl {
  @scala.inline
  def apply(
    arch: String,
    getArchiveName: () => js.Promise[String],
    getArchiveNameLinux: () => js.Promise[String],
    getArchiveNameOsx: () => js.Promise[String],
    getArchiveNameWin: () => js.Promise[String],
    getDebianVersionString: LinuxOS => String,
    getDownloadUrl: () => js.Promise[String],
    getElementaryOSVersionString: LinuxOS => String,
    getFedoraVersionString: LinuxOS => String,
    getLegacyVersionString: AnyOS => String,
    getLinuxOSVersionString: LinuxOS => String,
    getMintVersionString: LinuxOS => String,
    getRhelVersionString: LinuxOS => String,
    getSuseVersionString: LinuxOS => String,
    getUbuntuVersionString: LinuxOS => String,
    platform: String,
    translateArch: (String, String) => String,
    translatePlatform: String => String,
    version: String
  ): MongoBinaryDownloadUrl = {
    val __obj = js.Dynamic.literal(arch = arch.asInstanceOf[js.Any], getArchiveName = js.Any.fromFunction0(getArchiveName), getArchiveNameLinux = js.Any.fromFunction0(getArchiveNameLinux), getArchiveNameOsx = js.Any.fromFunction0(getArchiveNameOsx), getArchiveNameWin = js.Any.fromFunction0(getArchiveNameWin), getDebianVersionString = js.Any.fromFunction1(getDebianVersionString), getDownloadUrl = js.Any.fromFunction0(getDownloadUrl), getElementaryOSVersionString = js.Any.fromFunction1(getElementaryOSVersionString), getFedoraVersionString = js.Any.fromFunction1(getFedoraVersionString), getLegacyVersionString = js.Any.fromFunction1(getLegacyVersionString), getLinuxOSVersionString = js.Any.fromFunction1(getLinuxOSVersionString), getMintVersionString = js.Any.fromFunction1(getMintVersionString), getRhelVersionString = js.Any.fromFunction1(getRhelVersionString), getSuseVersionString = js.Any.fromFunction1(getSuseVersionString), getUbuntuVersionString = js.Any.fromFunction1(getUbuntuVersionString), platform = platform.asInstanceOf[js.Any], translateArch = js.Any.fromFunction2(translateArch), translatePlatform = js.Any.fromFunction1(translatePlatform), version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[MongoBinaryDownloadUrl]
  }
  @scala.inline
  implicit class MongoBinaryDownloadUrlOps[Self <: MongoBinaryDownloadUrl] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArch(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetArchiveName(value: () => js.Promise[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getArchiveName")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetArchiveNameLinux(value: () => js.Promise[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getArchiveNameLinux")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetArchiveNameOsx(value: () => js.Promise[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getArchiveNameOsx")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetArchiveNameWin(value: () => js.Promise[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getArchiveNameWin")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetDebianVersionString(value: LinuxOS => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDebianVersionString")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetDownloadUrl(value: () => js.Promise[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDownloadUrl")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetElementaryOSVersionString(value: LinuxOS => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getElementaryOSVersionString")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetFedoraVersionString(value: LinuxOS => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getFedoraVersionString")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetLegacyVersionString(value: AnyOS => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getLegacyVersionString")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetLinuxOSVersionString(value: LinuxOS => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getLinuxOSVersionString")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetMintVersionString(value: LinuxOS => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMintVersionString")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetRhelVersionString(value: LinuxOS => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRhelVersionString")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetSuseVersionString(value: LinuxOS => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSuseVersionString")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetUbuntuVersionString(value: LinuxOS => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getUbuntuVersionString")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPlatform(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("platform")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTranslateArch(value: (String, String) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("translateArch")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withTranslatePlatform(value: String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("translatePlatform")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOs(value: AnyOS): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("os")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("os")(js.undefined)
        ret
    }
  }
  
}

