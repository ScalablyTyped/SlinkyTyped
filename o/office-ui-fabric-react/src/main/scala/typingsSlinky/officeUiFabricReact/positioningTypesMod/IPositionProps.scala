package typingsSlinky.officeUiFabricReact.positioningTypesMod

import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.MouseEvent
import typingsSlinky.officeUiFabricReact.directionalHintMod.DirectionalHint
import typingsSlinky.uifabricUtilities.irectangleMod.IRectangle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPositionProps extends js.Object {
  /**
    * If true the positioning logic will prefer flipping edges over nudging the rectangle to fit within bounds,
    * thus making sure the element align perfectly with target.
    */
  var alignTargetEdge: js.UndefOr[Boolean] = js.native
  /**
    * The bounding rectangle for which  the contextual menu can appear in.
    */
  var bounds: js.UndefOr[IRectangle] = js.native
  /**
    * If true the position returned will have the menu element cover the target.
    * If false then it will position next to the target;
    */
  var coverTarget: js.UndefOr[Boolean] = js.native
  /** how the element should be positioned */
  var directionalHint: js.UndefOr[DirectionalHint] = js.native
  /**
    * If true the position will not change edges in an attempt to fit the rectangle within bounds.
    * It will still attempt to align it to whatever bounds are given.
    * @defaultvalue false
    */
  var directionalHintFixed: js.UndefOr[Boolean] = js.native
  /**
    * How the element should be positioned in RTL layouts.
    * If not specified, a mirror of `directionalHint` will be used instead
    */
  var directionalHintForRTL: js.UndefOr[DirectionalHint] = js.native
  /** The gap between the callout and the target */
  var gapSpace: js.UndefOr[Double] = js.native
  var target: js.UndefOr[Element | MouseEvent | IPoint] = js.native
}

object IPositionProps {
  @scala.inline
  def apply(): IPositionProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPositionProps]
  }
  @scala.inline
  implicit class IPositionPropsOps[Self <: IPositionProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlignTargetEdge(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alignTargetEdge")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlignTargetEdge: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alignTargetEdge")(js.undefined)
        ret
    }
    @scala.inline
    def withBounds(value: IRectangle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bounds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBounds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bounds")(js.undefined)
        ret
    }
    @scala.inline
    def withCoverTarget(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coverTarget")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCoverTarget: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coverTarget")(js.undefined)
        ret
    }
    @scala.inline
    def withDirectionalHint(value: DirectionalHint): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("directionalHint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDirectionalHint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("directionalHint")(js.undefined)
        ret
    }
    @scala.inline
    def withDirectionalHintFixed(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("directionalHintFixed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDirectionalHintFixed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("directionalHintFixed")(js.undefined)
        ret
    }
    @scala.inline
    def withDirectionalHintForRTL(value: DirectionalHint): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("directionalHintForRTL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDirectionalHintForRTL: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("directionalHintForRTL")(js.undefined)
        ret
    }
    @scala.inline
    def withGapSpace(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gapSpace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGapSpace: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gapSpace")(js.undefined)
        ret
    }
    @scala.inline
    def withTargetElement(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTargetMouseEvent(value: MouseEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTarget(value: Element | MouseEvent | IPoint): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTarget: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(js.undefined)
        ret
    }
  }
  
}

