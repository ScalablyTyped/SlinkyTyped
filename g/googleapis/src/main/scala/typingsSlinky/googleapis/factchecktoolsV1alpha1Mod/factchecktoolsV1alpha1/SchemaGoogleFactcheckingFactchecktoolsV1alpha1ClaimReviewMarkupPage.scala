package typingsSlinky.googleapis.factchecktoolsV1alpha1Mod.factchecktoolsV1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Holds one or more instances of `ClaimReview` markup for a webpage.
  */
@js.native
trait SchemaGoogleFactcheckingFactchecktoolsV1alpha1ClaimReviewMarkupPage extends StObject {
  
  /**
    * Info about the author of this claim review. Similar to the above,
    * semantically these are page-level fields, and each `ClaimReview` on this
    * page will contain the same values.
    */
  var claimReviewAuthor: js.UndefOr[SchemaGoogleFactcheckingFactchecktoolsV1alpha1ClaimReviewAuthor] = js.native
  
  /**
    * A list of individual claim reviews for this page. Each item in the list
    * corresponds to one `ClaimReview` element.
    */
  var claimReviewMarkups: js.UndefOr[js.Array[SchemaGoogleFactcheckingFactchecktoolsV1alpha1ClaimReviewMarkup]] = js.native
  
  /**
    * The name of this `ClaimReview` markup page resource, in the form of
    * `pages/{page_id}`. Except for update requests, this field is output-only
    * and should not be set by the user.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * The URL of the page associated with this `ClaimReview` markup. While
    * every individual `ClaimReview` has its own URL field, semantically this
    * is a page-level field, and each `ClaimReview` on this page will use this
    * value unless individually overridden.&lt;br&gt; Corresponds to
    * `ClaimReview.url`
    */
  var pageUrl: js.UndefOr[String] = js.native
  
  /**
    * The date when the fact check was published. Similar to the URL,
    * semantically this is a page-level field, and each `ClaimReview` on this
    * page will contain the same value.&lt;br&gt; Corresponds to
    * `ClaimReview.datePublished`
    */
  var publishDate: js.UndefOr[String] = js.native
  
  /**
    * The version ID for this markup. Except for update requests, this field is
    * output-only and should not be set by the user.
    */
  var versionId: js.UndefOr[String] = js.native
}
object SchemaGoogleFactcheckingFactchecktoolsV1alpha1ClaimReviewMarkupPage {
  
  @scala.inline
  def apply(): SchemaGoogleFactcheckingFactchecktoolsV1alpha1ClaimReviewMarkupPage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleFactcheckingFactchecktoolsV1alpha1ClaimReviewMarkupPage]
  }
  
  @scala.inline
  implicit class SchemaGoogleFactcheckingFactchecktoolsV1alpha1ClaimReviewMarkupPageMutableBuilder[Self <: SchemaGoogleFactcheckingFactchecktoolsV1alpha1ClaimReviewMarkupPage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClaimReviewAuthor(value: SchemaGoogleFactcheckingFactchecktoolsV1alpha1ClaimReviewAuthor): Self = StObject.set(x, "claimReviewAuthor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClaimReviewAuthorUndefined: Self = StObject.set(x, "claimReviewAuthor", js.undefined)
    
    @scala.inline
    def setClaimReviewMarkups(value: js.Array[SchemaGoogleFactcheckingFactchecktoolsV1alpha1ClaimReviewMarkup]): Self = StObject.set(x, "claimReviewMarkups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClaimReviewMarkupsUndefined: Self = StObject.set(x, "claimReviewMarkups", js.undefined)
    
    @scala.inline
    def setClaimReviewMarkupsVarargs(value: SchemaGoogleFactcheckingFactchecktoolsV1alpha1ClaimReviewMarkup*): Self = StObject.set(x, "claimReviewMarkups", js.Array(value :_*))
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setPageUrl(value: String): Self = StObject.set(x, "pageUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageUrlUndefined: Self = StObject.set(x, "pageUrl", js.undefined)
    
    @scala.inline
    def setPublishDate(value: String): Self = StObject.set(x, "publishDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublishDateUndefined: Self = StObject.set(x, "publishDate", js.undefined)
    
    @scala.inline
    def setVersionId(value: String): Self = StObject.set(x, "versionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionIdUndefined: Self = StObject.set(x, "versionId", js.undefined)
  }
}
