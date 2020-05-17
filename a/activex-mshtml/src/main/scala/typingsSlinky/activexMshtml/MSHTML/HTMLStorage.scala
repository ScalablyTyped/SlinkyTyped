package typingsSlinky.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HTMLStorage extends js.Object {
  @JSName("MSHTML.HTMLStorage_typekey")
  var MSHTMLDotHTMLStorage_typekey: HTMLStorage = js.native
  val constructor: js.Any = js.native
  val length: Double = js.native
  val remainingSpace: Double = js.native
  def clear(): Unit = js.native
  def getItem(bstrKey: String): js.Any = js.native
  def ie9_setItem(bstrKey: String, bstrValue: String): Unit = js.native
  def key(lIndex: Double): String = js.native
  def removeItem(bstrKey: String): Unit = js.native
  def setItem(bstrKey: String, bstrValue: String): Unit = js.native
}

object HTMLStorage {
  @scala.inline
  def apply(
    MSHTMLDotHTMLStorage_typekey: HTMLStorage,
    clear: () => Unit,
    constructor: js.Any,
    getItem: String => js.Any,
    ie9_setItem: (String, String) => Unit,
    key: Double => String,
    length: Double,
    remainingSpace: Double,
    removeItem: String => Unit,
    setItem: (String, String) => Unit
  ): HTMLStorage = {
    val __obj = js.Dynamic.literal(clear = js.Any.fromFunction0(clear), constructor = constructor.asInstanceOf[js.Any], getItem = js.Any.fromFunction1(getItem), ie9_setItem = js.Any.fromFunction2(ie9_setItem), key = js.Any.fromFunction1(key), length = length.asInstanceOf[js.Any], remainingSpace = remainingSpace.asInstanceOf[js.Any], removeItem = js.Any.fromFunction1(removeItem), setItem = js.Any.fromFunction2(setItem))
    __obj.updateDynamic("MSHTML.HTMLStorage_typekey")(MSHTMLDotHTMLStorage_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[HTMLStorage]
  }
  @scala.inline
  implicit class HTMLStorageOps[Self <: HTMLStorage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMSHTMLDotHTMLStorage_typekey(value: HTMLStorage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MSHTML.HTMLStorage_typekey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClear(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clear")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withConstructor(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("constructor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetItem(value: String => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getItem")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withIe9_setItem(value: (String, String) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ie9_setItem")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withKey(value: Double => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("length")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRemainingSpace(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remainingSpace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRemoveItem(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeItem")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetItem(value: (String, String) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setItem")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

