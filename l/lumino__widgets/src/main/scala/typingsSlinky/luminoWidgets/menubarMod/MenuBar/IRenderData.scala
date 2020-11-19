package typingsSlinky.luminoWidgets.menubarMod.MenuBar

import typingsSlinky.luminoWidgets.titleMod.Title
import typingsSlinky.luminoWidgets.widgetMod.Widget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An object which holds the data to render a menu bar item.
  */
@js.native
trait IRenderData extends js.Object {
  
  /**
    * Whether the item is the active item.
    */
  val active: Boolean = js.native
  
  /**
    * The title to be rendered.
    */
  val title: Title[Widget] = js.native
}
object IRenderData {
  
  @scala.inline
  def apply(active: Boolean, title: Title[Widget]): IRenderData = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[IRenderData]
  }
  
  @scala.inline
  implicit class IRenderDataOps[Self <: IRenderData] (val x: Self) extends AnyVal {
    
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
    def setActive(value: Boolean): Self = this.set("active", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: Title[Widget]): Self = this.set("title", value.asInstanceOf[js.Any])
  }
}
