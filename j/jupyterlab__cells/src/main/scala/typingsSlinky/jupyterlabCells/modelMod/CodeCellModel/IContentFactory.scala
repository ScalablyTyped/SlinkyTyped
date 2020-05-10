package typingsSlinky.jupyterlabCells.modelMod.CodeCellModel

import typingsSlinky.jupyterlabOutputarea.modelMod.IOutputAreaModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A factory for creating code cell model content.
  */
@js.native
trait IContentFactory extends js.Object {
  /**
    * Create an output area.
    */
  def createOutputArea(options: typingsSlinky.jupyterlabOutputarea.modelMod.IOutputAreaModel.IOptions): IOutputAreaModel = js.native
}

object IContentFactory {
  @scala.inline
  def apply(
    createOutputArea: typingsSlinky.jupyterlabOutputarea.modelMod.IOutputAreaModel.IOptions => IOutputAreaModel
  ): IContentFactory = {
    val __obj = js.Dynamic.literal(createOutputArea = js.Any.fromFunction1(createOutputArea))
    __obj.asInstanceOf[IContentFactory]
  }
  @scala.inline
  implicit class IContentFactoryOps[Self <: IContentFactory] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreateOutputArea(value: typingsSlinky.jupyterlabOutputarea.modelMod.IOutputAreaModel.IOptions => IOutputAreaModel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createOutputArea")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

