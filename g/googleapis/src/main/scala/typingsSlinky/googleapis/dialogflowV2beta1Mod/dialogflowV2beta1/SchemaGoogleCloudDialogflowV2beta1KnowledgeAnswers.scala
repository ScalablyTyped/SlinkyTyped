package typingsSlinky.googleapis.dialogflowV2beta1Mod.dialogflowV2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the result of querying a Knowledge base.
  */
@js.native
trait SchemaGoogleCloudDialogflowV2beta1KnowledgeAnswers extends js.Object {
  /**
    * A list of answers from Knowledge Connector.
    */
  var answers: js.UndefOr[js.Array[SchemaGoogleCloudDialogflowV2beta1KnowledgeAnswersAnswer]] = js.native
}

object SchemaGoogleCloudDialogflowV2beta1KnowledgeAnswers {
  @scala.inline
  def apply(): SchemaGoogleCloudDialogflowV2beta1KnowledgeAnswers = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2beta1KnowledgeAnswers]
  }
  @scala.inline
  implicit class SchemaGoogleCloudDialogflowV2beta1KnowledgeAnswersOps[Self <: SchemaGoogleCloudDialogflowV2beta1KnowledgeAnswers] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnswers(value: js.Array[SchemaGoogleCloudDialogflowV2beta1KnowledgeAnswersAnswer]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("answers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnswers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("answers")(js.undefined)
        ret
    }
  }
  
}

