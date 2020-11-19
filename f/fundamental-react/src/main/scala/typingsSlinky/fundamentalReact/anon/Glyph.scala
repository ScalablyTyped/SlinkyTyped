package typingsSlinky.fundamentalReact.anon

import org.scalajs.dom.raw.HTMLButtonElement
import slinky.core.facade.ReactElement
import slinky.web.SyntheticMouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Glyph extends js.Object {
  
  var callback: js.UndefOr[js.Function1[/* event */ SyntheticMouseEvent[HTMLButtonElement], Unit]] = js.native
  
  var glyph: String = js.native
  
  var label: js.UndefOr[String] = js.native
  
  var menu: js.UndefOr[ReactElement] = js.native
  
  var notificationCount: Double = js.native
}
object Glyph {
  
  @scala.inline
  def apply(glyph: String, notificationCount: Double): Glyph = {
    val __obj = js.Dynamic.literal(glyph = glyph.asInstanceOf[js.Any], notificationCount = notificationCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[Glyph]
  }
  
  @scala.inline
  implicit class GlyphOps[Self <: Glyph] (val x: Self) extends AnyVal {
    
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
    def setGlyph(value: String): Self = this.set("glyph", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotificationCount(value: Double): Self = this.set("notificationCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCallback(value: /* event */ SyntheticMouseEvent[HTMLButtonElement] => Unit): Self = this.set("callback", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteCallback: Self = this.set("callback", js.undefined)
    
    @scala.inline
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    
    @scala.inline
    def setMenuReactElement(value: ReactElement): Self = this.set("menu", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMenu(value: ReactElement): Self = this.set("menu", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMenu: Self = this.set("menu", js.undefined)
  }
}
