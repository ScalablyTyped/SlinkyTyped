package typingsSlinky.firebaseFirestore.firestoreProtoApiMod.firestoreV1ApiClientInterfaces

import typingsSlinky.firebaseFirestore.firestoreProtoApiMod.TargetChangeTargetChangeType
import typingsSlinky.firebaseFirestore.firestoreProtoApiMod.Timestamp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TargetChange extends js.Object {
  var cause: js.UndefOr[Status] = js.undefined
  var readTime: js.UndefOr[Timestamp] = js.undefined
  var resumeToken: js.UndefOr[String | js.typedarray.Uint8Array] = js.undefined
  var targetChangeType: js.UndefOr[TargetChangeTargetChangeType] = js.undefined
  var targetIds: js.UndefOr[js.Array[Double]] = js.undefined
}

object TargetChange {
  @scala.inline
  def apply(
    cause: Status = null,
    readTime: Timestamp = null,
    resumeToken: String | js.typedarray.Uint8Array = null,
    targetChangeType: TargetChangeTargetChangeType = null,
    targetIds: js.Array[Double] = null
  ): TargetChange = {
    val __obj = js.Dynamic.literal()
    if (cause != null) __obj.updateDynamic("cause")(cause.asInstanceOf[js.Any])
    if (readTime != null) __obj.updateDynamic("readTime")(readTime.asInstanceOf[js.Any])
    if (resumeToken != null) __obj.updateDynamic("resumeToken")(resumeToken.asInstanceOf[js.Any])
    if (targetChangeType != null) __obj.updateDynamic("targetChangeType")(targetChangeType.asInstanceOf[js.Any])
    if (targetIds != null) __obj.updateDynamic("targetIds")(targetIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[TargetChange]
  }
}

