package typingsSlinky.googleAnalytics.UniversalAnalytics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Tracker extends js.Object {
  
  def get(fieldName: String): js.Any = js.native
  
  def send(hitType: String, fieldsObject: js.Object): Unit = js.native
  def send(hitType: String, fields: js.Any*): Unit = js.native
  
  def set(fieldName: String, fieldValue: js.Any): Unit = js.native
  def set(fieldsObject: js.Object): Unit = js.native
}
