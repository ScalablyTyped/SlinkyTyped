package typingsSlinky.expressDashValidator

import typingsSlinky.expressDashValidator.expressDashValidatorStrings.addError
import typingsSlinky.expressDashValidator.expressDashValidatorStrings.addFieldInstances
import typingsSlinky.expressDashValidator.expressDashValidatorStrings.setData
import typingsSlinky.expressDashValidator.srcBaseMod.FieldInstance
import typingsSlinky.expressDashValidator.srcBaseMod.Location
import typingsSlinky.expressDashValidator.srcBaseMod.Meta
import typingsSlinky.expressDashValidator.srcBaseMod.ValidationError
import typingsSlinky.expressDashValidator.srcContextDashItemsContextDashItemMod.ContextItem
import typingsSlinky.std.Exclude
import typingsSlinky.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("express-validator/src/context", JSImport.Namespace)
@js.native
object srcContextMod extends js.Object {
  @js.native
  class Context protected () extends js.Object {
    def this(
      fields: js.Array[String],
      locations: js.Array[Location],
      stack: js.Array[ContextItem],
      optional: Optional
    ) = this()
    def this(
      fields: js.Array[String],
      locations: js.Array[Location],
      stack: js.Array[ContextItem],
      optional: Optional,
      message: js.Any
    ) = this()
    val _errors: js.Any = js.native
    val dataMap: js.Any = js.native
    val errors: js.Array[ValidationError] = js.native
    val fields: js.Array[String] = js.native
    val locations: js.Array[Location] = js.native
    val message: js.UndefOr[js.Any] = js.native
    val optional: Optional = js.native
    val stack: js.Array[ContextItem] = js.native
    def addError(message: js.Any, nestedErrors: js.Array[ValidationError]): Unit = js.native
    def addError(message: js.Any, value: js.Any, meta: Meta): Unit = js.native
    def addFieldInstances(instances: js.Array[FieldInstance]): Unit = js.native
    def getData(): js.Array[FieldInstance] = js.native
    def getData(options: Anon_RequiredOnly): js.Array[FieldInstance] = js.native
    def setData(path: String, value: js.Any, location: Location): Unit = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.expressDashValidator.Anon_CheckFalsyNullable
    - typings.expressDashValidator.expressDashValidatorBooleans.`false`
  */
  trait Optional extends js.Object
  
  type ReadonlyContext = Pick[Context, Exclude[String, setData | addFieldInstances | addError]]
}

