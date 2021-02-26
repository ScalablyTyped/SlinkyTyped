package typingsSlinky.activexLibreoffice.com_.sun.star.xml.dom

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait XNodeList extends XInterface {
  
  /** The number of nodes in the list. */
  val Length: Double = js.native
  
  /** The number of nodes in the list. */
  def getLength(): Double = js.native
  
  /** Returns a node specified by index in the collection. */
  def item(index: Double): XNode = js.native
}
object XNodeList {
  
  @scala.inline
  def apply(
    Length: Double,
    acquire: () => Unit,
    getLength: () => Double,
    item: Double => XNode,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XNodeList = {
    val __obj = js.Dynamic.literal(Length = Length.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getLength = js.Any.fromFunction0(getLength), item = js.Any.fromFunction1(item), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XNodeList]
  }
  
  @scala.inline
  implicit class XNodeListMutableBuilder[Self <: XNodeList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetLength(value: () => Double): Self = StObject.set(x, "getLength", js.Any.fromFunction0(value))
    
    @scala.inline
    def setItem(value: Double => XNode): Self = StObject.set(x, "item", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLength(value: Double): Self = StObject.set(x, "Length", value.asInstanceOf[js.Any])
  }
}
