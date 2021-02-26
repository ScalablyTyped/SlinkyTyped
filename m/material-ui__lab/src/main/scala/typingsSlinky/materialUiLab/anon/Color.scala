package typingsSlinky.materialUiLab.anon

import typingsSlinky.materialUiLab.materialUiLabStrings.`end-ellipsis`
import typingsSlinky.materialUiLab.materialUiLabStrings.`start-ellipsis`
import typingsSlinky.materialUiLab.materialUiLabStrings.first
import typingsSlinky.materialUiLab.materialUiLabStrings.large
import typingsSlinky.materialUiLab.materialUiLabStrings.last
import typingsSlinky.materialUiLab.materialUiLabStrings.medium
import typingsSlinky.materialUiLab.materialUiLabStrings.next
import typingsSlinky.materialUiLab.materialUiLabStrings.outlined
import typingsSlinky.materialUiLab.materialUiLabStrings.page
import typingsSlinky.materialUiLab.materialUiLabStrings.previous
import typingsSlinky.materialUiLab.materialUiLabStrings.primary
import typingsSlinky.materialUiLab.materialUiLabStrings.round
import typingsSlinky.materialUiLab.materialUiLabStrings.rounded
import typingsSlinky.materialUiLab.materialUiLabStrings.secondary
import typingsSlinky.materialUiLab.materialUiLabStrings.small
import typingsSlinky.materialUiLab.materialUiLabStrings.standard
import typingsSlinky.materialUiLab.materialUiLabStrings.text
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Color extends StObject {
  
  /**
    * The active color.
    */
  var color: js.UndefOr[standard | primary | secondary] = js.native
  
  /**
    * If `true`, the item will be disabled.
    */
  var disabled: js.UndefOr[Boolean] = js.native
  
  /**
    * The current page number.
    */
  var page: js.UndefOr[Double] = js.native
  
  /**
    * If `true` the pagination item is selected.
    */
  var selected: js.UndefOr[Boolean] = js.native
  
  /**
    * The shape of the pagination item.
    */
  var shape: js.UndefOr[round | rounded] = js.native
  
  /**
    * The size of the pagination item.
    */
  var size: js.UndefOr[small | medium | large] = js.native
  
  /**
    * The type of pagination item.
    */
  var `type`: js.UndefOr[page | first | last | next | previous | `start-ellipsis` | `end-ellipsis`] = js.native
  
  /**
    * The pagination item variant.
    */
  var variant: js.UndefOr[text | outlined] = js.native
}
object Color {
  
  @scala.inline
  def apply(): Color = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Color]
  }
  
  @scala.inline
  implicit class ColorMutableBuilder[Self <: Color] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColor(value: standard | primary | secondary): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    @scala.inline
    def setPage(value: Double): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageUndefined: Self = StObject.set(x, "page", js.undefined)
    
    @scala.inline
    def setSelected(value: Boolean): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
    
    @scala.inline
    def setShape(value: round | rounded): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShapeUndefined: Self = StObject.set(x, "shape", js.undefined)
    
    @scala.inline
    def setSize(value: small | medium | large): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    @scala.inline
    def setType(value: page | first | last | next | previous | `start-ellipsis` | `end-ellipsis`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setVariant(value: text | outlined): Self = StObject.set(x, "variant", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVariantUndefined: Self = StObject.set(x, "variant", js.undefined)
  }
}
