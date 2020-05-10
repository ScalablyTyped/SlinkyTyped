package typingsSlinky.pulumiKubernetes.inputMod.core.v1

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * WindowsSecurityContextOptions contain Windows-specific options and credentials.
  */
@js.native
trait WindowsSecurityContextOptions extends js.Object {
  /**
    * GMSACredentialSpec is where the GMSA admission webhook
    * (https://github.com/kubernetes-sigs/windows-gmsa) inlines the contents of the GMSA
    * credential spec named by the GMSACredentialSpecName field. This field is alpha-level and is
    * only honored by servers that enable the WindowsGMSA feature flag.
    */
  var gmsaCredentialSpec: js.UndefOr[Input[String]] = js.native
  /**
    * GMSACredentialSpecName is the name of the GMSA credential spec to use. This field is
    * alpha-level and is only honored by servers that enable the WindowsGMSA feature flag.
    */
  var gmsaCredentialSpecName: js.UndefOr[Input[String]] = js.native
  /**
    * The UserName in Windows to run the entrypoint of the container process. Defaults to the
    * user specified in image metadata if unspecified. May also be set in PodSecurityContext. If
    * set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext
    * takes precedence. This field is beta-level and may be disabled with the
    * WindowsRunAsUserName feature flag.
    */
  var runAsUserName: js.UndefOr[Input[String]] = js.native
}

object WindowsSecurityContextOptions {
  @scala.inline
  def apply(): WindowsSecurityContextOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WindowsSecurityContextOptions]
  }
  @scala.inline
  implicit class WindowsSecurityContextOptionsOps[Self <: WindowsSecurityContextOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGmsaCredentialSpec(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gmsaCredentialSpec")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGmsaCredentialSpec: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gmsaCredentialSpec")(js.undefined)
        ret
    }
    @scala.inline
    def withGmsaCredentialSpecName(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gmsaCredentialSpecName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGmsaCredentialSpecName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gmsaCredentialSpecName")(js.undefined)
        ret
    }
    @scala.inline
    def withRunAsUserName(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("runAsUserName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRunAsUserName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("runAsUserName")(js.undefined)
        ret
    }
  }
  
}

