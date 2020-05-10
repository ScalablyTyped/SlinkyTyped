package typingsSlinky.googleapis.languageV1Mod.languageV1

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a phrase in the text that is a known entity, such as a person,
  * an organization, or location. The API associates information, such as
  * salience and mentions, with entities.
  */
@js.native
trait SchemaEntity extends js.Object {
  /**
    * The mentions of this entity in the input document. The API currently
    * supports proper noun mentions.
    */
  var mentions: js.UndefOr[js.Array[SchemaEntityMention]] = js.native
  /**
    * Metadata associated with the entity.  Currently, Wikipedia URLs and
    * Knowledge Graph MIDs are provided, if available. The associated keys are
    * &quot;wikipedia_url&quot; and &quot;mid&quot;, respectively.
    */
  var metadata: js.UndefOr[StringDictionary[String]] = js.native
  /**
    * The representative name for the entity.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The salience score associated with the entity in the [0, 1.0] range.  The
    * salience score for an entity provides information about the importance or
    * centrality of that entity to the entire document text. Scores closer to 0
    * are less salient, while scores closer to 1.0 are highly salient.
    */
  var salience: js.UndefOr[Double] = js.native
  /**
    * For calls to AnalyzeEntitySentiment or if
    * AnnotateTextRequest.Features.extract_entity_sentiment is set to true,
    * this field will contain the aggregate sentiment expressed for this entity
    * in the provided document.
    */
  var sentiment: js.UndefOr[SchemaSentiment] = js.native
  /**
    * The entity type.
    */
  var `type`: js.UndefOr[String] = js.native
}

object SchemaEntity {
  @scala.inline
  def apply(): SchemaEntity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaEntity]
  }
  @scala.inline
  implicit class SchemaEntityOps[Self <: SchemaEntity] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMentions(value: js.Array[SchemaEntityMention]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mentions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMentions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mentions")(js.undefined)
        ret
    }
    @scala.inline
    def withMetadata(value: StringDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMetadata: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metadata")(js.undefined)
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
    def withSalience(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("salience")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSalience: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("salience")(js.undefined)
        ret
    }
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

