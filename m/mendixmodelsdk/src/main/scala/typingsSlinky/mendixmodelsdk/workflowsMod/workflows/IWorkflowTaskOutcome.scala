package typingsSlinky.mendixmodelsdk.workflowsMod.workflows

import typingsSlinky.mendixmodelsdk.baseModelMod.IModel
import typingsSlinky.mendixmodelsdk.elementsMod.IByNameReferrable
import typingsSlinky.mendixmodelsdk.elementsMod.IElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
  *
  * In version 8.10.0: introduced
  */
@js.native
trait IWorkflowTaskOutcome
  extends IElement
     with IByNameReferrable {
  val containerAsWorkflowTask: IWorkflowTask = js.native
  @JSName("model")
  val model_IWorkflowTaskOutcome: IModel = js.native
  val name: String = js.native
}

