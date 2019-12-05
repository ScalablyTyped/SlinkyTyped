package typingsSlinky.ol

import typingsSlinky.ol.renderReplayTypeMod.ReplayType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/render/ReplayType", JSImport.Namespace)
@js.native
object renderReplayTypeMod extends js.Object {
  @js.native
  sealed trait ReplayType extends js.Object
  
  @js.native
  object ReplayType extends js.Object {
    @js.native
    sealed trait CIRCLE extends ReplayType
    
    @js.native
    sealed trait DEFAULT extends ReplayType
    
    @js.native
    sealed trait IMAGE extends ReplayType
    
    @js.native
    sealed trait LINE_STRING extends ReplayType
    
    @js.native
    sealed trait POLYGON extends ReplayType
    
    @js.native
    sealed trait TEXT extends ReplayType
    
  }
  
  @js.native
  object default extends js.Object {
    /* "Circle" */ val CIRCLE: typingsSlinky.ol.renderReplayTypeMod.ReplayType.CIRCLE with String = js.native
    /* "Default" */ val DEFAULT: typingsSlinky.ol.renderReplayTypeMod.ReplayType.DEFAULT with String = js.native
    /* "Image" */ val IMAGE: typingsSlinky.ol.renderReplayTypeMod.ReplayType.IMAGE with String = js.native
    /* "LineString" */ val LINE_STRING: typingsSlinky.ol.renderReplayTypeMod.ReplayType.LINE_STRING with String = js.native
    /* "Polygon" */ val POLYGON: typingsSlinky.ol.renderReplayTypeMod.ReplayType.POLYGON with String = js.native
    /* "Text" */ val TEXT: typingsSlinky.ol.renderReplayTypeMod.ReplayType.TEXT with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[ReplayType with String] = js.native
  }
  
}

