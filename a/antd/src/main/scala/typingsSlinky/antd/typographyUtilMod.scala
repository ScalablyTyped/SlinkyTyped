package typingsSlinky.antd

import org.scalajs.dom.raw.HTMLElement
import slinky.core.facade.ReactElement
import typingsSlinky.antd.anon.Content
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typographyUtilMod {
  
  @JSImport("antd/lib/typography/util", JSImport.Default)
  @js.native
  def default(
    originEle: HTMLElement,
    option: Option,
    content: ReactElement,
    fixedContent: js.Array[ReactElement],
    ellipsisStr: String
  ): Content = js.native
  
  @js.native
  trait Option extends StObject {
    
    var rows: Double = js.native
    
    var suffix: js.UndefOr[String] = js.native
  }
  object Option {
    
    @scala.inline
    def apply(rows: Double): Option = {
      val __obj = js.Dynamic.literal(rows = rows.asInstanceOf[js.Any])
      __obj.asInstanceOf[Option]
    }
    
    @scala.inline
    implicit class OptionMutableBuilder[Self <: Option] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRows(value: Double): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuffix(value: String): Self = StObject.set(x, "suffix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuffixUndefined: Self = StObject.set(x, "suffix", js.undefined)
    }
  }
}
