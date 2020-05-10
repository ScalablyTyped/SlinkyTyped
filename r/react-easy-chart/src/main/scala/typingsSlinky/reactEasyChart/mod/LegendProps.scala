package typingsSlinky.reactEasyChart.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.reactEasyChart.AnonColorString
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LegendProps extends js.Object {
  /** Override the color of the items */
  var config: js.UndefOr[js.Array[AnonColorString]] = js.native
  var data: js.Array[_] = js.native
  var dataId: String = js.native
  /** change list items to inline-block (default block) */
  var horizontal: js.UndefOr[Boolean] = js.native
  /** Override the css styles of individual components, see http://rma-consulting.github.io/react-easy-chart/legend/index.html */
  var styles: js.UndefOr[StringDictionary[CSSProperties]] = js.native
}

object LegendProps {
  @scala.inline
  def apply(data: js.Array[_], dataId: String): LegendProps = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], dataId = dataId.asInstanceOf[js.Any])
    __obj.asInstanceOf[LegendProps]
  }
  @scala.inline
  implicit class LegendPropsOps[Self <: LegendProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withData(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDataId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConfig(value: js.Array[AnonColorString]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("config")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("config")(js.undefined)
        ret
    }
    @scala.inline
    def withHorizontal(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("horizontal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHorizontal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("horizontal")(js.undefined)
        ret
    }
    @scala.inline
    def withStyles(value: StringDictionary[CSSProperties]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styles")(js.undefined)
        ret
    }
  }
  
}

