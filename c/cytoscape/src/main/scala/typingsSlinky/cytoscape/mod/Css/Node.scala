package typingsSlinky.cytoscape.mod.Css

import typingsSlinky.cytoscape.cytoscapeStrings.`no-repeat`
import typingsSlinky.cytoscape.cytoscapeStrings.`repeat-x`
import typingsSlinky.cytoscape.cytoscapeStrings.`repeat-y`
import typingsSlinky.cytoscape.cytoscapeStrings.bottom
import typingsSlinky.cytoscape.cytoscapeStrings.center
import typingsSlinky.cytoscape.cytoscapeStrings.clipped
import typingsSlinky.cytoscape.cytoscapeStrings.contain
import typingsSlinky.cytoscape.cytoscapeStrings.cover
import typingsSlinky.cytoscape.cytoscapeStrings.displayed
import typingsSlinky.cytoscape.cytoscapeStrings.ellipsis
import typingsSlinky.cytoscape.cytoscapeStrings.left
import typingsSlinky.cytoscape.cytoscapeStrings.no
import typingsSlinky.cytoscape.cytoscapeStrings.none
import typingsSlinky.cytoscape.cytoscapeStrings.rectangle
import typingsSlinky.cytoscape.cytoscapeStrings.repeat
import typingsSlinky.cytoscape.cytoscapeStrings.right
import typingsSlinky.cytoscape.cytoscapeStrings.roundrectangle
import typingsSlinky.cytoscape.cytoscapeStrings.top
import typingsSlinky.cytoscape.cytoscapeStrings.visible
import typingsSlinky.cytoscape.cytoscapeStrings.wrap
import typingsSlinky.cytoscape.cytoscapeStrings.yes
import typingsSlinky.cytoscape.mod.EdgeSingular
import typingsSlinky.cytoscape.mod.NodeSingular
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * http://js.cytoscape.org/#style/node-body
  */
