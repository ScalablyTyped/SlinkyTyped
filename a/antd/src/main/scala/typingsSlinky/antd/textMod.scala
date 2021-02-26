package typingsSlinky.antd

import org.scalablytyped.runtime.Shortcut
import slinky.core.ReactComponentClass
import typingsSlinky.antd.baseMod.BlockProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object textMod extends Shortcut {
  
  @JSImport("antd/lib/typography/Text", JSImport.Default)
  @js.native
  val default: ReactComponentClass[TextProps] = js.native
  
  @js.native
  trait TextProps extends BlockProps {
    
    @JSName("ellipsis")
    var ellipsis_TextProps: js.UndefOr[Boolean] = js.native
  }
  object TextProps {
    
    @scala.inline
    def apply(): TextProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TextProps]
    }
    
    @scala.inline
    implicit class TextPropsMutableBuilder[Self <: TextProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEllipsis(value: Boolean): Self = StObject.set(x, "ellipsis", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEllipsisUndefined: Self = StObject.set(x, "ellipsis", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[TextProps]
  
  /* This means you don't have to write `default`, but can instead just say `textMod.foo` */
  override def _to: ReactComponentClass[TextProps] = default
}
