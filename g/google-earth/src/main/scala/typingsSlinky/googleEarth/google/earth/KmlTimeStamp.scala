package typingsSlinky.googleEarth.google.earth

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KmlTimeStamp extends KmlObject {
  
  /**
    * Represents a single moment in time.
    * This is a simple element and contains no children.
    * Its value is a dateTime, specified in XML time.
    * The precision of the TimeStamp is dictated by the dateTime value in the when property.
    *
    * * dateTime gives second resolution
    * * date gives day resolution
    * * gYearMonth gives month resolution
    * * gYear gives year resolution
    */
  def getWhen(): KmlDateTime = js.native
}
object KmlTimeStamp {
  
  @scala.inline
  def apply(
    click: KmlMouseEvent => Unit,
    dblclick: KmlMouseEvent => Unit,
    equals_ : KmlObject => Boolean,
    getId: () => String,
    getOwnerDocument: () => KmlDocument,
    getParentNode: () => KmlObject,
    getType: () => String,
    getUrl: () => String,
    getWhen: () => KmlDateTime,
    mousedown: KmlMouseEvent => Unit,
    mousemove: KmlMouseEvent => Unit,
    mouseout: KmlMouseEvent => Unit,
    mouseover: KmlMouseEvent => Unit,
    mouseup: KmlMouseEvent => Unit,
    release: () => Unit
  ): KmlTimeStamp = {
    val __obj = js.Dynamic.literal(click = js.Any.fromFunction1(click), dblclick = js.Any.fromFunction1(dblclick), getId = js.Any.fromFunction0(getId), getOwnerDocument = js.Any.fromFunction0(getOwnerDocument), getParentNode = js.Any.fromFunction0(getParentNode), getType = js.Any.fromFunction0(getType), getUrl = js.Any.fromFunction0(getUrl), getWhen = js.Any.fromFunction0(getWhen), mousedown = js.Any.fromFunction1(mousedown), mousemove = js.Any.fromFunction1(mousemove), mouseout = js.Any.fromFunction1(mouseout), mouseover = js.Any.fromFunction1(mouseover), mouseup = js.Any.fromFunction1(mouseup), release = js.Any.fromFunction0(release))
    __obj.updateDynamic("equals")(js.Any.fromFunction1(equals_))
    __obj.asInstanceOf[KmlTimeStamp]
  }
  
  @scala.inline
  implicit class KmlTimeStampMutableBuilder[Self <: KmlTimeStamp] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetWhen(value: () => KmlDateTime): Self = StObject.set(x, "getWhen", js.Any.fromFunction0(value))
  }
}
