package typingsSlinky.jupyterlabApputils.hoverboxMod.HoverBox

import org.scalajs.dom.raw.CSSStyleDeclaration
import org.scalajs.dom.raw.ClientRect
import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.jupyterlabApputils.AnonHorizontal
import typingsSlinky.jupyterlabApputils.jupyterlabApputilsStrings.above
import typingsSlinky.jupyterlabApputils.jupyterlabApputilsStrings.below
import typingsSlinky.jupyterlabApputils.jupyterlabApputilsStrings.forceAbove
import typingsSlinky.jupyterlabApputils.jupyterlabApputilsStrings.forceBelow
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options for setting the geometry of a hovering node and its anchor node.
  */
@js.native
trait IOptions extends js.Object {
  /**
    * The referent anchor rectangle to which the hover box is bound.
    *
    * #### Notes
    * In an editor context, this value will typically be the cursor's
    * coordinate position, which can be retrieved via calling the
    * `getCoordinateForPosition` method.
    */
  var anchor: ClientRect = js.native
  /**
    * The node that hosts the anchor.
    *
    * #### Notes
    * The visibility of the anchor rectangle within this host node is the
    * heuristic that determines whether the hover box ought to be visible.
    */
  var host: HTMLElement = js.native
  /**
    * The maximum height of a hover box.
    *
    * #### Notes
    * This value is only used if a CSS max-height attribute is not set for the
    * hover box. It is a fallback value.
    */
  var maxHeight: Double = js.native
  /**
    * The minimum height of a hover box.
    */
  var minHeight: Double = js.native
  /**
    * The hover box node.
    */
  var node: HTMLElement = js.native
  /**
    * Optional pixel offset values added to where the hover box should render.
    *
    * #### Notes
    * This option is useful for passing in values that may pertain to CSS
    * borders or padding in cases where the text inside the hover box may need
    * to align with the text of the referent editor.
    *
    * Because the hover box calculation may render a box either above or below
    * the cursor, the `vertical` offset accepts `above` and `below` values for
    * the different render modes.
    */
  var offset: js.UndefOr[AnonHorizontal] = js.native
  /**
    * If space is available both above and below the anchor, denote which
    * location is privileged. Use forceBelow and forceAbove to mandate where
    * hover box should render relative to anchor.
    *
    * #### Notes
    * The default value is `'below'`.
    */
  var privilege: js.UndefOr[above | below | forceAbove | forceBelow] = js.native
  /**
    * If the style of the node has already been computed, it can be passed into
    * the hover box for geometry calculation.
    */
  var style: js.UndefOr[CSSStyleDeclaration] = js.native
}

object IOptions {
  @scala.inline
  def apply(anchor: ClientRect, host: HTMLElement, maxHeight: Double, minHeight: Double, node: HTMLElement): IOptions = {
    val __obj = js.Dynamic.literal(anchor = anchor.asInstanceOf[js.Any], host = host.asInstanceOf[js.Any], maxHeight = maxHeight.asInstanceOf[js.Any], minHeight = minHeight.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOptions]
  }
  @scala.inline
  implicit class IOptionsOps[Self <: IOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnchor(value: ClientRect): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("anchor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHost(value: HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("host")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaxHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMinHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNode(value: HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("node")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOffset(value: AnonHorizontal): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offset")(js.undefined)
        ret
    }
    @scala.inline
    def withPrivilege(value: above | below | forceAbove | forceBelow): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("privilege")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrivilege: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("privilege")(js.undefined)
        ret
    }
    @scala.inline
    def withStyle(value: CSSStyleDeclaration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(js.undefined)
        ret
    }
  }
  
}

