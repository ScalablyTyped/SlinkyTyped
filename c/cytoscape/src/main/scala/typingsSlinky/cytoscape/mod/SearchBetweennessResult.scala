package typingsSlinky.cytoscape.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * http://js.cytoscape.org/#eles.betweennessCentrality
  */
@js.native
trait SearchBetweennessResult extends js.Object {
  /** returns the betweenness centrality of the specified node */
  def betweenness(node: NodeSingular): Double = js.native
  def betweennessNormalised(node: NodeSingular): Double = js.native
  /** returns the normalised betweenness centrality of the specified node */
  def betweennessNormalized(node: NodeSingular): Double = js.native
}

object SearchBetweennessResult {
  @scala.inline
  def apply(
    betweenness: NodeSingular => Double,
    betweennessNormalised: NodeSingular => Double,
    betweennessNormalized: NodeSingular => Double
  ): SearchBetweennessResult = {
    val __obj = js.Dynamic.literal(betweenness = js.Any.fromFunction1(betweenness), betweennessNormalised = js.Any.fromFunction1(betweennessNormalised), betweennessNormalized = js.Any.fromFunction1(betweennessNormalized))
    __obj.asInstanceOf[SearchBetweennessResult]
  }
  @scala.inline
  implicit class SearchBetweennessResultOps[Self <: SearchBetweennessResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBetweenness(value: NodeSingular => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("betweenness")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withBetweennessNormalised(value: NodeSingular => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("betweennessNormalised")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withBetweennessNormalized(value: NodeSingular => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("betweennessNormalized")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

