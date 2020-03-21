package typingsSlinky.jestEnvironment

import typingsSlinky.jestTypes.globalMod.TestFn
import typingsSlinky.jestTypes.globalMod.TestName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FnCall extends js.Object {
  def apply(testName: TestName, fn: TestFn): Unit = js.native
  def apply(testName: TestName, fn: TestFn, timeout: Double): Unit = js.native
}

