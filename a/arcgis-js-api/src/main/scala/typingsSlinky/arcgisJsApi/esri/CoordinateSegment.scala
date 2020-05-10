package typingsSlinky.arcgisJsApi.esri

import typingsSlinky.std.Object
import typingsSlinky.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CoordinateSegment extends Object {
  /**
    * A string that provides the name for this segment of a coordinate string.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-CoordinateConversion-support-Format.html#CoordinateSegment)
    */
  var alias: String = js.native
  /**
    * A string that describes the role of this segment.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-CoordinateConversion-support-Format.html#CoordinateSegment)
    */
  var description: String = js.native
  /**
    * A regular expression that should extract this segment from the complete coordinate.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-CoordinateConversion-support-Format.html#CoordinateSegment)
    */
  var searchPattern: js.RegExp = js.native
}

object CoordinateSegment {
  @scala.inline
  def apply(
    alias: String,
    constructor: js.Function,
    description: String,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    searchPattern: js.RegExp
  ): CoordinateSegment = {
    val __obj = js.Dynamic.literal(alias = alias.asInstanceOf[js.Any], constructor = constructor.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), searchPattern = searchPattern.asInstanceOf[js.Any])
    __obj.asInstanceOf[CoordinateSegment]
  }
  @scala.inline
  implicit class CoordinateSegmentOps[Self <: CoordinateSegment] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlias(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alias")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSearchPattern(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchPattern")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

