package typingsSlinky.firebaseFirestore

import typingsSlinky.firebaseFirestore.collectionsMod.MaybeDocumentMap_
import typingsSlinky.firebaseFirestore.snapshotVersionMod.SnapshotVersion
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonChangedDocs extends js.Object {
  var changedDocs: MaybeDocumentMap_
  var readTime: SnapshotVersion
}

object AnonChangedDocs {
  @scala.inline
  def apply(changedDocs: MaybeDocumentMap_, readTime: SnapshotVersion): AnonChangedDocs = {
    val __obj = js.Dynamic.literal(changedDocs = changedDocs.asInstanceOf[js.Any], readTime = readTime.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonChangedDocs]
  }
}

