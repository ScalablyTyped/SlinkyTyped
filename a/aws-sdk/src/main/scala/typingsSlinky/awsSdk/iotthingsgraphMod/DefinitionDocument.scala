package typingsSlinky.awsSdk.iotthingsgraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DefinitionDocument extends js.Object {
  /**
    * The language used to define the entity. GRAPHQL is the only valid value.
    */
  var language: DefinitionLanguage = js.native
  /**
    * The GraphQL text that defines the entity.
    */
  var text: DefinitionText = js.native
}

object DefinitionDocument {
  @scala.inline
  def apply(language: DefinitionLanguage, text: DefinitionText): DefinitionDocument = {
    val __obj = js.Dynamic.literal(language = language.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefinitionDocument]
  }
  @scala.inline
  implicit class DefinitionDocumentOps[Self <: DefinitionDocument] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLanguage(value: DefinitionLanguage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("language")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withText(value: DefinitionText): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

