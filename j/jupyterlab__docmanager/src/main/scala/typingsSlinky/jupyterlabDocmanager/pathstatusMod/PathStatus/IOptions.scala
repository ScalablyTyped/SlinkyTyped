package typingsSlinky.jupyterlabDocmanager.pathstatusMod.PathStatus

import typingsSlinky.jupyterlabDocmanager.tokensMod.IDocumentManager
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options for creating the PathStatus widget.
  */
@js.native
trait IOptions extends js.Object {
  /**
    * The application document manager.
    */
  var docManager: IDocumentManager = js.native
}

object IOptions {
  @scala.inline
  def apply(docManager: IDocumentManager): IOptions = {
    val __obj = js.Dynamic.literal(docManager = docManager.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOptions]
  }
  @scala.inline
  implicit class IOptionsOps[Self <: IOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDocManager(value: IDocumentManager): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("docManager")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

