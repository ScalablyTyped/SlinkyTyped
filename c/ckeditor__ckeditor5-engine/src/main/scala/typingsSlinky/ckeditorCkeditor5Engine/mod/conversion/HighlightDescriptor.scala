package typingsSlinky.ckeditorCkeditor5Engine.mod.conversion

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// engine/conversion/downcast-converters
@js.native
trait HighlightDescriptor extends js.Object {
  var attributes: js.Object = js.native
  var classes: String | js.Array[String] = js.native
  var id: String = js.native
  var priority: Double = js.native
}

object HighlightDescriptor {
  @scala.inline
  def apply(attributes: js.Object, classes: String | js.Array[String], id: String, priority: Double): HighlightDescriptor = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], classes = classes.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], priority = priority.asInstanceOf[js.Any])
    __obj.asInstanceOf[HighlightDescriptor]
  }
  @scala.inline
  implicit class HighlightDescriptorOps[Self <: HighlightDescriptor] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttributes(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClasses(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("classes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPriority(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("priority")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

