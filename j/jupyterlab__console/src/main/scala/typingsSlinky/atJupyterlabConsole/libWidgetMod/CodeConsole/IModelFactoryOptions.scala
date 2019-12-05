package typingsSlinky.atJupyterlabConsole.libWidgetMod.CodeConsole

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The options used to initialize a `ModelFactory`.
  */
trait IModelFactoryOptions extends js.Object {
  /**
    * The factory for output area models.
    */
  var codeCellContentFactory: js.UndefOr[typingsSlinky.atJupyterlabCells.libModelMod.CodeCellModel.IContentFactory] = js.undefined
}

object IModelFactoryOptions {
  @scala.inline
  def apply(
    codeCellContentFactory: typingsSlinky.atJupyterlabCells.libModelMod.CodeCellModel.IContentFactory = null
  ): IModelFactoryOptions = {
    val __obj = js.Dynamic.literal()
    if (codeCellContentFactory != null) __obj.updateDynamic("codeCellContentFactory")(codeCellContentFactory.asInstanceOf[js.Any])
    __obj.asInstanceOf[IModelFactoryOptions]
  }
}

