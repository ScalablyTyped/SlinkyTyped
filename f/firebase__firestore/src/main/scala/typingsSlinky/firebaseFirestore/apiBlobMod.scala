package typingsSlinky.firebaseFirestore

import typingsSlinky.firebaseFirestore.utilByteStringMod.ByteString
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/src/api/blob", JSImport.Namespace)
@js.native
object apiBlobMod extends js.Object {
  @js.native
  class Blob protected () extends js.Object {
    def this(byteString: ByteString) = this()
    var _byteString: ByteString = js.native
    def isEqual(other: Blob): Boolean = js.native
    def toBase64(): String = js.native
    def toUint8Array(): js.typedarray.Uint8Array = js.native
  }
  
  /* static members */
  @js.native
  object Blob extends js.Object {
    def fromBase64String(base64: String): Blob = js.native
    def fromUint8Array(array: js.typedarray.Uint8Array): Blob = js.native
  }
  
}

