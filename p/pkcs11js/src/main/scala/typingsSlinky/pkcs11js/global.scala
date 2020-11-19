package typingsSlinky.pkcs11js

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobalScope
@js.native
object global extends js.Object {
  
  @js.native
  object Pkcs11Js extends js.Object {
    
    val CKA_AC_ISSUER: Double = js.native
    
    val CKA_ALLOWED_MECHANISMS: Double = js.native
    
    val CKA_ALWAYS_AUTHENTICATE: Double = js.native
    
    val CKA_ALWAYS_SENSITIVE: Double = js.native
    
    val CKA_APPLICATION: Double = js.native
    
    val CKA_ATTR_TYPES: Double = js.native
    
    val CKA_AUTH_PIN_FLAGS: Double = js.native
    
    val CKA_BASE: Double = js.native
    
    val CKA_BITS_PER_PIXEL: Double = js.native
    
    val CKA_CERTIFICATE_CATEGORY: Double = js.native
    
    val CKA_CERTIFICATE_TYPE: Double = js.native
    
    val CKA_CHAR_COLUMNS: Double = js.native
    
    val CKA_CHAR_ROWS: Double = js.native
    
    val CKA_CHAR_SETS: Double = js.native
    
    val CKA_CHECK_VALUE: Double = js.native
    
    //#region Attributes
    val CKA_CLASS: Double = js.native
    
    val CKA_COEFFICIENT: Double = js.native
    
    val CKA_COLOR: Double = js.native
    
    val CKA_COPYABLE: Double = js.native
    
    val CKA_DECRYPT: Double = js.native
    
    val CKA_DEFAULT_CMS_ATTRIBUTES: Double = js.native
    
    val CKA_DERIVE: Double = js.native
    
    val CKA_DERIVE_TEMPLATE: Double = js.native
    
    val CKA_DESTROYABLE: Double = js.native
    
    val CKA_ECDSA_PARAMS: Double = js.native
    
    val CKA_EC_PARAMS: Double = js.native
    
    val CKA_EC_POINT: Double = js.native
    
    val CKA_ENCODING_METHODS: Double = js.native
    
    val CKA_ENCRYPT: Double = js.native
    
    val CKA_END_DATE: Double = js.native
    
    val CKA_EXPONENT_1: Double = js.native
    
    val CKA_EXPONENT_2: Double = js.native
    
    val CKA_EXTRACTABLE: Double = js.native
    
    val CKA_GOST28147_PARAMS: Double = js.native
    
    val CKA_GOSTR3410_PARAMS: Double = js.native
    
    val CKA_GOSTR3411_PARAMS: Double = js.native
    
    val CKA_HASH_OF_ISSUER_PUBLIC_KEY: Double = js.native
    
    val CKA_HASH_OF_SUBJECT_PUBLIC_KEY: Double = js.native
    
    val CKA_HAS_RESET: Double = js.native
    
    val CKA_HW_FEATURE_TYPE: Double = js.native
    
    val CKA_ID: Double = js.native
    
    val CKA_ISSUER: Double = js.native
    
    val CKA_JAVA_MIDP_SECURITY_DOMAIN: Double = js.native
    
    val CKA_KEY_GEN_MECHANISM: Double = js.native
    
    val CKA_KEY_TYPE: Double = js.native
    
    val CKA_LABEL: Double = js.native
    
    val CKA_LOCAL: Double = js.native
    
    val CKA_MECHANISM_TYPE: Double = js.native
    
    val CKA_MIME_TYPES: Double = js.native
    
    val CKA_MODIFIABLE: Double = js.native
    
    val CKA_MODULUS: Double = js.native
    
    val CKA_MODULUS_BITS: Double = js.native
    
    val CKA_NAME_HASH_ALGORITHM: Double = js.native
    
    val CKA_NEVER_EXTRACTABLE: Double = js.native
    
    val CKA_OBJECT_ID: Double = js.native
    
    val CKA_OTP_CHALLENGE_REQUIREMENT: Double = js.native
    
    val CKA_OTP_COUNTER: Double = js.native
    
    val CKA_OTP_COUNTER_REQUIREMENT: Double = js.native
    
    val CKA_OTP_FORMAT: Double = js.native
    
    val CKA_OTP_LENGTH: Double = js.native
    
    val CKA_OTP_PIN_REQUIREMENT: Double = js.native
    
    val CKA_OTP_SERVICE_IDENTIFIER: Double = js.native
    
    val CKA_OTP_SERVICE_LOGO: Double = js.native
    
