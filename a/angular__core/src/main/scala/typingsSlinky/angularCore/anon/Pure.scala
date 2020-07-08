package typingsSlinky.angularCore.anon

import typingsSlinky.angularCore.mod.FactoryFn
import typingsSlinky.angularCore.mod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Pure[T] extends js.Object {
  /** A factory for creating a pipe instance. */
  @JSName("factory")
  var factory_Original: FactoryFn[T] = js.native
  /** Name of the pipe. Used for matching pipes in template to pipe defs. */
  var name: String = js.native
  /** Whether the pipe is pure. */
  var pure: js.UndefOr[Boolean] = js.native
  /** Pipe class reference. Needed to extract pipe lifecycle hooks. */
  var `type`: Type[T] = js.native
  /**
    * If no constructor to instantiate is provided, an instance of type T itself is created.
    */
  /** A factory for creating a pipe instance. */
  def factory(t: js.UndefOr[scala.Nothing]): T = js.native
  /**
    * Subclasses without an explicit constructor call through to the factory of their base
    * definition, providing it with their own constructor to instantiate.
    */
  /** A factory for creating a pipe instance. */
  def factory[U /* <: T */](t: Type[U]): U = js.native
}

