package typingsSlinky.rbx.badgeMod

import typingsSlinky.rbx.rbxStrings.black
import typingsSlinky.rbx.rbxStrings.danger
import typingsSlinky.rbx.rbxStrings.dark
import typingsSlinky.rbx.rbxStrings.info
import typingsSlinky.rbx.rbxStrings.large
import typingsSlinky.rbx.rbxStrings.light
import typingsSlinky.rbx.rbxStrings.link
import typingsSlinky.rbx.rbxStrings.medium
import typingsSlinky.rbx.rbxStrings.primary
import typingsSlinky.rbx.rbxStrings.small
import typingsSlinky.rbx.rbxStrings.success
import typingsSlinky.rbx.rbxStrings.warning
import typingsSlinky.rbx.rbxStrings.white
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BadgeHelpersProps extends js.Object {
  
  var badge: js.UndefOr[Double | String] = js.native
  
  var badgeColor: js.UndefOr[
    primary | success | info | warning | danger | light | dark | white | black | link
  ] = js.native
  
  var badgeOutlined: js.UndefOr[Boolean] = js.native
  
  var badgeRounded: js.UndefOr[Boolean] = js.native
  
  var badgeSize: js.UndefOr[small | medium | large] = js.native
}
object BadgeHelpersProps {
  
  @scala.inline
  def apply(): BadgeHelpersProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BadgeHelpersProps]
  }
  
  @scala.inline
  implicit class BadgeHelpersPropsOps[Self <: BadgeHelpersProps] (val x: Self) extends AnyVal {
    
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
    def setBadge(value: Double | String): Self = this.set("badge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBadge: Self = this.set("badge", js.undefined)
    
    @scala.inline
    def setBadgeColor(value: primary | success | info | warning | danger | light | dark | white | black | link): Self = this.set("badgeColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBadgeColor: Self = this.set("badgeColor", js.undefined)
    
    @scala.inline
    def setBadgeOutlined(value: Boolean): Self = this.set("badgeOutlined", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBadgeOutlined: Self = this.set("badgeOutlined", js.undefined)
    
    @scala.inline
    def setBadgeRounded(value: Boolean): Self = this.set("badgeRounded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBadgeRounded: Self = this.set("badgeRounded", js.undefined)
    
    @scala.inline
    def setBadgeSize(value: small | medium | large): Self = this.set("badgeSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBadgeSize: Self = this.set("badgeSize", js.undefined)
  }
}
