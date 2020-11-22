package typingsSlinky.grommet.anon

import typingsSlinky.grommet.dataChartMod.GranularityType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Granularity extends js.Object {
  
  var granularity: js.UndefOr[GranularityType] = js.native
  
  var property: js.UndefOr[String] = js.native
}
object Granularity {
  
  @scala.inline
  def apply(): Granularity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Granularity]
  }
  
  @scala.inline
  implicit class GranularityOps[Self <: Granularity] (val x: Self) extends AnyVal {
    
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
    def setGranularity(value: GranularityType): Self = this.set("granularity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGranularity: Self = this.set("granularity", js.undefined)
    
    @scala.inline
    def setProperty(value: String): Self = this.set("property", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProperty: Self = this.set("property", js.undefined)
  }
}
