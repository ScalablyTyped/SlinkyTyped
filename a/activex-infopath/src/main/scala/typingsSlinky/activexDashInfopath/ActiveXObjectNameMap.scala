package typingsSlinky.activexDashInfopath

import typingsSlinky.activexDashInfopath.InfoPath.Application
import typingsSlinky.activexDashInfopath.InfoPath.ExternalApplication
import typingsSlinky.activexDashInfopath.InfoPath.InfoPathEditorObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActiveXObjectNameMap extends js.Object {
  @JSName("InfoPath.Application")
  var InfoPathDotApplication: Application
  @JSName("InfoPath.Editor")
  var InfoPathDotEditor: InfoPathEditorObject
  @JSName("InfoPath.ExternalApplication")
  var InfoPathDotExternalApplication: ExternalApplication
}

object ActiveXObjectNameMap {
  @scala.inline
  def apply(
    InfoPathDotApplication: Application,
    InfoPathDotEditor: InfoPathEditorObject,
    InfoPathDotExternalApplication: ExternalApplication
  ): ActiveXObjectNameMap = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("InfoPath.Application")(InfoPathDotApplication.asInstanceOf[js.Any])
    __obj.updateDynamic("InfoPath.Editor")(InfoPathDotEditor.asInstanceOf[js.Any])
    __obj.updateDynamic("InfoPath.ExternalApplication")(InfoPathDotExternalApplication.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActiveXObjectNameMap]
  }
}

