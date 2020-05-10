package typingsSlinky.pulumiAws.keyMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KeyState extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the key.
    */
  val arn: js.UndefOr[Input[String]] = js.native
  /**
    * Specifies whether the key contains a symmetric key or an asymmetric key pair and the encryption algorithms or signing algorithms that the key supports.
    * Valid values: `SYMMETRIC_DEFAULT`,  `RSA_2048`, `RSA_3072`, `RSA_4096`, `ECC_NIST_P256`, `ECC_NIST_P384`, `ECC_NIST_P521`, or `ECC_SECG_P256K1`. Defaults to `SYMMETRIC_DEFAULT`. For help with choosing a key spec, see the [AWS KMS Developer Guide](https://docs.aws.amazon.com/kms/latest/developerguide/symm-asymm-choose.html).
    */
  val customerMasterKeySpec: js.UndefOr[Input[String]] = js.native
  /**
    * Duration in days after which the key is deleted
    * after destruction of the resource, must be between 7 and 30 days. Defaults to 30 days.
    */
  val deletionWindowInDays: js.UndefOr[Input[Double]] = js.native
  /**
    * The description of the key as viewed in AWS console.
    */
  val description: js.UndefOr[Input[String]] = js.native
  /**
    * Specifies whether [key rotation](http://docs.aws.amazon.com/kms/latest/developerguide/rotate-keys.html)
    * is enabled. Defaults to false.
    */
  val enableKeyRotation: js.UndefOr[Input[Boolean]] = js.native
  /**
    * Specifies whether the key is enabled. Defaults to true.
    */
  val isEnabled: js.UndefOr[Input[Boolean]] = js.native
  /**
    * The globally unique identifier for the key.
    */
  val keyId: js.UndefOr[Input[String]] = js.native
  /**
    * Specifies the intended use of the key. Valid values: `ENCRYPT_DECRYPT` or `SIGN_VERIFY`.
    * Defaults to `ENCRYPT_DECRYPT`.
    */
  val keyUsage: js.UndefOr[Input[String]] = js.native
  val policy: js.UndefOr[Input[String]] = js.native
  /**
    * A mapping of tags to assign to the object.
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.native
}

object KeyState {
  @scala.inline
  def apply(): KeyState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KeyState]
  }
  @scala.inline
  implicit class KeyStateOps[Self <: KeyState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArn(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arn")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomerMasterKeySpec(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customerMasterKeySpec")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomerMasterKeySpec: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customerMasterKeySpec")(js.undefined)
        ret
    }
    @scala.inline
    def withDeletionWindowInDays(value: Input[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deletionWindowInDays")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeletionWindowInDays: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deletionWindowInDays")(js.undefined)
        ret
    }
    @scala.inline
    def withDescription(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableKeyRotation(value: Input[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableKeyRotation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableKeyRotation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableKeyRotation")(js.undefined)
        ret
    }
    @scala.inline
    def withIsEnabled(value: Input[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withKeyId(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeyId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyId")(js.undefined)
        ret
    }
    @scala.inline
    def withKeyUsage(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyUsage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeyUsage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyUsage")(js.undefined)
        ret
    }
    @scala.inline
    def withPolicy(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("policy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPolicy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("policy")(js.undefined)
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

