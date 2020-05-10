package typingsSlinky.googleapis.docsV1Mod.docsV1

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A List represents the list attributes for a group of paragraphs that all
  * belong to the same list. A paragraph that is part of a list has a reference
  * to the list&#39;s ID in its bullet.
  */
@js.native
trait SchemaList extends js.Object {
  /**
    * The properties of the list.
    */
  var listProperties: js.UndefOr[SchemaListProperties] = js.native
  /**
    * The suggested deletion IDs. If empty, then there are no suggested
    * deletions of this list.
    */
  var suggestedDeletionIds: js.UndefOr[js.Array[String]] = js.native
  /**
    * The suggested insertion ID. If empty, then this is not a suggested
    * insertion.
    */
  var suggestedInsertionId: js.UndefOr[String] = js.native
  /**
    * The suggested changes to the list properties, keyed by suggestion ID.
    */
  var suggestedListPropertiesChanges: js.UndefOr[StringDictionary[SchemaSuggestedListProperties]] = js.native
}

object SchemaList {
  @scala.inline
  def apply(): SchemaList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaList]
  }
  @scala.inline
  implicit class SchemaListOps[Self <: SchemaList] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withListProperties(value: SchemaListProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listProperties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutListProperties: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listProperties")(js.undefined)
        ret
    }
    @scala.inline
    def withSuggestedDeletionIds(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suggestedDeletionIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSuggestedDeletionIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suggestedDeletionIds")(js.undefined)
        ret
    }
    @scala.inline
    def withSuggestedInsertionId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suggestedInsertionId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSuggestedInsertionId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suggestedInsertionId")(js.undefined)
        ret
    }
    @scala.inline
    def withSuggestedListPropertiesChanges(value: StringDictionary[SchemaSuggestedListProperties]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suggestedListPropertiesChanges")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSuggestedListPropertiesChanges: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suggestedListPropertiesChanges")(js.undefined)
        ret
    }
  }
  
}

