package typingsSlinky.atOracleOraclejet

import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.bottom
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.end
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.focusLoss
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.modal
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.modeless
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.none
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.overlay
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.push
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.start
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AutoDismiss extends js.Object {
  var autoDismiss: js.UndefOr[focusLoss | none] = js.undefined
  var content: String
  var displayMode: js.UndefOr[push | overlay] = js.undefined
  var edge: js.UndefOr[start | end | top | bottom] = js.undefined
  var modality: js.UndefOr[modal | modeless] = js.undefined
  var selector: String
  var size: js.UndefOr[String] = js.undefined
}

object Anon_AutoDismiss {
  @scala.inline
  def apply(
    content: String,
    selector: String,
    autoDismiss: focusLoss | none = null,
    displayMode: push | overlay = null,
    edge: start | end | top | bottom = null,
    modality: modal | modeless = null,
    size: String = null
  ): Anon_AutoDismiss = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], selector = selector.asInstanceOf[js.Any])
    if (autoDismiss != null) __obj.updateDynamic("autoDismiss")(autoDismiss.asInstanceOf[js.Any])
    if (displayMode != null) __obj.updateDynamic("displayMode")(displayMode.asInstanceOf[js.Any])
    if (edge != null) __obj.updateDynamic("edge")(edge.asInstanceOf[js.Any])
    if (modality != null) __obj.updateDynamic("modality")(modality.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_AutoDismiss]
  }
}

