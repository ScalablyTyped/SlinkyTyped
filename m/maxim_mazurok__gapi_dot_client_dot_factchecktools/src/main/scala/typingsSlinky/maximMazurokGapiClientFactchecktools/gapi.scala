package typingsSlinky.maximMazurokGapiClientFactchecktools

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientFactchecktools.anon.Accesstoken
import typingsSlinky.maximMazurokGapiClientFactchecktools.anon.Alt
import typingsSlinky.maximMazurokGapiClientFactchecktools.anon.Callback
import typingsSlinky.maximMazurokGapiClientFactchecktools.anon.Fields
import typingsSlinky.maximMazurokGapiClientFactchecktools.anon.Key
import typingsSlinky.maximMazurokGapiClientFactchecktools.anon.Name
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object gapi {
  
  object client {
    
    object factchecktools {
      
      @js.native
      trait ClaimsResource extends StObject {
        
        /** Search through fact-checked claims. */
        def search(): Request[GoogleFactcheckingFactchecktoolsV1alpha1FactCheckedClaimSearchResponse] = js.native
        def search(request: Accesstoken): Request[GoogleFactcheckingFactchecktoolsV1alpha1FactCheckedClaimSearchResponse] = js.native
      }
      
      @js.native
      trait GoogleFactcheckingFactchecktoolsV1alpha1Claim extends StObject {
        
        /** The date that the claim was made. */
        var claimDate: js.UndefOr[String] = js.native
        
        /** One or more reviews of this claim (namely, a fact-checking article). */
        var claimReview: js.UndefOr[js.Array[GoogleFactcheckingFactchecktoolsV1alpha1ClaimReview]] = js.native
        
        /** A person or organization stating the claim. For instance, "John Doe". */
        var claimant: js.UndefOr[String] = js.native
        
        /** The claim text. For instance, "Crime has doubled in the last 2 years." */
        var text: js.UndefOr[String] = js.native
      }
      object GoogleFactcheckingFactchecktoolsV1alpha1Claim {
        
        @scala.inline
        def apply(): GoogleFactcheckingFactchecktoolsV1alpha1Claim = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[GoogleFactcheckingFactchecktoolsV1alpha1Claim]
        }
        
        @scala.inline
        implicit class GoogleFactcheckingFactchecktoolsV1alpha1ClaimMutableBuilder[Self <: GoogleFactcheckingFactchecktoolsV1alpha1Claim] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setClaimDate(value: String): Self = StObject.set(x, "claimDate", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setClaimDateUndefined: Self = StObject.set(x, "claimDate", js.undefined)
          
          @scala.inline
          def setClaimReview(value: js.Array[GoogleFactcheckingFactchecktoolsV1alpha1ClaimReview]): Self = StObject.set(x, "claimReview", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setClaimReviewUndefined: Self = StObject.set(x, "claimReview", js.undefined)
          
          @scala.inline
          def setClaimReviewVarargs(value: GoogleFactcheckingFactchecktoolsV1alpha1ClaimReview*): Self = StObject.set(x, "claimReview", js.Array(value :_*))
          
          @scala.inline
          def setClaimant(value: String): Self = StObject.set(x, "claimant", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setClaimantUndefined: Self = StObject.set(x, "claimant", js.undefined)
          
          @scala.inline
          def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
        }
      }
      
      @js.native
      trait GoogleFactcheckingFactchecktoolsV1alpha1ClaimAuthor extends StObject {
        
        /** Corresponds to `ClaimReview.itemReviewed.author.image`. */
        var imageUrl: js.UndefOr[String] = js.native
        
        /** Corresponds to `ClaimReview.itemReviewed.author.jobTitle`. */
        var jobTitle: js.UndefOr[String] = js.native
        
        /** A person or organization stating the claim. For instance, "John Doe". Corresponds to `ClaimReview.itemReviewed.author.name`. */
        var name: js.UndefOr[String] = js.native
        
        /** Corresponds to `ClaimReview.itemReviewed.author.sameAs`. */
        var sameAs: js.UndefOr[String] = js.native
      }
      object GoogleFactcheckingFactchecktoolsV1alpha1ClaimAuthor {
        
        @scala.inline
        def apply(): GoogleFactcheckingFactchecktoolsV1alpha1ClaimAuthor = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[GoogleFactcheckingFactchecktoolsV1alpha1ClaimAuthor]
        }
        
        @scala.inline
        implicit class GoogleFactcheckingFactchecktoolsV1alpha1ClaimAuthorMutableBuilder[Self <: GoogleFactcheckingFactchecktoolsV1alpha1ClaimAuthor] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setImageUrl(value: String): Self = StObject.set(x, "imageUrl", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setImageUrlUndefined: Self = StObject.set(x, "imageUrl", js.undefined)
          
          @scala.inline
          def setJobTitle(value: String): Self = StObject.set(x, "jobTitle", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setJobTitleUndefined: Self = StObject.set(x, "jobTitle", js.undefined)
          
          @scala.inline
          def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
          
          @scala.inline
          def setSameAs(value: String): Self = StObject.set(x, "sameAs", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setSameAsUndefined: Self = StObject.set(x, "sameAs", js.undefined)
        }
      }
      
      @js.native
      trait GoogleFactcheckingFactchecktoolsV1alpha1ClaimRating extends StObject {
        
        /** For numeric ratings, the best value possible in the scale from worst to best. Corresponds to `ClaimReview.reviewRating.bestRating`. */
        var bestRating: js.UndefOr[Double] = js.native
        
        /** Corresponds to `ClaimReview.reviewRating.image`. */
        var imageUrl: js.UndefOr[String] = js.native
        
        /** Corresponds to `ClaimReview.reviewRating.ratingExplanation`. */
        var ratingExplanation: js.UndefOr[String] = js.native
        
        /** A numeric rating of this claim, in the range worstRating — bestRating inclusive. Corresponds to `ClaimReview.reviewRating.ratingValue`. */
        var ratingValue: js.UndefOr[Double] = js.native
        
        /** The truthfulness rating as a human-readible short word or phrase. Corresponds to `ClaimReview.reviewRating.alternateName`. */
        var textualRating: js.UndefOr[String] = js.native
        
        /** For numeric ratings, the worst value possible in the scale from worst to best. Corresponds to `ClaimReview.reviewRating.worstRating`. */
        var worstRating: js.UndefOr[Double] = js.native
      }
      object GoogleFactcheckingFactchecktoolsV1alpha1ClaimRating {
        
        @scala.inline
        def apply(): GoogleFactcheckingFactchecktoolsV1alpha1ClaimRating = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[GoogleFactcheckingFactchecktoolsV1alpha1ClaimRating]
        }
        
        @scala.inline
        implicit class GoogleFactcheckingFactchecktoolsV1alpha1ClaimRatingMutableBuilder[Self <: GoogleFactcheckingFactchecktoolsV1alpha1ClaimRating] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setBestRating(value: Double): Self = StObject.set(x, "bestRating", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setBestRatingUndefined: Self = StObject.set(x, "bestRating", js.undefined)
          
          @scala.inline
          def setImageUrl(value: String): Self = StObject.set(x, "imageUrl", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setImageUrlUndefined: Self = StObject.set(x, "imageUrl", js.undefined)
          
          @scala.inline
          def setRatingExplanation(value: String): Self = StObject.set(x, "ratingExplanation", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setRatingExplanationUndefined: Self = StObject.set(x, "ratingExplanation", js.undefined)
          
          @scala.inline
          def setRatingValue(value: Double): Self = StObject.set(x, "ratingValue", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setRatingValueUndefined: Self = StObject.set(x, "ratingValue", js.undefined)
          
          @scala.inline
          def setTextualRating(value: String): Self = StObject.set(x, "textualRating", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setTextualRatingUndefined: Self = StObject.set(x, "textualRating", js.undefined)
          
          @scala.inline
          def setWorstRating(value: Double): Self = StObject.set(x, "worstRating", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setWorstRatingUndefined: Self = StObject.set(x, "worstRating", js.undefined)
        }
      }
      
      @js.native
      trait GoogleFactcheckingFactchecktoolsV1alpha1ClaimReview extends StObject {
        
        /** The language this review was written in. For instance, "en" or "de". */
        var languageCode: js.UndefOr[String] = js.native
        
        /** The publisher of this claim review. */
        var publisher: js.UndefOr[GoogleFactcheckingFactchecktoolsV1alpha1Publisher] = js.native
        
        /** The date the claim was reviewed. */
        var reviewDate: js.UndefOr[String] = js.native
        
        /** Textual rating. For instance, "Mostly false". */
        var textualRating: js.UndefOr[String] = js.native
        
        /** The title of this claim review, if it can be determined. */
        var title: js.UndefOr[String] = js.native
        
        /** The URL of this claim review. */
        var url: js.UndefOr[String] = js.native
      }
      object GoogleFactcheckingFactchecktoolsV1alpha1ClaimReview {
        
        @scala.inline
        def apply(): GoogleFactcheckingFactchecktoolsV1alpha1ClaimReview = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[GoogleFactcheckingFactchecktoolsV1alpha1ClaimReview]
        }
        
        @scala.inline
        implicit class GoogleFactcheckingFactchecktoolsV1alpha1ClaimReviewMutableBuilder[Self <: GoogleFactcheckingFactchecktoolsV1alpha1ClaimReview] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setLanguageCode(value: String): Self = StObject.set(x, "languageCode", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setLanguageCodeUndefined: Self = StObject.set(x, "languageCode", js.undefined)
          
          @scala.inline
          def setPublisher(value: GoogleFactcheckingFactchecktoolsV1alpha1Publisher): Self = StObject.set(x, "publisher", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setPublisherUndefined: Self = StObject.set(x, "publisher", js.undefined)
          
          @scala.inline
          def setReviewDate(value: String): Self = StObject.set(x, "reviewDate", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setReviewDateUndefined: Self = StObject.set(x, "reviewDate", js.undefined)
          
          @scala.inline
          def setTextualRating(value: String): Self = StObject.set(x, "textualRating", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setTextualRatingUndefined: Self = StObject.set(x, "textualRating", js.undefined)
          
          @scala.inline
          def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
          
          @scala.inline
          def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
        }
      }
      
      @js.native
      trait GoogleFactcheckingFactchecktoolsV1alpha1ClaimReviewAuthor extends StObject {
        
        /** Corresponds to `ClaimReview.author.image`. */
        var imageUrl: js.UndefOr[String] = js.native
        
        /** Name of the organization that is publishing the fact check. Corresponds to `ClaimReview.author.name`. */
        var name: js.UndefOr[String] = js.native
      }
      object GoogleFactcheckingFactchecktoolsV1alpha1ClaimReviewAuthor {
        
        @scala.inline
        def apply(): GoogleFactcheckingFactchecktoolsV1alpha1ClaimReviewAuthor = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[GoogleFactcheckingFactchecktoolsV1alpha1ClaimReviewAuthor]
        }
        
        @scala.inline
        implicit class GoogleFactcheckingFactchecktoolsV1alpha1ClaimReviewAuthorMutableBuilder[Self <: GoogleFactcheckingFactchecktoolsV1alpha1ClaimReviewAuthor] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setImageUrl(value: String): Self = StObject.set(x, "imageUrl", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setImageUrlUndefined: Self = StObject.set(x, "imageUrl", js.undefined)
          
          @scala.inline
          def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
        }
      }
      
      @js.native
      trait GoogleFactcheckingFactchecktoolsV1alpha1ClaimReviewMarkup extends StObject {
        
        /**
          * A list of links to works in which this claim appears, aside from the one specified in `claim_first_appearance`. Corresponds to
          * `ClaimReview.itemReviewed[@type=Claim].appearance.url`.
          */
        var claimAppearances: js.UndefOr[js.Array[String]] = js.native
        
        /** Info about the author of this claim. */
        var claimAuthor: js.UndefOr[GoogleFactcheckingFactchecktoolsV1alpha1ClaimAuthor] = js.native
        
        /** The date when the claim was made or entered public discourse. Corresponds to `ClaimReview.itemReviewed.datePublished`. */
        var claimDate: js.UndefOr[String] = js.native
        
        /** A link to a work in which this claim first appears. Corresponds to `ClaimReview.itemReviewed[@type=Claim].firstAppearance.url`. */
        var claimFirstAppearance: js.UndefOr[String] = js.native
        
        /** The location where this claim was made. Corresponds to `ClaimReview.itemReviewed.name`. */
        var claimLocation: js.UndefOr[String] = js.native
        
        /** A short summary of the claim being evaluated. Corresponds to `ClaimReview.claimReviewed`. */
        var claimReviewed: js.UndefOr[String] = js.native
        
        /** Info about the rating of this claim review. */
        var rating: js.UndefOr[GoogleFactcheckingFactchecktoolsV1alpha1ClaimRating] = js.native
        
        /**
          * This field is optional, and will default to the page URL. We provide this field to allow you the override the default value, but the only permitted override is the page URL plus an
          * optional anchor link ("page jump"). Corresponds to `ClaimReview.url`
          */
        var url: js.UndefOr[String] = js.native
      }
      object GoogleFactcheckingFactchecktoolsV1alpha1ClaimReviewMarkup {
        
        @scala.inline
        def apply(): GoogleFactcheckingFactchecktoolsV1alpha1ClaimReviewMarkup = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[GoogleFactcheckingFactchecktoolsV1alpha1ClaimReviewMarkup]
        }
        
        @scala.inline
        implicit class GoogleFactcheckingFactchecktoolsV1alpha1ClaimReviewMarkupMutableBuilder[Self <: GoogleFactcheckingFactchecktoolsV1alpha1ClaimReviewMarkup] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setClaimAppearances(value: js.Array[String]): Self = StObject.set(x, "claimAppearances", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setClaimAppearancesUndefined: Self = StObject.set(x, "claimAppearances", js.undefined)
          
          @scala.inline
          def setClaimAppearancesVarargs(value: String*): Self = StObject.set(x, "claimAppearances", js.Array(value :_*))
          
          @scala.inline
          def setClaimAuthor(value: GoogleFactcheckingFactchecktoolsV1alpha1ClaimAuthor): Self = StObject.set(x, "claimAuthor", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setClaimAuthorUndefined: Self = StObject.set(x, "claimAuthor", js.undefined)
          
          @scala.inline
          def setClaimDate(value: String): Self = StObject.set(x, "claimDate", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setClaimDateUndefined: Self = StObject.set(x, "claimDate", js.undefined)
          
          @scala.inline
          def setClaimFirstAppearance(value: String): Self = StObject.set(x, "claimFirstAppearance", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setClaimFirstAppearanceUndefined: Self = StObject.set(x, "claimFirstAppearance", js.undefined)
          
          @scala.inline
          def setClaimLocation(value: String): Self = StObject.set(x, "claimLocation", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setClaimLocationUndefined: Self = StObject.set(x, "claimLocation", js.undefined)
          
          @scala.inline
          def setClaimReviewed(value: String): Self = StObject.set(x, "claimReviewed", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setClaimReviewedUndefined: Self = StObject.set(x, "claimReviewed", js.undefined)
          
          @scala.inline
          def setRating(value: GoogleFactcheckingFactchecktoolsV1alpha1ClaimRating): Self = StObject.set(x, "rating", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setRatingUndefined: Self = StObject.set(x, "rating", js.undefined)
          
          @scala.inline
          def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
        }
      }
      
      @js.native
      trait GoogleFactcheckingFactchecktoolsV1alpha1ClaimReviewMarkupPage extends StObject {
        
        /** Info about the author of this claim review. Similar to the above, semantically these are page-level fields, and each `ClaimReview` on this page will contain the same values. */
        var claimReviewAuthor: js.UndefOr[GoogleFactcheckingFactchecktoolsV1alpha1ClaimReviewAuthor] = js.native
        
        /** A list of individual claim reviews for this page. Each item in the list corresponds to one `ClaimReview` element. */
        var claimReviewMarkups: js.UndefOr[js.Array[GoogleFactcheckingFactchecktoolsV1alpha1ClaimReviewMarkup]] = js.native
        
        /** The name of this `ClaimReview` markup page resource, in the form of `pages/{page_id}`. Except for update requests, this field is output-only and should not be set by the user. */
        var name: js.UndefOr[String] = js.native
        
        /**
          * The URL of the page associated with this `ClaimReview` markup. While every individual `ClaimReview` has its own URL field, semantically this is a page-level field, and each
          * `ClaimReview` on this page will use this value unless individually overridden. Corresponds to `ClaimReview.url`
          */
        var pageUrl: js.UndefOr[String] = js.native
        
        /**
          * The date when the fact check was published. Similar to the URL, semantically this is a page-level field, and each `ClaimReview` on this page will contain the same value. Corresponds
          * to `ClaimReview.datePublished`
          */
        var publishDate: js.UndefOr[String] = js.native
        
        /** The version ID for this markup. Except for update requests, this field is output-only and should not be set by the user. */
        var versionId: js.UndefOr[String] = js.native
      }
      object GoogleFactcheckingFactchecktoolsV1alpha1ClaimReviewMarkupPage {
        
        @scala.inline
        def apply(): GoogleFactcheckingFactchecktoolsV1alpha1ClaimReviewMarkupPage = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[GoogleFactcheckingFactchecktoolsV1alpha1ClaimReviewMarkupPage]
        }
        
        @scala.inline
        implicit class GoogleFactcheckingFactchecktoolsV1alpha1ClaimReviewMarkupPageMutableBuilder[Self <: GoogleFactcheckingFactchecktoolsV1alpha1ClaimReviewMarkupPage] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setClaimReviewAuthor(value: GoogleFactcheckingFactchecktoolsV1alpha1ClaimReviewAuthor): Self = StObject.set(x, "claimReviewAuthor", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setClaimReviewAuthorUndefined: Self = StObject.set(x, "claimReviewAuthor", js.undefined)
          
          @scala.inline
          def setClaimReviewMarkups(value: js.Array[GoogleFactcheckingFactchecktoolsV1alpha1ClaimReviewMarkup]): Self = StObject.set(x, "claimReviewMarkups", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setClaimReviewMarkupsUndefined: Self = StObject.set(x, "claimReviewMarkups", js.undefined)
          
          @scala.inline
          def setClaimReviewMarkupsVarargs(value: GoogleFactcheckingFactchecktoolsV1alpha1ClaimReviewMarkup*): Self = StObject.set(x, "claimReviewMarkups", js.Array(value :_*))
          
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
      
      @js.native
      trait GoogleFactcheckingFactchecktoolsV1alpha1FactCheckedClaimSearchResponse extends StObject {
        
        /** The list of claims and all of their associated information. */
        var claims: js.UndefOr[js.Array[GoogleFactcheckingFactchecktoolsV1alpha1Claim]] = js.native
        
        /** The next pagination token in the Search response. It should be used as the `page_token` for the following request. An empty value means no more results. */
        var nextPageToken: js.UndefOr[String] = js.native
      }
      object GoogleFactcheckingFactchecktoolsV1alpha1FactCheckedClaimSearchResponse {
        
        @scala.inline
        def apply(): GoogleFactcheckingFactchecktoolsV1alpha1FactCheckedClaimSearchResponse = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[GoogleFactcheckingFactchecktoolsV1alpha1FactCheckedClaimSearchResponse]
        }
        
        @scala.inline
        implicit class GoogleFactcheckingFactchecktoolsV1alpha1FactCheckedClaimSearchResponseMutableBuilder[Self <: GoogleFactcheckingFactchecktoolsV1alpha1FactCheckedClaimSearchResponse] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setClaims(value: js.Array[GoogleFactcheckingFactchecktoolsV1alpha1Claim]): Self = StObject.set(x, "claims", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setClaimsUndefined: Self = StObject.set(x, "claims", js.undefined)
          
          @scala.inline
          def setClaimsVarargs(value: GoogleFactcheckingFactchecktoolsV1alpha1Claim*): Self = StObject.set(x, "claims", js.Array(value :_*))
          
          @scala.inline
          def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
        }
      }
      
      @js.native
      trait GoogleFactcheckingFactchecktoolsV1alpha1ListClaimReviewMarkupPagesResponse extends StObject {
        
        /** The result list of pages of `ClaimReview` markup. */
        var claimReviewMarkupPages: js.UndefOr[js.Array[GoogleFactcheckingFactchecktoolsV1alpha1ClaimReviewMarkupPage]] = js.native
        
        /** The next pagination token in the Search response. It should be used as the `page_token` for the following request. An empty value means no more results. */
        var nextPageToken: js.UndefOr[String] = js.native
      }
      object GoogleFactcheckingFactchecktoolsV1alpha1ListClaimReviewMarkupPagesResponse {
        
        @scala.inline
        def apply(): GoogleFactcheckingFactchecktoolsV1alpha1ListClaimReviewMarkupPagesResponse = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[GoogleFactcheckingFactchecktoolsV1alpha1ListClaimReviewMarkupPagesResponse]
        }
        
        @scala.inline
        implicit class GoogleFactcheckingFactchecktoolsV1alpha1ListClaimReviewMarkupPagesResponseMutableBuilder[Self <: GoogleFactcheckingFactchecktoolsV1alpha1ListClaimReviewMarkupPagesResponse] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setClaimReviewMarkupPages(value: js.Array[GoogleFactcheckingFactchecktoolsV1alpha1ClaimReviewMarkupPage]): Self = StObject.set(x, "claimReviewMarkupPages", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setClaimReviewMarkupPagesUndefined: Self = StObject.set(x, "claimReviewMarkupPages", js.undefined)
          
          @scala.inline
          def setClaimReviewMarkupPagesVarargs(value: GoogleFactcheckingFactchecktoolsV1alpha1ClaimReviewMarkupPage*): Self = StObject.set(x, "claimReviewMarkupPages", js.Array(value :_*))
          
          @scala.inline
          def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
        }
      }
      
      @js.native
      trait GoogleFactcheckingFactchecktoolsV1alpha1Publisher extends StObject {
        
        /** The name of this publisher. For instance, "Awesome Fact Checks". */
        var name: js.UndefOr[String] = js.native
        
        /** Host-level site name, without the protocol or "www" prefix. For instance, "awesomefactchecks.com". This value of this field is based purely on the claim review URL. */
        var site: js.UndefOr[String] = js.native
      }
      object GoogleFactcheckingFactchecktoolsV1alpha1Publisher {
        
        @scala.inline
        def apply(): GoogleFactcheckingFactchecktoolsV1alpha1Publisher = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[GoogleFactcheckingFactchecktoolsV1alpha1Publisher]
        }
        
        @scala.inline
        implicit class GoogleFactcheckingFactchecktoolsV1alpha1PublisherMutableBuilder[Self <: GoogleFactcheckingFactchecktoolsV1alpha1Publisher] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
          
          @scala.inline
          def setSite(value: String): Self = StObject.set(x, "site", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setSiteUndefined: Self = StObject.set(x, "site", js.undefined)
        }
      }
      
      // tslint:disable-next-line:no-empty-interface
      @js.native
      trait GoogleProtobufEmpty extends StObject
      
      @js.native
      trait PagesResource extends StObject {
        
        /** Create `ClaimReview` markup on a page. */
        def create(request: Alt): Request[GoogleFactcheckingFactchecktoolsV1alpha1ClaimReviewMarkupPage] = js.native
        def create(request: Callback, body: GoogleFactcheckingFactchecktoolsV1alpha1ClaimReviewMarkupPage): Request[GoogleFactcheckingFactchecktoolsV1alpha1ClaimReviewMarkupPage] = js.native
        
        /** Delete all `ClaimReview` markup on a page. */
        def delete(): Request[js.Object] = js.native
        def delete(request: Fields): Request[js.Object] = js.native
        
        /** Get all `ClaimReview` markup on a page. */
        def get(): Request[GoogleFactcheckingFactchecktoolsV1alpha1ClaimReviewMarkupPage] = js.native
        def get(request: Fields): Request[GoogleFactcheckingFactchecktoolsV1alpha1ClaimReviewMarkupPage] = js.native
        
        /** List the `ClaimReview` markup pages for a specific URL or for an organization. */
        def list(): Request[GoogleFactcheckingFactchecktoolsV1alpha1ListClaimReviewMarkupPagesResponse] = js.native
        def list(request: Key): Request[GoogleFactcheckingFactchecktoolsV1alpha1ListClaimReviewMarkupPagesResponse] = js.native
        
        def update(request: Fields, body: GoogleFactcheckingFactchecktoolsV1alpha1ClaimReviewMarkupPage): Request[GoogleFactcheckingFactchecktoolsV1alpha1ClaimReviewMarkupPage] = js.native
        /**
          * Update for all `ClaimReview` markup on a page Note that this is a full update. To retain the existing `ClaimReview` markup on a page, first perform a Get operation, then modify the
          * returned markup, and finally call Update with the entire `ClaimReview` markup as the body.
          */
        def update(request: Name): Request[GoogleFactcheckingFactchecktoolsV1alpha1ClaimReviewMarkupPage] = js.native
      }
    }
  }
}
