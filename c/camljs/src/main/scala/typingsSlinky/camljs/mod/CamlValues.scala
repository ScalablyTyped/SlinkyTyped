package typingsSlinky.camljs.mod

import typingsSlinky.camljs.anon.BlogCategoryTitle
import typingsSlinky.camljs.anon.Created
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("camljs", "CamlValues")
@js.native
class CamlValues () extends js.Object
/* static members */
@JSImport("camljs", "CamlValues")
@js.native
object CamlValues extends js.Object {
  
  /** Dynamic value that represents a property of the current list */
  var ListProperty: Created = js.native
  
  var Now: String = js.native
  
  /** Dynamic value that represents a property of the current SPWeb */
  var ProjectProperty: BlogCategoryTitle = js.native
  
  /** Dynamic value that represents current date */
  var Today: String = js.native
  
  /** Dynamic value that represents current date with specified offset (may be negative) */
  def TodayWithOffset(offsetDays: Double): String = js.native
  
  /** Dynamic value that represents Id of the current user */
  var UserID: String = js.native
}
