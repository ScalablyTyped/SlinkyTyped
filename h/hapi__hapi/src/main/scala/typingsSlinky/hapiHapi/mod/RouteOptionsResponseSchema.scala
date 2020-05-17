package typingsSlinky.hapiHapi.mod

import typingsSlinky.hapiJoi.mod.Schema
import typingsSlinky.hapiJoi.mod.ValidationOptions
import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - scala.Boolean
  - typingsSlinky.hapiHapi.mod.ValidationObject
  - typingsSlinky.hapiJoi.mod.Schema
  - js.Function2[
/ * value * / js.Object | typingsSlinky.node.Buffer | java.lang.String, 
/ * options * / typingsSlinky.hapiJoi.mod.ValidationOptions, 
js.Promise[js.Any]]
*/
trait RouteOptionsResponseSchema extends js.Object

object RouteOptionsResponseSchema {
  @scala.inline
  implicit def apply(value: Boolean): RouteOptionsResponseSchema = value.asInstanceOf[RouteOptionsResponseSchema]
  @scala.inline
  implicit def apply(
    value: js.Function2[
      /* value */ js.Object | Buffer | String, 
      /* options */ ValidationOptions, 
      js.Promise[js.Any]
    ]
  ): RouteOptionsResponseSchema = value.asInstanceOf[RouteOptionsResponseSchema]
  @scala.inline
  implicit def apply(value: Schema): RouteOptionsResponseSchema = value.asInstanceOf[RouteOptionsResponseSchema]
  @scala.inline
  implicit def apply(value: ValidationObject): RouteOptionsResponseSchema = value.asInstanceOf[RouteOptionsResponseSchema]
}

