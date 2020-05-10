package typingsSlinky.algoliasearch.mod

import typingsSlinky.algoliasearch.algoliasearchStrings.oneWaySynonym
import typingsSlinky.algoliasearch.algoliasearchStrings.synonym
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Describes a synonym object
  */
@js.native
trait Synonym extends js.Object {
  /**
    * ObjectID of the synonym
    */
  var objectID: String = js.native
  /**
    * Values used for the synonym
    */
  var synonyms: js.Array[String] = js.native
  /**
    * Type of synonym
    */
  var `type`: synonym | oneWaySynonym = js.native
}

object Synonym {
  @scala.inline
  def apply(objectID: String, synonyms: js.Array[String], `type`: synonym | oneWaySynonym): Synonym = {
    val __obj = js.Dynamic.literal(objectID = objectID.asInstanceOf[js.Any], synonyms = synonyms.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Synonym]
  }
  @scala.inline
  implicit class SynonymOps[Self <: Synonym] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withObjectID(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("objectID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSynonyms(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("synonyms")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: synonym | oneWaySynonym): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

