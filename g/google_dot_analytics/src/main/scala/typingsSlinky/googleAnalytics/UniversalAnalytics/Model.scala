package typingsSlinky.googleAnalytics.UniversalAnalytics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Model extends js.Object {
  
  def get(fieldName: String): js.Any = js.native
  
  def set(fieldName: String, fieldValue: js.Any): Unit = js.native
  def set(fieldName: String, fieldValue: js.Any, temporary: Boolean): Unit = js.native
  def set(fields: js.Object): Unit = js.native
  def set(fields: js.Object, fieldValue: js.UndefOr[scala.Nothing], temporary: Boolean): Unit = js.native
  def set(fields: js.Object, fieldValue: Null, temporary: Boolean): Unit = js.native
}
