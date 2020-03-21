package typingsSlinky.jestTypes

import typingsSlinky.jestTypes.globalMod.Each
import typingsSlinky.jestTypes.globalMod.EachTable
import typingsSlinky.jestTypes.globalMod.EachTestFn
import typingsSlinky.jestTypes.globalMod.ItConcurrentBase
import typingsSlinky.jestTypes.globalMod.TestFn
import typingsSlinky.jestTypes.globalMod.TestName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined @jest/types.@jest/types/build/Global.ItBase & {  concurrent ? :@jest/types.@jest/types/build/Global.ItConcurrentBase} */
@js.native
trait ItBaseconcurrentItConcurr extends js.Object {
  var concurrent: js.UndefOr[ItConcurrentBase] = js.native
  @JSName("each")
  var each_Original: Each = js.native
  def apply(testName: TestName, fn: TestFn): Unit = js.native
  def apply(testName: TestName, fn: TestFn, timeout: Double): Unit = js.native
  def each(table: EachTable, taggedTemplateData: js.Any*): js.Function3[/* title */ String, /* test */ EachTestFn, /* timeout */ js.UndefOr[Double], Unit] = js.native
}