/* Inlined parent std.Partial<cytoscape.cytoscape.Css.Overlay> */
/* Inlined parent cytoscape.cytoscape.Css.PaddingNode */
/* Inlined parent std.Partial<cytoscape.cytoscape.Css.Labels<cytoscape.cytoscape.NodeSingular>> */
/* Inlined parent cytoscape.cytoscape.Css.BackgroundImage */
/* Inlined parent std.Partial<cytoscape.cytoscape.Css.Ghost> */
/* Inlined parent std.Partial<cytoscape.cytoscape.Css.Visibility<cytoscape.cytoscape.NodeSingular>> */
/* Inlined parent std.Partial<cytoscape.cytoscape.Css.PieChartBackground> */
@js.native
trait Node extends js.Object {
  /**
    * Blackens the node’s body for values from 0 to 1;
    * whitens the node’s body for values from 0 to -1.
    */
  var `background-blacken`: js.UndefOr[PropertyValueNode[Double]] = js.native
  /**
    * How background image clipping is handled;
    * may be node for clipped to node shape or none for no clipping.
    */
  var `background-clip`: js.UndefOr[PropertyValueNode[clipped | none]] = js.native
  /**
    * The colour of the node’s body.
    */
  var `background-color`: js.UndefOr[PropertyValueNode[Colour]] = js.native
  /**
    * How the background image is fit to the node;
    * may be none for original size,
    * contain to fit inside node,
    * or cover to cover the node.
    */
  var `background-fit`: js.UndefOr[PropertyValueNode[none | contain | cover]] = js.native
  /**
    * Specifies the height of the image.
    * A percent value (e.g. 50%) may be used to set the image
    * height relative to the node height.
    * If used in combination with background- fit,
    * then this value overrides the height of the image in calculating
    * the fitting — thereby overriding the aspect ratio.
    * The auto value is used by default, which uses the height of the image.
    */
  var `background-height`: js.UndefOr[PropertyValueNode[Double | String]] = js.native
  /**
    * The URL that points to the image that should be used as the node’s background.
    * PNG, JPG, and SVG are supported formats.
    * You may use a data URI to use embedded images,
    * thereby saving a HTTP request.
    */
  var `background-image`: js.UndefOr[PropertyValueNode[String]] = js.native
  /**
    * The opacity of the background image. [0 1]
    */
  var `background-image-opacity`: js.UndefOr[PropertyValueNode[Double]] = js.native
  /**
    * The opacity level of the node’s background colour.
    */
  var `background-opacity`: js.UndefOr[PropertyValueNode[Double]] = js.native
  /**
    * The x position of the background image,
    * measured in percent(e.g. 50%) or pixels (e.g. 10px).
    */
  var `background-position-x`: js.UndefOr[PropertyValueNode[Double | String]] = js.native
  /**
    * The y position of the background image,
    * measured in percent(e.g. 50%) or pixels (e.g. 10px).
    */
  var `background-position-y`: js.UndefOr[PropertyValueNode[Double | String]] = js.native
  /**
    * Whether to repeat the background image;
    * may be no-repeat, repeat-x, repeat-y, or repeat.
    */
  var `background-repeat`: js.UndefOr[PropertyValueNode[`no-repeat` | `repeat-x` | `repeat-y` | repeat]] = js.native
  /**
    * Specifies the width of the image.
    * A percent value (e.g. 50%) may be used to set
    * the image width relative to the node width.
    * If used in combination with background- fit,
    * then this value overrides the width of the image
    * in calculating the fitting — thereby overriding the aspect ratio.
    * The auto value is used by default, which uses the width of the image.
    */
  var `background-width`: js.UndefOr[PropertyValueNode[Double | String]] = js.native
  var backgroundColor: js.UndefOr[PropertyValueNode[Colour]] = js.native
  /**
    * The colour of the node’s border.
    */
  var `border-color`: js.UndefOr[PropertyValueNode[Colour]] = js.native
  /**
    * The opacity of the node’s border.
    * A value between [0 1].
    */
  var `border-opacity`: js.UndefOr[PropertyValueNode[Double]] = js.native
  /**
    * The style of the node’s border.
    */
  var `border-style`: js.UndefOr[PropertyValueNode[LineStyle]] = js.native
  /**
    * The size of the node’s border.
    */
  var `border-width`: js.UndefOr[PropertyValueNode[Double | String]] = js.native
  var color: js.UndefOr[PropertyValue[NodeSingular, Colour]] = js.native
  /**
    * The CSS content field
    */
  var content: js.UndefOr[PropertyValueNode[String]] = js.native
  var display: js.UndefOr[PropertyValue[NodeSingular, none | displayed]] = js.native
  var `font-family`: js.UndefOr[PropertyValue[NodeSingular, String]] = js.native
  var `font-size`: js.UndefOr[PropertyValue[NodeSingular, Double | String]] = js.native
  var `font-style`: js.UndefOr[PropertyValue[NodeSingular, FontStyle]] = js.native
  var `font-weight`: js.UndefOr[PropertyValue[NodeSingular, FontWeight]] = js.native
  var ghost: js.UndefOr[PropertyValueNode[yes | no]] = js.native
  var `ghost-offset-x`: js.UndefOr[PropertyValueNode[Double]] = js.native
  var `ghost-offset-y`: js.UndefOr[PropertyValueNode[Double]] = js.native
  var `ghost-opacity`: js.UndefOr[PropertyValueNode[Double]] = js.native
  /**
    * The height of the node’s body.
    * This property can take on the special value label
    * so the height is automatically based on the node’s label.
    */
  var height: js.UndefOr[PropertyValueNode[Double | String]] = js.native
  var label: js.UndefOr[PropertyValue[NodeSingular, String]] = js.native
  var `min-zoomed-font-size`: js.UndefOr[PropertyValue[NodeSingular, Double]] = js.native
  var opacity: js.UndefOr[PropertyValue[NodeSingular, Double]] = js.native
  var `overlay-color`: js.UndefOr[PropertyValueEdge[Colour]] = js.native
  var `overlay-opacity`: js.UndefOr[PropertyValueEdge[Double]] = js.native
  var `overlay-padding`: js.UndefOr[PropertyValueEdge[Double | String]] = js.native
  var `padding-bottom`: js.UndefOr[PropertyValueNode[String]] = js.native
  var `padding-left`: js.UndefOr[PropertyValueNode[String]] = js.native
  var `padding-right`: js.UndefOr[PropertyValueNode[String]] = js.native
  var `padding-top`: js.UndefOr[PropertyValueNode[String]] = js.native
  var `pie-i-background-color`: js.UndefOr[PropertyValueNode[Colour]] = js.native
  var `pie-i-background-opacity`: js.UndefOr[PropertyValueNode[Double]] = js.native
  var `pie-i-background-size`: js.UndefOr[PropertyValueNode[Double]] = js.native
  var `pie-size`: js.UndefOr[PropertyValueNode[String]] = js.native
  /**
    * The shape of the node’s body.
    */
  var shape: js.UndefOr[PropertyValueNode[NodeShape]] = js.native
  var `shape-polygon-points`: js.UndefOr[PropertyValueNode[ShapePolygonPoints]] = js.native
  var `source-label`: js.UndefOr[PropertyValue[NodeSingular, String]] = js.native
  var `source-text-margin-x`: js.UndefOr[PropertyValue[NodeSingular, Double]] = js.native
  var `source-text-margin-y`: js.UndefOr[PropertyValue[NodeSingular, Double]] = js.native
  var `source-text-offset`: js.UndefOr[PropertyValue[NodeSingular, Double]] = js.native
  var `source-text-rotation`: js.UndefOr[PropertyValue[NodeSingular, Double]] = js.native
  var `target-label`: js.UndefOr[PropertyValue[NodeSingular, String]] = js.native
  var `target-text-margin-x`: js.UndefOr[PropertyValue[NodeSingular, Double]] = js.native
  var `target-text-margin-y`: js.UndefOr[PropertyValue[NodeSingular, Double]] = js.native
  var `target-text-offset`: js.UndefOr[PropertyValue[NodeSingular, Double]] = js.native
  var `target-text-rotation`: js.UndefOr[PropertyValue[NodeSingular, Double]] = js.native
  var `text-background-color`: js.UndefOr[PropertyValue[NodeSingular, Colour]] = js.native
  var `text-background-opacity`: js.UndefOr[PropertyValue[NodeSingular, Double]] = js.native
  var `text-background-padding`: js.UndefOr[PropertyValue[NodeSingular, String]] = js.native
  var `text-background-shape`: js.UndefOr[PropertyValue[NodeSingular, rectangle | roundrectangle]] = js.native
  var `text-border-color`: js.UndefOr[PropertyValue[NodeSingular, Colour]] = js.native
  var `text-border-opacity`: js.UndefOr[PropertyValue[NodeSingular, Double]] = js.native
  var `text-border-style`: js.UndefOr[PropertyValue[NodeSingular, LineStyle]] = js.native
  var `text-border-width`: js.UndefOr[PropertyValue[NodeSingular, Double]] = js.native
  var `text-events`: js.UndefOr[PropertyValue[NodeSingular, yes | no]] = js.native
  var `text-halign`: js.UndefOr[PropertyValue[NodeSingular, left | center | right]] = js.native
  var `text-margin-x`: js.UndefOr[PropertyValue[NodeSingular, Double]] = js.native
  var `text-margin-y`: js.UndefOr[PropertyValue[NodeSingular, Double]] = js.native
  var `text-max-width`: js.UndefOr[PropertyValue[NodeSingular, String]] = js.native
  var `text-opacity`: js.UndefOr[PropertyValue[NodeSingular, Double]] = js.native
  var `text-outline-color`: js.UndefOr[PropertyValue[NodeSingular, Colour]] = js.native
  var `text-outline-opacity`: js.UndefOr[PropertyValue[NodeSingular, Double]] = js.native
  var `text-outline-width`: js.UndefOr[PropertyValue[NodeSingular, Double | String]] = js.native
  var `text-rotation`: js.UndefOr[PropertyValue[NodeSingular, Double]] = js.native
  var `text-shadow-blur`: js.UndefOr[PropertyValue[NodeSingular, Double]] = js.native
  var `text-shadow-color`: js.UndefOr[PropertyValue[NodeSingular, Colour]] = js.native
  var `text-shadow-offset-x`: js.UndefOr[PropertyValue[NodeSingular, Double]] = js.native
  var `text-shadow-offset-y`: js.UndefOr[PropertyValue[NodeSingular, Double]] = js.native
  var `text-shadow-opacity`: js.UndefOr[PropertyValue[NodeSingular, Double]] = js.native
  var `text-transform`: js.UndefOr[PropertyValue[NodeSingular, TextTranformation]] = js.native
  var `text-valign`: js.UndefOr[PropertyValue[NodeSingular, top | center | bottom]] = js.native
  var `text-wrap`: js.UndefOr[PropertyValue[NodeSingular, none | wrap | ellipsis]] = js.native
  var visibility: js.UndefOr[PropertyValue[NodeSingular, none | visible]] = js.native
  /**
    * The width of the node’s body.
    * This property can take on the special value label
    * so the width is automatically based on the node’s label.
    */
  var width: js.UndefOr[PropertyValueNode[Double | String]] = js.native
  var `z-index`: js.UndefOr[PropertyValue[NodeSingular, Double]] = js.native
}

