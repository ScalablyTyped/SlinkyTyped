package typingsSlinky.reactLottie.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClassName extends js.Object {
  var className: js.UndefOr[String] = js.native
  var clearCanvas: js.UndefOr[Boolean] = js.native
  /**
    * The canvas context
    */
  var context: js.UndefOr[js.Any] = js.native
  /**
    * Hides elements when opacity reaches 0. Only with SVG renderer.
    * @default true
    */
  var hideOnTransparent: js.UndefOr[Boolean] = js.native
  var preserveAspectRatio: js.UndefOr[String] = js.native
  /**
    * Loads DOM elements when needed. Might speed up initialization for large number of elements. Only with SVG renderer.
    */
  var progressiveLoad: js.UndefOr[Boolean] = js.native
  var scaleMode: js.UndefOr[js.Any] = js.native
}

object ClassName {
  @scala.inline
  def apply(): ClassName = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClassName]
  }
  @scala.inline
  implicit class ClassNameOps[Self <: ClassName] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(js.undefined)
        ret
    }
    @scala.inline
    def withClearCanvas(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearCanvas")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClearCanvas: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearCanvas")(js.undefined)
        ret
    }
    @scala.inline
    def withContext(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("context")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContext: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("context")(js.undefined)
        ret
    }
    @scala.inline
    def withHideOnTransparent(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideOnTransparent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHideOnTransparent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideOnTransparent")(js.undefined)
        ret
    }
    @scala.inline
    def withPreserveAspectRatio(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preserveAspectRatio")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreserveAspectRatio: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preserveAspectRatio")(js.undefined)
        ret
    }
    @scala.inline
    def withProgressiveLoad(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("progressiveLoad")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProgressiveLoad: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("progressiveLoad")(js.undefined)
        ret
    }
    @scala.inline
    def withScaleMode(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scaleMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScaleMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scaleMode")(js.undefined)
        ret
    }
  }
  
}

