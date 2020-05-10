package typingsSlinky.reactVirtualized

import slinky.core.TagMod
import typingsSlinky.react.mod.Requireable
import typingsSlinky.react.mod.Validator
import typingsSlinky.reactVirtualized.esColumnSizerMod.SizedColumnProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonChildren extends js.Object {
  var children: Validator[js.Function1[/* props */ SizedColumnProps, TagMod[Any]]] = js.native
  var columnCount: Validator[Double] = js.native
  var columnMaxWidth: Requireable[Double] = js.native
  var columnMinWidth: Requireable[Double] = js.native
  var width: Validator[Double] = js.native
}

object AnonChildren {
  @scala.inline
  def apply(
    children: Validator[js.Function1[/* props */ SizedColumnProps, TagMod[Any]]],
    columnCount: Validator[Double],
    columnMaxWidth: Requireable[Double],
    columnMinWidth: Requireable[Double],
    width: Validator[Double]
  ): AnonChildren = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], columnCount = columnCount.asInstanceOf[js.Any], columnMaxWidth = columnMaxWidth.asInstanceOf[js.Any], columnMinWidth = columnMinWidth.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonChildren]
  }
  @scala.inline
  implicit class AnonChildrenOps[Self <: AnonChildren] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChildren(value: Validator[js.Function1[/* props */ SizedColumnProps, TagMod[Any]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withColumnCount(value: Validator[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withColumnMaxWidth(value: Requireable[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnMaxWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withColumnMinWidth(value: Requireable[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnMinWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWidth(value: Validator[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

