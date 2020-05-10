package typingsSlinky.dojo.dojox.geo.openlayers.base

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/geo/openlayers/_base.__JsonImportArgs.html
  *
  * The keyword arguments that can be passed in a JsonImport constructor.
  *
  */
@js.native
trait JsonImportArgs extends js.Object {
  /**
    * Error callback called if something fails.
    *
    */
  var error: js.Function = js.native
  /**
    * The function called each time a feature is read. The function is called with a GeometryFeature as argument.
    *
    */
  var nextFeature: js.Function = js.native
  /**
    * The url pointing to the JSON file to load.
    *
    */
  var url: String = js.native
}

object JsonImportArgs {
  @scala.inline
  def apply(error: js.Function, nextFeature: js.Function, url: String): JsonImportArgs = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], nextFeature = nextFeature.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[JsonImportArgs]
  }
  @scala.inline
  implicit class JsonImportArgsOps[Self <: JsonImportArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withError(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNextFeature(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextFeature")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

