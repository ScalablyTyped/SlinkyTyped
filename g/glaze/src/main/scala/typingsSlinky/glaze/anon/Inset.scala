package typingsSlinky.glaze.anon

import typingsSlinky.glaze.glazeStrings.bottom
import typingsSlinky.glaze.glazeStrings.height
import typingsSlinky.glaze.glazeStrings.left
import typingsSlinky.glaze.glazeStrings.marginBottom
import typingsSlinky.glaze.glazeStrings.marginLeft
import typingsSlinky.glaze.glazeStrings.marginRight
import typingsSlinky.glaze.glazeStrings.marginTop
import typingsSlinky.glaze.glazeStrings.paddingBottom
import typingsSlinky.glaze.glazeStrings.paddingLeft
import typingsSlinky.glaze.glazeStrings.paddingRight
import typingsSlinky.glaze.glazeStrings.paddingTop
import typingsSlinky.glaze.glazeStrings.right
import typingsSlinky.glaze.glazeStrings.top
import typingsSlinky.glaze.glazeStrings.width
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Inset extends js.Object {
  
  val inset: js.Tuple4[top, right, bottom, left] = js.native
  
  val insetX: js.Tuple2[left, right] = js.native
  
  val insetY: js.Tuple2[top, bottom] = js.native
  
  val marginX: js.Tuple2[marginLeft, marginRight] = js.native
  
  val marginY: js.Tuple2[marginTop, marginBottom] = js.native
  
  val paddingX: js.Tuple2[paddingLeft, paddingRight] = js.native
  
  val paddingY: js.Tuple2[paddingTop, paddingBottom] = js.native
  
  val size: js.Tuple2[width, height] = js.native
}
object Inset {
  
  @scala.inline
  def apply(
    inset: js.Tuple4[top, right, bottom, left],
    insetX: js.Tuple2[left, right],
    insetY: js.Tuple2[top, bottom],
    marginX: js.Tuple2[marginLeft, marginRight],
    marginY: js.Tuple2[marginTop, marginBottom],
    paddingX: js.Tuple2[paddingLeft, paddingRight],
    paddingY: js.Tuple2[paddingTop, paddingBottom],
    size: js.Tuple2[width, height]
  ): Inset = {
    val __obj = js.Dynamic.literal(inset = inset.asInstanceOf[js.Any], insetX = insetX.asInstanceOf[js.Any], insetY = insetY.asInstanceOf[js.Any], marginX = marginX.asInstanceOf[js.Any], marginY = marginY.asInstanceOf[js.Any], paddingX = paddingX.asInstanceOf[js.Any], paddingY = paddingY.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[Inset]
  }
  
  @scala.inline
  implicit class InsetOps[Self <: Inset] (val x: Self) extends AnyVal {
    
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
    def setInset(value: js.Tuple4[top, right, bottom, left]): Self = this.set("inset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInsetX(value: js.Tuple2[left, right]): Self = this.set("insetX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInsetY(value: js.Tuple2[top, bottom]): Self = this.set("insetY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarginX(value: js.Tuple2[marginLeft, marginRight]): Self = this.set("marginX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarginY(value: js.Tuple2[marginTop, marginBottom]): Self = this.set("marginY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaddingX(value: js.Tuple2[paddingLeft, paddingRight]): Self = this.set("paddingX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaddingY(value: js.Tuple2[paddingTop, paddingBottom]): Self = this.set("paddingY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSize(value: js.Tuple2[width, height]): Self = this.set("size", value.asInstanceOf[js.Any])
  }
}
