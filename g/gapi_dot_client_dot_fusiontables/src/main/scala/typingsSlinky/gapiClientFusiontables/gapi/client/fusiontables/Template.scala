package typingsSlinky.gapiClientFusiontables.gapi.client.fusiontables

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Template extends js.Object {
  /** List of columns from which the template is to be automatically constructed. Only one of body or automaticColumns can be specified. */
  var automaticColumnNames: js.UndefOr[js.Array[String]] = js.native
  /**
    * Body of the template. It contains HTML with {column_name} to insert values from a particular column. The body is sanitized to remove certain tags,
    * e.g., script. Only one of body or automaticColumns can be specified.
    */
  var body: js.UndefOr[String] = js.native
  /** The kind of item this is. For a template, this is always fusiontables#template. */
  var kind: js.UndefOr[String] = js.native
  /** Optional name assigned to a template. */
  var name: js.UndefOr[String] = js.native
  /** Identifier for the table for which the template is defined. */
  var tableId: js.UndefOr[String] = js.native
  /** Identifier for the template, unique within the context of a particular table. */
  var templateId: js.UndefOr[Double] = js.native
}

object Template {
  @scala.inline
  def apply(): Template = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Template]
  }
  @scala.inline
  implicit class TemplateOps[Self <: Template] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutomaticColumnNames(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("automaticColumnNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutomaticColumnNames: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("automaticColumnNames")(js.undefined)
        ret
    }
    @scala.inline
    def withBody(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("body")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBody: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("body")(js.undefined)
        ret
    }
    @scala.inline
    def withKind(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKind: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withTableId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tableId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTableId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tableId")(js.undefined)
        ret
    }
    @scala.inline
    def withTemplateId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("templateId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTemplateId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("templateId")(js.undefined)
        ret
    }
  }
  
}

