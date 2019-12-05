package typingsSlinky.activexDashInfopath

import typingsSlinky.activexDashInfopath.InfoPath.Application
import typingsSlinky.activexDashInfopath.InfoPath.ExternalApplication
import typingsSlinky.activexDashInfopath.InfoPath.InfoPathEditorObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActiveXObjectNameMap extends js.Object {
  var `InfoPath.Application`: Application
  var `InfoPath.Editor`: InfoPathEditorObject
  var `InfoPath.ExternalApplication`: ExternalApplication
}

object ActiveXObjectNameMap {
  @scala.inline
  def apply(
    `InfoPath.Application`: Application,
    `InfoPath.Editor`: InfoPathEditorObject,
    `InfoPath.ExternalApplication`: ExternalApplication
  ): ActiveXObjectNameMap = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("InfoPath.Application")(`InfoPath.Application`.asInstanceOf[js.Any])
    __obj.updateDynamic("InfoPath.Editor")(`InfoPath.Editor`.asInstanceOf[js.Any])
    __obj.updateDynamic("InfoPath.ExternalApplication")(`InfoPath.ExternalApplication`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActiveXObjectNameMap]
  }
}

