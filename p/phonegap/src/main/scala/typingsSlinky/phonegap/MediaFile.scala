package typingsSlinky.phonegap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MediaFile extends js.Object {
  
  var fullPath: String = js.native
  
  def getFormatData(successCallback: js.Function): Unit = js.native
  def getFormatData(successCallback: js.Function, errorCallback: js.Function): Unit = js.native
  
  var lastModifiedDate: js.Date = js.native
  
  var name: String = js.native
  
  var size: Double = js.native
  
  var `type`: String = js.native
}