    val CKA_OTP_SERVICE_LOGO_TYPE: Double = js.native
    
    val CKA_OTP_TIME: Double = js.native
    
    val CKA_OTP_TIME_INTERVAL: Double = js.native
    
    val CKA_OTP_TIME_REQUIREMENT: Double = js.native
    
    val CKA_OTP_USER_FRIENDLY_MODE: Double = js.native
    
    val CKA_OTP_USER_IDENTIFIER: Double = js.native
    
    val CKA_OWNER: Double = js.native
    
    val CKA_PIXEL_X: Double = js.native
    
    val CKA_PIXEL_Y: Double = js.native
    
    val CKA_PRIME: Double = js.native
    
    val CKA_PRIME_1: Double = js.native
    
    val CKA_PRIME_2: Double = js.native
    
    val CKA_PRIME_BITS: Double = js.native
    
    val CKA_PRIVATE: Double = js.native
    
    val CKA_PRIVATE_EXPONENT: Double = js.native
    
    val CKA_PUBLIC_EXPONENT: Double = js.native
    
    val CKA_REQUIRED_CMS_ATTRIBUTES: Double = js.native
    
    val CKA_RESET_ON_INIT: Double = js.native
    
    val CKA_RESOLUTION: Double = js.native
    
    val CKA_SECONDARY_AUTH: Double = js.native
    
    val CKA_SENSITIVE: Double = js.native
    
    val CKA_SERIAL_NUMBER: Double = js.native
    
    val CKA_SIGN: Double = js.native
    
    val CKA_SIGN_RECOVER: Double = js.native
    
    val CKA_START_DATE: Double = js.native
    
    val CKA_SUBJECT: Double = js.native
    
    val CKA_SUBPRIME: Double = js.native
    
    val CKA_SUBPRIME_BITS: Double = js.native
    
    val CKA_SUB_PRIME_BITS: Double = js.native
    
    val CKA_SUPPORTED_CMS_ATTRIBUTES: Double = js.native
    
    val CKA_TOKEN: Double = js.native
    
    val CKA_TRUSTED: Double = js.native
    
    val CKA_UNWRAP: Double = js.native
    
    val CKA_UNWRAP_TEMPLATE: Double = js.native
    
    val CKA_URL: Double = js.native
    
    val CKA_VALUE: Double = js.native
    
    val CKA_VALUE_BITS: Double = js.native
    
    val CKA_VALUE_LEN: Double = js.native
    
    val CKA_VENDOR_DEFINED: Double = js.native
    
    val CKA_VERIFY: Double = js.native
    
    val CKA_VERIFY_RECOVER: Double = js.native
    
    val CKA_WRAP: Double = js.native
    
    val CKA_WRAP_TEMPLATE: Double = js.native
    
    val CKA_WRAP_WITH_TRUSTED: Double = js.native
    
    val CKC_WTLS: Double = js.native
    
    //#endregion
    //#region Certificates
    val CKC_X_509: Double = js.native
    
    val CKC_X_509_ATTR_CERT: Double = js.native
    
    val CKD_CPDIVERSIFY_KDF: Double = js.native
    
    //#endregion
    //#region KDFs
    val CKD_NULL: Double = js.native
    
    val CKD_SHA1_KDF: Double = js.native
    
    val CKD_SHA1_KDF_ASN1: Double = js.native
    
    val CKD_SHA1_KDF_CONCATENATE: Double = js.native
    
    val CKD_SHA224_KDF: Double = js.native
    
    val CKD_SHA256_KDF: Double = js.native
    
    val CKD_SHA384_KDF: Double = js.native
    
    val CKD_SHA512_KDF: Double = js.native
    
    val CKF_CLOCK_ON_TOKEN: Double = js.native
    
    val CKF_DECRYPT: Double = js.native
    
    val CKF_DERIVE: Double = js.native
    
    val CKF_DIGEST: Double = js.native
    
    val CKF_DUAL_CRYPTO_OPERATIONS: Double = js.native
    
    val CKF_ENCRYPT: Double = js.native
    
    val CKF_ERROR_STATE: Double = js.native
    
    val CKF_GENERATE: Double = js.native
    
    val CKF_GENERATE_KEY_PAIR: Double = js.native
    
    //#endregion
    //#region Follows
    val CKF_HW: Double = js.native
    
    //#endregion
    // Initialize flags
    val CKF_LIBRARY_CANT_CREATE_OS_THREADS: Double = js.native
    
    val CKF_LOGIN_REQUIRED: Double = js.native
    
    val CKF_OS_LOCKING_OK: Double = js.native
    
