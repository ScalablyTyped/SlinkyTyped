package typingsSlinky.expressValidator

import typingsSlinky.expressValidator.contextMod.Optional
import typingsSlinky.expressValidator.schemaMod.SanitizerSchemaOptions
import typingsSlinky.expressValidator.schemaMod.ValidatorSchemaOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object expressValidatorBooleans {
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

