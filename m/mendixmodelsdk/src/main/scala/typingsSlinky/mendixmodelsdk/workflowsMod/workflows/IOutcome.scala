package typingsSlinky.mendixmodelsdk.workflowsMod.workflows

import typingsSlinky.mendixmodelsdk.baseModelMod.IModel
import typingsSlinky.mendixmodelsdk.elementsMod.IElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Interfaces and instance classes for types from the Mendix sub meta model `Workflows`.
  */
/**
  * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
  *
  * @ignore
  *
  * In version 8.15.0: introduced
  */
@js.native
trait IOutcome extends IElement {
  
  val containerAsExclusiveSplitActivity: IExclusiveSplitActivity = js.native
  
  val containerAsParallelSplitActivity: IParallelSplitActivity = js.native
  
  val containerAsWorkflowTask: IWorkflowTask = js.native
  
  /**
    * This property is required and cannot be set to null.
    *
    * NOTE: This property is experimental and is subject to change in newer Model SDK versions.
    *
    * @ignore
    */
  val flow: IFlow = js.native
  
  @JSName("model")
  val model_IOutcome: IModel = js.native
}
