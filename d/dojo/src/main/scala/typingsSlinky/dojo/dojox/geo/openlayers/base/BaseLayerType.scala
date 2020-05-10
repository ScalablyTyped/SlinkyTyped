package typingsSlinky.dojo.dojox.geo.openlayers.base

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/geo/openlayers/_base.BaseLayerType.html
  *
  * Defines the base layer types to be used at Map construction time or
  * with the setBaseLayerType function.
  * This object defines the base layer types to be used at Map construction
  * time or with the setBaseLayerType function.
  *
  */
@js.native
trait BaseLayerType extends js.Object {
  /**
    * The ESRI ARCGis base layer selector.
    *
    */
  var ARCGIS: String = js.native
  /**
    * Same as Virtual Earth
    *
    */
  var BING: String = js.native
  /**
    * The Google base layer type selector.
    *
    */
  var GOOGLE: String = js.native
  /**
    * The Open Street Map base layer type selector.
    *
    */
  var OSM: String = js.native
  /**
    * The Virtual Earth base layer type selector.
    *
    */
  var VIRTUAL_EARTH: String = js.native
  /**
    * The Web Map Server base layer type selector.
    *
    */
  var WMS: String = js.native
  /**
    * The Yahoo base layer type selector.
    *
    */
  var YAHOO: String = js.native
}

object BaseLayerType {
  @scala.inline
  def apply(
    ARCGIS: String,
    BING: String,
    GOOGLE: String,
    OSM: String,
    VIRTUAL_EARTH: String,
    WMS: String,
    YAHOO: String
  ): BaseLayerType = {
    val __obj = js.Dynamic.literal(ARCGIS = ARCGIS.asInstanceOf[js.Any], BING = BING.asInstanceOf[js.Any], GOOGLE = GOOGLE.asInstanceOf[js.Any], OSM = OSM.asInstanceOf[js.Any], VIRTUAL_EARTH = VIRTUAL_EARTH.asInstanceOf[js.Any], WMS = WMS.asInstanceOf[js.Any], YAHOO = YAHOO.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseLayerType]
  }
  @scala.inline
  implicit class BaseLayerTypeOps[Self <: BaseLayerType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withARCGIS(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ARCGIS")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBING(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BING")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGOOGLE(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GOOGLE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOSM(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OSM")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVIRTUAL_EARTH(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VIRTUAL_EARTH")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWMS(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WMS")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withYAHOO(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("YAHOO")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

