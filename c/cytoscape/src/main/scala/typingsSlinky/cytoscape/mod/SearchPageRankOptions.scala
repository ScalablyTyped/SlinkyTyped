package typingsSlinky.cytoscape.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * http://js.cytoscape.org/#eles.kruskal
  * trivial so implemented in the function
  */
/**
  * http://js.cytoscape.org/#eles.pageRank
  */
@js.native
trait SearchPageRankOptions extends js.Object {
  /** Numeric parameter for the algorithm. */
  var dampingFactor: js.UndefOr[Double] = js.native
  /** Maximum number of iterations to perform. */
  var iterations: js.UndefOr[Double] = js.native
  /** Numeric parameter that represents the required precision. */
  var precision: js.UndefOr[Double] = js.native
}

object SearchPageRankOptions {
  @scala.inline
  def apply(): SearchPageRankOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchPageRankOptions]
  }
  @scala.inline
  implicit class SearchPageRankOptionsOps[Self <: SearchPageRankOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDampingFactor(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dampingFactor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDampingFactor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dampingFactor")(js.undefined)
        ret
    }
    @scala.inline
    def withIterations(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iterations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIterations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iterations")(js.undefined)
        ret
    }
    @scala.inline
    def withPrecision(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("precision")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrecision: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("precision")(js.undefined)
        ret
    }
  }
  
}

