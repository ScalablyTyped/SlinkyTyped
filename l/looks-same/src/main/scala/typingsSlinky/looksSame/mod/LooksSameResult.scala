package typingsSlinky.looksSame.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The result obtained from the function.
*/
@js.native
trait LooksSameResult extends js.Object {
  /**
    * diff bounds for not equal images
    */
  var diffBounds: js.UndefOr[CoordBounds] = js.native
  /**
    * diff clusters for not equal images
    */
  var diffClusters: js.UndefOr[js.Array[CoordBounds]] = js.native
  /**
    * true if images are equal, false - otherwise
    */
  var equal: js.UndefOr[Boolean] = js.native
}

object LooksSameResult {
  @scala.inline
  def apply(): LooksSameResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LooksSameResult]
  }
  @scala.inline
  implicit class LooksSameResultOps[Self <: LooksSameResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDiffBounds(value: CoordBounds): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("diffBounds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDiffBounds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("diffBounds")(js.undefined)
        ret
    }
    @scala.inline
    def withDiffClusters(value: js.Array[CoordBounds]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("diffClusters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDiffClusters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("diffClusters")(js.undefined)
        ret
    }
    @scala.inline
    def withEqual(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("equal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEqual: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("equal")(js.undefined)
        ret
    }
  }
  
}

