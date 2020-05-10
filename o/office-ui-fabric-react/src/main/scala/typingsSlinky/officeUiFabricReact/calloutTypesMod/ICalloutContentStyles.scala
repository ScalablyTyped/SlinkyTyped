package typingsSlinky.officeUiFabricReact.calloutTypesMod

import typingsSlinky.uifabricMergeStyles.istyleMod.IStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICalloutContentStyles extends js.Object {
  /**
    * Style for callout beak.
    */
  var beak: IStyle = js.native
  /**
    * Style for callout beak curtain.
    */
  var beakCurtain: IStyle = js.native
  /**
    * Style for content component of the callout.
    */
  var calloutMain: IStyle = js.native
  /**
    * Style for wrapper of Callout component.
    */
  var container: IStyle = js.native
  /**
    * Style for callout container root element.
    */
  var root: IStyle = js.native
}

object ICalloutContentStyles {
  @scala.inline
  def apply(): ICalloutContentStyles = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ICalloutContentStyles]
  }
  @scala.inline
  implicit class ICalloutContentStylesOps[Self <: ICalloutContentStyles] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBeak(value: IStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beak")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBeak: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beak")(js.undefined)
        ret
    }
    @scala.inline
    def withBeakNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beak")(null)
        ret
    }
    @scala.inline
    def withBeakCurtain(value: IStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beakCurtain")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBeakCurtain: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beakCurtain")(js.undefined)
        ret
    }
    @scala.inline
    def withBeakCurtainNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beakCurtain")(null)
        ret
    }
    @scala.inline
    def withCalloutMain(value: IStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calloutMain")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCalloutMain: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calloutMain")(js.undefined)
        ret
    }
    @scala.inline
    def withCalloutMainNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calloutMain")(null)
        ret
    }
    @scala.inline
    def withContainer(value: IStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("container")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContainer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("container")(js.undefined)
        ret
    }
    @scala.inline
    def withContainerNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("container")(null)
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
  }
  
}

