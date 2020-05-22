package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Actionsdescription extends js.Object {
  var actions: Type
  @JSName("actions[].description")
  var `actions[]Dotdescription`: Required
  @JSName("actions[].identifier")
  var `actions[]Dotidentifier`: Required
  @JSName("actions[].label")
  var `actions[]Dotlabel`: Required
  var check_run_id: Required
  var completed_at: Type
  var conclusion: Enum
  var details_url: Type
  var external_id: Type
  var name: Type
  var output: Type
  @JSName("output.annotations")
  var outputDotannotations: Type
  @JSName("output.annotations[].annotation_level")
  var `outputDotannotations[]Dotannotation_level`: EnumRequired
  @JSName("output.annotations[].end_column")
  var `outputDotannotations[]Dotend_column`: Type
  @JSName("output.annotations[].end_line")
  var `outputDotannotations[]Dotend_line`: Required
  @JSName("output.annotations[].message")
  var `outputDotannotations[]Dotmessage`: Required
  @JSName("output.annotations[].path")
  var `outputDotannotations[]Dotpath`: Required
  @JSName("output.annotations[].raw_details")
  var `outputDotannotations[]Dotraw_details`: Type
  @JSName("output.annotations[].start_column")
  var `outputDotannotations[]Dotstart_column`: Type
  @JSName("output.annotations[].start_line")
  var `outputDotannotations[]Dotstart_line`: Required
  @JSName("output.annotations[].title")
  var `outputDotannotations[]Dottitle`: Type
  @JSName("output.images")
  var outputDotimages: Type
  @JSName("output.images[].alt")
  var `outputDotimages[]Dotalt`: Required
  @JSName("output.images[].caption")
  var `outputDotimages[]Dotcaption`: Type
  @JSName("output.images[].image_url")
  var `outputDotimages[]Dotimage_url`: Required
  @JSName("output.summary")
  var outputDotsummary: Required
  @JSName("output.text")
  var outputDottext: Type
  @JSName("output.title")
  var outputDottitle: Type
  var owner: Required
  var repo: Required
  var started_at: Type
  var status: Enum
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
}

