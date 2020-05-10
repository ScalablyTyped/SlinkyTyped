package typingsSlinky.jupyterlabNotebook.modelfactoryMod.NotebookModelFactory

import typingsSlinky.jupyterlabCells.modelMod.CodeCellModel.IContentFactory
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The options used to initialize a NotebookModelFactory.
  */
@js.native
trait IOptions extends js.Object {
  /**
    * The factory for code cell content.
    */
  var codeCellContentFactory: js.UndefOr[IContentFactory] = js.native
  /**
    * The content factory used by the NotebookModelFactory.  If
    * given, it will supersede the `codeCellContentFactory`.
    */
  var contentFactory: js.UndefOr[typingsSlinky.jupyterlabNotebook.modelMod.NotebookModel.IContentFactory] = js.native
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
    def withContentFactory(value: typingsSlinky.jupyterlabNotebook.modelMod.NotebookModel.IContentFactory): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentFactory")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContentFactory: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentFactory")(js.undefined)
        ret
    }
  }
  
}

