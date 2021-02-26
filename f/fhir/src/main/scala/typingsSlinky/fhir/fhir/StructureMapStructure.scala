package typingsSlinky.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Structure Definition used by this map
  */
@js.native
trait StructureMapStructure extends BackboneElement {
  
  /**
    * Contains extended information for property 'alias'.
    */
  var _alias: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'documentation'.
    */
  var _documentation: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'mode'.
    */
  var _mode: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'url'.
    */
  var _url: js.UndefOr[Element] = js.native
  
  /**
    * Name for type in this map
    */
  var alias: js.UndefOr[String] = js.native
  
  /**
    * Documentation on use of structure
    */
  var documentation: js.UndefOr[String] = js.native
  
  /**
    * source | queried | target | produced
    */
  var mode: code = js.native
  
  /**
    * Canonical URL for structure definition
    */
  var url: uri = js.native
}
object StructureMapStructure {
  
  @scala.inline
  def apply(mode: code, url: uri): StructureMapStructure = {
    val __obj = js.Dynamic.literal(mode = mode.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[StructureMapStructure]
  }
  
  @scala.inline
  implicit class StructureMapStructureMutableBuilder[Self <: StructureMapStructure] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlias(value: String): Self = StObject.set(x, "alias", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAliasUndefined: Self = StObject.set(x, "alias", js.undefined)
    
    @scala.inline
    def setDocumentation(value: String): Self = StObject.set(x, "documentation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocumentationUndefined: Self = StObject.set(x, "documentation", js.undefined)
    
    @scala.inline
    def setMode(value: code): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: uri): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_alias(value: Element): Self = StObject.set(x, "_alias", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_aliasUndefined: Self = StObject.set(x, "_alias", js.undefined)
    
    @scala.inline
    def set_documentation(value: Element): Self = StObject.set(x, "_documentation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_documentationUndefined: Self = StObject.set(x, "_documentation", js.undefined)
    
    @scala.inline
    def set_mode(value: Element): Self = StObject.set(x, "_mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_modeUndefined: Self = StObject.set(x, "_mode", js.undefined)
    
    @scala.inline
    def set_url(value: Element): Self = StObject.set(x, "_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_urlUndefined: Self = StObject.set(x, "_url", js.undefined)
  }
}
