package typingsSlinky.googleapis.docsV1Mod.docsV1

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An object that is tethered to a Paragraph and positioned relative to the
  * beginning of the paragraph. A PositionedObject contains an EmbeddedObject
  * such as an image.
  */
@js.native
trait SchemaPositionedObject extends js.Object {
  /**
    * The ID of this positioned object.
    */
  var objectId: js.UndefOr[String] = js.native
  /**
    * The properties of this positioned object.
    */
  var positionedObjectProperties: js.UndefOr[SchemaPositionedObjectProperties] = js.native
  /**
    * The suggested deletion IDs. If empty, then there are no suggested
    * deletions of this content.
    */
  var suggestedDeletionIds: js.UndefOr[js.Array[String]] = js.native
  /**
    * The suggested insertion ID. If empty, then this is not a suggested
    * insertion.
    */
  var suggestedInsertionId: js.UndefOr[String] = js.native
  /**
    * The suggested changes to the positioned object properties, keyed by
    * suggestion ID.
    */
  var suggestedPositionedObjectPropertiesChanges: js.UndefOr[StringDictionary[SchemaSuggestedPositionedObjectProperties]] = js.native
}

object SchemaPositionedObject {
  @scala.inline
  def apply(): SchemaPositionedObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPositionedObject]
  }
  @scala.inline
  implicit class SchemaPositionedObjectOps[Self <: SchemaPositionedObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withObjectId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("objectId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutObjectId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("objectId")(js.undefined)
        ret
    }
    @scala.inline
    def withPositionedObjectProperties(value: SchemaPositionedObjectProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("positionedObjectProperties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPositionedObjectProperties: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("positionedObjectProperties")(js.undefined)
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
    def withSuggestedPositionedObjectPropertiesChanges(value: StringDictionary[SchemaSuggestedPositionedObjectProperties]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suggestedPositionedObjectPropertiesChanges")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSuggestedPositionedObjectPropertiesChanges: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suggestedPositionedObjectPropertiesChanges")(js.undefined)
        ret
    }
  }
  
}

