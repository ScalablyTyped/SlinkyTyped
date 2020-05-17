package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Actionsdescription extends js.Object {
  var actions: Type = js.native
  @JSName("actions[].description")
  var `actions[]Dotdescription`: Required = js.native
  @JSName("actions[].identifier")
  var `actions[]Dotidentifier`: Required = js.native
  @JSName("actions[].label")
  var `actions[]Dotlabel`: Required = js.native
  var check_run_id: Required = js.native
  var completed_at: Type = js.native
  var conclusion: Enum = js.native
  var details_url: Type = js.native
  var external_id: Type = js.native
  var name: Type = js.native
  var output: Type = js.native
  @JSName("output.annotations")
  var outputDotannotations: Type = js.native
  @JSName("output.annotations[].annotation_level")
  var `outputDotannotations[]Dotannotation_level`: EnumRequired = js.native
  @JSName("output.annotations[].end_column")
  var `outputDotannotations[]Dotend_column`: Type = js.native
  @JSName("output.annotations[].end_line")
  var `outputDotannotations[]Dotend_line`: Required = js.native
  @JSName("output.annotations[].message")
  var `outputDotannotations[]Dotmessage`: Required = js.native
  @JSName("output.annotations[].path")
  var `outputDotannotations[]Dotpath`: Required = js.native
  @JSName("output.annotations[].raw_details")
  var `outputDotannotations[]Dotraw_details`: Type = js.native
  @JSName("output.annotations[].start_column")
  var `outputDotannotations[]Dotstart_column`: Type = js.native
  @JSName("output.annotations[].start_line")
  var `outputDotannotations[]Dotstart_line`: Required = js.native
  @JSName("output.annotations[].title")
  var `outputDotannotations[]Dottitle`: Type = js.native
  @JSName("output.images")
  var outputDotimages: Type = js.native
  @JSName("output.images[].alt")
  var `outputDotimages[]Dotalt`: Required = js.native
  @JSName("output.images[].caption")
  var `outputDotimages[]Dotcaption`: Type = js.native
  @JSName("output.images[].image_url")
  var `outputDotimages[]Dotimage_url`: Required = js.native
  @JSName("output.summary")
  var outputDotsummary: Required = js.native
  @JSName("output.text")
  var outputDottext: Type = js.native
  @JSName("output.title")
  var outputDottitle: Type = js.native
  var owner: Required = js.native
  var repo: Required = js.native
  var started_at: Type = js.native
  var status: Enum = js.native
}

