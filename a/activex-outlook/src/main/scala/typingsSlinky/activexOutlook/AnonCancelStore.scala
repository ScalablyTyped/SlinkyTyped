package typingsSlinky.activexOutlook

import typingsSlinky.activexOutlook.Outlook.Store
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCancelStore extends js.Object {
  var Cancel: Boolean
  val Store: typingsSlinky.activexOutlook.Outlook.Store
}

object AnonCancelStore {
  @scala.inline
  def apply(Cancel: Boolean, Store: Store): AnonCancelStore = {
    val __obj = js.Dynamic.literal(Cancel = Cancel.asInstanceOf[js.Any], Store = Store.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonCancelStore]
  }
}

