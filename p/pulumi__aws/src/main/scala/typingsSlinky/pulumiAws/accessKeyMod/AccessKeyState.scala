package typingsSlinky.pulumiAws.accessKeyMod

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AccessKeyState extends js.Object {
  /**
    * The encrypted secret, base64 encoded, if `pgpKey` was specified.
    * > **NOTE:** The encrypted secret may be decrypted using the command line,
    */
  val encryptedSecret: js.UndefOr[Input[String]] = js.native
  /**
    * The fingerprint of the PGP key used to encrypt
    * the secret
    */
  val keyFingerprint: js.UndefOr[Input[String]] = js.native
  /**
    * Either a base-64 encoded PGP public key, or a
    * keybase username in the form `keybase:some_person_that_exists`, for use
    * in the `encryptedSecret` output attribute.
    */
  val pgpKey: js.UndefOr[Input[String]] = js.native
  /**
    * The secret access key. Note that this will be written
    * to the state file. If you use this, please protect your backend state file
    * judiciously. Alternatively, you may supply a `pgpKey` instead, which will
    * prevent the secret from being stored in plaintext, at the cost of preventing
    * the use of the secret key in automation.
    */
  val secret: js.UndefOr[Input[String]] = js.native
  /**
    * **DEPRECATED** The secret access key converted into an SES SMTP
    * password by applying [AWS's documented conversion
    *
    * @deprecated AWS SigV2 for SES SMTP passwords isy deprecated.
  Use 'ses_smtp_password_v4' for region-specific AWS SigV4 signed SES SMTP password instead.
    */
  val sesSmtpPassword: js.UndefOr[Input[String]] = js.native
  /**
    * The secret access key converted into an SES SMTP
    * password by applying [AWS's documented Sigv4 conversion
    * algorithm](https://docs.aws.amazon.com/ses/latest/DeveloperGuide/smtp-credentials.html#smtp-credentials-convert).
    * As SigV4 is region specific, valid Provider regions are `ap-south-1`, `ap-southeast-2`, `eu-central-1`, `eu-west-1`, `us-east-1` and `us-west-2`. See current [AWS SES regions](https://docs.aws.amazon.com/general/latest/gr/rande.html#ses_region)
    */
  val sesSmtpPasswordV4: js.UndefOr[Input[String]] = js.native
  /**
    * The access key status to apply. Defaults to `Active`.
    * Valid values are `Active` and `Inactive`.
    */
  val status: js.UndefOr[Input[String]] = js.native
  /**
    * The IAM user to associate with this access key.
    */
  val user: js.UndefOr[Input[String]] = js.native
}

object AccessKeyState {
  @scala.inline
  def apply(): AccessKeyState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccessKeyState]
  }
  @scala.inline
  implicit class AccessKeyStateOps[Self <: AccessKeyState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEncryptedSecret(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encryptedSecret")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEncryptedSecret: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encryptedSecret")(js.undefined)
        ret
    }
    @scala.inline
    def withKeyFingerprint(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyFingerprint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeyFingerprint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyFingerprint")(js.undefined)
        ret
    }
    @scala.inline
    def withPgpKey(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pgpKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPgpKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pgpKey")(js.undefined)
        ret
    }
    @scala.inline
    def withSecret(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secret")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSecret: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secret")(js.undefined)
        ret
    }
    @scala.inline
    def withSesSmtpPassword(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sesSmtpPassword")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSesSmtpPassword: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sesSmtpPassword")(js.undefined)
        ret
    }
    @scala.inline
    def withSesSmtpPasswordV4(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sesSmtpPasswordV4")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSesSmtpPasswordV4: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sesSmtpPasswordV4")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(js.undefined)
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

