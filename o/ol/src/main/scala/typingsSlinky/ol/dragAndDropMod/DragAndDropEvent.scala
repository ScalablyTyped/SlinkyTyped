package typingsSlinky.ol.dragAndDropMod

import org.scalajs.dom.raw.File
import typingsSlinky.ol.olFeatureMod.FeatureLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DragAndDropEvent
  extends typingsSlinky.ol.eventMod.default {
  
  /**
    * The features parsed from dropped data.
    */
  var features: js.Array[FeatureLike] = js.native
  
  /**
    * The dropped file.
    */
  var file: File = js.native
  
  /**
    * The feature projection.
    */
  var projection: typingsSlinky.ol.projectionMod.default = js.native
}
