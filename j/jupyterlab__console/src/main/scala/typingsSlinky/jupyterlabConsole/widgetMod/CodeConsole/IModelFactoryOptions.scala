package typingsSlinky.jupyterlabConsole.widgetMod.CodeConsole

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The options used to initialize a `ModelFactory`.
  */
@js.native
trait IModelFactoryOptions extends js.Object {
  /**
    * The factory for output area models.
    */
  var codeCellContentFactory: js.UndefOr[typingsSlinky.jupyterlabCells.modelMod.CodeCellModel.IContentFactory] = js.native
}

object IModelFactoryOptions {
  @scala.inline
  def apply(): IModelFactoryOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IModelFactoryOptions]
  }
  @scala.inline
  implicit class IModelFactoryOptionsOps[Self <: IModelFactoryOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCodeCellContentFactory(value: typingsSlinky.jupyterlabCells.modelMod.CodeCellModel.IContentFactory): Self = {
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
  }
  
}

