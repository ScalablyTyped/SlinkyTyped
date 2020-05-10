package typingsSlinky.chartjsPluginAnnotation.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnnotationConfig extends js.Object {
  var annotations: js.Array[AnnotationOptions] = js.native
  var dblClickSpeed: js.UndefOr[Double] = js.native
  var drawTime: js.UndefOr[
    /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof DrawTimeOptions * / any */ String
  ] = js.native
  var events: js.UndefOr[js.Array[String]] = js.native
}

object AnnotationConfig {
  @scala.inline
  def apply(annotations: js.Array[AnnotationOptions]): AnnotationConfig = {
    val __obj = js.Dynamic.literal(annotations = annotations.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnnotationConfig]
  }
  @scala.inline
  implicit class AnnotationConfigOps[Self <: AnnotationConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnnotations(value: js.Array[AnnotationOptions]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("annotations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDblClickSpeed(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dblClickSpeed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDblClickSpeed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dblClickSpeed")(js.undefined)
        ret
    }
    @scala.inline
    def withDrawTime(
      value: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof DrawTimeOptions * / any */ String
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drawTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDrawTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drawTime")(js.undefined)
        ret
    }
    @scala.inline
    def withEvents(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("events")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEvents: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("events")(js.undefined)
        ret
    }
  }
  
}