object Actionsdescription {
  @scala.inline
  def apply(
    actions: Type,
    `actions[]Dotdescription`: Required,
    `actions[]Dotidentifier`: Required,
    `actions[]Dotlabel`: Required,
    check_run_id: Required,
    completed_at: Type,
    conclusion: Enum,
    details_url: Type,
    external_id: Type,
    name: Type,
    output: Type,
    outputDotannotations: Type,
    `outputDotannotations[]Dotannotation_level`: EnumRequired,
    `outputDotannotations[]Dotend_column`: Type,
    `outputDotannotations[]Dotend_line`: Required,
    `outputDotannotations[]Dotmessage`: Required,
    `outputDotannotations[]Dotpath`: Required,
    `outputDotannotations[]Dotraw_details`: Type,
    `outputDotannotations[]Dotstart_column`: Type,
    `outputDotannotations[]Dotstart_line`: Required,
    `outputDotannotations[]Dottitle`: Type,
    outputDotimages: Type,
    `outputDotimages[]Dotalt`: Required,
    `outputDotimages[]Dotcaption`: Type,
    `outputDotimages[]Dotimage_url`: Required,
    outputDotsummary: Required,
    outputDottext: Type,
    outputDottitle: Type,
    owner: Required,
    repo: Required,
    started_at: Type,
    status: Enum
  ): Actionsdescription = {
    val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any], check_run_id = check_run_id.asInstanceOf[js.Any], completed_at = completed_at.asInstanceOf[js.Any], conclusion = conclusion.asInstanceOf[js.Any], details_url = details_url.asInstanceOf[js.Any], external_id = external_id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], output = output.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any], started_at = started_at.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.updateDynamic("actions[].description")(`actions[]Dotdescription`.asInstanceOf[js.Any])
    __obj.updateDynamic("actions[].identifier")(`actions[]Dotidentifier`.asInstanceOf[js.Any])
    __obj.updateDynamic("actions[].label")(`actions[]Dotlabel`.asInstanceOf[js.Any])
    __obj.updateDynamic("output.annotations")(outputDotannotations.asInstanceOf[js.Any])
    __obj.updateDynamic("output.annotations[].annotation_level")(`outputDotannotations[]Dotannotation_level`.asInstanceOf[js.Any])
    __obj.updateDynamic("output.annotations[].end_column")(`outputDotannotations[]Dotend_column`.asInstanceOf[js.Any])
    __obj.updateDynamic("output.annotations[].end_line")(`outputDotannotations[]Dotend_line`.asInstanceOf[js.Any])
    __obj.updateDynamic("output.annotations[].message")(`outputDotannotations[]Dotmessage`.asInstanceOf[js.Any])
    __obj.updateDynamic("output.annotations[].path")(`outputDotannotations[]Dotpath`.asInstanceOf[js.Any])
    __obj.updateDynamic("output.annotations[].raw_details")(`outputDotannotations[]Dotraw_details`.asInstanceOf[js.Any])
    __obj.updateDynamic("output.annotations[].start_column")(`outputDotannotations[]Dotstart_column`.asInstanceOf[js.Any])
    __obj.updateDynamic("output.annotations[].start_line")(`outputDotannotations[]Dotstart_line`.asInstanceOf[js.Any])
    __obj.updateDynamic("output.annotations[].title")(`outputDotannotations[]Dottitle`.asInstanceOf[js.Any])
    __obj.updateDynamic("output.images")(outputDotimages.asInstanceOf[js.Any])
    __obj.updateDynamic("output.images[].alt")(`outputDotimages[]Dotalt`.asInstanceOf[js.Any])
    __obj.updateDynamic("output.images[].caption")(`outputDotimages[]Dotcaption`.asInstanceOf[js.Any])
    __obj.updateDynamic("output.images[].image_url")(`outputDotimages[]Dotimage_url`.asInstanceOf[js.Any])
    __obj.updateDynamic("output.summary")(outputDotsummary.asInstanceOf[js.Any])
    __obj.updateDynamic("output.text")(outputDottext.asInstanceOf[js.Any])
    __obj.updateDynamic("output.title")(outputDottitle.asInstanceOf[js.Any])
    __obj.asInstanceOf[Actionsdescription]
  }
  @scala.inline
  implicit class ActionsdescriptionOps[Self <: Actionsdescription] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActions(value: Type): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withActions[]Dotdescription`(value: Required): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actions[].description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withActions[]Dotidentifier`(value: Required): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actions[].identifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withActions[]Dotlabel`(value: Required): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actions[].label")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCheck_run_id(value: Required): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("check_run_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCompleted_at(value: Type): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("completed_at")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConclusion(value: Enum): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("conclusion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDetails_url(value: Type): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("details_url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExternal_id(value: Type): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("external_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: Type): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOutput(value: Type): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("output")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOutputDotannotations(value: Type): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("output.annotations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withOutputDotannotations[]Dotannotation_level`(value: EnumRequired): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("output.annotations[].annotation_level")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withOutputDotannotations[]Dotend_column`(value: Type): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("output.annotations[].end_column")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withOutputDotannotations[]Dotend_line`(value: Required): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("output.annotations[].end_line")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withOutputDotannotations[]Dotmessage`(value: Required): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("output.annotations[].message")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withOutputDotannotations[]Dotpath`(value: Required): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("output.annotations[].path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withOutputDotannotations[]Dotraw_details`(value: Type): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("output.annotations[].raw_details")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withOutputDotannotations[]Dotstart_column`(value: Type): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("output.annotations[].start_column")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withOutputDotannotations[]Dotstart_line`(value: Required): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("output.annotations[].start_line")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withOutputDotannotations[]Dottitle`(value: Type): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("output.annotations[].title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOutputDotimages(value: Type): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("output.images")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withOutputDotimages[]Dotalt`(value: Required): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("output.images[].alt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withOutputDotimages[]Dotcaption`(value: Type): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("output.images[].caption")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withOutputDotimages[]Dotimage_url`(value: Required): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("output.images[].image_url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOutputDotsummary(value: Required): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("output.summary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOutputDottext(value: Type): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("output.text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOutputDottitle(value: Type): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("output.title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOwner(value: Required): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("owner")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRepo(value: Required): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStarted_at(value: Type): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("started_at")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatus(value: Enum): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

