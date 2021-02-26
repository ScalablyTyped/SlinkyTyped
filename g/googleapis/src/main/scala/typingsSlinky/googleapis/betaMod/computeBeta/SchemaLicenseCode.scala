package typingsSlinky.googleapis.betaMod.computeBeta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaLicenseCode extends StObject {
  
  /**
    * [Output Only] Creation timestamp in RFC3339 text format.
    */
  var creationTimestamp: js.UndefOr[String] = js.native
  
  /**
    * [Output Only] Description of this License Code.
    */
  var description: js.UndefOr[String] = js.native
  
  /**
    * [Output Only] The unique identifier for the resource. This identifier is
    * defined by the server.
    */
  var id: js.UndefOr[String] = js.native
  
  /**
    * [Output Only] Type of resource. Always compute#licenseCode for licenses.
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * [Output Only] URL and description aliases of Licenses with the same
    * License Code.
    */
  var licenseAlias: js.UndefOr[js.Array[SchemaLicenseCodeLicenseAlias]] = js.native
  
  /**
    * [Output Only] Name of the resource. The name is 1-20 characters long and
    * must be a valid 64 bit integer.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * [Output Only] Server-defined URL for the resource.
    */
  var selfLink: js.UndefOr[String] = js.native
  
  /**
    * [Output Only] Current state of this License Code.
    */
  var state: js.UndefOr[String] = js.native
  
  /**
    * [Output Only] If true, the license will remain attached when creating
    * images or snapshots from disks. Otherwise, the license is not
    * transferred.
    */
  var transferable: js.UndefOr[Boolean] = js.native
}
object SchemaLicenseCode {
  
  @scala.inline
  def apply(): SchemaLicenseCode = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLicenseCode]
  }
  
  @scala.inline
  implicit class SchemaLicenseCodeMutableBuilder[Self <: SchemaLicenseCode] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreationTimestamp(value: String): Self = StObject.set(x, "creationTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationTimestampUndefined: Self = StObject.set(x, "creationTimestamp", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setLicenseAlias(value: js.Array[SchemaLicenseCodeLicenseAlias]): Self = StObject.set(x, "licenseAlias", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLicenseAliasUndefined: Self = StObject.set(x, "licenseAlias", js.undefined)
    
    @scala.inline
    def setLicenseAliasVarargs(value: SchemaLicenseCodeLicenseAlias*): Self = StObject.set(x, "licenseAlias", js.Array(value :_*))
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setSelfLink(value: String): Self = StObject.set(x, "selfLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelfLinkUndefined: Self = StObject.set(x, "selfLink", js.undefined)
    
    @scala.inline
    def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    @scala.inline
    def setTransferable(value: Boolean): Self = StObject.set(x, "transferable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransferableUndefined: Self = StObject.set(x, "transferable", js.undefined)
  }
}
