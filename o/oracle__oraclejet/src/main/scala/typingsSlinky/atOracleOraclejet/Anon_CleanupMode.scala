package typingsSlinky.atOracleOraclejet

import org.scalajs.dom.raw.Node
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.none
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.onDisconnect
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CleanupMode extends js.Object {
  var cleanupMode: js.UndefOr[onDisconnect | none] = js.undefined
  var view: js.Array[Node]
  var viewModel: js.Object | Null
}

object Anon_CleanupMode {
  @scala.inline
  def apply(view: js.Array[Node], cleanupMode: onDisconnect | none = null, viewModel: js.Object = null): Anon_CleanupMode = {
    val __obj = js.Dynamic.literal(view = view.asInstanceOf[js.Any])
    if (cleanupMode != null) __obj.updateDynamic("cleanupMode")(cleanupMode.asInstanceOf[js.Any])
    if (viewModel != null) __obj.updateDynamic("viewModel")(viewModel.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_CleanupMode]
  }
}

