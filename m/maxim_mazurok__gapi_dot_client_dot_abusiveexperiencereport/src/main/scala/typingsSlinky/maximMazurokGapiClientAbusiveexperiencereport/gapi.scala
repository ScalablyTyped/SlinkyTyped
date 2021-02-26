package typingsSlinky.maximMazurokGapiClientAbusiveexperiencereport

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientAbusiveexperiencereport.anon.Accesstoken
import typingsSlinky.maximMazurokGapiClientAbusiveexperiencereport.anon.Alt
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object gapi {
  
  object client {
    
    object abusiveexperiencereport {
      
      @js.native
      trait SiteSummaryResponse extends StObject {
        
        /** The site's Abusive Experience Report status. */
        var abusiveStatus: js.UndefOr[String] = js.native
        
        /** The time at which [enforcement](https://support.google.com/webtools/answer/7538608) against the site began or will begin. Not set when the filter_status is OFF. */
        var enforcementTime: js.UndefOr[String] = js.native
        
        /** The site's [enforcement status](https://support.google.com/webtools/answer/7538608). */
        var filterStatus: js.UndefOr[String] = js.native
        
        /** The time at which the site's status last changed. */
        var lastChangeTime: js.UndefOr[String] = js.native
        
        /**
          * A link to the full Abusive Experience Report for the site. Not set in ViolatingSitesResponse. Note that you must complete the [Search Console verification
          * process](https://support.google.com/webmasters/answer/9008080) for the site before you can access the full report.
          */
        var reportUrl: js.UndefOr[String] = js.native
        
        /** The name of the reviewed site, e.g. `google.com`. */
        var reviewedSite: js.UndefOr[String] = js.native
        
        /** Whether the site is currently under review. */
        var underReview: js.UndefOr[Boolean] = js.native
      }
      object SiteSummaryResponse {
        
        @scala.inline
        def apply(): SiteSummaryResponse = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[SiteSummaryResponse]
        }
        
        @scala.inline
        implicit class SiteSummaryResponseMutableBuilder[Self <: SiteSummaryResponse] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setAbusiveStatus(value: String): Self = StObject.set(x, "abusiveStatus", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setAbusiveStatusUndefined: Self = StObject.set(x, "abusiveStatus", js.undefined)
          
          @scala.inline
          def setEnforcementTime(value: String): Self = StObject.set(x, "enforcementTime", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setEnforcementTimeUndefined: Self = StObject.set(x, "enforcementTime", js.undefined)
          
          @scala.inline
          def setFilterStatus(value: String): Self = StObject.set(x, "filterStatus", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setFilterStatusUndefined: Self = StObject.set(x, "filterStatus", js.undefined)
          
          @scala.inline
          def setLastChangeTime(value: String): Self = StObject.set(x, "lastChangeTime", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setLastChangeTimeUndefined: Self = StObject.set(x, "lastChangeTime", js.undefined)
          
          @scala.inline
          def setReportUrl(value: String): Self = StObject.set(x, "reportUrl", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setReportUrlUndefined: Self = StObject.set(x, "reportUrl", js.undefined)
          
          @scala.inline
          def setReviewedSite(value: String): Self = StObject.set(x, "reviewedSite", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setReviewedSiteUndefined: Self = StObject.set(x, "reviewedSite", js.undefined)
          
          @scala.inline
          def setUnderReview(value: Boolean): Self = StObject.set(x, "underReview", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setUnderReviewUndefined: Self = StObject.set(x, "underReview", js.undefined)
        }
      }
      
      @js.native
      trait SitesResource extends StObject {
        
        /** Gets a site's Abusive Experience Report summary. */
        def get(): Request[SiteSummaryResponse] = js.native
        def get(request: Accesstoken): Request[SiteSummaryResponse] = js.native
      }
      
      @js.native
      trait ViolatingSitesResource extends StObject {
        
        /** Lists sites that are failing in the Abusive Experience Report. */
        def list(): Request[ViolatingSitesResponse] = js.native
        def list(request: Alt): Request[ViolatingSitesResponse] = js.native
      }
      
      @js.native
      trait ViolatingSitesResponse extends StObject {
        
        /** The list of violating sites. */
        var violatingSites: js.UndefOr[js.Array[SiteSummaryResponse]] = js.native
      }
      object ViolatingSitesResponse {
        
        @scala.inline
        def apply(): ViolatingSitesResponse = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[ViolatingSitesResponse]
        }
        
        @scala.inline
        implicit class ViolatingSitesResponseMutableBuilder[Self <: ViolatingSitesResponse] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setViolatingSites(value: js.Array[SiteSummaryResponse]): Self = StObject.set(x, "violatingSites", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setViolatingSitesUndefined: Self = StObject.set(x, "violatingSites", js.undefined)
          
          @scala.inline
          def setViolatingSitesVarargs(value: SiteSummaryResponse*): Self = StObject.set(x, "violatingSites", js.Array(value :_*))
        }
      }
    }
  }
}
