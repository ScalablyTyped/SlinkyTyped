package typingsSlinky.pulumiAws.getCertificateAuthorityMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.pulumiAws.inputMod.acmpca.GetCertificateAuthorityRevocationConfiguration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetCertificateAuthorityArgs extends js.Object {
  /**
    * Amazon Resource Name (ARN) of the certificate authority.
    */
  val arn: String = js.native
  val revocationConfigurations: js.UndefOr[js.Array[GetCertificateAuthorityRevocationConfiguration]] = js.native
  val tags: js.UndefOr[StringDictionary[js.Any]] = js.native
}

object GetCertificateAuthorityArgs {
  @scala.inline
  def apply(arn: String): GetCertificateAuthorityArgs = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetCertificateAuthorityArgs]
  }
  @scala.inline
  implicit class GetCertificateAuthorityArgsOps[Self <: GetCertificateAuthorityArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRevocationConfigurations(value: js.Array[GetCertificateAuthorityRevocationConfiguration]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("revocationConfigurations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRevocationConfigurations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("revocationConfigurations")(js.undefined)
        ret
    }
    @scala.inline
    def withTags(value: StringDictionary[js.Any]): Self = {
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

