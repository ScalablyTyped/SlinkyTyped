package typingsSlinky.googleapis.languageV1Mod.languageV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a mention for an entity in the text. Currently, proper noun
  * mentions are supported.
  */
@js.native
trait SchemaEntityMention extends js.Object {
  /**
    * For calls to AnalyzeEntitySentiment or if
    * AnnotateTextRequest.Features.extract_entity_sentiment is set to true,
    * this field will contain the sentiment expressed for this mention of the
    * entity in the provided document.
    */
  var sentiment: js.UndefOr[SchemaSentiment] = js.native
  /**
    * The mention text.
    */
  var text: js.UndefOr[SchemaTextSpan] = js.native
  /**
    * The type of the entity mention.
    */
  var `type`: js.UndefOr[String] = js.native
}

object SchemaEntityMention {
  @scala.inline
  def apply(): SchemaEntityMention = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaEntityMention]
  }
  @scala.inline
  implicit class SchemaEntityMentionOps[Self <: SchemaEntityMention] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSentiment(value: SchemaSentiment): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sentiment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSentiment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sentiment")(js.undefined)
        ret
    }
    @scala.inline
    def withText(value: SchemaTextSpan): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
  }
  
}

