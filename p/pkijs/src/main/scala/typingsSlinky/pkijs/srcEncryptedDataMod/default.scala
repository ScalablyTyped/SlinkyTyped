package typingsSlinky.pkijs.srcEncryptedDataMod

import typingsSlinky.pkijs.Anon_ContentEncryptionAlgorithm
import typingsSlinky.pkijs.Anon_Password
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pkijs/src/EncryptedData", JSImport.Default)
@js.native
class default () extends EncryptedData {
  def this(params: js.Any) = this()
  /* CompleteClass */
  override var encryptedContentInfo: typingsSlinky.pkijs.srcEncryptedContentInfoMod.default = js.native
  /* CompleteClass */
  override var unprotectedAttrs: js.Array[typingsSlinky.pkijs.srcAttributeMod.default] = js.native
  /* CompleteClass */
  override var version: Double = js.native
  /**
    * Create a new CMS Encrypted Data content
    * @param {*} parameters Parameters neccessary for encryption
    */
  /* CompleteClass */
  override def decrypt(parameters: Anon_Password): js.Thenable[scala.scalajs.js.typedarray.ArrayBuffer] = js.native
  /**
    * Create a new CMS Encrypted Data content
    * @param {*} parameters Parameters neccessary for encryption
    * @returns {Promise}
    */
  /* CompleteClass */
  override def encrypt(parameters: Anon_ContentEncryptionAlgorithm): js.Thenable[scala.scalajs.js.typedarray.ArrayBuffer] = js.native
  /* CompleteClass */
  override def fromSchema(schema: js.Any): Unit = js.native
  /* CompleteClass */
  override def toJSON(): js.Any = js.native
  /* CompleteClass */
  override def toSchema(): js.Any = js.native
}

/* static members */
@JSImport("pkijs/src/EncryptedData", JSImport.Default)
@js.native
object default extends js.Object {
  /**
    * Compare values with default values for all class members
    * @param {string} memberName String name for a class member
    * @param {*} memberValue Value to compare with default value
    */
  def compareWithDefault(memberName: String, memberValue: js.Any): Boolean = js.native
  def defaultValues(memberName: String): js.Any = js.native
  def schema(): js.Any = js.native
  def schema(parameters: js.Any): js.Any = js.native
}

