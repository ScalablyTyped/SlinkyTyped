package typingsSlinky.openpgp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type Infinity = js.Any
  
  type Integer = scala.Double
  
  type NodeStream = typingsSlinky.node.streamMod.^
  
  type ReadableStream[T] = js.Any
  
  @scala.inline
  def checkString(): scala.Unit = typingsSlinky.openpgp.mod.^.asInstanceOf[js.Dynamic].applyDynamic("checkString")().asInstanceOf[scala.Unit]
  
  @scala.inline
  def convertStream(data: js.Object): js.Object = typingsSlinky.openpgp.mod.^.asInstanceOf[js.Dynamic].applyDynamic("convertStream")(data.asInstanceOf[js.Any]).asInstanceOf[js.Object]
  
  @scala.inline
  def convertStream_false(data: js.Object, streaming: typingsSlinky.openpgp.openpgpBooleans.`false`): js.Object = (typingsSlinky.openpgp.mod.^.asInstanceOf[js.Dynamic].applyDynamic("convertStream")(data.asInstanceOf[js.Any], streaming.asInstanceOf[js.Any])).asInstanceOf[js.Object]
  
  @scala.inline
  def convertStream_node(data: js.Object, streaming: typingsSlinky.openpgp.openpgpStrings.node): js.Object = (typingsSlinky.openpgp.mod.^.asInstanceOf[js.Dynamic].applyDynamic("convertStream")(data.asInstanceOf[js.Any], streaming.asInstanceOf[js.Any])).asInstanceOf[js.Object]
  
  @scala.inline
  def convertStream_web(data: js.Object, streaming: typingsSlinky.openpgp.openpgpStrings.web): js.Object = (typingsSlinky.openpgp.mod.^.asInstanceOf[js.Dynamic].applyDynamic("convertStream")(data.asInstanceOf[js.Any], streaming.asInstanceOf[js.Any])).asInstanceOf[js.Object]
  
  @scala.inline
  def convertStreams_false(obj: js.Object, streaming: typingsSlinky.openpgp.openpgpBooleans.`false`, keys: js.Array[_]): js.Object = (typingsSlinky.openpgp.mod.^.asInstanceOf[js.Dynamic].applyDynamic("convertStreams")(obj.asInstanceOf[js.Any], streaming.asInstanceOf[js.Any], keys.asInstanceOf[js.Any])).asInstanceOf[js.Object]
  
  @scala.inline
  def convertStreams_node(obj: js.Object, streaming: typingsSlinky.openpgp.openpgpStrings.node, keys: js.Array[_]): js.Object = (typingsSlinky.openpgp.mod.^.asInstanceOf[js.Dynamic].applyDynamic("convertStreams")(obj.asInstanceOf[js.Any], streaming.asInstanceOf[js.Any], keys.asInstanceOf[js.Any])).asInstanceOf[js.Object]
  
  @scala.inline
  def convertStreams_web(obj: js.Object, streaming: typingsSlinky.openpgp.openpgpStrings.web, keys: js.Array[_]): js.Object = (typingsSlinky.openpgp.mod.^.asInstanceOf[js.Dynamic].applyDynamic("convertStreams")(obj.asInstanceOf[js.Any], streaming.asInstanceOf[js.Any], keys.asInstanceOf[js.Any])).asInstanceOf[js.Object]
  
  @scala.inline
  def decrypt(options: typingsSlinky.openpgp.anon.DecryptOptionsformatbinar): js.Promise[typingsSlinky.openpgp.anon.DecryptResultdataUint8Arr] = typingsSlinky.openpgp.mod.^.asInstanceOf[js.Dynamic].applyDynamic("decrypt")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typingsSlinky.openpgp.anon.DecryptResultdataUint8Arr]]
  @scala.inline
  def decrypt(options: typingsSlinky.openpgp.anon.DecryptOptionsformatutf8): js.Promise[typingsSlinky.openpgp.anon.DecryptResultdatastringRe] = typingsSlinky.openpgp.mod.^.asInstanceOf[js.Dynamic].applyDynamic("decrypt")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typingsSlinky.openpgp.anon.DecryptResultdatastringRe]]
  @scala.inline
  def decrypt(options: typingsSlinky.openpgp.mod.DecryptOptions): js.Promise[typingsSlinky.openpgp.mod.DecryptResult] = typingsSlinky.openpgp.mod.^.asInstanceOf[js.Dynamic].applyDynamic("decrypt")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typingsSlinky.openpgp.mod.DecryptResult]]
  
  @scala.inline
  def decryptKey(privateKey: typingsSlinky.openpgp.mod.key.Key, passphrase: java.lang.String): js.Promise[typingsSlinky.openpgp.anon.KeyKey] = (typingsSlinky.openpgp.mod.^.asInstanceOf[js.Dynamic].applyDynamic("decryptKey")(privateKey.asInstanceOf[js.Any], passphrase.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsSlinky.openpgp.anon.KeyKey]]
  @scala.inline
  def decryptKey(privateKey: typingsSlinky.openpgp.mod.key.Key, passphrase: js.Array[_]): js.Promise[typingsSlinky.openpgp.anon.KeyKey] = (typingsSlinky.openpgp.mod.^.asInstanceOf[js.Dynamic].applyDynamic("decryptKey")(privateKey.asInstanceOf[js.Any], passphrase.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsSlinky.openpgp.anon.KeyKey]]
  
  @scala.inline
  def decryptSessionKeys(message: typingsSlinky.openpgp.mod.message.Message): js.Promise[js.UndefOr[js.Array[typingsSlinky.openpgp.anon.Algorithm]]] = typingsSlinky.openpgp.mod.^.asInstanceOf[js.Dynamic].applyDynamic("decryptSessionKeys")(message.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.UndefOr[js.Array[typingsSlinky.openpgp.anon.Algorithm]]]]
  @scala.inline
  def decryptSessionKeys(
    message: typingsSlinky.openpgp.mod.message.Message,
    privateKeys: js.UndefOr[scala.Nothing],
    passwords: java.lang.String
  ): js.Promise[js.UndefOr[js.Array[typingsSlinky.openpgp.anon.Algorithm]]] = (typingsSlinky.openpgp.mod.^.asInstanceOf[js.Dynamic].applyDynamic("decryptSessionKeys")(message.asInstanceOf[js.Any], privateKeys.asInstanceOf[js.Any], passwords.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.UndefOr[js.Array[typingsSlinky.openpgp.anon.Algorithm]]]]
  @scala.inline
  def decryptSessionKeys(
    message: typingsSlinky.openpgp.mod.message.Message,
    privateKeys: js.UndefOr[scala.Nothing],
    passwords: js.Array[java.lang.String]
  ): js.Promise[js.UndefOr[js.Array[typingsSlinky.openpgp.anon.Algorithm]]] = (typingsSlinky.openpgp.mod.^.asInstanceOf[js.Dynamic].applyDynamic("decryptSessionKeys")(message.asInstanceOf[js.Any], privateKeys.asInstanceOf[js.Any], passwords.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.UndefOr[js.Array[typingsSlinky.openpgp.anon.Algorithm]]]]
  @scala.inline
  def decryptSessionKeys(
    message: typingsSlinky.openpgp.mod.message.Message,
    privateKeys: js.Array[typingsSlinky.openpgp.mod.key.Key]
  ): js.Promise[js.UndefOr[js.Array[typingsSlinky.openpgp.anon.Algorithm]]] = (typingsSlinky.openpgp.mod.^.asInstanceOf[js.Dynamic].applyDynamic("decryptSessionKeys")(message.asInstanceOf[js.Any], privateKeys.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.UndefOr[js.Array[typingsSlinky.openpgp.anon.Algorithm]]]]
  @scala.inline
  def decryptSessionKeys(
    message: typingsSlinky.openpgp.mod.message.Message,
    privateKeys: js.Array[typingsSlinky.openpgp.mod.key.Key],
    passwords: java.lang.String
  ): js.Promise[js.UndefOr[js.Array[typingsSlinky.openpgp.anon.Algorithm]]] = (typingsSlinky.openpgp.mod.^.asInstanceOf[js.Dynamic].applyDynamic("decryptSessionKeys")(message.asInstanceOf[js.Any], privateKeys.asInstanceOf[js.Any], passwords.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.UndefOr[js.Array[typingsSlinky.openpgp.anon.Algorithm]]]]
  @scala.inline
  def decryptSessionKeys(
    message: typingsSlinky.openpgp.mod.message.Message,
    privateKeys: js.Array[typingsSlinky.openpgp.mod.key.Key],
    passwords: js.Array[java.lang.String]
  ): js.Promise[js.UndefOr[js.Array[typingsSlinky.openpgp.anon.Algorithm]]] = (typingsSlinky.openpgp.mod.^.asInstanceOf[js.Dynamic].applyDynamic("decryptSessionKeys")(message.asInstanceOf[js.Any], privateKeys.asInstanceOf[js.Any], passwords.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.UndefOr[js.Array[typingsSlinky.openpgp.anon.Algorithm]]]]
  @scala.inline
  def decryptSessionKeys(message: typingsSlinky.openpgp.mod.message.Message, privateKeys: typingsSlinky.openpgp.mod.key.Key): js.Promise[js.UndefOr[js.Array[typingsSlinky.openpgp.anon.Algorithm]]] = (typingsSlinky.openpgp.mod.^.asInstanceOf[js.Dynamic].applyDynamic("decryptSessionKeys")(message.asInstanceOf[js.Any], privateKeys.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.UndefOr[js.Array[typingsSlinky.openpgp.anon.Algorithm]]]]
  @scala.inline
  def decryptSessionKeys(
    message: typingsSlinky.openpgp.mod.message.Message,
    privateKeys: typingsSlinky.openpgp.mod.key.Key,
    passwords: java.lang.String
  ): js.Promise[js.UndefOr[js.Array[typingsSlinky.openpgp.anon.Algorithm]]] = (typingsSlinky.openpgp.mod.^.asInstanceOf[js.Dynamic].applyDynamic("decryptSessionKeys")(message.asInstanceOf[js.Any], privateKeys.asInstanceOf[js.Any], passwords.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.UndefOr[js.Array[typingsSlinky.openpgp.anon.Algorithm]]]]
  @scala.inline
  def decryptSessionKeys(
    message: typingsSlinky.openpgp.mod.message.Message,
    privateKeys: typingsSlinky.openpgp.mod.key.Key,
    passwords: js.Array[java.lang.String]
  ): js.Promise[js.UndefOr[js.Array[typingsSlinky.openpgp.anon.Algorithm]]] = (typingsSlinky.openpgp.mod.^.asInstanceOf[js.Dynamic].applyDynamic("decryptSessionKeys")(message.asInstanceOf[js.Any], privateKeys.asInstanceOf[js.Any], passwords.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.UndefOr[js.Array[typingsSlinky.openpgp.anon.Algorithm]]]]
  
  @scala.inline
  def destroyWorker(): scala.Unit = typingsSlinky.openpgp.mod.^.asInstanceOf[js.Dynamic].applyDynamic("destroyWorker")().asInstanceOf[scala.Unit]
  
  @scala.inline
  def encrypt(options: typingsSlinky.openpgp.anon.EncryptOptionsarmorfalsed): js.Promise[typingsSlinky.openpgp.anon.EncryptResultmessageMessa] = typingsSlinky.openpgp.mod.^.asInstanceOf[js.Dynamic].applyDynamic("encrypt")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typingsSlinky.openpgp.anon.EncryptResultmessageMessa]]
  @scala.inline
  def encrypt(options: typingsSlinky.openpgp.anon.EncryptOptionsarmorfalsedArmor): js.Promise[typingsSlinky.openpgp.anon.EncryptResultmessageMessaMessage] = typingsSlinky.openpgp.mod.^.asInstanceOf[js.Dynamic].applyDynamic("encrypt")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typingsSlinky.openpgp.anon.EncryptResultmessageMessaMessage]]
  @scala.inline
  def encrypt(options: typingsSlinky.openpgp.anon.EncryptOptionsarmortrueun): js.Promise[typingsSlinky.openpgp.anon.EncryptResultdatastring] = typingsSlinky.openpgp.mod.^.asInstanceOf[js.Dynamic].applyDynamic("encrypt")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typingsSlinky.openpgp.anon.EncryptResultdatastring]]
  @scala.inline
  def encrypt(options: typingsSlinky.openpgp.anon.EncryptOptionsarmortrueunArmor): js.Promise[typingsSlinky.openpgp.anon.EncryptResultdatastringsi] = typingsSlinky.openpgp.mod.^.asInstanceOf[js.Dynamic].applyDynamic("encrypt")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typingsSlinky.openpgp.anon.EncryptResultdatastringsi]]
  @scala.inline
  def encrypt(options: typingsSlinky.openpgp.mod.EncryptOptions): js.Promise[typingsSlinky.openpgp.anon.EncryptResultdatastringRe] = typingsSlinky.openpgp.mod.^.asInstanceOf[js.Dynamic].applyDynamic("encrypt")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typingsSlinky.openpgp.anon.EncryptResultdatastringRe]]
  
  @scala.inline
  def encryptKey(privateKey: typingsSlinky.openpgp.mod.key.Key, passphrase: java.lang.String): js.Promise[typingsSlinky.openpgp.anon.KeyKey] = (typingsSlinky.openpgp.mod.^.asInstanceOf[js.Dynamic].applyDynamic("encryptKey")(privateKey.asInstanceOf[js.Any], passphrase.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsSlinky.openpgp.anon.KeyKey]]
  @scala.inline
  def encryptKey(privateKey: typingsSlinky.openpgp.mod.key.Key, passphrase: js.Array[_]): js.Promise[typingsSlinky.openpgp.anon.KeyKey] = (typingsSlinky.openpgp.mod.^.asInstanceOf[js.Dynamic].applyDynamic("encryptKey")(privateKey.asInstanceOf[js.Any], passphrase.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsSlinky.openpgp.anon.KeyKey]]
  
  @scala.inline
  def encryptSessionKey(
    data: js.typedarray.Uint8Array,
    algorithm: java.lang.String,
    aeadAlgorithm: js.UndefOr[java.lang.String],
    publicKeys: js.UndefOr[typingsSlinky.openpgp.mod.key.Key | js.Array[typingsSlinky.openpgp.mod.key.Key]],
    passwords: js.UndefOr[java.lang.String | js.Array[java.lang.String]],
    wildcard: js.UndefOr[scala.Boolean],
    date: js.UndefOr[js.Date],
    toUserIds: js.UndefOr[js.Array[_]]
  ): js.Promise[typingsSlinky.openpgp.mod.message.Message] = (typingsSlinky.openpgp.mod.^.asInstanceOf[js.Dynamic].applyDynamic("encryptSessionKey")(data.asInstanceOf[js.Any], algorithm.asInstanceOf[js.Any], aeadAlgorithm.asInstanceOf[js.Any], publicKeys.asInstanceOf[js.Any], passwords.asInstanceOf[js.Any], wildcard.asInstanceOf[js.Any], date.asInstanceOf[js.Any], toUserIds.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsSlinky.openpgp.mod.message.Message]]
  
  @scala.inline
  def generateKey(option: typingsSlinky.openpgp.mod.KeyOptions): js.Promise[typingsSlinky.openpgp.anon.Key] = typingsSlinky.openpgp.mod.^.asInstanceOf[js.Dynamic].applyDynamic("generateKey")(option.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typingsSlinky.openpgp.anon.Key]]
  
  @scala.inline
  def getWorker(): typingsSlinky.openpgp.mod.worker.asyncProxy.AsyncProxy | scala.Null = typingsSlinky.openpgp.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getWorker")().asInstanceOf[typingsSlinky.openpgp.mod.worker.asyncProxy.AsyncProxy | scala.Null]
  
  @scala.inline
  def initWorker(options: typingsSlinky.openpgp.mod.WorkerOptions): scala.Unit = typingsSlinky.openpgp.mod.^.asInstanceOf[js.Dynamic].applyDynamic("initWorker")(options.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  
  @scala.inline
  def linkStreams(
    result: js.Object,
    message: typingsSlinky.openpgp.mod.message.Message,
    erroringStream: typingsSlinky.openpgp.mod.ReadableStream[java.lang.String]
  ): js.Object = (typingsSlinky.openpgp.mod.^.asInstanceOf[js.Dynamic].applyDynamic("linkStreams")(result.asInstanceOf[js.Any], message.asInstanceOf[js.Any], erroringStream.asInstanceOf[js.Any])).asInstanceOf[js.Object]
  
  @scala.inline
  def nativeAEAD(): scala.Boolean = typingsSlinky.openpgp.mod.^.asInstanceOf[js.Dynamic].applyDynamic("nativeAEAD")().asInstanceOf[scala.Boolean]
  
  @scala.inline
  def onError(message: java.lang.String, error: js.Error): scala.Unit = (typingsSlinky.openpgp.mod.^.asInstanceOf[js.Dynamic].applyDynamic("onError")(message.asInstanceOf[js.Any], error.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def prepareSignatures(signatures: js.Object): scala.Unit = typingsSlinky.openpgp.mod.^.asInstanceOf[js.Dynamic].applyDynamic("prepareSignatures")(signatures.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  
  @scala.inline
  def reformatKey(privateKey: typingsSlinky.openpgp.mod.key.Key, userIds: js.Array[_]): js.Promise[js.Object] = (typingsSlinky.openpgp.mod.^.asInstanceOf[js.Dynamic].applyDynamic("reformatKey")(privateKey.asInstanceOf[js.Any], userIds.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Object]]
  @scala.inline
  def reformatKey(
    privateKey: typingsSlinky.openpgp.mod.key.Key,
    userIds: js.Array[_],
    passphrase: js.UndefOr[scala.Nothing],
    keyExpirationTime: js.UndefOr[scala.Nothing],
    revocationCertificate: scala.Boolean
  ): js.Promise[js.Object] = (typingsSlinky.openpgp.mod.^.asInstanceOf[js.Dynamic].applyDynamic("reformatKey")(privateKey.asInstanceOf[js.Any], userIds.asInstanceOf[js.Any], passphrase.asInstanceOf[js.Any], keyExpirationTime.asInstanceOf[js.Any], revocationCertificate.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Object]]
  @scala.inline
  def reformatKey(
    privateKey: typingsSlinky.openpgp.mod.key.Key,
    userIds: js.Array[_],
    passphrase: js.UndefOr[scala.Nothing],
    keyExpirationTime: scala.Double
  ): js.Promise[js.Object] = (typingsSlinky.openpgp.mod.^.asInstanceOf[js.Dynamic].applyDynamic("reformatKey")(privateKey.asInstanceOf[js.Any], userIds.asInstanceOf[js.Any], passphrase.asInstanceOf[js.Any], keyExpirationTime.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Object]]
  @scala.inline
  def reformatKey(
    privateKey: typingsSlinky.openpgp.mod.key.Key,
    userIds: js.Array[_],
    passphrase: js.UndefOr[scala.Nothing],
    keyExpirationTime: scala.Double,
    revocationCertificate: scala.Boolean
  ): js.Promise[js.Object] = (typingsSlinky.openpgp.mod.^.asInstanceOf[js.Dynamic].applyDynamic("reformatKey")(privateKey.asInstanceOf[js.Any], userIds.asInstanceOf[js.Any], passphrase.asInstanceOf[js.Any], keyExpirationTime.asInstanceOf[js.Any], revocationCertificate.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Object]]
  @scala.inline
  def reformatKey(privateKey: typingsSlinky.openpgp.mod.key.Key, userIds: js.Array[_], passphrase: java.lang.String): js.Promise[js.Object] = (typingsSlinky.openpgp.mod.^.asInstanceOf[js.Dynamic].applyDynamic("reformatKey")(privateKey.asInstanceOf[js.Any], userIds.asInstanceOf[js.Any], passphrase.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Object]]
  @scala.inline
  def reformatKey(
    privateKey: typingsSlinky.openpgp.mod.key.Key,
    userIds: js.Array[_],
    passphrase: java.lang.String,
    keyExpirationTime: js.UndefOr[scala.Nothing],
    revocationCertificate: scala.Boolean
  ): js.Promise[js.Object] = (typingsSlinky.openpgp.mod.^.asInstanceOf[js.Dynamic].applyDynamic("reformatKey")(privateKey.asInstanceOf[js.Any], userIds.asInstanceOf[js.Any], passphrase.asInstanceOf[js.Any], keyExpirationTime.asInstanceOf[js.Any], revocationCertificate.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Object]]
  @scala.inline
  def reformatKey(
    privateKey: typingsSlinky.openpgp.mod.key.Key,
    userIds: js.Array[_],
    passphrase: java.lang.String,
    keyExpirationTime: scala.Double
  ): js.Promise[js.Object] = (typingsSlinky.openpgp.mod.^.asInstanceOf[js.Dynamic].applyDynamic("reformatKey")(privateKey.asInstanceOf[js.Any], userIds.asInstanceOf[js.Any], passphrase.asInstanceOf[js.Any], keyExpirationTime.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Object]]
  @scala.inline
  def reformatKey(
    privateKey: typingsSlinky.openpgp.mod.key.Key,
    userIds: js.Array[_],
    passphrase: java.lang.String,
    keyExpirationTime: scala.Double,
    revocationCertificate: scala.Boolean
  ): js.Promise[js.Object] = (typingsSlinky.openpgp.mod.^.asInstanceOf[js.Dynamic].applyDynamic("reformatKey")(privateKey.asInstanceOf[js.Any], userIds.asInstanceOf[js.Any], passphrase.asInstanceOf[js.Any], keyExpirationTime.asInstanceOf[js.Any], revocationCertificate.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Object]]
  
  @scala.inline
  def revokeKey(): js.Promise[typingsSlinky.openpgp.anon.PrivateKey | typingsSlinky.openpgp.anon.PublicKey] = typingsSlinky.openpgp.mod.^.asInstanceOf[js.Dynamic].applyDynamic("revokeKey")().asInstanceOf[js.Promise[typingsSlinky.openpgp.anon.PrivateKey | typingsSlinky.openpgp.anon.PublicKey]]
  @scala.inline
  def revokeKey(
    key: js.UndefOr[scala.Nothing],
    revocationCertificate: js.UndefOr[scala.Nothing],
    reasonForRevocation: typingsSlinky.openpgp.mod.revokeKeyReasonForRevocation
  ): js.Promise[typingsSlinky.openpgp.anon.PrivateKey | typingsSlinky.openpgp.anon.PublicKey] = (typingsSlinky.openpgp.mod.^.asInstanceOf[js.Dynamic].applyDynamic("revokeKey")(key.asInstanceOf[js.Any], revocationCertificate.asInstanceOf[js.Any], reasonForRevocation.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsSlinky.openpgp.anon.PrivateKey | typingsSlinky.openpgp.anon.PublicKey]]
  @scala.inline
  def revokeKey(key: js.UndefOr[scala.Nothing], revocationCertificate: java.lang.String): js.Promise[typingsSlinky.openpgp.anon.PrivateKey | typingsSlinky.openpgp.anon.PublicKey] = (typingsSlinky.openpgp.mod.^.asInstanceOf[js.Dynamic].applyDynamic("revokeKey")(key.asInstanceOf[js.Any], revocationCertificate.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsSlinky.openpgp.anon.PrivateKey | typingsSlinky.openpgp.anon.PublicKey]]
  @scala.inline
  def revokeKey(
    key: js.UndefOr[scala.Nothing],
    revocationCertificate: java.lang.String,
    reasonForRevocation: typingsSlinky.openpgp.mod.revokeKeyReasonForRevocation
  ): js.Promise[typingsSlinky.openpgp.anon.PrivateKey | typingsSlinky.openpgp.anon.PublicKey] = (typingsSlinky.openpgp.mod.^.asInstanceOf[js.Dynamic].applyDynamic("revokeKey")(key.asInstanceOf[js.Any], revocationCertificate.asInstanceOf[js.Any], reasonForRevocation.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsSlinky.openpgp.anon.PrivateKey | typingsSlinky.openpgp.anon.PublicKey]]
  @scala.inline
  def revokeKey(key: typingsSlinky.openpgp.mod.key.Key): js.Promise[typingsSlinky.openpgp.anon.PrivateKey | typingsSlinky.openpgp.anon.PublicKey] = typingsSlinky.openpgp.mod.^.asInstanceOf[js.Dynamic].applyDynamic("revokeKey")(key.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typingsSlinky.openpgp.anon.PrivateKey | typingsSlinky.openpgp.anon.PublicKey]]
  @scala.inline
  def revokeKey(
    key: typingsSlinky.openpgp.mod.key.Key,
    revocationCertificate: js.UndefOr[scala.Nothing],
    reasonForRevocation: typingsSlinky.openpgp.mod.revokeKeyReasonForRevocation
  ): js.Promise[typingsSlinky.openpgp.anon.PrivateKey | typingsSlinky.openpgp.anon.PublicKey] = (typingsSlinky.openpgp.mod.^.asInstanceOf[js.Dynamic].applyDynamic("revokeKey")(key.asInstanceOf[js.Any], revocationCertificate.asInstanceOf[js.Any], reasonForRevocation.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsSlinky.openpgp.anon.PrivateKey | typingsSlinky.openpgp.anon.PublicKey]]
  @scala.inline
  def revokeKey(key: typingsSlinky.openpgp.mod.key.Key, revocationCertificate: java.lang.String): js.Promise[typingsSlinky.openpgp.anon.PrivateKey | typingsSlinky.openpgp.anon.PublicKey] = (typingsSlinky.openpgp.mod.^.asInstanceOf[js.Dynamic].applyDynamic("revokeKey")(key.asInstanceOf[js.Any], revocationCertificate.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsSlinky.openpgp.anon.PrivateKey | typingsSlinky.openpgp.anon.PublicKey]]
  @scala.inline
  def revokeKey(
    key: typingsSlinky.openpgp.mod.key.Key,
    revocationCertificate: java.lang.String,
    reasonForRevocation: typingsSlinky.openpgp.mod.revokeKeyReasonForRevocation
  ): js.Promise[typingsSlinky.openpgp.anon.PrivateKey | typingsSlinky.openpgp.anon.PublicKey] = (typingsSlinky.openpgp.mod.^.asInstanceOf[js.Dynamic].applyDynamic("revokeKey")(key.asInstanceOf[js.Any], revocationCertificate.asInstanceOf[js.Any], reasonForRevocation.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsSlinky.openpgp.anon.PrivateKey | typingsSlinky.openpgp.anon.PublicKey]]
  
  @scala.inline
  def sign(options: typingsSlinky.openpgp.anon.SignOptionsarmorfalsedeta): js.Promise[typingsSlinky.openpgp.anon.Message] = typingsSlinky.openpgp.mod.^.asInstanceOf[js.Dynamic].applyDynamic("sign")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typingsSlinky.openpgp.anon.Message]]
  @scala.inline
  def sign(options: typingsSlinky.openpgp.anon.SignOptionsarmorfalsedetaArmor): js.Promise[typingsSlinky.openpgp.anon.SignatureSignature] = typingsSlinky.openpgp.mod.^.asInstanceOf[js.Dynamic].applyDynamic("sign")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typingsSlinky.openpgp.anon.SignatureSignature]]
  @scala.inline
  def sign(options: typingsSlinky.openpgp.anon.SignOptionsarmortrueundef): js.Promise[typingsSlinky.openpgp.anon.Data] = typingsSlinky.openpgp.mod.^.asInstanceOf[js.Dynamic].applyDynamic("sign")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typingsSlinky.openpgp.anon.Data]]
  @scala.inline
  def sign(options: typingsSlinky.openpgp.anon.SignOptionsarmortrueundefArmor): js.Promise[typingsSlinky.openpgp.anon.Signature] = typingsSlinky.openpgp.mod.^.asInstanceOf[js.Dynamic].applyDynamic("sign")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typingsSlinky.openpgp.anon.Signature]]
  @scala.inline
  def sign(options: typingsSlinky.openpgp.mod.SignOptions): js.Promise[typingsSlinky.openpgp.mod.SignResult] = typingsSlinky.openpgp.mod.^.asInstanceOf[js.Dynamic].applyDynamic("sign")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typingsSlinky.openpgp.mod.SignResult]]
  
  @scala.inline
  def toArray(param: js.Object): js.UndefOr[js.Array[_]] = typingsSlinky.openpgp.mod.^.asInstanceOf[js.Dynamic].applyDynamic("toArray")(param.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[js.Array[_]]]
  
  @scala.inline
  def verify(options: typingsSlinky.openpgp.mod.VerifyOptions): js.Promise[typingsSlinky.openpgp.mod.VerifyResult] = typingsSlinky.openpgp.mod.^.asInstanceOf[js.Dynamic].applyDynamic("verify")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typingsSlinky.openpgp.mod.VerifyResult]]
}
