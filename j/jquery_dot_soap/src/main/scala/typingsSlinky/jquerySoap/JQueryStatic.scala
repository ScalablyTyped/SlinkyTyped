package typingsSlinky.jquerySoap

import typingsSlinky.jquery.JQueryXHR
import typingsSlinky.jquerySoap.JQuerySOAP.Options
import typingsSlinky.jquerySoap.JQuerySOAP.SOAP
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JQueryStatic extends js.Object {
  
  def soap(): JQueryXHR = js.native
  def soap(options: Options): JQueryXHR = js.native
  @JSName("soap")
  var soap_Original: SOAP = js.native
}
