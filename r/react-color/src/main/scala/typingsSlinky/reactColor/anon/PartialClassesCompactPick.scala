package typingsSlinky.reactColor.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<reactcss.reactcss.Classes<react-color.react-color/lib/components/compact/Compact.CompactPickerStylesProps>> */
@js.native
trait PartialClassesCompactPick extends js.Object {
  
  var default: js.UndefOr[PartialCompactPickerStyle] = js.native
}
object PartialClassesCompactPick {
  
  @scala.inline
  def apply(): PartialClassesCompactPick = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialClassesCompactPick]
  }
  
  @scala.inline
  implicit class PartialClassesCompactPickOps[Self <: PartialClassesCompactPick] (val x: Self) extends AnyVal {
    
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
    def setDefault(value: PartialCompactPickerStyle): Self = this.set("default", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefault: Self = this.set("default", js.undefined)
  }
}
