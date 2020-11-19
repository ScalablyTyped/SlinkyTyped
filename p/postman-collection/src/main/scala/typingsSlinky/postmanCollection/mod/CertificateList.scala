package typingsSlinky.postmanCollection.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("postman-collection", "CertificateList")
@js.native
class CertificateList protected () extends PropertyList[Certificate] {
  def this(parent: js.Any, list: js.Array[CertificateDefinition]) = this()
  
  def resolveOne(url: String): CertificateDefinition = js.native
}
/* static members */
@JSImport("postman-collection", "CertificateList")
@js.native
object CertificateList extends js.Object {
  
  def isCertificateList(obj: js.Any): Boolean = js.native
}
