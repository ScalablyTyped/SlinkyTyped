package typingsSlinky.nivoAnnotations.mod

import slinky.core.TagMod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  containerWidth  :number,   containerHeight  :number,   x  :number,   y  :number,   noteX  :@nivo/annotations.@nivo/annotations.NoteCoordinate,   noteY  :@nivo/annotations.@nivo/annotations.NoteCoordinate,   noteWidth ? :number,   noteTextOffset ? :number,   note  :react.react.ReactNode} & @nivo/core.@nivo/core.MotionProps */
trait CommonAnnotationProps extends js.Object {
  var animate: js.UndefOr[Boolean] = js.undefined
  var containerHeight: Double
  var containerWidth: Double
  var motionDamping: js.UndefOr[Double] = js.undefined
  var motionStiffness: js.UndefOr[Double] = js.undefined
  var note: TagMod[Any]
  var noteTextOffset: js.UndefOr[Double] = js.undefined
  var noteWidth: js.UndefOr[Double] = js.undefined
  var noteX: NoteCoordinate
  var noteY: NoteCoordinate
  var x: Double
  var y: Double
}

object CommonAnnotationProps {
  @scala.inline
  def apply(
    containerHeight: Double,
    containerWidth: Double,
    note: TagMod[Any],
    noteX: NoteCoordinate,
    noteY: NoteCoordinate,
    x: Double,
    y: Double,
    animate: js.UndefOr[Boolean] = js.undefined,
    motionDamping: Int | Double = null,
    motionStiffness: Int | Double = null,
    noteTextOffset: Int | Double = null,
    noteWidth: Int | Double = null
  ): CommonAnnotationProps = {
    val __obj = js.Dynamic.literal(containerHeight = containerHeight.asInstanceOf[js.Any], containerWidth = containerWidth.asInstanceOf[js.Any], note = note.asInstanceOf[js.Any], noteX = noteX.asInstanceOf[js.Any], noteY = noteY.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    if (!js.isUndefined(animate)) __obj.updateDynamic("animate")(animate.asInstanceOf[js.Any])
    if (motionDamping != null) __obj.updateDynamic("motionDamping")(motionDamping.asInstanceOf[js.Any])
    if (motionStiffness != null) __obj.updateDynamic("motionStiffness")(motionStiffness.asInstanceOf[js.Any])
    if (noteTextOffset != null) __obj.updateDynamic("noteTextOffset")(noteTextOffset.asInstanceOf[js.Any])
    if (noteWidth != null) __obj.updateDynamic("noteWidth")(noteWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommonAnnotationProps]
  }
}

