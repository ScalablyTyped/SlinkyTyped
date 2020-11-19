package typingsSlinky.mocha.global

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.mocha.Mocha.HookFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Execute before each test case.
  *
  * - _Only available when invoked via the mocha CLI._
  *
  * @see https://mochajs.org/api/global.html#beforeEach
  */
@JSGlobal("setup")
@js.native
object setup extends TopLevel[HookFunction]
