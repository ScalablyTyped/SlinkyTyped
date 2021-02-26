package typingsSlinky.frctlFractal.mod

import typingsSlinky.frctlFractal.anon.Content
import typingsSlinky.frctlFractal.mod.fractal.core.entities.EntitySource
import typingsSlinky.node.eventsMod.EventEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@frctl/fractal", "Adapter")
@js.native
abstract class Adapter[TEngine] protected () extends EventEmitter {
  def this(engine: TEngine, source: EntitySource[_, _]) = this()
  
  /* protected */ def _resolve[T](value: T): js.Promise[T] = js.native
  /* protected */ def _resolve[T](value: js.Thenable[T]): js.Promise[T] = js.native
  
  var _source: EntitySource[_, _] = js.native
  
  val engine: TEngine = js.native
  
  def getReferencesForView(handle: String): js.Array[_] = js.native
  
  def getView(handle: String): js.Any = js.native
  
  def load(): Unit = js.native
  
  def render(path: String, str: String, context: js.Any, meta: js.Any): js.Promise[String] = js.native
  
  def setHandlePrefix(prefix: String): this.type = js.native
  
  val views: js.Array[Content] = js.native
}
