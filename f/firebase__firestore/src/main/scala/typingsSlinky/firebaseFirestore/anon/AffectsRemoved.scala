package typingsSlinky.firebaseFirestore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AffectsRemoved extends js.Object {
  var affects: js.UndefOr[js.Array[typingsSlinky.firebaseFirestore.coreQueryMod.Query]] = js.undefined
  var removed: js.UndefOr[js.Array[typingsSlinky.firebaseFirestore.coreQueryMod.Query]] = js.undefined
}

object AffectsRemoved {
  @scala.inline
  def apply(
    affects: js.Array[typingsSlinky.firebaseFirestore.coreQueryMod.Query] = null,
    removed: js.Array[typingsSlinky.firebaseFirestore.coreQueryMod.Query] = null
  ): AffectsRemoved = {
    val __obj = js.Dynamic.literal()
    if (affects != null) __obj.updateDynamic("affects")(affects.asInstanceOf[js.Any])
    if (removed != null) __obj.updateDynamic("removed")(removed.asInstanceOf[js.Any])
    __obj.asInstanceOf[AffectsRemoved]
  }
}

