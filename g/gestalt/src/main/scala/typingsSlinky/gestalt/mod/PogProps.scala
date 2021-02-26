package typingsSlinky.gestalt.mod

import typingsSlinky.gestalt.anon.Path
import typingsSlinky.gestalt.gestaltNumbers.`1`
import typingsSlinky.gestalt.gestaltNumbers.`2`
import typingsSlinky.gestalt.gestaltNumbers.`3`
import typingsSlinky.gestalt.gestaltNumbers.`4`
import typingsSlinky.gestalt.gestaltNumbers.`5`
import typingsSlinky.gestalt.gestaltStrings.darkGray
import typingsSlinky.gestalt.gestaltStrings.gray
import typingsSlinky.gestalt.gestaltStrings.lg
import typingsSlinky.gestalt.gestaltStrings.lightGray
import typingsSlinky.gestalt.gestaltStrings.md
import typingsSlinky.gestalt.gestaltStrings.red
import typingsSlinky.gestalt.gestaltStrings.sm
import typingsSlinky.gestalt.gestaltStrings.transparent
import typingsSlinky.gestalt.gestaltStrings.transparentDarkGray
import typingsSlinky.gestalt.gestaltStrings.white
import typingsSlinky.gestalt.gestaltStrings.xl
import typingsSlinky.gestalt.gestaltStrings.xs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PogProps extends StObject {
  
  var accessibilityLabel: js.UndefOr[String] = js.native
  
  var active: js.UndefOr[Boolean] = js.native
  
  var bgColor: js.UndefOr[transparent | darkGray | transparentDarkGray | gray | lightGray | white | red] = js.native
  
  var dangerouslySetSvgPath: js.UndefOr[Path] = js.native
  
  var focused: js.UndefOr[Boolean] = js.native
  
  var hovered: js.UndefOr[Boolean] = js.native
  
  var icon: js.UndefOr[Icons] = js.native
  
  var iconColor: js.UndefOr[gray | darkGray | red | white] = js.native
  
  var padding: js.UndefOr[`1` | `2` | `3` | `4` | `5`] = js.native
  
  var selected: js.UndefOr[Boolean] = js.native
  
  var size: js.UndefOr[xs | sm | md | lg | xl] = js.native
}
object PogProps {
  
  @scala.inline
  def apply(): PogProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PogProps]
  }
  
  @scala.inline
  implicit class PogPropsMutableBuilder[Self <: PogProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccessibilityLabel(value: String): Self = StObject.set(x, "accessibilityLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessibilityLabelUndefined: Self = StObject.set(x, "accessibilityLabel", js.undefined)
    
    @scala.inline
    def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
    
    @scala.inline
    def setBgColor(value: transparent | darkGray | transparentDarkGray | gray | lightGray | white | red): Self = StObject.set(x, "bgColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBgColorUndefined: Self = StObject.set(x, "bgColor", js.undefined)
    
    @scala.inline
    def setDangerouslySetSvgPath(value: Path): Self = StObject.set(x, "dangerouslySetSvgPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDangerouslySetSvgPathUndefined: Self = StObject.set(x, "dangerouslySetSvgPath", js.undefined)
    
    @scala.inline
    def setFocused(value: Boolean): Self = StObject.set(x, "focused", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFocusedUndefined: Self = StObject.set(x, "focused", js.undefined)
    
    @scala.inline
    def setHovered(value: Boolean): Self = StObject.set(x, "hovered", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHoveredUndefined: Self = StObject.set(x, "hovered", js.undefined)
    
    @scala.inline
    def setIcon(value: Icons): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconColor(value: gray | darkGray | red | white): Self = StObject.set(x, "iconColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconColorUndefined: Self = StObject.set(x, "iconColor", js.undefined)
    
    @scala.inline
    def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
    
    @scala.inline
    def setPadding(value: `1` | `2` | `3` | `4` | `5`): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
    
    @scala.inline
    def setSelected(value: Boolean): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
    
    @scala.inline
    def setSize(value: xs | sm | md | lg | xl): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
  }
}
