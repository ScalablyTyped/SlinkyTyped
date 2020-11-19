package typingsSlinky.hedron.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.hedron.hedronStrings.bottom
import typingsSlinky.hedron.hedronStrings.center
import typingsSlinky.hedron.hedronStrings.horizontal
import typingsSlinky.hedron.hedronStrings.left
import typingsSlinky.hedron.hedronStrings.right
import typingsSlinky.hedron.hedronStrings.top
import typingsSlinky.hedron.hedronStrings.vertical
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BoundsProps
  extends Styleable
     with /**
  *  Allow for customer props due to ability to add
  * custom breakpoints
  */
/* x */ StringDictionary[js.Any] {
  
  /**
    * Draws all child columns with 'bounding boxes' for easy
    * visualization of the grid. This enables debug mode for all the
    * children of this component
    * @default false
    */
  var debug: js.UndefOr[Boolean] = js.native
  
  /**
    * Direction of content
    */
  var direction: js.UndefOr[horizontal | vertical] = js.native
  
  /**
    * Controls the CSS flex property
    */
  var flex: js.UndefOr[String] = js.native
  
  /**
    * Alignment of children along the horizontal axis
    */
  var halign: js.UndefOr[left | center | right] = js.native
  
  /**
    * Alignment of children along the vertical axis
    */
  var valign: js.UndefOr[top | center | bottom] = js.native
  
  /**
    * Sets whether the children should wrap when there's no more room on the primary axis
    */
  var wrap: js.UndefOr[Boolean] = js.native
}
object BoundsProps {
  
  @scala.inline
  def apply(): BoundsProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BoundsProps]
  }
  
  @scala.inline
  implicit class BoundsPropsOps[Self <: BoundsProps] (val x: Self) extends AnyVal {
    
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
    def setDebug(value: Boolean): Self = this.set("debug", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDebug: Self = this.set("debug", js.undefined)
    
    @scala.inline
    def setDirection(value: horizontal | vertical): Self = this.set("direction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDirection: Self = this.set("direction", js.undefined)
    
    @scala.inline
    def setFlex(value: String): Self = this.set("flex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFlex: Self = this.set("flex", js.undefined)
    
    @scala.inline
    def setHalign(value: left | center | right): Self = this.set("halign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHalign: Self = this.set("halign", js.undefined)
    
    @scala.inline
    def setValign(value: top | center | bottom): Self = this.set("valign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValign: Self = this.set("valign", js.undefined)
    
    @scala.inline
    def setWrap(value: Boolean): Self = this.set("wrap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWrap: Self = this.set("wrap", js.undefined)
  }
}
