package typingsSlinky.atFirebaseFirestore

import typingsSlinky.atFirebaseFirestore.distSrcCoreSnapshotUnderscoreVersionMod.SnapshotVersion
import typingsSlinky.atFirebaseFirestore.distSrcModelDocumentMod.MaybeDocument
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ChangedDoc extends js.Object {
  var changedDoc: js.UndefOr[MaybeDocument] = js.undefined
  var readTime: SnapshotVersion
}

object Anon_ChangedDoc {
  @scala.inline
  def apply(readTime: SnapshotVersion, changedDoc: MaybeDocument = null): Anon_ChangedDoc = {
    val __obj = js.Dynamic.literal(readTime = readTime.asInstanceOf[js.Any])
    if (changedDoc != null) __obj.updateDynamic("changedDoc")(changedDoc.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ChangedDoc]
  }
}

