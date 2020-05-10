package typingsSlinky.lunr.mod.Index

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.lunr.mod.Pipeline
import typingsSlinky.lunr.mod.TokenSet
import typingsSlinky.lunr.mod.Vector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Attributes extends js.Object {
  /**
    * Document vectors keyed by document reference.
    */
  var documentVectors: StringDictionary[Vector] = js.native
  /**
    * The names of indexed document fields.
    */
  var fields: js.Array[String] = js.native
  /**
    * An index of term/field to document reference.
    */
  var invertedIndex: js.Object = js.native
  /**
    * The pipeline to use for search terms.
    */
  var pipeline: Pipeline = js.native
  /**
    * An set of all corpus tokens.
    */
  var tokenSet: TokenSet = js.native
}

object Attributes {
  @scala.inline
  def apply(
    documentVectors: StringDictionary[Vector],
    fields: js.Array[String],
    invertedIndex: js.Object,
    pipeline: Pipeline,
    tokenSet: TokenSet
  ): Attributes = {
    val __obj = js.Dynamic.literal(documentVectors = documentVectors.asInstanceOf[js.Any], fields = fields.asInstanceOf[js.Any], invertedIndex = invertedIndex.asInstanceOf[js.Any], pipeline = pipeline.asInstanceOf[js.Any], tokenSet = tokenSet.asInstanceOf[js.Any])
    __obj.asInstanceOf[Attributes]
  }
  @scala.inline
  implicit class AttributesOps[Self <: Attributes] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDocumentVectors(value: StringDictionary[Vector]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("documentVectors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFields(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fields")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInvertedIndex(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invertedIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPipeline(value: Pipeline): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pipeline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTokenSet(value: TokenSet): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tokenSet")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

