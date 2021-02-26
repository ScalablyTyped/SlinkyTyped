package typingsSlinky.maximMazurokGapiClientTrafficdirector.gapi.client.trafficdirector

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Locality extends StObject {
  
  /** Region this :ref:`zone ` belongs to. */
  var region: js.UndefOr[String] = js.native
  
  /** When used for locality of upstream hosts, this field further splits zone into smaller chunks of sub-zones so they can be load balanced independently. */
  var subZone: js.UndefOr[String] = js.native
  
  /**
    * Defines the local service zone where Envoy is running. Though optional, it should be set if discovery service routing is used and the discovery service exposes :ref:`zone data `,
    * either in this message or via :option:`--service-zone`. The meaning of zone is context dependent, e.g. `Availability Zone (AZ) `_ on AWS, `Zone `_ on GCP, etc.
    */
  var zone: js.UndefOr[String] = js.native
}
object Locality {
  
  @scala.inline
  def apply(): Locality = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Locality]
  }
  
  @scala.inline
  implicit class LocalityMutableBuilder[Self <: Locality] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
    
    @scala.inline
    def setSubZone(value: String): Self = StObject.set(x, "subZone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubZoneUndefined: Self = StObject.set(x, "subZone", js.undefined)
    
    @scala.inline
    def setZone(value: String): Self = StObject.set(x, "zone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZoneUndefined: Self = StObject.set(x, "zone", js.undefined)
  }
}
