package typingsSlinky.googleapis.slidesV1Mod.slidesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A Google Slides presentation.
  */
@js.native
trait SchemaPresentation extends StObject {
  
  /**
    * The layouts in the presentation. A layout is a template that determines
    * how content is arranged and styled on the slides that inherit from that
    * layout.
    */
  var layouts: js.UndefOr[js.Array[SchemaPage]] = js.native
  
  /**
    * The locale of the presentation, as an IETF BCP 47 language tag.
    */
  var locale: js.UndefOr[String] = js.native
  
  /**
    * The slide masters in the presentation. A slide master contains all common
    * page elements and the common properties for a set of layouts. They serve
    * three purposes:  - Placeholder shapes on a master contain the default
    * text styles and shape   properties of all placeholder shapes on pages
    * that use that master. - The master page properties define the common page
    * properties inherited by   its layouts. - Any other shapes on the master
    * slide will appear on all slides using that   master, regardless of their
    * layout.
    */
  var masters: js.UndefOr[js.Array[SchemaPage]] = js.native
  
  /**
    * The notes master in the presentation. It serves three purposes:  -
    * Placeholder shapes on a notes master contain the default text styles and
    * shape properties of all placeholder shapes on notes pages. Specifically,
    * a `SLIDE_IMAGE` placeholder shape contains the slide thumbnail, and a
    * `BODY` placeholder shape contains the speaker notes. - The notes master
    * page properties define the common page properties   inherited by all
    * notes pages. - Any other shapes on the notes master will appear on all
    * notes pages.  The notes master is read-only.
    */
  var notesMaster: js.UndefOr[SchemaPage] = js.native
  
  /**
    * The size of pages in the presentation.
    */
  var pageSize: js.UndefOr[SchemaSize] = js.native
  
  /**
    * The ID of the presentation.
    */
  var presentationId: js.UndefOr[String] = js.native
  
  /**
    * The revision ID of the presentation. Can be used in update requests to
    * assert that the presentation revision hasn&#39;t changed since the last
    * read operation. Only populated if the user has edit access to the
    * presentation.  The format of the revision ID may change over time, so it
    * should be treated opaquely. A returned revision ID is only guaranteed to
    * be valid for 24 hours after it has been returned and cannot be shared
    * across users. If the revision ID is unchanged between calls, then the
    * presentation has not changed. Conversely, a changed ID (for the same
    * presentation and user) usually means the presentation has been updated;
    * however, a changed ID can also be due to internal factors such as ID
    * format changes.
    */
  var revisionId: js.UndefOr[String] = js.native
  
  /**
    * The slides in the presentation. A slide inherits properties from a slide
    * layout.
    */
  var slides: js.UndefOr[js.Array[SchemaPage]] = js.native
  
  /**
    * The title of the presentation.
    */
  var title: js.UndefOr[String] = js.native
}
object SchemaPresentation {
  
  @scala.inline
  def apply(): SchemaPresentation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPresentation]
  }
  
  @scala.inline
  implicit class SchemaPresentationMutableBuilder[Self <: SchemaPresentation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLayouts(value: js.Array[SchemaPage]): Self = StObject.set(x, "layouts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLayoutsUndefined: Self = StObject.set(x, "layouts", js.undefined)
    
    @scala.inline
    def setLayoutsVarargs(value: SchemaPage*): Self = StObject.set(x, "layouts", js.Array(value :_*))
    
    @scala.inline
    def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
    
    @scala.inline
    def setMasters(value: js.Array[SchemaPage]): Self = StObject.set(x, "masters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMastersUndefined: Self = StObject.set(x, "masters", js.undefined)
    
    @scala.inline
    def setMastersVarargs(value: SchemaPage*): Self = StObject.set(x, "masters", js.Array(value :_*))
    
    @scala.inline
    def setNotesMaster(value: SchemaPage): Self = StObject.set(x, "notesMaster", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotesMasterUndefined: Self = StObject.set(x, "notesMaster", js.undefined)
    
    @scala.inline
    def setPageSize(value: SchemaSize): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    
    @scala.inline
    def setPresentationId(value: String): Self = StObject.set(x, "presentationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPresentationIdUndefined: Self = StObject.set(x, "presentationId", js.undefined)
    
    @scala.inline
    def setRevisionId(value: String): Self = StObject.set(x, "revisionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRevisionIdUndefined: Self = StObject.set(x, "revisionId", js.undefined)
    
    @scala.inline
    def setSlides(value: js.Array[SchemaPage]): Self = StObject.set(x, "slides", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSlidesUndefined: Self = StObject.set(x, "slides", js.undefined)
    
    @scala.inline
    def setSlidesVarargs(value: SchemaPage*): Self = StObject.set(x, "slides", js.Array(value :_*))
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
