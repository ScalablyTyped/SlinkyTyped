package typingsSlinky.appleMapkitJs.mapkit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The result of an autocomplete query, including display lines and a coordinate.
  */
@js.native
trait SearchAutocompleteResult extends js.Object {
  /**
    * The coordinate of the result, provided when it corresponds to a single place.
    */
  var coordinate: Coordinate = js.native
  /**
    * Lines of text to display to the user in an autocomplete menu.
    */
  var displayLines: js.Array[String] = js.native
}

object SearchAutocompleteResult {
  @scala.inline
  def apply(coordinate: Coordinate, displayLines: js.Array[String]): SearchAutocompleteResult = {
    val __obj = js.Dynamic.literal(coordinate = coordinate.asInstanceOf[js.Any], displayLines = displayLines.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchAutocompleteResult]
  }
  @scala.inline
  implicit class SearchAutocompleteResultOps[Self <: SearchAutocompleteResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCoordinate(value: Coordinate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coordinate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisplayLines(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayLines")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

