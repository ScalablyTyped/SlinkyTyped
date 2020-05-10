package typingsSlinky.osmtogeojson.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  /**
    * If true, the resulting GeoJSON feature's properties will be a simple key-value list instead of a structured json object (with separate tags and metadata). default: false
    */
  var flatProperties: js.UndefOr[Boolean] = js.native
   //TODO: type function
  /**
    * Either a json object or callback function that is used to determine if a closed way should be treated as a Polygon or LineString.
    */
  var polygonFeatures: js.UndefOr[js.Any | js.Function] = js.native
  /**
    * Either a blacklist of tag keys or a callback function. Will be used to decide if a feature is interesting enough for its own GeoJSON feature.
    */
  var uninterestingTags: js.UndefOr[StringDictionary[Boolean] | js.Function] = js.native
  var verbose: js.UndefOr[Boolean] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFlatProperties(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flatProperties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFlatProperties: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flatProperties")(js.undefined)
        ret
    }
    @scala.inline
    def withPolygonFeatures(value: js.Any | js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("polygonFeatures")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPolygonFeatures: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("polygonFeatures")(js.undefined)
        ret
    }
    @scala.inline
    def withUninterestingTags(value: StringDictionary[Boolean] | js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uninterestingTags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUninterestingTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uninterestingTags")(js.undefined)
        ret
    }
    @scala.inline
    def withVerbose(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verbose")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVerbose: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verbose")(js.undefined)
        ret
    }
  }
  
}

