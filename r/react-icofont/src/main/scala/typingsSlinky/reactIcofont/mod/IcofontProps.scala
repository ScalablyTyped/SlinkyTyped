package typingsSlinky.reactIcofont.mod

import typingsSlinky.reactIcofont.reactIcofontStrings.`10`
import typingsSlinky.reactIcofont.reactIcofontStrings.`180`
import typingsSlinky.reactIcofont.reactIcofontStrings.`1`
import typingsSlinky.reactIcofont.reactIcofontStrings.`270`
import typingsSlinky.reactIcofont.reactIcofontStrings.`2`
import typingsSlinky.reactIcofont.reactIcofontStrings.`3`
import typingsSlinky.reactIcofont.reactIcofontStrings.`4`
import typingsSlinky.reactIcofont.reactIcofontStrings.`5`
import typingsSlinky.reactIcofont.reactIcofontStrings.`6`
import typingsSlinky.reactIcofont.reactIcofontStrings.`7`
import typingsSlinky.reactIcofont.reactIcofontStrings.`8`
import typingsSlinky.reactIcofont.reactIcofontStrings.`90`
import typingsSlinky.reactIcofont.reactIcofontStrings.`9`
import typingsSlinky.reactIcofont.reactIcofontStrings.h
import typingsSlinky.reactIcofont.reactIcofontStrings.v
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IcofontProps extends js.Object {
  
  var className: js.UndefOr[String] = js.native
  
  var flip: js.UndefOr[h | v] = js.native
  
  var icon: String = js.native
  
  var rotate: js.UndefOr[`90` | `180` | `270`] = js.native
  
  var size: js.UndefOr[`1` | `2` | `3` | `4` | `5` | `6` | `7` | `8` | `9` | `10`] = js.native
  
  var spin: js.UndefOr[Boolean] = js.native
}
object IcofontProps {
  
  @scala.inline
  def apply(icon: String): IcofontProps = {
    val __obj = js.Dynamic.literal(icon = icon.asInstanceOf[js.Any])
    __obj.asInstanceOf[IcofontProps]
  }
  
  @scala.inline
  implicit class IcofontPropsOps[Self <: IcofontProps] (val x: Self) extends AnyVal {
    
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
    def setIcon(value: String): Self = this.set("icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    
    @scala.inline
    def setFlip(value: h | v): Self = this.set("flip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFlip: Self = this.set("flip", js.undefined)
    
    @scala.inline
    def setRotate(value: `90` | `180` | `270`): Self = this.set("rotate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRotate: Self = this.set("rotate", js.undefined)
    
    @scala.inline
    def setSize(value: `1` | `2` | `3` | `4` | `5` | `6` | `7` | `8` | `9` | `10`): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    
    @scala.inline
    def setSpin(value: Boolean): Self = this.set("spin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpin: Self = this.set("spin", js.undefined)
  }
}
