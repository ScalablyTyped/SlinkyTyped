package typingsSlinky.braintreeDashWeb

import org.scalajs.dom.raw.HTMLIFrameElement
import typingsSlinky.braintreeDashWeb.braintreeDashWebMod.BraintreeError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_AddFrameAmount extends js.Object {
  var amount: Double = js.native
  var nonce: String = js.native
  def addFrame(): Unit = js.native
  def addFrame(err: BraintreeError): Unit = js.native
  def addFrame(err: BraintreeError, iframe: HTMLIFrameElement): Unit = js.native
  def removeFrame(): Unit = js.native
}

