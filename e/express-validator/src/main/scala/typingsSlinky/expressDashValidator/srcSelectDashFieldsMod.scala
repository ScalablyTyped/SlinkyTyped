package typingsSlinky.expressDashValidator

import typingsSlinky.expressDashValidator.srcBaseMod.FieldInstance
import typingsSlinky.expressDashValidator.srcBaseMod.Location
import typingsSlinky.expressDashValidator.srcBaseMod.Request
import typingsSlinky.expressDashValidator.srcSelectDashFieldsMod.SelectFields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("express-validator/src/select-fields", JSImport.Namespace)
@js.native
object srcSelectDashFieldsMod extends js.Object {
  val selectFields: SelectFields = js.native
  type SelectFields = js.Function3[
    /* req */ Request, 
    /* fields */ js.Array[String], 
    /* locations */ js.Array[Location], 
    js.Array[FieldInstance]
  ]
}

