package typingsSlinky.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Another Implementation guide this depends on
  */
@js.native
trait ImplementationGuideDependency extends BackboneElement {
  
  /**
    * Contains extended information for property 'type'.
    */
  var _type: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'uri'.
    */
  var _uri: js.UndefOr[Element] = js.native
  
  /**
    * reference | inclusion
    */
  var `type`: code = js.native
  
  /**
    * Where to find dependency
    */
  var uri: typingsSlinky.fhir.fhir.uri = js.native
}
object ImplementationGuideDependency {
  
  @scala.inline
  def apply(`type`: code, uri: uri): ImplementationGuideDependency = {
    val __obj = js.Dynamic.literal(uri = uri.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImplementationGuideDependency]
  }
  
  @scala.inline
  implicit class ImplementationGuideDependencyMutableBuilder[Self <: ImplementationGuideDependency] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: code): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUri(value: uri): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_type(value: Element): Self = StObject.set(x, "_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_typeUndefined: Self = StObject.set(x, "_type", js.undefined)
    
    @scala.inline
    def set_uri(value: Element): Self = StObject.set(x, "_uri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_uriUndefined: Self = StObject.set(x, "_uri", js.undefined)
  }
}
