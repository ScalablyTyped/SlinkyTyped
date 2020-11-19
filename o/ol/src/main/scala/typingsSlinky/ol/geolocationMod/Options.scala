package typingsSlinky.ol.geolocationMod

import org.scalajs.dom.raw.PositionOptions
import typingsSlinky.ol.projMod.ProjectionLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
  var projection: js.UndefOr[ProjectionLike] = js.native
  
  var tracking: js.UndefOr[Boolean] = js.native
  
  var trackingOptions: js.UndefOr[PositionOptions] = js.native
}
object Options {
  
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    
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
    def setProjection(value: ProjectionLike): Self = this.set("projection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProjection: Self = this.set("projection", js.undefined)
    
    @scala.inline
    def setTracking(value: Boolean): Self = this.set("tracking", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTracking: Self = this.set("tracking", js.undefined)
    
    @scala.inline
    def setTrackingOptions(value: PositionOptions): Self = this.set("trackingOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrackingOptions: Self = this.set("trackingOptions", js.undefined)
  }
}
