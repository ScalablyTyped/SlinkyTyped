package typingsSlinky.googleEarth.google.earth

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KmlStyleMap extends KmlObject {
  
  /**
    * Defines highlighted styles for a placemark, so that the highlighted version appears when the user mouses over the icon in Google Earth.
    */
  def getHighlightStyle(): KmlStyle = js.native
  
  /**
    * Defines highlighted styles for a placemark, so that the highlighted version appears when the user mouses over the icon in Google Earth.
    */
  def getHighlightStyleUrl(): String = js.native
  
  /**
    * Defines a normal style for a placemark.
    */
  def getNormalStyle(): KmlStyle = js.native
  
  /**
    * Defines a normal style for a placemark.
    */
  def getNormalStyleUrl(): String = js.native
  
  /**
    * Defines highlighted styles for a placemark, so that the highlighted version appears when the user mouses over the icon in Google Earth.
    */
  def setHighlightStyle(highlightStyle: KmlStyle): Unit = js.native
  
  /**
    * Defines highlighted styles for a placemark, so that the highlighted version appears when the user mouses over the icon in Google Earth.
    */
  def setHighlightStyleUrl(highlightStyleUrl: String): Unit = js.native
  
  /**
    * Defines a normal style for a placemark.
    */
  def setNormalStyle(normalStyle: KmlStyle): Unit = js.native
  
  /**
    * Defines a normal style for a placemark.
    */
  def setNormalStyleUrl(normalStyleUrl: String): Unit = js.native
  
  /**
    * Sets both placemark styles.
    */
  def setStyle(normalStyle: KmlStyle, highlightStyle: KmlStyle): Unit = js.native
  
  /**
    * Sets both URLs for the placemark style.
    */
  def setUrl(normalStyleUrl: String, highlightStyleUrl: String): Unit = js.native
}
object KmlStyleMap {
  
  @scala.inline
  def apply(
    click: KmlMouseEvent => Unit,
    dblclick: KmlMouseEvent => Unit,
    equals_ : KmlObject => Boolean,
    getHighlightStyle: () => KmlStyle,
    getHighlightStyleUrl: () => String,
    getId: () => String,
    getNormalStyle: () => KmlStyle,
    getNormalStyleUrl: () => String,
    getOwnerDocument: () => KmlDocument,
    getParentNode: () => KmlObject,
    getType: () => String,
    getUrl: () => String,
    mousedown: KmlMouseEvent => Unit,
    mousemove: KmlMouseEvent => Unit,
    mouseout: KmlMouseEvent => Unit,
    mouseover: KmlMouseEvent => Unit,
    mouseup: KmlMouseEvent => Unit,
    release: () => Unit,
    setHighlightStyle: KmlStyle => Unit,
    setHighlightStyleUrl: String => Unit,
    setNormalStyle: KmlStyle => Unit,
    setNormalStyleUrl: String => Unit,
    setStyle: (KmlStyle, KmlStyle) => Unit,
    setUrl: (String, String) => Unit
  ): KmlStyleMap = {
    val __obj = js.Dynamic.literal(click = js.Any.fromFunction1(click), dblclick = js.Any.fromFunction1(dblclick), getHighlightStyle = js.Any.fromFunction0(getHighlightStyle), getHighlightStyleUrl = js.Any.fromFunction0(getHighlightStyleUrl), getId = js.Any.fromFunction0(getId), getNormalStyle = js.Any.fromFunction0(getNormalStyle), getNormalStyleUrl = js.Any.fromFunction0(getNormalStyleUrl), getOwnerDocument = js.Any.fromFunction0(getOwnerDocument), getParentNode = js.Any.fromFunction0(getParentNode), getType = js.Any.fromFunction0(getType), getUrl = js.Any.fromFunction0(getUrl), mousedown = js.Any.fromFunction1(mousedown), mousemove = js.Any.fromFunction1(mousemove), mouseout = js.Any.fromFunction1(mouseout), mouseover = js.Any.fromFunction1(mouseover), mouseup = js.Any.fromFunction1(mouseup), release = js.Any.fromFunction0(release), setHighlightStyle = js.Any.fromFunction1(setHighlightStyle), setHighlightStyleUrl = js.Any.fromFunction1(setHighlightStyleUrl), setNormalStyle = js.Any.fromFunction1(setNormalStyle), setNormalStyleUrl = js.Any.fromFunction1(setNormalStyleUrl), setStyle = js.Any.fromFunction2(setStyle), setUrl = js.Any.fromFunction2(setUrl))
    __obj.updateDynamic("equals")(js.Any.fromFunction1(equals_))
    __obj.asInstanceOf[KmlStyleMap]
  }
  
  @scala.inline
  implicit class KmlStyleMapMutableBuilder[Self <: KmlStyleMap] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetHighlightStyle(value: () => KmlStyle): Self = StObject.set(x, "getHighlightStyle", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetHighlightStyleUrl(value: () => String): Self = StObject.set(x, "getHighlightStyleUrl", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetNormalStyle(value: () => KmlStyle): Self = StObject.set(x, "getNormalStyle", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetNormalStyleUrl(value: () => String): Self = StObject.set(x, "getNormalStyleUrl", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetHighlightStyle(value: KmlStyle => Unit): Self = StObject.set(x, "setHighlightStyle", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetHighlightStyleUrl(value: String => Unit): Self = StObject.set(x, "setHighlightStyleUrl", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetNormalStyle(value: KmlStyle => Unit): Self = StObject.set(x, "setNormalStyle", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetNormalStyleUrl(value: String => Unit): Self = StObject.set(x, "setNormalStyleUrl", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetStyle(value: (KmlStyle, KmlStyle) => Unit): Self = StObject.set(x, "setStyle", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSetUrl(value: (String, String) => Unit): Self = StObject.set(x, "setUrl", js.Any.fromFunction2(value))
  }
}
