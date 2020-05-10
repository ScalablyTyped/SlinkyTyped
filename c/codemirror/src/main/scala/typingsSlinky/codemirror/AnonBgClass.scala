package typingsSlinky.codemirror

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonBgClass extends js.Object {
  var bgClass: String = js.native
  /** Object mapping gutter IDs to marker elements. */
  var gutterMarkers: js.Any = js.native
  var handle: js.Any = js.native
  var line: js.Any = js.native
  var text: String = js.native
  var textClass: String = js.native
  /** Array of line widgets attached to this line. */
  var widgets: js.Any = js.native
  var wrapClass: String = js.native
}

object AnonBgClass {
  @scala.inline
  def apply(
    bgClass: String,
    gutterMarkers: js.Any,
    handle: js.Any,
    line: js.Any,
    text: String,
    textClass: String,
    widgets: js.Any,
    wrapClass: String
  ): AnonBgClass = {
    val __obj = js.Dynamic.literal(bgClass = bgClass.asInstanceOf[js.Any], gutterMarkers = gutterMarkers.asInstanceOf[js.Any], handle = handle.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], textClass = textClass.asInstanceOf[js.Any], widgets = widgets.asInstanceOf[js.Any], wrapClass = wrapClass.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBgClass]
  }
  @scala.inline
  implicit class AnonBgClassOps[Self <: AnonBgClass] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBgClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bgClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGutterMarkers(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gutterMarkers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHandle(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLine(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("line")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTextClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWidgets(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("widgets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWrapClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrapClass")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

