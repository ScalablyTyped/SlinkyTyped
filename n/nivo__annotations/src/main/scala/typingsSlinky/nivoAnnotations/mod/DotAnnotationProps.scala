package typingsSlinky.nivoAnnotations.mod

import slinky.core.TagMod
import typingsSlinky.nivoAnnotations.nivoAnnotationsStrings.dot
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined @nivo/annotations.@nivo/annotations.CommonAnnotationProps & {  type  :'dot',   size ? :number} */
trait DotAnnotationProps extends AnnotationProps {
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
  var size: js.UndefOr[Double] = js.undefined
  var `type`: dot
  var x: Double
  var y: Double
}

object DotAnnotationProps {
  @scala.inline
  def apply(
    containerHeight: Double,
    containerWidth: Double,
    note: TagMod[Any],
    noteX: NoteCoordinate,
    noteY: NoteCoordinate,
    `type`: dot,
    x: Double,
    y: Double,
    animate: js.UndefOr[Boolean] = js.undefined,
    motionDamping: Int | Double = null,
    motionStiffness: Int | Double = null,
    noteTextOffset: Int | Double = null,
    noteWidth: Int | Double = null,
    size: Int | Double = null
  ): DotAnnotationProps = {
    val __obj = js.Dynamic.literal(containerHeight = containerHeight.asInstanceOf[js.Any], containerWidth = containerWidth.asInstanceOf[js.Any], note = note.asInstanceOf[js.Any], noteX = noteX.asInstanceOf[js.Any], noteY = noteY.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(animate)) __obj.updateDynamic("animate")(animate.asInstanceOf[js.Any])
    if (motionDamping != null) __obj.updateDynamic("motionDamping")(motionDamping.asInstanceOf[js.Any])
    if (motionStiffness != null) __obj.updateDynamic("motionStiffness")(motionStiffness.asInstanceOf[js.Any])
    if (noteTextOffset != null) __obj.updateDynamic("noteTextOffset")(noteTextOffset.asInstanceOf[js.Any])
    if (noteWidth != null) __obj.updateDynamic("noteWidth")(noteWidth.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[DotAnnotationProps]
  }
}

