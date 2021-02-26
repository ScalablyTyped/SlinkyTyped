package typingsSlinky.baidumapWebSdk.BMap

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.baidumapWebSdk.anon.Target
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  implicit class LabelMutableBuilder[Self <: Label] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddEventListener(value: (String, Callback) => Unit): Self = StObject.set(x, "addEventListener", js.Any.fromFunction2(value))
    
    @scala.inline
    def setDisableMassClear(value: () => Unit): Self = StObject.set(x, "disableMassClear", js.Any.fromFunction0(value))
    
    @scala.inline
    def setEnableMassClear(value: () => Unit): Self = StObject.set(x, "enableMassClear", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetMap(value: () => Map): Self = StObject.set(x, "getMap", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetOffset(value: () => Size): Self = StObject.set(x, "getOffset", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetPosition(value: () => Point): Self = StObject.set(x, "getPosition", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetTitle(value: () => String): Self = StObject.set(x, "getTitle", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnclick(value: Target => Unit): Self = StObject.set(x, "onclick", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOndblclick(value: Target => Unit): Self = StObject.set(x, "ondblclick", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnmousedown(value: Target => Unit): Self = StObject.set(x, "onmousedown", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnmouseout(value: Target => Unit): Self = StObject.set(x, "onmouseout", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnmouseover(value: Target => Unit): Self = StObject.set(x, "onmouseover", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnmouseup(value: Target => Unit): Self = StObject.set(x, "onmouseup", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnremove(value: Target => Unit): Self = StObject.set(x, "onremove", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnrightclick(value: Target => Unit): Self = StObject.set(x, "onrightclick", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemoveEventListener(value: (String, Callback) => Unit): Self = StObject.set(x, "removeEventListener", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSetContent(value: String => Unit): Self = StObject.set(x, "setContent", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetOffset(value: Size => Unit): Self = StObject.set(x, "setOffset", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetPosition(value: Point => Unit): Self = StObject.set(x, "setPosition", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetStyle(value: StringDictionary[String | Double] => Unit): Self = StObject.set(x, "setStyle", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetTitle(value: String => Unit): Self = StObject.set(x, "setTitle", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetZIndex(value: Double => Unit): Self = StObject.set(x, "setZIndex", js.Any.fromFunction1(value))
  }
}
