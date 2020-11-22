package typingsSlinky.glaze.anon

import typingsSlinky.glaze.glazeStrings.animationDuration
import typingsSlinky.glaze.glazeStrings.border
import typingsSlinky.glaze.glazeStrings.borderRadius
import typingsSlinky.glaze.glazeStrings.borderWidth
import typingsSlinky.glaze.glazeStrings.boxShadow
import typingsSlinky.glaze.glazeStrings.color
import typingsSlinky.glaze.glazeStrings.fontFamily
import typingsSlinky.glaze.glazeStrings.fontSize
import typingsSlinky.glaze.glazeStrings.fontWeight
import typingsSlinky.glaze.glazeStrings.letterSpacing
import typingsSlinky.glaze.glazeStrings.lineHeight
import typingsSlinky.glaze.glazeStrings.margin
import typingsSlinky.glaze.glazeStrings.opacity
import typingsSlinky.glaze.glazeStrings.width
import typingsSlinky.glaze.glazeStrings.zIndex
import typingsSlinky.glaze.themeMod.ScaleTokens
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BorderWidth extends js.Object {
  
  var border: ScaleTokens[typingsSlinky.glaze.glazeStrings.border] = js.native
  
  var borderWidth: ScaleTokens[typingsSlinky.glaze.glazeStrings.borderWidth] = js.native
  
  var color: ScaleTokens[typingsSlinky.glaze.glazeStrings.color] = js.native
  
  var duration: ScaleTokens[animationDuration] = js.native
  
  var fontFamily: ScaleTokens[typingsSlinky.glaze.glazeStrings.fontFamily] = js.native
  
  var fontSize: ScaleTokens[typingsSlinky.glaze.glazeStrings.fontSize] = js.native
  
  var fontWeight: ScaleTokens[typingsSlinky.glaze.glazeStrings.fontWeight] = js.native
  
  var letterSpacing: ScaleTokens[typingsSlinky.glaze.glazeStrings.letterSpacing] = js.native
  
  var lineHeight: ScaleTokens[typingsSlinky.glaze.glazeStrings.lineHeight] = js.native
  
  var opacity: ScaleTokens[typingsSlinky.glaze.glazeStrings.opacity] = js.native
  
  var radius: ScaleTokens[borderRadius] = js.native
  
  var shadow: ScaleTokens[boxShadow] = js.native
  
  var size: ScaleTokens[width] = js.native
  
  var spacing: ScaleTokens[margin] = js.native
  
  var zIndex: ScaleTokens[typingsSlinky.glaze.glazeStrings.zIndex] = js.native
}
object BorderWidth {
  
  @scala.inline
  def apply(
    border: ScaleTokens[border],
    borderWidth: ScaleTokens[borderWidth],
    color: ScaleTokens[color],
    duration: ScaleTokens[animationDuration],
    fontFamily: ScaleTokens[fontFamily],
    fontSize: ScaleTokens[fontSize],
    fontWeight: ScaleTokens[fontWeight],
    letterSpacing: ScaleTokens[letterSpacing],
    lineHeight: ScaleTokens[lineHeight],
    opacity: ScaleTokens[opacity],
    radius: ScaleTokens[borderRadius],
    shadow: ScaleTokens[boxShadow],
    size: ScaleTokens[width],
    spacing: ScaleTokens[margin],
    zIndex: ScaleTokens[zIndex]
  ): BorderWidth = {
    val __obj = js.Dynamic.literal(border = border.asInstanceOf[js.Any], borderWidth = borderWidth.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], fontFamily = fontFamily.asInstanceOf[js.Any], fontSize = fontSize.asInstanceOf[js.Any], fontWeight = fontWeight.asInstanceOf[js.Any], letterSpacing = letterSpacing.asInstanceOf[js.Any], lineHeight = lineHeight.asInstanceOf[js.Any], opacity = opacity.asInstanceOf[js.Any], radius = radius.asInstanceOf[js.Any], shadow = shadow.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], spacing = spacing.asInstanceOf[js.Any], zIndex = zIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[BorderWidth]
  }
  
  @scala.inline
  implicit class BorderWidthOps[Self <: BorderWidth] (val x: Self) extends AnyVal {
    
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
    def setBorder(value: ScaleTokens[border]): Self = this.set("border", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderWidth(value: ScaleTokens[borderWidth]): Self = this.set("borderWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColor(value: ScaleTokens[color]): Self = this.set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDuration(value: ScaleTokens[animationDuration]): Self = this.set("duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontFamily(value: ScaleTokens[fontFamily]): Self = this.set("fontFamily", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontSize(value: ScaleTokens[fontSize]): Self = this.set("fontSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontWeight(value: ScaleTokens[fontWeight]): Self = this.set("fontWeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLetterSpacing(value: ScaleTokens[letterSpacing]): Self = this.set("letterSpacing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineHeight(value: ScaleTokens[lineHeight]): Self = this.set("lineHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpacity(value: ScaleTokens[opacity]): Self = this.set("opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRadius(value: ScaleTokens[borderRadius]): Self = this.set("radius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShadow(value: ScaleTokens[boxShadow]): Self = this.set("shadow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSize(value: ScaleTokens[width]): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpacing(value: ScaleTokens[margin]): Self = this.set("spacing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZIndex(value: ScaleTokens[zIndex]): Self = this.set("zIndex", value.asInstanceOf[js.Any])
  }
}
