package typingsSlinky.atJupyterlabOutputarea.libModelMod.IOutputAreaModel

import typingsSlinky.atJupyterlabRendermime.libOutputmodelMod.IOutputModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The interface for an output content factory.
  */
trait IContentFactory extends js.Object {
  /**
    * Create an output model.
    */
  def createOutputModel(options: typingsSlinky.atJupyterlabRendermime.libOutputmodelMod.IOutputModel.IOptions): IOutputModel
}

object IContentFactory {
  @scala.inline
  def apply(
    createOutputModel: typingsSlinky.atJupyterlabRendermime.libOutputmodelMod.IOutputModel.IOptions => IOutputModel
  ): IContentFactory = {
    val __obj = js.Dynamic.literal(createOutputModel = js.Any.fromFunction1(createOutputModel))
  
    __obj.asInstanceOf[IContentFactory]
  }
}

