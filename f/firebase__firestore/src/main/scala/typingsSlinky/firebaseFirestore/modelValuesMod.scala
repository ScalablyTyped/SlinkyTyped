package typingsSlinky.firebaseFirestore

import typingsSlinky.firebaseFirestore.anon.Nanos
import typingsSlinky.firebaseFirestore.coreDatabaseInfoMod.DatabaseId
import typingsSlinky.firebaseFirestore.firestoreProtoApiMod.ArrayValue
import typingsSlinky.firebaseFirestore.firestoreProtoApiMod.Timestamp
import typingsSlinky.firebaseFirestore.firestoreProtoApiMod.Value
import typingsSlinky.firebaseFirestore.modelDocumentKeyMod.DocumentKey
import typingsSlinky.firebaseFirestore.modelObjectValueMod.TypeOrder
import typingsSlinky.firebaseFirestore.utilByteStringMod.ByteString
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/src/model/values", JSImport.Namespace)
@js.native
object modelValuesMod extends js.Object {
  def arrayValueContains(haystack: ArrayValue, needle: Value): Boolean = js.native
  def canonicalId(value: Value): String = js.native
  def estimateByteSize(value: Value): Double = js.native
  def isArray(): /* is @firebase/firestore.anon.ArrayValueArrayValue */ Boolean = js.native
  def isArray(value: Value): /* is @firebase/firestore.anon.ArrayValueArrayValue */ Boolean = js.native
  def isDouble(): /* is @firebase/firestore.anon.DoubleValue */ Boolean = js.native
  def isDouble(value: Value): /* is @firebase/firestore.anon.DoubleValue */ Boolean = js.native
  def isInteger(): /* is @firebase/firestore.anon.IntegerValue */ Boolean = js.native
  def isInteger(value: Value): /* is @firebase/firestore.anon.IntegerValue */ Boolean = js.native
  def isMapValue(): /* is @firebase/firestore.anon.MapValueMapValue */ Boolean = js.native
  def isMapValue(value: Value): /* is @firebase/firestore.anon.MapValueMapValue */ Boolean = js.native
  def isNanValue(): /* is @firebase/firestore.anon.2 */ Boolean = js.native
  def isNanValue(value: Value): /* is @firebase/firestore.anon.2 */ Boolean = js.native
  def isNullValue(): /* is @firebase/firestore.anon.NullValue */ Boolean = js.native
  def isNullValue(value: Value): /* is @firebase/firestore.anon.NullValue */ Boolean = js.native
  def isNumber(): Boolean = js.native
  def isNumber(value: Value): Boolean = js.native
  def isReferenceValue(): /* is @firebase/firestore.anon.ReferenceValue */ Boolean = js.native
  def isReferenceValue(value: Value): /* is @firebase/firestore.anon.ReferenceValue */ Boolean = js.native
  def normalizeByteString(blob: String): ByteString = js.native
  def normalizeByteString(blob: js.typedarray.Uint8Array): ByteString = js.native
  def normalizeNumber(): Double = js.native
  def normalizeNumber(value: String): Double = js.native
  def normalizeNumber(value: Double): Double = js.native
  def normalizeTimestamp(date: Timestamp): Nanos = js.native
  def numberEquals(left: Value, right: Value): Boolean = js.native
  def refValue(databaseId: DatabaseId, key: DocumentKey): Value = js.native
  def typeOrder(value: Value): TypeOrder = js.native
  def valueCompare(left: Value, right: Value): Double = js.native
  def valueEquals(left: Value, right: Value): Boolean = js.native
}

