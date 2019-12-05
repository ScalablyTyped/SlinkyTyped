package typingsSlinky.atFirebaseFirestore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object distSrcModelCollectionsMod {
  import typingsSlinky.atFirebaseFirestore.distSrcCoreSnapshotUnderscoreVersionMod.SnapshotVersion
  import typingsSlinky.atFirebaseFirestore.distSrcCoreTypesMod.TargetId
  import typingsSlinky.atFirebaseFirestore.distSrcModelDocumentMod.Document
  import typingsSlinky.atFirebaseFirestore.distSrcModelDocumentMod.MaybeDocument
  import typingsSlinky.atFirebaseFirestore.distSrcModelDocumentUnderscoreKeyMod.DocumentKey
  import typingsSlinky.atFirebaseFirestore.distSrcUtilSortedUnderscoreMapMod.SortedMap
  import typingsSlinky.atFirebaseFirestore.distSrcUtilSortedUnderscoreSetMod.SortedSet

  type DocumentKeySet = SortedSet[DocumentKey]
  type DocumentMap = SortedMap[DocumentKey, Document]
  type DocumentVersionMap = SortedMap[DocumentKey, SnapshotVersion]
  type MaybeDocumentMap = SortedMap[DocumentKey, MaybeDocument]
  type NullableMaybeDocumentMap = SortedMap[DocumentKey, MaybeDocument | Null]
  type TargetIdSet = SortedSet[TargetId]
}
