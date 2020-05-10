package typingsSlinky.officeUiFabricReact.coachmarkTypesMod

import typingsSlinky.uifabricMergeStyles.istyleMod.IStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICoachmarkStyles extends js.Object {
  /**
    * The styles applied to the ARIA attribute container
    */
  var ariaContainer: js.UndefOr[IStyle] = js.native
  /**
    * The layer that directly contains the TeachingBubbleContent
    */
  var childrenContainer: IStyle = js.native
  /**
    * The styles applied when the Coachmark has collapsed.
    */
  var collapsed: js.UndefOr[IStyle] = js.native
  /**
    * The layer that content/components/elements will be hosted in.
    */
  var entityHost: js.UndefOr[IStyle] = js.native
  /**
    * The inner layer that components will be hosted in
    * and primary purpose is scaling the layer down while the
    * Coachmark collapsed.
    */
  var entityInnerHost: IStyle = js.native
  /**
    * The pulsing beacon that animates when the Coachmark is collapsed.
    */
  var pulsingBeacon: js.UndefOr[IStyle] = js.native
  /**
    * Style for the root element in the default enabled/unchecked state.
    */
  var root: js.UndefOr[IStyle] = js.native
  /**
    * The layer the Rotate animation will be applied to.
    */
  var rotateAnimationLayer: js.UndefOr[IStyle] = js.native
  /**
    * The layer the Scale animation will be applied to.
    */
  var scaleAnimationLayer: js.UndefOr[IStyle] = js.native
  /**
    * The layer, or div, that the translate animation will be applied to.
    */
  var translateAnimationContainer: js.UndefOr[IStyle] = js.native
}

object ICoachmarkStyles {
  @scala.inline
  def apply(): ICoachmarkStyles = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ICoachmarkStyles]
  }
  @scala.inline
  implicit class ICoachmarkStylesOps[Self <: ICoachmarkStyles] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAriaContainer(value: IStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ariaContainer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAriaContainer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ariaContainer")(js.undefined)
        ret
    }
    @scala.inline
    def withAriaContainerNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ariaContainer")(null)
        ret
    }
    @scala.inline
    def withChildrenContainer(value: IStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("childrenContainer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChildrenContainer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("childrenContainer")(js.undefined)
        ret
    }
    @scala.inline
    def withChildrenContainerNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("childrenContainer")(null)
        ret
    }
    @scala.inline
    def withCollapsed(value: IStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collapsed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCollapsed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collapsed")(js.undefined)
        ret
    }
    @scala.inline
    def withCollapsedNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collapsed")(null)
        ret
    }
    @scala.inline
    def withEntityHost(value: IStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entityHost")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEntityHost: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entityHost")(js.undefined)
        ret
    }
    @scala.inline
    def withEntityHostNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entityHost")(null)
        ret
    }
    @scala.inline
    def withEntityInnerHost(value: IStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entityInnerHost")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEntityInnerHost: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entityInnerHost")(js.undefined)
        ret
    }
    @scala.inline
    def withEntityInnerHostNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entityInnerHost")(null)
        ret
    }
    @scala.inline
    def withPulsingBeacon(value: IStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pulsingBeacon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPulsingBeacon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pulsingBeacon")(js.undefined)
        ret
    }
    @scala.inline
    def withPulsingBeaconNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pulsingBeacon")(null)
        ret
    }
    @scala.inline
    def withRoot(value: IStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("root")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRoot: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("root")(js.undefined)
        ret
    }
    @scala.inline
    def withRootNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("root")(null)
        ret
    }
    @scala.inline
    def withRotateAnimationLayer(value: IStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rotateAnimationLayer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRotateAnimationLayer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rotateAnimationLayer")(js.undefined)
        ret
    }
    @scala.inline
    def withRotateAnimationLayerNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rotateAnimationLayer")(null)
        ret
    }
    @scala.inline
    def withScaleAnimationLayer(value: IStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scaleAnimationLayer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScaleAnimationLayer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scaleAnimationLayer")(js.undefined)
        ret
    }
    @scala.inline
    def withScaleAnimationLayerNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scaleAnimationLayer")(null)
        ret
    }
    @scala.inline
    def withTranslateAnimationContainer(value: IStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("translateAnimationContainer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTranslateAnimationContainer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("translateAnimationContainer")(js.undefined)
        ret
    }
    @scala.inline
    def withTranslateAnimationContainerNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("translateAnimationContainer")(null)
        ret
    }
  }
  
}

