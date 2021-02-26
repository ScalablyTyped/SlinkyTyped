package typingsSlinky.mz

import typingsSlinky.mz.mzNumbers.`0`
import typingsSlinky.mz.mzNumbers.`1`
import typingsSlinky.mz.mzStrings.base64
import typingsSlinky.mz.mzStrings.compressed
import typingsSlinky.mz.mzStrings.der
import typingsSlinky.mz.mzStrings.dsa
import typingsSlinky.mz.mzStrings.ec
import typingsSlinky.mz.mzStrings.ed25519
import typingsSlinky.mz.mzStrings.ed448
import typingsSlinky.mz.mzStrings.hex
import typingsSlinky.mz.mzStrings.hybrid
import typingsSlinky.mz.mzStrings.latin1
import typingsSlinky.mz.mzStrings.pem
import typingsSlinky.mz.mzStrings.rsa
import typingsSlinky.mz.mzStrings.uncompressed
import typingsSlinky.mz.mzStrings.x25519
import typingsSlinky.mz.mzStrings.x448
import typingsSlinky.node.Buffer
import typingsSlinky.node.BufferEncoding
import typingsSlinky.node.NodeJS.ArrayBufferView
import typingsSlinky.node.anon.PrivateKey
import typingsSlinky.node.cryptoMod.BinaryLike
import typingsSlinky.node.cryptoMod.CipherCCM
import typingsSlinky.node.cryptoMod.CipherCCMOptions
import typingsSlinky.node.cryptoMod.CipherCCMTypes
import typingsSlinky.node.cryptoMod.CipherGCM
import typingsSlinky.node.cryptoMod.CipherGCMOptions
import typingsSlinky.node.cryptoMod.CipherGCMTypes
import typingsSlinky.node.cryptoMod.CipherKey
import typingsSlinky.node.cryptoMod.DSAKeyPairKeyObjectOptions
import typingsSlinky.node.cryptoMod.DSAKeyPairOptions
import typingsSlinky.node.cryptoMod.DecipherCCM
import typingsSlinky.node.cryptoMod.DecipherGCM
import typingsSlinky.node.cryptoMod.ECKeyPairKeyObjectOptions
import typingsSlinky.node.cryptoMod.ECKeyPairOptions
import typingsSlinky.node.cryptoMod.ED25519KeyPairKeyObjectOptions
import typingsSlinky.node.cryptoMod.ED25519KeyPairOptions
import typingsSlinky.node.cryptoMod.ED448KeyPairKeyObjectOptions
import typingsSlinky.node.cryptoMod.ED448KeyPairOptions
import typingsSlinky.node.cryptoMod.HashOptions
import typingsSlinky.node.cryptoMod.HexBase64Latin1Encoding
import typingsSlinky.node.cryptoMod.KeyLike
import typingsSlinky.node.cryptoMod.KeyPairKeyObjectResult
import typingsSlinky.node.cryptoMod.KeyPairSyncResult
import typingsSlinky.node.cryptoMod.PrivateKeyInput
import typingsSlinky.node.cryptoMod.PublicKeyInput
import typingsSlinky.node.cryptoMod.RSAKeyPairKeyObjectOptions
import typingsSlinky.node.cryptoMod.RSAKeyPairOptions
import typingsSlinky.node.cryptoMod.RsaPrivateKey
import typingsSlinky.node.cryptoMod.RsaPublicKey
import typingsSlinky.node.cryptoMod.ScryptOptions
import typingsSlinky.node.cryptoMod.SignKeyObjectInput
import typingsSlinky.node.cryptoMod.SignPrivateKeyInput
import typingsSlinky.node.cryptoMod.VerifyKeyObjectInput
import typingsSlinky.node.cryptoMod.VerifyPublicKeyInput
import typingsSlinky.node.cryptoMod.X25519KeyPairKeyObjectOptions
import typingsSlinky.node.cryptoMod.X25519KeyPairOptions
import typingsSlinky.node.cryptoMod.X448KeyPairKeyObjectOptions
import typingsSlinky.node.cryptoMod.X448KeyPairOptions
import typingsSlinky.node.streamMod.TransformOptions
import typingsSlinky.node.streamMod.WritableOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cryptoMod {
  
  @JSImport("mz/crypto", "Certificate")
  @js.native
  def Certificate(): typingsSlinky.node.cryptoMod.Certificate = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("mz/crypto", "CertificateCls")
  @js.native
  class CertificateCls ()
    extends typingsSlinky.node.cryptoMod.CertificateCls
  
  @JSImport("mz/crypto", "Cipher")
  @js.native
  class Cipher protected ()
    extends typingsSlinky.node.cryptoMod.Cipher
  
  /** @deprecated since v10.0.0 */
  @JSImport("mz/crypto", "DEFAULT_ENCODING")
  @js.native
  val DEFAULT_ENCODING: BufferEncoding = js.native
  
  @JSImport("mz/crypto", "Decipher")
  @js.native
  class Decipher protected ()
    extends typingsSlinky.node.cryptoMod.Decipher
  
  @JSImport("mz/crypto", "DiffieHellman")
  @js.native
  class DiffieHellman_ protected ()
    extends typingsSlinky.node.cryptoMod.DiffieHellman_
  
  @JSImport("mz/crypto", "ECDH")
  @js.native
  class ECDH protected ()
    extends typingsSlinky.node.cryptoMod.ECDH
  object ECDH {
    
    /* static member */
    @JSImport("mz/crypto", "ECDH.convertKey")
    @js.native
    def convertKey(key: BinaryLike, curve: String): Buffer | String = js.native
    @JSImport("mz/crypto", "ECDH.convertKey")
    @js.native
    def convertKey(
      key: BinaryLike,
      curve: String,
      inputEncoding: js.UndefOr[scala.Nothing],
      outputEncoding: base64,
      format: compressed
    ): Buffer | String = js.native
    @JSImport("mz/crypto", "ECDH.convertKey")
    @js.native
    def convertKey(
      key: BinaryLike,
      curve: String,
      inputEncoding: js.UndefOr[scala.Nothing],
      outputEncoding: base64,
      format: hybrid
    ): Buffer | String = js.native
    @JSImport("mz/crypto", "ECDH.convertKey")
    @js.native
    def convertKey(
      key: BinaryLike,
      curve: String,
      inputEncoding: js.UndefOr[scala.Nothing],
      outputEncoding: base64,
      format: uncompressed
    ): Buffer | String = js.native
    @JSImport("mz/crypto", "ECDH.convertKey")
    @js.native
    def convertKey(
      key: BinaryLike,
      curve: String,
      inputEncoding: js.UndefOr[scala.Nothing],
      outputEncoding: hex,
      format: compressed
    ): Buffer | String = js.native
    @JSImport("mz/crypto", "ECDH.convertKey")
    @js.native
    def convertKey(
      key: BinaryLike,
      curve: String,
      inputEncoding: js.UndefOr[scala.Nothing],
      outputEncoding: hex,
      format: hybrid
    ): Buffer | String = js.native
    @JSImport("mz/crypto", "ECDH.convertKey")
    @js.native
    def convertKey(
      key: BinaryLike,
      curve: String,
      inputEncoding: js.UndefOr[scala.Nothing],
      outputEncoding: hex,
      format: uncompressed
    ): Buffer | String = js.native
    @JSImport("mz/crypto", "ECDH.convertKey")
    @js.native
    def convertKey(
      key: BinaryLike,
      curve: String,
      inputEncoding: js.UndefOr[scala.Nothing],
      outputEncoding: latin1,
      format: compressed
    ): Buffer | String = js.native
    @JSImport("mz/crypto", "ECDH.convertKey")
    @js.native
    def convertKey(
      key: BinaryLike,
      curve: String,
      inputEncoding: js.UndefOr[scala.Nothing],
      outputEncoding: latin1,
      format: hybrid
    ): Buffer | String = js.native
    @JSImport("mz/crypto", "ECDH.convertKey")
    @js.native
    def convertKey(
      key: BinaryLike,
      curve: String,
      inputEncoding: js.UndefOr[scala.Nothing],
      outputEncoding: latin1,
      format: uncompressed
    ): Buffer | String = js.native
    @JSImport("mz/crypto", "ECDH.convertKey")
    @js.native
    def convertKey(key: BinaryLike, curve: String, inputEncoding: HexBase64Latin1Encoding): Buffer | String = js.native
    @JSImport("mz/crypto", "ECDH.convertKey")
    @js.native
    def convertKey(
      key: BinaryLike,
      curve: String,
      inputEncoding: HexBase64Latin1Encoding,
      outputEncoding: base64,
      format: compressed
    ): Buffer | String = js.native
    @JSImport("mz/crypto", "ECDH.convertKey")
    @js.native
    def convertKey(
      key: BinaryLike,
      curve: String,
      inputEncoding: HexBase64Latin1Encoding,
      outputEncoding: base64,
      format: hybrid
    ): Buffer | String = js.native
    @JSImport("mz/crypto", "ECDH.convertKey")
    @js.native
    def convertKey(
      key: BinaryLike,
      curve: String,
      inputEncoding: HexBase64Latin1Encoding,
      outputEncoding: base64,
      format: uncompressed
    ): Buffer | String = js.native
    @JSImport("mz/crypto", "ECDH.convertKey")
    @js.native
    def convertKey(
      key: BinaryLike,
      curve: String,
      inputEncoding: HexBase64Latin1Encoding,
      outputEncoding: hex,
      format: compressed
    ): Buffer | String = js.native
    @JSImport("mz/crypto", "ECDH.convertKey")
    @js.native
    def convertKey(
      key: BinaryLike,
      curve: String,
      inputEncoding: HexBase64Latin1Encoding,
      outputEncoding: hex,
      format: hybrid
    ): Buffer | String = js.native
    @JSImport("mz/crypto", "ECDH.convertKey")
    @js.native
    def convertKey(
      key: BinaryLike,
      curve: String,
      inputEncoding: HexBase64Latin1Encoding,
      outputEncoding: hex,
      format: uncompressed
    ): Buffer | String = js.native
    @JSImport("mz/crypto", "ECDH.convertKey")
    @js.native
    def convertKey(
      key: BinaryLike,
      curve: String,
      inputEncoding: HexBase64Latin1Encoding,
      outputEncoding: latin1,
      format: compressed
    ): Buffer | String = js.native
    @JSImport("mz/crypto", "ECDH.convertKey")
    @js.native
    def convertKey(
      key: BinaryLike,
      curve: String,
      inputEncoding: HexBase64Latin1Encoding,
      outputEncoding: latin1,
      format: hybrid
    ): Buffer | String = js.native
    @JSImport("mz/crypto", "ECDH.convertKey")
    @js.native
    def convertKey(
      key: BinaryLike,
      curve: String,
      inputEncoding: HexBase64Latin1Encoding,
      outputEncoding: latin1,
      format: uncompressed
    ): Buffer | String = js.native
    @JSImport("mz/crypto", "ECDH.convertKey")
    @js.native
    def convertKey_base64(key: BinaryLike, curve: String, inputEncoding: js.UndefOr[scala.Nothing], outputEncoding: base64): Buffer | String = js.native
    @JSImport("mz/crypto", "ECDH.convertKey")
    @js.native
    def convertKey_base64(key: BinaryLike, curve: String, inputEncoding: HexBase64Latin1Encoding, outputEncoding: base64): Buffer | String = js.native
    @JSImport("mz/crypto", "ECDH.convertKey")
    @js.native
    def convertKey_compressed(
      key: BinaryLike,
      curve: String,
      inputEncoding: js.UndefOr[scala.Nothing],
      outputEncoding: js.UndefOr[scala.Nothing],
      format: compressed
    ): Buffer | String = js.native
    @JSImport("mz/crypto", "ECDH.convertKey")
    @js.native
    def convertKey_compressed(
      key: BinaryLike,
      curve: String,
      inputEncoding: HexBase64Latin1Encoding,
      outputEncoding: js.UndefOr[scala.Nothing],
      format: compressed
    ): Buffer | String = js.native
    @JSImport("mz/crypto", "ECDH.convertKey")
    @js.native
    def convertKey_hex(key: BinaryLike, curve: String, inputEncoding: js.UndefOr[scala.Nothing], outputEncoding: hex): Buffer | String = js.native
    @JSImport("mz/crypto", "ECDH.convertKey")
    @js.native
    def convertKey_hex(key: BinaryLike, curve: String, inputEncoding: HexBase64Latin1Encoding, outputEncoding: hex): Buffer | String = js.native
    @JSImport("mz/crypto", "ECDH.convertKey")
    @js.native
    def convertKey_hybrid(
      key: BinaryLike,
      curve: String,
      inputEncoding: js.UndefOr[scala.Nothing],
      outputEncoding: js.UndefOr[scala.Nothing],
      format: hybrid
    ): Buffer | String = js.native
    @JSImport("mz/crypto", "ECDH.convertKey")
    @js.native
    def convertKey_hybrid(
      key: BinaryLike,
      curve: String,
      inputEncoding: HexBase64Latin1Encoding,
      outputEncoding: js.UndefOr[scala.Nothing],
      format: hybrid
    ): Buffer | String = js.native
    @JSImport("mz/crypto", "ECDH.convertKey")
    @js.native
    def convertKey_latin1(key: BinaryLike, curve: String, inputEncoding: js.UndefOr[scala.Nothing], outputEncoding: latin1): Buffer | String = js.native
    @JSImport("mz/crypto", "ECDH.convertKey")
    @js.native
    def convertKey_latin1(key: BinaryLike, curve: String, inputEncoding: HexBase64Latin1Encoding, outputEncoding: latin1): Buffer | String = js.native
    @JSImport("mz/crypto", "ECDH.convertKey")
    @js.native
    def convertKey_uncompressed(
      key: BinaryLike,
      curve: String,
      inputEncoding: js.UndefOr[scala.Nothing],
      outputEncoding: js.UndefOr[scala.Nothing],
      format: uncompressed
    ): Buffer | String = js.native
    @JSImport("mz/crypto", "ECDH.convertKey")
    @js.native
    def convertKey_uncompressed(
      key: BinaryLike,
      curve: String,
      inputEncoding: HexBase64Latin1Encoding,
      outputEncoding: js.UndefOr[scala.Nothing],
      format: uncompressed
    ): Buffer | String = js.native
  }
  
  @JSImport("mz/crypto", "Hash")
  @js.native
  class Hash protected ()
    extends typingsSlinky.node.cryptoMod.Hash
  
  @JSImport("mz/crypto", "Hmac")
  @js.native
  class Hmac protected ()
    extends typingsSlinky.node.cryptoMod.Hmac
  
  @JSImport("mz/crypto", "KeyObject")
  @js.native
  class KeyObject protected ()
    extends typingsSlinky.node.cryptoMod.KeyObject
  
  @JSImport("mz/crypto", "Signer")
  @js.native
  class Signer protected ()
    extends typingsSlinky.node.cryptoMod.Signer
  
  @JSImport("mz/crypto", "Verify")
  @js.native
  class Verify_ protected ()
    extends typingsSlinky.node.cryptoMod.Verify_
  
  object constants {
    
    @JSImport("mz/crypto", "constants.ALPN_ENABLED")
    @js.native
    val ALPN_ENABLED: Double = js.native
    
    @JSImport("mz/crypto", "constants.DH_CHECK_P_NOT_PRIME")
    @js.native
    val DH_CHECK_P_NOT_PRIME: Double = js.native
    
    @JSImport("mz/crypto", "constants.DH_CHECK_P_NOT_SAFE_PRIME")
    @js.native
    val DH_CHECK_P_NOT_SAFE_PRIME: Double = js.native
    
    @JSImport("mz/crypto", "constants.DH_NOT_SUITABLE_GENERATOR")
    @js.native
    val DH_NOT_SUITABLE_GENERATOR: Double = js.native
    
    @JSImport("mz/crypto", "constants.DH_UNABLE_TO_CHECK_GENERATOR")
    @js.native
    val DH_UNABLE_TO_CHECK_GENERATOR: Double = js.native
    
    @JSImport("mz/crypto", "constants.ENGINE_METHOD_ALL")
    @js.native
    val ENGINE_METHOD_ALL: Double = js.native
    
    @JSImport("mz/crypto", "constants.ENGINE_METHOD_CIPHERS")
    @js.native
    val ENGINE_METHOD_CIPHERS: Double = js.native
    
    @JSImport("mz/crypto", "constants.ENGINE_METHOD_DH")
    @js.native
    val ENGINE_METHOD_DH: Double = js.native
    
    @JSImport("mz/crypto", "constants.ENGINE_METHOD_DIGESTS")
    @js.native
    val ENGINE_METHOD_DIGESTS: Double = js.native
    
    @JSImport("mz/crypto", "constants.ENGINE_METHOD_DSA")
    @js.native
    val ENGINE_METHOD_DSA: Double = js.native
    
    @JSImport("mz/crypto", "constants.ENGINE_METHOD_EC")
    @js.native
    val ENGINE_METHOD_EC: Double = js.native
    
    @JSImport("mz/crypto", "constants.ENGINE_METHOD_NONE")
    @js.native
    val ENGINE_METHOD_NONE: Double = js.native
    
    @JSImport("mz/crypto", "constants.ENGINE_METHOD_PKEY_ASN1_METHS")
    @js.native
    val ENGINE_METHOD_PKEY_ASN1_METHS: Double = js.native
    
    @JSImport("mz/crypto", "constants.ENGINE_METHOD_PKEY_METHS")
    @js.native
    val ENGINE_METHOD_PKEY_METHS: Double = js.native
    
    @JSImport("mz/crypto", "constants.ENGINE_METHOD_RAND")
    @js.native
    val ENGINE_METHOD_RAND: Double = js.native
    
    @JSImport("mz/crypto", "constants.ENGINE_METHOD_RSA")
    @js.native
    val ENGINE_METHOD_RSA: Double = js.native
    
    // https://nodejs.org/dist/latest-v10.x/docs/api/crypto.html#crypto_crypto_constants
    @JSImport("mz/crypto", "constants.OPENSSL_VERSION_NUMBER")
    @js.native
    val OPENSSL_VERSION_NUMBER: Double = js.native
    
    @JSImport("mz/crypto", "constants.POINT_CONVERSION_COMPRESSED")
    @js.native
    val POINT_CONVERSION_COMPRESSED: Double = js.native
    
    @JSImport("mz/crypto", "constants.POINT_CONVERSION_HYBRID")
    @js.native
    val POINT_CONVERSION_HYBRID: Double = js.native
    
    @JSImport("mz/crypto", "constants.POINT_CONVERSION_UNCOMPRESSED")
    @js.native
    val POINT_CONVERSION_UNCOMPRESSED: Double = js.native
    
    @JSImport("mz/crypto", "constants.RSA_NO_PADDING")
    @js.native
    val RSA_NO_PADDING: Double = js.native
    
    @JSImport("mz/crypto", "constants.RSA_PKCS1_OAEP_PADDING")
    @js.native
    val RSA_PKCS1_OAEP_PADDING: Double = js.native
    
    @JSImport("mz/crypto", "constants.RSA_PKCS1_PADDING")
    @js.native
    val RSA_PKCS1_PADDING: Double = js.native
    
    @JSImport("mz/crypto", "constants.RSA_PKCS1_PSS_PADDING")
    @js.native
    val RSA_PKCS1_PSS_PADDING: Double = js.native
    
    /** Causes the salt length for RSA_PKCS1_PSS_PADDING to be determined automatically when verifying a signature. */
    @JSImport("mz/crypto", "constants.RSA_PSS_SALTLEN_AUTO")
    @js.native
    val RSA_PSS_SALTLEN_AUTO: Double = js.native
    
    /** Sets the salt length for RSA_PKCS1_PSS_PADDING to the digest size when signing or verifying. */
    @JSImport("mz/crypto", "constants.RSA_PSS_SALTLEN_DIGEST")
    @js.native
    val RSA_PSS_SALTLEN_DIGEST: Double = js.native
    
    /** Sets the salt length for RSA_PKCS1_PSS_PADDING to the maximum permissible value when signing data. */
    @JSImport("mz/crypto", "constants.RSA_PSS_SALTLEN_MAX_SIGN")
    @js.native
    val RSA_PSS_SALTLEN_MAX_SIGN: Double = js.native
    
    @JSImport("mz/crypto", "constants.RSA_SSLV23_PADDING")
    @js.native
    val RSA_SSLV23_PADDING: Double = js.native
    
    @JSImport("mz/crypto", "constants.RSA_X931_PADDING")
    @js.native
    val RSA_X931_PADDING: Double = js.native
    
    @JSImport("mz/crypto", "constants.SSL_OP_NO_SSLv2")
    @js.native
    val SSLOPNOSSLv2: Double = js.native
    
    @JSImport("mz/crypto", "constants.SSL_OP_NO_SSLv3")
    @js.native
    val SSLOPNOSSLv3: Double = js.native
    
    @JSImport("mz/crypto", "constants.SSL_OP_NO_TLSv1")
    @js.native
    val SSLOPNOTLSv1: Double = js.native
    
    @JSImport("mz/crypto", "constants.SSL_OP_NO_TLSv1_1")
    @js.native
    val SSLOPNOTLSv11: Double = js.native
    
    @JSImport("mz/crypto", "constants.SSL_OP_NO_TLSv1_2")
    @js.native
    val SSLOPNOTLSv12: Double = js.native
    
    /** Applies multiple bug workarounds within OpenSSL. See https://www.openssl.org/docs/man1.0.2/ssl/SSL_CTX_set_options.html for detail. */
    @JSImport("mz/crypto", "constants.SSL_OP_ALL")
    @js.native
    val SSL_OP_ALL: Double = js.native
    
    /** Allows legacy insecure renegotiation between OpenSSL and unpatched clients or servers. See https://www.openssl.org/docs/man1.0.2/ssl/SSL_CTX_set_options.html. */
    @JSImport("mz/crypto", "constants.SSL_OP_ALLOW_UNSAFE_LEGACY_RENEGOTIATION")
    @js.native
    val SSL_OP_ALLOW_UNSAFE_LEGACY_RENEGOTIATION: Double = js.native
    
    /** Attempts to use the server's preferences instead of the client's when selecting a cipher. See https://www.openssl.org/docs/man1.0.2/ssl/SSL_CTX_set_options.html. */
    @JSImport("mz/crypto", "constants.SSL_OP_CIPHER_SERVER_PREFERENCE")
    @js.native
    val SSL_OP_CIPHER_SERVER_PREFERENCE: Double = js.native
    
    /** Instructs OpenSSL to use Cisco's "speshul" version of DTLS_BAD_VER. */
    @JSImport("mz/crypto", "constants.SSL_OP_CISCO_ANYCONNECT")
    @js.native
    val SSL_OP_CISCO_ANYCONNECT: Double = js.native
    
    /** Instructs OpenSSL to turn on cookie exchange. */
    @JSImport("mz/crypto", "constants.SSL_OP_COOKIE_EXCHANGE")
    @js.native
    val SSL_OP_COOKIE_EXCHANGE: Double = js.native
    
    /** Instructs OpenSSL to add server-hello extension from an early version of the cryptopro draft. */
    @JSImport("mz/crypto", "constants.SSL_OP_CRYPTOPRO_TLSEXT_BUG")
    @js.native
    val SSL_OP_CRYPTOPRO_TLSEXT_BUG: Double = js.native
    
    /** Instructs OpenSSL to disable a SSL 3.0/TLS 1.0 vulnerability workaround added in OpenSSL 0.9.6d. */
    @JSImport("mz/crypto", "constants.SSL_OP_DONT_INSERT_EMPTY_FRAGMENTS")
    @js.native
    val SSL_OP_DONT_INSERT_EMPTY_FRAGMENTS: Double = js.native
    
    /** Instructs OpenSSL to always use the tmp_rsa key when performing RSA operations. */
    @JSImport("mz/crypto", "constants.SSL_OP_EPHEMERAL_RSA")
    @js.native
    val SSL_OP_EPHEMERAL_RSA: Double = js.native
    
    /** Allows initial connection to servers that do not support RI. */
    @JSImport("mz/crypto", "constants.SSL_OP_LEGACY_SERVER_CONNECT")
    @js.native
    val SSL_OP_LEGACY_SERVER_CONNECT: Double = js.native
    
    @JSImport("mz/crypto", "constants.SSL_OP_MICROSOFT_BIG_SSLV3_BUFFER")
    @js.native
    val SSL_OP_MICROSOFT_BIG_SSLV3_BUFFER: Double = js.native
    
    @JSImport("mz/crypto", "constants.SSL_OP_MICROSOFT_SESS_ID_BUG")
    @js.native
    val SSL_OP_MICROSOFT_SESS_ID_BUG: Double = js.native
    
    /** Instructs OpenSSL to disable the workaround for a man-in-the-middle protocol-version vulnerability in the SSL 2.0 server implementation. */
    @JSImport("mz/crypto", "constants.SSL_OP_MSIE_SSLV2_RSA_PADDING")
    @js.native
    val SSL_OP_MSIE_SSLV2_RSA_PADDING: Double = js.native
    
    @JSImport("mz/crypto", "constants.SSL_OP_NETSCAPE_CA_DN_BUG")
    @js.native
    val SSL_OP_NETSCAPE_CA_DN_BUG: Double = js.native
    
    @JSImport("mz/crypto", "constants.SSL_OP_NETSCAPE_CHALLENGE_BUG")
    @js.native
    val SSL_OP_NETSCAPE_CHALLENGE_BUG: Double = js.native
    
    @JSImport("mz/crypto", "constants.SSL_OP_NETSCAPE_DEMO_CIPHER_CHANGE_BUG")
    @js.native
    val SSL_OP_NETSCAPE_DEMO_CIPHER_CHANGE_BUG: Double = js.native
    
    @JSImport("mz/crypto", "constants.SSL_OP_NETSCAPE_REUSE_CIPHER_CHANGE_BUG")
    @js.native
    val SSL_OP_NETSCAPE_REUSE_CIPHER_CHANGE_BUG: Double = js.native
    
    /** Instructs OpenSSL to disable support for SSL/TLS compression. */
    @JSImport("mz/crypto", "constants.SSL_OP_NO_COMPRESSION")
    @js.native
    val SSL_OP_NO_COMPRESSION: Double = js.native
    
    @JSImport("mz/crypto", "constants.SSL_OP_NO_QUERY_MTU")
    @js.native
    val SSL_OP_NO_QUERY_MTU: Double = js.native
    
    /** Instructs OpenSSL to always start a new session when performing renegotiation. */
    @JSImport("mz/crypto", "constants.SSL_OP_NO_SESSION_RESUMPTION_ON_RENEGOTIATION")
    @js.native
    val SSL_OP_NO_SESSION_RESUMPTION_ON_RENEGOTIATION: Double = js.native
    
    @JSImport("mz/crypto", "constants.SSL_OP_NO_TICKET")
    @js.native
    val SSL_OP_NO_TICKET: Double = js.native
    
    @JSImport("mz/crypto", "constants.SSL_OP_PKCS1_CHECK_1")
    @js.native
    val SSL_OP_PKCS1_CHECK_1: Double = js.native
    
    @JSImport("mz/crypto", "constants.SSL_OP_PKCS1_CHECK_2")
    @js.native
    val SSL_OP_PKCS1_CHECK_2: Double = js.native
    
    /** Instructs OpenSSL to always create a new key when using temporary/ephemeral DH parameters. */
    @JSImport("mz/crypto", "constants.SSL_OP_SINGLE_DH_USE")
    @js.native
    val SSL_OP_SINGLE_DH_USE: Double = js.native
    
    /** Instructs OpenSSL to always create a new key when using temporary/ephemeral ECDH parameters. */
    @JSImport("mz/crypto", "constants.SSL_OP_SINGLE_ECDH_USE")
    @js.native
    val SSL_OP_SINGLE_ECDH_USE: Double = js.native
    
    @JSImport("mz/crypto", "constants.SSL_OP_SSLEAY_080_CLIENT_DH_BUG")
    @js.native
    val SSL_OP_SSLEAY_080_CLIENT_DH_BUG: Double = js.native
    
    @JSImport("mz/crypto", "constants.SSL_OP_SSLREF2_REUSE_CERT_TYPE_BUG")
    @js.native
    val SSL_OP_SSLREF2_REUSE_CERT_TYPE_BUG: Double = js.native
    
    @JSImport("mz/crypto", "constants.SSL_OP_TLS_BLOCK_PADDING_BUG")
    @js.native
    val SSL_OP_TLS_BLOCK_PADDING_BUG: Double = js.native
    
    @JSImport("mz/crypto", "constants.SSL_OP_TLS_D5_BUG")
    @js.native
    val SSL_OP_TLS_D5_BUG: Double = js.native
    
    /** Instructs OpenSSL to disable version rollback attack detection. */
    @JSImport("mz/crypto", "constants.SSL_OP_TLS_ROLLBACK_BUG")
    @js.native
    val SSL_OP_TLS_ROLLBACK_BUG: Double = js.native
    
    /** Specifies the active default cipher list used by the current Node.js process  (colon-separated values). */
    @JSImport("mz/crypto", "constants.defaultCipherList")
    @js.native
    val defaultCipherList: String = js.native
    
    /** Specifies the built-in default cipher list used by Node.js (colon-separated values). */
    @JSImport("mz/crypto", "constants.defaultCoreCipherList")
    @js.native
    val defaultCoreCipherList: String = js.native
  }
  
  /** @deprecated since v10.0.0 use `createCipheriv()` */
  @JSImport("mz/crypto", "createCipher")
  @js.native
  def createCipher(algorithm: String, password: BinaryLike): typingsSlinky.node.cryptoMod.Cipher = js.native
  @JSImport("mz/crypto", "createCipher")
  @js.native
  def createCipher(algorithm: String, password: BinaryLike, options: TransformOptions): typingsSlinky.node.cryptoMod.Cipher = js.native
  /** @deprecated since v10.0.0 use `createCipheriv()` */
  @JSImport("mz/crypto", "createCipher")
  @js.native
  def createCipher(algorithm: CipherCCMTypes, password: BinaryLike, options: CipherCCMOptions): CipherCCM = js.native
  /** @deprecated since v10.0.0 use `createCipheriv()` */
  @JSImport("mz/crypto", "createCipher")
  @js.native
  def createCipher(algorithm: CipherGCMTypes, password: BinaryLike): CipherGCM = js.native
  @JSImport("mz/crypto", "createCipher")
  @js.native
  def createCipher(algorithm: CipherGCMTypes, password: BinaryLike, options: CipherGCMOptions): CipherGCM = js.native
  
  @JSImport("mz/crypto", "createCipheriv")
  @js.native
  def createCipheriv(algorithm: String, key: CipherKey): typingsSlinky.node.cryptoMod.Cipher = js.native
  @JSImport("mz/crypto", "createCipheriv")
  @js.native
  def createCipheriv(algorithm: String, key: CipherKey, iv: Null, options: TransformOptions): typingsSlinky.node.cryptoMod.Cipher = js.native
  @JSImport("mz/crypto", "createCipheriv")
  @js.native
  def createCipheriv(algorithm: String, key: CipherKey, iv: BinaryLike): typingsSlinky.node.cryptoMod.Cipher = js.native
  @JSImport("mz/crypto", "createCipheriv")
  @js.native
  def createCipheriv(algorithm: String, key: CipherKey, iv: BinaryLike, options: TransformOptions): typingsSlinky.node.cryptoMod.Cipher = js.native
  @JSImport("mz/crypto", "createCipheriv")
  @js.native
  def createCipheriv(algorithm: CipherCCMTypes, key: CipherKey, iv: Null, options: CipherCCMOptions): CipherCCM = js.native
  @JSImport("mz/crypto", "createCipheriv")
  @js.native
  def createCipheriv(algorithm: CipherCCMTypes, key: CipherKey, iv: BinaryLike, options: CipherCCMOptions): CipherCCM = js.native
  @JSImport("mz/crypto", "createCipheriv")
  @js.native
  def createCipheriv(algorithm: CipherGCMTypes, key: CipherKey): CipherGCM = js.native
  @JSImport("mz/crypto", "createCipheriv")
  @js.native
  def createCipheriv(algorithm: CipherGCMTypes, key: CipherKey, iv: Null, options: CipherGCMOptions): CipherGCM = js.native
  @JSImport("mz/crypto", "createCipheriv")
  @js.native
  def createCipheriv(algorithm: CipherGCMTypes, key: CipherKey, iv: BinaryLike): CipherGCM = js.native
  @JSImport("mz/crypto", "createCipheriv")
  @js.native
  def createCipheriv(algorithm: CipherGCMTypes, key: CipherKey, iv: BinaryLike, options: CipherGCMOptions): CipherGCM = js.native
  
  /** @deprecated since v10.0.0 use `createDecipheriv()` */
  @JSImport("mz/crypto", "createDecipher")
  @js.native
  def createDecipher(algorithm: String, password: BinaryLike): typingsSlinky.node.cryptoMod.Decipher = js.native
  @JSImport("mz/crypto", "createDecipher")
  @js.native
  def createDecipher(algorithm: String, password: BinaryLike, options: TransformOptions): typingsSlinky.node.cryptoMod.Decipher = js.native
  /** @deprecated since v10.0.0 use `createDecipheriv()` */
  @JSImport("mz/crypto", "createDecipher")
  @js.native
  def createDecipher(algorithm: CipherCCMTypes, password: BinaryLike, options: CipherCCMOptions): DecipherCCM = js.native
  /** @deprecated since v10.0.0 use `createDecipheriv()` */
  @JSImport("mz/crypto", "createDecipher")
  @js.native
  def createDecipher(algorithm: CipherGCMTypes, password: BinaryLike): DecipherGCM = js.native
  @JSImport("mz/crypto", "createDecipher")
  @js.native
  def createDecipher(algorithm: CipherGCMTypes, password: BinaryLike, options: CipherGCMOptions): DecipherGCM = js.native
  
  @JSImport("mz/crypto", "createDecipheriv")
  @js.native
  def createDecipheriv(algorithm: String, key: CipherKey): typingsSlinky.node.cryptoMod.Decipher = js.native
  @JSImport("mz/crypto", "createDecipheriv")
  @js.native
  def createDecipheriv(algorithm: String, key: CipherKey, iv: Null, options: TransformOptions): typingsSlinky.node.cryptoMod.Decipher = js.native
  @JSImport("mz/crypto", "createDecipheriv")
  @js.native
  def createDecipheriv(algorithm: String, key: CipherKey, iv: BinaryLike): typingsSlinky.node.cryptoMod.Decipher = js.native
  @JSImport("mz/crypto", "createDecipheriv")
  @js.native
  def createDecipheriv(algorithm: String, key: CipherKey, iv: BinaryLike, options: TransformOptions): typingsSlinky.node.cryptoMod.Decipher = js.native
  @JSImport("mz/crypto", "createDecipheriv")
  @js.native
  def createDecipheriv(algorithm: CipherCCMTypes, key: CipherKey, iv: Null, options: CipherCCMOptions): DecipherCCM = js.native
  @JSImport("mz/crypto", "createDecipheriv")
  @js.native
  def createDecipheriv(algorithm: CipherCCMTypes, key: CipherKey, iv: BinaryLike, options: CipherCCMOptions): DecipherCCM = js.native
  @JSImport("mz/crypto", "createDecipheriv")
  @js.native
  def createDecipheriv(algorithm: CipherGCMTypes, key: CipherKey): DecipherGCM = js.native
  @JSImport("mz/crypto", "createDecipheriv")
  @js.native
  def createDecipheriv(algorithm: CipherGCMTypes, key: CipherKey, iv: Null, options: CipherGCMOptions): DecipherGCM = js.native
  @JSImport("mz/crypto", "createDecipheriv")
  @js.native
  def createDecipheriv(algorithm: CipherGCMTypes, key: CipherKey, iv: BinaryLike): DecipherGCM = js.native
  @JSImport("mz/crypto", "createDecipheriv")
  @js.native
  def createDecipheriv(algorithm: CipherGCMTypes, key: CipherKey, iv: BinaryLike, options: CipherGCMOptions): DecipherGCM = js.native
  
  @JSImport("mz/crypto", "createDiffieHellman")
  @js.native
  def createDiffieHellman(prime_length: Double): typingsSlinky.node.cryptoMod.DiffieHellman_ = js.native
  @JSImport("mz/crypto", "createDiffieHellman")
  @js.native
  def createDiffieHellman(prime_length: Double, generator: Double): typingsSlinky.node.cryptoMod.DiffieHellman_ = js.native
  @JSImport("mz/crypto", "createDiffieHellman")
  @js.native
  def createDiffieHellman(prime_length: Double, generator: ArrayBufferView): typingsSlinky.node.cryptoMod.DiffieHellman_ = js.native
  @JSImport("mz/crypto", "createDiffieHellman")
  @js.native
  def createDiffieHellman(prime: String, prime_encoding: HexBase64Latin1Encoding): typingsSlinky.node.cryptoMod.DiffieHellman_ = js.native
  @JSImport("mz/crypto", "createDiffieHellman")
  @js.native
  def createDiffieHellman(
    prime: String,
    prime_encoding: HexBase64Latin1Encoding,
    generator: String,
    generator_encoding: HexBase64Latin1Encoding
  ): typingsSlinky.node.cryptoMod.DiffieHellman_ = js.native
  @JSImport("mz/crypto", "createDiffieHellman")
  @js.native
  def createDiffieHellman(prime: String, prime_encoding: HexBase64Latin1Encoding, generator: Double): typingsSlinky.node.cryptoMod.DiffieHellman_ = js.native
  @JSImport("mz/crypto", "createDiffieHellman")
  @js.native
  def createDiffieHellman(prime: String, prime_encoding: HexBase64Latin1Encoding, generator: ArrayBufferView): typingsSlinky.node.cryptoMod.DiffieHellman_ = js.native
  @JSImport("mz/crypto", "createDiffieHellman")
  @js.native
  def createDiffieHellman(prime: ArrayBufferView): typingsSlinky.node.cryptoMod.DiffieHellman_ = js.native
  
  @JSImport("mz/crypto", "createECDH")
  @js.native
  def createECDH(curve_name: String): typingsSlinky.node.cryptoMod.ECDH = js.native
  
  @JSImport("mz/crypto", "createHash")
  @js.native
  def createHash(algorithm: String): typingsSlinky.node.cryptoMod.Hash = js.native
  @JSImport("mz/crypto", "createHash")
  @js.native
  def createHash(algorithm: String, options: HashOptions): typingsSlinky.node.cryptoMod.Hash = js.native
  
  @JSImport("mz/crypto", "createHmac")
  @js.native
  def createHmac(algorithm: String, key: BinaryLike): typingsSlinky.node.cryptoMod.Hmac = js.native
  @JSImport("mz/crypto", "createHmac")
  @js.native
  def createHmac(algorithm: String, key: BinaryLike, options: TransformOptions): typingsSlinky.node.cryptoMod.Hmac = js.native
  @JSImport("mz/crypto", "createHmac")
  @js.native
  def createHmac(algorithm: String, key: typingsSlinky.node.cryptoMod.KeyObject): typingsSlinky.node.cryptoMod.Hmac = js.native
  @JSImport("mz/crypto", "createHmac")
  @js.native
  def createHmac(algorithm: String, key: typingsSlinky.node.cryptoMod.KeyObject, options: TransformOptions): typingsSlinky.node.cryptoMod.Hmac = js.native
  
  @JSImport("mz/crypto", "createPrivateKey")
  @js.native
  def createPrivateKey(key: String): typingsSlinky.node.cryptoMod.KeyObject = js.native
  @JSImport("mz/crypto", "createPrivateKey")
  @js.native
  def createPrivateKey(key: Buffer): typingsSlinky.node.cryptoMod.KeyObject = js.native
  @JSImport("mz/crypto", "createPrivateKey")
  @js.native
  def createPrivateKey(key: PrivateKeyInput): typingsSlinky.node.cryptoMod.KeyObject = js.native
  
  @JSImport("mz/crypto", "createPublicKey")
  @js.native
  def createPublicKey(key: String): typingsSlinky.node.cryptoMod.KeyObject = js.native
  @JSImport("mz/crypto", "createPublicKey")
  @js.native
  def createPublicKey(key: Buffer): typingsSlinky.node.cryptoMod.KeyObject = js.native
  @JSImport("mz/crypto", "createPublicKey")
  @js.native
  def createPublicKey(key: typingsSlinky.node.cryptoMod.KeyObject): typingsSlinky.node.cryptoMod.KeyObject = js.native
  @JSImport("mz/crypto", "createPublicKey")
  @js.native
  def createPublicKey(key: PublicKeyInput): typingsSlinky.node.cryptoMod.KeyObject = js.native
  
  @JSImport("mz/crypto", "createSecretKey")
  @js.native
  def createSecretKey(key: ArrayBufferView): typingsSlinky.node.cryptoMod.KeyObject = js.native
  
  @JSImport("mz/crypto", "createSign")
  @js.native
  def createSign(algorithm: String): typingsSlinky.node.cryptoMod.Signer = js.native
  @JSImport("mz/crypto", "createSign")
  @js.native
  def createSign(algorithm: String, options: WritableOptions): typingsSlinky.node.cryptoMod.Signer = js.native
  
  @JSImport("mz/crypto", "createVerify")
  @js.native
  def createVerify(algorithm: String): typingsSlinky.node.cryptoMod.Verify_ = js.native
  @JSImport("mz/crypto", "createVerify")
  @js.native
  def createVerify(algorithm: String, options: WritableOptions): typingsSlinky.node.cryptoMod.Verify_ = js.native
  
  /**
    * Computes the Diffie-Hellman secret based on a privateKey and a publicKey.
    * Both keys must have the same asymmetricKeyType, which must be one of
    * 'dh' (for Diffie-Hellman), 'ec' (for ECDH), 'x448', or 'x25519' (for ECDH-ES).
    */
  @JSImport("mz/crypto", "diffieHellman")
  @js.native
  def diffieHellman(options: PrivateKey): Buffer = js.native
  
  /** @deprecated since v10.0.0 */
  @JSImport("mz/crypto", "fips")
  @js.native
  val fips: Boolean = js.native
  
  @JSImport("mz/crypto", "generateKeyPair")
  @js.native
  def generateKeyPair(
    `type`: dsa,
    options: DSAKeyPairKeyObjectOptions,
    callback: js.Function3[
      /* err */ js.Error | Null, 
      /* publicKey */ typingsSlinky.node.cryptoMod.KeyObject, 
      /* privateKey */ typingsSlinky.node.cryptoMod.KeyObject, 
      Unit
    ]
  ): Unit = js.native
  @JSImport("mz/crypto", "generateKeyPair")
  @js.native
  def generateKeyPair(
    `type`: dsa,
    options: DSAKeyPairOptions[der | pem, der | pem],
    callback: js.Function3[
      js.Error | Null, 
      (/* publicKey */ Buffer) | (/* publicKey */ String), 
      (/* privateKey */ Buffer) | (/* privateKey */ String), 
      Unit
    ]
  ): Unit = js.native
  @JSImport("mz/crypto", "generateKeyPair")
  @js.native
  def generateKeyPair(
    `type`: ec,
    options: ECKeyPairKeyObjectOptions,
    callback: js.Function3[
      /* err */ js.Error | Null, 
      /* publicKey */ typingsSlinky.node.cryptoMod.KeyObject, 
      /* privateKey */ typingsSlinky.node.cryptoMod.KeyObject, 
      Unit
    ]
  ): Unit = js.native
  @JSImport("mz/crypto", "generateKeyPair")
  @js.native
  def generateKeyPair(
    `type`: ec,
    options: ECKeyPairOptions[der | pem, der | pem],
    callback: js.Function3[
      js.Error | Null, 
      (/* publicKey */ Buffer) | (/* publicKey */ String), 
      (/* privateKey */ Buffer) | (/* privateKey */ String), 
      Unit
    ]
  ): Unit = js.native
  @JSImport("mz/crypto", "generateKeyPair")
  @js.native
  def generateKeyPair(
    `type`: ed25519,
    options: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ js.Error | Null, 
      /* publicKey */ typingsSlinky.node.cryptoMod.KeyObject, 
      /* privateKey */ typingsSlinky.node.cryptoMod.KeyObject, 
      Unit
    ]
  ): Unit = js.native
  @JSImport("mz/crypto", "generateKeyPair")
  @js.native
  def generateKeyPair(
    `type`: ed25519,
    options: ED25519KeyPairKeyObjectOptions,
    callback: js.Function3[
      /* err */ js.Error | Null, 
      /* publicKey */ typingsSlinky.node.cryptoMod.KeyObject, 
      /* privateKey */ typingsSlinky.node.cryptoMod.KeyObject, 
      Unit
    ]
  ): Unit = js.native
  @JSImport("mz/crypto", "generateKeyPair")
  @js.native
  def generateKeyPair(
    `type`: ed25519,
    options: ED25519KeyPairOptions[der | pem, der | pem],
    callback: js.Function3[
      js.Error | Null, 
      (/* publicKey */ Buffer) | (/* publicKey */ String), 
      (/* privateKey */ Buffer) | (/* privateKey */ String), 
      Unit
    ]
  ): Unit = js.native
  @JSImport("mz/crypto", "generateKeyPair")
  @js.native
  def generateKeyPair(
    `type`: ed448,
    options: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ js.Error | Null, 
      /* publicKey */ typingsSlinky.node.cryptoMod.KeyObject, 
      /* privateKey */ typingsSlinky.node.cryptoMod.KeyObject, 
      Unit
    ]
  ): Unit = js.native
  @JSImport("mz/crypto", "generateKeyPair")
  @js.native
  def generateKeyPair(
    `type`: ed448,
    options: ED448KeyPairKeyObjectOptions,
    callback: js.Function3[
      /* err */ js.Error | Null, 
      /* publicKey */ typingsSlinky.node.cryptoMod.KeyObject, 
      /* privateKey */ typingsSlinky.node.cryptoMod.KeyObject, 
      Unit
    ]
  ): Unit = js.native
  @JSImport("mz/crypto", "generateKeyPair")
  @js.native
  def generateKeyPair(
    `type`: ed448,
    options: ED448KeyPairOptions[der | pem, der | pem],
    callback: js.Function3[
      js.Error | Null, 
      (/* publicKey */ Buffer) | (/* publicKey */ String), 
      (/* privateKey */ Buffer) | (/* privateKey */ String), 
      Unit
    ]
  ): Unit = js.native
  @JSImport("mz/crypto", "generateKeyPair")
  @js.native
  def generateKeyPair(
    `type`: rsa,
    options: RSAKeyPairKeyObjectOptions,
    callback: js.Function3[
      /* err */ js.Error | Null, 
      /* publicKey */ typingsSlinky.node.cryptoMod.KeyObject, 
      /* privateKey */ typingsSlinky.node.cryptoMod.KeyObject, 
      Unit
    ]
  ): Unit = js.native
  @JSImport("mz/crypto", "generateKeyPair")
  @js.native
  def generateKeyPair(
    `type`: rsa,
    options: RSAKeyPairOptions[der | pem, der | pem],
    callback: js.Function3[
      js.Error | Null, 
      (/* publicKey */ Buffer) | (/* publicKey */ String), 
      (/* privateKey */ Buffer) | (/* privateKey */ String), 
      Unit
    ]
  ): Unit = js.native
  @JSImport("mz/crypto", "generateKeyPair")
  @js.native
  def generateKeyPair(
    `type`: x25519,
    options: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ js.Error | Null, 
      /* publicKey */ typingsSlinky.node.cryptoMod.KeyObject, 
      /* privateKey */ typingsSlinky.node.cryptoMod.KeyObject, 
      Unit
    ]
  ): Unit = js.native
  @JSImport("mz/crypto", "generateKeyPair")
  @js.native
  def generateKeyPair(
    `type`: x25519,
    options: X25519KeyPairKeyObjectOptions,
    callback: js.Function3[
      /* err */ js.Error | Null, 
      /* publicKey */ typingsSlinky.node.cryptoMod.KeyObject, 
      /* privateKey */ typingsSlinky.node.cryptoMod.KeyObject, 
      Unit
    ]
  ): Unit = js.native
  @JSImport("mz/crypto", "generateKeyPair")
  @js.native
  def generateKeyPair(
    `type`: x25519,
    options: X25519KeyPairOptions[der | pem, der | pem],
    callback: js.Function3[
      js.Error | Null, 
      (/* publicKey */ Buffer) | (/* publicKey */ String), 
      (/* privateKey */ Buffer) | (/* privateKey */ String), 
      Unit
    ]
  ): Unit = js.native
  @JSImport("mz/crypto", "generateKeyPair")
  @js.native
  def generateKeyPair(
    `type`: x448,
    options: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ js.Error | Null, 
      /* publicKey */ typingsSlinky.node.cryptoMod.KeyObject, 
      /* privateKey */ typingsSlinky.node.cryptoMod.KeyObject, 
      Unit
    ]
  ): Unit = js.native
  @JSImport("mz/crypto", "generateKeyPair")
  @js.native
  def generateKeyPair(
    `type`: x448,
    options: X448KeyPairKeyObjectOptions,
    callback: js.Function3[
      /* err */ js.Error | Null, 
      /* publicKey */ typingsSlinky.node.cryptoMod.KeyObject, 
      /* privateKey */ typingsSlinky.node.cryptoMod.KeyObject, 
      Unit
    ]
  ): Unit = js.native
  @JSImport("mz/crypto", "generateKeyPair")
  @js.native
  def generateKeyPair(
    `type`: x448,
    options: X448KeyPairOptions[der | pem, der | pem],
    callback: js.Function3[
      js.Error | Null, 
      (/* publicKey */ Buffer) | (/* publicKey */ String), 
      (/* privateKey */ Buffer) | (/* privateKey */ String), 
      Unit
    ]
  ): Unit = js.native
  
  @JSImport("mz/crypto", "generateKeyPairSync")
  @js.native
  def generateKeyPairSync(`type`: dsa, options: DSAKeyPairOptions[der | pem, der | pem]): KeyPairSyncResult[String, String] = js.native
  @JSImport("mz/crypto", "generateKeyPairSync")
  @js.native
  def generateKeyPairSync(`type`: ec, options: ECKeyPairOptions[der | pem, der | pem]): KeyPairSyncResult[String, String] = js.native
  @JSImport("mz/crypto", "generateKeyPairSync")
  @js.native
  def generateKeyPairSync(`type`: ed25519, options: ED25519KeyPairOptions[der | pem, der | pem]): KeyPairSyncResult[String, String] = js.native
  @JSImport("mz/crypto", "generateKeyPairSync")
  @js.native
  def generateKeyPairSync(`type`: ed448, options: ED448KeyPairOptions[der | pem, der | pem]): KeyPairSyncResult[String, String] = js.native
  @JSImport("mz/crypto", "generateKeyPairSync")
  @js.native
  def generateKeyPairSync(`type`: rsa, options: RSAKeyPairOptions[der | pem, der | pem]): KeyPairSyncResult[String, String] = js.native
  @JSImport("mz/crypto", "generateKeyPairSync")
  @js.native
  def generateKeyPairSync(`type`: x25519, options: X25519KeyPairOptions[der | pem, der | pem]): KeyPairSyncResult[String, String] = js.native
  @JSImport("mz/crypto", "generateKeyPairSync")
  @js.native
  def generateKeyPairSync(`type`: x448, options: X448KeyPairOptions[der | pem, der | pem]): KeyPairSyncResult[String, String] = js.native
  @JSImport("mz/crypto", "generateKeyPairSync")
  @js.native
  def generateKeyPairSync_dsa(`type`: dsa, options: DSAKeyPairKeyObjectOptions): KeyPairKeyObjectResult = js.native
  @JSImport("mz/crypto", "generateKeyPairSync")
  @js.native
  def generateKeyPairSync_ec(`type`: ec, options: ECKeyPairKeyObjectOptions): KeyPairKeyObjectResult = js.native
  @JSImport("mz/crypto", "generateKeyPairSync")
  @js.native
  def generateKeyPairSync_ed25519(`type`: ed25519): KeyPairKeyObjectResult = js.native
  @JSImport("mz/crypto", "generateKeyPairSync")
  @js.native
  def generateKeyPairSync_ed25519(`type`: ed25519, options: ED25519KeyPairKeyObjectOptions): KeyPairKeyObjectResult = js.native
  @JSImport("mz/crypto", "generateKeyPairSync")
  @js.native
  def generateKeyPairSync_ed448(`type`: ed448): KeyPairKeyObjectResult = js.native
  @JSImport("mz/crypto", "generateKeyPairSync")
  @js.native
  def generateKeyPairSync_ed448(`type`: ed448, options: ED448KeyPairKeyObjectOptions): KeyPairKeyObjectResult = js.native
  @JSImport("mz/crypto", "generateKeyPairSync")
  @js.native
  def generateKeyPairSync_rsa(`type`: rsa, options: RSAKeyPairKeyObjectOptions): KeyPairKeyObjectResult = js.native
  @JSImport("mz/crypto", "generateKeyPairSync")
  @js.native
  def generateKeyPairSync_x25519(`type`: x25519): KeyPairKeyObjectResult = js.native
  @JSImport("mz/crypto", "generateKeyPairSync")
  @js.native
  def generateKeyPairSync_x25519(`type`: x25519, options: X25519KeyPairKeyObjectOptions): KeyPairKeyObjectResult = js.native
  @JSImport("mz/crypto", "generateKeyPairSync")
  @js.native
  def generateKeyPairSync_x448(`type`: x448): KeyPairKeyObjectResult = js.native
  @JSImport("mz/crypto", "generateKeyPairSync")
  @js.native
  def generateKeyPairSync_x448(`type`: x448, options: X448KeyPairKeyObjectOptions): KeyPairKeyObjectResult = js.native
  
  @JSImport("mz/crypto", "getCiphers")
  @js.native
  def getCiphers(): js.Array[String] = js.native
  
  @JSImport("mz/crypto", "getCurves")
  @js.native
  def getCurves(): js.Array[String] = js.native
  
  @JSImport("mz/crypto", "getDiffieHellman")
  @js.native
  def getDiffieHellman(group_name: String): typingsSlinky.node.cryptoMod.DiffieHellman_ = js.native
  
  @JSImport("mz/crypto", "getFips")
  @js.native
  def getFips(): `1` | `0` = js.native
  
  @JSImport("mz/crypto", "getHashes")
  @js.native
  def getHashes(): js.Array[String] = js.native
  
  @JSImport("mz/crypto", "pbkdf2")
  @js.native
  def pbkdf2(password: BinaryLike, salt: BinaryLike, iterations: Double, keylen: Double, digest: String): js.Promise[Buffer] = js.native
  @JSImport("mz/crypto", "pbkdf2")
  @js.native
  def pbkdf2(
    password: BinaryLike,
    salt: BinaryLike,
    iterations: Double,
    keylen: Double,
    digest: String,
    callback: js.Function2[/* err */ js.Error | Null, /* derivedKey */ Buffer, _]
  ): Unit = js.native
  
  @JSImport("mz/crypto", "pbkdf2Sync")
  @js.native
  def pbkdf2Sync(password: BinaryLike, salt: BinaryLike, iterations: Double, keylen: Double, digest: String): Buffer = js.native
  
  @JSImport("mz/crypto", "privateDecrypt")
  @js.native
  def privateDecrypt(private_key: KeyLike, buffer: ArrayBufferView): Buffer = js.native
  @JSImport("mz/crypto", "privateDecrypt")
  @js.native
  def privateDecrypt(private_key: RsaPrivateKey, buffer: ArrayBufferView): Buffer = js.native
  
  @JSImport("mz/crypto", "privateEncrypt")
  @js.native
  def privateEncrypt(private_key: KeyLike, buffer: ArrayBufferView): Buffer = js.native
  @JSImport("mz/crypto", "privateEncrypt")
  @js.native
  def privateEncrypt(private_key: RsaPrivateKey, buffer: ArrayBufferView): Buffer = js.native
  
  @JSImport("mz/crypto", "pseudoRandomBytes")
  @js.native
  def pseudoRandomBytes(size: Double): js.Promise[Buffer] = js.native
  @JSImport("mz/crypto", "pseudoRandomBytes")
  @js.native
  def pseudoRandomBytes(size: Double, callback: js.Function2[/* err */ js.Error | Null, /* buf */ Buffer, Unit]): Unit = js.native
  
  @JSImport("mz/crypto", "publicDecrypt")
  @js.native
  def publicDecrypt(key: KeyLike, buffer: ArrayBufferView): Buffer = js.native
  @JSImport("mz/crypto", "publicDecrypt")
  @js.native
  def publicDecrypt(key: RsaPrivateKey, buffer: ArrayBufferView): Buffer = js.native
  @JSImport("mz/crypto", "publicDecrypt")
  @js.native
  def publicDecrypt(key: RsaPublicKey, buffer: ArrayBufferView): Buffer = js.native
  
  @JSImport("mz/crypto", "publicEncrypt")
  @js.native
  def publicEncrypt(key: KeyLike, buffer: ArrayBufferView): Buffer = js.native
  @JSImport("mz/crypto", "publicEncrypt")
  @js.native
  def publicEncrypt(key: RsaPrivateKey, buffer: ArrayBufferView): Buffer = js.native
  @JSImport("mz/crypto", "publicEncrypt")
  @js.native
  def publicEncrypt(key: RsaPublicKey, buffer: ArrayBufferView): Buffer = js.native
  
  @JSImport("mz/crypto", "randomBytes")
  @js.native
  def randomBytes(size: Double): js.Promise[Buffer] = js.native
  @JSImport("mz/crypto", "randomBytes")
  @js.native
  def randomBytes(size: Double, callback: js.Function2[/* err */ js.Error | Null, /* buf */ Buffer, Unit]): Unit = js.native
  
  @JSImport("mz/crypto", "randomFill")
  @js.native
  def randomFill(
    buffer: js.typedarray.DataView,
    callback: js.Function2[/* err */ js.Error | Null, /* buf */ js.typedarray.DataView, Unit]
  ): Unit = js.native
  @JSImport("mz/crypto", "randomFill")
  @js.native
  def randomFill(
    buffer: js.typedarray.DataView,
    offset: Double,
    callback: js.Function2[/* err */ js.Error | Null, /* buf */ js.typedarray.DataView, Unit]
  ): Unit = js.native
  @JSImport("mz/crypto", "randomFill")
  @js.native
  def randomFill(
    buffer: js.typedarray.DataView,
    offset: Double,
    size: Double,
    callback: js.Function2[/* err */ js.Error | Null, /* buf */ js.typedarray.DataView, Unit]
  ): Unit = js.native
  @JSImport("mz/crypto", "randomFill")
  @js.native
  def randomFill(
    buffer: js.typedarray.Float32Array,
    callback: js.Function2[/* err */ js.Error | Null, /* buf */ js.typedarray.Float32Array, Unit]
  ): Unit = js.native
  @JSImport("mz/crypto", "randomFill")
  @js.native
  def randomFill(
    buffer: js.typedarray.Float32Array,
    offset: Double,
    callback: js.Function2[/* err */ js.Error | Null, /* buf */ js.typedarray.Float32Array, Unit]
  ): Unit = js.native
  @JSImport("mz/crypto", "randomFill")
  @js.native
  def randomFill(
    buffer: js.typedarray.Float32Array,
    offset: Double,
    size: Double,
    callback: js.Function2[/* err */ js.Error | Null, /* buf */ js.typedarray.Float32Array, Unit]
  ): Unit = js.native
  @JSImport("mz/crypto", "randomFill")
  @js.native
  def randomFill(
    buffer: js.typedarray.Float64Array,
    callback: js.Function2[/* err */ js.Error | Null, /* buf */ js.typedarray.Float64Array, Unit]
  ): Unit = js.native
  @JSImport("mz/crypto", "randomFill")
  @js.native
  def randomFill(
    buffer: js.typedarray.Float64Array,
    offset: Double,
    callback: js.Function2[/* err */ js.Error | Null, /* buf */ js.typedarray.Float64Array, Unit]
  ): Unit = js.native
  @JSImport("mz/crypto", "randomFill")
  @js.native
  def randomFill(
    buffer: js.typedarray.Float64Array,
    offset: Double,
    size: Double,
    callback: js.Function2[/* err */ js.Error | Null, /* buf */ js.typedarray.Float64Array, Unit]
  ): Unit = js.native
  @JSImport("mz/crypto", "randomFill")
  @js.native
  def randomFill(
    buffer: js.typedarray.Int16Array,
    callback: js.Function2[/* err */ js.Error | Null, /* buf */ js.typedarray.Int16Array, Unit]
  ): Unit = js.native
  @JSImport("mz/crypto", "randomFill")
  @js.native
  def randomFill(
    buffer: js.typedarray.Int16Array,
    offset: Double,
    callback: js.Function2[/* err */ js.Error | Null, /* buf */ js.typedarray.Int16Array, Unit]
  ): Unit = js.native
  @JSImport("mz/crypto", "randomFill")
  @js.native
  def randomFill(
    buffer: js.typedarray.Int16Array,
    offset: Double,
    size: Double,
    callback: js.Function2[/* err */ js.Error | Null, /* buf */ js.typedarray.Int16Array, Unit]
  ): Unit = js.native
  @JSImport("mz/crypto", "randomFill")
  @js.native
  def randomFill(
    buffer: js.typedarray.Int32Array,
    callback: js.Function2[/* err */ js.Error | Null, /* buf */ js.typedarray.Int32Array, Unit]
  ): Unit = js.native
  @JSImport("mz/crypto", "randomFill")
  @js.native
  def randomFill(
    buffer: js.typedarray.Int32Array,
    offset: Double,
    callback: js.Function2[/* err */ js.Error | Null, /* buf */ js.typedarray.Int32Array, Unit]
  ): Unit = js.native
  @JSImport("mz/crypto", "randomFill")
  @js.native
  def randomFill(
    buffer: js.typedarray.Int32Array,
    offset: Double,
    size: Double,
    callback: js.Function2[/* err */ js.Error | Null, /* buf */ js.typedarray.Int32Array, Unit]
  ): Unit = js.native
  @JSImport("mz/crypto", "randomFill")
  @js.native
  def randomFill(
    buffer: js.typedarray.Int8Array,
    callback: js.Function2[/* err */ js.Error | Null, /* buf */ js.typedarray.Int8Array, Unit]
  ): Unit = js.native
  @JSImport("mz/crypto", "randomFill")
  @js.native
  def randomFill(
    buffer: js.typedarray.Int8Array,
    offset: Double,
    callback: js.Function2[/* err */ js.Error | Null, /* buf */ js.typedarray.Int8Array, Unit]
  ): Unit = js.native
  @JSImport("mz/crypto", "randomFill")
  @js.native
  def randomFill(
    buffer: js.typedarray.Int8Array,
    offset: Double,
    size: Double,
    callback: js.Function2[/* err */ js.Error | Null, /* buf */ js.typedarray.Int8Array, Unit]
  ): Unit = js.native
  @JSImport("mz/crypto", "randomFill")
  @js.native
  def randomFill(
    buffer: js.typedarray.Uint16Array,
    callback: js.Function2[/* err */ js.Error | Null, /* buf */ js.typedarray.Uint16Array, Unit]
  ): Unit = js.native
  @JSImport("mz/crypto", "randomFill")
  @js.native
  def randomFill(
    buffer: js.typedarray.Uint16Array,
    offset: Double,
    callback: js.Function2[/* err */ js.Error | Null, /* buf */ js.typedarray.Uint16Array, Unit]
  ): Unit = js.native
  @JSImport("mz/crypto", "randomFill")
  @js.native
  def randomFill(
    buffer: js.typedarray.Uint16Array,
    offset: Double,
    size: Double,
    callback: js.Function2[/* err */ js.Error | Null, /* buf */ js.typedarray.Uint16Array, Unit]
  ): Unit = js.native
  @JSImport("mz/crypto", "randomFill")
  @js.native
  def randomFill(
    buffer: js.typedarray.Uint32Array,
    callback: js.Function2[/* err */ js.Error | Null, /* buf */ js.typedarray.Uint32Array, Unit]
  ): Unit = js.native
  @JSImport("mz/crypto", "randomFill")
  @js.native
  def randomFill(
    buffer: js.typedarray.Uint32Array,
    offset: Double,
    callback: js.Function2[/* err */ js.Error | Null, /* buf */ js.typedarray.Uint32Array, Unit]
  ): Unit = js.native
  @JSImport("mz/crypto", "randomFill")
  @js.native
  def randomFill(
    buffer: js.typedarray.Uint32Array,
    offset: Double,
    size: Double,
    callback: js.Function2[/* err */ js.Error | Null, /* buf */ js.typedarray.Uint32Array, Unit]
  ): Unit = js.native
  @JSImport("mz/crypto", "randomFill")
  @js.native
  def randomFill(
    buffer: js.typedarray.Uint8Array,
    callback: js.Function2[/* err */ js.Error | Null, /* buf */ js.typedarray.Uint8Array, Unit]
  ): Unit = js.native
  @JSImport("mz/crypto", "randomFill")
  @js.native
  def randomFill(
    buffer: js.typedarray.Uint8Array,
    offset: Double,
    callback: js.Function2[/* err */ js.Error | Null, /* buf */ js.typedarray.Uint8Array, Unit]
  ): Unit = js.native
  @JSImport("mz/crypto", "randomFill")
  @js.native
  def randomFill(
    buffer: js.typedarray.Uint8Array,
    offset: Double,
    size: Double,
    callback: js.Function2[/* err */ js.Error | Null, /* buf */ js.typedarray.Uint8Array, Unit]
  ): Unit = js.native
  @JSImport("mz/crypto", "randomFill")
  @js.native
  def randomFill(
    buffer: js.typedarray.Uint8ClampedArray,
    callback: js.Function2[/* err */ js.Error | Null, /* buf */ js.typedarray.Uint8ClampedArray, Unit]
  ): Unit = js.native
  @JSImport("mz/crypto", "randomFill")
  @js.native
  def randomFill(
    buffer: js.typedarray.Uint8ClampedArray,
    offset: Double,
    callback: js.Function2[/* err */ js.Error | Null, /* buf */ js.typedarray.Uint8ClampedArray, Unit]
  ): Unit = js.native
  @JSImport("mz/crypto", "randomFill")
  @js.native
  def randomFill(
    buffer: js.typedarray.Uint8ClampedArray,
    offset: Double,
    size: Double,
    callback: js.Function2[/* err */ js.Error | Null, /* buf */ js.typedarray.Uint8ClampedArray, Unit]
  ): Unit = js.native
  
  @JSImport("mz/crypto", "randomFillSync")
  @js.native
  def randomFillSync(buffer: js.typedarray.DataView): js.typedarray.DataView = js.native
  @JSImport("mz/crypto", "randomFillSync")
  @js.native
  def randomFillSync(buffer: js.typedarray.DataView, offset: js.UndefOr[scala.Nothing], size: Double): js.typedarray.DataView = js.native
  @JSImport("mz/crypto", "randomFillSync")
  @js.native
  def randomFillSync(buffer: js.typedarray.DataView, offset: Double): js.typedarray.DataView = js.native
  @JSImport("mz/crypto", "randomFillSync")
  @js.native
  def randomFillSync(buffer: js.typedarray.DataView, offset: Double, size: Double): js.typedarray.DataView = js.native
  @JSImport("mz/crypto", "randomFillSync")
  @js.native
  def randomFillSync(buffer: js.typedarray.Float32Array): js.typedarray.Float32Array = js.native
  @JSImport("mz/crypto", "randomFillSync")
  @js.native
  def randomFillSync(buffer: js.typedarray.Float32Array, offset: js.UndefOr[scala.Nothing], size: Double): js.typedarray.Float32Array = js.native
  @JSImport("mz/crypto", "randomFillSync")
  @js.native
  def randomFillSync(buffer: js.typedarray.Float32Array, offset: Double): js.typedarray.Float32Array = js.native
  @JSImport("mz/crypto", "randomFillSync")
  @js.native
  def randomFillSync(buffer: js.typedarray.Float32Array, offset: Double, size: Double): js.typedarray.Float32Array = js.native
  @JSImport("mz/crypto", "randomFillSync")
  @js.native
  def randomFillSync(buffer: js.typedarray.Float64Array): js.typedarray.Float64Array = js.native
  @JSImport("mz/crypto", "randomFillSync")
  @js.native
  def randomFillSync(buffer: js.typedarray.Float64Array, offset: js.UndefOr[scala.Nothing], size: Double): js.typedarray.Float64Array = js.native
  @JSImport("mz/crypto", "randomFillSync")
  @js.native
  def randomFillSync(buffer: js.typedarray.Float64Array, offset: Double): js.typedarray.Float64Array = js.native
  @JSImport("mz/crypto", "randomFillSync")
  @js.native
  def randomFillSync(buffer: js.typedarray.Float64Array, offset: Double, size: Double): js.typedarray.Float64Array = js.native
  @JSImport("mz/crypto", "randomFillSync")
  @js.native
  def randomFillSync(buffer: js.typedarray.Int16Array): js.typedarray.Int16Array = js.native
  @JSImport("mz/crypto", "randomFillSync")
  @js.native
  def randomFillSync(buffer: js.typedarray.Int16Array, offset: js.UndefOr[scala.Nothing], size: Double): js.typedarray.Int16Array = js.native
  @JSImport("mz/crypto", "randomFillSync")
  @js.native
  def randomFillSync(buffer: js.typedarray.Int16Array, offset: Double): js.typedarray.Int16Array = js.native
  @JSImport("mz/crypto", "randomFillSync")
  @js.native
  def randomFillSync(buffer: js.typedarray.Int16Array, offset: Double, size: Double): js.typedarray.Int16Array = js.native
  @JSImport("mz/crypto", "randomFillSync")
  @js.native
  def randomFillSync(buffer: js.typedarray.Int32Array): js.typedarray.Int32Array = js.native
  @JSImport("mz/crypto", "randomFillSync")
  @js.native
  def randomFillSync(buffer: js.typedarray.Int32Array, offset: js.UndefOr[scala.Nothing], size: Double): js.typedarray.Int32Array = js.native
  @JSImport("mz/crypto", "randomFillSync")
  @js.native
  def randomFillSync(buffer: js.typedarray.Int32Array, offset: Double): js.typedarray.Int32Array = js.native
  @JSImport("mz/crypto", "randomFillSync")
  @js.native
  def randomFillSync(buffer: js.typedarray.Int32Array, offset: Double, size: Double): js.typedarray.Int32Array = js.native
  @JSImport("mz/crypto", "randomFillSync")
  @js.native
  def randomFillSync(buffer: js.typedarray.Int8Array): js.typedarray.Int8Array = js.native
  @JSImport("mz/crypto", "randomFillSync")
  @js.native
  def randomFillSync(buffer: js.typedarray.Int8Array, offset: js.UndefOr[scala.Nothing], size: Double): js.typedarray.Int8Array = js.native
  @JSImport("mz/crypto", "randomFillSync")
  @js.native
  def randomFillSync(buffer: js.typedarray.Int8Array, offset: Double): js.typedarray.Int8Array = js.native
  @JSImport("mz/crypto", "randomFillSync")
  @js.native
  def randomFillSync(buffer: js.typedarray.Int8Array, offset: Double, size: Double): js.typedarray.Int8Array = js.native
  @JSImport("mz/crypto", "randomFillSync")
  @js.native
  def randomFillSync(buffer: js.typedarray.Uint16Array): js.typedarray.Uint16Array = js.native
  @JSImport("mz/crypto", "randomFillSync")
  @js.native
  def randomFillSync(buffer: js.typedarray.Uint16Array, offset: js.UndefOr[scala.Nothing], size: Double): js.typedarray.Uint16Array = js.native
  @JSImport("mz/crypto", "randomFillSync")
  @js.native
  def randomFillSync(buffer: js.typedarray.Uint16Array, offset: Double): js.typedarray.Uint16Array = js.native
  @JSImport("mz/crypto", "randomFillSync")
  @js.native
  def randomFillSync(buffer: js.typedarray.Uint16Array, offset: Double, size: Double): js.typedarray.Uint16Array = js.native
  @JSImport("mz/crypto", "randomFillSync")
  @js.native
  def randomFillSync(buffer: js.typedarray.Uint32Array): js.typedarray.Uint32Array = js.native
  @JSImport("mz/crypto", "randomFillSync")
  @js.native
  def randomFillSync(buffer: js.typedarray.Uint32Array, offset: js.UndefOr[scala.Nothing], size: Double): js.typedarray.Uint32Array = js.native
  @JSImport("mz/crypto", "randomFillSync")
  @js.native
  def randomFillSync(buffer: js.typedarray.Uint32Array, offset: Double): js.typedarray.Uint32Array = js.native
  @JSImport("mz/crypto", "randomFillSync")
  @js.native
  def randomFillSync(buffer: js.typedarray.Uint32Array, offset: Double, size: Double): js.typedarray.Uint32Array = js.native
  @JSImport("mz/crypto", "randomFillSync")
  @js.native
  def randomFillSync(buffer: js.typedarray.Uint8Array): js.typedarray.Uint8Array = js.native
  @JSImport("mz/crypto", "randomFillSync")
  @js.native
  def randomFillSync(buffer: js.typedarray.Uint8Array, offset: js.UndefOr[scala.Nothing], size: Double): js.typedarray.Uint8Array = js.native
  @JSImport("mz/crypto", "randomFillSync")
  @js.native
  def randomFillSync(buffer: js.typedarray.Uint8Array, offset: Double): js.typedarray.Uint8Array = js.native
  @JSImport("mz/crypto", "randomFillSync")
  @js.native
  def randomFillSync(buffer: js.typedarray.Uint8Array, offset: Double, size: Double): js.typedarray.Uint8Array = js.native
  @JSImport("mz/crypto", "randomFillSync")
  @js.native
  def randomFillSync(buffer: js.typedarray.Uint8ClampedArray): js.typedarray.Uint8ClampedArray = js.native
  @JSImport("mz/crypto", "randomFillSync")
  @js.native
  def randomFillSync(buffer: js.typedarray.Uint8ClampedArray, offset: js.UndefOr[scala.Nothing], size: Double): js.typedarray.Uint8ClampedArray = js.native
  @JSImport("mz/crypto", "randomFillSync")
  @js.native
  def randomFillSync(buffer: js.typedarray.Uint8ClampedArray, offset: Double): js.typedarray.Uint8ClampedArray = js.native
  @JSImport("mz/crypto", "randomFillSync")
  @js.native
  def randomFillSync(buffer: js.typedarray.Uint8ClampedArray, offset: Double, size: Double): js.typedarray.Uint8ClampedArray = js.native
  
  @JSImport("mz/crypto", "randomInt")
  @js.native
  def randomInt(max: Double): Double = js.native
  @JSImport("mz/crypto", "randomInt")
  @js.native
  def randomInt(max: Double, callback: js.Function2[/* err */ js.Error | Null, /* value */ Double, Unit]): Unit = js.native
  @JSImport("mz/crypto", "randomInt")
  @js.native
  def randomInt(min: Double, max: Double): Double = js.native
  @JSImport("mz/crypto", "randomInt")
  @js.native
  def randomInt(
    min: Double,
    max: Double,
    callback: js.Function2[/* err */ js.Error | Null, /* value */ Double, Unit]
  ): Unit = js.native
  
  @JSImport("mz/crypto", "scrypt")
  @js.native
  def scrypt(
    password: BinaryLike,
    salt: BinaryLike,
    keylen: Double,
    callback: js.Function2[/* err */ js.Error | Null, /* derivedKey */ Buffer, Unit]
  ): Unit = js.native
  @JSImport("mz/crypto", "scrypt")
  @js.native
  def scrypt(
    password: BinaryLike,
    salt: BinaryLike,
    keylen: Double,
    options: ScryptOptions,
    callback: js.Function2[/* err */ js.Error | Null, /* derivedKey */ Buffer, Unit]
  ): Unit = js.native
  
  @JSImport("mz/crypto", "scryptSync")
  @js.native
  def scryptSync(password: BinaryLike, salt: BinaryLike, keylen: Double): Buffer = js.native
  @JSImport("mz/crypto", "scryptSync")
  @js.native
  def scryptSync(password: BinaryLike, salt: BinaryLike, keylen: Double, options: ScryptOptions): Buffer = js.native
  
  @JSImport("mz/crypto", "sign")
  @js.native
  def sign(algorithm: js.UndefOr[scala.Nothing], data: ArrayBufferView, key: KeyLike): Buffer = js.native
  @JSImport("mz/crypto", "sign")
  @js.native
  def sign(algorithm: js.UndefOr[scala.Nothing], data: ArrayBufferView, key: SignKeyObjectInput): Buffer = js.native
  @JSImport("mz/crypto", "sign")
  @js.native
  def sign(algorithm: js.UndefOr[scala.Nothing], data: ArrayBufferView, key: SignPrivateKeyInput): Buffer = js.native
  /**
    * Calculates and returns the signature for `data` using the given private key and
    * algorithm. If `algorithm` is `null` or `undefined`, then the algorithm is
    * dependent upon the key type (especially Ed25519 and Ed448).
    *
    * If `key` is not a [`KeyObject`][], this function behaves as if `key` had been
    * passed to [`crypto.createPrivateKey()`][].
    */
  @JSImport("mz/crypto", "sign")
  @js.native
  def sign(algorithm: String, data: ArrayBufferView, key: KeyLike): Buffer = js.native
  @JSImport("mz/crypto", "sign")
  @js.native
  def sign(algorithm: String, data: ArrayBufferView, key: SignKeyObjectInput): Buffer = js.native
  @JSImport("mz/crypto", "sign")
  @js.native
  def sign(algorithm: String, data: ArrayBufferView, key: SignPrivateKeyInput): Buffer = js.native
  @JSImport("mz/crypto", "sign")
  @js.native
  def sign(algorithm: Null, data: ArrayBufferView, key: KeyLike): Buffer = js.native
  @JSImport("mz/crypto", "sign")
  @js.native
  def sign(algorithm: Null, data: ArrayBufferView, key: SignKeyObjectInput): Buffer = js.native
  @JSImport("mz/crypto", "sign")
  @js.native
  def sign(algorithm: Null, data: ArrayBufferView, key: SignPrivateKeyInput): Buffer = js.native
  
  @JSImport("mz/crypto", "timingSafeEqual")
  @js.native
  def timingSafeEqual(a: ArrayBufferView, b: ArrayBufferView): Boolean = js.native
  
  @JSImport("mz/crypto", "verify")
  @js.native
  def verify(
    algorithm: js.UndefOr[scala.Nothing],
    data: ArrayBufferView,
    key: KeyLike,
    signature: ArrayBufferView
  ): Boolean = js.native
  @JSImport("mz/crypto", "verify")
  @js.native
  def verify(
    algorithm: js.UndefOr[scala.Nothing],
    data: ArrayBufferView,
    key: VerifyKeyObjectInput,
    signature: ArrayBufferView
  ): Boolean = js.native
  @JSImport("mz/crypto", "verify")
  @js.native
  def verify(
    algorithm: js.UndefOr[scala.Nothing],
    data: ArrayBufferView,
    key: VerifyPublicKeyInput,
    signature: ArrayBufferView
  ): Boolean = js.native
  /**
    * Calculates and returns the signature for `data` using the given private key and
    * algorithm. If `algorithm` is `null` or `undefined`, then the algorithm is
    * dependent upon the key type (especially Ed25519 and Ed448).
    *
    * If `key` is not a [`KeyObject`][], this function behaves as if `key` had been
    * passed to [`crypto.createPublicKey()`][].
    */
  @JSImport("mz/crypto", "verify")
  @js.native
  def verify(algorithm: String, data: ArrayBufferView, key: KeyLike, signature: ArrayBufferView): Boolean = js.native
  @JSImport("mz/crypto", "verify")
  @js.native
  def verify(algorithm: String, data: ArrayBufferView, key: VerifyKeyObjectInput, signature: ArrayBufferView): Boolean = js.native
  @JSImport("mz/crypto", "verify")
  @js.native
  def verify(algorithm: String, data: ArrayBufferView, key: VerifyPublicKeyInput, signature: ArrayBufferView): Boolean = js.native
  @JSImport("mz/crypto", "verify")
  @js.native
  def verify(algorithm: Null, data: ArrayBufferView, key: KeyLike, signature: ArrayBufferView): Boolean = js.native
  @JSImport("mz/crypto", "verify")
  @js.native
  def verify(algorithm: Null, data: ArrayBufferView, key: VerifyKeyObjectInput, signature: ArrayBufferView): Boolean = js.native
  @JSImport("mz/crypto", "verify")
  @js.native
  def verify(algorithm: Null, data: ArrayBufferView, key: VerifyPublicKeyInput, signature: ArrayBufferView): Boolean = js.native
}
