package typingsSlinky.activexInfopath

import typingsSlinky.activexInfopath.InfoPath.Application
import typingsSlinky.activexInfopath.InfoPath.ExternalApplication
import typingsSlinky.activexInfopath.InfoPath.InfoPathEditorObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActiveXObjectNameMap extends js.Object {
  @JSName("InfoPath.Application")
  var InfoPathDotApplication: Application = js.native
  @JSName("InfoPath.Editor")
  var InfoPathDotEditor: InfoPathEditorObject = js.native
  @JSName("InfoPath.ExternalApplication")
  var InfoPathDotExternalApplication: ExternalApplication = js.native
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
  @scala.inline
  implicit class ActiveXObjectNameMapOps[Self <: ActiveXObjectNameMap] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInfoPathDotApplication(value: Application): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InfoPath.Application")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInfoPathDotEditor(value: InfoPathEditorObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InfoPath.Editor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInfoPathDotExternalApplication(value: ExternalApplication): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InfoPath.ExternalApplication")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

