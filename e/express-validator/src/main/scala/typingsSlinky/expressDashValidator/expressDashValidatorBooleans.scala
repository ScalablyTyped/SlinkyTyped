package typingsSlinky.expressDashValidator

import typingsSlinky.expressDashValidator.srcContextMod.Optional
import typingsSlinky.expressDashValidator.srcMiddlewaresSchemaMod.SanitizerSchemaOptions
import typingsSlinky.expressDashValidator.srcMiddlewaresSchemaMod.ValidatorSchemaOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object expressDashValidatorBooleans {
  @js.native
  sealed trait `false` extends Optional
  
  @js.native
  sealed trait `true`
    extends SanitizerSchemaOptions[js.Any]
       with ValidatorSchemaOptions[js.Any]
  
  @scala.inline
  def `false`: `false` = false.asInstanceOf[`false`]
  @scala.inline
  def `true`: `true` = true.asInstanceOf[`true`]
}

