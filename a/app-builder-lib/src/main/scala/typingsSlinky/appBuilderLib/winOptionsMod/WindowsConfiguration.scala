package typingsSlinky.appBuilderLib.winOptionsMod

import typingsSlinky.appBuilderLib.appBuilderLibStrings.sha1
import typingsSlinky.appBuilderLib.appBuilderLibStrings.sha256
import typingsSlinky.appBuilderLib.coreMod.TargetConfigType
import typingsSlinky.appBuilderLib.platformSpecificBuildOptionsMod.PlatformSpecificBuildOptions
import typingsSlinky.appBuilderLib.windowsCodeSignMod.CustomWindowsSign
import typingsSlinky.appBuilderLib.windowsCodeSignMod.CustomWindowsSignTaskConfiguration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WindowsConfiguration extends PlatformSpecificBuildOptions {
  /**
    * The path to an additional certificate file you want to add to the signature block.
    */
  val additionalCertificateFile: js.UndefOr[String | Null] = js.native
  /**
    * The path to the *.pfx certificate you want to sign with. Please use it only if you cannot use env variable `CSC_LINK` (`WIN_CSC_LINK`) for some reason.
    * Please see [Code Signing](/code-signing).
    */
  val certificateFile: js.UndefOr[String | Null] = js.native
  /**
    * The password to the certificate provided in `certificateFile`. Please use it only if you cannot use env variable `CSC_KEY_PASSWORD` (`WIN_CSC_KEY_PASSWORD`) for some reason.
    * Please see [Code Signing](/code-signing).
    */
  val certificatePassword: js.UndefOr[String | Null] = js.native
  /**
    * The SHA1 hash of the signing certificate. The SHA1 hash is commonly specified when multiple certificates satisfy the criteria specified by the remaining switches. Works only on Windows (or on macOS if [Parallels Desktop](https://www.parallels.com/products/desktop/) Windows 10 virtual machines exits).
    */
  val certificateSha1: js.UndefOr[String | Null] = js.native
  /**
    * The name of the subject of the signing certificate. Required only for EV Code Signing and works only on Windows (or on macOS if [Parallels Desktop](https://www.parallels.com/products/desktop/) Windows 10 virtual machines exits).
    */
  val certificateSubjectName: js.UndefOr[String | Null] = js.native
  /**
    * The trademarks and registered trademarks.
    */
  val legalTrademarks: js.UndefOr[String | Null] = js.native
  /**
    * [The publisher name](https://github.com/electron-userland/electron-builder/issues/1187#issuecomment-278972073), exactly as in your code signed certificate. Several names can be provided.
    * Defaults to common name from your code signing certificate.
    */
  val publisherName: js.UndefOr[String | js.Array[String] | Null] = js.native
  /**
    * The [security level](https://msdn.microsoft.com/en-us/library/6ad1fshk.aspx#Anchor_9) at which the application requests to be executed.
    * Cannot be specified per target, allowed only in the `win`.
    * @default asInvoker
    */
  val requestedExecutionLevel: js.UndefOr[RequestedExecutionLevel | Null] = js.native
  /**
    * The URL of the RFC 3161 time stamp server.
    * @default http://timestamp.comodoca.com/rfc3161
    */
  val rfc3161TimeStampServer: js.UndefOr[String | Null] = js.native
  /**
    * The custom function (or path to file or module id) to sign Windows executable.
    */
  val sign: js.UndefOr[CustomWindowsSign | String | Null] = js.native
  /**
    * Whether to sign and add metadata to executable. Advanced option.
    * @default true
    */
  val signAndEditExecutable: js.UndefOr[Boolean] = js.native
  /**
    * Whether to sign DLL files. Advanced option.
    * @see https://github.com/electron-userland/electron-builder/issues/3101#issuecomment-404212384
    * @default false
    */
  val signDlls: js.UndefOr[Boolean] = js.native
  /**
    * Array of signing algorithms used. For AppX `sha256` is always used.
    * @default ['sha1', 'sha256']
    */
  val signingHashAlgorithms: js.UndefOr[(js.Array[sha1 | sha256]) | Null] = js.native
  /**
    * The target package type: list of `nsis`, `nsis-web` (Web installer), `portable` ([portable](/configuration/nsis#portable) app without installation), `appx`, `msi`, `squirrel`, `7z`, `zip`, `tar.xz`, `tar.lz`, `tar.gz`, `tar.bz2`, `dir`.
    * AppX package can be built only on Windows 10.
    *
    * To use Squirrel.Windows please install `electron-builder-squirrel-windows` dependency.
    *
    * @default nsis
    */
  @JSName("target")
  val target_WindowsConfiguration: js.UndefOr[TargetConfigType] = js.native
  /**
    * The URL of the time stamp server.
    * @default http://timestamp.digicert.com
    */
  val timeStampServer: js.UndefOr[String | Null] = js.native
  /**
    * Whether to verify the signature of an available update before installation.
    * The [publisher name](#publisherName) will be used for the signature verification.
    *
    * @default true
    */
  val verifyUpdateCodeSignature: js.UndefOr[Boolean] = js.native
}

