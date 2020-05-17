package typingsSlinky.activexLibreoffice.com_.sun.star.sheet

import typingsSlinky.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * describes all items of a DDE connection used in formulas.
  *
  * A DDE connection consists of the DDE service name, the DDE topic and a list of DDE items which may contain results cached from the last update.
  *
  * The formula that would need this information for example would contain `=[1]!'R1C1'` or `=[2]!'Sheet1.A1'` where **[1]** is an external link with DDE
  * service name "excel" and the topic "X:\PATH\[FILE.XLSX]Sheet1", and **[2]** contains service "soffice" and topic "file:///X:/PATH/FILE.ODS". The
  * service name is stored in {@link DDELinkInfo.Service} , the topic is stored in {@link DDELinkInfo.Topic} . Note that if the DDE item contains single
  * quotes they are escaped by doubling them, as usual, for example `=[2]!'''Sheet name''.A1'` in a "soffice" service.
  * @since OOo 3.1
  */
@js.native
trait DDELinkInfo extends js.Object {
  /** A list of DDE items. Each item may contain its results from the last update. */
  var Items: SafeArray[DDEItemInfo] = js.native
  /** The DDE service name. */
  var Service: String = js.native
  /** The DDE topic. */
  var Topic: String = js.native
}

object DDELinkInfo {
  @scala.inline
  def apply(Items: SafeArray[DDEItemInfo], Service: String, Topic: String): DDELinkInfo = {
    val __obj = js.Dynamic.literal(Items = Items.asInstanceOf[js.Any], Service = Service.asInstanceOf[js.Any], Topic = Topic.asInstanceOf[js.Any])
    __obj.asInstanceOf[DDELinkInfo]
  }
  @scala.inline
  implicit class DDELinkInfoOps[Self <: DDELinkInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withItems(value: SafeArray[DDEItemInfo]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Items")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withService(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Service")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTopic(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Topic")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