object Node {
  @scala.inline
  def apply(): Node = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Node]
  }
  @scala.inline
  implicit class NodeOps[Self <: Node] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def `withBackground-blackenFunction1`(value: NodeSingular => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("background-blacken")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def `withBackground-blacken`(value: PropertyValueNode[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("background-blacken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutBackground-blacken`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("background-blacken")(js.undefined)
        ret
    }
    @scala.inline
    def `withBackground-clipFunction1`(value: NodeSingular => clipped | none): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("background-clip")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def `withBackground-clip`(value: PropertyValueNode[clipped | none]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("background-clip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutBackground-clip`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("background-clip")(js.undefined)
        ret
    }
    @scala.inline
    def `withBackground-colorFunction1`(value: NodeSingular => Colour): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("background-color")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def `withBackground-color`(value: PropertyValueNode[Colour]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("background-color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutBackground-color`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("background-color")(js.undefined)
        ret
    }
    @scala.inline
    def `withBackground-fitFunction1`(value: NodeSingular => none | contain | cover): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("background-fit")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def `withBackground-fit`(value: PropertyValueNode[none | contain | cover]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("background-fit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutBackground-fit`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("background-fit")(js.undefined)
        ret
    }
    @scala.inline
    def `withBackground-heightFunction1`(value: NodeSingular => Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("background-height")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def `withBackground-height`(value: PropertyValueNode[Double | String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("background-height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutBackground-height`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("background-height")(js.undefined)
        ret
    }
    @scala.inline
    def `withBackground-imageFunction1`(value: NodeSingular => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("background-image")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def `withBackground-image`(value: PropertyValueNode[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("background-image")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutBackground-image`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("background-image")(js.undefined)
        ret
    }
    @scala.inline
    def `withBackground-image-opacityFunction1`(value: NodeSingular => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("background-image-opacity")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def `withBackground-image-opacity`(value: PropertyValueNode[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("background-image-opacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutBackground-image-opacity`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("background-image-opacity")(js.undefined)
        ret
    }
    @scala.inline
    def `withBackground-opacityFunction1`(value: NodeSingular => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("background-opacity")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def `withBackground-opacity`(value: PropertyValueNode[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("background-opacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutBackground-opacity`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("background-opacity")(js.undefined)
        ret
    }
    @scala.inline
    def `withBackground-position-xFunction1`(value: NodeSingular => Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("background-position-x")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def `withBackground-position-x`(value: PropertyValueNode[Double | String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("background-position-x")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutBackground-position-x`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("background-position-x")(js.undefined)
        ret
    }
    @scala.inline
    def `withBackground-position-yFunction1`(value: NodeSingular => Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("background-position-y")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def `withBackground-position-y`(value: PropertyValueNode[Double | String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("background-position-y")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutBackground-position-y`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("background-position-y")(js.undefined)
        ret
    }
    @scala.inline
    def `withBackground-repeatFunction1`(value: NodeSingular => `no-repeat` | `repeat-x` | `repeat-y` | repeat): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("background-repeat")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def `withBackground-repeat`(value: PropertyValueNode[`no-repeat` | `repeat-x` | `repeat-y` | repeat]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("background-repeat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutBackground-repeat`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("background-repeat")(js.undefined)
        ret
    }
    @scala.inline
    def `withBackground-widthFunction1`(value: NodeSingular => Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("background-width")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def `withBackground-width`(value: PropertyValueNode[Double | String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("background-width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutBackground-width`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("background-width")(js.undefined)
        ret
    }
    @scala.inline
    def withBackgroundColorFunction1(value: NodeSingular => Colour): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundColor")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withBackgroundColor(value: PropertyValueNode[Colour]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackgroundColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundColor")(js.undefined)
        ret
    }
    @scala.inline
    def `withBorder-colorFunction1`(value: NodeSingular => Colour): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("border-color")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def `withBorder-color`(value: PropertyValueNode[Colour]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("border-color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutBorder-color`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("border-color")(js.undefined)
        ret
    }
    @scala.inline
    def `withBorder-opacityFunction1`(value: NodeSingular => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("border-opacity")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def `withBorder-opacity`(value: PropertyValueNode[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("border-opacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutBorder-opacity`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("border-opacity")(js.undefined)
        ret
    }
    @scala.inline
    def `withBorder-styleFunction1`(value: NodeSingular => LineStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("border-style")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def `withBorder-style`(value: PropertyValueNode[LineStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("border-style")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutBorder-style`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("border-style")(js.undefined)
        ret
    }
    @scala.inline
    def `withBorder-widthFunction1`(value: NodeSingular => Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("border-width")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def `withBorder-width`(value: PropertyValueNode[Double | String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("border-width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutBorder-width`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("border-width")(js.undefined)
        ret
    }
    @scala.inline
    def withColorFunction1(value: NodeSingular => Colour): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withColor(value: PropertyValue[NodeSingular, Colour]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(js.undefined)
        ret
    }
    @scala.inline
    def withContentFunction1(value: NodeSingular => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withContent(value: PropertyValueNode[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content")(js.undefined)
        ret
    }
    @scala.inline
    def withDisplayFunction1(value: NodeSingular => none | displayed): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("display")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDisplay(value: PropertyValue[NodeSingular, none | displayed]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("display")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("display")(js.undefined)
        ret
    }
    @scala.inline
    def `withFont-familyFunction1`(value: NodeSingular => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("font-family")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def `withFont-family`(value: PropertyValue[NodeSingular, String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("font-family")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutFont-family`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("font-family")(js.undefined)
        ret
    }
    @scala.inline
    def `withFont-sizeFunction1`(value: NodeSingular => Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("font-size")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def `withFont-size`(value: PropertyValue[NodeSingular, Double | String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("font-size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutFont-size`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("font-size")(js.undefined)
        ret
    }
    @scala.inline
    def `withFont-styleFunction1`(value: NodeSingular => FontStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("font-style")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def `withFont-style`(value: PropertyValue[NodeSingular, FontStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("font-style")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutFont-style`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("font-style")(js.undefined)
        ret
    }
    @scala.inline
    def `withFont-weightFunction1`(value: NodeSingular => FontWeight): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("font-weight")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def `withFont-weight`(value: PropertyValue[NodeSingular, FontWeight]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("font-weight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutFont-weight`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("font-weight")(js.undefined)
        ret
    }
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
    def withoutGhost: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ghost")(js.undefined)
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
    def `withoutGhost-offset-x`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ghost-offset-x")(js.undefined)
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
    def `withoutGhost-offset-y`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ghost-offset-y")(js.undefined)
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
    @scala.inline
    def `withoutGhost-opacity`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ghost-opacity")(js.undefined)
        ret
    }
    @scala.inline
    def withHeightFunction1(value: NodeSingular => Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withHeight(value: PropertyValueNode[Double | String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelFunction1(value: NodeSingular => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withLabel(value: PropertyValue[NodeSingular, String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(js.undefined)
        ret
    }
    @scala.inline
    def `withMin-zoomed-font-sizeFunction1`(value: NodeSingular => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("min-zoomed-font-size")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def `withMin-zoomed-font-size`(value: PropertyValue[NodeSingular, Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("min-zoomed-font-size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutMin-zoomed-font-size`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("min-zoomed-font-size")(js.undefined)
        ret
    }
    @scala.inline
    def withOpacityFunction1(value: NodeSingular => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("opacity")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOpacity(value: PropertyValue[NodeSingular, Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("opacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOpacity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("opacity")(js.undefined)
        ret
    }
    @scala.inline
    def `withOverlay-colorFunction1`(value: EdgeSingular => Colour): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overlay-color")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def `withOverlay-color`(value: PropertyValueEdge[Colour]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overlay-color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutOverlay-color`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overlay-color")(js.undefined)
        ret
    }
    @scala.inline
    def `withOverlay-opacityFunction1`(value: EdgeSingular => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overlay-opacity")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def `withOverlay-opacity`(value: PropertyValueEdge[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overlay-opacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutOverlay-opacity`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overlay-opacity")(js.undefined)
        ret
    }
    @scala.inline
    def `withOverlay-paddingFunction1`(value: EdgeSingular => Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overlay-padding")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def `withOverlay-padding`(value: PropertyValueEdge[Double | String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overlay-padding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutOverlay-padding`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overlay-padding")(js.undefined)
        ret
    }
    @scala.inline
    def `withPadding-bottomFunction1`(value: NodeSingular => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("padding-bottom")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def `withPadding-bottom`(value: PropertyValueNode[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("padding-bottom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutPadding-bottom`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("padding-bottom")(js.undefined)
        ret
    }
    @scala.inline
    def `withPadding-leftFunction1`(value: NodeSingular => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("padding-left")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def `withPadding-left`(value: PropertyValueNode[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("padding-left")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutPadding-left`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("padding-left")(js.undefined)
        ret
    }
    @scala.inline
    def `withPadding-rightFunction1`(value: NodeSingular => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("padding-right")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def `withPadding-right`(value: PropertyValueNode[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("padding-right")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutPadding-right`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("padding-right")(js.undefined)
        ret
    }
    @scala.inline
    def `withPadding-topFunction1`(value: NodeSingular => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("padding-top")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def `withPadding-top`(value: PropertyValueNode[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("padding-top")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutPadding-top`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("padding-top")(js.undefined)
        ret
    }
    @scala.inline
    def `withPie-i-background-colorFunction1`(value: NodeSingular => Colour): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pie-i-background-color")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def `withPie-i-background-color`(value: PropertyValueNode[Colour]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pie-i-background-color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutPie-i-background-color`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pie-i-background-color")(js.undefined)
        ret
    }
    @scala.inline
    def `withPie-i-background-opacityFunction1`(value: NodeSingular => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pie-i-background-opacity")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def `withPie-i-background-opacity`(value: PropertyValueNode[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pie-i-background-opacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutPie-i-background-opacity`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pie-i-background-opacity")(js.undefined)
        ret
    }
    @scala.inline
    def `withPie-i-background-sizeFunction1`(value: NodeSingular => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pie-i-background-size")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def `withPie-i-background-size`(value: PropertyValueNode[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pie-i-background-size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutPie-i-background-size`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pie-i-background-size")(js.undefined)
        ret
    }
    @scala.inline
    def `withPie-sizeFunction1`(value: NodeSingular => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pie-size")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def `withPie-size`(value: PropertyValueNode[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pie-size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutPie-size`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pie-size")(js.undefined)
        ret
    }
    @scala.inline
    def withShapeFunction1(value: NodeSingular => NodeShape): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shape")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withShape(value: PropertyValueNode[NodeShape]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shape")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShape: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shape")(js.undefined)
        ret
    }
    @scala.inline
    def `withShape-polygon-pointsFunction1`(value: NodeSingular => ShapePolygonPoints): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shape-polygon-points")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def `withShape-polygon-points`(value: PropertyValueNode[ShapePolygonPoints]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shape-polygon-points")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutShape-polygon-points`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shape-polygon-points")(js.undefined)
        ret
    }
    @scala.inline
    def `withSource-labelFunction1`(value: NodeSingular => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source-label")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def `withSource-label`(value: PropertyValue[NodeSingular, String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source-label")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutSource-label`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source-label")(js.undefined)
        ret
    }
    @scala.inline
    def `withSource-text-margin-xFunction1`(value: NodeSingular => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source-text-margin-x")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def `withSource-text-margin-x`(value: PropertyValue[NodeSingular, Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source-text-margin-x")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutSource-text-margin-x`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source-text-margin-x")(js.undefined)
        ret
    }
    @scala.inline
    def `withSource-text-margin-yFunction1`(value: NodeSingular => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source-text-margin-y")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def `withSource-text-margin-y`(value: PropertyValue[NodeSingular, Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source-text-margin-y")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutSource-text-margin-y`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source-text-margin-y")(js.undefined)
        ret
    }
    @scala.inline
    def `withSource-text-offsetFunction1`(value: NodeSingular => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source-text-offset")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def `withSource-text-offset`(value: PropertyValue[NodeSingular, Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source-text-offset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutSource-text-offset`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source-text-offset")(js.undefined)
        ret
    }
    @scala.inline
    def `withSource-text-rotationFunction1`(value: NodeSingular => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source-text-rotation")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def `withSource-text-rotation`(value: PropertyValue[NodeSingular, Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source-text-rotation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutSource-text-rotation`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source-text-rotation")(js.undefined)
        ret
    }
    @scala.inline
    def `withTarget-labelFunction1`(value: NodeSingular => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target-label")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def `withTarget-label`(value: PropertyValue[NodeSingular, String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target-label")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutTarget-label`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target-label")(js.undefined)
        ret
    }
    @scala.inline
    def `withTarget-text-margin-xFunction1`(value: NodeSingular => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target-text-margin-x")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def `withTarget-text-margin-x`(value: PropertyValue[NodeSingular, Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target-text-margin-x")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutTarget-text-margin-x`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target-text-margin-x")(js.undefined)
        ret
    }
    @scala.inline
    def `withTarget-text-margin-yFunction1`(value: NodeSingular => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target-text-margin-y")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def `withTarget-text-margin-y`(value: PropertyValue[NodeSingular, Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target-text-margin-y")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutTarget-text-margin-y`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target-text-margin-y")(js.undefined)
        ret
    }
    @scala.inline
    def `withTarget-text-offsetFunction1`(value: NodeSingular => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target-text-offset")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def `withTarget-text-offset`(value: PropertyValue[NodeSingular, Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target-text-offset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutTarget-text-offset`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target-text-offset")(js.undefined)
        ret
    }
    @scala.inline
    def `withTarget-text-rotationFunction1`(value: NodeSingular => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target-text-rotation")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def `withTarget-text-rotation`(value: PropertyValue[NodeSingular, Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target-text-rotation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutTarget-text-rotation`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target-text-rotation")(js.undefined)
        ret
    }
    @scala.inline
    def `withText-background-colorFunction1`(value: NodeSingular => Colour): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text-background-color")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def `withText-background-color`(value: PropertyValue[NodeSingular, Colour]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text-background-color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutText-background-color`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text-background-color")(js.undefined)
        ret
    }
    @scala.inline
    def `withText-background-opacityFunction1`(value: NodeSingular => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text-background-opacity")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def `withText-background-opacity`(value: PropertyValue[NodeSingular, Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text-background-opacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutText-background-opacity`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text-background-opacity")(js.undefined)
        ret
    }
    @scala.inline
    def `withText-background-paddingFunction1`(value: NodeSingular => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text-background-padding")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def `withText-background-padding`(value: PropertyValue[NodeSingular, String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text-background-padding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutText-background-padding`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text-background-padding")(js.undefined)
        ret
    }
    @scala.inline
    def `withText-background-shapeFunction1`(value: NodeSingular => rectangle | roundrectangle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text-background-shape")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def `withText-background-shape`(value: PropertyValue[NodeSingular, rectangle | roundrectangle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text-background-shape")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutText-background-shape`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text-background-shape")(js.undefined)
        ret
    }
    @scala.inline
    def `withText-border-colorFunction1`(value: NodeSingular => Colour): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text-border-color")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def `withText-border-color`(value: PropertyValue[NodeSingular, Colour]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text-border-color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutText-border-color`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text-border-color")(js.undefined)
        ret
    }
    @scala.inline
    def `withText-border-opacityFunction1`(value: NodeSingular => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text-border-opacity")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def `withText-border-opacity`(value: PropertyValue[NodeSingular, Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text-border-opacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutText-border-opacity`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text-border-opacity")(js.undefined)
        ret
    }
    @scala.inline
    def `withText-border-styleFunction1`(value: NodeSingular => LineStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text-border-style")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def `withText-border-style`(value: PropertyValue[NodeSingular, LineStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text-border-style")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutText-border-style`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text-border-style")(js.undefined)
        ret
    }
    @scala.inline
    def `withText-border-widthFunction1`(value: NodeSingular => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text-border-width")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def `withText-border-width`(value: PropertyValue[NodeSingular, Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text-border-width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutText-border-width`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text-border-width")(js.undefined)
        ret
    }
    @scala.inline
    def `withText-eventsFunction1`(value: NodeSingular => yes | no): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text-events")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def `withText-events`(value: PropertyValue[NodeSingular, yes | no]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text-events")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutText-events`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text-events")(js.undefined)
        ret
    }
    @scala.inline
    def `withText-halignFunction1`(value: NodeSingular => left | center | right): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text-halign")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def `withText-halign`(value: PropertyValue[NodeSingular, left | center | right]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text-halign")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutText-halign`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text-halign")(js.undefined)
        ret
    }
    @scala.inline
    def `withText-margin-xFunction1`(value: NodeSingular => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text-margin-x")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def `withText-margin-x`(value: PropertyValue[NodeSingular, Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text-margin-x")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutText-margin-x`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text-margin-x")(js.undefined)
        ret
    }
    @scala.inline
    def `withText-margin-yFunction1`(value: NodeSingular => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text-margin-y")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def `withText-margin-y`(value: PropertyValue[NodeSingular, Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text-margin-y")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutText-margin-y`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text-margin-y")(js.undefined)
        ret
    }
    @scala.inline
    def `withText-max-widthFunction1`(value: NodeSingular => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text-max-width")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def `withText-max-width`(value: PropertyValue[NodeSingular, String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text-max-width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutText-max-width`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text-max-width")(js.undefined)
        ret
    }
    @scala.inline
    def `withText-opacityFunction1`(value: NodeSingular => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text-opacity")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def `withText-opacity`(value: PropertyValue[NodeSingular, Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text-opacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutText-opacity`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text-opacity")(js.undefined)
        ret
    }
    @scala.inline
    def `withText-outline-colorFunction1`(value: NodeSingular => Colour): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text-outline-color")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def `withText-outline-color`(value: PropertyValue[NodeSingular, Colour]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text-outline-color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutText-outline-color`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text-outline-color")(js.undefined)
        ret
    }
    @scala.inline
    def `withText-outline-opacityFunction1`(value: NodeSingular => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text-outline-opacity")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def `withText-outline-opacity`(value: PropertyValue[NodeSingular, Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text-outline-opacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutText-outline-opacity`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text-outline-opacity")(js.undefined)
        ret
    }
    @scala.inline
    def `withText-outline-widthFunction1`(value: NodeSingular => Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text-outline-width")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def `withText-outline-width`(value: PropertyValue[NodeSingular, Double | String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text-outline-width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutText-outline-width`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text-outline-width")(js.undefined)
        ret
    }
    @scala.inline
    def `withText-rotationFunction1`(value: NodeSingular => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text-rotation")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def `withText-rotation`(value: PropertyValue[NodeSingular, Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text-rotation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutText-rotation`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text-rotation")(js.undefined)
        ret
    }
    @scala.inline
    def `withText-shadow-blurFunction1`(value: NodeSingular => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text-shadow-blur")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def `withText-shadow-blur`(value: PropertyValue[NodeSingular, Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text-shadow-blur")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutText-shadow-blur`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text-shadow-blur")(js.undefined)
        ret
    }
    @scala.inline
    def `withText-shadow-colorFunction1`(value: NodeSingular => Colour): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text-shadow-color")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def `withText-shadow-color`(value: PropertyValue[NodeSingular, Colour]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text-shadow-color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutText-shadow-color`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text-shadow-color")(js.undefined)
        ret
    }
    @scala.inline
    def `withText-shadow-offset-xFunction1`(value: NodeSingular => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text-shadow-offset-x")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def `withText-shadow-offset-x`(value: PropertyValue[NodeSingular, Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text-shadow-offset-x")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutText-shadow-offset-x`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text-shadow-offset-x")(js.undefined)
        ret
    }
    @scala.inline
    def `withText-shadow-offset-yFunction1`(value: NodeSingular => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text-shadow-offset-y")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def `withText-shadow-offset-y`(value: PropertyValue[NodeSingular, Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text-shadow-offset-y")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutText-shadow-offset-y`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text-shadow-offset-y")(js.undefined)
        ret
    }
    @scala.inline
    def `withText-shadow-opacityFunction1`(value: NodeSingular => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text-shadow-opacity")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def `withText-shadow-opacity`(value: PropertyValue[NodeSingular, Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text-shadow-opacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutText-shadow-opacity`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text-shadow-opacity")(js.undefined)
        ret
    }
    @scala.inline
    def `withText-transformFunction1`(value: NodeSingular => TextTranformation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text-transform")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def `withText-transform`(value: PropertyValue[NodeSingular, TextTranformation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text-transform")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutText-transform`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text-transform")(js.undefined)
        ret
    }
    @scala.inline
    def `withText-valignFunction1`(value: NodeSingular => top | center | bottom): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text-valign")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def `withText-valign`(value: PropertyValue[NodeSingular, top | center | bottom]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text-valign")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutText-valign`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text-valign")(js.undefined)
        ret
    }
    @scala.inline
    def `withText-wrapFunction1`(value: NodeSingular => none | wrap | ellipsis): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text-wrap")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def `withText-wrap`(value: PropertyValue[NodeSingular, none | wrap | ellipsis]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text-wrap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutText-wrap`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text-wrap")(js.undefined)
        ret
    }
    @scala.inline
    def withVisibilityFunction1(value: NodeSingular => none | visible): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visibility")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withVisibility(value: PropertyValue[NodeSingular, none | visible]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visibility")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisibility: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visibility")(js.undefined)
        ret
    }
    @scala.inline
    def withWidthFunction1(value: NodeSingular => Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withWidth(value: PropertyValueNode[Double | String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(js.undefined)
        ret
    }
    @scala.inline
    def `withZ-indexFunction1`(value: NodeSingular => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("z-index")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def `withZ-index`(value: PropertyValue[NodeSingular, Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("z-index")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutZ-index`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("z-index")(js.undefined)
        ret
    }
  }
  
}

