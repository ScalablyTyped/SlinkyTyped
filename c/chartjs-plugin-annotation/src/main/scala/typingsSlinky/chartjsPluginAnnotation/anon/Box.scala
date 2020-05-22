package typingsSlinky.chartjsPluginAnnotation.anon

import org.scalablytyped.runtime.Instantiable1
import typingsSlinky.chartjsPluginAnnotation.mod.AnnotationElementOptions
import typingsSlinky.chartjsPluginAnnotation.mod.BoxAnnotation
import typingsSlinky.chartjsPluginAnnotation.mod.BoxAnnotationOptions
import typingsSlinky.chartjsPluginAnnotation.mod.LineAnnotation
import typingsSlinky.chartjsPluginAnnotation.mod.LineAnnotationOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Box extends js.Object {
  var box: Instantiable1[/* options */ AnnotationElementOptions[BoxAnnotationOptions], BoxAnnotation]
  var line: Instantiable1[/* options */ AnnotationElementOptions[LineAnnotationOptions], LineAnnotation]
}

object Box {
  @scala.inline
  def apply(
    box: Instantiable1[/* options */ AnnotationElementOptions[BoxAnnotationOptions], BoxAnnotation],
    line: Instantiable1[/* options */ AnnotationElementOptions[LineAnnotationOptions], LineAnnotation]
  ): Box = {
    val __obj = js.Dynamic.literal(box = box.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any])
    __obj.asInstanceOf[Box]
  }
}