    val CKF_PROTECTED_AUTHENTICATION_PATH: Double = js.native
    
    val CKF_RESTORE_KEY_NOT_NEEDED: Double = js.native
    
    //#endregion
    //#region Token Information Flags
    val CKF_RNG: Double = js.native
    
    //#endregion
    //#region Session flags
    val CKF_RW_SESSION: Double = js.native
    
    val CKF_SECONDARY_AUTHENTICATION: Double = js.native
    
    val CKF_SERIAL_SESSION: Double = js.native
    
    val CKF_SIGN: Double = js.native
    
    val CKF_SIGN_RECOVER: Double = js.native
    
    val CKF_SO_PIN_COUNT_LOW: Double = js.native
    
    val CKF_SO_PIN_FINAL_TRY: Double = js.native
    
    val CKF_SO_PIN_LOCKED: Double = js.native
    
    val CKF_SO_PIN_TO_BE_CHANGED: Double = js.native
    
    val CKF_TOKEN_INITIALIZED: Double = js.native
    
    val CKF_UNWRAP: Double = js.native
    
    val CKF_USER_PIN_COUNT_LOW: Double = js.native
    
    val CKF_USER_PIN_FINAL_TRY: Double = js.native
    
    val CKF_USER_PIN_INITIALIZED: Double = js.native
    
    val CKF_USER_PIN_LOCKED: Double = js.native
    
    val CKF_USER_PIN_TO_BE_CHANGED: Double = js.native
    
    val CKF_VERIFY: Double = js.native
    
    val CKF_VERIFY_RECOVER: Double = js.native
    
    val CKF_WRAP: Double = js.native
    
    val CKF_WRITE_PROTECTED: Double = js.native
    
    //#endregion
    //#region MGFs
    val CKG_MGF1_SHA1: Double = js.native
    
    val CKG_MGF1_SHA224: Double = js.native
    
    val CKG_MGF1_SHA256: Double = js.native
    
    val CKG_MGF1_SHA384: Double = js.native
    
    val CKG_MGF1_SHA512: Double = js.native
    
    val CKK_ACTI: Double = js.native
    
    val CKK_AES: Double = js.native
    
    val CKK_ARIA: Double = js.native
    
    val CKK_BATON: Double = js.native
    
    val CKK_BLOWFISH: Double = js.native
    
    val CKK_CAMELLIA: Double = js.native
    
    val CKK_CAST: Double = js.native
    
    val CKK_CAST128: Double = js.native
    
    val CKK_CAST3: Double = js.native
    
    val CKK_CAST5: Double = js.native
    
    val CKK_CDMF: Double = js.native
    
    val CKK_DES: Double = js.native
    
    val CKK_DES2: Double = js.native
    
    val CKK_DES3: Double = js.native
    
    val CKK_DH: Double = js.native
    
    val CKK_DSA: Double = js.native
    
    val CKK_EC: Double = js.native
    
    val CKK_ECDSA: Double = js.native
    
    val CKK_GENERIC_SECRET: Double = js.native
    
    val CKK_GOST28147: Double = js.native
    
    val CKK_GOSTR3410: Double = js.native
    
    val CKK_GOSTR3411: Double = js.native
    
    val CKK_HOTP: Double = js.native
    
    val CKK_IDEA: Double = js.native
    
    val CKK_JUNIPER: Double = js.native
    
    val CKK_KEA: Double = js.native
    
    val CKK_MD5_HMAC: Double = js.native
    
    val CKK_RC2: Double = js.native
    
    val CKK_RC4: Double = js.native
    
    val CKK_RC5: Double = js.native
    
    val CKK_RIPEMD128_HMAC: Double = js.native
    
    val CKK_RIPEMD160_HMAC: Double = js.native
    
    //#endregion
    //#region Key types
    val CKK_RSA: Double = js.native
    
    val CKK_SECURID: Double = js.native
    
    val CKK_SEED: Double = js.native
    
    val CKK_SHA224_HMAC: Double = js.native
    
    val CKK_SHA256_HMAC: Double = js.native
    
    val CKK_SHA384_HMAC: Double = js.native
    
    val CKK_SHA512_HMAC: Double = js.native
    
    val CKK_SHA_1_HMAC: Double = js.native
    
    val CKK_SKIPJACK: Double = js.native
    
    val CKK_TWOFISH: Double = js.native
    
    val CKK_VENDOR_DEFINED: Double = js.native
    
    val CKK_X9_42_DH: Double = js.native
    
    val CKM_ACTI: Double = js.native
    
