package typingsSlinky.jupyterlabNotebook.modelMod.NotebookModel.ContentFactory

import typingsSlinky.jupyterlabCells.modelMod.CodeCellModel.IContentFactory
import typingsSlinky.jupyterlabObservables.modeldbMod.IModelDB
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The options used to initialize a `ContentFactory`.
  */
@js.native
trait IOptions extends js.Object {
  /**
    * The factory for code cell model content.
    */
  var codeCellContentFactory: js.UndefOr[IContentFactory] = js.native
  /**
    * The modelDB in which to place new content.
    */
  var modelDB: js.UndefOr[IModelDB] = js.native
}

object IOptions {
  @scala.inline
  def apply(): IOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IOptions]
  }
  @scala.inline
  implicit class IOptionsOps[Self <: IOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCodeCellContentFactory(value: IContentFactory): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("codeCellContentFactory")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCodeCellContentFactory: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("codeCellContentFactory")(js.undefined)
        ret
    }
    @scala.inline
    def withModelDB(value: IModelDB): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modelDB")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModelDB: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modelDB")(js.undefined)
        ret
    }
  }
  
}

