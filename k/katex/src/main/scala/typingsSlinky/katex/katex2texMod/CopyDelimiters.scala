package typingsSlinky.katex.katex2texMod

import typingsSlinky.katex.katexStrings.$
import typingsSlinky.katex.katexStrings.DollarDollar
import typingsSlinky.katex.katexStrings.Leftparenthesis
import typingsSlinky.katex.katexStrings.Rightparenthesis
import typingsSlinky.katex.katexStrings.`[`
import typingsSlinky.katex.katexStrings.`]`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CopyDelimiters extends js.Object {
  
  var display: js.Tuple2[DollarDollar | `[`, DollarDollar | `]`] = js.native
  
  var `inline`: js.Tuple2[$ | Leftparenthesis, $ | Rightparenthesis] = js.native
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
  
  @scala.inline
  implicit class CopyDelimitersOps[Self <: CopyDelimiters] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDisplay(value: js.Tuple2[DollarDollar | `[`, DollarDollar | `]`]): Self = this.set("display", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInline(value: js.Tuple2[$ | Leftparenthesis, $ | Rightparenthesis]): Self = this.set("inline", value.asInstanceOf[js.Any])
  }
}
