package typingsSlinky.officeJs.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * A scoped collection of custom XML parts.
  A scoped collection is the result of some operation (e.g., filtering by namespace).
  A scoped collection cannot be scoped any further.
  *
  * [Api set: ExcelApi 1.5]
  */
@js.native
trait CustomXmlPartScopedCollectionLoadOptions extends StObject {
  
  /**
    Specifying `$all` for the LoadOptions loads all the scalar properties (e.g.: `Range.address`) but not the navigational properties (e.g.: `Range.format.fill.color`).
    */
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * For EACH ITEM in the collection: The custom XML part's ID.
    *
    * [Api set: ExcelApi 1.5]
    */
  var id: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * For EACH ITEM in the collection: The custom XML part's namespace URI.
    *
    * [Api set: ExcelApi 1.5]
    */
  var namespaceUri: js.UndefOr[Boolean] = js.native
}
object CustomXmlPartScopedCollectionLoadOptions {
  
  @scala.inline
  def apply(): CustomXmlPartScopedCollectionLoadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomXmlPartScopedCollectionLoadOptions]
  }
  
  @scala.inline
  implicit class CustomXmlPartScopedCollectionLoadOptionsMutableBuilder[Self <: CustomXmlPartScopedCollectionLoadOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def set$all(value: Boolean): Self = StObject.set(x, "$all", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$allUndefined: Self = StObject.set(x, "$all", js.undefined)
    
    @scala.inline
    def setId(value: Boolean): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setNamespaceUri(value: Boolean): Self = StObject.set(x, "namespaceUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNamespaceUriUndefined: Self = StObject.set(x, "namespaceUri", js.undefined)
  }
}
