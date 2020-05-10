package typingsSlinky.cytoscape.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * http://js.cytoscape.org/#eles.closenessCentrality
  * trivial
  */
/**
  * http://js.cytoscape.org/#eles.closenessCentralityNormalized
  */
/**
  * http://js.cytoscape.org/#eles.closenessCentralityNormalized
  */
@js.native
trait SearchClosenessCentralityNormalizedOptions extends js.Object {
  var directed: js.UndefOr[Boolean] = js.native
  /**
    * A boolean indicating whether the algorithm calculates the
    * harmonic mean (true, default) or the arithmetic mean (false) of distances.
    * The harmonic mean is very useful for graphs that are not strongly connected.
    */
  var harmonic: js.UndefOr[Boolean] = js.native
  /**  A function that returns the weight for the edge. */
  var weight: js.UndefOr[js.Function1[/* edge */ EdgeSingular, Double]] = js.native
}

object SearchClosenessCentralityNormalizedOptions {
  @scala.inline
  def apply(): SearchClosenessCentralityNormalizedOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchClosenessCentralityNormalizedOptions]
  }
  @scala.inline
  implicit class SearchClosenessCentralityNormalizedOptionsOps[Self <: SearchClosenessCentralityNormalizedOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDirected(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("directed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDirected: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("directed")(js.undefined)
        ret
    }
    @scala.inline
    def withHarmonic(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("harmonic")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHarmonic: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("harmonic")(js.undefined)
        ret
    }
    @scala.inline
    def withWeight(value: /* edge */ EdgeSingular => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weight")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutWeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weight")(js.undefined)
        ret
    }
  }
  
}

