package typingsSlinky.firebaseStorage

import org.scalajs.dom.raw.Blob
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fsMod {
  
  @JSImport("@firebase/storage/dist/src/implementation/fs", "getBlob")
  @js.native
  def getBlob(args: (String | Blob | js.typedarray.ArrayBuffer)*): Blob = js.native
  
  @JSImport("@firebase/storage/dist/src/implementation/fs", "sliceBlob")
  @js.native
  def sliceBlob(blob: Blob, start: Double, end: Double): Blob | Null = js.native
}
