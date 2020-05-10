package typingsSlinky.cytoscape.mod.Css

import typingsSlinky.cytoscape.cytoscapeStrings.`no-repeat`
import typingsSlinky.cytoscape.cytoscapeStrings.`repeat-x`
import typingsSlinky.cytoscape.cytoscapeStrings.`repeat-y`
import typingsSlinky.cytoscape.cytoscapeStrings.clipped
import typingsSlinky.cytoscape.cytoscapeStrings.contain
import typingsSlinky.cytoscape.cytoscapeStrings.cover
import typingsSlinky.cytoscape.cytoscapeStrings.none
import typingsSlinky.cytoscape.cytoscapeStrings.repeat
import typingsSlinky.cytoscape.mod.NodeSingular
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// export interface ElementCss extends CSSStyleDeclaration { }
/**
  * A background image may be applied to a node’s body:
  *
  * http://js.cytoscape.org/#style/background-image
  */
@js.native
trait BackgroundImage extends js.Object {
  /**
    * How background image clipping is handled;
    * may be node for clipped to node shape or none for no clipping.
    */
  var `background-clip`: js.UndefOr[PropertyValueNode[clipped | none]] = js.native
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
}

object BackgroundImage {
  @scala.inline
  def apply(): BackgroundImage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BackgroundImage]
  }
  @scala.inline
  implicit class BackgroundImageOps[Self <: BackgroundImage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
  }
  
}