    val CKM_ACTI_KEY_GEN: Double = js.native
    
    val CKM_AES_CBC: Double = js.native
    
    val CKM_AES_CBC_ENCRYPT_DATA: Double = js.native
    
    val CKM_AES_CBC_PAD: Double = js.native
    
    val CKM_AES_CCM: Double = js.native
    
    val CKM_AES_CFB128: Double = js.native
    
    val CKM_AES_CFB64: Double = js.native
    
    val CKM_AES_CFB8: Double = js.native
    
    val CKM_AES_CMAC: Double = js.native
    
    val CKM_AES_CMAC_GENERAL: Double = js.native
    
    val CKM_AES_CTR: Double = js.native
    
    val CKM_AES_CTS: Double = js.native
    
    val CKM_AES_ECB: Double = js.native
    
    val CKM_AES_ECB_ENCRYPT_DATA: Double = js.native
    
    val CKM_AES_GCM: Double = js.native
    
    val CKM_AES_KEY_GEN: Double = js.native
    
    val CKM_AES_KEY_WRAP: Double = js.native
    
    val CKM_AES_KEY_WRAP_PAD: Double = js.native
    
    val CKM_AES_MAC: Double = js.native
    
    val CKM_AES_MAC_GENERAL: Double = js.native
    
    val CKM_AES_OFB: Double = js.native
    
    val CKM_ARIA_CBC: Double = js.native
    
    val CKM_ARIA_CBC_ENCRYPT_DATA: Double = js.native
    
    val CKM_ARIA_CBC_PAD: Double = js.native
    
    val CKM_ARIA_ECB: Double = js.native
    
    val CKM_ARIA_ECB_ENCRYPT_DATA: Double = js.native
    
    val CKM_ARIA_KEY_GEN: Double = js.native
    
    val CKM_ARIA_MAC: Double = js.native
    
    val CKM_ARIA_MAC_GENERAL: Double = js.native
    
    val CKM_BATON_CBC128: Double = js.native
    
    val CKM_BATON_COUNTER: Double = js.native
    
    val CKM_BATON_ECB128: Double = js.native
    
    val CKM_BATON_ECB96: Double = js.native
    
    val CKM_BATON_KEY_GEN: Double = js.native
    
    val CKM_BATON_SHUFFLE: Double = js.native
    
    val CKM_BATON_WRAP: Double = js.native
    
    val CKM_BLOWFISH_CBC: Double = js.native
    
    val CKM_BLOWFISH_CBC_PAD: Double = js.native
    
    val CKM_BLOWFISH_KEY_GEN: Double = js.native
    
    val CKM_CAMELLIA_CBC: Double = js.native
    
    val CKM_CAMELLIA_CBC_ENCRYPT_DATA: Double = js.native
    
    val CKM_CAMELLIA_CBC_PAD: Double = js.native
    
    val CKM_CAMELLIA_CTR: Double = js.native
    
    val CKM_CAMELLIA_ECB: Double = js.native
    
    val CKM_CAMELLIA_ECB_ENCRYPT_DATA: Double = js.native
    
    val CKM_CAMELLIA_KEY_GEN: Double = js.native
    
    val CKM_CAMELLIA_MAC: Double = js.native
    
    val CKM_CAMELLIA_MAC_GENERAL: Double = js.native
    
    val CKM_CAST128_CBC: Double = js.native
    
    val CKM_CAST128_CBC_PAD: Double = js.native
    
    val CKM_CAST128_ECB: Double = js.native
    
    val CKM_CAST128_KEY_GEN: Double = js.native
    
    val CKM_CAST128_MAC: Double = js.native
    
    val CKM_CAST128_MAC_GENERAL: Double = js.native
    
    val CKM_CAST3_CBC: Double = js.native
    
    val CKM_CAST3_CBC_PAD: Double = js.native
    
    val CKM_CAST3_ECB: Double = js.native
    
    val CKM_CAST3_KEY_GEN: Double = js.native
    
    val CKM_CAST3_MAC: Double = js.native
    
    val CKM_CAST3_MAC_GENERAL: Double = js.native
    
    val CKM_CAST5_CBC: Double = js.native
    
    val CKM_CAST5_CBC_PAD: Double = js.native
    
    val CKM_CAST5_ECB: Double = js.native
    
    val CKM_CAST5_KEY_GEN: Double = js.native
    
    val CKM_CAST5_MAC: Double = js.native
    
    val CKM_CAST5_MAC_GENERAL: Double = js.native
    
    val CKM_CAST_CBC: Double = js.native
    
