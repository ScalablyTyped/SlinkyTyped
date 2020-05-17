package typingsSlinky.chartjsPluginAnnotation.mod

import org.scalablytyped.runtime.Instantiable0
import typingsSlinky.chartjsPluginAnnotation.anon.Box
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnnotationStatic extends js.Object {
  var Element: Instantiable0[AnnotationElement] = js.native
  var defaults: AnnotationConfig = js.native
  var drawTimeOptions: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof DrawTimeOptions */ js.Any = js.native
  var labelDefaults: LineAnnotationLabel = js.native
  var types: Box = js.native
}

object AnnotationStatic {
  @scala.inline
  def apply(
    Element: Instantiable0[AnnotationElement],
    defaults: AnnotationConfig,
    drawTimeOptions: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof DrawTimeOptions */ js.Any,
    labelDefaults: LineAnnotationLabel,
    types: Box
  ): AnnotationStatic = {
    val __obj = js.Dynamic.literal(Element = Element.asInstanceOf[js.Any], defaults = defaults.asInstanceOf[js.Any], drawTimeOptions = drawTimeOptions.asInstanceOf[js.Any], labelDefaults = labelDefaults.asInstanceOf[js.Any], types = types.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnnotationStatic]
  }
  @scala.inline
  implicit class AnnotationStaticOps[Self <: AnnotationStatic] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withElement(value: Instantiable0[AnnotationElement]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Element")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDefaults(value: AnnotationConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaults")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDrawTimeOptions(
      value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof DrawTimeOptions */ js.Any
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drawTimeOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLabelDefaults(value: LineAnnotationLabel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelDefaults")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTypes(value: Box): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("types")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

