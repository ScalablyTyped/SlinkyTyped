package typingsSlinky.fundamentalReact

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import slinky.core.ReactComponentClass
import typingsSlinky.fundamentalReact.fundamentalReactNumbers.`10`
import typingsSlinky.fundamentalReact.fundamentalReactNumbers.`1`
import typingsSlinky.fundamentalReact.fundamentalReactNumbers.`2`
import typingsSlinky.fundamentalReact.fundamentalReactNumbers.`3`
import typingsSlinky.fundamentalReact.fundamentalReactNumbers.`4`
import typingsSlinky.fundamentalReact.fundamentalReactNumbers.`5`
import typingsSlinky.fundamentalReact.fundamentalReactNumbers.`6`
import typingsSlinky.fundamentalReact.fundamentalReactNumbers.`7`
import typingsSlinky.fundamentalReact.fundamentalReactNumbers.`8`
import typingsSlinky.fundamentalReact.fundamentalReactNumbers.`9`
import typingsSlinky.fundamentalReact.iconMod.IconGlyph
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object infoLabelMod extends Shortcut {
  
  @JSImport("fundamental-react/lib/InfoLabel/InfoLabel", JSImport.Default)
  @js.native
  val default: ReactComponentClass[InfoLabelProps] = js.native
  
  @js.native
  trait InfoLabelProps
    extends /* x */ StringDictionary[js.Any] {
    
    var className: js.UndefOr[String] = js.native
    
    var color: js.UndefOr[`1` | `2` | `3` | `4` | `5` | `6` | `7` | `8` | `9` | `10`] = js.native
    
    var disableStyles: js.UndefOr[Boolean] = js.native
    
    var glyph: js.UndefOr[IconGlyph] = js.native
    
    var numeric: js.UndefOr[Boolean] = js.native
  }
  object InfoLabelProps {
    
    @scala.inline
    def apply(): InfoLabelProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InfoLabelProps]
    }
    
    @scala.inline
    implicit class InfoLabelPropsMutableBuilder[Self <: InfoLabelProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setColor(value: `1` | `2` | `3` | `4` | `5` | `6` | `7` | `8` | `9` | `10`): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setDisableStyles(value: Boolean): Self = StObject.set(x, "disableStyles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableStylesUndefined: Self = StObject.set(x, "disableStyles", js.undefined)
      
      @scala.inline
      def setGlyph(value: IconGlyph): Self = StObject.set(x, "glyph", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGlyphUndefined: Self = StObject.set(x, "glyph", js.undefined)
      
      @scala.inline
      def setNumeric(value: Boolean): Self = StObject.set(x, "numeric", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNumericUndefined: Self = StObject.set(x, "numeric", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[InfoLabelProps]
  
  /* This means you don't have to write `default`, but can instead just say `infoLabelMod.foo` */
  override def _to: ReactComponentClass[InfoLabelProps] = default
}
