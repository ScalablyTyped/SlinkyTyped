package typingsSlinky.openlayers.mod.olx.format

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.openlayers.mod.format.GMLBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WFSOptions extends js.Object {
  var featureNS: js.UndefOr[StringDictionary[String] | String] = js.native
  var featureType: js.UndefOr[js.Array[String] | String] = js.native
  var gmlFormat: js.UndefOr[GMLBase] = js.native
  var schemaLocation: js.UndefOr[String] = js.native
}

object WFSOptions {
  @scala.inline
  def apply(): WFSOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WFSOptions]
  }
  @scala.inline
  implicit class WFSOptionsOps[Self <: WFSOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFeatureNS(value: StringDictionary[String] | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("featureNS")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFeatureNS: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("featureNS")(js.undefined)
        ret
    }
    @scala.inline
    def withFeatureType(value: js.Array[String] | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("featureType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFeatureType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("featureType")(js.undefined)
        ret
    }
    @scala.inline
    def withGmlFormat(value: GMLBase): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gmlFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGmlFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gmlFormat")(js.undefined)
        ret
    }
    @scala.inline
    def withSchemaLocation(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("schemaLocation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSchemaLocation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("schemaLocation")(js.undefined)
        ret
    }
  }
  
}

