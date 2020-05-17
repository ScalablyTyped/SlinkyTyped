package typingsSlinky.mocha.mod

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.mocha.Mocha.HookFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Execute after running tests.
  *
  * - _Only available when invoked via the mocha CLI._
  *
  * @see https://mochajs.org/api/global.html#after
  */
@JSImport("mocha", "after")
@js.native
object after extends TopLevel[HookFunction]