    val CKM_CAST_CBC_PAD: Double = js.native
    
    val CKM_CAST_ECB: Double = js.native
    
    val CKM_CAST_KEY_GEN: Double = js.native
    
    val CKM_CAST_MAC: Double = js.native
    
    val CKM_CAST_MAC_GENERAL: Double = js.native
    
    val CKM_CDMF_CBC: Double = js.native
    
    val CKM_CDMF_CBC_PAD: Double = js.native
    
    val CKM_CDMF_ECB: Double = js.native
    
    val CKM_CDMF_KEY_GEN: Double = js.native
    
    val CKM_CDMF_MAC: Double = js.native
    
    val CKM_CDMF_MAC_GENERAL: Double = js.native
    
    val CKM_CONCATENATE_BASE_AND_DATA: Double = js.native
    
    val CKM_CONCATENATE_BASE_AND_KEY: Double = js.native
    
    val CKM_CONCATENATE_DATA_AND_BASE: Double = js.native
    
    val CKM_DES2_KEY_GEN: Double = js.native
    
    val CKM_DES3_CBC: Double = js.native
    
    val CKM_DES3_CBC_ENCRYPT_DATA: Double = js.native
    
    val CKM_DES3_CBC_PAD: Double = js.native
    
    val CKM_DES3_CMAC: Double = js.native
    
    val CKM_DES3_CMAC_GENERAL: Double = js.native
    
    val CKM_DES3_ECB: Double = js.native
    
    val CKM_DES3_ECB_ENCRYPT_DATA: Double = js.native
    
    val CKM_DES3_KEY_GEN: Double = js.native
    
    val CKM_DES3_MAC: Double = js.native
    
    val CKM_DES3_MAC_GENERAL: Double = js.native
    
    val CKM_DES_CBC: Double = js.native
    
    val CKM_DES_CBC_ENCRYPT_DATA: Double = js.native
    
    val CKM_DES_CBC_PAD: Double = js.native
    
    val CKM_DES_CFB64: Double = js.native
    
    val CKM_DES_CFB8: Double = js.native
    
    val CKM_DES_ECB: Double = js.native
    
    val CKM_DES_ECB_ENCRYPT_DATA: Double = js.native
    
    val CKM_DES_KEY_GEN: Double = js.native
    
    val CKM_DES_MAC: Double = js.native
    
    val CKM_DES_MAC_GENERAL: Double = js.native
    
    val CKM_DES_OFB64: Double = js.native
    
    val CKM_DES_OFB8: Double = js.native
    
    val CKM_DH_PKCS_DERIVE: Double = js.native
    
    val CKM_DH_PKCS_KEY_PAIR_GEN: Double = js.native
    
    val CKM_DH_PKCS_PARAMETER_GEN: Double = js.native
    
    val CKM_DSA: Double = js.native
    
    val CKM_DSA_KEY_PAIR_GEN: Double = js.native
    
    val CKM_DSA_PARAMETER_GEN: Double = js.native
    
    val CKM_DSA_SHA1: Double = js.native
    
    val CKM_DSA_SHA224: Double = js.native
    
    val CKM_DSA_SHA256: Double = js.native
    
    val CKM_DSA_SHA384: Double = js.native
    
    val CKM_DSA_SHA512: Double = js.native
    
    val CKM_ECDH1_COFACTOR_DERIVE: Double = js.native
    
    val CKM_ECDH1_DERIVE: Double = js.native
    
    val CKM_ECDSA: Double = js.native
    
    val CKM_ECDSA_KEY_PAIR_GEN: Double = js.native
    
    val CKM_ECDSA_SHA1: Double = js.native
    
    val CKM_ECDSA_SHA224: Double = js.native
    
    val CKM_ECDSA_SHA256: Double = js.native
    
    val CKM_ECDSA_SHA384: Double = js.native
    
    val CKM_ECDSA_SHA512: Double = js.native
    
    val CKM_ECMQV_DERIVE: Double = js.native
    
    val CKM_EC_KEY_PAIR_GEN: Double = js.native
    
    val CKM_EXTRACT_KEY_FROM_KEY: Double = js.native
    
    val CKM_FASTHASH: Double = js.native
    
    val CKM_FORTEZZA_TIMESTAMP: Double = js.native
    
    val CKM_GENERIC_SECRET_KEY_GEN: Double = js.native
    
    val CKM_GOST28147: Double = js.native
    
    val CKM_GOST28147_ECB: Double = js.native
    
    val CKM_GOST28147_KEY_GEN: Double = js.native
    
