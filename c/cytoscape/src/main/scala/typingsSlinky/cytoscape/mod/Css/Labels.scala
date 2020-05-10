package typingsSlinky.cytoscape.mod.Css

import typingsSlinky.cytoscape.cytoscapeStrings.bottom
import typingsSlinky.cytoscape.cytoscapeStrings.center
import typingsSlinky.cytoscape.cytoscapeStrings.ellipsis
import typingsSlinky.cytoscape.cytoscapeStrings.left
import typingsSlinky.cytoscape.cytoscapeStrings.no
import typingsSlinky.cytoscape.cytoscapeStrings.none
import typingsSlinky.cytoscape.cytoscapeStrings.rectangle
import typingsSlinky.cytoscape.cytoscapeStrings.right
import typingsSlinky.cytoscape.cytoscapeStrings.roundrectangle
import typingsSlinky.cytoscape.cytoscapeStrings.top
import typingsSlinky.cytoscape.cytoscapeStrings.wrap
import typingsSlinky.cytoscape.cytoscapeStrings.yes
import typingsSlinky.cytoscape.mod.EdgeSingular
import typingsSlinky.cytoscape.mod.NodeSingular
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Labels
  * Label text:
  *
  * http://js.cytoscape.org/#style/labels
  */
@js.native
trait Labels[SingularType /* <: NodeSingular | EdgeSingular */] extends js.Object {
  /**
    * Basic font styling:
    */
  /**
    * The colour of the element’s label.
    */
  var color: PropertyValue[SingularType, Colour] = js.native
  /**
    * A comma-separated list of font names to use on the label text.
    */
  var `font-family`: PropertyValue[SingularType, String] = js.native
  /**
    * The size of the label text.
    * https://developer.mozilla.org/en-US/docs/Web/CSS/font-family
    */
  var `font-size`: PropertyValue[SingularType, Double | String] = js.native
  /**
    * A CSS font style to be applied to the label text.
    * https://developer.mozilla.org/en-US/docs/Web/CSS/font-style
    */
  var `font-style`: PropertyValue[SingularType, FontStyle] = js.native
  /**
    * A CSS font weight to be applied to the label text.
    */
  var `font-weight`: PropertyValue[SingularType, FontWeight] = js.native
  /**
    * The text to display for an element’s label.
    */
  var label: PropertyValue[SingularType, String] = js.native
  /**
    * Interactivity:
    */
  /**
    * If zooming makes the effective font size of the label smaller than this,
    * then no label is shown.Note that because of performance optimisations,
    * the label may be shown at font sizes slightly smaller than this value.
    *
    * This effect is more pronounced at larger screen pixel ratios.However,
    * it is guaranteed that the label will be shown at sizes equal to or greater than the value specified.
    */
  var `min-zoomed-font-size`: PropertyValue[SingularType, Double] = js.native
  /**
    * The text to display for an edge’s source label.
    */
  var `source-label`: PropertyValue[SingularType, String] = js.native
  /**
    * (For the source label of an edge.)
    */
  var `source-text-margin-x`: PropertyValue[SingularType, Double] = js.native
  /**
    * (For the source label of an edge.)
    */
  var `source-text-margin-y`: PropertyValue[SingularType, Double] = js.native
  /**
    * Edge label alignment:
    */
  /**
    * For the source label of an edge, how far from the source node the label should be placed.
    */
  var `source-text-offset`: PropertyValue[SingularType, Double] = js.native
  /**
    * (For the source label of an edge.)
    */
  var `source-text-rotation`: PropertyValue[SingularType, Double] = js.native
  /**
    * The text to display for an edge’s target label.
    */
  var `target-label`: PropertyValue[SingularType, String] = js.native
  /**
    * (For the target label of an edge.)
    */
  var `target-text-margin-x`: PropertyValue[SingularType, Double] = js.native
  /**
    * (For the target label of an edge.)
    */
  var `target-text-margin-y`: PropertyValue[SingularType, Double] = js.native
  /**
    * For the target label of an edge, how far from the target node the label should be placed.
    */
  var `target-text-offset`: PropertyValue[SingularType, Double] = js.native
  /**
    * (For the target label of an edge.)
    */
  var `target-text-rotation`: PropertyValue[SingularType, Double] = js.native
  /**
    * A colour to apply on the text background.
    */
  var `text-background-color`: PropertyValue[SingularType, Colour] = js.native
  /**
    * The opacity of the label background; the background is disabled for 0 (default value).
    */
  var `text-background-opacity`: PropertyValue[SingularType, Double] = js.native
  /**
    * Background:
    */
  /**
    * The padding provides visual spacing between the text and the edge of the background.
    */
  var `text-background-padding`: PropertyValue[SingularType, String] = js.native
  /**
    * The shape to use for the label background.
    */
  var `text-background-shape`: PropertyValue[SingularType, rectangle | roundrectangle] = js.native
  /**
    * The colour of the border around the label.
    */
  var `text-border-color`: PropertyValue[SingularType, Colour] = js.native
  /**
    * Border:
    */
  /**
    * The width of the border around the label; the border is disabled for 0 (default value).
    */
  var `text-border-opacity`: PropertyValue[SingularType, Double] = js.native
  /**
    * The style of the border around the label.
    */
  var `text-border-style`: PropertyValue[SingularType, LineStyle] = js.native
  /**
    * The width of the border around the label.
    */
  var `text-border-width`: PropertyValue[SingularType, Double] = js.native
  /**
    * Whether events should occur on an element if the label receives an event.
    * You may want a style applied to the text onactive so you know the text is activatable.
    */
  var `text-events`: PropertyValue[SingularType, yes | no] = js.native
  /**
    * Node label alignment:
    */
  /**
    * The vertical alignment of a node’s label.
    */
  var `text-halign`: PropertyValue[SingularType, left | center | right] = js.native
  /**
    * Margins:
    */
  /**
    * A margin that shifts the label along the x- axis.
    */
  var `text-margin-x`: PropertyValue[SingularType, Double] = js.native
  /**
    * A margin that shifts the label along the y- axis.
    */
  var `text-margin-y`: PropertyValue[SingularType, Double] = js.native
  /**
    * The maximum width for wrapped text,
    * applied when "text-wrap" is set to wrap.
    * For only manual newlines (i.e.\n), set a very large
    * value like 1000px such that only your newline characters would apply.
    */
  var `text-max-width`: PropertyValue[SingularType, String] = js.native
  /**
    * The opacity of the label text, including its outline.
    */
  var `text-opacity`: PropertyValue[SingularType, Double] = js.native
  /**
    * Outline:
    */
  /**
    * The colour of the outline around the element’s label text.
    */
  var `text-outline-color`: PropertyValue[SingularType, Colour] = js.native
  /**
    * The opacity of the outline on label text.
    */
  var `text-outline-opacity`: PropertyValue[SingularType, Double] = js.native
  /**
    * The size of the outline on label text.
    */
  var `text-outline-width`: PropertyValue[SingularType, Double | String] = js.native
  /**
    * Rotating text:
    */
  /**
    * A rotation angle that is applied to the label.
    *  * For edges, the special value autorotate can be used to align the label to the edge.
    *  * For nodes, the label is rotated along its anchor point on the node, so a label margin may help for some usecases.
    *  * The special value none can be used to denote 0deg.
    *  * Rotations works best with left- to - right text.
    */
  var `text-rotation`: PropertyValue[SingularType, Double] = js.native
  /**
    * Shadow:
    */
  /**
    * The shadow blur distance.
    */
  var `text-shadow-blur`: PropertyValue[SingularType, Double] = js.native
  /**
    * The colour of the shadow.
    */
  var `text-shadow-color`: PropertyValue[SingularType, Colour] = js.native
  /**
    * The x offset relative to the text where the shadow will be displayed, can be negative.
    * If you set blur to 0, add an offset to view your shadow.
    */
  var `text-shadow-offset-x`: PropertyValue[SingularType, Double] = js.native
  /**
    * The y offset relative to the text where the shadow will be displayed, can be negative.
    * If you set blur to 0, add an offset to view your shadow.
    */
  var `text-shadow-offset-y`: PropertyValue[SingularType, Double] = js.native
  /**
    * The opacity of the shadow on the text; the shadow is disabled for 0 (default value).
    */
  var `text-shadow-opacity`: PropertyValue[SingularType, Double] = js.native
  /**
    * A transformation to apply to the label text.
    */
  var `text-transform`: PropertyValue[SingularType, TextTranformation] = js.native
  /**
    * The vertical alignment of a node’s label.
    */
  var `text-valign`: PropertyValue[SingularType, top | center | bottom] = js.native
  /**
    * Wrapping text:
    */
  /**
    * A wrapping style to apply to the label text; may be
    *  * "none" for no wrapping (including manual newlines ) or
    *  * "wrap" for manual and/ or autowrapping.
    */
  var `text-wrap`: PropertyValue[SingularType, none | wrap | ellipsis] = js.native
}

