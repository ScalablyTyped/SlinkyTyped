package typingsSlinky.inversify.injectMod

import typingsSlinky.inversify.interfacesMod.interfaces.Abstract
import typingsSlinky.inversify.interfacesMod.interfaces.Newable
import typingsSlinky.inversify.interfacesMod.interfaces.ServiceIdentifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("inversify/dts/annotation/inject", "LazyServiceIdentifer")
@js.native
class LazyServiceIdentifer[T] protected () extends ServiceIdentifierOrFunc {
  def this(cb: js.Function0[ServiceIdentifier[T]]) = this()
  var _cb: js.Any = js.native
  def unwrap(): String | js.Symbol | Newable[T] | Abstract[T] = js.native
}

