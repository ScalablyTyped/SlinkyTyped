package typingsSlinky.dojo.dojo.main

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojo/main.data.html
  *
  *
  */
@js.native
trait data extends js.Object {
  /**
    *
    */
  var api: js.Object = js.native
  /**
    *
    */
  var util: js.Object = js.native
  /**
    *
    */
  def ItemFileReadStore(): Unit = js.native
  /**
    *
    */
  def ItemFileWriteStore(): Unit = js.native
  /**
    *
    */
  def ObjectStore(): Unit = js.native
}

object data {
  @scala.inline
  def apply(
    ItemFileReadStore: () => Unit,
    ItemFileWriteStore: () => Unit,
    ObjectStore: () => Unit,
    api: js.Object,
    util: js.Object
  ): data = {
    val __obj = js.Dynamic.literal(ItemFileReadStore = js.Any.fromFunction0(ItemFileReadStore), ItemFileWriteStore = js.Any.fromFunction0(ItemFileWriteStore), ObjectStore = js.Any.fromFunction0(ObjectStore), api = api.asInstanceOf[js.Any], util = util.asInstanceOf[js.Any])
    __obj.asInstanceOf[data]
  }
  @scala.inline
  implicit class dataOps[Self <: data] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withItemFileReadStore(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ItemFileReadStore")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withItemFileWriteStore(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ItemFileWriteStore")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withObjectStore(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ObjectStore")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withApi(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("api")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUtil(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("util")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

