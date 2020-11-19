package typingsSlinky.reactMdTabs.useTabsMovementMod

import org.scalajs.dom.raw.HTMLDivElement
import slinky.core.facade.ReactElement
import slinky.web.SyntheticKeyboardEvent
import slinky.web.SyntheticMouseEvent
import typingsSlinky.react.mod.KeyboardEventHandler
import typingsSlinky.react.mod.MouseEventHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
  var activeIndex: Double = js.native
  
  var automatic: Boolean = js.native
  
  var children: ReactElement = js.native
  
  var horizontal: Boolean = js.native
  
  def onActiveIndexChange(activeIndex: Double): Unit = js.native
  
  var onClick: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.native
  
  var onKeyDown: js.UndefOr[KeyboardEventHandler[HTMLDivElement]] = js.native
}
object Options {
  
  @scala.inline
  def apply(activeIndex: Double, automatic: Boolean, horizontal: Boolean, onActiveIndexChange: Double => Unit): Options = {
    val __obj = js.Dynamic.literal(activeIndex = activeIndex.asInstanceOf[js.Any], automatic = automatic.asInstanceOf[js.Any], horizontal = horizontal.asInstanceOf[js.Any], onActiveIndexChange = js.Any.fromFunction1(onActiveIndexChange))
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    
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
    def setActiveIndex(value: Double): Self = this.set("activeIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutomatic(value: Boolean): Self = this.set("automatic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHorizontal(value: Boolean): Self = this.set("horizontal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnActiveIndexChange(value: Double => Unit): Self = this.set("onActiveIndexChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def setChildren(value: ReactElement): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    
    @scala.inline
    def setOnClick(value: SyntheticMouseEvent[HTMLDivElement] => Unit): Self = this.set("onClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnClick: Self = this.set("onClick", js.undefined)
    
    @scala.inline
    def setOnKeyDown(value: SyntheticKeyboardEvent[HTMLDivElement] => Unit): Self = this.set("onKeyDown", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnKeyDown: Self = this.set("onKeyDown", js.undefined)
  }
}
