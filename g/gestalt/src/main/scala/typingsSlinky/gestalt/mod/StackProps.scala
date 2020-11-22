package typingsSlinky.gestalt.mod

import slinky.core.facade.ReactElement
import typingsSlinky.gestalt.gestaltStrings.around
import typingsSlinky.gestalt.gestaltStrings.auto
import typingsSlinky.gestalt.gestaltStrings.baseline
import typingsSlinky.gestalt.gestaltStrings.between
import typingsSlinky.gestalt.gestaltStrings.center
import typingsSlinky.gestalt.gestaltStrings.end
import typingsSlinky.gestalt.gestaltStrings.evenly
import typingsSlinky.gestalt.gestaltStrings.grow
import typingsSlinky.gestalt.gestaltStrings.none
import typingsSlinky.gestalt.gestaltStrings.shrink
import typingsSlinky.gestalt.gestaltStrings.start
import typingsSlinky.gestalt.gestaltStrings.stretch
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StackProps extends js.Object {
  
  var alignContent: js.UndefOr[start | end | center | between | around | evenly | stretch] = js.native
  
  var alignItems: js.UndefOr[start | end | center | baseline | stretch] = js.native
  
  var alignSelf: js.UndefOr[auto | start | end | center | baseline | stretch] = js.native
  
  var children: js.UndefOr[ReactElement] = js.native
  
  var fit: js.UndefOr[Boolean] = js.native
  
  var flex: js.UndefOr[grow | shrink | none] = js.native
  
  var gap: js.UndefOr[UnsignedUpTo12] = js.native
  
  var height: js.UndefOr[Double | String] = js.native
  
  var justifyContent: js.UndefOr[start | end | center | between | around | evenly] = js.native
  
  var maxHeight: js.UndefOr[Double | String] = js.native
  
  var maxWidth: js.UndefOr[Double | String] = js.native
  
  var minHeight: js.UndefOr[Double | String] = js.native
  
  var minWidth: js.UndefOr[Double | String] = js.native
  
  var width: js.UndefOr[Double | String] = js.native
  
  var wrap: js.UndefOr[Boolean] = js.native
}
object StackProps {
  
  @scala.inline
  def apply(): StackProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StackProps]
  }
  
  @scala.inline
  implicit class StackPropsOps[Self <: StackProps] (val x: Self) extends AnyVal {
    
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
    def setAlignContent(value: start | end | center | between | around | evenly | stretch): Self = this.set("alignContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlignContent: Self = this.set("alignContent", js.undefined)
    
    @scala.inline
    def setAlignItems(value: start | end | center | baseline | stretch): Self = this.set("alignItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlignItems: Self = this.set("alignItems", js.undefined)
    
    @scala.inline
    def setAlignSelf(value: auto | start | end | center | baseline | stretch): Self = this.set("alignSelf", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlignSelf: Self = this.set("alignSelf", js.undefined)
    
    @scala.inline
    def setChildrenReactElement(value: ReactElement): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildren(value: ReactElement): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    
    @scala.inline
    def setFit(value: Boolean): Self = this.set("fit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFit: Self = this.set("fit", js.undefined)
    
    @scala.inline
    def setFlex(value: grow | shrink | none): Self = this.set("flex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFlex: Self = this.set("flex", js.undefined)
    
    @scala.inline
    def setGap(value: UnsignedUpTo12): Self = this.set("gap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGap: Self = this.set("gap", js.undefined)
    
    @scala.inline
    def setHeight(value: Double | String): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    
    @scala.inline
    def setJustifyContent(value: start | end | center | between | around | evenly): Self = this.set("justifyContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJustifyContent: Self = this.set("justifyContent", js.undefined)
    
    @scala.inline
    def setMaxHeight(value: Double | String): Self = this.set("maxHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxHeight: Self = this.set("maxHeight", js.undefined)
    
    @scala.inline
    def setMaxWidth(value: Double | String): Self = this.set("maxWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxWidth: Self = this.set("maxWidth", js.undefined)
    
    @scala.inline
    def setMinHeight(value: Double | String): Self = this.set("minHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinHeight: Self = this.set("minHeight", js.undefined)
    
    @scala.inline
    def setMinWidth(value: Double | String): Self = this.set("minWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinWidth: Self = this.set("minWidth", js.undefined)
    
    @scala.inline
    def setWidth(value: Double | String): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
    
    @scala.inline
    def setWrap(value: Boolean): Self = this.set("wrap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWrap: Self = this.set("wrap", js.undefined)
  }
}
