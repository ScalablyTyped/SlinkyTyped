package typingsSlinky.reactBootstrap.thumbnailMod

import typingsSlinky.react.mod.AllHTMLAttributes
import typingsSlinky.react.mod.ClassAttributes
import typingsSlinky.reactBootstrap.mod.Sizes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ThumbnailProps
  extends AllHTMLAttributes[Thumbnail]
     with ClassAttributes[Thumbnail] {
  
  var bsSize: js.UndefOr[Sizes] = js.native
  
  var bsStyle: js.UndefOr[String] = js.native
}
object ThumbnailProps {
  
  @scala.inline
  def apply(): ThumbnailProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ThumbnailProps]
  }
  
  @scala.inline
  implicit class ThumbnailPropsOps[Self <: ThumbnailProps] (val x: Self) extends AnyVal {
    
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
    def setBsSize(value: Sizes): Self = this.set("bsSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBsSize: Self = this.set("bsSize", js.undefined)
    
    @scala.inline
    def setBsStyle(value: String): Self = this.set("bsStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBsStyle: Self = this.set("bsStyle", js.undefined)
  }
}
