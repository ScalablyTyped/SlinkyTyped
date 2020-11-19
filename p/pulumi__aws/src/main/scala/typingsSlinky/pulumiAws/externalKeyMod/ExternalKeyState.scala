package typingsSlinky.pulumiAws.externalKeyMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  
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
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setArn(value: Input[String]): Self = this.set("arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArn: Self = this.set("arn", js.undefined)
    
    @scala.inline
    def setDeletionWindowInDays(value: Input[Double]): Self = this.set("deletionWindowInDays", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeletionWindowInDays: Self = this.set("deletionWindowInDays", js.undefined)
    
    @scala.inline
    def setDescription(value: Input[String]): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setEnabled(value: Input[Boolean]): Self = this.set("enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnabled: Self = this.set("enabled", js.undefined)
    
    @scala.inline
    def setExpirationModel(value: Input[String]): Self = this.set("expirationModel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpirationModel: Self = this.set("expirationModel", js.undefined)
    
    @scala.inline
    def setKeyMaterialBase64(value: Input[String]): Self = this.set("keyMaterialBase64", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeyMaterialBase64: Self = this.set("keyMaterialBase64", js.undefined)
    
    @scala.inline
    def setKeyState(value: Input[String]): Self = this.set("keyState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeyState: Self = this.set("keyState", js.undefined)
    
    @scala.inline
    def setKeyUsage(value: Input[String]): Self = this.set("keyUsage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeyUsage: Self = this.set("keyUsage", js.undefined)
    
    @scala.inline
    def setPolicy(value: Input[String]): Self = this.set("policy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePolicy: Self = this.set("policy", js.undefined)
    
    @scala.inline
    def setTags(value: Input[StringDictionary[Input[String]]]): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
    
    @scala.inline
    def setValidTo(value: Input[String]): Self = this.set("validTo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValidTo: Self = this.set("validTo", js.undefined)
  }
}
