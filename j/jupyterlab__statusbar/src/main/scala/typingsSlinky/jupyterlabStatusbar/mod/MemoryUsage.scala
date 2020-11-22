package typingsSlinky.jupyterlabStatusbar.mod

import typingsSlinky.jupyterlabStatusbar.memoryUsageMod.MemoryUsage.Model.IOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@jupyterlab/statusbar", "MemoryUsage")
@js.native
/**
  * Construct a new memory usage status item.
  */
class MemoryUsage ()
  extends typingsSlinky.jupyterlabStatusbar.defaultsMod.MemoryUsage
@JSImport("@jupyterlab/statusbar", "MemoryUsage")
@js.native
object MemoryUsage extends js.Object {
  
  /**
    * A VDomModel for the memory usage status item.
    */
  @js.native
  class Model protected ()
    extends typingsSlinky.jupyterlabStatusbar.defaultsMod.MemoryUsage.Model {
    /**
      * Construct a new memory usage model.
      *
      * @param options: the options for creating the model.
      */
    def this(options: IOptions) = this()
  }
  /**
    * A namespace for Model statics.
    */
  @js.native
  object Model extends js.Object
}
