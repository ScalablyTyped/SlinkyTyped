package typingsSlinky.jqueryui.JQueryUI

import typingsSlinky.jqueryui.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResizableUIParams extends js.Object {
  var element: JQuery = js.native
  var helper: JQuery = js.native
  var originalElement: JQuery = js.native
  var originalPosition: js.Any = js.native
  var originalSize: js.Any = js.native
  var position: js.Any = js.native
  var size: js.Any = js.native
}

object ResizableUIParams {
  @scala.inline
  def apply(
    element: JQuery,
    helper: JQuery,
    originalElement: JQuery,
    originalPosition: js.Any,
    originalSize: js.Any,
    position: js.Any,
    size: js.Any
  ): ResizableUIParams = {
    val __obj = js.Dynamic.literal(element = element.asInstanceOf[js.Any], helper = helper.asInstanceOf[js.Any], originalElement = originalElement.asInstanceOf[js.Any], originalPosition = originalPosition.asInstanceOf[js.Any], originalSize = originalSize.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResizableUIParams]
  }
  @scala.inline
  implicit class ResizableUIParamsOps[Self <: ResizableUIParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withElement(value: JQuery): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("element")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHelper(value: JQuery): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("helper")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOriginalElement(value: JQuery): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("originalElement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOriginalPosition(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("originalPosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOriginalSize(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("originalSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPosition(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSize(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

