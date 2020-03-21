package typingsSlinky.ember.mod.Ember

import typingsSlinky.ember.emberStrings.undefined
import typingsSlinky.emberUtils.typesMod.TypeLookup
import typingsSlinky.emberUtils.typesMod.TypeOf
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ember", "Ember.typeOf")
@js.native
object typeOf extends js.Object {
  def apply(): undefined = js.native
  def apply(item: js.Any): java.lang.String = js.native
  def apply[T](value: T): TypeOf[TypeLookup, T] = js.native
}

