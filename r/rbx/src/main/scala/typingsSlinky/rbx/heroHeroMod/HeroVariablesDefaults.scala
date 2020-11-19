package typingsSlinky.rbx.heroHeroMod

import typingsSlinky.rbx.rbxStrings.`fullheight-with-navbar`
import typingsSlinky.rbx.rbxStrings.fullheight
import typingsSlinky.rbx.rbxStrings.large
import typingsSlinky.rbx.rbxStrings.medium
import typingsSlinky.rbx.rbxStrings.small
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HeroVariablesDefaults extends js.Object {
  
  var sizes: small | medium | large | fullheight | `fullheight-with-navbar` = js.native
}
object HeroVariablesDefaults {
  
  @scala.inline
  def apply(sizes: small | medium | large | fullheight | `fullheight-with-navbar`): HeroVariablesDefaults = {
    val __obj = js.Dynamic.literal(sizes = sizes.asInstanceOf[js.Any])
    __obj.asInstanceOf[HeroVariablesDefaults]
  }
  
  @scala.inline
  implicit class HeroVariablesDefaultsOps[Self <: HeroVariablesDefaults] (val x: Self) extends AnyVal {
    
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
    def setSizes(value: small | medium | large | fullheight | `fullheight-with-navbar`): Self = this.set("sizes", value.asInstanceOf[js.Any])
  }
}
