package typingsSlinky.bingmaps.Microsoft.Maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IGeoXmlLayerOptions extends IGeoXmlReadOptions {
  /** A boolean indicating if the map should automatically upate the view when a data set is loaded. Default: true */
  var autoUpdateMapView: js.UndefOr[Boolean] = js.native
  /** Options used to customize how the default infobox renders. */
  var infoboxOptions: js.UndefOr[IInfoboxOptions] = js.native
  /** An optional name to identify the layer by. */
  var layerName: js.UndefOr[String] = js.native
  /** A boolean indicating if infoboxes should automatically appear when shapes clicked. Default: false */
  var suppressInfoboxes: js.UndefOr[Boolean] = js.native
  /** A boolean indicating if the layer is visible or not. Default: true */
  var visible: js.UndefOr[Boolean] = js.native
}

object IGeoXmlLayerOptions {
  @scala.inline
  def apply(): IGeoXmlLayerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IGeoXmlLayerOptions]
  }
  @scala.inline
  implicit class IGeoXmlLayerOptionsOps[Self <: IGeoXmlLayerOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutoUpdateMapView(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoUpdateMapView")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoUpdateMapView: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoUpdateMapView")(js.undefined)
        ret
    }
    @scala.inline
    def withInfoboxOptions(value: IInfoboxOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("infoboxOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInfoboxOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("infoboxOptions")(js.undefined)
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
    def withSuppressInfoboxes(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suppressInfoboxes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSuppressInfoboxes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suppressInfoboxes")(js.undefined)
        ret
    }
    @scala.inline
    def withVisible(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisible: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visible")(js.undefined)
        ret
    }
  }
  
}

