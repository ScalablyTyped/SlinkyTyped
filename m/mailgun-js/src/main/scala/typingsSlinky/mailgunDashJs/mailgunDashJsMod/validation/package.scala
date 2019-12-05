package typingsSlinky.mailgunDashJs.mailgunDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object validation {
  import typingsSlinky.mailgunDashJs.mailgunDashJsMod.Error

  type ValidationCallback = js.Function2[/* error */ Error, /* body */ ValidateResponse, Unit]
}
