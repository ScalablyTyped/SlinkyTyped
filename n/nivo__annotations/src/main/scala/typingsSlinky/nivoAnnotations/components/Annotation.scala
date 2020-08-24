package typingsSlinky.nivoAnnotations.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.nivoAnnotations.mod.NoteCoordinate
import typingsSlinky.nivoAnnotations.nivoAnnotationsStrings.circle
import typingsSlinky.nivoAnnotations.nivoAnnotationsStrings.dot
import typingsSlinky.nivoAnnotations.nivoAnnotationsStrings.rect
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Annotation {
  object CircleAnnotationProps {
    @JSImport("@nivo/annotations", "Annotation")
    @js.native
    object component extends js.Object
    
    @scala.inline
    class Builder (val args: js.Array[js.Any])
      extends AnyVal
         with StBuildingComponent[tag.type, typingsSlinky.nivoAnnotations.mod.Annotation] {
      @scala.inline
      def animate(value: Boolean): this.type = set("animate", value.asInstanceOf[js.Any])
      @scala.inline
      def motionDamping(value: Double): this.type = set("motionDamping", value.asInstanceOf[js.Any])
      @scala.inline
      def motionStiffness(value: Double): this.type = set("motionStiffness", value.asInstanceOf[js.Any])
      @scala.inline
      def note(value: ReactElement): this.type = set("note", value.asInstanceOf[js.Any])
      @scala.inline
      def noteTextOffset(value: Double): this.type = set("noteTextOffset", value.asInstanceOf[js.Any])
      @scala.inline
      def noteWidth(value: Double): this.type = set("noteWidth", value.asInstanceOf[js.Any])
    }
    
    def withProps(p: typingsSlinky.nivoAnnotations.mod.CircleAnnotationProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
    @scala.inline
    def apply(
      containerHeight: Double,
      containerWidth: Double,
      noteX: NoteCoordinate,
      noteY: NoteCoordinate,
      size: Double,
      `type`: circle,
      x: Double,
      y: Double
    ): Builder = {
        val __props = js.Dynamic.literal(containerHeight = containerHeight.asInstanceOf[js.Any], containerWidth = containerWidth.asInstanceOf[js.Any], noteX = noteX.asInstanceOf[js.Any], noteY = noteY.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
        __props.updateDynamic("type")(`type`.asInstanceOf[js.Any])
        new Builder(js.Array(this.component, __props.asInstanceOf[typingsSlinky.nivoAnnotations.mod.CircleAnnotationProps]))
    }
  }
  
  object DotAnnotationProps {
    @JSImport("@nivo/annotations", "Annotation")
    @js.native
    object component extends js.Object
    
    @scala.inline
    class Builder (val args: js.Array[js.Any])
      extends AnyVal
         with StBuildingComponent[tag.type, typingsSlinky.nivoAnnotations.mod.Annotation] {
      @scala.inline
      def animate(value: Boolean): this.type = set("animate", value.asInstanceOf[js.Any])
      @scala.inline
      def motionDamping(value: Double): this.type = set("motionDamping", value.asInstanceOf[js.Any])
      @scala.inline
      def motionStiffness(value: Double): this.type = set("motionStiffness", value.asInstanceOf[js.Any])
      @scala.inline
      def note(value: ReactElement): this.type = set("note", value.asInstanceOf[js.Any])
      @scala.inline
      def noteTextOffset(value: Double): this.type = set("noteTextOffset", value.asInstanceOf[js.Any])
      @scala.inline
      def noteWidth(value: Double): this.type = set("noteWidth", value.asInstanceOf[js.Any])
      @scala.inline
      def size(value: Double): this.type = set("size", value.asInstanceOf[js.Any])
    }
    
    def withProps(p: typingsSlinky.nivoAnnotations.mod.DotAnnotationProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
    @scala.inline
    def apply(
      containerHeight: Double,
      containerWidth: Double,
      noteX: NoteCoordinate,
      noteY: NoteCoordinate,
      `type`: dot,
      x: Double,
      y: Double
    ): Builder = {
        val __props = js.Dynamic.literal(containerHeight = containerHeight.asInstanceOf[js.Any], containerWidth = containerWidth.asInstanceOf[js.Any], noteX = noteX.asInstanceOf[js.Any], noteY = noteY.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
        __props.updateDynamic("type")(`type`.asInstanceOf[js.Any])
        new Builder(js.Array(this.component, __props.asInstanceOf[typingsSlinky.nivoAnnotations.mod.DotAnnotationProps]))
    }
  }
  
  object RectAnnotationProps {
    @JSImport("@nivo/annotations", "Annotation")
    @js.native
    object component extends js.Object
    
    @scala.inline
    class Builder (val args: js.Array[js.Any])
      extends AnyVal
         with StBuildingComponent[tag.type, typingsSlinky.nivoAnnotations.mod.Annotation] {
      @scala.inline
      def animate(value: Boolean): this.type = set("animate", value.asInstanceOf[js.Any])
      @scala.inline
      def motionDamping(value: Double): this.type = set("motionDamping", value.asInstanceOf[js.Any])
      @scala.inline
      def motionStiffness(value: Double): this.type = set("motionStiffness", value.asInstanceOf[js.Any])
      @scala.inline
      def note(value: ReactElement): this.type = set("note", value.asInstanceOf[js.Any])
      @scala.inline
      def noteTextOffset(value: Double): this.type = set("noteTextOffset", value.asInstanceOf[js.Any])
      @scala.inline
      def noteWidth(value: Double): this.type = set("noteWidth", value.asInstanceOf[js.Any])
    }
    
    def withProps(p: typingsSlinky.nivoAnnotations.mod.RectAnnotationProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
    @scala.inline
    def apply(
      containerHeight: Double,
      containerWidth: Double,
      height: Double,
      noteX: NoteCoordinate,
      noteY: NoteCoordinate,
      `type`: rect,
      width: Double,
      x: Double,
      y: Double
    ): Builder = {
        val __props = js.Dynamic.literal(containerHeight = containerHeight.asInstanceOf[js.Any], containerWidth = containerWidth.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], noteX = noteX.asInstanceOf[js.Any], noteY = noteY.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
        __props.updateDynamic("type")(`type`.asInstanceOf[js.Any])
        new Builder(js.Array(this.component, __props.asInstanceOf[typingsSlinky.nivoAnnotations.mod.RectAnnotationProps]))
    }
  }
  
}