    val CKM_GOST28147_KEY_WRAP: Double = js.native
    
    val CKM_GOST28147_MAC: Double = js.native
    
    val CKM_GOSTR3410: Double = js.native
    
    val CKM_GOSTR3410_DERIVE: Double = js.native
    
    val CKM_GOSTR3410_KEY_PAIR_GEN: Double = js.native
    
    val CKM_GOSTR3410_KEY_WRAP: Double = js.native
    
    val CKM_GOSTR3410_WITH_GOSTR3411: Double = js.native
    
    val CKM_GOSTR3411: Double = js.native
    
    val CKM_GOSTR3411_HMAC: Double = js.native
    
    val CKM_HOTP: Double = js.native
    
    val CKM_HOTP_KEY_GEN: Double = js.native
    
    val CKM_IDEA_CBC: Double = js.native
    
    val CKM_IDEA_CBC_PAD: Double = js.native
    
    val CKM_IDEA_ECB: Double = js.native
    
    val CKM_IDEA_KEY_GEN: Double = js.native
    
    val CKM_IDEA_MAC: Double = js.native
    
    val CKM_IDEA_MAC_GENERAL: Double = js.native
    
    val CKM_JUNIPER_CBC128: Double = js.native
    
    val CKM_JUNIPER_COUNTER: Double = js.native
    
    val CKM_JUNIPER_ECB128: Double = js.native
    
    val CKM_JUNIPER_KEY_GEN: Double = js.native
    
    val CKM_JUNIPER_SHUFFLE: Double = js.native
    
    val CKM_JUNIPER_WRAP: Double = js.native
    
    val CKM_KEA_KEY_DERIVE: Double = js.native
    
    val CKM_KEA_KEY_PAIR_GEN: Double = js.native
    
    val CKM_KEY_WRAP_LYNKS: Double = js.native
    
    val CKM_KEY_WRAP_SET_OAEP: Double = js.native
    
    val CKM_MD2: Double = js.native
    
    val CKM_MD2_HMAC: Double = js.native
    
    val CKM_MD2_HMAC_GENERAL: Double = js.native
    
    val CKM_MD2_KEY_DERIVATION: Double = js.native
    
    val CKM_MD2_RSA_PKCS: Double = js.native
    
    val CKM_MD5: Double = js.native
    
    val CKM_MD5_HMAC: Double = js.native
    
    val CKM_MD5_HMAC_GENERAL: Double = js.native
    
    val CKM_MD5_KEY_DERIVATION: Double = js.native
    
    val CKM_MD5_RSA_PKCS: Double = js.native
    
    val CKM_PBA_SHA1_WITH_SHA1_HMAC: Double = js.native
    
    val CKM_PBE_MD2_DES_CBC: Double = js.native
    
    val CKM_PBE_MD5_CAST128_CBC: Double = js.native
    
    val CKM_PBE_MD5_CAST3_CBC: Double = js.native
    
    val CKM_PBE_MD5_CAST5_CBC: Double = js.native
    
    val CKM_PBE_MD5_CAST_CBC: Double = js.native
    
    val CKM_PBE_MD5_DES_CBC: Double = js.native
    
    val CKM_PBE_SHA1_CAST128_CBC: Double = js.native
    
    val CKM_PBE_SHA1_CAST5_CBC: Double = js.native
    
    val CKM_PBE_SHA1_DES2_EDE_CBC: Double = js.native
    
    val CKM_PBE_SHA1_DES3_EDE_CBC: Double = js.native
    
    val CKM_PBE_SHA1_RC2_128_CBC: Double = js.native
    
    val CKM_PBE_SHA1_RC2_40_CBC: Double = js.native
    
    val CKM_PBE_SHA1_RC4_128: Double = js.native
    
    val CKM_PBE_SHA1_RC4_40: Double = js.native
    
    val CKM_PKCS5_PBKD2: Double = js.native
    
    val CKM_RC2_CBC: Double = js.native
    
    val CKM_RC2_CBC_PAD: Double = js.native
    
    val CKM_RC2_ECB: Double = js.native
    
    val CKM_RC2_KEY_GEN: Double = js.native
    
    val CKM_RC2_MAC: Double = js.native
    
    val CKM_RC2_MAC_GENERAL: Double = js.native
    
    val CKM_RC4: Double = js.native
    
    val CKM_RC4_KEY_GEN: Double = js.native
    
    val CKM_RC5_CBC: Double = js.native
    
    val CKM_RC5_CBC_PAD: Double = js.native
    
    val CKM_RC5_ECB: Double = js.native
    
