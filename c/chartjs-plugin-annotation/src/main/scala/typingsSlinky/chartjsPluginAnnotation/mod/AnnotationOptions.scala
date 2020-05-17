package typingsSlinky.chartjsPluginAnnotation.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.chartjsPluginAnnotation.mod.LineAnnotationOptions
  - typingsSlinky.chartjsPluginAnnotation.mod.BoxAnnotationOptions
*/
trait AnnotationOptions extends js.Object

object AnnotationOptions {
  @scala.inline
  implicit def apply(value: BoxAnnotationOptions): AnnotationOptions = value.asInstanceOf[AnnotationOptions]
  @scala.inline
  implicit def apply(value: LineAnnotationOptions): AnnotationOptions = value.asInstanceOf[AnnotationOptions]
}

