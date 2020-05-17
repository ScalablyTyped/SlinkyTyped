package typingsSlinky.expressValidator.contextMod

import typingsSlinky.expressValidator.anon.RequiredOnly
import typingsSlinky.expressValidator.baseMod.FieldInstance
import typingsSlinky.expressValidator.baseMod.Location
import typingsSlinky.expressValidator.baseMod.ValidationError
import typingsSlinky.expressValidator.contextItemMod.ContextItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<express-validator.express-validator/src/context.Context, std.Exclude<keyof express-validator.express-validator/src/context.Context, 'setData' | 'addFieldInstances' | 'addError'>> */
@js.native
trait ReadonlyContext extends js.Object {
  var _errors: js.Any = js.native
  @JSName("constructor")
  var constructor_Original: js.Function5[
    /* fields */ js.Array[String], 
    /* locations */ js.Array[Location], 
    /* stack */ js.Array[ContextItem], 
    /* optional */ Optional, 
    /* message */ js.UndefOr[js.Any], 
    js.Any
  ] = js.native
  var dataMap: js.Any = js.native
  @JSName("errors")
  var errors_Original: js.Function0[js.Array[ValidationError]] = js.native
  var fields: js.Array[String] = js.native
  @JSName("getData")
  var getData_Original: js.Function1[/* options */ js.UndefOr[RequiredOnly], js.Array[FieldInstance]] = js.native
  var locations: js.Array[Location] = js.native
  var message: js.UndefOr[js.Any] = js.native
  var optional: Optional = js.native
  var stack: js.Array[ContextItem] = js.native
  def errors(): js.Array[ValidationError] = js.native
  def getData(): js.Array[FieldInstance] = js.native
  def getData(options: RequiredOnly): js.Array[FieldInstance] = js.native
}

