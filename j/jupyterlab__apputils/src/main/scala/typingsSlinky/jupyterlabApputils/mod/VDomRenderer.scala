package typingsSlinky.jupyterlabApputils.mod

import typingsSlinky.jupyterlabApputils.vdomMod.VDomRenderer.IModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@jupyterlab/apputils", "VDomRenderer")
@js.native
abstract class VDomRenderer[T /* <: IModel | Null */] protected ()
  extends typingsSlinky.jupyterlabApputils.vdomMod.VDomRenderer[T] {
  /**
    * Create a new VDomRenderer
    */
  def this(model: T | Unit) = this()
}
