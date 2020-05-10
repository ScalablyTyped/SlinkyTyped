package typingsSlinky.heredatalens.H.datalens.ObjectLayer

import typingsSlinky.heredatalens.H.datalens.QueryTileProvider.Zoom
import typingsSlinky.heredatalens.H.datalens.Service.Data
import typingsSlinky.heremaps.H.map.Object
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Defines data processing and data-driven styling for ObjectLayer
  * The initial step of rendering is to split the tile data by rows, where each row represents a bucket.
  * By default this step is processed with ObjectLayer.defaultDataToRows. This behavior can be changed by defining the dataToRows callback.
  * In the next step each row must be presented as a map object with the rowToMapObject callback. Data-driven styling can be provided with the rowToStyle callback.
  */
@js.native
trait Options extends js.Object {
  /** When present, client-side clustering is applied */
  var clustering: js.UndefOr[Clustering] = js.native
  /** Defines quantization of data for improving data-driven styling performance */
  var dataDomains: js.UndefOr[DataDomains] = js.native
  /** Defines how the input data is split by rows. You can specify this callback to define client-side aggregation and filtering. */
  var dataToRows: js.UndefOr[js.Function1[/* data */ Data, js.Array[Row]]] = js.native
  /**
    * Defines map object style and icon according to data row and zoom level.
    * Also it can define different styles depending on the StyleState (eg hovered, selected).
    */
  var rowToStyle: js.UndefOr[
    js.Function3[/* row */ Row, /* z */ Zoom, /* styleState */ StyleState, ObjectStyleOptions]
  ] = js.native
  /** Defines how each row is presented on the map (eg marker, polygon) */
  def rowToMapObject(row: Row, z: Zoom): Object = js.native
}

object Options {
  @scala.inline
  def apply(rowToMapObject: (Row, Zoom) => Object): Options = {
    val __obj = js.Dynamic.literal(rowToMapObject = js.Any.fromFunction2(rowToMapObject))
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRowToMapObject(value: (Row, Zoom) => Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowToMapObject")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withClustering(value: Clustering): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clustering")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClustering: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clustering")(js.undefined)
        ret
    }
    @scala.inline
    def withDataDomains(value: DataDomains): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataDomains")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataDomains: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataDomains")(js.undefined)
        ret
    }
    @scala.inline
    def withDataToRows(value: /* data */ Data => js.Array[Row]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataToRows")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutDataToRows: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataToRows")(js.undefined)
        ret
    }
    @scala.inline
    def withRowToStyle(value: (/* row */ Row, /* z */ Zoom, /* styleState */ StyleState) => ObjectStyleOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowToStyle")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutRowToStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowToStyle")(js.undefined)
        ret
    }
  }
  
}

