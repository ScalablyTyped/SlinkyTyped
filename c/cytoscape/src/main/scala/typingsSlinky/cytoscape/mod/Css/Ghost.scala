package typingsSlinky.cytoscape.mod.Css

import typingsSlinky.cytoscape.cytoscapeStrings.no
import typingsSlinky.cytoscape.cytoscapeStrings.yes
import typingsSlinky.cytoscape.mod.NodeSingular
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The ghost properties allow for creating a ghosting effect, a semitransparent duplicate of the element drawn at an offset.
  * https://js.cytoscape.org/#style/ghost
  */
@js.native
trait Ghost extends js.Object {
  /**
    * Whether to use the ghost effect; may be yes or no.
    */
  var ghost: PropertyValueNode[yes | no] = js.native
  /**
    * The horizontal offset used to position the ghost effect.
    */
  var `ghost-offset-x`: PropertyValueNode[Double] = js.native
  /**
    * The vertical offset used to position the ghost effect.
    */
  var `ghost-offset-y`: PropertyValueNode[Double] = js.native
  /**
    * The opacity of the ghost effect.
    */
  var `ghost-opacity`: PropertyValueNode[Double] = js.native
}

object Ghost {
  @scala.inline
  def apply(
    ghost: PropertyValueNode[yes | no],
    `ghost-offset-x`: PropertyValueNode[Double],
    `ghost-offset-y`: PropertyValueNode[Double],
    `ghost-opacity`: PropertyValueNode[Double]
  ): Ghost = {
    val __obj = js.Dynamic.literal(ghost = ghost.asInstanceOf[js.Any])
    __obj.updateDynamic("ghost-offset-x")(`ghost-offset-x`.asInstanceOf[js.Any])
    __obj.updateDynamic("ghost-offset-y")(`ghost-offset-y`.asInstanceOf[js.Any])
    __obj.updateDynamic("ghost-opacity")(`ghost-opacity`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ghost]
  }
  @scala.inline
  implicit class GhostOps[Self <: Ghost] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGhostFunction1(value: NodeSingular => yes | no): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ghost")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGhost(value: PropertyValueNode[yes | no]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ghost")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withGhost-offset-xFunction1`(value: NodeSingular => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ghost-offset-x")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def `withGhost-offset-x`(value: PropertyValueNode[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ghost-offset-x")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withGhost-offset-yFunction1`(value: NodeSingular => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ghost-offset-y")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def `withGhost-offset-y`(value: PropertyValueNode[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ghost-offset-y")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withGhost-opacityFunction1`(value: NodeSingular => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ghost-opacity")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def `withGhost-opacity`(value: PropertyValueNode[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ghost-opacity")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

