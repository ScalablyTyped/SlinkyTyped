package typingsSlinky.onfleetNodeOnfleet

import typingsSlinky.onfleetNodeOnfleet.onfleetNodeOnfleetStrings.worker_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object metadataMod {
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.onfleetNodeOnfleet.onfleetNodeOnfleetStrings.boolean
    - typingsSlinky.onfleetNodeOnfleet.onfleetNodeOnfleetStrings.number
    - typingsSlinky.onfleetNodeOnfleet.onfleetNodeOnfleetStrings.string
    - typingsSlinky.onfleetNodeOnfleet.onfleetNodeOnfleetStrings.`object`
  */
  trait MetadataSubType extends StObject
  object MetadataSubType {
    
    @scala.inline
    def boolean: typingsSlinky.onfleetNodeOnfleet.onfleetNodeOnfleetStrings.boolean = "boolean".asInstanceOf[typingsSlinky.onfleetNodeOnfleet.onfleetNodeOnfleetStrings.boolean]
    
    @scala.inline
    def number: typingsSlinky.onfleetNodeOnfleet.onfleetNodeOnfleetStrings.number = "number".asInstanceOf[typingsSlinky.onfleetNodeOnfleet.onfleetNodeOnfleetStrings.number]
    
    @scala.inline
    def `object`: typingsSlinky.onfleetNodeOnfleet.onfleetNodeOnfleetStrings.`object` = "object".asInstanceOf[typingsSlinky.onfleetNodeOnfleet.onfleetNodeOnfleetStrings.`object`]
    
    @scala.inline
    def string: typingsSlinky.onfleetNodeOnfleet.onfleetNodeOnfleetStrings.string = "string".asInstanceOf[typingsSlinky.onfleetNodeOnfleet.onfleetNodeOnfleetStrings.string]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.onfleetNodeOnfleet.onfleetNodeOnfleetStrings.boolean
    - typingsSlinky.onfleetNodeOnfleet.onfleetNodeOnfleetStrings.number
    - typingsSlinky.onfleetNodeOnfleet.onfleetNodeOnfleetStrings.string
    - typingsSlinky.onfleetNodeOnfleet.onfleetNodeOnfleetStrings.`object`
    - typingsSlinky.onfleetNodeOnfleet.onfleetNodeOnfleetStrings.array
  */
  trait MetadataType extends StObject
  object MetadataType {
    
    @scala.inline
    def array: typingsSlinky.onfleetNodeOnfleet.onfleetNodeOnfleetStrings.array = "array".asInstanceOf[typingsSlinky.onfleetNodeOnfleet.onfleetNodeOnfleetStrings.array]
    
    @scala.inline
    def boolean: typingsSlinky.onfleetNodeOnfleet.onfleetNodeOnfleetStrings.boolean = "boolean".asInstanceOf[typingsSlinky.onfleetNodeOnfleet.onfleetNodeOnfleetStrings.boolean]
    
    @scala.inline
    def number: typingsSlinky.onfleetNodeOnfleet.onfleetNodeOnfleetStrings.number = "number".asInstanceOf[typingsSlinky.onfleetNodeOnfleet.onfleetNodeOnfleetStrings.number]
    
    @scala.inline
    def `object`: typingsSlinky.onfleetNodeOnfleet.onfleetNodeOnfleetStrings.`object` = "object".asInstanceOf[typingsSlinky.onfleetNodeOnfleet.onfleetNodeOnfleetStrings.`object`]
    
    @scala.inline
    def string: typingsSlinky.onfleetNodeOnfleet.onfleetNodeOnfleetStrings.string = "string".asInstanceOf[typingsSlinky.onfleetNodeOnfleet.onfleetNodeOnfleetStrings.string]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.onfleetNodeOnfleet.onfleetNodeOnfleetStrings.api
    - typingsSlinky.onfleetNodeOnfleet.onfleetNodeOnfleetStrings.dashboard
    - typingsSlinky.onfleetNodeOnfleet.onfleetNodeOnfleetStrings.worker_
  */
  trait MetadataVisibility extends StObject
  object MetadataVisibility {
    
    @scala.inline
    def api: typingsSlinky.onfleetNodeOnfleet.onfleetNodeOnfleetStrings.api = "api".asInstanceOf[typingsSlinky.onfleetNodeOnfleet.onfleetNodeOnfleetStrings.api]
    
    @scala.inline
    def dashboard: typingsSlinky.onfleetNodeOnfleet.onfleetNodeOnfleetStrings.dashboard = "dashboard".asInstanceOf[typingsSlinky.onfleetNodeOnfleet.onfleetNodeOnfleetStrings.dashboard]
    
    @scala.inline
    def worker: worker_ = "worker".asInstanceOf[worker_]
  }
  
  @js.native
  trait OnfleetMetadata extends StObject {
    
    var name: String = js.native
    
    var subtype: js.UndefOr[MetadataSubType] = js.native
    
    var `type`: MetadataType = js.native
    
    var value: js.Any = js.native
    
    var visibility: js.UndefOr[js.Array[MetadataVisibility]] = js.native
  }
  object OnfleetMetadata {
    
    @scala.inline
    def apply(name: String, `type`: MetadataType, value: js.Any): OnfleetMetadata = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[OnfleetMetadata]
    }
    
    @scala.inline
    implicit class OnfleetMetadataMutableBuilder[Self <: OnfleetMetadata] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubtype(value: MetadataSubType): Self = StObject.set(x, "subtype", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubtypeUndefined: Self = StObject.set(x, "subtype", js.undefined)
      
      @scala.inline
      def setType(value: MetadataType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisibility(value: js.Array[MetadataVisibility]): Self = StObject.set(x, "visibility", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisibilityUndefined: Self = StObject.set(x, "visibility", js.undefined)
      
      @scala.inline
      def setVisibilityVarargs(value: MetadataVisibility*): Self = StObject.set(x, "visibility", js.Array(value :_*))
    }
  }
}
