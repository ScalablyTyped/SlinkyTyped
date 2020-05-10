package typingsSlinky.openlayers.mod.olx.format

import typingsSlinky.openlayers.mod.GlobalObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WFSWriteTransactionOptions extends js.Object {
  var featureNS: String = js.native
  var featurePrefix: String = js.native
  var featureType: String = js.native
  var gmlOptions: js.UndefOr[GMLOptions] = js.native
  var handle: js.UndefOr[String] = js.native
  var nativeElements: js.Array[GlobalObject] = js.native
  var srsName: js.UndefOr[String] = js.native
}

object WFSWriteTransactionOptions {
  @scala.inline
  def apply(
    featureNS: String,
    featurePrefix: String,
    featureType: String,
    nativeElements: js.Array[GlobalObject]
  ): WFSWriteTransactionOptions = {
    val __obj = js.Dynamic.literal(featureNS = featureNS.asInstanceOf[js.Any], featurePrefix = featurePrefix.asInstanceOf[js.Any], featureType = featureType.asInstanceOf[js.Any], nativeElements = nativeElements.asInstanceOf[js.Any])
    __obj.asInstanceOf[WFSWriteTransactionOptions]
  }
  @scala.inline
  implicit class WFSWriteTransactionOptionsOps[Self <: WFSWriteTransactionOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFeatureNS(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("featureNS")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFeaturePrefix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("featurePrefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFeatureType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("featureType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNativeElements(value: js.Array[GlobalObject]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nativeElements")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGmlOptions(value: GMLOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gmlOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGmlOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gmlOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withHandle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHandle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handle")(js.undefined)
        ret
    }
    @scala.inline
    def withSrsName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("srsName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSrsName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("srsName")(js.undefined)
        ret
    }
  }
  
}

