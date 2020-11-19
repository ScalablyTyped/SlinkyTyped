package typingsSlinky.gestalt.mod

import typingsSlinky.gestalt.anon.Path
import typingsSlinky.gestalt.gestaltStrings.blue
import typingsSlinky.gestalt.gestaltStrings.darkGray
import typingsSlinky.gestalt.gestaltStrings.eggplant
import typingsSlinky.gestalt.gestaltStrings.gray
import typingsSlinky.gestalt.gestaltStrings.green
import typingsSlinky.gestalt.gestaltStrings.lightGray
import typingsSlinky.gestalt.gestaltStrings.maroon
import typingsSlinky.gestalt.gestaltStrings.midnight
import typingsSlinky.gestalt.gestaltStrings.navy
import typingsSlinky.gestalt.gestaltStrings.olive
import typingsSlinky.gestalt.gestaltStrings.orange
import typingsSlinky.gestalt.gestaltStrings.orchid
import typingsSlinky.gestalt.gestaltStrings.pine
import typingsSlinky.gestalt.gestaltStrings.purple
import typingsSlinky.gestalt.gestaltStrings.red
import typingsSlinky.gestalt.gestaltStrings.watermelon
import typingsSlinky.gestalt.gestaltStrings.white
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IconProps extends js.Object {
  
  var accessibilityLabel: String = js.native
  
  var color: js.UndefOr[
    blue | darkGray | eggplant | gray | green | lightGray | maroon | midnight | navy | olive | orange | orchid | pine | purple | red | watermelon | white
  ] = js.native
  
  var dangerouslySetSvgPath: js.UndefOr[Path] = js.native
  
  var icon: js.UndefOr[Icons] = js.native
  
  var `inline`: js.UndefOr[Boolean] = js.native
  
  var size: js.UndefOr[Double | String] = js.native
}
object IconProps {
  
  @scala.inline
  def apply(accessibilityLabel: String): IconProps = {
    val __obj = js.Dynamic.literal(accessibilityLabel = accessibilityLabel.asInstanceOf[js.Any])
    __obj.asInstanceOf[IconProps]
  }
  
  @scala.inline
  implicit class IconPropsOps[Self <: IconProps] (val x: Self) extends AnyVal {
    
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
    def setAccessibilityLabel(value: String): Self = this.set("accessibilityLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColor(
      value: blue | darkGray | eggplant | gray | green | lightGray | maroon | midnight | navy | olive | orange | orchid | pine | purple | red | watermelon | white
    ): Self = this.set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    
    @scala.inline
    def setDangerouslySetSvgPath(value: Path): Self = this.set("dangerouslySetSvgPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDangerouslySetSvgPath: Self = this.set("dangerouslySetSvgPath", js.undefined)
    
    @scala.inline
    def setIcon(value: Icons): Self = this.set("icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIcon: Self = this.set("icon", js.undefined)
    
    @scala.inline
    def setInline(value: Boolean): Self = this.set("inline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInline: Self = this.set("inline", js.undefined)
    
    @scala.inline
    def setSize(value: Double | String): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
  }
}
