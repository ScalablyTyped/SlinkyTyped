package typingsSlinky.ol.wfsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WriteTransactionOptions extends js.Object {
  var featureNS: String = js.native
  var featurePrefix: String = js.native
  var featureType: String = js.native
  var gmlOptions: js.UndefOr[typingsSlinky.ol.gmlbaseMod.Options] = js.native
  var handle: js.UndefOr[String] = js.native
  var hasZ: js.UndefOr[Boolean] = js.native
  var nativeElements: js.Array[js.Object] = js.native
  var srsName: js.UndefOr[String] = js.native
  var version: js.UndefOr[String] = js.native
}

object WriteTransactionOptions {
  @scala.inline
  def apply(featureNS: String, featurePrefix: String, featureType: String, nativeElements: js.Array[js.Object]): WriteTransactionOptions = {
    val __obj = js.Dynamic.literal(featureNS = featureNS.asInstanceOf[js.Any], featurePrefix = featurePrefix.asInstanceOf[js.Any], featureType = featureType.asInstanceOf[js.Any], nativeElements = nativeElements.asInstanceOf[js.Any])
    __obj.asInstanceOf[WriteTransactionOptions]
  }
  @scala.inline
  implicit class WriteTransactionOptionsOps[Self <: WriteTransactionOptions] (val x: Self) extends AnyVal {
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
    def withNativeElements(value: js.Array[js.Object]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nativeElements")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGmlOptions(value: typingsSlinky.ol.gmlbaseMod.Options): Self = {
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
    def withHasZ(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasZ")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHasZ: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasZ")(js.undefined)
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
    @scala.inline
    def withVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(js.undefined)
        ret
    }
  }
  
}

