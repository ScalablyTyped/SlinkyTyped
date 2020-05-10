package typingsSlinky.googleapis.dialogflowV2Mod.dialogflowV2

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Events allow for matching intents by event name instead of the natural
  * language input. For instance, input `&lt;event: { name:
  * &quot;welcome_event&quot;, parameters: { name: &quot;Sam&quot; } }&gt;` can
  * trigger a personalized welcome response. The parameter `name` may be used
  * by the agent in the response: `&quot;Hello #welcome_event.name! What can I
  * do for you today?&quot;`.
  */
@js.native
trait SchemaGoogleCloudDialogflowV2EventInput extends js.Object {
  /**
    * Required. The language of this query. See [Language
    * Support](https://cloud.google.com/dialogflow-enterprise/docs/reference/language)
    * for a list of the currently supported language codes. Note that queries
    * in the same session do not necessarily need to specify the same language.
    */
  var languageCode: js.UndefOr[String] = js.native
  /**
    * Required. The unique identifier of the event.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Optional. The collection of parameters associated with the event.
    */
  var parameters: js.UndefOr[StringDictionary[js.Any]] = js.native
}

object SchemaGoogleCloudDialogflowV2EventInput {
  @scala.inline
  def apply(): SchemaGoogleCloudDialogflowV2EventInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2EventInput]
  }
  @scala.inline
  implicit class SchemaGoogleCloudDialogflowV2EventInputOps[Self <: SchemaGoogleCloudDialogflowV2EventInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLanguageCode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("languageCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLanguageCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("languageCode")(js.undefined)
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
    def withParameters(value: StringDictionary[js.Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parameters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParameters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parameters")(js.undefined)
        ret
    }
  }
  
}