object Labels {
  @scala.inline
  def apply[SingularType](
    color: PropertyValue[SingularType, Colour],
    `font-family`: PropertyValue[SingularType, String],
    `font-size`: PropertyValue[SingularType, Double | String],
    `font-style`: PropertyValue[SingularType, FontStyle],
    `font-weight`: PropertyValue[SingularType, FontWeight],
    label: PropertyValue[SingularType, String],
    `min-zoomed-font-size`: PropertyValue[SingularType, Double],
    `source-label`: PropertyValue[SingularType, String],
    `source-text-margin-x`: PropertyValue[SingularType, Double],
    `source-text-margin-y`: PropertyValue[SingularType, Double],
    `source-text-offset`: PropertyValue[SingularType, Double],
    `source-text-rotation`: PropertyValue[SingularType, Double],
    `target-label`: PropertyValue[SingularType, String],
    `target-text-margin-x`: PropertyValue[SingularType, Double],
    `target-text-margin-y`: PropertyValue[SingularType, Double],
    `target-text-offset`: PropertyValue[SingularType, Double],
    `target-text-rotation`: PropertyValue[SingularType, Double],
    `text-background-color`: PropertyValue[SingularType, Colour],
    `text-background-opacity`: PropertyValue[SingularType, Double],
    `text-background-padding`: PropertyValue[SingularType, String],
    `text-background-shape`: PropertyValue[SingularType, rectangle | roundrectangle],
    `text-border-color`: PropertyValue[SingularType, Colour],
    `text-border-opacity`: PropertyValue[SingularType, Double],
    `text-border-style`: PropertyValue[SingularType, LineStyle],
    `text-border-width`: PropertyValue[SingularType, Double],
    `text-events`: PropertyValue[SingularType, yes | no],
    `text-halign`: PropertyValue[SingularType, left | center | right],
    `text-margin-x`: PropertyValue[SingularType, Double],
    `text-margin-y`: PropertyValue[SingularType, Double],
    `text-max-width`: PropertyValue[SingularType, String],
    `text-opacity`: PropertyValue[SingularType, Double],
    `text-outline-color`: PropertyValue[SingularType, Colour],
    `text-outline-opacity`: PropertyValue[SingularType, Double],
    `text-outline-width`: PropertyValue[SingularType, Double | String],
    `text-rotation`: PropertyValue[SingularType, Double],
    `text-shadow-blur`: PropertyValue[SingularType, Double],
    `text-shadow-color`: PropertyValue[SingularType, Colour],
    `text-shadow-offset-x`: PropertyValue[SingularType, Double],
    `text-shadow-offset-y`: PropertyValue[SingularType, Double],
    `text-shadow-opacity`: PropertyValue[SingularType, Double],
    `text-transform`: PropertyValue[SingularType, TextTranformation],
    `text-valign`: PropertyValue[SingularType, top | center | bottom],
    `text-wrap`: PropertyValue[SingularType, none | wrap | ellipsis]
  ): Labels[SingularType] = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.updateDynamic("font-family")(`font-family`.asInstanceOf[js.Any])
    __obj.updateDynamic("font-size")(`font-size`.asInstanceOf[js.Any])
    __obj.updateDynamic("font-style")(`font-style`.asInstanceOf[js.Any])
    __obj.updateDynamic("font-weight")(`font-weight`.asInstanceOf[js.Any])
    __obj.updateDynamic("min-zoomed-font-size")(`min-zoomed-font-size`.asInstanceOf[js.Any])
    __obj.updateDynamic("source-label")(`source-label`.asInstanceOf[js.Any])
    __obj.updateDynamic("source-text-margin-x")(`source-text-margin-x`.asInstanceOf[js.Any])
    __obj.updateDynamic("source-text-margin-y")(`source-text-margin-y`.asInstanceOf[js.Any])
    __obj.updateDynamic("source-text-offset")(`source-text-offset`.asInstanceOf[js.Any])
    __obj.updateDynamic("source-text-rotation")(`source-text-rotation`.asInstanceOf[js.Any])
    __obj.updateDynamic("target-label")(`target-label`.asInstanceOf[js.Any])
    __obj.updateDynamic("target-text-margin-x")(`target-text-margin-x`.asInstanceOf[js.Any])
    __obj.updateDynamic("target-text-margin-y")(`target-text-margin-y`.asInstanceOf[js.Any])
    __obj.updateDynamic("target-text-offset")(`target-text-offset`.asInstanceOf[js.Any])
    __obj.updateDynamic("target-text-rotation")(`target-text-rotation`.asInstanceOf[js.Any])
    __obj.updateDynamic("text-background-color")(`text-background-color`.asInstanceOf[js.Any])
    __obj.updateDynamic("text-background-opacity")(`text-background-opacity`.asInstanceOf[js.Any])
    __obj.updateDynamic("text-background-padding")(`text-background-padding`.asInstanceOf[js.Any])
    __obj.updateDynamic("text-background-shape")(`text-background-shape`.asInstanceOf[js.Any])
    __obj.updateDynamic("text-border-color")(`text-border-color`.asInstanceOf[js.Any])
    __obj.updateDynamic("text-border-opacity")(`text-border-opacity`.asInstanceOf[js.Any])
    __obj.updateDynamic("text-border-style")(`text-border-style`.asInstanceOf[js.Any])
    __obj.updateDynamic("text-border-width")(`text-border-width`.asInstanceOf[js.Any])
    __obj.updateDynamic("text-events")(`text-events`.asInstanceOf[js.Any])
    __obj.updateDynamic("text-halign")(`text-halign`.asInstanceOf[js.Any])
    __obj.updateDynamic("text-margin-x")(`text-margin-x`.asInstanceOf[js.Any])
    __obj.updateDynamic("text-margin-y")(`text-margin-y`.asInstanceOf[js.Any])
    __obj.updateDynamic("text-max-width")(`text-max-width`.asInstanceOf[js.Any])
    __obj.updateDynamic("text-opacity")(`text-opacity`.asInstanceOf[js.Any])
    __obj.updateDynamic("text-outline-color")(`text-outline-color`.asInstanceOf[js.Any])
    __obj.updateDynamic("text-outline-opacity")(`text-outline-opacity`.asInstanceOf[js.Any])
    __obj.updateDynamic("text-outline-width")(`text-outline-width`.asInstanceOf[js.Any])
    __obj.updateDynamic("text-rotation")(`text-rotation`.asInstanceOf[js.Any])
    __obj.updateDynamic("text-shadow-blur")(`text-shadow-blur`.asInstanceOf[js.Any])
    __obj.updateDynamic("text-shadow-color")(`text-shadow-color`.asInstanceOf[js.Any])
    __obj.updateDynamic("text-shadow-offset-x")(`text-shadow-offset-x`.asInstanceOf[js.Any])
    __obj.updateDynamic("text-shadow-offset-y")(`text-shadow-offset-y`.asInstanceOf[js.Any])
    __obj.updateDynamic("text-shadow-opacity")(`text-shadow-opacity`.asInstanceOf[js.Any])
    __obj.updateDynamic("text-transform")(`text-transform`.asInstanceOf[js.Any])
    __obj.updateDynamic("text-valign")(`text-valign`.asInstanceOf[js.Any])
    __obj.updateDynamic("text-wrap")(`text-wrap`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Labels[SingularType]]
  }
  @scala.inline
  implicit class LabelsOps[Self[singulartype] <: Labels[singulartype], SingularType] (val x: Self[SingularType]) extends AnyVal {
    @scala.inline
    def duplicate: Self[SingularType] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[SingularType]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[SingularType] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[SingularType] with Other]
    @scala.inline
    def withColorFunction1(value: SingularType => Colour): Self[SingularType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withColor(value: PropertyValue[SingularType, Colour]): Self[SingularType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withFont-familyFunction1`(value: SingularType => String): Self[SingularType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("font-family")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def `withFont-family`(value: PropertyValue[SingularType, String]): Self[SingularType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("font-family")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withFont-sizeFunction1`(value: SingularType => Double | String): Self[SingularType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("font-size")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def `withFont-size`(value: PropertyValue[SingularType, Double | String]): Self[SingularType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("font-size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withFont-styleFunction1`(value: SingularType => FontStyle): Self[SingularType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("font-style")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def `withFont-style`(value: PropertyValue[SingularType, FontStyle]): Self[SingularType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("font-style")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withFont-weightFunction1`(value: SingularType => FontWeight): Self[SingularType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("font-weight")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def `withFont-weight`(value: PropertyValue[SingularType, FontWeight]): Self[SingularType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("font-weight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLabelFunction1(value: SingularType => String): Self[SingularType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withLabel(value: PropertyValue[SingularType, String]): Self[SingularType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withMin-zoomed-font-sizeFunction1`(value: SingularType => Double): Self[SingularType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("min-zoomed-font-size")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def `withMin-zoomed-font-size`(value: PropertyValue[SingularType, Double]): Self[SingularType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("min-zoomed-font-size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withSource-labelFunction1`(value: SingularType => String): Self[SingularType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source-label")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def `withSource-label`(value: PropertyValue[SingularType, String]): Self[SingularType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source-label")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withSource-text-margin-xFunction1`(value: SingularType => Double): Self[SingularType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source-text-margin-x")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def `withSource-text-margin-x`(value: PropertyValue[SingularType, Double]): Self[SingularType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source-text-margin-x")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withSource-text-margin-yFunction1`(value: SingularType => Double): Self[SingularType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source-text-margin-y")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def `withSource-text-margin-y`(value: PropertyValue[SingularType, Double]): Self[SingularType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source-text-margin-y")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withSource-text-offsetFunction1`(value: SingularType => Double): Self[SingularType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source-text-offset")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def `withSource-text-offset`(value: PropertyValue[SingularType, Double]): Self[SingularType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source-text-offset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withSource-text-rotationFunction1`(value: SingularType => Double): Self[SingularType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source-text-rotation")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def `withSource-text-rotation`(value: PropertyValue[SingularType, Double]): Self[SingularType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source-text-rotation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withTarget-labelFunction1`(value: SingularType => String): Self[SingularType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target-label")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def `withTarget-label`(value: PropertyValue[SingularType, String]): Self[SingularType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target-label")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withTarget-text-margin-xFunction1`(value: SingularType => Double): Self[SingularType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target-text-margin-x")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def `withTarget-text-margin-x`(value: PropertyValue[SingularType, Double]): Self[SingularType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target-text-margin-x")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withTarget-text-margin-yFunction1`(value: SingularType => Double): Self[SingularType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target-text-margin-y")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def `withTarget-text-margin-y`(value: PropertyValue[SingularType, Double]): Self[SingularType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target-text-margin-y")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withTarget-text-offsetFunction1`(value: SingularType => Double): Self[SingularType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target-text-offset")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def `withTarget-text-offset`(value: PropertyValue[SingularType, Double]): Self[SingularType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target-text-offset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withTarget-text-rotationFunction1`(value: SingularType => Double): Self[SingularType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target-text-rotation")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def `withTarget-text-rotation`(value: PropertyValue[SingularType, Double]): Self[SingularType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target-text-rotation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withText-background-colorFunction1`(value: SingularType => Colour): Self[SingularType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text-background-color")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def `withText-background-color`(value: PropertyValue[SingularType, Colour]): Self[SingularType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text-background-color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withText-background-opacityFunction1`(value: SingularType => Double): Self[SingularType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text-background-opacity")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def `withText-background-opacity`(value: PropertyValue[SingularType, Double]): Self[SingularType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text-background-opacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withText-background-paddingFunction1`(value: SingularType => String): Self[SingularType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text-background-padding")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def `withText-background-padding`(value: PropertyValue[SingularType, String]): Self[SingularType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text-background-padding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withText-background-shapeFunction1`(value: SingularType => rectangle | roundrectangle): Self[SingularType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text-background-shape")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def `withText-background-shape`(value: PropertyValue[SingularType, rectangle | roundrectangle]): Self[SingularType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text-background-shape")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withText-border-colorFunction1`(value: SingularType => Colour): Self[SingularType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text-border-color")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def `withText-border-color`(value: PropertyValue[SingularType, Colour]): Self[SingularType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text-border-color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withText-border-opacityFunction1`(value: SingularType => Double): Self[SingularType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text-border-opacity")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def `withText-border-opacity`(value: PropertyValue[SingularType, Double]): Self[SingularType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text-border-opacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withText-border-styleFunction1`(value: SingularType => LineStyle): Self[SingularType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text-border-style")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def `withText-border-style`(value: PropertyValue[SingularType, LineStyle]): Self[SingularType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text-border-style")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withText-border-widthFunction1`(value: SingularType => Double): Self[SingularType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text-border-width")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def `withText-border-width`(value: PropertyValue[SingularType, Double]): Self[SingularType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text-border-width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withText-eventsFunction1`(value: SingularType => yes | no): Self[SingularType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text-events")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def `withText-events`(value: PropertyValue[SingularType, yes | no]): Self[SingularType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text-events")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withText-halignFunction1`(value: SingularType => left | center | right): Self[SingularType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text-halign")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def `withText-halign`(value: PropertyValue[SingularType, left | center | right]): Self[SingularType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text-halign")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withText-margin-xFunction1`(value: SingularType => Double): Self[SingularType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text-margin-x")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def `withText-margin-x`(value: PropertyValue[SingularType, Double]): Self[SingularType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text-margin-x")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withText-margin-yFunction1`(value: SingularType => Double): Self[SingularType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text-margin-y")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def `withText-margin-y`(value: PropertyValue[SingularType, Double]): Self[SingularType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text-margin-y")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withText-max-widthFunction1`(value: SingularType => String): Self[SingularType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text-max-width")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def `withText-max-width`(value: PropertyValue[SingularType, String]): Self[SingularType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text-max-width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withText-opacityFunction1`(value: SingularType => Double): Self[SingularType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text-opacity")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def `withText-opacity`(value: PropertyValue[SingularType, Double]): Self[SingularType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text-opacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withText-outline-colorFunction1`(value: SingularType => Colour): Self[SingularType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text-outline-color")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def `withText-outline-color`(value: PropertyValue[SingularType, Colour]): Self[SingularType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text-outline-color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withText-outline-opacityFunction1`(value: SingularType => Double): Self[SingularType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text-outline-opacity")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def `withText-outline-opacity`(value: PropertyValue[SingularType, Double]): Self[SingularType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text-outline-opacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withText-outline-widthFunction1`(value: SingularType => Double | String): Self[SingularType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text-outline-width")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def `withText-outline-width`(value: PropertyValue[SingularType, Double | String]): Self[SingularType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text-outline-width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withText-rotationFunction1`(value: SingularType => Double): Self[SingularType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text-rotation")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def `withText-rotation`(value: PropertyValue[SingularType, Double]): Self[SingularType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text-rotation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withText-shadow-blurFunction1`(value: SingularType => Double): Self[SingularType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text-shadow-blur")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def `withText-shadow-blur`(value: PropertyValue[SingularType, Double]): Self[SingularType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text-shadow-blur")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withText-shadow-colorFunction1`(value: SingularType => Colour): Self[SingularType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text-shadow-color")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def `withText-shadow-color`(value: PropertyValue[SingularType, Colour]): Self[SingularType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text-shadow-color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withText-shadow-offset-xFunction1`(value: SingularType => Double): Self[SingularType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text-shadow-offset-x")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def `withText-shadow-offset-x`(value: PropertyValue[SingularType, Double]): Self[SingularType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text-shadow-offset-x")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withText-shadow-offset-yFunction1`(value: SingularType => Double): Self[SingularType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text-shadow-offset-y")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def `withText-shadow-offset-y`(value: PropertyValue[SingularType, Double]): Self[SingularType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text-shadow-offset-y")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withText-shadow-opacityFunction1`(value: SingularType => Double): Self[SingularType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text-shadow-opacity")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def `withText-shadow-opacity`(value: PropertyValue[SingularType, Double]): Self[SingularType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text-shadow-opacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withText-transformFunction1`(value: SingularType => TextTranformation): Self[SingularType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text-transform")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def `withText-transform`(value: PropertyValue[SingularType, TextTranformation]): Self[SingularType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text-transform")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withText-valignFunction1`(value: SingularType => top | center | bottom): Self[SingularType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text-valign")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def `withText-valign`(value: PropertyValue[SingularType, top | center | bottom]): Self[SingularType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text-valign")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withText-wrapFunction1`(value: SingularType => none | wrap | ellipsis): Self[SingularType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text-wrap")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def `withText-wrap`(value: PropertyValue[SingularType, none | wrap | ellipsis]): Self[SingularType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text-wrap")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

