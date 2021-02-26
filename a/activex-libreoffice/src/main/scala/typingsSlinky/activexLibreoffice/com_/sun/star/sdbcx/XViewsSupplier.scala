package typingsSlinky.activexLibreoffice.com_.sun.star.sdbcx

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.container.XNameAccess
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** provides for access to a container of views, typically used for a database definition object. */
@js.native
trait XViewsSupplier extends XInterface {
  
  /**
    * returns the container of views.
    * @returns the views
    */
  val Views: XNameAccess = js.native
  
  /**
    * returns the container of views.
    * @returns the views
    */
  def getViews(): XNameAccess = js.native
}
object XViewsSupplier {
  
  @scala.inline
  def apply(
    Views: XNameAccess,
    acquire: () => Unit,
    getViews: () => XNameAccess,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XViewsSupplier = {
    val __obj = js.Dynamic.literal(Views = Views.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getViews = js.Any.fromFunction0(getViews), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XViewsSupplier]
  }
  
  @scala.inline
  implicit class XViewsSupplierMutableBuilder[Self <: XViewsSupplier] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetViews(value: () => XNameAccess): Self = StObject.set(x, "getViews", js.Any.fromFunction0(value))
    
    @scala.inline
    def setViews(value: XNameAccess): Self = StObject.set(x, "Views", value.asInstanceOf[js.Any])
  }
}
