package typingsSlinky.jquerySoap

import typingsSlinky.jquery.JQueryXHR
import typingsSlinky.jquerySoap.JQuerySOAP.Options
import typingsSlinky.jquerySoap.JQuerySOAP.SOAP
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQueryStatic extends js.Object {
  @JSName("soap")
  var soap_Original: SOAP = js.native
  def soap(): JQueryXHR = js.native
  def soap(options: Options): JQueryXHR = js.native
}