object WindowsConfiguration {
  @scala.inline
  def apply(): WindowsConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WindowsConfiguration]
  }
  @scala.inline
  implicit class WindowsConfigurationOps[Self <: WindowsConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdditionalCertificateFile(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("additionalCertificateFile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdditionalCertificateFile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("additionalCertificateFile")(js.undefined)
        ret
    }
    @scala.inline
    def withAdditionalCertificateFileNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("additionalCertificateFile")(null)
        ret
    }
    @scala.inline
    def withCertificateFile(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("certificateFile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCertificateFile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("certificateFile")(js.undefined)
        ret
    }
    @scala.inline
    def withCertificateFileNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("certificateFile")(null)
        ret
    }
    @scala.inline
    def withCertificatePassword(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("certificatePassword")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCertificatePassword: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("certificatePassword")(js.undefined)
        ret
    }
    @scala.inline
    def withCertificatePasswordNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("certificatePassword")(null)
        ret
    }
    @scala.inline
    def withCertificateSha1(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("certificateSha1")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCertificateSha1: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("certificateSha1")(js.undefined)
        ret
    }
    @scala.inline
    def withCertificateSha1Null: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("certificateSha1")(null)
        ret
    }
    @scala.inline
    def withCertificateSubjectName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("certificateSubjectName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCertificateSubjectName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("certificateSubjectName")(js.undefined)
        ret
    }
    @scala.inline
    def withCertificateSubjectNameNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("certificateSubjectName")(null)
        ret
    }
    @scala.inline
    def withLegalTrademarks(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("legalTrademarks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLegalTrademarks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("legalTrademarks")(js.undefined)
        ret
    }
    @scala.inline
    def withLegalTrademarksNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("legalTrademarks")(null)
        ret
    }
    @scala.inline
    def withPublisherName(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publisherName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPublisherName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publisherName")(js.undefined)
        ret
    }
    @scala.inline
    def withPublisherNameNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publisherName")(null)
        ret
    }
    @scala.inline
    def withRequestedExecutionLevel(value: RequestedExecutionLevel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestedExecutionLevel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequestedExecutionLevel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestedExecutionLevel")(js.undefined)
        ret
    }
    @scala.inline
    def withRequestedExecutionLevelNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestedExecutionLevel")(null)
        ret
    }
    @scala.inline
    def withRfc3161TimeStampServer(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rfc3161TimeStampServer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRfc3161TimeStampServer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rfc3161TimeStampServer")(js.undefined)
        ret
    }
    @scala.inline
    def withRfc3161TimeStampServerNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rfc3161TimeStampServer")(null)
        ret
    }
    @scala.inline
    def withSignFunction1(value: /* configuration */ CustomWindowsSignTaskConfiguration => js.Promise[js.Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sign")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSign(value: CustomWindowsSign | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sign")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSign: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sign")(js.undefined)
        ret
    }
    @scala.inline
    def withSignNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sign")(null)
        ret
    }
    @scala.inline
    def withSignAndEditExecutable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signAndEditExecutable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSignAndEditExecutable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signAndEditExecutable")(js.undefined)
        ret
    }
    @scala.inline
    def withSignDlls(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signDlls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSignDlls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signDlls")(js.undefined)
        ret
    }
    @scala.inline
    def withSigningHashAlgorithms(value: js.Array[sha1 | sha256]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signingHashAlgorithms")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSigningHashAlgorithms: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signingHashAlgorithms")(js.undefined)
        ret
    }
    @scala.inline
    def withSigningHashAlgorithmsNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signingHashAlgorithms")(null)
        ret
    }
    @scala.inline
    def withTarget(value: TargetConfigType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTarget: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(js.undefined)
        ret
    }
    @scala.inline
    def withTargetNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(null)
        ret
    }
    @scala.inline
    def withTimeStampServer(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeStampServer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeStampServer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeStampServer")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeStampServerNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeStampServer")(null)
        ret
    }
    @scala.inline
    def withVerifyUpdateCodeSignature(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verifyUpdateCodeSignature")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVerifyUpdateCodeSignature: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verifyUpdateCodeSignature")(js.undefined)
        ret
    }
  }
  
}

