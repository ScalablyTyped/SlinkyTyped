package typingsSlinky.kendoUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GanttMessagesEditor extends js.Object {
  var assignButton: js.UndefOr[String] = js.native
  var editorTitle: js.UndefOr[String] = js.native
  var end: js.UndefOr[String] = js.native
  var percentComplete: js.UndefOr[String] = js.native
  var resources: js.UndefOr[String] = js.native
  var resourcesEditorTitle: js.UndefOr[String] = js.native
  var resourcesHeader: js.UndefOr[String] = js.native
  var start: js.UndefOr[String] = js.native
  var title: js.UndefOr[String] = js.native
  var unitsHeader: js.UndefOr[String] = js.native
}

object GanttMessagesEditor {
  @scala.inline
  def apply(): GanttMessagesEditor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GanttMessagesEditor]
  }
  @scala.inline
  implicit class GanttMessagesEditorOps[Self <: GanttMessagesEditor] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAssignButton(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("assignButton")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAssignButton: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("assignButton")(js.undefined)
        ret
    }
    @scala.inline
    def withEditorTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editorTitle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEditorTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editorTitle")(js.undefined)
        ret
    }
    @scala.inline
    def withEnd(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("end")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("end")(js.undefined)
        ret
    }
    @scala.inline
    def withPercentComplete(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("percentComplete")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPercentComplete: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("percentComplete")(js.undefined)
        ret
    }
    @scala.inline
    def withResources(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resources")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResources: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resources")(js.undefined)
        ret
    }
    @scala.inline
    def withResourcesEditorTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourcesEditorTitle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResourcesEditorTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourcesEditorTitle")(js.undefined)
        ret
    }
    @scala.inline
    def withResourcesHeader(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourcesHeader")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResourcesHeader: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourcesHeader")(js.undefined)
        ret
    }
    @scala.inline
    def withStart(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start")(js.undefined)
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(js.undefined)
        ret
    }
    @scala.inline
    def withUnitsHeader(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unitsHeader")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnitsHeader: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unitsHeader")(js.undefined)
        ret
    }
  }
  
}

