package typingsSlinky.materialUiLab.paginationPaginationMod

import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.Event
import slinky.core.SyntheticEvent
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
import typingsSlinky.materialUiLab.usePaginationMod.UsePaginationItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PaginationRenderItemParams extends UsePaginationItem {
  
  var color: js.UndefOr[primary | secondary | standard] = js.native
  
  var shape: js.UndefOr[round | rounded] = js.native
  
  var size: js.UndefOr[small | medium | large] = js.native
  
  var variant: js.UndefOr[text | outlined] = js.native
}
object PaginationRenderItemParams {
  
  @scala.inline
  def apply(
    disabled: Boolean,
    onClick: SyntheticEvent[Event, Element] => Unit,
    page: Double,
    selected: Boolean,
    `type`: page | first | last | next | previous | `start-ellipsis` | `end-ellipsis`
  ): PaginationRenderItemParams = {
    val __obj = js.Dynamic.literal(disabled = disabled.asInstanceOf[js.Any], onClick = js.Any.fromFunction1(onClick), page = page.asInstanceOf[js.Any], selected = selected.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaginationRenderItemParams]
  }
  
  @scala.inline
  implicit class PaginationRenderItemParamsOps[Self <: PaginationRenderItemParams] (val x: Self) extends AnyVal {
    
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
    def setColor(value: primary | secondary | standard): Self = this.set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    
    @scala.inline
    def setShape(value: round | rounded): Self = this.set("shape", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShape: Self = this.set("shape", js.undefined)
    
    @scala.inline
    def setSize(value: small | medium | large): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    
    @scala.inline
    def setVariant(value: text | outlined): Self = this.set("variant", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVariant: Self = this.set("variant", js.undefined)
  }
}
