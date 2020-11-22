package typingsSlinky.jupyterlabNotebook.mod

import typingsSlinky.jupyterlabNotebook.modelMod.NotebookModel.IOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@jupyterlab/notebook", "NotebookModel")
@js.native
/**
  * Construct a new notebook model.
  */
class NotebookModel ()
  extends typingsSlinky.jupyterlabNotebook.modelMod.NotebookModel {
  def this(options: IOptions) = this()
}
@JSImport("@jupyterlab/notebook", "NotebookModel")
@js.native
object NotebookModel extends js.Object {
  
  /**
    * The default `ContentFactory` instance.
    */
  val defaultContentFactory: typingsSlinky.jupyterlabNotebook.modelMod.NotebookModel.ContentFactory = js.native
  
  /**
    * The default implementation of an `IContentFactory`.
    */
  @js.native
  class ContentFactory protected ()
    extends typingsSlinky.jupyterlabNotebook.modelMod.NotebookModel.ContentFactory {
    /**
      * Create a new cell model factory.
      */
    def this(options: typingsSlinky.jupyterlabNotebook.modelMod.NotebookModel.ContentFactory.IOptions) = this()
  }
  /**
    * A namespace for the notebook model content factory.
    */
  @js.native
  object ContentFactory extends js.Object
}
