package typingsSlinky.firebaseStorage

import org.scalajs.dom.raw.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/storage/dist/src/implementation/fs", JSImport.Namespace)
@js.native
object fsMod extends js.Object {
  def getBlob(args: (String | Blob | scala.scalajs.js.typedarray.ArrayBuffer)*): Blob = js.native
  def sliceBlob(blob: Blob, start: Double, end: Double): Blob | Null = js.native
}

