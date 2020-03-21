package typingsSlinky.cytoscape.mod.Css

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The shape of the node’s body.
  * Note that each shape fits within the specified width and height,
  * and so you may have to adjust width and height
  * if you desire an equilateral shape
  * (i.e. width !== height for several equilateral shapes).
  * 'polygon' is a custom polygon specified via shape-polygon-points.
  */
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.cytoscape.cytoscapeStrings.rectangle
  - typingsSlinky.cytoscape.cytoscapeStrings.roundrectangle
  - typingsSlinky.cytoscape.cytoscapeStrings.ellipse
  - typingsSlinky.cytoscape.cytoscapeStrings.triangle
  - typingsSlinky.cytoscape.cytoscapeStrings.pentagon
  - typingsSlinky.cytoscape.cytoscapeStrings.hexagon
  - typingsSlinky.cytoscape.cytoscapeStrings.heptagon
  - typingsSlinky.cytoscape.cytoscapeStrings.octagon
  - typingsSlinky.cytoscape.cytoscapeStrings.star
  - typingsSlinky.cytoscape.cytoscapeStrings.diamond
  - typingsSlinky.cytoscape.cytoscapeStrings.vee
  - typingsSlinky.cytoscape.cytoscapeStrings.rhomboid
  - typingsSlinky.cytoscape.cytoscapeStrings.polygon
  - typingsSlinky.cytoscape.cytoscapeStrings.`round-rectangle`
  - typingsSlinky.cytoscape.cytoscapeStrings.`round-triangle`
  - typingsSlinky.cytoscape.cytoscapeStrings.`round-diamond`
  - typingsSlinky.cytoscape.cytoscapeStrings.`round-pentagon`
  - typingsSlinky.cytoscape.cytoscapeStrings.`round-hexagon`
  - typingsSlinky.cytoscape.cytoscapeStrings.`round-heptagon`
  - typingsSlinky.cytoscape.cytoscapeStrings.`round-octagon`
  - typingsSlinky.cytoscape.cytoscapeStrings.`round-tag`
*/
trait NodeShape extends js.Object

object NodeShape {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def diamond: typingsSlinky.cytoscape.cytoscapeStrings.diamond = this.cast("diamond")
  @scala.inline
  def ellipse: typingsSlinky.cytoscape.cytoscapeStrings.ellipse = this.cast("ellipse")
  @scala.inline
  def heptagon: typingsSlinky.cytoscape.cytoscapeStrings.heptagon = this.cast("heptagon")
  @scala.inline
  def hexagon: typingsSlinky.cytoscape.cytoscapeStrings.hexagon = this.cast("hexagon")
  @scala.inline
  def octagon: typingsSlinky.cytoscape.cytoscapeStrings.octagon = this.cast("octagon")
  @scala.inline
  def pentagon: typingsSlinky.cytoscape.cytoscapeStrings.pentagon = this.cast("pentagon")
  @scala.inline
  def polygon: typingsSlinky.cytoscape.cytoscapeStrings.polygon = this.cast("polygon")
  @scala.inline
  def rectangle: typingsSlinky.cytoscape.cytoscapeStrings.rectangle = this.cast("rectangle")
  @scala.inline
  def rhomboid: typingsSlinky.cytoscape.cytoscapeStrings.rhomboid = this.cast("rhomboid")
  @scala.inline
  def `round-diamond`: typingsSlinky.cytoscape.cytoscapeStrings.`round-diamond` = this.cast("round-diamond")
  @scala.inline
  def `round-heptagon`: typingsSlinky.cytoscape.cytoscapeStrings.`round-heptagon` = this.cast("round-heptagon")
  @scala.inline
  def `round-hexagon`: typingsSlinky.cytoscape.cytoscapeStrings.`round-hexagon` = this.cast("round-hexagon")
  @scala.inline
  def `round-octagon`: typingsSlinky.cytoscape.cytoscapeStrings.`round-octagon` = this.cast("round-octagon")
  @scala.inline
  def `round-pentagon`: typingsSlinky.cytoscape.cytoscapeStrings.`round-pentagon` = this.cast("round-pentagon")
  @scala.inline
  def `round-rectangle`: typingsSlinky.cytoscape.cytoscapeStrings.`round-rectangle` = this.cast("round-rectangle")
  @scala.inline
  def `round-tag`: typingsSlinky.cytoscape.cytoscapeStrings.`round-tag` = this.cast("round-tag")
  @scala.inline
  def `round-triangle`: typingsSlinky.cytoscape.cytoscapeStrings.`round-triangle` = this.cast("round-triangle")
  @scala.inline
  def roundrectangle: typingsSlinky.cytoscape.cytoscapeStrings.roundrectangle = this.cast("roundrectangle")
  @scala.inline
  def star: typingsSlinky.cytoscape.cytoscapeStrings.star = this.cast("star")
  @scala.inline
  def triangle: typingsSlinky.cytoscape.cytoscapeStrings.triangle = this.cast("triangle")
  @scala.inline
  def vee: typingsSlinky.cytoscape.cytoscapeStrings.vee = this.cast("vee")
}

