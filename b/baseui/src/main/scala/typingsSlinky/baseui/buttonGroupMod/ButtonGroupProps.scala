package typingsSlinky.baseui.buttonGroupMod

import org.scalajs.dom.raw.HTMLButtonElement
import slinky.core.facade.ReactElement
import slinky.web.SyntheticMouseEvent
import typingsSlinky.baseui.baseuiStrings.checkbox
import typingsSlinky.baseui.baseuiStrings.compact
import typingsSlinky.baseui.baseuiStrings.default_
import typingsSlinky.baseui.baseuiStrings.large_
import typingsSlinky.baseui.baseuiStrings.mini
import typingsSlinky.baseui.baseuiStrings.minimal
import typingsSlinky.baseui.baseuiStrings.pill
import typingsSlinky.baseui.baseuiStrings.primary
import typingsSlinky.baseui.baseuiStrings.radio
import typingsSlinky.baseui.baseuiStrings.round
import typingsSlinky.baseui.baseuiStrings.secondary
import typingsSlinky.baseui.baseuiStrings.square
import typingsSlinky.baseui.baseuiStrings.tertiary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ButtonGroupProps extends js.Object {
  
  var ariaLabel: js.UndefOr[String] = js.native
  
  var children: ReactElement = js.native
  
  var disabled: js.UndefOr[Boolean] = js.native
  
  var kind: js.UndefOr[primary | secondary | tertiary | minimal] = js.native
  
  var mode: js.UndefOr[checkbox | radio] = js.native
  
  var onClick: js.UndefOr[
    js.Function2[/* event */ SyntheticMouseEvent[HTMLButtonElement], /* index */ Double, _]
  ] = js.native
  
  var overrides: js.UndefOr[ButtonGroupOverrides] = js.native
  
  var selected: js.UndefOr[Double | js.Array[Double]] = js.native
  
  var shape: js.UndefOr[default_ | pill | round | square] = js.native
  
  var size: js.UndefOr[compact | default_ | large_ | mini] = js.native
}
object ButtonGroupProps {
  
  @scala.inline
  def apply(): ButtonGroupProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ButtonGroupProps]
  }
  
  @scala.inline
  implicit class ButtonGroupPropsOps[Self <: ButtonGroupProps] (val x: Self) extends AnyVal {
    
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
    def setAriaLabel(value: String): Self = this.set("ariaLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAriaLabel: Self = this.set("ariaLabel", js.undefined)
    
    @scala.inline
    def setChildren(value: ReactElement): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    
    @scala.inline
    def setKind(value: primary | secondary | tertiary | minimal): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setMode(value: checkbox | radio): Self = this.set("mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMode: Self = this.set("mode", js.undefined)
    
    @scala.inline
    def setOnClick(value: (/* event */ SyntheticMouseEvent[HTMLButtonElement], /* index */ Double) => _): Self = this.set("onClick", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnClick: Self = this.set("onClick", js.undefined)
    
    @scala.inline
    def setOverrides(value: ButtonGroupOverrides): Self = this.set("overrides", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOverrides: Self = this.set("overrides", js.undefined)
    
    @scala.inline
    def setSelectedVarargs(value: Double*): Self = this.set("selected", js.Array(value :_*))
    
    @scala.inline
    def setSelected(value: Double | js.Array[Double]): Self = this.set("selected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelected: Self = this.set("selected", js.undefined)
    
    @scala.inline
    def setShape(value: default_ | pill | round | square): Self = this.set("shape", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShape: Self = this.set("shape", js.undefined)
    
    @scala.inline
    def setSize(value: compact | default_ | large_ | mini): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
  }
}
