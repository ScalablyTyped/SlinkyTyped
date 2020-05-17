package typingsSlinky.reactInstantsearchCore.mod

import typingsSlinky.reactInstantsearchCore.anon.Lat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GeoSearchProvided[THit] extends js.Object {
  /** the refinement currently applied */
  var currentRefinement: NESW = js.native
  /** the records that matched the search */
  var hits: js.Array[THit] = js.native
  /** true if the current refinement is set with the map bounds */
  var isRefinedWithMap: Boolean = js.native
  /** the position of the search */
  var position: Lat = js.native
  /** a function to generate a URL for the corresponding search state */
  def createURL(args: js.Any*): js.Any = js.native
  /** a function to toggle the refinement */
  def refine(refinement: NESW): Unit = js.native
}

object GeoSearchProvided {
  @scala.inline
  def apply[THit](
    createURL: /* repeated */ js.Any => js.Any,
    currentRefinement: NESW,
    hits: js.Array[THit],
    isRefinedWithMap: Boolean,
    position: Lat,
    refine: NESW => Unit
  ): GeoSearchProvided[THit] = {
    val __obj = js.Dynamic.literal(createURL = js.Any.fromFunction1(createURL), currentRefinement = currentRefinement.asInstanceOf[js.Any], hits = hits.asInstanceOf[js.Any], isRefinedWithMap = isRefinedWithMap.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], refine = js.Any.fromFunction1(refine))
    __obj.asInstanceOf[GeoSearchProvided[THit]]
  }
  @scala.inline
  implicit class GeoSearchProvidedOps[Self[thit] <: GeoSearchProvided[thit], THit] (val x: Self[THit]) extends AnyVal {
    @scala.inline
    def duplicate: Self[THit] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[THit]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[THit] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[THit] with Other]
    @scala.inline
    def withCreateURL(value: /* repeated */ js.Any => js.Any): Self[THit] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createURL")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCurrentRefinement(value: NESW): Self[THit] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentRefinement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHits(value: js.Array[THit]): Self[THit] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hits")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsRefinedWithMap(value: Boolean): Self[THit] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isRefinedWithMap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPosition(value: Lat): Self[THit] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRefine(value: NESW => Unit): Self[THit] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refine")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

