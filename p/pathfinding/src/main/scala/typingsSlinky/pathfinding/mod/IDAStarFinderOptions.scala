package typingsSlinky.pathfinding.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDAStarFinderOptions extends FinderOptions {
  var timeLimit: js.UndefOr[Double] = js.native
  var trackRecursion: js.UndefOr[Boolean] = js.native
}

object IDAStarFinderOptions {
  @scala.inline
  def apply(): IDAStarFinderOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDAStarFinderOptions]
  }
  @scala.inline
  implicit class IDAStarFinderOptionsOps[Self <: IDAStarFinderOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTimeLimit(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeLimit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeLimit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeLimit")(js.undefined)
        ret
    }
    @scala.inline
    def withTrackRecursion(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trackRecursion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrackRecursion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trackRecursion")(js.undefined)
        ret
    }
  }
  
}

