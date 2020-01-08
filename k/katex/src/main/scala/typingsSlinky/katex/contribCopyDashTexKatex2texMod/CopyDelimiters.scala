package typingsSlinky.katex.contribCopyDashTexKatex2texMod

import typingsSlinky.katex.katexStrings.$
import typingsSlinky.katex.katexStrings.DollarDollar
import typingsSlinky.katex.katexStrings.Leftparenthesis
import typingsSlinky.katex.katexStrings.Rightparenthesis
import typingsSlinky.katex.katexStrings.`[`
import typingsSlinky.katex.katexStrings.`]`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CopyDelimiters extends js.Object {
  var display: js.Tuple2[DollarDollar | `[`, DollarDollar | `]`]
  var `inline`: js.Tuple2[$ | Leftparenthesis, $ | Rightparenthesis]
}

object CopyDelimiters {
  @scala.inline
  def apply(
    display: js.Tuple2[DollarDollar | `[`, DollarDollar | `]`],
    `inline`: js.Tuple2[$ | Leftparenthesis, $ | Rightparenthesis]
  ): CopyDelimiters = {
    val __obj = js.Dynamic.literal(display = display.asInstanceOf[js.Any])
    __obj.updateDynamic("inline")(`inline`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CopyDelimiters]
  }
}

