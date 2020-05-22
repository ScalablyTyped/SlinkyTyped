package typingsSlinky.devextreme.anon

import typingsSlinky.devextreme.devextremeStrings.containers
import typingsSlinky.devextreme.devextremeStrings.custom
import typingsSlinky.devextreme.devextremeStrings.flowchart
import typingsSlinky.devextreme.devextremeStrings.general
import typingsSlinky.devextreme.devextremeStrings.orgChart
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Groups extends js.Object {
  var groups: js.UndefOr[js.Array[general | flowchart | orgChart | containers | custom | Category]] = js.undefined
  var visible: js.UndefOr[Boolean] = js.undefined
}

object Groups {
  @scala.inline
  def apply(
    groups: js.Array[general | flowchart | orgChart | containers | custom | Category] = null,
    visible: js.UndefOr[Boolean] = js.undefined
  ): Groups = {
    val __obj = js.Dynamic.literal()
    if (groups != null) __obj.updateDynamic("groups")(groups.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Groups]
  }
}

