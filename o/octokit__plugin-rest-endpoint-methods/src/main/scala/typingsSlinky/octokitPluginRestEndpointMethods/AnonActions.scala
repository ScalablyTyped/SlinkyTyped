package typingsSlinky.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonActions extends js.Object {
  var actions: AnonType = js.native
  @JSName("actions[].description")
  var `actions[]Dotdescription`: AnonRequired = js.native
  @JSName("actions[].identifier")
  var `actions[]Dotidentifier`: AnonRequired = js.native
  @JSName("actions[].label")
  var `actions[]Dotlabel`: AnonRequired = js.native
  var completed_at: AnonType = js.native
  var conclusion: AnonEnum = js.native
  var details_url: AnonType = js.native
  var external_id: AnonType = js.native
  var head_sha: AnonRequired = js.native
  var name: AnonRequired = js.native
  var output: AnonType = js.native
  @JSName("output.annotations")
  var outputDotannotations: AnonType = js.native
  @JSName("output.annotations[].annotation_level")
  var `outputDotannotations[]Dotannotation_level`: AnonEnumRequired = js.native
  @JSName("output.annotations[].end_column")
  var `outputDotannotations[]Dotend_column`: AnonType = js.native
  @JSName("output.annotations[].end_line")
  var `outputDotannotations[]Dotend_line`: AnonRequired = js.native
  @JSName("output.annotations[].message")
  var `outputDotannotations[]Dotmessage`: AnonRequired = js.native
  @JSName("output.annotations[].path")
  var `outputDotannotations[]Dotpath`: AnonRequired = js.native
  @JSName("output.annotations[].raw_details")
  var `outputDotannotations[]Dotraw_details`: AnonType = js.native
  @JSName("output.annotations[].start_column")
  var `outputDotannotations[]Dotstart_column`: AnonType = js.native
  @JSName("output.annotations[].start_line")
  var `outputDotannotations[]Dotstart_line`: AnonRequired = js.native
  @JSName("output.annotations[].title")
  var `outputDotannotations[]Dottitle`: AnonType = js.native
  @JSName("output.images")
  var outputDotimages: AnonType = js.native
  @JSName("output.images[].alt")
  var `outputDotimages[]Dotalt`: AnonRequired = js.native
  @JSName("output.images[].caption")
  var `outputDotimages[]Dotcaption`: AnonType = js.native
  @JSName("output.images[].image_url")
  var `outputDotimages[]Dotimage_url`: AnonRequired = js.native
  @JSName("output.summary")
  var outputDotsummary: AnonRequired = js.native
  @JSName("output.text")
  var outputDottext: AnonType = js.native
  @JSName("output.title")
  var outputDottitle: AnonRequired = js.native
  var owner: AnonRequired = js.native
  var repo: AnonRequired = js.native
  var started_at: AnonType = js.native
  var status: AnonEnum = js.native
}

object AnonActions {
  @scala.inline
  def apply(
    actions: AnonType,
    `actions[]Dotdescription`: AnonRequired,
    `actions[]Dotidentifier`: AnonRequired,
    `actions[]Dotlabel`: AnonRequired,
    completed_at: AnonType,
    conclusion: AnonEnum,
    details_url: AnonType,
    external_id: AnonType,
    head_sha: AnonRequired,
    name: AnonRequired,
    output: AnonType,
    outputDotannotations: AnonType,
    `outputDotannotations[]Dotannotation_level`: AnonEnumRequired,
    `outputDotannotations[]Dotend_column`: AnonType,
    `outputDotannotations[]Dotend_line`: AnonRequired,
    `outputDotannotations[]Dotmessage`: AnonRequired,
    `outputDotannotations[]Dotpath`: AnonRequired,
    `outputDotannotations[]Dotraw_details`: AnonType,
    `outputDotannotations[]Dotstart_column`: AnonType,
    `outputDotannotations[]Dotstart_line`: AnonRequired,
    `outputDotannotations[]Dottitle`: AnonType,
    outputDotimages: AnonType,
    `outputDotimages[]Dotalt`: AnonRequired,
    `outputDotimages[]Dotcaption`: AnonType,
    `outputDotimages[]Dotimage_url`: AnonRequired,
    outputDotsummary: AnonRequired,
    outputDottext: AnonType,
    outputDottitle: AnonRequired,
    owner: AnonRequired,
    repo: AnonRequired,
    started_at: AnonType,
    status: AnonEnum
  ): AnonActions = {
    val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any], completed_at = completed_at.asInstanceOf[js.Any], conclusion = conclusion.asInstanceOf[js.Any], details_url = details_url.asInstanceOf[js.Any], external_id = external_id.asInstanceOf[js.Any], head_sha = head_sha.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], output = output.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any], started_at = started_at.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
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
    __obj.asInstanceOf[AnonActions]
  }
  @scala.inline
  implicit class AnonActionsOps[Self <: AnonActions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActions(value: AnonType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withActions[]Dotdescription`(value: AnonRequired): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actions[].description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withActions[]Dotidentifier`(value: AnonRequired): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actions[].identifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withActions[]Dotlabel`(value: AnonRequired): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actions[].label")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCompleted_at(value: AnonType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("completed_at")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConclusion(value: AnonEnum): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("conclusion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDetails_url(value: AnonType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("details_url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExternal_id(value: AnonType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("external_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHead_sha(value: AnonRequired): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("head_sha")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: AnonRequired): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOutput(value: AnonType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("output")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOutputDotannotations(value: AnonType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("output.annotations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withOutputDotannotations[]Dotannotation_level`(value: AnonEnumRequired): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("output.annotations[].annotation_level")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withOutputDotannotations[]Dotend_column`(value: AnonType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("output.annotations[].end_column")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withOutputDotannotations[]Dotend_line`(value: AnonRequired): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("output.annotations[].end_line")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withOutputDotannotations[]Dotmessage`(value: AnonRequired): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("output.annotations[].message")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withOutputDotannotations[]Dotpath`(value: AnonRequired): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("output.annotations[].path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withOutputDotannotations[]Dotraw_details`(value: AnonType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("output.annotations[].raw_details")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withOutputDotannotations[]Dotstart_column`(value: AnonType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("output.annotations[].start_column")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withOutputDotannotations[]Dotstart_line`(value: AnonRequired): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("output.annotations[].start_line")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withOutputDotannotations[]Dottitle`(value: AnonType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("output.annotations[].title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOutputDotimages(value: AnonType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("output.images")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withOutputDotimages[]Dotalt`(value: AnonRequired): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("output.images[].alt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withOutputDotimages[]Dotcaption`(value: AnonType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("output.images[].caption")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withOutputDotimages[]Dotimage_url`(value: AnonRequired): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("output.images[].image_url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOutputDotsummary(value: AnonRequired): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("output.summary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOutputDottext(value: AnonType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("output.text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOutputDottitle(value: AnonRequired): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("output.title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOwner(value: AnonRequired): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("owner")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRepo(value: AnonRequired): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStarted_at(value: AnonType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("started_at")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatus(value: AnonEnum): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

