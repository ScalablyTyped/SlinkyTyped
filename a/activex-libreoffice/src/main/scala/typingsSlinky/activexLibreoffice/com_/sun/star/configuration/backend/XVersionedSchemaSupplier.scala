package typingsSlinky.activexLibreoffice.com_.sun.star.configuration.backend

import typingsSlinky.activexLibreoffice.`type`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * provides access to versioned configuration component schemas.
  * @since OOo 2.0
  */
@js.native
trait XVersionedSchemaSupplier extends XSchemaSupplier {
  
  /**
    * Returns the schema version for a particular component.
    * @param aComponent component whose schema version will be determined
    * @returns a `string` that identifies the schema version for the given component.  The format of the version string is arbitrary. No meaning should be attac
    * @throws com::sun::star::lang::IllegalArgumentException if the component identifier is invalid.
    * @throws com::sun::star::configuration::backend::BackendAccessException if an error occurs while accessing the version data.
    */
  def getSchemaVersion(aComponent: String): String = js.native
}
object XVersionedSchemaSupplier {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    getComponentSchema: String => XSchema,
    getSchemaVersion: String => String,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XVersionedSchemaSupplier = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), getComponentSchema = js.Any.fromFunction1(getComponentSchema), getSchemaVersion = js.Any.fromFunction1(getSchemaVersion), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XVersionedSchemaSupplier]
  }
  
  @scala.inline
  implicit class XVersionedSchemaSupplierMutableBuilder[Self <: XVersionedSchemaSupplier] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetSchemaVersion(value: String => String): Self = StObject.set(x, "getSchemaVersion", js.Any.fromFunction1(value))
  }
}
