package typingsSlinky.azure.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("azure", "LeaseResult")
@js.native
class LeaseResult () extends js.Object {
  def this(container: String) = this()
  def this(container: String, blob: String) = this()
  def this(container: String, blob: String, id: String) = this()
  def this(container: String, blob: String, id: String, time: String) = this()
  
  var blob: String = js.native
  
  var container: String = js.native
  
  var etag: String = js.native
  
  def getPropertiesFromHeaders(header: js.Any): Unit = js.native
  
  var id: String = js.native
  
  var lastModified: String = js.native
  
  var time: String = js.native
}
