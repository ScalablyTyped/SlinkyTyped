package typingsSlinky.nodeForge.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object pki {
  
  type PEM = java.lang.String
  
  type PrivateKey = typingsSlinky.nodeForge.mod.pki.rsa.PrivateKey | typingsSlinky.nodeForge.mod.pki.ed25519.Key
  
  type PublicKey = typingsSlinky.nodeForge.mod.pki.rsa.PublicKey | typingsSlinky.nodeForge.mod.pki.ed25519.Key
  
  @scala.inline
  def certificateFromAsn1(obj: typingsSlinky.nodeForge.mod.asn1.Asn1): typingsSlinky.nodeForge.mod.pki.Certificate = typingsSlinky.nodeForge.mod.pki.^.asInstanceOf[js.Dynamic].applyDynamic("certificateFromAsn1")(obj.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.nodeForge.mod.pki.Certificate]
  @scala.inline
  def certificateFromAsn1(obj: typingsSlinky.nodeForge.mod.asn1.Asn1, computeHash: scala.Boolean): typingsSlinky.nodeForge.mod.pki.Certificate = (typingsSlinky.nodeForge.mod.pki.^.asInstanceOf[js.Dynamic].applyDynamic("certificateFromAsn1")(obj.asInstanceOf[js.Any], computeHash.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.nodeForge.mod.pki.Certificate]
  
  @scala.inline
  def certificateFromPem(pem: typingsSlinky.nodeForge.mod.pki.PEM): typingsSlinky.nodeForge.mod.pki.Certificate = typingsSlinky.nodeForge.mod.pki.^.asInstanceOf[js.Dynamic].applyDynamic("certificateFromPem")(pem.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.nodeForge.mod.pki.Certificate]
  @scala.inline
  def certificateFromPem(
    pem: typingsSlinky.nodeForge.mod.pki.PEM,
    computeHash: js.UndefOr[scala.Nothing],
    strict: scala.Boolean
  ): typingsSlinky.nodeForge.mod.pki.Certificate = (typingsSlinky.nodeForge.mod.pki.^.asInstanceOf[js.Dynamic].applyDynamic("certificateFromPem")(pem.asInstanceOf[js.Any], computeHash.asInstanceOf[js.Any], strict.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.nodeForge.mod.pki.Certificate]
  @scala.inline
  def certificateFromPem(pem: typingsSlinky.nodeForge.mod.pki.PEM, computeHash: scala.Boolean): typingsSlinky.nodeForge.mod.pki.Certificate = (typingsSlinky.nodeForge.mod.pki.^.asInstanceOf[js.Dynamic].applyDynamic("certificateFromPem")(pem.asInstanceOf[js.Any], computeHash.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.nodeForge.mod.pki.Certificate]
  @scala.inline
  def certificateFromPem(pem: typingsSlinky.nodeForge.mod.pki.PEM, computeHash: scala.Boolean, strict: scala.Boolean): typingsSlinky.nodeForge.mod.pki.Certificate = (typingsSlinky.nodeForge.mod.pki.^.asInstanceOf[js.Dynamic].applyDynamic("certificateFromPem")(pem.asInstanceOf[js.Any], computeHash.asInstanceOf[js.Any], strict.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.nodeForge.mod.pki.Certificate]
  
  @scala.inline
  def certificateToAsn1(cert: typingsSlinky.nodeForge.mod.pki.Certificate): typingsSlinky.nodeForge.mod.asn1.Asn1 = typingsSlinky.nodeForge.mod.pki.^.asInstanceOf[js.Dynamic].applyDynamic("certificateToAsn1")(cert.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.nodeForge.mod.asn1.Asn1]
  
  @scala.inline
  def certificateToPem(cert: typingsSlinky.nodeForge.mod.pki.Certificate): typingsSlinky.nodeForge.mod.pki.PEM = typingsSlinky.nodeForge.mod.pki.^.asInstanceOf[js.Dynamic].applyDynamic("certificateToPem")(cert.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.nodeForge.mod.pki.PEM]
  @scala.inline
  def certificateToPem(cert: typingsSlinky.nodeForge.mod.pki.Certificate, maxline: scala.Double): typingsSlinky.nodeForge.mod.pki.PEM = (typingsSlinky.nodeForge.mod.pki.^.asInstanceOf[js.Dynamic].applyDynamic("certificateToPem")(cert.asInstanceOf[js.Any], maxline.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.nodeForge.mod.pki.PEM]
  
  @scala.inline
  def certificationRequestFromPem(pem: typingsSlinky.nodeForge.mod.pki.PEM): typingsSlinky.nodeForge.mod.pki.Certificate = typingsSlinky.nodeForge.mod.pki.^.asInstanceOf[js.Dynamic].applyDynamic("certificationRequestFromPem")(pem.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.nodeForge.mod.pki.Certificate]
  @scala.inline
  def certificationRequestFromPem(
    pem: typingsSlinky.nodeForge.mod.pki.PEM,
    computeHash: js.UndefOr[scala.Nothing],
    strict: scala.Boolean
  ): typingsSlinky.nodeForge.mod.pki.Certificate = (typingsSlinky.nodeForge.mod.pki.^.asInstanceOf[js.Dynamic].applyDynamic("certificationRequestFromPem")(pem.asInstanceOf[js.Any], computeHash.asInstanceOf[js.Any], strict.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.nodeForge.mod.pki.Certificate]
  @scala.inline
  def certificationRequestFromPem(pem: typingsSlinky.nodeForge.mod.pki.PEM, computeHash: scala.Boolean): typingsSlinky.nodeForge.mod.pki.Certificate = (typingsSlinky.nodeForge.mod.pki.^.asInstanceOf[js.Dynamic].applyDynamic("certificationRequestFromPem")(pem.asInstanceOf[js.Any], computeHash.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.nodeForge.mod.pki.Certificate]
  @scala.inline
  def certificationRequestFromPem(pem: typingsSlinky.nodeForge.mod.pki.PEM, computeHash: scala.Boolean, strict: scala.Boolean): typingsSlinky.nodeForge.mod.pki.Certificate = (typingsSlinky.nodeForge.mod.pki.^.asInstanceOf[js.Dynamic].applyDynamic("certificationRequestFromPem")(pem.asInstanceOf[js.Any], computeHash.asInstanceOf[js.Any], strict.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.nodeForge.mod.pki.Certificate]
  
  @scala.inline
  def certificationRequestToPem(cert: typingsSlinky.nodeForge.mod.pki.Certificate): typingsSlinky.nodeForge.mod.pki.PEM = typingsSlinky.nodeForge.mod.pki.^.asInstanceOf[js.Dynamic].applyDynamic("certificationRequestToPem")(cert.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.nodeForge.mod.pki.PEM]
  @scala.inline
  def certificationRequestToPem(cert: typingsSlinky.nodeForge.mod.pki.Certificate, maxline: scala.Double): typingsSlinky.nodeForge.mod.pki.PEM = (typingsSlinky.nodeForge.mod.pki.^.asInstanceOf[js.Dynamic].applyDynamic("certificationRequestToPem")(cert.asInstanceOf[js.Any], maxline.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.nodeForge.mod.pki.PEM]
  
  @scala.inline
  def createCaStore(): typingsSlinky.nodeForge.mod.pki.CAStore = typingsSlinky.nodeForge.mod.pki.^.asInstanceOf[js.Dynamic].applyDynamic("createCaStore")().asInstanceOf[typingsSlinky.nodeForge.mod.pki.CAStore]
  @scala.inline
  def createCaStore(
    certs: js.Array[
      typingsSlinky.nodeForge.mod.pki.Certificate | typingsSlinky.nodeForge.mod.pki.PEM
    ]
  ): typingsSlinky.nodeForge.mod.pki.CAStore = typingsSlinky.nodeForge.mod.pki.^.asInstanceOf[js.Dynamic].applyDynamic("createCaStore")(certs.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.nodeForge.mod.pki.CAStore]
  
  @scala.inline
  def createCertificate(): typingsSlinky.nodeForge.mod.pki.Certificate = typingsSlinky.nodeForge.mod.pki.^.asInstanceOf[js.Dynamic].applyDynamic("createCertificate")().asInstanceOf[typingsSlinky.nodeForge.mod.pki.Certificate]
  
  @scala.inline
  def createCertificationRequest(): typingsSlinky.nodeForge.mod.pki.Certificate = typingsSlinky.nodeForge.mod.pki.^.asInstanceOf[js.Dynamic].applyDynamic("createCertificationRequest")().asInstanceOf[typingsSlinky.nodeForge.mod.pki.Certificate]
  
  @scala.inline
  def decryptPrivateKeyInfo(obj: typingsSlinky.nodeForge.mod.asn1.Asn1, password: java.lang.String): typingsSlinky.nodeForge.mod.asn1.Asn1 = (typingsSlinky.nodeForge.mod.pki.^.asInstanceOf[js.Dynamic].applyDynamic("decryptPrivateKeyInfo")(obj.asInstanceOf[js.Any], password.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.nodeForge.mod.asn1.Asn1]
  
  @scala.inline
  def decryptRsaPrivateKey(pem: typingsSlinky.nodeForge.mod.pki.PEM): typingsSlinky.nodeForge.mod.pki.rsa.PrivateKey = typingsSlinky.nodeForge.mod.pki.^.asInstanceOf[js.Dynamic].applyDynamic("decryptRsaPrivateKey")(pem.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.nodeForge.mod.pki.rsa.PrivateKey]
  @scala.inline
  def decryptRsaPrivateKey(pem: typingsSlinky.nodeForge.mod.pki.PEM, passphrase: java.lang.String): typingsSlinky.nodeForge.mod.pki.rsa.PrivateKey = (typingsSlinky.nodeForge.mod.pki.^.asInstanceOf[js.Dynamic].applyDynamic("decryptRsaPrivateKey")(pem.asInstanceOf[js.Any], passphrase.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.nodeForge.mod.pki.rsa.PrivateKey]
  
  @scala.inline
  def encryptPrivateKeyInfo(obj: typingsSlinky.nodeForge.mod.asn1.Asn1, password: java.lang.String): typingsSlinky.nodeForge.mod.asn1.Asn1 = (typingsSlinky.nodeForge.mod.pki.^.asInstanceOf[js.Dynamic].applyDynamic("encryptPrivateKeyInfo")(obj.asInstanceOf[js.Any], password.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.nodeForge.mod.asn1.Asn1]
  @scala.inline
  def encryptPrivateKeyInfo(
    obj: typingsSlinky.nodeForge.mod.asn1.Asn1,
    password: java.lang.String,
    options: typingsSlinky.nodeForge.mod.pki.EncryptionOptions
  ): typingsSlinky.nodeForge.mod.asn1.Asn1 = (typingsSlinky.nodeForge.mod.pki.^.asInstanceOf[js.Dynamic].applyDynamic("encryptPrivateKeyInfo")(obj.asInstanceOf[js.Any], password.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.nodeForge.mod.asn1.Asn1]
  
  @scala.inline
  def encryptRsaPrivateKey(privateKey: typingsSlinky.nodeForge.mod.pki.PrivateKey, password: java.lang.String): typingsSlinky.nodeForge.mod.pki.PEM = (typingsSlinky.nodeForge.mod.pki.^.asInstanceOf[js.Dynamic].applyDynamic("encryptRsaPrivateKey")(privateKey.asInstanceOf[js.Any], password.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.nodeForge.mod.pki.PEM]
  @scala.inline
  def encryptRsaPrivateKey(
    privateKey: typingsSlinky.nodeForge.mod.pki.PrivateKey,
    password: java.lang.String,
    options: typingsSlinky.nodeForge.mod.pki.EncryptionOptions
  ): typingsSlinky.nodeForge.mod.pki.PEM = (typingsSlinky.nodeForge.mod.pki.^.asInstanceOf[js.Dynamic].applyDynamic("encryptRsaPrivateKey")(privateKey.asInstanceOf[js.Any], password.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.nodeForge.mod.pki.PEM]
  
  @scala.inline
  def encryptedPrivateKeyFromPem(pem: typingsSlinky.nodeForge.mod.pki.PEM): typingsSlinky.nodeForge.mod.asn1.Asn1 = typingsSlinky.nodeForge.mod.pki.^.asInstanceOf[js.Dynamic].applyDynamic("encryptedPrivateKeyFromPem")(pem.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.nodeForge.mod.asn1.Asn1]
  
  @scala.inline
  def encryptedPrivateKeyToPem(obj: typingsSlinky.nodeForge.mod.asn1.Asn1): typingsSlinky.nodeForge.mod.pki.PEM = typingsSlinky.nodeForge.mod.pki.^.asInstanceOf[js.Dynamic].applyDynamic("encryptedPrivateKeyToPem")(obj.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.nodeForge.mod.pki.PEM]
  
  @scala.inline
  def getPublicKeyFingerprint(publicKey: typingsSlinky.nodeForge.mod.pki.PublicKey): typingsSlinky.nodeForge.mod.util.ByteStringBuffer = typingsSlinky.nodeForge.mod.pki.^.asInstanceOf[js.Dynamic].applyDynamic("getPublicKeyFingerprint")(publicKey.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.nodeForge.mod.util.ByteStringBuffer]
  @scala.inline
  def getPublicKeyFingerprint(
    publicKey: typingsSlinky.nodeForge.mod.pki.PublicKey,
    options: typingsSlinky.nodeForge.mod.pki.BinaryFingerprintOptions
  ): typingsSlinky.nodeForge.mod.Bytes = (typingsSlinky.nodeForge.mod.pki.^.asInstanceOf[js.Dynamic].applyDynamic("getPublicKeyFingerprint")(publicKey.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.nodeForge.mod.Bytes]
  @scala.inline
  def getPublicKeyFingerprint(
    publicKey: typingsSlinky.nodeForge.mod.pki.PublicKey,
    options: typingsSlinky.nodeForge.mod.pki.ByteBufferFingerprintOptions
  ): typingsSlinky.nodeForge.mod.util.ByteStringBuffer = (typingsSlinky.nodeForge.mod.pki.^.asInstanceOf[js.Dynamic].applyDynamic("getPublicKeyFingerprint")(publicKey.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.nodeForge.mod.util.ByteStringBuffer]
  @scala.inline
  def getPublicKeyFingerprint(
    publicKey: typingsSlinky.nodeForge.mod.pki.PublicKey,
    options: typingsSlinky.nodeForge.mod.pki.HexFingerprintOptions
  ): typingsSlinky.nodeForge.mod.Hex = (typingsSlinky.nodeForge.mod.pki.^.asInstanceOf[js.Dynamic].applyDynamic("getPublicKeyFingerprint")(publicKey.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.nodeForge.mod.Hex]
  
  @scala.inline
  def oids: typingsSlinky.nodeForge.mod.pki.oids = typingsSlinky.nodeForge.mod.pki.^.asInstanceOf[js.Dynamic].selectDynamic("oids").asInstanceOf[typingsSlinky.nodeForge.mod.pki.oids]
  type oids = org.scalablytyped.runtime.StringDictionary[java.lang.String]
  @scala.inline
  def oids_=(x: typingsSlinky.nodeForge.mod.pki.oids): scala.Unit = typingsSlinky.nodeForge.mod.pki.^.asInstanceOf[js.Dynamic].updateDynamic("oids")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def pemToDer(pem: typingsSlinky.nodeForge.mod.pki.PEM): typingsSlinky.nodeForge.mod.util.ByteStringBuffer = typingsSlinky.nodeForge.mod.pki.^.asInstanceOf[js.Dynamic].applyDynamic("pemToDer")(pem.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.nodeForge.mod.util.ByteStringBuffer]
  
  @scala.inline
  def privateKeyFromAsn1(privateKey: typingsSlinky.nodeForge.mod.asn1.Asn1): typingsSlinky.nodeForge.mod.pki.PrivateKey = typingsSlinky.nodeForge.mod.pki.^.asInstanceOf[js.Dynamic].applyDynamic("privateKeyFromAsn1")(privateKey.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.nodeForge.mod.pki.PrivateKey]
  
  @scala.inline
  def privateKeyFromPem(pem: typingsSlinky.nodeForge.mod.pki.PEM): typingsSlinky.nodeForge.mod.pki.rsa.PrivateKey = typingsSlinky.nodeForge.mod.pki.^.asInstanceOf[js.Dynamic].applyDynamic("privateKeyFromPem")(pem.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.nodeForge.mod.pki.rsa.PrivateKey]
  
  @scala.inline
  def privateKeyInfoToPem(key: typingsSlinky.nodeForge.mod.asn1.Asn1): typingsSlinky.nodeForge.mod.pki.PEM = typingsSlinky.nodeForge.mod.pki.^.asInstanceOf[js.Dynamic].applyDynamic("privateKeyInfoToPem")(key.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.nodeForge.mod.pki.PEM]
  @scala.inline
  def privateKeyInfoToPem(key: typingsSlinky.nodeForge.mod.asn1.Asn1, maxline: scala.Double): typingsSlinky.nodeForge.mod.pki.PEM = (typingsSlinky.nodeForge.mod.pki.^.asInstanceOf[js.Dynamic].applyDynamic("privateKeyInfoToPem")(key.asInstanceOf[js.Any], maxline.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.nodeForge.mod.pki.PEM]
  
  @scala.inline
  def privateKeyToAsn1(privateKey: typingsSlinky.nodeForge.mod.pki.PrivateKey): typingsSlinky.nodeForge.mod.asn1.Asn1 = typingsSlinky.nodeForge.mod.pki.^.asInstanceOf[js.Dynamic].applyDynamic("privateKeyToAsn1")(privateKey.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.nodeForge.mod.asn1.Asn1]
  
  @scala.inline
  def privateKeyToPem(key: typingsSlinky.nodeForge.mod.pki.PrivateKey): typingsSlinky.nodeForge.mod.pki.PEM = typingsSlinky.nodeForge.mod.pki.^.asInstanceOf[js.Dynamic].applyDynamic("privateKeyToPem")(key.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.nodeForge.mod.pki.PEM]
  @scala.inline
  def privateKeyToPem(key: typingsSlinky.nodeForge.mod.pki.PrivateKey, maxline: scala.Double): typingsSlinky.nodeForge.mod.pki.PEM = (typingsSlinky.nodeForge.mod.pki.^.asInstanceOf[js.Dynamic].applyDynamic("privateKeyToPem")(key.asInstanceOf[js.Any], maxline.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.nodeForge.mod.pki.PEM]
  
  @scala.inline
  def publicKeyFromAsn1(publicKey: typingsSlinky.nodeForge.mod.asn1.Asn1): typingsSlinky.nodeForge.mod.pki.PublicKey = typingsSlinky.nodeForge.mod.pki.^.asInstanceOf[js.Dynamic].applyDynamic("publicKeyFromAsn1")(publicKey.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.nodeForge.mod.pki.PublicKey]
  
  @scala.inline
  def publicKeyFromPem(pem: typingsSlinky.nodeForge.mod.pki.PEM): typingsSlinky.nodeForge.mod.pki.rsa.PublicKey = typingsSlinky.nodeForge.mod.pki.^.asInstanceOf[js.Dynamic].applyDynamic("publicKeyFromPem")(pem.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.nodeForge.mod.pki.rsa.PublicKey]
  
  @scala.inline
  def publicKeyToAsn1(publicKey: typingsSlinky.nodeForge.mod.pki.PublicKey): typingsSlinky.nodeForge.mod.asn1.Asn1 = typingsSlinky.nodeForge.mod.pki.^.asInstanceOf[js.Dynamic].applyDynamic("publicKeyToAsn1")(publicKey.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.nodeForge.mod.asn1.Asn1]
  
  @scala.inline
  def publicKeyToPem(key: typingsSlinky.nodeForge.mod.pki.PublicKey): typingsSlinky.nodeForge.mod.pki.PEM = typingsSlinky.nodeForge.mod.pki.^.asInstanceOf[js.Dynamic].applyDynamic("publicKeyToPem")(key.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.nodeForge.mod.pki.PEM]
  @scala.inline
  def publicKeyToPem(key: typingsSlinky.nodeForge.mod.pki.PublicKey, maxline: scala.Double): typingsSlinky.nodeForge.mod.pki.PEM = (typingsSlinky.nodeForge.mod.pki.^.asInstanceOf[js.Dynamic].applyDynamic("publicKeyToPem")(key.asInstanceOf[js.Any], maxline.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.nodeForge.mod.pki.PEM]
  
  @scala.inline
  def publicKeyToRSAPublicKey(publicKey: typingsSlinky.nodeForge.mod.pki.PublicKey): js.Any = typingsSlinky.nodeForge.mod.pki.^.asInstanceOf[js.Dynamic].applyDynamic("publicKeyToRSAPublicKey")(publicKey.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  @scala.inline
  def publicKeyToRSAPublicKeyPem(key: typingsSlinky.nodeForge.mod.pki.PublicKey): typingsSlinky.nodeForge.mod.pki.PEM = typingsSlinky.nodeForge.mod.pki.^.asInstanceOf[js.Dynamic].applyDynamic("publicKeyToRSAPublicKeyPem")(key.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.nodeForge.mod.pki.PEM]
  @scala.inline
  def publicKeyToRSAPublicKeyPem(key: typingsSlinky.nodeForge.mod.pki.PublicKey, maxline: scala.Double): typingsSlinky.nodeForge.mod.pki.PEM = (typingsSlinky.nodeForge.mod.pki.^.asInstanceOf[js.Dynamic].applyDynamic("publicKeyToRSAPublicKeyPem")(key.asInstanceOf[js.Any], maxline.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.nodeForge.mod.pki.PEM]
  
  type setRsaPublicKey = js.Function2[
    /* n */ typingsSlinky.nodeForge.mod.jsbn.BigInteger, 
    /* e */ typingsSlinky.nodeForge.mod.jsbn.BigInteger, 
    typingsSlinky.nodeForge.mod.pki.rsa.PublicKey
  ]
  
  @scala.inline
  def verifyCertificateChain(
    caStore: typingsSlinky.nodeForge.mod.pki.CAStore,
    chain: js.Array[typingsSlinky.nodeForge.mod.pki.Certificate]
  ): scala.Boolean = (typingsSlinky.nodeForge.mod.pki.^.asInstanceOf[js.Dynamic].applyDynamic("verifyCertificateChain")(caStore.asInstanceOf[js.Any], chain.asInstanceOf[js.Any])).asInstanceOf[scala.Boolean]
  @scala.inline
  def verifyCertificateChain(
    caStore: typingsSlinky.nodeForge.mod.pki.CAStore,
    chain: js.Array[typingsSlinky.nodeForge.mod.pki.Certificate],
    customVerifyCallback: js.Function3[
      /* verified */ scala.Boolean | java.lang.String, 
      /* depth */ scala.Double, 
      /* chain */ js.Array[typingsSlinky.nodeForge.mod.pki.Certificate], 
      scala.Boolean
    ]
  ): scala.Boolean = (typingsSlinky.nodeForge.mod.pki.^.asInstanceOf[js.Dynamic].applyDynamic("verifyCertificateChain")(caStore.asInstanceOf[js.Any], chain.asInstanceOf[js.Any], customVerifyCallback.asInstanceOf[js.Any])).asInstanceOf[scala.Boolean]
  
  @scala.inline
  def wrapRsaPrivateKey(privateKey: typingsSlinky.nodeForge.mod.asn1.Asn1): typingsSlinky.nodeForge.mod.asn1.Asn1 = typingsSlinky.nodeForge.mod.pki.^.asInstanceOf[js.Dynamic].applyDynamic("wrapRsaPrivateKey")(privateKey.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.nodeForge.mod.asn1.Asn1]
}
