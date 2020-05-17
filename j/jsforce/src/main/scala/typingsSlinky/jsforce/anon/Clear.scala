package typingsSlinky.jsforce.anon

import typingsSlinky.jsforce.describeResultMod.DescribeGlobalResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Clear extends js.Object {
  /** Returns a value from the cache if it exists, otherwise calls Connection.describeGlobal */
  def apply(): DescribeGlobalResult = js.native
  def apply(callback: js.Function2[/* err */ js.Error, /* result */ DescribeGlobalResult, Unit]): DescribeGlobalResult = js.native
  def clear(): Unit = js.native
}

