package typingsSlinky.objectInspect.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("object-inspect", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  /**
    * Return a string `s` with the string representation of `obj` up to a depth of `opts.depth`.
    *
    * @param obj Object to inspect
    * @param opts Inspection options. Default: `{}`.
    * @return String representation of `obj`
    */
  def apply(obj: js.Any): String = js.native
  def apply(obj: js.Any, opts: Options): String = js.native
}
