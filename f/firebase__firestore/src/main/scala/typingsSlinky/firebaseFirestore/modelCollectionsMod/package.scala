package typingsSlinky.firebaseFirestore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object modelCollectionsMod {
  type DocumentKeySet_ = typingsSlinky.firebaseFirestore.utilSortedSetMod.SortedSet[typingsSlinky.firebaseFirestore.modelDocumentKeyMod.DocumentKey]
  type DocumentMap_ = typingsSlinky.firebaseFirestore.utilSortedMapMod.SortedMap[
    typingsSlinky.firebaseFirestore.modelDocumentKeyMod.DocumentKey, 
    typingsSlinky.firebaseFirestore.modelDocumentMod.Document
  ]
  type DocumentVersionMap_ = typingsSlinky.firebaseFirestore.utilSortedMapMod.SortedMap[
    typingsSlinky.firebaseFirestore.modelDocumentKeyMod.DocumentKey, 
    typingsSlinky.firebaseFirestore.coreSnapshotVersionMod.SnapshotVersion
  ]
  type MaybeDocumentMap_ = typingsSlinky.firebaseFirestore.utilSortedMapMod.SortedMap[
    typingsSlinky.firebaseFirestore.modelDocumentKeyMod.DocumentKey, 
    typingsSlinky.firebaseFirestore.modelDocumentMod.MaybeDocument
  ]
  type NullableMaybeDocumentMap_ = typingsSlinky.firebaseFirestore.utilSortedMapMod.SortedMap[
    typingsSlinky.firebaseFirestore.modelDocumentKeyMod.DocumentKey, 
    typingsSlinky.firebaseFirestore.modelDocumentMod.MaybeDocument | scala.Null
  ]
  type TargetIdSet_ = typingsSlinky.firebaseFirestore.utilSortedSetMod.SortedSet[typingsSlinky.firebaseFirestore.coreTypesMod.TargetId]
}
