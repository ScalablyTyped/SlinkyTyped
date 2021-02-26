package typingsSlinky.ol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object formatTypeMod {
  
  @JSImport("ol/format/FormatType", JSImport.Default)
  @js.native
  object default extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[FormatType with String] = js.native
    
    /* "arraybuffer" */ val ARRAY_BUFFER: typingsSlinky.ol.formatTypeMod.FormatType.ARRAY_BUFFER with String = js.native
    
    /* "json" */ val JSON: typingsSlinky.ol.formatTypeMod.FormatType.JSON with String = js.native
    
    /* "text" */ val TEXT: typingsSlinky.ol.formatTypeMod.FormatType.TEXT with String = js.native
    
    /* "xml" */ val XML: typingsSlinky.ol.formatTypeMod.FormatType.XML with String = js.native
  }
  
  @js.native
  sealed trait FormatType extends StObject
  @JSImport("ol/format/FormatType", "FormatType")
  @js.native
  object FormatType extends StObject {
    
    @js.native
    sealed trait ARRAY_BUFFER extends FormatType
    
    @js.native
    sealed trait JSON extends FormatType
    
    @js.native
    sealed trait TEXT extends FormatType
    
    @js.native
    sealed trait XML extends FormatType
  }
}
