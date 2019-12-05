package typingsSlinky.ember.emberMod.default

import typingsSlinky.atEmberUtils.dashPrivateTypesMod.TypeLookup
import typingsSlinky.atEmberUtils.dashPrivateTypesMod.TypeOf
import typingsSlinky.ember.emberStrings.undefined
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ember", "typeOf")
@js.native
object typeOf extends js.Object {
  def apply(): undefined = js.native
  def apply(item: js.Any): java.lang.String = js.native
  def apply[T](value: T): TypeOf[TypeLookup, T] = js.native
}

