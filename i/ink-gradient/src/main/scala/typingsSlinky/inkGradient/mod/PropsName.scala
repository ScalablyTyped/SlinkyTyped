package typingsSlinky.inkGradient.mod

import typingsSlinky.inkGradient.inkGradientStrings.atlas
import typingsSlinky.inkGradient.inkGradientStrings.cristal
import typingsSlinky.inkGradient.inkGradientStrings.fruit
import typingsSlinky.inkGradient.inkGradientStrings.instagram
import typingsSlinky.inkGradient.inkGradientStrings.mind
import typingsSlinky.inkGradient.inkGradientStrings.morning
import typingsSlinky.inkGradient.inkGradientStrings.passion
import typingsSlinky.inkGradient.inkGradientStrings.pastel
import typingsSlinky.inkGradient.inkGradientStrings.rainbow
import typingsSlinky.inkGradient.inkGradientStrings.retro
import typingsSlinky.inkGradient.inkGradientStrings.summer
import typingsSlinky.inkGradient.inkGradientStrings.teen
import typingsSlinky.inkGradient.inkGradientStrings.vice
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PropsName extends js.Object {
  
  var name: cristal | teen | mind | morning | vice | passion | fruit | instagram | atlas | retro | summer | pastel | rainbow = js.native
}
object PropsName {
  
  @scala.inline
  def apply(
    name: cristal | teen | mind | morning | vice | passion | fruit | instagram | atlas | retro | summer | pastel | rainbow
  ): PropsName = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropsName]
  }
  
  @scala.inline
  implicit class PropsNameOps[Self <: PropsName] (val x: Self) extends AnyVal {
    
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
    def setName(
      value: cristal | teen | mind | morning | vice | passion | fruit | instagram | atlas | retro | summer | pastel | rainbow
    ): Self = this.set("name", value.asInstanceOf[js.Any])
  }
}
