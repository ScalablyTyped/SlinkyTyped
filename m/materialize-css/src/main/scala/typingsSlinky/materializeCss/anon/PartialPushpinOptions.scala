package typingsSlinky.materializeCss.anon

import typingsSlinky.materializeCss.materializeCssStrings.`pin-bottom`
import typingsSlinky.materializeCss.materializeCssStrings.`pin-top`
import typingsSlinky.materializeCss.materializeCssStrings.pinned
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<materialize-css.M.PushpinOptions> */
@js.native
trait PartialPushpinOptions extends js.Object {
  
  var bottom: js.UndefOr[Double] = js.native
  
  var offset: js.UndefOr[Double] = js.native
  
  var onPositionChange: js.UndefOr[
    js.ThisFunction1[/* this */ this.type, /* position */ pinned | `pin-top` | `pin-bottom`, Unit]
  ] = js.native
  
  var top: js.UndefOr[Double] = js.native
}
object PartialPushpinOptions {
  
  @scala.inline
  def apply(): PartialPushpinOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialPushpinOptions]
  }
  
  @scala.inline
  implicit class PartialPushpinOptionsOps[Self <: PartialPushpinOptions] (val x: Self) extends AnyVal {
    
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
    def setBottom(value: Double): Self = this.set("bottom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBottom: Self = this.set("bottom", js.undefined)
    
    @scala.inline
    def setOffset(value: Double): Self = this.set("offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOffset: Self = this.set("offset", js.undefined)
    
    @scala.inline
    def setOnPositionChange(
      value: js.ThisFunction1[PartialPushpinOptions, /* position */ pinned | `pin-top` | `pin-bottom`, Unit]
    ): Self = this.set("onPositionChange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnPositionChange: Self = this.set("onPositionChange", js.undefined)
    
    @scala.inline
    def setTop(value: Double): Self = this.set("top", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTop: Self = this.set("top", js.undefined)
  }
}
