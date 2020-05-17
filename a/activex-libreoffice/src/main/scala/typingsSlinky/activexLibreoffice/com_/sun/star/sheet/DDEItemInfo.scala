package typingsSlinky.activexLibreoffice.com_.sun.star.sheet

import typingsSlinky.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * describes an item of a DDE connection.
  *
  * A DDE connection consists of the DDE service name, the DDE topic and a list of DDE items which may contain cached result sets.
  * @since OOo 3.1
  */
@js.native
trait DDEItemInfo extends js.Object {
  /** The name of the DDE item. */
  var Item: String = js.native
  /** The results of the item cached from the last update of the DDE link if available. This sequence may be empty. */
  var Results: SafeArray[SafeArray[_]] = js.native
}

object DDEItemInfo {
  @scala.inline
  def apply(Item: String, Results: SafeArray[SafeArray[_]]): DDEItemInfo = {
    val __obj = js.Dynamic.literal(Item = Item.asInstanceOf[js.Any], Results = Results.asInstanceOf[js.Any])
    __obj.asInstanceOf[DDEItemInfo]
  }
  @scala.inline
  implicit class DDEItemInfoOps[Self <: DDEItemInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withItem(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Item")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResults(value: SafeArray[SafeArray[_]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Results")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

