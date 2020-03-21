package typingsSlinky.firebaseFirestore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object collectionsMod {
  type DocumentKeySet_ = typingsSlinky.firebaseFirestore.sortedSetMod.SortedSet[typingsSlinky.firebaseFirestore.documentKeyMod.DocumentKey]
  type DocumentMap_ = typingsSlinky.firebaseFirestore.sortedMapMod.SortedMap[
    typingsSlinky.firebaseFirestore.documentKeyMod.DocumentKey, 
    typingsSlinky.firebaseFirestore.documentMod.Document
  ]
  type DocumentVersionMap_ = typingsSlinky.firebaseFirestore.sortedMapMod.SortedMap[
    typingsSlinky.firebaseFirestore.documentKeyMod.DocumentKey, 
    typingsSlinky.firebaseFirestore.snapshotVersionMod.SnapshotVersion
  ]
  type MaybeDocumentMap_ = typingsSlinky.firebaseFirestore.sortedMapMod.SortedMap[
    typingsSlinky.firebaseFirestore.documentKeyMod.DocumentKey, 
    typingsSlinky.firebaseFirestore.documentMod.MaybeDocument
  ]
  type NullableMaybeDocumentMap_ = typingsSlinky.firebaseFirestore.sortedMapMod.SortedMap[
    typingsSlinky.firebaseFirestore.documentKeyMod.DocumentKey, 
    typingsSlinky.firebaseFirestore.documentMod.MaybeDocument | scala.Null
  ]
  type TargetIdSet_ = typingsSlinky.firebaseFirestore.sortedSetMod.SortedSet[typingsSlinky.firebaseFirestore.typesMod.TargetId]
}
