package typingsSlinky.reactSvgPanZoom.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RequiredProps extends js.Object {
  // height of the viewer displayed on screen
  var height: Double = js.native
  // current active tool (TOOL_NONE, TOOL_PAN, TOOL_ZOOM_IN, TOOL_ZOOM_OUT)
  var tool: Tool = js.native
  // value of the viewer (current point of view)
  var value: Value | Null = js.native
  // width of the viewer displayed on screen
  var width: Double = js.native
  // handler tool changed
  def onChangeTool(tool: Tool): Unit = js.native
  // handler something changed
  def onChangeValue(value: Value): Unit = js.native
}

object RequiredProps {
  @scala.inline
  def apply(
    height: Double,
    onChangeTool: Tool => Unit,
    onChangeValue: Value => Unit,
    tool: Tool,
    width: Double
  ): RequiredProps = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], onChangeTool = js.Any.fromFunction1(onChangeTool), onChangeValue = js.Any.fromFunction1(onChangeValue), tool = tool.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequiredProps]
  }
  @scala.inline
  implicit class RequiredPropsOps[Self <: RequiredProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnChangeTool(value: Tool => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChangeTool")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnChangeValue(value: Value => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChangeValue")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withTool(value: Tool): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tool")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: Value): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValueNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(null)
        ret
    }
  }
  
}

