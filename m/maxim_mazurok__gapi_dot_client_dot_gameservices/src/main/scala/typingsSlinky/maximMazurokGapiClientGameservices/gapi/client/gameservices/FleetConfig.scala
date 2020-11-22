package typingsSlinky.maximMazurokGapiClientGameservices.gapi.client.gameservices

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FleetConfig extends js.Object {
  
  /** Agones fleet spec. Example spec: `https://agones.dev/site/docs/reference/fleet/`. */
  var fleetSpec: js.UndefOr[String] = js.native
  
  /** The name of the FleetConfig. */
  var name: js.UndefOr[String] = js.native
}
object FleetConfig {
  
  @scala.inline
  def apply(): FleetConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FleetConfig]
  }
  
  @scala.inline
  implicit class FleetConfigOps[Self <: FleetConfig] (val x: Self) extends AnyVal {
    
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
    def setFleetSpec(value: String): Self = this.set("fleetSpec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFleetSpec: Self = this.set("fleetSpec", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
  }
}
