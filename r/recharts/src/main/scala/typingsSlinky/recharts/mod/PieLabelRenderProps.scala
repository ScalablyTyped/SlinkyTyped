package typingsSlinky.recharts.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PieLabelRenderProps
  extends PieProps
     with /* key */ StringDictionary[js.Any] {
  var index: js.UndefOr[Double] = js.native
  var name: String = js.native
  var percent: js.UndefOr[Double] = js.native
  @JSName("stroke")
  var stroke_PieLabelRenderProps: String = js.native
  @JSName("textAnchor")
  var textAnchor_PieLabelRenderProps: String = js.native
  @JSName("x")
  var x_PieLabelRenderProps: Double = js.native
  @JSName("y")
  var y_PieLabelRenderProps: Double = js.native
}

object PieLabelRenderProps {
  @scala.inline
  def apply(dataKey: DataKey, name: String, stroke: String, textAnchor: String, x: Double, y: Double): PieLabelRenderProps = {
    val __obj = js.Dynamic.literal(dataKey = dataKey.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], stroke = stroke.asInstanceOf[js.Any], textAnchor = textAnchor.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[PieLabelRenderProps]
  }
  @scala.inline
  implicit class PieLabelRenderPropsOps[Self <: PieLabelRenderProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStroke(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stroke")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTextAnchor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textAnchor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("index")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("index")(js.undefined)
        ret
    }
    @scala.inline
    def withPercent(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("percent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPercent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("percent")(js.undefined)
        ret
    }
  }
  
}

