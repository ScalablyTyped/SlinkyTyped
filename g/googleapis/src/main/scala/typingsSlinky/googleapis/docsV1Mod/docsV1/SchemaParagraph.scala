package typingsSlinky.googleapis.docsV1Mod.docsV1

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A StructuralElement representing a paragraph. A paragraph is a range of
  * content that is terminated with a newline character.
  */
@js.native
trait SchemaParagraph extends js.Object {
  /**
    * The bullet for this paragraph. If not present, the paragraph does not
    * belong to a list.
    */
  var bullet: js.UndefOr[SchemaBullet] = js.native
  /**
    * The content of the paragraph broken down into its component parts.
    */
  var elements: js.UndefOr[js.Array[SchemaParagraphElement]] = js.native
  /**
    * The style of this paragraph.
    */
  var paragraphStyle: js.UndefOr[SchemaParagraphStyle] = js.native
  /**
    * The IDs of the positioned objects tethered to this paragraph.
    */
  var positionedObjectIds: js.UndefOr[js.Array[String]] = js.native
  /**
    * The suggested changes to this paragraph&#39;s bullet.
    */
  var suggestedBulletChanges: js.UndefOr[StringDictionary[SchemaSuggestedBullet]] = js.native
  /**
    * The suggested paragraph style changes to this paragraph, keyed by
    * suggestion ID.
    */
  var suggestedParagraphStyleChanges: js.UndefOr[StringDictionary[SchemaSuggestedParagraphStyle]] = js.native
  /**
    * The IDs of the positioned objects that are suggested to be attached to
    * this paragraph, keyed by suggestion ID.
    */
  var suggestedPositionedObjectIds: js.UndefOr[StringDictionary[SchemaObjectReferences]] = js.native
}

object SchemaParagraph {
  @scala.inline
  def apply(): SchemaParagraph = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaParagraph]
  }
  @scala.inline
  implicit class SchemaParagraphOps[Self <: SchemaParagraph] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBullet(value: SchemaBullet): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bullet")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBullet: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bullet")(js.undefined)
        ret
    }
    @scala.inline
    def withElements(value: js.Array[SchemaParagraphElement]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("elements")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutElements: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("elements")(js.undefined)
        ret
    }
    @scala.inline
    def withParagraphStyle(value: SchemaParagraphStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paragraphStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParagraphStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paragraphStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withPositionedObjectIds(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("positionedObjectIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPositionedObjectIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("positionedObjectIds")(js.undefined)
        ret
    }
    @scala.inline
    def withSuggestedBulletChanges(value: StringDictionary[SchemaSuggestedBullet]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suggestedBulletChanges")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSuggestedBulletChanges: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suggestedBulletChanges")(js.undefined)
        ret
    }
    @scala.inline
    def withSuggestedParagraphStyleChanges(value: StringDictionary[SchemaSuggestedParagraphStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suggestedParagraphStyleChanges")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSuggestedParagraphStyleChanges: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suggestedParagraphStyleChanges")(js.undefined)
        ret
    }
    @scala.inline
    def withSuggestedPositionedObjectIds(value: StringDictionary[SchemaObjectReferences]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suggestedPositionedObjectIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSuggestedPositionedObjectIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suggestedPositionedObjectIds")(js.undefined)
        ret
    }
  }
  
}

