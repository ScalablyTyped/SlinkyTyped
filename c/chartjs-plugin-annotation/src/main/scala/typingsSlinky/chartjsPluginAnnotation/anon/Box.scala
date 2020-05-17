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

@js.native
trait Box extends js.Object {
  var box: Instantiable1[/* options */ AnnotationElementOptions[BoxAnnotationOptions], BoxAnnotation] = js.native
  var line: Instantiable1[/* options */ AnnotationElementOptions[LineAnnotationOptions], LineAnnotation] = js.native
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
  @scala.inline
  implicit class BoxOps[Self <: Box] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBox(value: Instantiable1[/* options */ AnnotationElementOptions[BoxAnnotationOptions], BoxAnnotation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("box")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLine(
      value: Instantiable1[/* options */ AnnotationElementOptions[LineAnnotationOptions], LineAnnotation]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("line")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

