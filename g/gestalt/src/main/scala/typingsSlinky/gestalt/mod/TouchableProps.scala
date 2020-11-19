package typingsSlinky.gestalt.mod

import slinky.core.facade.ReactElement
import typingsSlinky.gestalt.anon.EventSyntheticEvent
import typingsSlinky.gestalt.anon.`3`
import typingsSlinky.gestalt.gestaltNumbers.`0`
import typingsSlinky.gestalt.gestaltNumbers.`1`
import typingsSlinky.gestalt.gestaltNumbers.`2`
import typingsSlinky.gestalt.gestaltNumbers.`4`
import typingsSlinky.gestalt.gestaltNumbers.`5`
import typingsSlinky.gestalt.gestaltNumbers.`6`
import typingsSlinky.gestalt.gestaltNumbers.`7`
import typingsSlinky.gestalt.gestaltNumbers.`8`
import typingsSlinky.gestalt.gestaltStrings.circle
import typingsSlinky.gestalt.gestaltStrings.copy
import typingsSlinky.gestalt.gestaltStrings.grab
import typingsSlinky.gestalt.gestaltStrings.grabbing
import typingsSlinky.gestalt.gestaltStrings.move
import typingsSlinky.gestalt.gestaltStrings.noDrop
import typingsSlinky.gestalt.gestaltStrings.pill
import typingsSlinky.gestalt.gestaltStrings.pointer
import typingsSlinky.gestalt.gestaltStrings.zoomIn
import typingsSlinky.gestalt.gestaltStrings.zoomOut
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TouchableProps extends js.Object {
  
  var children: js.UndefOr[ReactElement] = js.native
  
  var fullHeight: js.UndefOr[Boolean] = js.native
  
  var fullWidth: js.UndefOr[Boolean] = js.native
  
  var mouseCursor: js.UndefOr[copy | grab | grabbing | move | noDrop | pointer | zoomIn | zoomOut] = js.native
  
  var onMouseEnter: js.UndefOr[js.Function1[/* args */ EventSyntheticEvent, Unit]] = js.native
  
  var onMouseLeave: js.UndefOr[js.Function1[/* args */ EventSyntheticEvent, Unit]] = js.native
  
  def onTouch(args: `3`): Unit = js.native
  
  var rounding: js.UndefOr[
    pill | circle | `0` | `1` | `2` | typingsSlinky.gestalt.gestaltNumbers.`3` | `4` | `5` | `6` | `7` | `8`
  ] = js.native
}
object TouchableProps {
  
  @scala.inline
  def apply(onTouch: `3` => Unit): TouchableProps = {
    val __obj = js.Dynamic.literal(onTouch = js.Any.fromFunction1(onTouch))
    __obj.asInstanceOf[TouchableProps]
  }
  
  @scala.inline
  implicit class TouchablePropsOps[Self <: TouchableProps] (val x: Self) extends AnyVal {
    
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
    def setOnTouch(value: `3` => Unit): Self = this.set("onTouch", js.Any.fromFunction1(value))
    
    @scala.inline
    def setChildrenReactElement(value: ReactElement): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildren(value: ReactElement): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    
    @scala.inline
    def setFullHeight(value: Boolean): Self = this.set("fullHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFullHeight: Self = this.set("fullHeight", js.undefined)
    
    @scala.inline
    def setFullWidth(value: Boolean): Self = this.set("fullWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFullWidth: Self = this.set("fullWidth", js.undefined)
    
    @scala.inline
    def setMouseCursor(value: copy | grab | grabbing | move | noDrop | pointer | zoomIn | zoomOut): Self = this.set("mouseCursor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMouseCursor: Self = this.set("mouseCursor", js.undefined)
    
    @scala.inline
    def setOnMouseEnter(value: /* args */ EventSyntheticEvent => Unit): Self = this.set("onMouseEnter", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnMouseEnter: Self = this.set("onMouseEnter", js.undefined)
    
    @scala.inline
    def setOnMouseLeave(value: /* args */ EventSyntheticEvent => Unit): Self = this.set("onMouseLeave", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnMouseLeave: Self = this.set("onMouseLeave", js.undefined)
    
    @scala.inline
    def setRounding(
      value: pill | circle | `0` | `1` | `2` | typingsSlinky.gestalt.gestaltNumbers.`3` | `4` | `5` | `6` | `7` | `8`
    ): Self = this.set("rounding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRounding: Self = this.set("rounding", js.undefined)
  }
}