    val CKM_RC5_KEY_GEN: Double = js.native
    
    val CKM_RC5_MAC: Double = js.native
    
    val CKM_RC5_MAC_GENERAL: Double = js.native
    
    val CKM_RIPEMD128: Double = js.native
    
    val CKM_RIPEMD128_HMAC: Double = js.native
    
    val CKM_RIPEMD128_HMAC_GENERAL: Double = js.native
    
    val CKM_RIPEMD128_RSA_PKCS: Double = js.native
    
    val CKM_RIPEMD160: Double = js.native
    
    val CKM_RIPEMD160_HMAC: Double = js.native
    
    val CKM_RIPEMD160_HMAC_GENERAL: Double = js.native
    
    val CKM_RIPEMD160_RSA_PKCS: Double = js.native
    
    val CKM_RSA_9796: Double = js.native
    
    val CKM_RSA_PKCS: Double = js.native
    
    //#endregion
    //#region Mechanisms
    val CKM_RSA_PKCS_KEY_PAIR_GEN: Double = js.native
    
    val CKM_RSA_PKCS_OAEP: Double = js.native
    
    val CKM_RSA_PKCS_OAEP_TPM_1_1: Double = js.native
    
    val CKM_RSA_PKCS_PSS: Double = js.native
    
    val CKM_RSA_PKCS_TPM_1_1: Double = js.native
    
    val CKM_RSA_X9_31: Double = js.native
    
    val CKM_RSA_X9_31_KEY_PAIR_GEN: Double = js.native
    
    val CKM_RSA_X_509: Double = js.native
    
    val CKM_SECURID: Double = js.native
    
    val CKM_SECURID_KEY_GEN: Double = js.native
    
    val CKM_SEED_CBC: Double = js.native
    
    val CKM_SEED_CBC_ENCRYPT_DATA: Double = js.native
    
    val CKM_SEED_CBC_PAD: Double = js.native
    
    val CKM_SEED_ECB: Double = js.native
    
    val CKM_SEED_ECB_ENCRYPT_DATA: Double = js.native
    
    val CKM_SEED_KEY_GEN: Double = js.native
    
    val CKM_SEED_MAC: Double = js.native
    
    val CKM_SEED_MAC_GENERAL: Double = js.native
    
    val CKM_SHA1_KEY_DERIVATION: Double = js.native
    
    val CKM_SHA1_RSA_PKCS: Double = js.native
    
    val CKM_SHA1_RSA_PKCS_PSS: Double = js.native
    
    val CKM_SHA1_RSA_X9_31: Double = js.native
    
    val CKM_SHA224: Double = js.native
    
    val CKM_SHA224_HMAC: Double = js.native
    
    val CKM_SHA224_HMAC_GENERAL: Double = js.native
    
    val CKM_SHA224_KEY_DERIVATION: Double = js.native
    
    val CKM_SHA224_RSA_PKCS: Double = js.native
    
    val CKM_SHA224_RSA_PKCS_PSS: Double = js.native
    
    val CKM_SHA256: Double = js.native
    
    val CKM_SHA256_HMAC: Double = js.native
    
    val CKM_SHA256_HMAC_GENERAL: Double = js.native
    
    val CKM_SHA256_KEY_DERIVATION: Double = js.native
    
    val CKM_SHA256_RSA_PKCS: Double = js.native
    
    val CKM_SHA256_RSA_PKCS_PSS: Double = js.native
    
    val CKM_SHA384: Double = js.native
    
    val CKM_SHA384_HMAC: Double = js.native
    
    val CKM_SHA384_HMAC_GENERAL: Double = js.native
    
    val CKM_SHA384_KEY_DERIVATION: Double = js.native
    
    val CKM_SHA384_RSA_PKCS: Double = js.native
    
    val CKM_SHA384_RSA_PKCS_PSS: Double = js.native
    
    val CKM_SHA512: Double = js.native
    
    val CKM_SHA512_HMAC: Double = js.native
    
    val CKM_SHA512_HMAC_GENERAL: Double = js.native
    
    val CKM_SHA512_KEY_DERIVATION: Double = js.native
    
    val CKM_SHA512_RSA_PKCS: Double = js.native
    
    val CKM_SHA512_RSA_PKCS_PSS: Double = js.native
    
    val CKM_SHA_1: Double = js.native
    
    val CKM_SHA_1_HMAC: Double = js.native
    
    val CKM_SHA_1_HMAC_GENERAL: Double = js.native
    
    val CKM_SKIPJACK_CBC64: Double = js.native
    
