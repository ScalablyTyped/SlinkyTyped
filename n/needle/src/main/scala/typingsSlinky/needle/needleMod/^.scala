package typingsSlinky.needle.needleMod

import typingsSlinky.needle.needleMod.core.NeedleReadonlyHttpVerbs
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
    method: typingsSlinky.needle.needleMod.core.NeedleHttpVerbs,
    url: String,
    data: typingsSlinky.needle.needleMod.core.BodyData
  ): js.Promise[typingsSlinky.needle.needleMod.core.NeedleResponse] = js.native
  def apply(
    method: typingsSlinky.needle.needleMod.core.NeedleHttpVerbs,
    url: String,
    data: typingsSlinky.needle.needleMod.core.BodyData,
    options: typingsSlinky.needle.needleMod.core.NeedleOptions
  ): js.Promise[typingsSlinky.needle.needleMod.core.NeedleResponse] = js.native
  /**
    * Calling needle() directly returns a Promise.
    *
    * Since needle 2.0
    * @param method Designates an HTTP verb for the request.
    */
  def apply(method: NeedleReadonlyHttpVerbs, url: String): js.Promise[typingsSlinky.needle.needleMod.core.NeedleResponse] = js.native
  def apply(
    method: NeedleReadonlyHttpVerbs,
    url: String,
    options: typingsSlinky.needle.needleMod.core.NeedleOptions
  ): js.Promise[typingsSlinky.needle.needleMod.core.NeedleResponse] = js.native
}

