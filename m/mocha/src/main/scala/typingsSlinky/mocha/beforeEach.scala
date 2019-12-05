package typingsSlinky.mocha

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.mocha.Mocha.HookFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Execute before each test case.
  *
  * - _Only available when invoked via the mocha CLI._
  *
  * @see https://mochajs.org/api/global.html#beforeEach
  */
@JSGlobal("beforeEach")
@js.native
object beforeEach extends TopLevel[HookFunction]

