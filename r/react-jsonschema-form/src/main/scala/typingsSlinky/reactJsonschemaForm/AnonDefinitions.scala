package typingsSlinky.reactJsonschemaForm

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.reactJsonschemaForm.mod.Field
import typingsSlinky.reactJsonschemaForm.mod.Widget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDefinitions extends js.Object {
  var definitions: StringDictionary[js.Any] = js.native
  var fields: StringDictionary[Field] = js.native
  var formContext: js.Any = js.native
  var widgets: StringDictionary[Widget] = js.native
}

object AnonDefinitions {
  @scala.inline
  def apply(
    definitions: StringDictionary[js.Any],
    fields: StringDictionary[Field],
    formContext: js.Any,
    widgets: StringDictionary[Widget]
  ): AnonDefinitions = {
    val __obj = js.Dynamic.literal(definitions = definitions.asInstanceOf[js.Any], fields = fields.asInstanceOf[js.Any], formContext = formContext.asInstanceOf[js.Any], widgets = widgets.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDefinitions]
  }
  @scala.inline
  implicit class AnonDefinitionsOps[Self <: AnonDefinitions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDefinitions(value: StringDictionary[js.Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("definitions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFields(value: StringDictionary[Field]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fields")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFormContext(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formContext")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWidgets(value: StringDictionary[Widget]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("widgets")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

