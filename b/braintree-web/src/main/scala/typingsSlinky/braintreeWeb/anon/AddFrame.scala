package typingsSlinky.braintreeWeb.anon

import org.scalajs.dom.raw.HTMLIFrameElement
import typingsSlinky.braintreeWeb.coreMod.BraintreeError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AddFrame extends js.Object {
  
  def addFrame(): Unit = js.native
  def addFrame(err: js.UndefOr[scala.Nothing], iframe: HTMLIFrameElement): Unit = js.native
  def addFrame(err: BraintreeError): Unit = js.native
  def addFrame(err: BraintreeError, iframe: HTMLIFrameElement): Unit = js.native
  
  var amount: Double = js.native
  
  var nonce: String = js.native
  
  var removeFrame: js.UndefOr[js.Function0[Unit]] = js.native
}
