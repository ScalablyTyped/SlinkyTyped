package typingsSlinky.jestTypes.globalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait It extends ItBase {
  
  def only(testName: TestName, fn: TestFn): Unit = js.native
  def only(testName: TestName, fn: TestFn, timeout: Double): Unit = js.native
  @JSName("only")
  var only_Original: ItBase = js.native
  
  def skip(testName: TestName, fn: TestFn): Unit = js.native
  def skip(testName: TestName, fn: TestFn, timeout: Double): Unit = js.native
  @JSName("skip")
  var skip_Original: ItBase = js.native
  
  def todo(testName: TestName): Unit = js.native
}
