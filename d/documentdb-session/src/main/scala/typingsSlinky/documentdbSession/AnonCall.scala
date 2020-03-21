package typingsSlinky.documentdbSession

import org.scalablytyped.runtime.Instantiable0
import typingsSlinky.express.mod.RequestHandler
import typingsSlinky.expressServeStaticCore.mod.ParamsDictionary
import typingsSlinky.expressSession.mod.SessionOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCall extends js.Object {
  var MemoryStore: Instantiable0[typingsSlinky.expressSession.mod.MemoryStore] = js.native
  var Store: Instantiable0[typingsSlinky.expressSession.mod.Store] = js.native
  def apply(): RequestHandler[ParamsDictionary] = js.native
  def apply(options: SessionOptions): RequestHandler[ParamsDictionary] = js.native
}

