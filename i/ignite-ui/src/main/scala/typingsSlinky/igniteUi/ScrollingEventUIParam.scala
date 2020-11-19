package typingsSlinky.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ScrollingEventUIParam extends js.Object {
  
  /**
    * Gets if the content is scrolled by the scrollbar track areas. 0 - none used, -1 - Scrolled Up/Left, 1 - Scrolled Down/Right.
    */
  var bigIncrement: js.UndefOr[Double] = js.native
  
  /**
    * Gets which axis is being used to scroll - horizontal(true) or vertical(false).
    */
  var horizontal: js.UndefOr[Boolean] = js.native
  
  /**
    * Gets a reference to the igScroll.
    */
  var owner: js.UndefOr[js.Any] = js.native
  
  /**
    * Gets if the content is scrolled by the arrows. 0 - none used, -1 - Arrow Up/Left, 1 - Arrow Down/Right.
    */
  var smallIncrement: js.UndefOr[Double] = js.native
  
  /**
    * Gets how much the content will be scrolled horizontally.
    */
  var stepX: js.UndefOr[Double] = js.native
  
  /**
    * Gets how much the content will be scrolled vertically.
    */
  var stepY: js.UndefOr[Double] = js.native
}
object ScrollingEventUIParam {
  
  @scala.inline
  def apply(): ScrollingEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScrollingEventUIParam]
  }
  
  @scala.inline
  implicit class ScrollingEventUIParamOps[Self <: ScrollingEventUIParam] (val x: Self) extends AnyVal {
    
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
    def setBigIncrement(value: Double): Self = this.set("bigIncrement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBigIncrement: Self = this.set("bigIncrement", js.undefined)
    
    @scala.inline
    def setHorizontal(value: Boolean): Self = this.set("horizontal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHorizontal: Self = this.set("horizontal", js.undefined)
    
    @scala.inline
    def setOwner(value: js.Any): Self = this.set("owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOwner: Self = this.set("owner", js.undefined)
    
    @scala.inline
    def setSmallIncrement(value: Double): Self = this.set("smallIncrement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSmallIncrement: Self = this.set("smallIncrement", js.undefined)
    
    @scala.inline
    def setStepX(value: Double): Self = this.set("stepX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStepX: Self = this.set("stepX", js.undefined)
    
    @scala.inline
    def setStepY(value: Double): Self = this.set("stepY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStepY: Self = this.set("stepY", js.undefined)
  }
}
