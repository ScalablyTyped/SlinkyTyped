package typingsSlinky.expressValidator

import typingsSlinky.expressValidator.baseMod.FieldInstance
import typingsSlinky.expressValidator.baseMod.Location
import typingsSlinky.expressValidator.baseMod.Request
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("express-validator/src/select-fields", JSImport.Namespace)
@js.native
object selectFieldsMod extends js.Object {
  val selectFields: SelectFields_ = js.native
  type SelectFields_ = js.Function3[
    /* req */ Request, 
    /* fields */ js.Array[String], 
    /* locations */ js.Array[Location], 
    js.Array[FieldInstance]
  ]
}

