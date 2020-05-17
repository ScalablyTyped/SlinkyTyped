package typingsSlinky.baidumapWebSdk.BMap

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.baidumapWebSdk.anon.Target
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Label extends Overlay {
  def addEventListener(event: String, handler: Callback): Unit = js.native
  def disableMassClear(): Unit = js.native
  def enableMassClear(): Unit = js.native
  def getMap(): Map = js.native
  def getOffset(): Size = js.native
  def getPosition(): Point = js.native
  def getTitle(): String = js.native
  def onclick(event: Target): Unit = js.native
  def ondblclick(event: Target): Unit = js.native
  def onmousedown(event: Target): Unit = js.native
  def onmouseout(event: Target): Unit = js.native
  def onmouseover(event: Target): Unit = js.native
  def onmouseup(event: Target): Unit = js.native
  def onremove(event: Target): Unit = js.native
  def onrightclick(event: Target): Unit = js.native
  def removeEventListener(event: String, handler: Callback): Unit = js.native
  def setContent(content: String): Unit = js.native
  def setOffset(offset: Size): Unit = js.native
  def setPosition(position: Point): Unit = js.native
  def setStyle(styles: StringDictionary[String | Double]): Unit = js.native
  def setTitle(title: String): Unit = js.native
  def setZIndex(zIndex: Double): Unit = js.native
}

object Label {
  @scala.inline
  def apply(
    addEventListener: (String, Callback) => Unit,
    disableMassClear: () => Unit,
    enableMassClear: () => Unit,
    getMap: () => Map,
    getOffset: () => Size,
    getPosition: () => Point,
    getTitle: () => String,
    onclick: Target => Unit,
    ondblclick: Target => Unit,
    onmousedown: Target => Unit,
    onmouseout: Target => Unit,
    onmouseover: Target => Unit,
    onmouseup: Target => Unit,
    onremove: Target => Unit,
    onrightclick: Target => Unit,
    removeEventListener: (String, Callback) => Unit,
    setContent: String => Unit,
    setOffset: Size => Unit,
    setPosition: Point => Unit,
    setStyle: StringDictionary[String | Double] => Unit,
    setTitle: String => Unit,
    setZIndex: Double => Unit
  ): Label = {
    val __obj = js.Dynamic.literal(addEventListener = js.Any.fromFunction2(addEventListener), disableMassClear = js.Any.fromFunction0(disableMassClear), enableMassClear = js.Any.fromFunction0(enableMassClear), getMap = js.Any.fromFunction0(getMap), getOffset = js.Any.fromFunction0(getOffset), getPosition = js.Any.fromFunction0(getPosition), getTitle = js.Any.fromFunction0(getTitle), onclick = js.Any.fromFunction1(onclick), ondblclick = js.Any.fromFunction1(ondblclick), onmousedown = js.Any.fromFunction1(onmousedown), onmouseout = js.Any.fromFunction1(onmouseout), onmouseover = js.Any.fromFunction1(onmouseover), onmouseup = js.Any.fromFunction1(onmouseup), onremove = js.Any.fromFunction1(onremove), onrightclick = js.Any.fromFunction1(onrightclick), removeEventListener = js.Any.fromFunction2(removeEventListener), setContent = js.Any.fromFunction1(setContent), setOffset = js.Any.fromFunction1(setOffset), setPosition = js.Any.fromFunction1(setPosition), setStyle = js.Any.fromFunction1(setStyle), setTitle = js.Any.fromFunction1(setTitle), setZIndex = js.Any.fromFunction1(setZIndex))
    __obj.asInstanceOf[Label]
  }
  @scala.inline
  implicit class LabelOps[Self <: Label] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddEventListener(value: (String, Callback) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addEventListener")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withDisableMassClear(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableMassClear")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withEnableMassClear(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableMassClear")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetMap(value: () => Map): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMap")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetOffset(value: () => Size): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getOffset")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetPosition(value: () => Point): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPosition")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetTitle(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getTitle")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOnclick(value: Target => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onclick")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOndblclick(value: Target => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ondblclick")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnmousedown(value: Target => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onmousedown")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnmouseout(value: Target => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onmouseout")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnmouseover(value: Target => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onmouseover")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnmouseup(value: Target => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onmouseup")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnremove(value: Target => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onremove")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnrightclick(value: Target => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onrightclick")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRemoveEventListener(value: (String, Callback) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeEventListener")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSetContent(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setContent")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetOffset(value: Size => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setOffset")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetPosition(value: Point => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setPosition")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetStyle(value: StringDictionary[String | Double] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setStyle")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetTitle(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setTitle")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetZIndex(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setZIndex")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

