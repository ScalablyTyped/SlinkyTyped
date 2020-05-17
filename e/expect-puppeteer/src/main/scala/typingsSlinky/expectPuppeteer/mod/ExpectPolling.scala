package typingsSlinky.expectPuppeteer.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interval at which pageFunctions may be executed.
  */
/* Rewritten from type alias, can be one of: 
  - scala.Double
  - typingsSlinky.expectPuppeteer.expectPuppeteerStrings.mutation
  - typingsSlinky.expectPuppeteer.expectPuppeteerStrings.raf
*/
trait ExpectPolling extends js.Object

object ExpectPolling {
  @scala.inline
  def mutation: typingsSlinky.expectPuppeteer.expectPuppeteerStrings.mutation = "mutation".asInstanceOf[typingsSlinky.expectPuppeteer.expectPuppeteerStrings.mutation]
  @scala.inline
  def raf: typingsSlinky.expectPuppeteer.expectPuppeteerStrings.raf = "raf".asInstanceOf[typingsSlinky.expectPuppeteer.expectPuppeteerStrings.raf]
  @scala.inline
  implicit def apply(value: Double): ExpectPolling = value.asInstanceOf[ExpectPolling]
}

