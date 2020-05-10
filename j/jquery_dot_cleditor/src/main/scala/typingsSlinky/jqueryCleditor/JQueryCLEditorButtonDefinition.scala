package typingsSlinky.jqueryCleditor

import typingsSlinky.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQueryCLEditorButtonDefinition extends js.Object {
  var buttonClick: js.UndefOr[
    js.Function2[/* event */ Event_, /* data */ JQueryCLEditorButtonDefinitionEventData, Boolean]
  ] = js.native
  var command: js.UndefOr[String] = js.native
  var css: js.UndefOr[js.Any] = js.native
  var getEnabled: js.UndefOr[js.Function1[/* data */ JQueryCLEditorButtonDefinitionEventData, Boolean]] = js.native
  var getPressed: js.UndefOr[js.Function1[/* data */ JQueryCLEditorButtonDefinitionEventData, Boolean]] = js.native
  var image: js.UndefOr[String] = js.native
  var name: String = js.native
  var popupClick: js.UndefOr[
    js.Function2[/* event */ Event_, /* data */ JQueryCLEditorButtonDefinitionEventData, Boolean]
  ] = js.native
  var popupContent: js.UndefOr[String] = js.native
  var popupName: js.UndefOr[String] = js.native
  var stripIndex: js.UndefOr[Double] = js.native
  var title: String = js.native
}

object JQueryCLEditorButtonDefinition {
  @scala.inline
  def apply(name: String, title: String): JQueryCLEditorButtonDefinition = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[JQueryCLEditorButtonDefinition]
  }
  @scala.inline
  implicit class JQueryCLEditorButtonDefinitionOps[Self <: JQueryCLEditorButtonDefinition] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withButtonClick(value: (/* event */ Event_, /* data */ JQueryCLEditorButtonDefinitionEventData) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonClick")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutButtonClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonClick")(js.undefined)
        ret
    }
    @scala.inline
    def withCommand(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("command")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCommand: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("command")(js.undefined)
        ret
    }
    @scala.inline
    def withCss(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("css")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCss: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("css")(js.undefined)
        ret
    }
    @scala.inline
    def withGetEnabled(value: /* data */ JQueryCLEditorButtonDefinitionEventData => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getEnabled")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutGetEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withGetPressed(value: /* data */ JQueryCLEditorButtonDefinitionEventData => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPressed")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutGetPressed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPressed")(js.undefined)
        ret
    }
    @scala.inline
    def withImage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("image")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("image")(js.undefined)
        ret
    }
    @scala.inline
    def withPopupClick(value: (/* event */ Event_, /* data */ JQueryCLEditorButtonDefinitionEventData) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("popupClick")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutPopupClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("popupClick")(js.undefined)
        ret
    }
    @scala.inline
    def withPopupContent(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("popupContent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPopupContent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("popupContent")(js.undefined)
        ret
    }
    @scala.inline
    def withPopupName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("popupName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPopupName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("popupName")(js.undefined)
        ret
    }
    @scala.inline
    def withStripIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stripIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStripIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stripIndex")(js.undefined)
        ret
    }
  }
  
}

