package typingsSlinky.gestalt.mod

import slinky.core.facade.ReactElement
import typingsSlinky.gestalt.anon.ActiveIndex
import typingsSlinky.gestalt.gestaltStrings.lg
import typingsSlinky.gestalt.gestaltStrings.md
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SegmentedControlProps extends js.Object {
  
  var items: js.Array[ReactElement] = js.native
  
  def onChange(args: ActiveIndex): Unit = js.native
  
  var responsive: js.UndefOr[Boolean] = js.native
  
  var selectedItemIndex: Double = js.native
  
  var size: js.UndefOr[md | lg] = js.native
}
object SegmentedControlProps {
  
  @scala.inline
  def apply(items: js.Array[ReactElement], onChange: ActiveIndex => Unit, selectedItemIndex: Double): SegmentedControlProps = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], onChange = js.Any.fromFunction1(onChange), selectedItemIndex = selectedItemIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[SegmentedControlProps]
  }
  
  @scala.inline
  implicit class SegmentedControlPropsOps[Self <: SegmentedControlProps] (val x: Self) extends AnyVal {
    
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
    def setItemsVarargs(value: ReactElement*): Self = this.set("items", js.Array(value :_*))
    
    @scala.inline
    def setItems(value: js.Array[ReactElement]): Self = this.set("items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnChange(value: ActiveIndex => Unit): Self = this.set("onChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSelectedItemIndex(value: Double): Self = this.set("selectedItemIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponsive(value: Boolean): Self = this.set("responsive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResponsive: Self = this.set("responsive", js.undefined)
    
    @scala.inline
    def setSize(value: md | lg): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
  }
}
