package typingsSlinky.atFirebaseFirestore.distSrcProtosFirestoreUnderscoreProtoUnderscoreApiMod.firestoreV1ApiClientInterfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListenResponse extends js.Object {
  var documentChange: js.UndefOr[
    typingsSlinky.atFirebaseFirestore.distSrcProtosFirestoreUnderscoreProtoUnderscoreApiMod.firestoreV1ApiClientInterfaces.DocumentChange
  ] = js.undefined
  var documentDelete: js.UndefOr[
    typingsSlinky.atFirebaseFirestore.distSrcProtosFirestoreUnderscoreProtoUnderscoreApiMod.firestoreV1ApiClientInterfaces.DocumentDelete
  ] = js.undefined
  var documentRemove: js.UndefOr[
    typingsSlinky.atFirebaseFirestore.distSrcProtosFirestoreUnderscoreProtoUnderscoreApiMod.firestoreV1ApiClientInterfaces.DocumentRemove
  ] = js.undefined
  var filter: js.UndefOr[
    typingsSlinky.atFirebaseFirestore.distSrcProtosFirestoreUnderscoreProtoUnderscoreApiMod.firestoreV1ApiClientInterfaces.ExistenceFilter
  ] = js.undefined
  var targetChange: js.UndefOr[
    typingsSlinky.atFirebaseFirestore.distSrcProtosFirestoreUnderscoreProtoUnderscoreApiMod.firestoreV1ApiClientInterfaces.TargetChange
  ] = js.undefined
}

object ListenResponse {
  @scala.inline
  def apply(
    documentChange: typingsSlinky.atFirebaseFirestore.distSrcProtosFirestoreUnderscoreProtoUnderscoreApiMod.firestoreV1ApiClientInterfaces.DocumentChange = null,
    documentDelete: typingsSlinky.atFirebaseFirestore.distSrcProtosFirestoreUnderscoreProtoUnderscoreApiMod.firestoreV1ApiClientInterfaces.DocumentDelete = null,
    documentRemove: typingsSlinky.atFirebaseFirestore.distSrcProtosFirestoreUnderscoreProtoUnderscoreApiMod.firestoreV1ApiClientInterfaces.DocumentRemove = null,
    filter: typingsSlinky.atFirebaseFirestore.distSrcProtosFirestoreUnderscoreProtoUnderscoreApiMod.firestoreV1ApiClientInterfaces.ExistenceFilter = null,
    targetChange: typingsSlinky.atFirebaseFirestore.distSrcProtosFirestoreUnderscoreProtoUnderscoreApiMod.firestoreV1ApiClientInterfaces.TargetChange = null
  ): ListenResponse = {
    val __obj = js.Dynamic.literal()
    if (documentChange != null) __obj.updateDynamic("documentChange")(documentChange.asInstanceOf[js.Any])
    if (documentDelete != null) __obj.updateDynamic("documentDelete")(documentDelete.asInstanceOf[js.Any])
    if (documentRemove != null) __obj.updateDynamic("documentRemove")(documentRemove.asInstanceOf[js.Any])
    if (filter != null) __obj.updateDynamic("filter")(filter.asInstanceOf[js.Any])
    if (targetChange != null) __obj.updateDynamic("targetChange")(targetChange.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListenResponse]
  }
}

