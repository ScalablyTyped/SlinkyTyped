package typingsSlinky.oracleOraclejet

import org.scalajs.dom.raw.Node
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.none
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.onDisconnect
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCleanupMode extends js.Object {
  var cleanupMode: js.UndefOr[onDisconnect | none] = js.native
  var view: js.Array[Node] = js.native
  var viewModel: js.Object | Null = js.native
}

object AnonCleanupMode {
  @scala.inline
  def apply(view: js.Array[Node]): AnonCleanupMode = {
    val __obj = js.Dynamic.literal(view = view.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCleanupMode]
  }
  @scala.inline
  implicit class AnonCleanupModeOps[Self <: AnonCleanupMode] (val x: Self) extends AnyVal {
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
    def withCleanupMode(value: onDisconnect | none): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cleanupMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCleanupMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cleanupMode")(js.undefined)
        ret
    }
    @scala.inline
    def withViewModel(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewModel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withViewModelNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewModel")(null)
        ret
    }
  }
  
}