    val CKM_SKIPJACK_CFB16: Double = js.native
    
    val CKM_SKIPJACK_CFB32: Double = js.native
    
    val CKM_SKIPJACK_CFB64: Double = js.native
    
    val CKM_SKIPJACK_CFB8: Double = js.native
    
    val CKM_SKIPJACK_ECB64: Double = js.native
    
    val CKM_SKIPJACK_KEY_GEN: Double = js.native
    
    val CKM_SKIPJACK_OFB64: Double = js.native
    
    val CKM_SKIPJACK_PRIVATE_WRAP: Double = js.native
    
    val CKM_SKIPJACK_RELAYX: Double = js.native
    
    val CKM_SKIPJACK_WRAP: Double = js.native
    
    val CKM_SSL3_KEY_AND_MAC_DERIVE: Double = js.native
    
    val CKM_SSL3_MASTER_KEY_DERIVE: Double = js.native
    
    val CKM_SSL3_MASTER_KEY_DERIVE_DH: Double = js.native
    
    val CKM_SSL3_MD5_MAC: Double = js.native
    
    val CKM_SSL3_PRE_MASTER_KEY_GEN: Double = js.native
    
    val CKM_SSL3_SHA1_MAC: Double = js.native
    
    val CKM_TLS_KEY_AND_MAC_DERIVE: Double = js.native
    
    val CKM_TLS_MASTER_KEY_DERIVE: Double = js.native
    
    val CKM_TLS_MASTER_KEY_DERIVE_DH: Double = js.native
    
    val CKM_TLS_PRE_MASTER_KEY_GEN: Double = js.native
    
    val CKM_TLS_PRF: Double = js.native
    
    val CKM_TWOFISH_CBC: Double = js.native
    
    val CKM_TWOFISH_CBC_PAD: Double = js.native
    
    val CKM_TWOFISH_KEY_GEN: Double = js.native
    
    val CKM_VENDOR_DEFINED: Double = js.native
    
    val CKM_WTLS_CLIENT_KEY_AND_MAC_DERIVE: Double = js.native
    
    val CKM_WTLS_MASTER_KEY_DERIVE: Double = js.native
    
    val CKM_WTLS_MASTER_KEY_DERIVE_DH_ECC: Double = js.native
    
    val CKM_WTLS_PRE_MASTER_KEY_GEN: Double = js.native
    
    val CKM_WTLS_PRF: Double = js.native
    
    val CKM_WTLS_SERVER_KEY_AND_MAC_DERIVE: Double = js.native
    
    val CKM_X9_42_DH_DERIVE: Double = js.native
    
    val CKM_X9_42_DH_HYBRID_DERIVE: Double = js.native
    
    val CKM_X9_42_DH_KEY_PAIR_GEN: Double = js.native
    
    val CKM_X9_42_DH_PARAMETER_GEN: Double = js.native
    
    val CKM_X9_42_MQV_DERIVE: Double = js.native
    
    val CKM_XOR_BASE_AND_DATA: Double = js.native
    
    val CKO_CERTIFICATE: Double = js.native
    
    //#endregion
    //#region Objects
    val CKO_DATA: Double = js.native
    
    val CKO_DOMAIN_PARAMETERS: Double = js.native
    
    val CKO_HW_FEATURE: Double = js.native
    
    val CKO_MECHANISM: Double = js.native
    
    val CKO_OTP_KEY: Double = js.native
    
    val CKO_PRIVATE_KEY: Double = js.native
    
    val CKO_PUBLIC_KEY: Double = js.native
    
    val CKO_SECRET_KEY: Double = js.native
    
    val CKO_VENDOR_DEFINED: Double = js.native
    
    @JSName("CK_PARAMS_AES_GCM_v240")
    val CKPARAMSAESGCMV240: Double = js.native
    
    val CKU_CONTEXT_SPECIFIC: Double = js.native
    
    //#endregion
    //#region User types
    val CKU_SO: Double = js.native
    
    val CKU_USER: Double = js.native
    
    //#endregion
    //#region Mech params
    val CK_PARAMS_AES_CBC: Double = js.native
    
    val CK_PARAMS_AES_CCM: Double = js.native
    
    val CK_PARAMS_AES_GCM: Double = js.native
    
    val CK_PARAMS_EC_DH: Double = js.native
    
    val CK_PARAMS_RSA_OAEP: Double = js.native
    
    val CK_PARAMS_RSA_PSS: Double = js.native
    
    @js.native
    class PKCS11 ()
      extends typingsSlinky.pkcs11js.Pkcs11Js.PKCS11
  }
}
