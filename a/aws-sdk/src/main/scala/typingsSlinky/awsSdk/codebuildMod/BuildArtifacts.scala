package typingsSlinky.awsSdk.codebuildMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BuildArtifacts extends js.Object {
  /**
    *  An identifier for this artifact definition. 
    */
  var artifactIdentifier: js.UndefOr[String] = js.native
  /**
    *  Information that tells you if encryption for build artifacts is disabled. 
    */
  var encryptionDisabled: js.UndefOr[WrapperBoolean] = js.native
  /**
    * Information about the location of the build artifacts.
    */
  var location: js.UndefOr[String] = js.native
  /**
    * The MD5 hash of the build artifact. You can use this hash along with a checksum tool to confirm file integrity and authenticity.  This value is available only if the build project's packaging value is set to ZIP. 
    */
  var md5sum: js.UndefOr[String] = js.native
  /**
    *  If this flag is set, a name specified in the buildspec file overrides the artifact name. The name specified in a buildspec file is calculated at build time and uses the Shell Command Language. For example, you can append a date and time to your artifact name so that it is always unique. 
    */
  var overrideArtifactName: js.UndefOr[WrapperBoolean] = js.native
  /**
    * The SHA-256 hash of the build artifact. You can use this hash along with a checksum tool to confirm file integrity and authenticity.  This value is available only if the build project's packaging value is set to ZIP. 
    */
  var sha256sum: js.UndefOr[String] = js.native
}

object BuildArtifacts {
  @scala.inline
  def apply(): BuildArtifacts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BuildArtifacts]
  }
  @scala.inline
  implicit class BuildArtifactsOps[Self <: BuildArtifacts] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArtifactIdentifier(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("artifactIdentifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArtifactIdentifier: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("artifactIdentifier")(js.undefined)
        ret
    }
    @scala.inline
    def withEncryptionDisabled(value: WrapperBoolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encryptionDisabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEncryptionDisabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encryptionDisabled")(js.undefined)
        ret
    }
    @scala.inline
    def withLocation(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("location")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("location")(js.undefined)
        ret
    }
    @scala.inline
    def withMd5sum(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("md5sum")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMd5sum: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("md5sum")(js.undefined)
        ret
    }
    @scala.inline
    def withOverrideArtifactName(value: WrapperBoolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overrideArtifactName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOverrideArtifactName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overrideArtifactName")(js.undefined)
        ret
    }
    @scala.inline
    def withSha256sum(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sha256sum")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSha256sum: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sha256sum")(js.undefined)
        ret
    }
  }
  
}

