package typingsSlinky.oracleOraclejet

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonView
  extends /* key */ StringDictionary[js.Any] {
  var view: js.Array[Node] = js.native
  var viewModel: js.Object = js.native
}

object AnonView {
  @scala.inline
  def apply(view: js.Array[Node], viewModel: js.Object): AnonView = {
    val __obj = js.Dynamic.literal(view = view.asInstanceOf[js.Any], viewModel = viewModel.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonView]
  }
  @scala.inline
  implicit class AnonViewOps[Self <: AnonView] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withView(value: js.Array[Node]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("view")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withViewModel(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewModel")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

