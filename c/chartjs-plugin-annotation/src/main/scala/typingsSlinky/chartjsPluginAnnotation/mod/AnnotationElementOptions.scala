package typingsSlinky.chartjsPluginAnnotation.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnnotationElementOptions[T /* <: AnnotationOptions */] extends js.Object {
  var chartInstance: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Chart */ js.Any = js.native
  var id: String = js.native
  var options: T = js.native
}

object AnnotationElementOptions {
  @scala.inline
  def apply[T](
    chartInstance: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Chart */ js.Any,
    id: String,
    options: T
  ): AnnotationElementOptions[T] = {
    val __obj = js.Dynamic.literal(chartInstance = chartInstance.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnnotationElementOptions[T]]
  }
  @scala.inline
  implicit class AnnotationElementOptionsOps[Self[t] <: AnnotationElementOptions[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withChartInstance(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Chart */ js.Any
    ): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chartInstance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOptions(value: T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

