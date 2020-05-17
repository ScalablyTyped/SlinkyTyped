package typingsSlinky.appleMapkitJs.mapkit

import typingsSlinky.appleMapkitJs.anon.AnnotationAnnotation
import typingsSlinky.appleMapkitJs.anon.Code
import typingsSlinky.appleMapkitJs.anon.Timestamp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// prettier-ignore
@js.native
trait MapEvents[T] extends js.Object {
  var deselect: EventBase[T] with typingsSlinky.appleMapkitJs.anon.Annotation = js.native
  var `double-tap`: EventBase[T] = js.native
  var `drag-end`: EventBase[T] with AnnotationAnnotation = js.native
  var `drag-start`: EventBase[T] with AnnotationAnnotation = js.native
  var dragging: EventBase[T] with typingsSlinky.appleMapkitJs.anon.Coordinate = js.native
  var `long-press`: EventBase[T] = js.native
  var `map-type-change`: EventBase[T] = js.native
  var `region-change-end`: EventBase[T] = js.native
  var `region-change-start`: EventBase[T] = js.native
  var `scroll-end`: EventBase[T] = js.native
  var `scroll-start`: EventBase[T] = js.native
  // Annotation Events
  var select: EventBase[T] with typingsSlinky.appleMapkitJs.anon.Annotation = js.native
  var `single-tap`: EventBase[T] = js.native
  // User Location Events
  var `user-location-change`: EventBase[T] with Timestamp = js.native
  var `user-location-error`: EventBase[T] with Code = js.native
  var `zoom-end`: EventBase[T] = js.native
  var `zoom-start`: EventBase[T] = js.native
}

object MapEvents {
  @scala.inline
  def apply[T](
    deselect: EventBase[T] with typingsSlinky.appleMapkitJs.anon.Annotation,
    `double-tap`: EventBase[T],
    `drag-end`: EventBase[T] with AnnotationAnnotation,
    `drag-start`: EventBase[T] with AnnotationAnnotation,
    dragging: EventBase[T] with typingsSlinky.appleMapkitJs.anon.Coordinate,
    `long-press`: EventBase[T],
    `map-type-change`: EventBase[T],
    `region-change-end`: EventBase[T],
    `region-change-start`: EventBase[T],
    `scroll-end`: EventBase[T],
    `scroll-start`: EventBase[T],
    select: EventBase[T] with typingsSlinky.appleMapkitJs.anon.Annotation,
    `single-tap`: EventBase[T],
    `user-location-change`: EventBase[T] with Timestamp,
    `user-location-error`: EventBase[T] with Code,
    `zoom-end`: EventBase[T],
    `zoom-start`: EventBase[T]
  ): MapEvents[T] = {
    val __obj = js.Dynamic.literal(deselect = deselect.asInstanceOf[js.Any], dragging = dragging.asInstanceOf[js.Any], select = select.asInstanceOf[js.Any])
    __obj.updateDynamic("double-tap")(`double-tap`.asInstanceOf[js.Any])
    __obj.updateDynamic("drag-end")(`drag-end`.asInstanceOf[js.Any])
    __obj.updateDynamic("drag-start")(`drag-start`.asInstanceOf[js.Any])
    __obj.updateDynamic("long-press")(`long-press`.asInstanceOf[js.Any])
    __obj.updateDynamic("map-type-change")(`map-type-change`.asInstanceOf[js.Any])
    __obj.updateDynamic("region-change-end")(`region-change-end`.asInstanceOf[js.Any])
    __obj.updateDynamic("region-change-start")(`region-change-start`.asInstanceOf[js.Any])
    __obj.updateDynamic("scroll-end")(`scroll-end`.asInstanceOf[js.Any])
    __obj.updateDynamic("scroll-start")(`scroll-start`.asInstanceOf[js.Any])
    __obj.updateDynamic("single-tap")(`single-tap`.asInstanceOf[js.Any])
    __obj.updateDynamic("user-location-change")(`user-location-change`.asInstanceOf[js.Any])
    __obj.updateDynamic("user-location-error")(`user-location-error`.asInstanceOf[js.Any])
    __obj.updateDynamic("zoom-end")(`zoom-end`.asInstanceOf[js.Any])
    __obj.updateDynamic("zoom-start")(`zoom-start`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapEvents[T]]
  }
  @scala.inline
  implicit class MapEventsOps[Self[t] <: MapEvents[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withDeselect(value: EventBase[T] with typingsSlinky.appleMapkitJs.anon.Annotation): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deselect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withDouble-tap`(value: EventBase[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("double-tap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withDrag-end`(value: EventBase[T] with AnnotationAnnotation): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drag-end")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withDrag-start`(value: EventBase[T] with AnnotationAnnotation): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drag-start")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDragging(value: EventBase[T] with typingsSlinky.appleMapkitJs.anon.Coordinate): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragging")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withLong-press`(value: EventBase[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("long-press")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withMap-type-change`(value: EventBase[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("map-type-change")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withRegion-change-end`(value: EventBase[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("region-change-end")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withRegion-change-start`(value: EventBase[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("region-change-start")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withScroll-end`(value: EventBase[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scroll-end")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withScroll-start`(value: EventBase[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scroll-start")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelect(value: EventBase[T] with typingsSlinky.appleMapkitJs.anon.Annotation): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("select")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withSingle-tap`(value: EventBase[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("single-tap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withUser-location-change`(value: EventBase[T] with Timestamp): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("user-location-change")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withUser-location-error`(value: EventBase[T] with Code): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("user-location-error")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withZoom-end`(value: EventBase[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoom-end")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withZoom-start`(value: EventBase[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoom-start")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

