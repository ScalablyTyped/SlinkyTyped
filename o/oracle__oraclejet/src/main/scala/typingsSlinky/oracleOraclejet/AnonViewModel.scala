package typingsSlinky.oracleOraclejet

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonViewModel
  extends /* key */ StringDictionary[js.Any] {
  var viewModel: js.Object = js.native
}

object AnonViewModel {
  @scala.inline
  def apply(viewModel: js.Object): AnonViewModel = {
    val __obj = js.Dynamic.literal(viewModel = viewModel.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonViewModel]
  }
  @scala.inline
  implicit class AnonViewModelOps[Self <: AnonViewModel] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withViewModel(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewModel")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

