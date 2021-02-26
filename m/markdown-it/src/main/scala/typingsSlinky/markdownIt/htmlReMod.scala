package typingsSlinky.markdownIt

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object htmlReMod extends Shortcut {
  
  @JSImport("markdown-it/lib/common/html_re", JSImport.Namespace)
  @js.native
  val ^ : HtmlRE = js.native
  
  @js.native
  trait HtmlRE extends StObject {
    
    var HTML_OPEN_CLOSE_TAG_RE: js.RegExp = js.native
    
    var HTML_TAG_RE: js.RegExp = js.native
  }
  object HtmlRE {
    
    @scala.inline
    def apply(HTML_OPEN_CLOSE_TAG_RE: js.RegExp, HTML_TAG_RE: js.RegExp): HtmlRE = {
      val __obj = js.Dynamic.literal(HTML_OPEN_CLOSE_TAG_RE = HTML_OPEN_CLOSE_TAG_RE.asInstanceOf[js.Any], HTML_TAG_RE = HTML_TAG_RE.asInstanceOf[js.Any])
      __obj.asInstanceOf[HtmlRE]
    }
    
    @scala.inline
    implicit class HtmlREMutableBuilder[Self <: HtmlRE] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHTML_OPEN_CLOSE_TAG_RE(value: js.RegExp): Self = StObject.set(x, "HTML_OPEN_CLOSE_TAG_RE", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHTML_TAG_RE(value: js.RegExp): Self = StObject.set(x, "HTML_TAG_RE", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = HtmlRE
  
  /* This means you don't have to write `^`, but can instead just say `htmlReMod.foo` */
  override def _to: HtmlRE = ^
}
