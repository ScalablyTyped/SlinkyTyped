package typingsSlinky.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An Instance Template resource. (== resource_for beta.instanceTemplates ==)
  * (== resource_for v1.instanceTemplates ==)
  */
@js.native
trait SchemaInstanceTemplate extends StObject {
  
  /**
    * [Output Only] The creation timestamp for this instance template in
    * RFC3339 text format.
    */
  var creationTimestamp: js.UndefOr[String] = js.native
  
  /**
    * An optional description of this resource. Provide this property when you
    * create the resource.
    */
  var description: js.UndefOr[String] = js.native
  
  /**
    * [Output Only] A unique identifier for this instance template. The server
    * defines this identifier.
    */
  var id: js.UndefOr[String] = js.native
  
  /**
    * [Output Only] The resource type, which is always compute#instanceTemplate
    * for instance templates.
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * Name of the resource; provided by the client when the resource is
    * created. The name must be 1-63 characters long, and comply with RFC1035.
    * Specifically, the name must be 1-63 characters long and match the regular
    * expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character
    * must be a lowercase letter, and all following characters must be a dash,
    * lowercase letter, or digit, except the last character, which cannot be a
    * dash.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * The instance properties for this instance template.
    */
  var properties: js.UndefOr[SchemaInstanceProperties] = js.native
  
  /**
    * [Output Only] The URL for this instance template. The server defines this
    * URL.
    */
  var selfLink: js.UndefOr[String] = js.native
  
  /**
    * [Output Only] Server-defined URL for this resource with the resource id.
    */
  var selfLinkWithId: js.UndefOr[String] = js.native
  
  /**
    * The source instance used to create the template. You can provide this as
    * a partial or full URL to the resource. For example, the following are
    * valid values:   -
    * https://www.googleapis.com/compute/v1/projects/project/zones/zone/instances/instance
    * - projects/project/zones/zone/instances/instance
    */
  var sourceInstance: js.UndefOr[String] = js.native
  
  /**
    * The source instance params to use to create this instance template.
    */
  var sourceInstanceParams: js.UndefOr[SchemaSourceInstanceParams] = js.native
}
object SchemaInstanceTemplate {
  
  @scala.inline
  def apply(): SchemaInstanceTemplate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInstanceTemplate]
  }
  
  @scala.inline
  implicit class SchemaInstanceTemplateMutableBuilder[Self <: SchemaInstanceTemplate] (val x: Self) extends AnyVal {
    
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
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setProperties(value: SchemaInstanceProperties): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
    
    @scala.inline
    def setSelfLink(value: String): Self = StObject.set(x, "selfLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelfLinkUndefined: Self = StObject.set(x, "selfLink", js.undefined)
    
    @scala.inline
    def setSelfLinkWithId(value: String): Self = StObject.set(x, "selfLinkWithId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelfLinkWithIdUndefined: Self = StObject.set(x, "selfLinkWithId", js.undefined)
    
    @scala.inline
    def setSourceInstance(value: String): Self = StObject.set(x, "sourceInstance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceInstanceParams(value: SchemaSourceInstanceParams): Self = StObject.set(x, "sourceInstanceParams", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceInstanceParamsUndefined: Self = StObject.set(x, "sourceInstanceParams", js.undefined)
    
    @scala.inline
    def setSourceInstanceUndefined: Self = StObject.set(x, "sourceInstance", js.undefined)
  }
}
