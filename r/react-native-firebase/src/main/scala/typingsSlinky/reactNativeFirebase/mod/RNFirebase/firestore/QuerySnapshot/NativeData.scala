package typingsSlinky.reactNativeFirebase.mod.RNFirebase.firestore.QuerySnapshot

import typingsSlinky.reactNativeFirebase.mod.RNFirebase.firestore.Types.NativeDocumentChange
import typingsSlinky.reactNativeFirebase.mod.RNFirebase.firestore.Types.NativeDocumentSnapshot
import typingsSlinky.reactNativeFirebase.mod.RNFirebase.firestore.Types.SnapshotMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NativeData extends js.Object {
  var changes: js.Array[NativeDocumentChange] = js.native
  var documents: js.Array[NativeDocumentSnapshot] = js.native
  var metadata: SnapshotMetadata = js.native
}

object NativeData {
  @scala.inline
  def apply(
    changes: js.Array[NativeDocumentChange],
    documents: js.Array[NativeDocumentSnapshot],
    metadata: SnapshotMetadata
  ): NativeData = {
    val __obj = js.Dynamic.literal(changes = changes.asInstanceOf[js.Any], documents = documents.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[NativeData]
  }
  @scala.inline
  implicit class NativeDataOps[Self <: NativeData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChanges(value: js.Array[NativeDocumentChange]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("changes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDocuments(value: js.Array[NativeDocumentSnapshot]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("documents")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMetadata(value: SnapshotMetadata): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metadata")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

