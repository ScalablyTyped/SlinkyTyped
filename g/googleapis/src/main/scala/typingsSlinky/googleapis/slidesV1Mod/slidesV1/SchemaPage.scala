package typingsSlinky.googleapis.slidesV1Mod.slidesV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A page in a presentation.
  */
@js.native
trait SchemaPage extends js.Object {
  /**
    * Layout specific properties. Only set if page_type = LAYOUT.
    */
  var layoutProperties: js.UndefOr[SchemaLayoutProperties] = js.native
  /**
    * Master specific properties. Only set if page_type = MASTER.
    */
  var masterProperties: js.UndefOr[SchemaMasterProperties] = js.native
  /**
    * Notes specific properties. Only set if page_type = NOTES.
    */
  var notesProperties: js.UndefOr[SchemaNotesProperties] = js.native
  /**
    * The object ID for this page. Object IDs used by Page and PageElement
    * share the same namespace.
    */
  var objectId: js.UndefOr[String] = js.native
  /**
    * The page elements rendered on the page.
    */
  var pageElements: js.UndefOr[js.Array[SchemaPageElement]] = js.native
  /**
    * The properties of the page.
    */
  var pageProperties: js.UndefOr[SchemaPageProperties] = js.native
  /**
    * The type of the page.
    */
  var pageType: js.UndefOr[String] = js.native
  /**
    * The revision ID of the presentation containing this page. Can be used in
    * update requests to assert that the presentation revision hasn&#39;t
    * changed since the last read operation. Only populated if the user has
    * edit access to the presentation.  The format of the revision ID may
    * change over time, so it should be treated opaquely. A returned revision
    * ID is only guaranteed to be valid for 24 hours after it has been returned
    * and cannot be shared across users. If the revision ID is unchanged
    * between calls, then the presentation has not changed. Conversely, a
    * changed ID (for the same presentation and user) usually means the
    * presentation has been updated; however, a changed ID can also be due to
    * internal factors such as ID format changes.
    */
  var revisionId: js.UndefOr[String] = js.native
  /**
    * Slide specific properties. Only set if page_type = SLIDE.
    */
  var slideProperties: js.UndefOr[SchemaSlideProperties] = js.native
}

object SchemaPage {
  @scala.inline
  def apply(): SchemaPage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPage]
  }
  @scala.inline
  implicit class SchemaPageOps[Self <: SchemaPage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLayoutProperties(value: SchemaLayoutProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layoutProperties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLayoutProperties: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layoutProperties")(js.undefined)
        ret
    }
    @scala.inline
    def withMasterProperties(value: SchemaMasterProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("masterProperties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMasterProperties: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("masterProperties")(js.undefined)
        ret
    }
    @scala.inline
    def withNotesProperties(value: SchemaNotesProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notesProperties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNotesProperties: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notesProperties")(js.undefined)
        ret
    }
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
    def withPageElements(value: js.Array[SchemaPageElement]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageElements")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPageElements: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageElements")(js.undefined)
        ret
    }
    @scala.inline
    def withPageProperties(value: SchemaPageProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageProperties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPageProperties: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageProperties")(js.undefined)
        ret
    }
    @scala.inline
    def withPageType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPageType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageType")(js.undefined)
        ret
    }
    @scala.inline
    def withRevisionId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("revisionId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRevisionId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("revisionId")(js.undefined)
        ret
    }
    @scala.inline
    def withSlideProperties(value: SchemaSlideProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slideProperties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSlideProperties: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slideProperties")(js.undefined)
        ret
    }
  }
  
}

