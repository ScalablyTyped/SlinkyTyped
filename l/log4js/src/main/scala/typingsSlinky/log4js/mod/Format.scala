package typingsSlinky.log4js.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - js.Function3[
/ * req * / js.Any, 
/ * res * / js.Any, 
/ * formatter * / js.Function1[/ * str * / java.lang.String, java.lang.String], 
java.lang.String]
*/
trait Format extends js.Object

object Format {
  @scala.inline
  implicit def apply(
    value: js.Function3[
      /* req */ js.Any, 
      /* res */ js.Any, 
      /* formatter */ js.Function1[/* str */ String, String], 
      String
    ]
  ): Format = value.asInstanceOf[Format]
  @scala.inline
  implicit def apply(value: String): Format = value.asInstanceOf[Format]
}

