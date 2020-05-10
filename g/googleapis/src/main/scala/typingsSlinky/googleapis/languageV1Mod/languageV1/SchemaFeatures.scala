package typingsSlinky.googleapis.languageV1Mod.languageV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * All available features for sentiment, syntax, and semantic analysis.
  * Setting each one to true will enable that specific analysis for the input.
  */
@js.native
trait SchemaFeatures extends js.Object {
  /**
    * Classify the full document into categories.
    */
  var classifyText: js.UndefOr[Boolean] = js.native
  /**
    * Extract document-level sentiment.
    */
  var extractDocumentSentiment: js.UndefOr[Boolean] = js.native
  /**
    * Extract entities.
    */
  var extractEntities: js.UndefOr[Boolean] = js.native
  /**
    * Extract entities and their associated sentiment.
    */
  var extractEntitySentiment: js.UndefOr[Boolean] = js.native
  /**
    * Extract syntax information.
    */
  var extractSyntax: js.UndefOr[Boolean] = js.native
}

object SchemaFeatures {
  @scala.inline
  def apply(): SchemaFeatures = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFeatures]
  }
  @scala.inline
  implicit class SchemaFeaturesOps[Self <: SchemaFeatures] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClassifyText(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("classifyText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClassifyText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("classifyText")(js.undefined)
        ret
    }
    @scala.inline
    def withExtractDocumentSentiment(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extractDocumentSentiment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExtractDocumentSentiment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extractDocumentSentiment")(js.undefined)
        ret
    }
    @scala.inline
    def withExtractEntities(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extractEntities")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExtractEntities: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extractEntities")(js.undefined)
        ret
    }
    @scala.inline
    def withExtractEntitySentiment(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extractEntitySentiment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExtractEntitySentiment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extractEntitySentiment")(js.undefined)
        ret
    }
    @scala.inline
    def withExtractSyntax(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extractSyntax")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExtractSyntax: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extractSyntax")(js.undefined)
        ret
    }
  }
  
}

