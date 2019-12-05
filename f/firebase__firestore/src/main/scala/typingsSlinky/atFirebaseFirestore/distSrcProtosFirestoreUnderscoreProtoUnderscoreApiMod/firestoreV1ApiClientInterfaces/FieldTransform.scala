package typingsSlinky.atFirebaseFirestore.distSrcProtosFirestoreUnderscoreProtoUnderscoreApiMod.firestoreV1ApiClientInterfaces

import typingsSlinky.atFirebaseFirestore.distSrcProtosFirestoreUnderscoreProtoUnderscoreApiMod.FieldTransformSetToServerValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FieldTransform extends js.Object {
  var appendMissingElements: js.UndefOr[
    typingsSlinky.atFirebaseFirestore.distSrcProtosFirestoreUnderscoreProtoUnderscoreApiMod.firestoreV1ApiClientInterfaces.ArrayValue
  ] = js.undefined
  var fieldPath: js.UndefOr[String] = js.undefined
  var increment: js.UndefOr[
    typingsSlinky.atFirebaseFirestore.distSrcProtosFirestoreUnderscoreProtoUnderscoreApiMod.firestoreV1ApiClientInterfaces.Value
  ] = js.undefined
  var removeAllFromArray: js.UndefOr[
    typingsSlinky.atFirebaseFirestore.distSrcProtosFirestoreUnderscoreProtoUnderscoreApiMod.firestoreV1ApiClientInterfaces.ArrayValue
  ] = js.undefined
  var setToServerValue: js.UndefOr[FieldTransformSetToServerValue] = js.undefined
}

object FieldTransform {
  @scala.inline
  def apply(
    appendMissingElements: typingsSlinky.atFirebaseFirestore.distSrcProtosFirestoreUnderscoreProtoUnderscoreApiMod.firestoreV1ApiClientInterfaces.ArrayValue = null,
    fieldPath: String = null,
    increment: typingsSlinky.atFirebaseFirestore.distSrcProtosFirestoreUnderscoreProtoUnderscoreApiMod.firestoreV1ApiClientInterfaces.Value = null,
    removeAllFromArray: typingsSlinky.atFirebaseFirestore.distSrcProtosFirestoreUnderscoreProtoUnderscoreApiMod.firestoreV1ApiClientInterfaces.ArrayValue = null,
    setToServerValue: FieldTransformSetToServerValue = null
  ): FieldTransform = {
    val __obj = js.Dynamic.literal()
    if (appendMissingElements != null) __obj.updateDynamic("appendMissingElements")(appendMissingElements.asInstanceOf[js.Any])
    if (fieldPath != null) __obj.updateDynamic("fieldPath")(fieldPath.asInstanceOf[js.Any])
    if (increment != null) __obj.updateDynamic("increment")(increment.asInstanceOf[js.Any])
    if (removeAllFromArray != null) __obj.updateDynamic("removeAllFromArray")(removeAllFromArray.asInstanceOf[js.Any])
    if (setToServerValue != null) __obj.updateDynamic("setToServerValue")(setToServerValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[FieldTransform]
  }
}

