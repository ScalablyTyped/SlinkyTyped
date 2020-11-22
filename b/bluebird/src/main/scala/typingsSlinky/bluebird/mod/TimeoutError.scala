package typingsSlinky.bluebird.mod

import typingsSlinky.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Signals that an operation has timed out. Used as a custom cancellation reason in `.timeout`.
  */
@JSImport("bluebird", "TimeoutError")
@js.native
class TimeoutError () extends Error
