package typingsSlinky.osrm.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  /**
    * Limits the search to segments with given bearing in degrees towards true north in clockwise direction. Null or array with [{value},{range}]
    */
  var bearings: js.UndefOr[js.Array[Bearing] | Null] = js.native
  /**
    * The coordinates this request will use. Array with [{lon},{lat}] values, in decimal degrees.
    */
  var coordinates: js.UndefOr[js.Array[Coordinate]] = js.native
  /**
    * Adds a Hint to the response which can be used in subsequent requests, see hints parameter.
    */
  var generate_hints: js.UndefOr[Boolean] = js.native
  /**
    * Hint to derive position in street network. Base64 string
    */
  var hints: js.UndefOr[js.Array[Hint]] = js.native
  /**
    * Limits the search to given radius in meters. null or double >= 0 or unlimited (default)
    */
  var radiuses: js.UndefOr[js.Array[Radius] | Null] = js.native
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
    def withBearings(value: js.Array[Bearing]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bearings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBearings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bearings")(js.undefined)
        ret
    }
    @scala.inline
    def withBearingsNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bearings")(null)
        ret
    }
    @scala.inline
    def withCoordinates(value: js.Array[Coordinate]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coordinates")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCoordinates: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coordinates")(js.undefined)
        ret
    }
    @scala.inline
    def withGenerate_hints(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("generate_hints")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGenerate_hints: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("generate_hints")(js.undefined)
        ret
    }
    @scala.inline
    def withHints(value: js.Array[Hint]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hints")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHints: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hints")(js.undefined)
        ret
    }
    @scala.inline
    def withRadiuses(value: js.Array[Radius]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("radiuses")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRadiuses: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("radiuses")(js.undefined)
        ret
    }
    @scala.inline
    def withRadiusesNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("radiuses")(null)
        ret
    }
  }
  
}

