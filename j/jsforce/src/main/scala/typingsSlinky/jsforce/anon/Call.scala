package typingsSlinky.jsforce.anon

import typingsSlinky.jsforce.describeResultMod.DescribeSObjectOptions
import typingsSlinky.jsforce.describeResultMod.DescribeSObjectResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Call extends js.Object {
  
  /** Returns a value from the cache if it exists, otherwise calls Connection.describe */
  def apply(`type`: String): DescribeSObjectResult = js.native
  def apply(
    `type`: String,
    callback: js.Function2[/* err */ js.Error, /* result */ DescribeSObjectResult, Unit]
  ): DescribeSObjectResult = js.native
  def apply(`type`: DescribeSObjectOptions): DescribeSObjectResult = js.native
  def apply(
    `type`: DescribeSObjectOptions,
    callback: js.Function2[/* err */ js.Error, /* result */ DescribeSObjectResult, Unit]
  ): DescribeSObjectResult = js.native
  
  def clear(): Unit = js.native
}
