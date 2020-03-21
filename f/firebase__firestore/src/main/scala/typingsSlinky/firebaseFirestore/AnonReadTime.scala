package typingsSlinky.firebaseFirestore

import typingsSlinky.firebaseFirestore.coreSnapshotVersionMod.SnapshotVersion
import typingsSlinky.firebaseFirestore.modelCollectionsMod.MaybeDocumentMap_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonReadTime extends js.Object {
  var changedDocs: MaybeDocumentMap_
  var readTime: SnapshotVersion
}

object AnonReadTime {
  @scala.inline
  def apply(changedDocs: MaybeDocumentMap_, readTime: SnapshotVersion): AnonReadTime = {
    val __obj = js.Dynamic.literal(changedDocs = changedDocs.asInstanceOf[js.Any], readTime = readTime.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonReadTime]
  }
}

