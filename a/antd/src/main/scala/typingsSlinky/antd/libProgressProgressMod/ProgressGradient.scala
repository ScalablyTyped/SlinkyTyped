package typingsSlinky.antd.libProgressProgressMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  direction ? :string} & antd.antd/lib/progress/progress.StringGradients | antd.antd/lib/progress/progress.FromToGradients */
trait ProgressGradient extends /* percentage */ StringDictionary[String] {
  var direction: js.UndefOr[String] = js.undefined
  var from: js.UndefOr[String] = js.undefined
  var to: js.UndefOr[String] = js.undefined
}

object ProgressGradient {
  @scala.inline
  def apply(
    StringDictionary: /* percentage */ StringDictionary[String] = null,
    direction: String = null,
    from: String = null,
    to: String = null
  ): ProgressGradient = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (from != null) __obj.updateDynamic("from")(from.asInstanceOf[js.Any])
    if (to != null) __obj.updateDynamic("to")(to.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProgressGradient]
  }
}

