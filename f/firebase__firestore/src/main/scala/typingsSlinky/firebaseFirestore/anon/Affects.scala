package typingsSlinky.firebaseFirestore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Affects extends js.Object {
  var affects: js.UndefOr[js.Array[typingsSlinky.firebaseFirestore.queryMod.Query]] = js.undefined
  var removed: js.UndefOr[js.Array[typingsSlinky.firebaseFirestore.queryMod.Query]] = js.undefined
}

object Affects {
  @scala.inline
  def apply(
    affects: js.Array[typingsSlinky.firebaseFirestore.queryMod.Query] = null,
    removed: js.Array[typingsSlinky.firebaseFirestore.queryMod.Query] = null
  ): Affects = {
    val __obj = js.Dynamic.literal()
    if (affects != null) __obj.updateDynamic("affects")(affects.asInstanceOf[js.Any])
    if (removed != null) __obj.updateDynamic("removed")(removed.asInstanceOf[js.Any])
    __obj.asInstanceOf[Affects]
  }
}

