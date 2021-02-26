package typingsSlinky.firebaseStorage

import typingsSlinky.firebaseStorage.srcMetadataMod.Metadata
import typingsSlinky.firebaseStorage.srcReferenceMod.Reference
import typingsSlinky.firebaseStorage.srcTaskMod.UploadTask
import typingsSlinky.firebaseStorage.taskenumsMod.TaskState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcTasksnapshotMod {
  
  @JSImport("@firebase/storage/dist/src/tasksnapshot", "UploadTaskSnapshot")
  @js.native
  class UploadTaskSnapshot protected () extends StObject {
    def this(
      bytesTransferred: Double,
      totalBytes: Double,
      state: TaskState,
      metadata: Metadata,
      task: UploadTask,
      ref: Reference
    ) = this()
    
    val bytesTransferred: Double = js.native
    
    val metadata: Metadata = js.native
    
    val ref: Reference = js.native
    
    val state: TaskState = js.native
    
    val task: UploadTask = js.native
    
    val totalBytes: Double = js.native
  }
}
