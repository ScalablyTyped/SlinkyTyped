package typingsSlinky.nivoAnnotations.mod

import slinky.core.TagMod
import typingsSlinky.nivoAnnotations.nivoAnnotationsStrings.dot
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined @nivo/annotations.@nivo/annotations.CommonAnnotationProps & {  type  :'dot',   size ? :number} */
@js.native
trait DotAnnotationProps extends AnnotationProps {
  var animate: js.UndefOr[Boolean] = js.native
  var containerHeight: Double = js.native
  var containerWidth: Double = js.native
  var motionDamping: js.UndefOr[Double] = js.native
  var motionStiffness: js.UndefOr[Double] = js.native
  var note: TagMod[Any] = js.native
  var noteTextOffset: js.UndefOr[Double] = js.native
  var noteWidth: js.UndefOr[Double] = js.native
  var noteX: NoteCoordinate = js.native
  var noteY: NoteCoordinate = js.native
  var size: js.UndefOr[Double] = js.native
  var `type`: dot = js.native
  var x: Double = js.native
  var y: Double = js.native
}

object DotAnnotationProps {
  @scala.inline
  def apply(
    containerHeight: Double,
    containerWidth: Double,
    noteX: NoteCoordinate,
    noteY: NoteCoordinate,
    `type`: dot,
    x: Double,
    y: Double
  ): DotAnnotationProps = {
    val __obj = js.Dynamic.literal(containerHeight = containerHeight.asInstanceOf[js.Any], containerWidth = containerWidth.asInstanceOf[js.Any], noteX = noteX.asInstanceOf[js.Any], noteY = noteY.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DotAnnotationProps]
  }
  @scala.inline
  implicit class DotAnnotationPropsOps[Self <: DotAnnotationProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContainerHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containerHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContainerWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containerWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNoteX(value: NoteCoordinate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noteX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNoteY(value: NoteCoordinate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noteY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: dot): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAnimate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnimate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animate")(js.undefined)
        ret
    }
    @scala.inline
    def withMotionDamping(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("motionDamping")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMotionDamping: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("motionDamping")(js.undefined)
        ret
    }
    @scala.inline
    def withMotionStiffness(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("motionStiffness")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMotionStiffness: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("motionStiffness")(js.undefined)
        ret
    }
    @scala.inline
    def withNote(value: TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("note")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNote: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("note")(js.undefined)
        ret
    }
    @scala.inline
    def withNoteTextOffset(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noteTextOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoteTextOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noteTextOffset")(js.undefined)
        ret
    }
    @scala.inline
    def withNoteWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noteWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoteWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noteWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(js.undefined)
        ret
    }
  }
  
}

