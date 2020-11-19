package typingsSlinky.navermaps.naver.maps.Service

import typingsSlinky.navermaps.naver.maps.Coord
import typingsSlinky.navermaps.naver.maps.CoordLiteral
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReverseServiceOptions extends ServiceOptions {
  
  var location: js.UndefOr[Coord | CoordLiteral] = js.native
}
object ReverseServiceOptions {
  
  @scala.inline
  def apply(): ReverseServiceOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReverseServiceOptions]
  }
  
  @scala.inline
  implicit class ReverseServiceOptionsOps[Self <: ReverseServiceOptions] (val x: Self) extends AnyVal {
    
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
    def setLocation(value: Coord | CoordLiteral): Self = this.set("location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocation: Self = this.set("location", js.undefined)
  }
}
