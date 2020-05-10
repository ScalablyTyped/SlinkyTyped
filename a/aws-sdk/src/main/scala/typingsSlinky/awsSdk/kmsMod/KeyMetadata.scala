package typingsSlinky.awsSdk.kmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KeyMetadata extends js.Object {
  /**
    * The twelve-digit account ID of the AWS account that owns the CMK.
    */
  var AWSAccountId: js.UndefOr[AWSAccountIdType] = js.native
  /**
    * The Amazon Resource Name (ARN) of the CMK. For examples, see AWS Key Management Service (AWS KMS) in the Example ARNs section of the AWS General Reference.
    */
  var Arn: js.UndefOr[ArnType] = js.native
  /**
    * The cluster ID of the AWS CloudHSM cluster that contains the key material for the CMK. When you create a CMK in a custom key store, AWS KMS creates the key material for the CMK in the associated AWS CloudHSM cluster. This value is present only when the CMK is created in a custom key store.
    */
  var CloudHsmClusterId: js.UndefOr[CloudHsmClusterIdType] = js.native
  /**
    * The date and time when the CMK was created.
    */
  var CreationDate: js.UndefOr[js.Date] = js.native
  /**
    * A unique identifier for the custom key store that contains the CMK. This value is present only when the CMK is created in a custom key store.
    */
  var CustomKeyStoreId: js.UndefOr[CustomKeyStoreIdType] = js.native
  /**
    * Describes the type of key material in the CMK.
    */
  var CustomerMasterKeySpec: js.UndefOr[typingsSlinky.awsSdk.kmsMod.CustomerMasterKeySpec] = js.native
  /**
    * The date and time after which AWS KMS deletes the CMK. This value is present only when KeyState is PendingDeletion.
    */
  var DeletionDate: js.UndefOr[js.Date] = js.native
  /**
    * The description of the CMK.
    */
  var Description: js.UndefOr[DescriptionType] = js.native
  /**
    * Specifies whether the CMK is enabled. When KeyState is Enabled this value is true, otherwise it is false.
    */
  var Enabled: js.UndefOr[BooleanType] = js.native
  /**
    * A list of encryption algorithms that the CMK supports. You cannot use the CMK with other encryption algorithms within AWS KMS. This field appears only when the KeyUsage of the CMK is ENCRYPT_DECRYPT.
    */
  var EncryptionAlgorithms: js.UndefOr[EncryptionAlgorithmSpecList] = js.native
  /**
    * Specifies whether the CMK's key material expires. This value is present only when Origin is EXTERNAL, otherwise this value is omitted.
    */
  var ExpirationModel: js.UndefOr[ExpirationModelType] = js.native
  /**
    * The globally unique identifier for the CMK.
    */
  var KeyId: KeyIdType = js.native
  /**
    * The manager of the CMK. CMKs in your AWS account are either customer managed or AWS managed. For more information about the difference, see Customer Master Keys in the AWS Key Management Service Developer Guide.
    */
  var KeyManager: js.UndefOr[KeyManagerType] = js.native
  /**
    * The state of the CMK. For more information about how key state affects the use of a CMK, see How Key State Affects the Use of a Customer Master Key in the AWS Key Management Service Developer Guide.
    */
  var KeyState: js.UndefOr[typingsSlinky.awsSdk.kmsMod.KeyState] = js.native
  /**
    * The cryptographic operations for which you can use the CMK.
    */
  var KeyUsage: js.UndefOr[KeyUsageType] = js.native
  /**
    * The source of the CMK's key material. When this value is AWS_KMS, AWS KMS created the key material. When this value is EXTERNAL, the key material was imported from your existing key management infrastructure or the CMK lacks key material. When this value is AWS_CLOUDHSM, the key material was created in the AWS CloudHSM cluster associated with a custom key store.
    */
  var Origin: js.UndefOr[OriginType] = js.native
  /**
    * A list of signing algorithms that the CMK supports. You cannot use the CMK with other signing algorithms within AWS KMS. This field appears only when the KeyUsage of the CMK is SIGN_VERIFY.
    */
  var SigningAlgorithms: js.UndefOr[SigningAlgorithmSpecList] = js.native
  /**
    * The time at which the imported key material expires. When the key material expires, AWS KMS deletes the key material and the CMK becomes unusable. This value is present only for CMKs whose Origin is EXTERNAL and whose ExpirationModel is KEY_MATERIAL_EXPIRES, otherwise this value is omitted.
    */
  var ValidTo: js.UndefOr[js.Date] = js.native
}

object KeyMetadata {
  @scala.inline
  def apply(KeyId: KeyIdType): KeyMetadata = {
    val __obj = js.Dynamic.literal(KeyId = KeyId.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyMetadata]
  }
  @scala.inline
  implicit class KeyMetadataOps[Self <: KeyMetadata] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withKeyId(value: KeyIdType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KeyId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAWSAccountId(value: AWSAccountIdType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AWSAccountId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAWSAccountId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AWSAccountId")(js.undefined)
        ret
    }
    @scala.inline
    def withArn(value: ArnType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Arn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Arn")(js.undefined)
        ret
    }
    @scala.inline
    def withCloudHsmClusterId(value: CloudHsmClusterIdType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CloudHsmClusterId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCloudHsmClusterId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CloudHsmClusterId")(js.undefined)
        ret
    }
    @scala.inline
    def withCreationDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreationDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreationDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreationDate")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomKeyStoreId(value: CustomKeyStoreIdType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CustomKeyStoreId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomKeyStoreId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CustomKeyStoreId")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomerMasterKeySpec(value: CustomerMasterKeySpec): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CustomerMasterKeySpec")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomerMasterKeySpec: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CustomerMasterKeySpec")(js.undefined)
        ret
    }
    @scala.inline
    def withDeletionDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeletionDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeletionDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeletionDate")(js.undefined)
        ret
    }
    @scala.inline
    def withDescription(value: DescriptionType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Description")(js.undefined)
        ret
    }
    @scala.inline
    def withEnabled(value: BooleanType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Enabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Enabled")(js.undefined)
        ret
    }
    @scala.inline
    def withEncryptionAlgorithms(value: EncryptionAlgorithmSpecList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EncryptionAlgorithms")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEncryptionAlgorithms: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EncryptionAlgorithms")(js.undefined)
        ret
    }
    @scala.inline
    def withExpirationModel(value: ExpirationModelType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExpirationModel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpirationModel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExpirationModel")(js.undefined)
        ret
    }
    @scala.inline
    def withKeyManager(value: KeyManagerType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KeyManager")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeyManager: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KeyManager")(js.undefined)
        ret
    }
    @scala.inline
    def withKeyState(value: KeyState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KeyState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeyState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KeyState")(js.undefined)
        ret
    }
    @scala.inline
    def withKeyUsage(value: KeyUsageType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KeyUsage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeyUsage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KeyUsage")(js.undefined)
        ret
    }
    @scala.inline
    def withOrigin(value: OriginType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Origin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrigin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Origin")(js.undefined)
        ret
    }
    @scala.inline
    def withSigningAlgorithms(value: SigningAlgorithmSpecList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SigningAlgorithms")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSigningAlgorithms: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SigningAlgorithms")(js.undefined)
        ret
    }
    @scala.inline
    def withValidTo(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ValidTo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValidTo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ValidTo")(js.undefined)
        ret
    }
  }
  
}

