package typingsSlinky.firefoxWebextBrowser.browser.experiments

import typingsSlinky.firefoxWebextBrowser.anon.Events
import typingsSlinky.firefoxWebextBrowser.anon.Paths
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* experiments types */
trait ExperimentAPI extends js.Object {
  var child: js.UndefOr[Paths] = js.undefined
  var parent: js.UndefOr[Events] = js.undefined
  var schema: ExperimentURL
}

object ExperimentAPI {
  @scala.inline
  def apply(schema: ExperimentURL, child: Paths = null, parent: Events = null): ExperimentAPI = {
    val __obj = js.Dynamic.literal(schema = schema.asInstanceOf[js.Any])
    if (child != null) __obj.updateDynamic("child")(child.asInstanceOf[js.Any])
    if (parent != null) __obj.updateDynamic("parent")(parent.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExperimentAPI]
  }
}

