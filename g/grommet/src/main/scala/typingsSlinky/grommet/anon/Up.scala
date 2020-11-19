package typingsSlinky.grommet.anon

import slinky.core.facade.ReactElement
import typingsSlinky.grommet.utilsMod.ColorType
import typingsSlinky.grommet.utilsMod.MarginType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Up extends js.Object {
  
  var color: js.UndefOr[ColorType] = js.native
  
  var down: js.UndefOr[ReactElement] = js.native
  
  var margin: js.UndefOr[MarginType] = js.native
  
  var up: js.UndefOr[ReactElement] = js.native
}
object Up {
  
  @scala.inline
  def apply(): Up = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Up]
  }
  
  @scala.inline
  implicit class UpOps[Self <: Up] (val x: Self) extends AnyVal {
    
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
    def setColor(value: ColorType): Self = this.set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    
    @scala.inline
    def setDownReactElement(value: ReactElement): Self = this.set("down", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDown(value: ReactElement): Self = this.set("down", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDown: Self = this.set("down", js.undefined)
    
    @scala.inline
    def setMargin(value: MarginType): Self = this.set("margin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMargin: Self = this.set("margin", js.undefined)
    
    @scala.inline
    def setUpReactElement(value: ReactElement): Self = this.set("up", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUp(value: ReactElement): Self = this.set("up", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUp: Self = this.set("up", js.undefined)
  }
}
