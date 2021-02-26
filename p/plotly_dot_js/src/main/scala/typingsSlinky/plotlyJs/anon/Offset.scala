package typingsSlinky.plotlyJs.anon

import typingsSlinky.plotlyJs.plotlyJsStrings.center
import typingsSlinky.plotlyJs.plotlyJsStrings.left
import typingsSlinky.plotlyJs.plotlyJsStrings.right
import typingsSlinky.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Offset extends StObject {
  
  /**
    * Sets the font of the current value label text.
    */
  var font: Partial[typingsSlinky.plotlyJs.mod.Font] = js.native
  
  /**
    * The amount of space, in pixels, between the current value label
    * and the slider.
    */
  var offset: Double = js.native
  
  /**
    * When currentvalue.visible is true, this sets the prefix of the label.
    */
  var prefix: String = js.native
  
  /**
    * When currentvalue.visible is true, this sets the suffix of the label.
    */
  var suffix: String = js.native
  
  /**
    * Shows the currently-selected value above the slider.
    */
  var visible: Boolean = js.native
  
  /**
    * The alignment of the value readout relative to the length of the slider.
    */
  var xanchor: left | center | right = js.native
}
object Offset {
  
  @scala.inline
  def apply(
    font: Partial[typingsSlinky.plotlyJs.mod.Font],
    offset: Double,
    prefix: String,
    suffix: String,
    visible: Boolean,
    xanchor: left | center | right
  ): Offset = {
    val __obj = js.Dynamic.literal(font = font.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any], suffix = suffix.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any], xanchor = xanchor.asInstanceOf[js.Any])
    __obj.asInstanceOf[Offset]
  }
  
  @scala.inline
  implicit class OffsetMutableBuilder[Self <: Offset] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFont(value: Partial[typingsSlinky.plotlyJs.mod.Font]): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuffix(value: String): Self = StObject.set(x, "suffix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXanchor(value: left | center | right): Self = StObject.set(x, "xanchor", value.asInstanceOf[js.Any])
  }
}
