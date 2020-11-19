package typingsSlinky.amapJsApi.anon

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typingsSlinky.amapJsApi.AMap.TileLayer.Flexible
import typingsSlinky.amapJsApi.AMap.TileLayer.Flexible.Options
import typingsSlinky.amapJsApi.AMap.TileLayer.RoadNet
import typingsSlinky.amapJsApi.AMap.TileLayer.Satellite
import typingsSlinky.amapJsApi.AMap.TileLayer.Traffic
import typingsSlinky.amapJsApi.AMap.TileLayer.WMS
import typingsSlinky.amapJsApi.AMap.TileLayer.WMTS
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofTileLayer extends js.Object {
  
  val Flexible: Instantiable1[/* options */ js.UndefOr[Options], typingsSlinky.amapJsApi.AMap.TileLayer.Flexible] = js.native
  
  /**
    * 路网图层
    */
  var RoadNet: Instantiable0[typingsSlinky.amapJsApi.AMap.TileLayer.RoadNet] = js.native
  
  /**
    * 卫星图层
    */
  var Satellite: Instantiable0[typingsSlinky.amapJsApi.AMap.TileLayer.Satellite] = js.native
  
  val Traffic: Instantiable1[
    /* options */ js.UndefOr[typingsSlinky.amapJsApi.AMap.TileLayer.Traffic.Options], 
    typingsSlinky.amapJsApi.AMap.TileLayer.Traffic
  ] = js.native
  
  val WMS: Instantiable1[
    /* options */ typingsSlinky.amapJsApi.AMap.TileLayer.WMS.Options, 
    typingsSlinky.amapJsApi.AMap.TileLayer.WMS
  ] = js.native
  
  val WMTS: Instantiable1[
    /* options */ typingsSlinky.amapJsApi.AMap.TileLayer.WMTS.Options, 
    typingsSlinky.amapJsApi.AMap.TileLayer.WMTS
  ] = js.native
}
object TypeofTileLayer {
  
  @scala.inline
  def apply(
    Flexible: Instantiable1[/* options */ js.UndefOr[Options], Flexible],
    RoadNet: Instantiable0[RoadNet],
    Satellite: Instantiable0[Satellite],
    Traffic: Instantiable1[
      /* options */ js.UndefOr[typingsSlinky.amapJsApi.AMap.TileLayer.Traffic.Options], 
      Traffic
    ],
    WMS: Instantiable1[/* options */ typingsSlinky.amapJsApi.AMap.TileLayer.WMS.Options, WMS],
    WMTS: Instantiable1[/* options */ typingsSlinky.amapJsApi.AMap.TileLayer.WMTS.Options, WMTS]
  ): TypeofTileLayer = {
    val __obj = js.Dynamic.literal(Flexible = Flexible.asInstanceOf[js.Any], RoadNet = RoadNet.asInstanceOf[js.Any], Satellite = Satellite.asInstanceOf[js.Any], Traffic = Traffic.asInstanceOf[js.Any], WMS = WMS.asInstanceOf[js.Any], WMTS = WMTS.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofTileLayer]
  }
  
  @scala.inline
  implicit class TypeofTileLayerOps[Self <: TypeofTileLayer] (val x: Self) extends AnyVal {
    
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
    def setFlexible(value: Instantiable1[/* options */ js.UndefOr[Options], Flexible]): Self = this.set("Flexible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoadNet(value: Instantiable0[RoadNet]): Self = this.set("RoadNet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSatellite(value: Instantiable0[Satellite]): Self = this.set("Satellite", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTraffic(
      value: Instantiable1[
          /* options */ js.UndefOr[typingsSlinky.amapJsApi.AMap.TileLayer.Traffic.Options], 
          Traffic
        ]
    ): Self = this.set("Traffic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWMS(value: Instantiable1[/* options */ typingsSlinky.amapJsApi.AMap.TileLayer.WMS.Options, WMS]): Self = this.set("WMS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWMTS(value: Instantiable1[/* options */ typingsSlinky.amapJsApi.AMap.TileLayer.WMTS.Options, WMTS]): Self = this.set("WMTS", value.asInstanceOf[js.Any])
  }
}
