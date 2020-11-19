package typingsSlinky.aliApp.anon

import typingsSlinky.aliApp.aliAppStrings.more
import typingsSlinky.aliApp.aliAppStrings.none
import typingsSlinky.aliApp.aliAppStrings.num
import typingsSlinky.aliApp.aliAppStrings.point
import typingsSlinky.aliApp.aliAppStrings.text
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<ali-app.my.Badge> */
@js.native
trait PartialBadge extends js.Object {
  
  var index: js.UndefOr[Double] = js.native
  
  var text: js.UndefOr[String] = js.native
  
  var `type`: js.UndefOr[none | point | num | text | more | String] = js.native
}
object PartialBadge {
  
  @scala.inline
  def apply(): PartialBadge = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialBadge]
  }
  
  @scala.inline
  implicit class PartialBadgeOps[Self <: PartialBadge] (val x: Self) extends AnyVal {
    
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
    def setIndex(value: Double): Self = this.set("index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndex: Self = this.set("index", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
    
    @scala.inline
    def setType(value: none | point | num | text | more | String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
