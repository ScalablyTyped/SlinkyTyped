package typingsSlinky.ol.interactionDragAndDropMod

import org.scalajs.dom.raw.File
import typingsSlinky.ol.featureMod.FeatureLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/interaction/DragAndDrop", "DragAndDropEvent")
@js.native
class DragAndDropEvent protected ()
  extends typingsSlinky.ol.eventsEventMod.default {
  def this(`type`: DragAndDropEventType, file: File) = this()
  def this(
    `type`: DragAndDropEventType,
    file: File,
    opt_features: js.Array[typingsSlinky.ol.featureMod.default]
  ) = this()
  def this(
    `type`: DragAndDropEventType,
    file: File,
    opt_features: js.Array[typingsSlinky.ol.featureMod.default],
    opt_projection: typingsSlinky.ol.projProjectionMod.default
  ) = this()
  var features: js.Array[FeatureLike] = js.native
  var file: File = js.native
  var projection: typingsSlinky.ol.projProjectionMod.default = js.native
}

