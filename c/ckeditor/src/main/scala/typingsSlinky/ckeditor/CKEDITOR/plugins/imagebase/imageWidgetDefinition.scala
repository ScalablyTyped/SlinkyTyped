package typingsSlinky.ckeditor.CKEDITOR.plugins.imagebase

import typingsSlinky.ckeditor.CKEDITOR.plugins.widget.definition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait imageWidgetDefinition extends definition {
  var features: js.Array[String] = js.native
  @JSName("upcast")
  var upcast_imageWidgetDefinition: String = js.native
}

object imageWidgetDefinition {
  @scala.inline
  def apply(features: js.Array[String], upcast: String): imageWidgetDefinition = {
    val __obj = js.Dynamic.literal(features = features.asInstanceOf[js.Any], upcast = upcast.asInstanceOf[js.Any])
    __obj.asInstanceOf[imageWidgetDefinition]
  }
  @scala.inline
  implicit class imageWidgetDefinitionOps[Self <: imageWidgetDefinition] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFeatures(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("features")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUpcast(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("upcast")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

