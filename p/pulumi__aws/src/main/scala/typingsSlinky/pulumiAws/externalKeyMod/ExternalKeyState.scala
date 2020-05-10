package typingsSlinky.pulumiAws.externalKeyMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExternalKeyState extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the key.
    */
  val arn: js.UndefOr[Input[String]] = js.native
  /**
    * Duration in days after which the key is deleted after destruction of the resource. Must be between `7` and `30` days. Defaults to `30`.
    */
  val deletionWindowInDays: js.UndefOr[Input[Double]] = js.native
  /**
    * Description of the key.
    */
  val description: js.UndefOr[Input[String]] = js.native
  /**
    * Specifies whether the key is enabled. Keys pending import can only be `false`. Imported keys default to `true` unless expired.
    */
  val enabled: js.UndefOr[Input[Boolean]] = js.native
  /**
    * Whether the key material expires. Empty when pending key material import, otherwise `KEY_MATERIAL_EXPIRES` or `KEY_MATERIAL_DOES_NOT_EXPIRE`.
    */
  val expirationModel: js.UndefOr[Input[String]] = js.native
  /**
    * Base64 encoded 256-bit symmetric encryption key material to import. The CMK is permanently associated with this key material. The same key material can be reimported, but you cannot import different key material.
    */
  val keyMaterialBase64: js.UndefOr[Input[String]] = js.native
  /**
    * The state of the CMK.
    */
  val keyState: js.UndefOr[Input[String]] = js.native
  /**
    * The cryptographic operations for which you can use the CMK.
    */
  val keyUsage: js.UndefOr[Input[String]] = js.native
  /**
    * A key policy JSON document. If you do not provide a key policy, AWS KMS attaches a default key policy to the CMK.
    */
  val policy: js.UndefOr[Input[String]] = js.native
  /**
    * A key-value map of tags to assign to the key.
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.native
  /**
    * Time at which the imported key material expires. When the key material expires, AWS KMS deletes the key material and the CMK becomes unusable. If not specified, key material does not expire. Valid values: [RFC3339 time string](https://tools.ietf.org/html/rfc3339#section-5.8) (`YYYY-MM-DDTHH:MM:SSZ`)
    */
  val validTo: js.UndefOr[Input[String]] = js.native
}

object ExternalKeyState {
  @scala.inline
  def apply(): ExternalKeyState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExternalKeyState]
  }
  @scala.inline
  implicit class ExternalKeyStateOps[Self <: ExternalKeyState] (val x: Self) extends AnyVal {
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
    def withEnabled(value: Input[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(js.undefined)
        ret
    }
    @scala.inline
    def withExpirationModel(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expirationModel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpirationModel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expirationModel")(js.undefined)
        ret
    }
    @scala.inline
    def withKeyMaterialBase64(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyMaterialBase64")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeyMaterialBase64: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyMaterialBase64")(js.undefined)
        ret
    }
    @scala.inline
    def withKeyState(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeyState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyState")(js.undefined)
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
    @scala.inline
    def withValidTo(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validTo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValidTo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validTo")(js.undefined)
        ret
    }
  }
  
}

