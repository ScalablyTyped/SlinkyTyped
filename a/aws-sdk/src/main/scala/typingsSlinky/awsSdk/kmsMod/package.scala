package typingsSlinky.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object kmsMod {
  type AWSAccountIdType = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.RSAES_PKCS1_V1_5
    - typingsSlinky.awsSdk.awsSdkStrings.RSAES_OAEP_SHA_1
    - typingsSlinky.awsSdk.awsSdkStrings.RSAES_OAEP_SHA_256
    - java.lang.String
  */
  type AlgorithmSpec = typingsSlinky.awsSdk.kmsMod._AlgorithmSpec | java.lang.String
  type AliasList = js.Array[typingsSlinky.awsSdk.kmsMod.AliasListEntry]
  type AliasNameType = java.lang.String
  type ArnType = java.lang.String
  type BooleanType = scala.Boolean
  type CiphertextType = typingsSlinky.node.Buffer | js.typedarray.Uint8Array | typingsSlinky.awsSdk.kmsMod.Blob | java.lang.String
  type ClientConfiguration = typingsSlinky.awsSdk.serviceMod.ServiceConfigurationOptions with typingsSlinky.awsSdk.kmsMod.ClientApiVersions
  type CloudHsmClusterIdType = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.INVALID_CREDENTIALS
    - typingsSlinky.awsSdk.awsSdkStrings.CLUSTER_NOT_FOUND
    - typingsSlinky.awsSdk.awsSdkStrings.NETWORK_ERRORS
    - typingsSlinky.awsSdk.awsSdkStrings.INTERNAL_ERROR
    - typingsSlinky.awsSdk.awsSdkStrings.INSUFFICIENT_CLOUDHSM_HSMS
    - typingsSlinky.awsSdk.awsSdkStrings.USER_LOCKED_OUT
    - typingsSlinky.awsSdk.awsSdkStrings.USER_NOT_FOUND
    - typingsSlinky.awsSdk.awsSdkStrings.USER_LOGGED_IN
    - typingsSlinky.awsSdk.awsSdkStrings.SUBNET_NOT_FOUND
    - java.lang.String
  */
  type ConnectionErrorCodeType = typingsSlinky.awsSdk.kmsMod._ConnectionErrorCodeType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.CONNECTED
    - typingsSlinky.awsSdk.awsSdkStrings.CONNECTING
    - typingsSlinky.awsSdk.awsSdkStrings.FAILED
    - typingsSlinky.awsSdk.awsSdkStrings.DISCONNECTED
    - typingsSlinky.awsSdk.awsSdkStrings.DISCONNECTING
    - java.lang.String
  */
  type ConnectionStateType = typingsSlinky.awsSdk.kmsMod._ConnectionStateType | java.lang.String
  type CustomKeyStoreIdType = java.lang.String
  type CustomKeyStoreNameType = java.lang.String
  type CustomKeyStoresList = js.Array[typingsSlinky.awsSdk.kmsMod.CustomKeyStoresListEntry]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.RSA_2048
    - typingsSlinky.awsSdk.awsSdkStrings.RSA_3072
    - typingsSlinky.awsSdk.awsSdkStrings.RSA_4096
    - typingsSlinky.awsSdk.awsSdkStrings.ECC_NIST_P256
    - typingsSlinky.awsSdk.awsSdkStrings.ECC_NIST_P384
    - typingsSlinky.awsSdk.awsSdkStrings.ECC_NIST_P521
    - typingsSlinky.awsSdk.awsSdkStrings.ECC_SECG_P256K1
    - typingsSlinky.awsSdk.awsSdkStrings.SYMMETRIC_DEFAULT
    - java.lang.String
  */
  type CustomerMasterKeySpec = typingsSlinky.awsSdk.kmsMod._CustomerMasterKeySpec | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.RSA_2048
    - typingsSlinky.awsSdk.awsSdkStrings.RSA_3072
    - typingsSlinky.awsSdk.awsSdkStrings.RSA_4096
    - typingsSlinky.awsSdk.awsSdkStrings.ECC_NIST_P256
    - typingsSlinky.awsSdk.awsSdkStrings.ECC_NIST_P384
    - typingsSlinky.awsSdk.awsSdkStrings.ECC_NIST_P521
    - typingsSlinky.awsSdk.awsSdkStrings.ECC_SECG_P256K1
    - java.lang.String
  */
  type DataKeyPairSpec = typingsSlinky.awsSdk.kmsMod._DataKeyPairSpec | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.AES_256
    - typingsSlinky.awsSdk.awsSdkStrings.AES_128
    - java.lang.String
  */
  type DataKeySpec = typingsSlinky.awsSdk.kmsMod._DataKeySpec | java.lang.String
  type DateType = js.Date
  type DescriptionType = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.SYMMETRIC_DEFAULT
    - typingsSlinky.awsSdk.awsSdkStrings.RSAES_OAEP_SHA_1
    - typingsSlinky.awsSdk.awsSdkStrings.RSAES_OAEP_SHA_256
    - java.lang.String
  */
  type EncryptionAlgorithmSpec = typingsSlinky.awsSdk.kmsMod._EncryptionAlgorithmSpec | java.lang.String
  type EncryptionAlgorithmSpecList = js.Array[typingsSlinky.awsSdk.kmsMod.EncryptionAlgorithmSpec]
  type EncryptionContextKey = java.lang.String
  type EncryptionContextType = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.kmsMod.EncryptionContextValue]
  type EncryptionContextValue = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.KEY_MATERIAL_EXPIRES
    - typingsSlinky.awsSdk.awsSdkStrings.KEY_MATERIAL_DOES_NOT_EXPIRE
    - java.lang.String
  */
  type ExpirationModelType = typingsSlinky.awsSdk.kmsMod._ExpirationModelType | java.lang.String
  type GrantIdType = java.lang.String
  type GrantList = js.Array[typingsSlinky.awsSdk.kmsMod.GrantListEntry]
  type GrantNameType = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.Decrypt
    - typingsSlinky.awsSdk.awsSdkStrings.Encrypt
    - typingsSlinky.awsSdk.awsSdkStrings.GenerateDataKey
    - typingsSlinky.awsSdk.awsSdkStrings.GenerateDataKeyWithoutPlaintext
    - typingsSlinky.awsSdk.awsSdkStrings.ReEncryptFrom
    - typingsSlinky.awsSdk.awsSdkStrings.ReEncryptTo
    - typingsSlinky.awsSdk.awsSdkStrings.Sign_
    - typingsSlinky.awsSdk.awsSdkStrings.Verify
    - typingsSlinky.awsSdk.awsSdkStrings.GetPublicKey
    - typingsSlinky.awsSdk.awsSdkStrings.CreateGrant
    - typingsSlinky.awsSdk.awsSdkStrings.RetireGrant
    - typingsSlinky.awsSdk.awsSdkStrings.DescribeKey
    - typingsSlinky.awsSdk.awsSdkStrings.GenerateDataKeyPair
    - typingsSlinky.awsSdk.awsSdkStrings.GenerateDataKeyPairWithoutPlaintext
    - java.lang.String
  */
  type GrantOperation = typingsSlinky.awsSdk.kmsMod._GrantOperation | java.lang.String
  type GrantOperationList = js.Array[typingsSlinky.awsSdk.kmsMod.GrantOperation]
  type GrantTokenList = js.Array[typingsSlinky.awsSdk.kmsMod.GrantTokenType]
  type GrantTokenType = java.lang.String
  type KeyIdType = java.lang.String
  type KeyList = js.Array[typingsSlinky.awsSdk.kmsMod.KeyListEntry]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.AWS
    - typingsSlinky.awsSdk.awsSdkStrings.CUSTOMER
    - java.lang.String
  */
  type KeyManagerType = typingsSlinky.awsSdk.kmsMod._KeyManagerType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.Enabled_
    - typingsSlinky.awsSdk.awsSdkStrings.Disabled_
    - typingsSlinky.awsSdk.awsSdkStrings.PendingDeletion
    - typingsSlinky.awsSdk.awsSdkStrings.PendingImport
    - typingsSlinky.awsSdk.awsSdkStrings.Unavailable_
    - java.lang.String
  */
  type KeyState = typingsSlinky.awsSdk.kmsMod._KeyState | java.lang.String
  type KeyStorePasswordType = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.SIGN_VERIFY
    - typingsSlinky.awsSdk.awsSdkStrings.ENCRYPT_DECRYPT
    - java.lang.String
  */
  type KeyUsageType = typingsSlinky.awsSdk.kmsMod._KeyUsageType | java.lang.String
  type LimitType = scala.Double
  type MarkerType = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.RAW
    - typingsSlinky.awsSdk.awsSdkStrings.DIGEST
    - java.lang.String
  */
  type MessageType = typingsSlinky.awsSdk.kmsMod._MessageType | java.lang.String
  type NumberOfBytesType = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.AWS_KMS
    - typingsSlinky.awsSdk.awsSdkStrings.EXTERNAL
    - typingsSlinky.awsSdk.awsSdkStrings.AWS_CLOUDHSM
    - java.lang.String
  */
  type OriginType = typingsSlinky.awsSdk.kmsMod._OriginType | java.lang.String
  type PendingWindowInDaysType = scala.Double
  type PlaintextType = typingsSlinky.node.Buffer | js.typedarray.Uint8Array | typingsSlinky.awsSdk.kmsMod.Blob | java.lang.String
  type PolicyNameList = js.Array[typingsSlinky.awsSdk.kmsMod.PolicyNameType]
  type PolicyNameType = java.lang.String
  type PolicyType = java.lang.String
  type PrincipalIdType = java.lang.String
  type PublicKeyType = typingsSlinky.node.Buffer | js.typedarray.Uint8Array | typingsSlinky.awsSdk.kmsMod.Blob | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.RSASSA_PSS_SHA_256
    - typingsSlinky.awsSdk.awsSdkStrings.RSASSA_PSS_SHA_384
    - typingsSlinky.awsSdk.awsSdkStrings.RSASSA_PSS_SHA_512
    - typingsSlinky.awsSdk.awsSdkStrings.RSASSA_PKCS1_V1_5_SHA_256
    - typingsSlinky.awsSdk.awsSdkStrings.RSASSA_PKCS1_V1_5_SHA_384
    - typingsSlinky.awsSdk.awsSdkStrings.RSASSA_PKCS1_V1_5_SHA_512
    - typingsSlinky.awsSdk.awsSdkStrings.ECDSA_SHA_256
    - typingsSlinky.awsSdk.awsSdkStrings.ECDSA_SHA_384
    - typingsSlinky.awsSdk.awsSdkStrings.ECDSA_SHA_512
    - java.lang.String
  */
  type SigningAlgorithmSpec = typingsSlinky.awsSdk.kmsMod._SigningAlgorithmSpec | java.lang.String
  type SigningAlgorithmSpecList = js.Array[typingsSlinky.awsSdk.kmsMod.SigningAlgorithmSpec]
  type TagKeyList = js.Array[typingsSlinky.awsSdk.kmsMod.TagKeyType]
  type TagKeyType = java.lang.String
  type TagList = js.Array[typingsSlinky.awsSdk.kmsMod.Tag]
  type TagValueType = java.lang.String
  type TrustAnchorCertificateType = java.lang.String
  type WrappingKeySpec = typingsSlinky.awsSdk.awsSdkStrings.RSA_2048 | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.`2014-11-01`
    - typingsSlinky.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsSlinky.awsSdk.kmsMod._apiVersion | java.lang.String
}
