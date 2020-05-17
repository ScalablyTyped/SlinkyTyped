package typingsSlinky.dockSpawn.dockspawn

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DockManagerContext extends js.Object {
  var dockManager: DockManager = js.native
  var documentManagerView: DocumentManagerContainer = js.native
  var model: DockModel = js.native
}

object DockManagerContext {
  @scala.inline
  def apply(dockManager: DockManager, documentManagerView: DocumentManagerContainer, model: DockModel): DockManagerContext = {
    val __obj = js.Dynamic.literal(dockManager = dockManager.asInstanceOf[js.Any], documentManagerView = documentManagerView.asInstanceOf[js.Any], model = model.asInstanceOf[js.Any])
    __obj.asInstanceOf[DockManagerContext]
  }
  @scala.inline
  implicit class DockManagerContextOps[Self <: DockManagerContext] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDockManager(value: DockManager): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dockManager")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDocumentManagerView(value: DocumentManagerContainer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("documentManagerView")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withModel(value: DockModel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("model")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

