package typingsSlinky.openlayers.mod.olx.format

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.openlayers.mod.geom.Geometry
import typingsSlinky.openlayers.mod.geom.GeometryType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MVTOptions extends js.Object {
  var featureClass: js.UndefOr[
    (js.Function1[/* geom */ Geometry | StringDictionary[js.Any], _]) | (js.Function4[
      /* geom */ GeometryType, 
      /* arg2 */ js.Array[Double], 
      /* arg3 */ js.Array[js.Array[Double] | Double], 
      /* arg4 */ StringDictionary[js.Any], 
      _
    ])
  ] = js.native
  var geometryName: js.UndefOr[String] = js.native
  var layerName: js.UndefOr[String] = js.native
  var layers: js.UndefOr[js.Array[String]] = js.native
}

object MVTOptions {
  @scala.inline
  def apply(): MVTOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MVTOptions]
  }
  @scala.inline
  implicit class MVTOptionsOps[Self <: MVTOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFeatureClassFunction1(value: /* geom */ Geometry | StringDictionary[js.Any] => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("featureClass")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withFeatureClassFunction4(
      value: (/* geom */ GeometryType, /* arg2 */ js.Array[Double], /* arg3 */ js.Array[js.Array[Double] | Double], /* arg4 */ StringDictionary[js.Any]) => _
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("featureClass")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withFeatureClass(
      value: (js.Function1[/* geom */ Geometry | StringDictionary[js.Any], _]) | (js.Function4[
          /* geom */ GeometryType, 
          /* arg2 */ js.Array[Double], 
          /* arg3 */ js.Array[js.Array[Double] | Double], 
          /* arg4 */ StringDictionary[js.Any], 
          _
        ])
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("featureClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFeatureClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("featureClass")(js.undefined)
        ret
    }
    @scala.inline
    def withGeometryName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("geometryName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGeometryName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("geometryName")(js.undefined)
        ret
    }
    @scala.inline
    def withLayerName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layerName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLayerName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layerName")(js.undefined)
        ret
    }
    @scala.inline
    def withLayers(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLayers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layers")(js.undefined)
        ret
    }
  }
  
}

