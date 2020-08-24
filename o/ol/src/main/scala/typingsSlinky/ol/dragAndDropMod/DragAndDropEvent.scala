package typingsSlinky.ol.dragAndDropMod

import org.scalajs.dom.raw.File
import typingsSlinky.ol.olFeatureMod.FeatureLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/interaction/DragAndDrop", "DragAndDropEvent")
@js.native
class DragAndDropEvent protected ()
  extends typingsSlinky.ol.eventMod.default {
  def this(`type`: DragAndDropEventType, file: File) = this()
  def this(
    `type`: DragAndDropEventType,
    file: File,
    opt_features: js.Array[typingsSlinky.ol.olFeatureMod.default[typingsSlinky.ol.geometryMod.default]]
  ) = this()
  def this(
    `type`: DragAndDropEventType,
    file: File,
    opt_features: js.UndefOr[scala.Nothing],
    opt_projection: typingsSlinky.ol.projectionMod.default
  ) = this()
  def this(
    `type`: DragAndDropEventType,
    file: File,
    opt_features: js.Array[typingsSlinky.ol.olFeatureMod.default[typingsSlinky.ol.geometryMod.default]],
    opt_projection: typingsSlinky.ol.projectionMod.default
  ) = this()
  var features: js.Array[FeatureLike] = js.native
  var file: File = js.native
  var projection: typingsSlinky.ol.projectionMod.default = js.native
}

