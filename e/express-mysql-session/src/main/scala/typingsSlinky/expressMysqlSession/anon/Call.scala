package typingsSlinky.expressMysqlSession.anon

import org.scalablytyped.runtime.Instantiable0
import typingsSlinky.express.mod.RequestHandler
import typingsSlinky.expressServeStaticCore.mod.ParamsDictionary
import typingsSlinky.expressServeStaticCore.mod.Query
import typingsSlinky.expressSession.mod.SessionOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Call extends js.Object {
  var MemoryStore: Instantiable0[typingsSlinky.expressSession.mod.MemoryStore] = js.native
  var Store: Instantiable0[typingsSlinky.expressSession.mod.Store] = js.native
  def apply(): RequestHandler[ParamsDictionary, _, _, Query] = js.native
  def apply(options: SessionOptions): RequestHandler[ParamsDictionary, _, _, Query] = js.native
}

