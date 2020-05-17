package typingsSlinky.antd.menuMod

import org.scalajs.dom.raw.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SelectParam extends js.Object {
  var domEvent: Event = js.native
  var item: js.Any = js.native
  var key: String = js.native
  var keyPath: js.Array[String] = js.native
  var selectedKeys: js.Array[String] = js.native
}

object SelectParam {
  @scala.inline
  def apply(
    domEvent: Event,
    item: js.Any,
    key: String,
    keyPath: js.Array[String],
    selectedKeys: js.Array[String]
  ): SelectParam = {
    val __obj = js.Dynamic.literal(domEvent = domEvent.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], keyPath = keyPath.asInstanceOf[js.Any], selectedKeys = selectedKeys.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectParam]
  }
  @scala.inline
  implicit class SelectParamOps[Self <: SelectParam] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDomEvent(value: Event): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domEvent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withItem(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("item")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKeyPath(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelectedKeys(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedKeys")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

