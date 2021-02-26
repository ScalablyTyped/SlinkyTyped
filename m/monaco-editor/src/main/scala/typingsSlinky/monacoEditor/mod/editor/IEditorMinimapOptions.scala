package typingsSlinky.monacoEditor.mod.editor

import typingsSlinky.monacoEditor.monacoEditorStrings.always
import typingsSlinky.monacoEditor.monacoEditorStrings.fill
import typingsSlinky.monacoEditor.monacoEditorStrings.fit
import typingsSlinky.monacoEditor.monacoEditorStrings.left
import typingsSlinky.monacoEditor.monacoEditorStrings.mouseover
import typingsSlinky.monacoEditor.monacoEditorStrings.proportional
import typingsSlinky.monacoEditor.monacoEditorStrings.right
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IEditorMinimapOptions extends StObject {
  
  /**
    * Enable the rendering of the minimap.
    * Defaults to true.
    */
  var enabled: js.UndefOr[Boolean] = js.native
  
  /**
    * Limit the width of the minimap to render at most a certain number of columns.
    * Defaults to 120.
    */
  var maxColumn: js.UndefOr[Double] = js.native
  
  /**
    * Render the actual text on a line (as opposed to color blocks).
    * Defaults to true.
    */
  var renderCharacters: js.UndefOr[Boolean] = js.native
  
  /**
    * Relative size of the font in the minimap. Defaults to 1.
    */
  var scale: js.UndefOr[Double] = js.native
  
  /**
    * Control the rendering of the minimap slider.
    * Defaults to 'mouseover'.
    */
  var showSlider: js.UndefOr[always | mouseover] = js.native
  
  /**
    * Control the side of the minimap in editor.
    * Defaults to 'right'.
    */
  var side: js.UndefOr[right | left] = js.native
  
  /**
    * Control the minimap rendering mode.
    * Defaults to 'actual'.
    */
  var size: js.UndefOr[proportional | fill | fit] = js.native
}
object IEditorMinimapOptions {
  
  @scala.inline
  def apply(): IEditorMinimapOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IEditorMinimapOptions]
  }
  
  @scala.inline
  implicit class IEditorMinimapOptionsMutableBuilder[Self <: IEditorMinimapOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    @scala.inline
    def setMaxColumn(value: Double): Self = StObject.set(x, "maxColumn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxColumnUndefined: Self = StObject.set(x, "maxColumn", js.undefined)
    
    @scala.inline
    def setRenderCharacters(value: Boolean): Self = StObject.set(x, "renderCharacters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRenderCharactersUndefined: Self = StObject.set(x, "renderCharacters", js.undefined)
    
    @scala.inline
    def setScale(value: Double): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
    
    @scala.inline
    def setShowSlider(value: always | mouseover): Self = StObject.set(x, "showSlider", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowSliderUndefined: Self = StObject.set(x, "showSlider", js.undefined)
    
    @scala.inline
    def setSide(value: right | left): Self = StObject.set(x, "side", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSideUndefined: Self = StObject.set(x, "side", js.undefined)
    
    @scala.inline
    def setSize(value: proportional | fill | fit): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
  }
}
