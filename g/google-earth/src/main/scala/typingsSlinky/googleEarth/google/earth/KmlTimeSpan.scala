package typingsSlinky.googleEarth.google.earth

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KmlTimeSpan extends KmlObject {
  
  /**
    * Describes the beginning instant of a time period.
    * If absent, the beginning of the period is unbounded.
    */
  def getBegin(): KmlDateTime = js.native
  
  /**
    * Describes the ending instant of a time period.
    * If absent, the end of the period is unbounded.
    */
  def getEnd(): KmlDateTime = js.native
}
object KmlTimeSpan {
  
  @scala.inline
  def apply(
    click: KmlMouseEvent => Unit,
    dblclick: KmlMouseEvent => Unit,
    equals_ : KmlObject => Boolean,
    getBegin: () => KmlDateTime,
    getEnd: () => KmlDateTime,
    getId: () => String,
    getOwnerDocument: () => KmlDocument,
    getParentNode: () => KmlObject,
    getType: () => String,
    getUrl: () => String,
    mousedown: KmlMouseEvent => Unit,
    mousemove: KmlMouseEvent => Unit,
    mouseout: KmlMouseEvent => Unit,
    mouseover: KmlMouseEvent => Unit,
    mouseup: KmlMouseEvent => Unit,
    release: () => Unit
  ): KmlTimeSpan = {
    val __obj = js.Dynamic.literal(click = js.Any.fromFunction1(click), dblclick = js.Any.fromFunction1(dblclick), getBegin = js.Any.fromFunction0(getBegin), getEnd = js.Any.fromFunction0(getEnd), getId = js.Any.fromFunction0(getId), getOwnerDocument = js.Any.fromFunction0(getOwnerDocument), getParentNode = js.Any.fromFunction0(getParentNode), getType = js.Any.fromFunction0(getType), getUrl = js.Any.fromFunction0(getUrl), mousedown = js.Any.fromFunction1(mousedown), mousemove = js.Any.fromFunction1(mousemove), mouseout = js.Any.fromFunction1(mouseout), mouseover = js.Any.fromFunction1(mouseover), mouseup = js.Any.fromFunction1(mouseup), release = js.Any.fromFunction0(release))
    __obj.updateDynamic("equals")(js.Any.fromFunction1(equals_))
    __obj.asInstanceOf[KmlTimeSpan]
  }
  
  @scala.inline
  implicit class KmlTimeSpanMutableBuilder[Self <: KmlTimeSpan] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetBegin(value: () => KmlDateTime): Self = StObject.set(x, "getBegin", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetEnd(value: () => KmlDateTime): Self = StObject.set(x, "getEnd", js.Any.fromFunction0(value))
  }
}
