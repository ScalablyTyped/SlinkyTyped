package typingsSlinky.cypress.global

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.cypress.Mocha.HookFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Execute after each test case.
  *
  * - _Only available when invoked via the mocha CLI._
  *
  * @see https://mochajs.org/api/global.html#afterEach
  */
@JSGlobal("afterEach")
@js.native
object afterEach extends TopLevel[HookFunction]

