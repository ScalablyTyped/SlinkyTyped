package typingsSlinky.ejWebAll.ej

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CacheAdaptor extends UrlAdaptor {
  
  def generateKey(url: String, query: Query): String = js.native
  
  def init(adaptor: js.Any, timeStamp: Double, pageSize: Double): Unit = js.native
}
