package typingsSlinky.activexLibreoffice.com_.sun.star.ui

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.frame.XModel
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Internal interface to update the used css::frame::XModel
  * @since LibreOffice 5.1
  */
@js.native
trait XUpdateModel extends XInterface {
  
  def updateModel(xModel: XModel): Unit = js.native
}
object XUpdateModel {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    updateModel: XModel => Unit
  ): XUpdateModel = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), updateModel = js.Any.fromFunction1(updateModel))
    __obj.asInstanceOf[XUpdateModel]
  }
  
  @scala.inline
  implicit class XUpdateModelMutableBuilder[Self <: XUpdateModel] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUpdateModel(value: XModel => Unit): Self = StObject.set(x, "updateModel", js.Any.fromFunction1(value))
  }
}
