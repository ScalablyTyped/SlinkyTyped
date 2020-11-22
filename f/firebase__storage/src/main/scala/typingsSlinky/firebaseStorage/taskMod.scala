package typingsSlinky.firebaseStorage

import typingsSlinky.firebaseStorage.observerMod.CompleteFn
import typingsSlinky.firebaseStorage.observerMod.ErrorFn
import typingsSlinky.firebaseStorage.observerMod.Subscribe
import typingsSlinky.firebaseStorage.observerMod.Unsubscribe
import typingsSlinky.firebaseStorage.referenceMod.ReferenceCompat
import typingsSlinky.firebaseStorage.taskenumsMod.TaskEvent
import typingsSlinky.firebaseStorage.tasksnapshotMod.UploadTaskSnapshotCompat
import typingsSlinky.firebaseStorageTypes.mod.UploadTask
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@firebase/storage/dist/compat/task", JSImport.Namespace)
@js.native
object taskMod extends js.Object {
  
  @js.native
  class UploadTaskCompat protected () extends UploadTask {
    def this(_delegate: typingsSlinky.firebaseStorage.srcTaskMod.UploadTask, _ref: ReferenceCompat) = this()
    
    val _delegate: js.Any = js.native
    
    val _ref: js.Any = js.native
    
    val _snapshot: js.Any = js.native
    
    def on(
      `type`: TaskEvent,
      nextOrObserver: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify types.StorageObserver<UploadTaskSnapshotCompat> */ js.Any
    ): Unsubscribe | Subscribe[UploadTaskSnapshotCompat] = js.native
    def on(
      `type`: TaskEvent,
      nextOrObserver: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify types.StorageObserver<UploadTaskSnapshotCompat> */ js.Any,
      error: js.UndefOr[scala.Nothing],
      completed: CompleteFn
    ): Unsubscribe | Subscribe[UploadTaskSnapshotCompat] = js.native
    def on(
      `type`: TaskEvent,
      nextOrObserver: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify types.StorageObserver<UploadTaskSnapshotCompat> */ js.Any,
      error: Null,
      completed: CompleteFn
    ): Unsubscribe | Subscribe[UploadTaskSnapshotCompat] = js.native
    def on(
      `type`: TaskEvent,
      nextOrObserver: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify types.StorageObserver<UploadTaskSnapshotCompat> */ js.Any,
      error: ErrorFn
    ): Unsubscribe | Subscribe[UploadTaskSnapshotCompat] = js.native
    def on(
      `type`: TaskEvent,
      nextOrObserver: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify types.StorageObserver<UploadTaskSnapshotCompat> */ js.Any,
      error: ErrorFn,
      completed: CompleteFn
    ): Unsubscribe | Subscribe[UploadTaskSnapshotCompat] = js.native
    
    @JSName("snapshot")
    def snapshot_MUploadTaskCompat: UploadTaskSnapshotCompat = js.native
  }
}
