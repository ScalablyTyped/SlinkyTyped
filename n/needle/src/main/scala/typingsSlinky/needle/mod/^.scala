package typingsSlinky.needle.mod

import typingsSlinky.needle.mod.core.NeedleReadonlyHttpVerbs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("needle", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  /**
    * Calling needle() directly returns a Promise.
    *
    * Since needle 2.0
    * @param method Designates an HTTP verb for the request.
    * @param data May be null when issuing an HTTP DELETE request, but you need to explicity pass it.
    */
  def apply(
    method: typingsSlinky.needle.mod.core.NeedleHttpVerbs,
    url: String,
    data: typingsSlinky.needle.mod.core.BodyData
  ): js.Promise[typingsSlinky.needle.mod.core.NeedleResponse] = js.native
  def apply(
    method: typingsSlinky.needle.mod.core.NeedleHttpVerbs,
    url: String,
    data: typingsSlinky.needle.mod.core.BodyData,
    options: typingsSlinky.needle.mod.core.NeedleOptions
  ): js.Promise[typingsSlinky.needle.mod.core.NeedleResponse] = js.native
  /**
    * Calling needle() directly returns a Promise.
    *
    * Since needle 2.0
    * @param method Designates an HTTP verb for the request.
    */
  def apply(method: NeedleReadonlyHttpVerbs, url: String): js.Promise[typingsSlinky.needle.mod.core.NeedleResponse] = js.native
  def apply(method: NeedleReadonlyHttpVerbs, url: String, options: typingsSlinky.needle.mod.core.NeedleOptions): js.Promise[typingsSlinky.needle.mod.core.NeedleResponse] = js.native
}

