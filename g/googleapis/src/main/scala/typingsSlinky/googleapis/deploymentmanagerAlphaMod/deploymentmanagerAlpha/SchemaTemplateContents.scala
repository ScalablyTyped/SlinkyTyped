package typingsSlinky.googleapis.deploymentmanagerAlphaMod.deploymentmanagerAlpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Files that make up the template contents of a template type.
  */
@js.native
trait SchemaTemplateContents extends js.Object {
  /**
    * Import files referenced by the main template.
    */
  var imports: js.UndefOr[js.Array[SchemaImportFile]] = js.native
  /**
    * Which interpreter (python or jinja) should be used during expansion.
    */
  var interpreter: js.UndefOr[String] = js.native
  /**
    * The filename of the mainTemplate
    */
  var mainTemplate: js.UndefOr[String] = js.native
  /**
    * The contents of the template schema.
    */
  var schema: js.UndefOr[String] = js.native
  /**
    * The contents of the main template file.
    */
  var template: js.UndefOr[String] = js.native
}

object SchemaTemplateContents {
  @scala.inline
  def apply(): SchemaTemplateContents = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTemplateContents]
  }
  @scala.inline
  implicit class SchemaTemplateContentsOps[Self <: SchemaTemplateContents] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withImports(value: js.Array[SchemaImportFile]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imports")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImports: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imports")(js.undefined)
        ret
    }
    @scala.inline
    def withInterpreter(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interpreter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInterpreter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interpreter")(js.undefined)
        ret
    }
    @scala.inline
    def withMainTemplate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mainTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMainTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mainTemplate")(js.undefined)
        ret
    }
    @scala.inline
    def withSchema(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("schema")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSchema: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("schema")(js.undefined)
        ret
    }
    @scala.inline
    def withTemplate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("template")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("template")(js.undefined)
        ret
    }
  }
  
}

