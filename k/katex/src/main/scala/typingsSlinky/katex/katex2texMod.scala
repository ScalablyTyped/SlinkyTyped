package typingsSlinky.katex

import org.scalajs.dom.raw.DocumentFragment
import typingsSlinky.katex.katexStrings.$
import typingsSlinky.katex.katexStrings.DollarDollar
import typingsSlinky.katex.katexStrings.Leftparenthesis
import typingsSlinky.katex.katexStrings.Rightparenthesis
import typingsSlinky.katex.katexStrings.`[`
import typingsSlinky.katex.katexStrings.`]`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object katex2texMod {
  
  @JSImport("katex/contrib/copy-tex/katex2tex", JSImport.Default)
  @js.native
  def default(fragment: DocumentFragment): DocumentFragment = js.native
  @JSImport("katex/contrib/copy-tex/katex2tex", JSImport.Default)
  @js.native
  def default(fragment: DocumentFragment, copyDelimiters: CopyDelimiters): DocumentFragment = js.native
  
  @js.native
  trait CopyDelimiters extends StObject {
    
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
    implicit class CopyDelimitersMutableBuilder[Self <: CopyDelimiters] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDisplay(value: js.Tuple2[DollarDollar | `[`, DollarDollar | `]`]): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInline(value: js.Tuple2[$ | Leftparenthesis, $ | Rightparenthesis]): Self = StObject.set(x, "inline", value.asInstanceOf[js.Any])
    }
  }
}
