package typingsSlinky.firebaseStorage.expMod

import org.scalajs.dom.raw.Blob
import typingsSlinky.firebaseStorage.srcMetadataMod.Metadata
import typingsSlinky.firebaseStorage.srcReferenceMod.Reference
import typingsSlinky.firebaseStorage.srcTaskMod.UploadTask
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@firebase/storage/dist/exp", "uploadBytesResumable")
@js.native
object uploadBytesResumable extends js.Object {
  
  def apply(ref: Reference, data: js.typedarray.ArrayBuffer): UploadTask = js.native
  def apply(ref: Reference, data: js.typedarray.ArrayBuffer, metadata: Metadata): UploadTask = js.native
  def apply(ref: Reference, data: Blob): UploadTask = js.native
  def apply(ref: Reference, data: Blob, metadata: Metadata): UploadTask = js.native
  def apply(ref: Reference, data: js.typedarray.Uint8Array): UploadTask = js.native
  def apply(ref: Reference, data: js.typedarray.Uint8Array, metadata: Metadata): UploadTask = js.native
}
