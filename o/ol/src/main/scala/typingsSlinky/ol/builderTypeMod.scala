package typingsSlinky.ol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object builderTypeMod {
  
  @JSImport("ol/render/canvas/BuilderType", JSImport.Default)
  @js.native
  object default extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[BuilderType with String] = js.native
    
    /* "Circle" */ val CIRCLE: typingsSlinky.ol.builderTypeMod.BuilderType.CIRCLE with String = js.native
    
    /* "Default" */ val DEFAULT: typingsSlinky.ol.builderTypeMod.BuilderType.DEFAULT with String = js.native
    
    /* "Image" */ val IMAGE: typingsSlinky.ol.builderTypeMod.BuilderType.IMAGE with String = js.native
    
    /* "LineString" */ val LINE_STRING: typingsSlinky.ol.builderTypeMod.BuilderType.LINE_STRING with String = js.native
    
    /* "Polygon" */ val POLYGON: typingsSlinky.ol.builderTypeMod.BuilderType.POLYGON with String = js.native
    
    /* "Text" */ val TEXT: typingsSlinky.ol.builderTypeMod.BuilderType.TEXT with String = js.native
  }
  
  @js.native
  sealed trait BuilderType extends StObject
  @JSImport("ol/render/canvas/BuilderType", "BuilderType")
  @js.native
  object BuilderType extends StObject {
    
    @js.native
    sealed trait CIRCLE extends BuilderType
    
    @js.native
    sealed trait DEFAULT extends BuilderType
    
    @js.native
    sealed trait IMAGE extends BuilderType
    
    @js.native
    sealed trait LINE_STRING extends BuilderType
    
    @js.native
    sealed trait POLYGON extends BuilderType
    
    @js.native
    sealed trait TEXT extends BuilderType
  }
}
