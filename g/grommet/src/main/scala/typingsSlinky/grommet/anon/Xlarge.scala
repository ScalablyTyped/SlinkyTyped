package typingsSlinky.grommet.anon

import typingsSlinky.grommet.baseMod.ExtendType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Xlarge extends js.Object {
  
  var extend: js.UndefOr[ExtendType] = js.native
  
  var large: js.UndefOr[MaxWidth] = js.native
  
  var medium: js.UndefOr[MaxWidth] = js.native
  
  var small: js.UndefOr[MaxWidth] = js.native
  
  var xlarge: js.UndefOr[MaxWidth] = js.native
  
  var xxlarge: js.UndefOr[MaxWidth] = js.native
}
object Xlarge {
  
  @scala.inline
  def apply(): Xlarge = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Xlarge]
  }
  
  @scala.inline
  implicit class XlargeOps[Self <: Xlarge] (val x: Self) extends AnyVal {
    
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
    def setExtendFunction1(value: /* args */ js.Any => Unit): Self = this.set("extend", js.Any.fromFunction1(value))
    
    @scala.inline
    def setExtend(value: ExtendType): Self = this.set("extend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExtend: Self = this.set("extend", js.undefined)
    
    @scala.inline
    def setLarge(value: MaxWidth): Self = this.set("large", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLarge: Self = this.set("large", js.undefined)
    
    @scala.inline
    def setMedium(value: MaxWidth): Self = this.set("medium", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMedium: Self = this.set("medium", js.undefined)
    
    @scala.inline
    def setSmall(value: MaxWidth): Self = this.set("small", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSmall: Self = this.set("small", js.undefined)
    
    @scala.inline
    def setXlarge(value: MaxWidth): Self = this.set("xlarge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteXlarge: Self = this.set("xlarge", js.undefined)
    
    @scala.inline
    def setXxlarge(value: MaxWidth): Self = this.set("xxlarge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteXxlarge: Self = this.set("xxlarge", js.undefined)
  }
}
