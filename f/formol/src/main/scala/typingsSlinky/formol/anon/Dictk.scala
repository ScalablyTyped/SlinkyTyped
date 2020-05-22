package typingsSlinky.formol.anon

import org.scalablytyped.runtime.StringDictionary
import slinky.core.TagMod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Dictk
  extends /* k */ StringDictionary[js.Any] {
  var no: TagMod[Any]
  var yes: TagMod[Any]
}

object Dictk {
  @scala.inline
  def apply(
    StringDictionary: /* name */ StringDictionary[js.Any] = null,
    no: TagMod[Any] = null,
    yes: TagMod[Any] = null
  ): Dictk = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (no != null) __obj.updateDynamic("no")(no.asInstanceOf[js.Any])
    if (yes != null) __obj.updateDynamic("yes")(yes.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dictk]
  }
}

