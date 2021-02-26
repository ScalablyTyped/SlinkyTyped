package typingsSlinky.activexLibreoffice.com_.sun.star.text

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.container.XNameAccess
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** provides access to the collection of all embedded and linked graphics within this context (i.e. within this document). */
@js.native
trait XTextGraphicObjectsSupplier extends XInterface {
  
  /** @returns the collection of graphic objects in this object (document). */
  val GraphicObjects: XNameAccess = js.native
  
  /** @returns the collection of graphic objects in this object (document). */
  def getGraphicObjects(): XNameAccess = js.native
}
object XTextGraphicObjectsSupplier {
  
  @scala.inline
  def apply(
    GraphicObjects: XNameAccess,
    acquire: () => Unit,
    getGraphicObjects: () => XNameAccess,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XTextGraphicObjectsSupplier = {
    val __obj = js.Dynamic.literal(GraphicObjects = GraphicObjects.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getGraphicObjects = js.Any.fromFunction0(getGraphicObjects), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XTextGraphicObjectsSupplier]
  }
  
  @scala.inline
  implicit class XTextGraphicObjectsSupplierMutableBuilder[Self <: XTextGraphicObjectsSupplier] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetGraphicObjects(value: () => XNameAccess): Self = StObject.set(x, "getGraphicObjects", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGraphicObjects(value: XNameAccess): Self = StObject.set(x, "GraphicObjects", value.asInstanceOf[js.Any])
  }
}
