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
import typingsSlinky.cytoscape.cytoscapeStrings.hidden
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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
/* Inlined parent std.Partial<cytoscape.cytoscape.Css.Events<cytoscape.cytoscape.NodeSingular>> */
/* Inlined parent std.Partial<cytoscape.cytoscape.Css.TransitionAnimation> */
@js.native
trait Node extends StObject {
  
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
  
  var events: js.UndefOr[PropertyValue[NodeSingular, yes | no]] = js.native
  
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
  
  var `transition-delay`: js.UndefOr[Double] = js.native
  
  var `transition-duration`: js.UndefOr[Double] = js.native
  
  var `transition-property`: js.UndefOr[String] = js.native
  
  var `transition-timing-function`: js.UndefOr[TransitionTimingFunction] = js.native
  
  var visibility: js.UndefOr[PropertyValue[NodeSingular, hidden | visible]] = js.native
  
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
  implicit class NodeMutableBuilder[Self <: Node] (val x: Self) extends AnyVal {
    
    @scala.inline
    def `setBackground-blacken`(value: PropertyValueNode[Double]): Self = StObject.set(x, "background-blacken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setBackground-blackenFunction1`(value: NodeSingular => Double): Self = StObject.set(x, "background-blacken", js.Any.fromFunction1(value))
    
    @scala.inline
    def `setBackground-blackenUndefined`: Self = StObject.set(x, "background-blacken", js.undefined)
    
    @scala.inline
    def `setBackground-clip`(value: PropertyValueNode[clipped | none]): Self = StObject.set(x, "background-clip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setBackground-clipFunction1`(value: NodeSingular => clipped | none): Self = StObject.set(x, "background-clip", js.Any.fromFunction1(value))
    
    @scala.inline
    def `setBackground-clipUndefined`: Self = StObject.set(x, "background-clip", js.undefined)
    
    @scala.inline
    def `setBackground-color`(value: PropertyValueNode[Colour]): Self = StObject.set(x, "background-color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setBackground-colorFunction1`(value: NodeSingular => Colour): Self = StObject.set(x, "background-color", js.Any.fromFunction1(value))
    
    @scala.inline
    def `setBackground-colorUndefined`: Self = StObject.set(x, "background-color", js.undefined)
    
    @scala.inline
    def `setBackground-fit`(value: PropertyValueNode[none | contain | cover]): Self = StObject.set(x, "background-fit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setBackground-fitFunction1`(value: NodeSingular => none | contain | cover): Self = StObject.set(x, "background-fit", js.Any.fromFunction1(value))
    
    @scala.inline
    def `setBackground-fitUndefined`: Self = StObject.set(x, "background-fit", js.undefined)
    
    @scala.inline
    def `setBackground-height`(value: PropertyValueNode[Double | String]): Self = StObject.set(x, "background-height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setBackground-heightFunction1`(value: NodeSingular => Double | String): Self = StObject.set(x, "background-height", js.Any.fromFunction1(value))
    
    @scala.inline
    def `setBackground-heightUndefined`: Self = StObject.set(x, "background-height", js.undefined)
    
    @scala.inline
    def `setBackground-image`(value: PropertyValueNode[String]): Self = StObject.set(x, "background-image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setBackground-image-opacity`(value: PropertyValueNode[Double]): Self = StObject.set(x, "background-image-opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setBackground-image-opacityFunction1`(value: NodeSingular => Double): Self = StObject.set(x, "background-image-opacity", js.Any.fromFunction1(value))
    
    @scala.inline
    def `setBackground-image-opacityUndefined`: Self = StObject.set(x, "background-image-opacity", js.undefined)
    
    @scala.inline
    def `setBackground-imageFunction1`(value: NodeSingular => String): Self = StObject.set(x, "background-image", js.Any.fromFunction1(value))
    
    @scala.inline
    def `setBackground-imageUndefined`: Self = StObject.set(x, "background-image", js.undefined)
    
    @scala.inline
    def `setBackground-opacity`(value: PropertyValueNode[Double]): Self = StObject.set(x, "background-opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setBackground-opacityFunction1`(value: NodeSingular => Double): Self = StObject.set(x, "background-opacity", js.Any.fromFunction1(value))
    
    @scala.inline
    def `setBackground-opacityUndefined`: Self = StObject.set(x, "background-opacity", js.undefined)
    
    @scala.inline
    def `setBackground-position-x`(value: PropertyValueNode[Double | String]): Self = StObject.set(x, "background-position-x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setBackground-position-xFunction1`(value: NodeSingular => Double | String): Self = StObject.set(x, "background-position-x", js.Any.fromFunction1(value))
    
    @scala.inline
    def `setBackground-position-xUndefined`: Self = StObject.set(x, "background-position-x", js.undefined)
    
    @scala.inline
    def `setBackground-position-y`(value: PropertyValueNode[Double | String]): Self = StObject.set(x, "background-position-y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setBackground-position-yFunction1`(value: NodeSingular => Double | String): Self = StObject.set(x, "background-position-y", js.Any.fromFunction1(value))
    
    @scala.inline
    def `setBackground-position-yUndefined`: Self = StObject.set(x, "background-position-y", js.undefined)
    
    @scala.inline
    def `setBackground-repeat`(value: PropertyValueNode[`no-repeat` | `repeat-x` | `repeat-y` | repeat]): Self = StObject.set(x, "background-repeat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setBackground-repeatFunction1`(value: NodeSingular => `no-repeat` | `repeat-x` | `repeat-y` | repeat): Self = StObject.set(x, "background-repeat", js.Any.fromFunction1(value))
    
    @scala.inline
    def `setBackground-repeatUndefined`: Self = StObject.set(x, "background-repeat", js.undefined)
    
    @scala.inline
    def `setBackground-width`(value: PropertyValueNode[Double | String]): Self = StObject.set(x, "background-width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setBackground-widthFunction1`(value: NodeSingular => Double | String): Self = StObject.set(x, "background-width", js.Any.fromFunction1(value))
    
    @scala.inline
    def `setBackground-widthUndefined`: Self = StObject.set(x, "background-width", js.undefined)
    
    @scala.inline
    def setBackgroundColor(value: PropertyValueNode[Colour]): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackgroundColorFunction1(value: NodeSingular => Colour): Self = StObject.set(x, "backgroundColor", js.Any.fromFunction1(value))
    
    @scala.inline
    def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
    
    @scala.inline
    def `setBorder-color`(value: PropertyValueNode[Colour]): Self = StObject.set(x, "border-color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setBorder-colorFunction1`(value: NodeSingular => Colour): Self = StObject.set(x, "border-color", js.Any.fromFunction1(value))
    
    @scala.inline
    def `setBorder-colorUndefined`: Self = StObject.set(x, "border-color", js.undefined)
    
    @scala.inline
    def `setBorder-opacity`(value: PropertyValueNode[Double]): Self = StObject.set(x, "border-opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setBorder-opacityFunction1`(value: NodeSingular => Double): Self = StObject.set(x, "border-opacity", js.Any.fromFunction1(value))
    
    @scala.inline
    def `setBorder-opacityUndefined`: Self = StObject.set(x, "border-opacity", js.undefined)
    
    @scala.inline
    def `setBorder-style`(value: PropertyValueNode[LineStyle]): Self = StObject.set(x, "border-style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setBorder-styleFunction1`(value: NodeSingular => LineStyle): Self = StObject.set(x, "border-style", js.Any.fromFunction1(value))
    
    @scala.inline
    def `setBorder-styleUndefined`: Self = StObject.set(x, "border-style", js.undefined)
    
    @scala.inline
    def `setBorder-width`(value: PropertyValueNode[Double | String]): Self = StObject.set(x, "border-width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setBorder-widthFunction1`(value: NodeSingular => Double | String): Self = StObject.set(x, "border-width", js.Any.fromFunction1(value))
    
    @scala.inline
    def `setBorder-widthUndefined`: Self = StObject.set(x, "border-width", js.undefined)
    
    @scala.inline
    def setColor(value: PropertyValue[NodeSingular, Colour]): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorFunction1(value: NodeSingular => Colour): Self = StObject.set(x, "color", js.Any.fromFunction1(value))
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setContent(value: PropertyValueNode[String]): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentFunction1(value: NodeSingular => String): Self = StObject.set(x, "content", js.Any.fromFunction1(value))
    
    @scala.inline
    def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    @scala.inline
    def setDisplay(value: PropertyValue[NodeSingular, none | displayed]): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayFunction1(value: NodeSingular => none | displayed): Self = StObject.set(x, "display", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDisplayUndefined: Self = StObject.set(x, "display", js.undefined)
    
    @scala.inline
    def setEvents(value: PropertyValue[NodeSingular, yes | no]): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventsFunction1(value: NodeSingular => yes | no): Self = StObject.set(x, "events", js.Any.fromFunction1(value))
    
    @scala.inline
    def setEventsUndefined: Self = StObject.set(x, "events", js.undefined)
    
    @scala.inline
    def `setFont-family`(value: PropertyValue[NodeSingular, String]): Self = StObject.set(x, "font-family", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setFont-familyFunction1`(value: NodeSingular => String): Self = StObject.set(x, "font-family", js.Any.fromFunction1(value))
    
    @scala.inline
    def `setFont-familyUndefined`: Self = StObject.set(x, "font-family", js.undefined)
    
    @scala.inline
    def `setFont-size`(value: PropertyValue[NodeSingular, Double | String]): Self = StObject.set(x, "font-size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setFont-sizeFunction1`(value: NodeSingular => Double | String): Self = StObject.set(x, "font-size", js.Any.fromFunction1(value))
    
    @scala.inline
    def `setFont-sizeUndefined`: Self = StObject.set(x, "font-size", js.undefined)
    
    @scala.inline
    def `setFont-style`(value: PropertyValue[NodeSingular, FontStyle]): Self = StObject.set(x, "font-style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setFont-styleFunction1`(value: NodeSingular => FontStyle): Self = StObject.set(x, "font-style", js.Any.fromFunction1(value))
    
    @scala.inline
    def `setFont-styleUndefined`: Self = StObject.set(x, "font-style", js.undefined)
    
    @scala.inline
    def `setFont-weight`(value: PropertyValue[NodeSingular, FontWeight]): Self = StObject.set(x, "font-weight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setFont-weightFunction1`(value: NodeSingular => FontWeight): Self = StObject.set(x, "font-weight", js.Any.fromFunction1(value))
    
    @scala.inline
    def `setFont-weightUndefined`: Self = StObject.set(x, "font-weight", js.undefined)
    
    @scala.inline
    def setGhost(value: PropertyValueNode[yes | no]): Self = StObject.set(x, "ghost", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setGhost-offset-x`(value: PropertyValueNode[Double]): Self = StObject.set(x, "ghost-offset-x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setGhost-offset-xFunction1`(value: NodeSingular => Double): Self = StObject.set(x, "ghost-offset-x", js.Any.fromFunction1(value))
    
    @scala.inline
    def `setGhost-offset-xUndefined`: Self = StObject.set(x, "ghost-offset-x", js.undefined)
    
    @scala.inline
    def `setGhost-offset-y`(value: PropertyValueNode[Double]): Self = StObject.set(x, "ghost-offset-y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setGhost-offset-yFunction1`(value: NodeSingular => Double): Self = StObject.set(x, "ghost-offset-y", js.Any.fromFunction1(value))
    
    @scala.inline
    def `setGhost-offset-yUndefined`: Self = StObject.set(x, "ghost-offset-y", js.undefined)
    
    @scala.inline
    def `setGhost-opacity`(value: PropertyValueNode[Double]): Self = StObject.set(x, "ghost-opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setGhost-opacityFunction1`(value: NodeSingular => Double): Self = StObject.set(x, "ghost-opacity", js.Any.fromFunction1(value))
    
    @scala.inline
    def `setGhost-opacityUndefined`: Self = StObject.set(x, "ghost-opacity", js.undefined)
    
    @scala.inline
    def setGhostFunction1(value: NodeSingular => yes | no): Self = StObject.set(x, "ghost", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGhostUndefined: Self = StObject.set(x, "ghost", js.undefined)
    
    @scala.inline
    def setHeight(value: PropertyValueNode[Double | String]): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightFunction1(value: NodeSingular => Double | String): Self = StObject.set(x, "height", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setLabel(value: PropertyValue[NodeSingular, String]): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelFunction1(value: NodeSingular => String): Self = StObject.set(x, "label", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    @scala.inline
    def `setMin-zoomed-font-size`(value: PropertyValue[NodeSingular, Double]): Self = StObject.set(x, "min-zoomed-font-size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setMin-zoomed-font-sizeFunction1`(value: NodeSingular => Double): Self = StObject.set(x, "min-zoomed-font-size", js.Any.fromFunction1(value))
    
    @scala.inline
    def `setMin-zoomed-font-sizeUndefined`: Self = StObject.set(x, "min-zoomed-font-size", js.undefined)
    
    @scala.inline
    def setOpacity(value: PropertyValue[NodeSingular, Double]): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpacityFunction1(value: NodeSingular => Double): Self = StObject.set(x, "opacity", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
    
    @scala.inline
    def `setOverlay-color`(value: PropertyValueEdge[Colour]): Self = StObject.set(x, "overlay-color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setOverlay-colorFunction1`(value: EdgeSingular => Colour): Self = StObject.set(x, "overlay-color", js.Any.fromFunction1(value))
    
    @scala.inline
    def `setOverlay-colorUndefined`: Self = StObject.set(x, "overlay-color", js.undefined)
    
    @scala.inline
    def `setOverlay-opacity`(value: PropertyValueEdge[Double]): Self = StObject.set(x, "overlay-opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setOverlay-opacityFunction1`(value: EdgeSingular => Double): Self = StObject.set(x, "overlay-opacity", js.Any.fromFunction1(value))
    
    @scala.inline
    def `setOverlay-opacityUndefined`: Self = StObject.set(x, "overlay-opacity", js.undefined)
    
    @scala.inline
    def `setOverlay-padding`(value: PropertyValueEdge[Double | String]): Self = StObject.set(x, "overlay-padding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setOverlay-paddingFunction1`(value: EdgeSingular => Double | String): Self = StObject.set(x, "overlay-padding", js.Any.fromFunction1(value))
    
    @scala.inline
    def `setOverlay-paddingUndefined`: Self = StObject.set(x, "overlay-padding", js.undefined)
    
    @scala.inline
    def `setPadding-bottom`(value: PropertyValueNode[String]): Self = StObject.set(x, "padding-bottom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setPadding-bottomFunction1`(value: NodeSingular => String): Self = StObject.set(x, "padding-bottom", js.Any.fromFunction1(value))
    
    @scala.inline
    def `setPadding-bottomUndefined`: Self = StObject.set(x, "padding-bottom", js.undefined)
    
    @scala.inline
    def `setPadding-left`(value: PropertyValueNode[String]): Self = StObject.set(x, "padding-left", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setPadding-leftFunction1`(value: NodeSingular => String): Self = StObject.set(x, "padding-left", js.Any.fromFunction1(value))
    
    @scala.inline
    def `setPadding-leftUndefined`: Self = StObject.set(x, "padding-left", js.undefined)
    
    @scala.inline
    def `setPadding-right`(value: PropertyValueNode[String]): Self = StObject.set(x, "padding-right", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setPadding-rightFunction1`(value: NodeSingular => String): Self = StObject.set(x, "padding-right", js.Any.fromFunction1(value))
    
    @scala.inline
    def `setPadding-rightUndefined`: Self = StObject.set(x, "padding-right", js.undefined)
    
    @scala.inline
    def `setPadding-top`(value: PropertyValueNode[String]): Self = StObject.set(x, "padding-top", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setPadding-topFunction1`(value: NodeSingular => String): Self = StObject.set(x, "padding-top", js.Any.fromFunction1(value))
    
    @scala.inline
    def `setPadding-topUndefined`: Self = StObject.set(x, "padding-top", js.undefined)
    
    @scala.inline
    def `setPie-i-background-color`(value: PropertyValueNode[Colour]): Self = StObject.set(x, "pie-i-background-color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setPie-i-background-colorFunction1`(value: NodeSingular => Colour): Self = StObject.set(x, "pie-i-background-color", js.Any.fromFunction1(value))
    
    @scala.inline
    def `setPie-i-background-colorUndefined`: Self = StObject.set(x, "pie-i-background-color", js.undefined)
    
    @scala.inline
    def `setPie-i-background-opacity`(value: PropertyValueNode[Double]): Self = StObject.set(x, "pie-i-background-opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setPie-i-background-opacityFunction1`(value: NodeSingular => Double): Self = StObject.set(x, "pie-i-background-opacity", js.Any.fromFunction1(value))
    
    @scala.inline
    def `setPie-i-background-opacityUndefined`: Self = StObject.set(x, "pie-i-background-opacity", js.undefined)
    
    @scala.inline
    def `setPie-i-background-size`(value: PropertyValueNode[Double]): Self = StObject.set(x, "pie-i-background-size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setPie-i-background-sizeFunction1`(value: NodeSingular => Double): Self = StObject.set(x, "pie-i-background-size", js.Any.fromFunction1(value))
    
    @scala.inline
    def `setPie-i-background-sizeUndefined`: Self = StObject.set(x, "pie-i-background-size", js.undefined)
    
    @scala.inline
    def `setPie-size`(value: PropertyValueNode[String]): Self = StObject.set(x, "pie-size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setPie-sizeFunction1`(value: NodeSingular => String): Self = StObject.set(x, "pie-size", js.Any.fromFunction1(value))
    
    @scala.inline
    def `setPie-sizeUndefined`: Self = StObject.set(x, "pie-size", js.undefined)
    
    @scala.inline
    def setShape(value: PropertyValueNode[NodeShape]): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setShape-polygon-points`(value: PropertyValueNode[ShapePolygonPoints]): Self = StObject.set(x, "shape-polygon-points", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setShape-polygon-pointsFunction1`(value: NodeSingular => ShapePolygonPoints): Self = StObject.set(x, "shape-polygon-points", js.Any.fromFunction1(value))
    
    @scala.inline
    def `setShape-polygon-pointsUndefined`: Self = StObject.set(x, "shape-polygon-points", js.undefined)
    
    @scala.inline
    def setShapeFunction1(value: NodeSingular => NodeShape): Self = StObject.set(x, "shape", js.Any.fromFunction1(value))
    
    @scala.inline
    def setShapeUndefined: Self = StObject.set(x, "shape", js.undefined)
    
    @scala.inline
    def `setSource-label`(value: PropertyValue[NodeSingular, String]): Self = StObject.set(x, "source-label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setSource-labelFunction1`(value: NodeSingular => String): Self = StObject.set(x, "source-label", js.Any.fromFunction1(value))
    
    @scala.inline
    def `setSource-labelUndefined`: Self = StObject.set(x, "source-label", js.undefined)
    
    @scala.inline
    def `setSource-text-margin-x`(value: PropertyValue[NodeSingular, Double]): Self = StObject.set(x, "source-text-margin-x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setSource-text-margin-xFunction1`(value: NodeSingular => Double): Self = StObject.set(x, "source-text-margin-x", js.Any.fromFunction1(value))
    
    @scala.inline
    def `setSource-text-margin-xUndefined`: Self = StObject.set(x, "source-text-margin-x", js.undefined)
    
    @scala.inline
    def `setSource-text-margin-y`(value: PropertyValue[NodeSingular, Double]): Self = StObject.set(x, "source-text-margin-y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setSource-text-margin-yFunction1`(value: NodeSingular => Double): Self = StObject.set(x, "source-text-margin-y", js.Any.fromFunction1(value))
    
    @scala.inline
    def `setSource-text-margin-yUndefined`: Self = StObject.set(x, "source-text-margin-y", js.undefined)
    
    @scala.inline
    def `setSource-text-offset`(value: PropertyValue[NodeSingular, Double]): Self = StObject.set(x, "source-text-offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setSource-text-offsetFunction1`(value: NodeSingular => Double): Self = StObject.set(x, "source-text-offset", js.Any.fromFunction1(value))
    
    @scala.inline
    def `setSource-text-offsetUndefined`: Self = StObject.set(x, "source-text-offset", js.undefined)
    
    @scala.inline
    def `setSource-text-rotation`(value: PropertyValue[NodeSingular, Double]): Self = StObject.set(x, "source-text-rotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setSource-text-rotationFunction1`(value: NodeSingular => Double): Self = StObject.set(x, "source-text-rotation", js.Any.fromFunction1(value))
    
    @scala.inline
    def `setSource-text-rotationUndefined`: Self = StObject.set(x, "source-text-rotation", js.undefined)
    
    @scala.inline
    def `setTarget-label`(value: PropertyValue[NodeSingular, String]): Self = StObject.set(x, "target-label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setTarget-labelFunction1`(value: NodeSingular => String): Self = StObject.set(x, "target-label", js.Any.fromFunction1(value))
    
    @scala.inline
    def `setTarget-labelUndefined`: Self = StObject.set(x, "target-label", js.undefined)
    
    @scala.inline
    def `setTarget-text-margin-x`(value: PropertyValue[NodeSingular, Double]): Self = StObject.set(x, "target-text-margin-x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setTarget-text-margin-xFunction1`(value: NodeSingular => Double): Self = StObject.set(x, "target-text-margin-x", js.Any.fromFunction1(value))
    
    @scala.inline
    def `setTarget-text-margin-xUndefined`: Self = StObject.set(x, "target-text-margin-x", js.undefined)
    
    @scala.inline
    def `setTarget-text-margin-y`(value: PropertyValue[NodeSingular, Double]): Self = StObject.set(x, "target-text-margin-y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setTarget-text-margin-yFunction1`(value: NodeSingular => Double): Self = StObject.set(x, "target-text-margin-y", js.Any.fromFunction1(value))
    
    @scala.inline
    def `setTarget-text-margin-yUndefined`: Self = StObject.set(x, "target-text-margin-y", js.undefined)
    
    @scala.inline
    def `setTarget-text-offset`(value: PropertyValue[NodeSingular, Double]): Self = StObject.set(x, "target-text-offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setTarget-text-offsetFunction1`(value: NodeSingular => Double): Self = StObject.set(x, "target-text-offset", js.Any.fromFunction1(value))
    
    @scala.inline
    def `setTarget-text-offsetUndefined`: Self = StObject.set(x, "target-text-offset", js.undefined)
    
    @scala.inline
    def `setTarget-text-rotation`(value: PropertyValue[NodeSingular, Double]): Self = StObject.set(x, "target-text-rotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setTarget-text-rotationFunction1`(value: NodeSingular => Double): Self = StObject.set(x, "target-text-rotation", js.Any.fromFunction1(value))
    
    @scala.inline
    def `setTarget-text-rotationUndefined`: Self = StObject.set(x, "target-text-rotation", js.undefined)
    
    @scala.inline
    def `setText-background-color`(value: PropertyValue[NodeSingular, Colour]): Self = StObject.set(x, "text-background-color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setText-background-colorFunction1`(value: NodeSingular => Colour): Self = StObject.set(x, "text-background-color", js.Any.fromFunction1(value))
    
    @scala.inline
    def `setText-background-colorUndefined`: Self = StObject.set(x, "text-background-color", js.undefined)
    
    @scala.inline
    def `setText-background-opacity`(value: PropertyValue[NodeSingular, Double]): Self = StObject.set(x, "text-background-opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setText-background-opacityFunction1`(value: NodeSingular => Double): Self = StObject.set(x, "text-background-opacity", js.Any.fromFunction1(value))
    
    @scala.inline
    def `setText-background-opacityUndefined`: Self = StObject.set(x, "text-background-opacity", js.undefined)
    
    @scala.inline
    def `setText-background-padding`(value: PropertyValue[NodeSingular, String]): Self = StObject.set(x, "text-background-padding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setText-background-paddingFunction1`(value: NodeSingular => String): Self = StObject.set(x, "text-background-padding", js.Any.fromFunction1(value))
    
    @scala.inline
    def `setText-background-paddingUndefined`: Self = StObject.set(x, "text-background-padding", js.undefined)
    
    @scala.inline
    def `setText-background-shape`(value: PropertyValue[NodeSingular, rectangle | roundrectangle]): Self = StObject.set(x, "text-background-shape", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setText-background-shapeFunction1`(value: NodeSingular => rectangle | roundrectangle): Self = StObject.set(x, "text-background-shape", js.Any.fromFunction1(value))
    
    @scala.inline
    def `setText-background-shapeUndefined`: Self = StObject.set(x, "text-background-shape", js.undefined)
    
    @scala.inline
    def `setText-border-color`(value: PropertyValue[NodeSingular, Colour]): Self = StObject.set(x, "text-border-color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setText-border-colorFunction1`(value: NodeSingular => Colour): Self = StObject.set(x, "text-border-color", js.Any.fromFunction1(value))
    
    @scala.inline
    def `setText-border-colorUndefined`: Self = StObject.set(x, "text-border-color", js.undefined)
    
    @scala.inline
    def `setText-border-opacity`(value: PropertyValue[NodeSingular, Double]): Self = StObject.set(x, "text-border-opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setText-border-opacityFunction1`(value: NodeSingular => Double): Self = StObject.set(x, "text-border-opacity", js.Any.fromFunction1(value))
    
    @scala.inline
    def `setText-border-opacityUndefined`: Self = StObject.set(x, "text-border-opacity", js.undefined)
    
    @scala.inline
    def `setText-border-style`(value: PropertyValue[NodeSingular, LineStyle]): Self = StObject.set(x, "text-border-style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setText-border-styleFunction1`(value: NodeSingular => LineStyle): Self = StObject.set(x, "text-border-style", js.Any.fromFunction1(value))
    
    @scala.inline
    def `setText-border-styleUndefined`: Self = StObject.set(x, "text-border-style", js.undefined)
    
    @scala.inline
    def `setText-border-width`(value: PropertyValue[NodeSingular, Double]): Self = StObject.set(x, "text-border-width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setText-border-widthFunction1`(value: NodeSingular => Double): Self = StObject.set(x, "text-border-width", js.Any.fromFunction1(value))
    
    @scala.inline
    def `setText-border-widthUndefined`: Self = StObject.set(x, "text-border-width", js.undefined)
    
    @scala.inline
    def `setText-events`(value: PropertyValue[NodeSingular, yes | no]): Self = StObject.set(x, "text-events", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setText-eventsFunction1`(value: NodeSingular => yes | no): Self = StObject.set(x, "text-events", js.Any.fromFunction1(value))
    
    @scala.inline
    def `setText-eventsUndefined`: Self = StObject.set(x, "text-events", js.undefined)
    
    @scala.inline
    def `setText-halign`(value: PropertyValue[NodeSingular, left | center | right]): Self = StObject.set(x, "text-halign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setText-halignFunction1`(value: NodeSingular => left | center | right): Self = StObject.set(x, "text-halign", js.Any.fromFunction1(value))
    
    @scala.inline
    def `setText-halignUndefined`: Self = StObject.set(x, "text-halign", js.undefined)
    
    @scala.inline
    def `setText-margin-x`(value: PropertyValue[NodeSingular, Double]): Self = StObject.set(x, "text-margin-x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setText-margin-xFunction1`(value: NodeSingular => Double): Self = StObject.set(x, "text-margin-x", js.Any.fromFunction1(value))
    
    @scala.inline
    def `setText-margin-xUndefined`: Self = StObject.set(x, "text-margin-x", js.undefined)
    
    @scala.inline
    def `setText-margin-y`(value: PropertyValue[NodeSingular, Double]): Self = StObject.set(x, "text-margin-y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setText-margin-yFunction1`(value: NodeSingular => Double): Self = StObject.set(x, "text-margin-y", js.Any.fromFunction1(value))
    
    @scala.inline
    def `setText-margin-yUndefined`: Self = StObject.set(x, "text-margin-y", js.undefined)
    
    @scala.inline
    def `setText-max-width`(value: PropertyValue[NodeSingular, String]): Self = StObject.set(x, "text-max-width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setText-max-widthFunction1`(value: NodeSingular => String): Self = StObject.set(x, "text-max-width", js.Any.fromFunction1(value))
    
    @scala.inline
    def `setText-max-widthUndefined`: Self = StObject.set(x, "text-max-width", js.undefined)
    
    @scala.inline
    def `setText-opacity`(value: PropertyValue[NodeSingular, Double]): Self = StObject.set(x, "text-opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setText-opacityFunction1`(value: NodeSingular => Double): Self = StObject.set(x, "text-opacity", js.Any.fromFunction1(value))
    
    @scala.inline
    def `setText-opacityUndefined`: Self = StObject.set(x, "text-opacity", js.undefined)
    
    @scala.inline
    def `setText-outline-color`(value: PropertyValue[NodeSingular, Colour]): Self = StObject.set(x, "text-outline-color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setText-outline-colorFunction1`(value: NodeSingular => Colour): Self = StObject.set(x, "text-outline-color", js.Any.fromFunction1(value))
    
    @scala.inline
    def `setText-outline-colorUndefined`: Self = StObject.set(x, "text-outline-color", js.undefined)
    
    @scala.inline
    def `setText-outline-opacity`(value: PropertyValue[NodeSingular, Double]): Self = StObject.set(x, "text-outline-opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setText-outline-opacityFunction1`(value: NodeSingular => Double): Self = StObject.set(x, "text-outline-opacity", js.Any.fromFunction1(value))
    
    @scala.inline
    def `setText-outline-opacityUndefined`: Self = StObject.set(x, "text-outline-opacity", js.undefined)
    
    @scala.inline
    def `setText-outline-width`(value: PropertyValue[NodeSingular, Double | String]): Self = StObject.set(x, "text-outline-width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setText-outline-widthFunction1`(value: NodeSingular => Double | String): Self = StObject.set(x, "text-outline-width", js.Any.fromFunction1(value))
    
    @scala.inline
    def `setText-outline-widthUndefined`: Self = StObject.set(x, "text-outline-width", js.undefined)
    
    @scala.inline
    def `setText-rotation`(value: PropertyValue[NodeSingular, Double]): Self = StObject.set(x, "text-rotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setText-rotationFunction1`(value: NodeSingular => Double): Self = StObject.set(x, "text-rotation", js.Any.fromFunction1(value))
    
    @scala.inline
    def `setText-rotationUndefined`: Self = StObject.set(x, "text-rotation", js.undefined)
    
    @scala.inline
    def `setText-shadow-blur`(value: PropertyValue[NodeSingular, Double]): Self = StObject.set(x, "text-shadow-blur", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setText-shadow-blurFunction1`(value: NodeSingular => Double): Self = StObject.set(x, "text-shadow-blur", js.Any.fromFunction1(value))
    
    @scala.inline
    def `setText-shadow-blurUndefined`: Self = StObject.set(x, "text-shadow-blur", js.undefined)
    
    @scala.inline
    def `setText-shadow-color`(value: PropertyValue[NodeSingular, Colour]): Self = StObject.set(x, "text-shadow-color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setText-shadow-colorFunction1`(value: NodeSingular => Colour): Self = StObject.set(x, "text-shadow-color", js.Any.fromFunction1(value))
    
    @scala.inline
    def `setText-shadow-colorUndefined`: Self = StObject.set(x, "text-shadow-color", js.undefined)
    
    @scala.inline
    def `setText-shadow-offset-x`(value: PropertyValue[NodeSingular, Double]): Self = StObject.set(x, "text-shadow-offset-x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setText-shadow-offset-xFunction1`(value: NodeSingular => Double): Self = StObject.set(x, "text-shadow-offset-x", js.Any.fromFunction1(value))
    
    @scala.inline
    def `setText-shadow-offset-xUndefined`: Self = StObject.set(x, "text-shadow-offset-x", js.undefined)
    
    @scala.inline
    def `setText-shadow-offset-y`(value: PropertyValue[NodeSingular, Double]): Self = StObject.set(x, "text-shadow-offset-y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setText-shadow-offset-yFunction1`(value: NodeSingular => Double): Self = StObject.set(x, "text-shadow-offset-y", js.Any.fromFunction1(value))
    
    @scala.inline
    def `setText-shadow-offset-yUndefined`: Self = StObject.set(x, "text-shadow-offset-y", js.undefined)
    
    @scala.inline
    def `setText-shadow-opacity`(value: PropertyValue[NodeSingular, Double]): Self = StObject.set(x, "text-shadow-opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setText-shadow-opacityFunction1`(value: NodeSingular => Double): Self = StObject.set(x, "text-shadow-opacity", js.Any.fromFunction1(value))
    
    @scala.inline
    def `setText-shadow-opacityUndefined`: Self = StObject.set(x, "text-shadow-opacity", js.undefined)
    
    @scala.inline
    def `setText-transform`(value: PropertyValue[NodeSingular, TextTranformation]): Self = StObject.set(x, "text-transform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setText-transformFunction1`(value: NodeSingular => TextTranformation): Self = StObject.set(x, "text-transform", js.Any.fromFunction1(value))
    
    @scala.inline
    def `setText-transformUndefined`: Self = StObject.set(x, "text-transform", js.undefined)
    
    @scala.inline
    def `setText-valign`(value: PropertyValue[NodeSingular, top | center | bottom]): Self = StObject.set(x, "text-valign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setText-valignFunction1`(value: NodeSingular => top | center | bottom): Self = StObject.set(x, "text-valign", js.Any.fromFunction1(value))
    
    @scala.inline
    def `setText-valignUndefined`: Self = StObject.set(x, "text-valign", js.undefined)
    
    @scala.inline
    def `setText-wrap`(value: PropertyValue[NodeSingular, none | wrap | ellipsis]): Self = StObject.set(x, "text-wrap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setText-wrapFunction1`(value: NodeSingular => none | wrap | ellipsis): Self = StObject.set(x, "text-wrap", js.Any.fromFunction1(value))
    
    @scala.inline
    def `setText-wrapUndefined`: Self = StObject.set(x, "text-wrap", js.undefined)
    
    @scala.inline
    def `setTransition-delay`(value: Double): Self = StObject.set(x, "transition-delay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setTransition-delayUndefined`: Self = StObject.set(x, "transition-delay", js.undefined)
    
    @scala.inline
    def `setTransition-duration`(value: Double): Self = StObject.set(x, "transition-duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setTransition-durationUndefined`: Self = StObject.set(x, "transition-duration", js.undefined)
    
    @scala.inline
    def `setTransition-property`(value: String): Self = StObject.set(x, "transition-property", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setTransition-propertyUndefined`: Self = StObject.set(x, "transition-property", js.undefined)
    
    @scala.inline
    def `setTransition-timing-function`(value: TransitionTimingFunction): Self = StObject.set(x, "transition-timing-function", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setTransition-timing-functionUndefined`: Self = StObject.set(x, "transition-timing-function", js.undefined)
    
    @scala.inline
    def setVisibility(value: PropertyValue[NodeSingular, hidden | visible]): Self = StObject.set(x, "visibility", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibilityFunction1(value: NodeSingular => hidden | visible): Self = StObject.set(x, "visibility", js.Any.fromFunction1(value))
    
    @scala.inline
    def setVisibilityUndefined: Self = StObject.set(x, "visibility", js.undefined)
    
    @scala.inline
    def setWidth(value: PropertyValueNode[Double | String]): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthFunction1(value: NodeSingular => Double | String): Self = StObject.set(x, "width", js.Any.fromFunction1(value))
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    
    @scala.inline
    def `setZ-index`(value: PropertyValue[NodeSingular, Double]): Self = StObject.set(x, "z-index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setZ-indexFunction1`(value: NodeSingular => Double): Self = StObject.set(x, "z-index", js.Any.fromFunction1(value))
    
    @scala.inline
    def `setZ-indexUndefined`: Self = StObject.set(x, "z-index", js.undefined)
  }
}
