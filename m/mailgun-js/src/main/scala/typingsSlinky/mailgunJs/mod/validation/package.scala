package typingsSlinky.mailgunJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object validation {
  type ValidationCallback = js.Function2[
    /* error */ typingsSlinky.mailgunJs.mod.Error, 
    /* body */ typingsSlinky.mailgunJs.mod.validation.ValidateResponse, 
    scala.Unit
  ]
}
