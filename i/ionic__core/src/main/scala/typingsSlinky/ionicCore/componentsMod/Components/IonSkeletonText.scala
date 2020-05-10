package typingsSlinky.ionicCore.componentsMod.Components

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IonSkeletonText extends js.Object {
  /**
    * If `true`, the skeleton text will animate.
    */
  var animated: Boolean = js.native
  /**
    * @deprecated Use CSS instead. The width of the skeleton text. If supplied, it will override the CSS style.
    */
  var width: js.UndefOr[String] = js.native
}

object IonSkeletonText {
  @scala.inline
  def apply(animated: Boolean): IonSkeletonText = {
    val __obj = js.Dynamic.literal(animated = animated.asInstanceOf[js.Any])
    __obj.asInstanceOf[IonSkeletonText]
  }
  @scala.inline
  implicit class IonSkeletonTextOps[Self <: IonSkeletonText] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnimated(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWidth(value: String): Self = {
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
  }
  
}

