package typingsSlinky.maximMazurokGapiClientLocalservices

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientLocalservices.anon.Accesstoken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object gapi {
  
  object client {
    
    object localservices {
      
      @js.native
      trait AccountReportsResource extends StObject {
        
        /**
          * Get account reports containing aggregate account data of all linked GLS accounts. Caller needs to provide their manager customer id and the associated auth credential that allows
          * them read permissions on their linked accounts.
          */
        def search(): Request[GoogleAdsHomeservicesLocalservicesV1SearchAccountReportsResponse] = js.native
        def search(request: Accesstoken): Request[GoogleAdsHomeservicesLocalservicesV1SearchAccountReportsResponse] = js.native
      }
      
      @js.native
      trait DetailedLeadReportsResource extends StObject {
        
        /**
          * Get detailed lead reports containing leads that have been received by all linked GLS accounts. Caller needs to provide their manager customer id and the associated auth credential
          * that allows them read permissions on their linked accounts.
          */
        def search(): Request[GoogleAdsHomeservicesLocalservicesV1SearchDetailedLeadReportsResponse] = js.native
        def search(request: Accesstoken): Request[GoogleAdsHomeservicesLocalservicesV1SearchDetailedLeadReportsResponse] = js.native
      }
      
      @js.native
      trait GoogleAdsHomeservicesLocalservicesV1AccountReport extends StObject {
        
        /** Unique identifier of the GLS account. */
        var accountId: js.UndefOr[String] = js.native
        
        /** Aggregator specific information related to the account. */
        var aggregatorInfo: js.UndefOr[GoogleAdsHomeservicesLocalservicesV1AggregatorInfo] = js.native
        
        /** Average review rating score from 1-5 stars. */
        var averageFiveStarRating: js.UndefOr[Double] = js.native
        
        /** Average weekly budget in the currency code of the account. */
        var averageWeeklyBudget: js.UndefOr[Double] = js.native
        
        /** Business name of the account. */
        var businessName: js.UndefOr[String] = js.native
        
        /** Currency code of the account. */
        var currencyCode: js.UndefOr[String] = js.native
        
        /** Number of charged leads the account received in current specified period. */
        var currentPeriodChargedLeads: js.UndefOr[String] = js.native
        
        /** Number of connected phone calls (duration over 30s) in current specified period. */
        var currentPeriodConnectedPhoneCalls: js.UndefOr[String] = js.native
        
        /** Number of phone calls in current specified period, including both connected and unconnected calls. */
        var currentPeriodPhoneCalls: js.UndefOr[String] = js.native
        
        /** Total cost of the account in current specified period in the account's specified currency. */
        var currentPeriodTotalCost: js.UndefOr[Double] = js.native
        
        /**
          * Phone lead responsiveness of the account for the past 90 days from current date. This is computed by taking the total number of connected calls from charged phone leads and dividing
          * by the total number of calls received.
          */
        var phoneLeadResponsiveness: js.UndefOr[Double] = js.native
        
        /** Number of charged leads the account received in previous specified period. */
        var previousPeriodChargedLeads: js.UndefOr[String] = js.native
        
        /** Number of connected phone calls (duration over 30s) in previous specified period. */
        var previousPeriodConnectedPhoneCalls: js.UndefOr[String] = js.native
        
        /** Number of phone calls in previous specified period, including both connected and unconnected calls. */
        var previousPeriodPhoneCalls: js.UndefOr[String] = js.native
        
        /** Total cost of the account in previous specified period in the account's specified currency. */
        var previousPeriodTotalCost: js.UndefOr[Double] = js.native
        
        /** Total number of reviews the account has up to current date. */
        var totalReview: js.UndefOr[Double] = js.native
      }
      object GoogleAdsHomeservicesLocalservicesV1AccountReport {
        
        @scala.inline
        def apply(): GoogleAdsHomeservicesLocalservicesV1AccountReport = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[GoogleAdsHomeservicesLocalservicesV1AccountReport]
        }
        
        @scala.inline
        implicit class GoogleAdsHomeservicesLocalservicesV1AccountReportMutableBuilder[Self <: GoogleAdsHomeservicesLocalservicesV1AccountReport] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
          
          @scala.inline
          def setAggregatorInfo(value: GoogleAdsHomeservicesLocalservicesV1AggregatorInfo): Self = StObject.set(x, "aggregatorInfo", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setAggregatorInfoUndefined: Self = StObject.set(x, "aggregatorInfo", js.undefined)
          
          @scala.inline
          def setAverageFiveStarRating(value: Double): Self = StObject.set(x, "averageFiveStarRating", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setAverageFiveStarRatingUndefined: Self = StObject.set(x, "averageFiveStarRating", js.undefined)
          
          @scala.inline
          def setAverageWeeklyBudget(value: Double): Self = StObject.set(x, "averageWeeklyBudget", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setAverageWeeklyBudgetUndefined: Self = StObject.set(x, "averageWeeklyBudget", js.undefined)
          
          @scala.inline
          def setBusinessName(value: String): Self = StObject.set(x, "businessName", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setBusinessNameUndefined: Self = StObject.set(x, "businessName", js.undefined)
          
          @scala.inline
          def setCurrencyCode(value: String): Self = StObject.set(x, "currencyCode", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setCurrencyCodeUndefined: Self = StObject.set(x, "currencyCode", js.undefined)
          
          @scala.inline
          def setCurrentPeriodChargedLeads(value: String): Self = StObject.set(x, "currentPeriodChargedLeads", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setCurrentPeriodChargedLeadsUndefined: Self = StObject.set(x, "currentPeriodChargedLeads", js.undefined)
          
          @scala.inline
          def setCurrentPeriodConnectedPhoneCalls(value: String): Self = StObject.set(x, "currentPeriodConnectedPhoneCalls", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setCurrentPeriodConnectedPhoneCallsUndefined: Self = StObject.set(x, "currentPeriodConnectedPhoneCalls", js.undefined)
          
          @scala.inline
          def setCurrentPeriodPhoneCalls(value: String): Self = StObject.set(x, "currentPeriodPhoneCalls", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setCurrentPeriodPhoneCallsUndefined: Self = StObject.set(x, "currentPeriodPhoneCalls", js.undefined)
          
          @scala.inline
          def setCurrentPeriodTotalCost(value: Double): Self = StObject.set(x, "currentPeriodTotalCost", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setCurrentPeriodTotalCostUndefined: Self = StObject.set(x, "currentPeriodTotalCost", js.undefined)
          
          @scala.inline
          def setPhoneLeadResponsiveness(value: Double): Self = StObject.set(x, "phoneLeadResponsiveness", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setPhoneLeadResponsivenessUndefined: Self = StObject.set(x, "phoneLeadResponsiveness", js.undefined)
          
          @scala.inline
          def setPreviousPeriodChargedLeads(value: String): Self = StObject.set(x, "previousPeriodChargedLeads", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setPreviousPeriodChargedLeadsUndefined: Self = StObject.set(x, "previousPeriodChargedLeads", js.undefined)
          
          @scala.inline
          def setPreviousPeriodConnectedPhoneCalls(value: String): Self = StObject.set(x, "previousPeriodConnectedPhoneCalls", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setPreviousPeriodConnectedPhoneCallsUndefined: Self = StObject.set(x, "previousPeriodConnectedPhoneCalls", js.undefined)
          
          @scala.inline
          def setPreviousPeriodPhoneCalls(value: String): Self = StObject.set(x, "previousPeriodPhoneCalls", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setPreviousPeriodPhoneCallsUndefined: Self = StObject.set(x, "previousPeriodPhoneCalls", js.undefined)
          
          @scala.inline
          def setPreviousPeriodTotalCost(value: Double): Self = StObject.set(x, "previousPeriodTotalCost", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setPreviousPeriodTotalCostUndefined: Self = StObject.set(x, "previousPeriodTotalCost", js.undefined)
          
          @scala.inline
          def setTotalReview(value: Double): Self = StObject.set(x, "totalReview", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setTotalReviewUndefined: Self = StObject.set(x, "totalReview", js.undefined)
        }
      }
      
      @js.native
      trait GoogleAdsHomeservicesLocalservicesV1AggregatorInfo extends StObject {
        
        /** Provider id (listed in aggregator system) which maps to a account id in GLS system. */
        var aggregatorProviderId: js.UndefOr[String] = js.native
      }
      object GoogleAdsHomeservicesLocalservicesV1AggregatorInfo {
        
        @scala.inline
        def apply(): GoogleAdsHomeservicesLocalservicesV1AggregatorInfo = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[GoogleAdsHomeservicesLocalservicesV1AggregatorInfo]
        }
        
        @scala.inline
        implicit class GoogleAdsHomeservicesLocalservicesV1AggregatorInfoMutableBuilder[Self <: GoogleAdsHomeservicesLocalservicesV1AggregatorInfo] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setAggregatorProviderId(value: String): Self = StObject.set(x, "aggregatorProviderId", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setAggregatorProviderIdUndefined: Self = StObject.set(x, "aggregatorProviderId", js.undefined)
        }
      }
      
      @js.native
      trait GoogleAdsHomeservicesLocalservicesV1DetailedLeadReport extends StObject {
        
        /** Identifies account that received the lead. */
        var accountId: js.UndefOr[String] = js.native
        
        /** Aggregator specific information related to the lead. */
        var aggregatorInfo: js.UndefOr[GoogleAdsHomeservicesLocalservicesV1AggregatorInfo] = js.native
        
        /** Business name associated to the account. */
        var businessName: js.UndefOr[String] = js.native
        
        /** Whether the lead has been charged. */
        var chargeStatus: js.UndefOr[String] = js.native
        
        /** Currency code. */
        var currencyCode: js.UndefOr[String] = js.native
        
        /** Dispute status related to the lead. */
        var disputeStatus: js.UndefOr[String] = js.native
        
        /** Location of the associated account's home city. */
        var geo: js.UndefOr[String] = js.native
        
        /** Lead category (e.g. hvac, plumber) */
        var leadCategory: js.UndefOr[String] = js.native
        
        /** Timestamp of when the lead was created. */
        var leadCreationTimestamp: js.UndefOr[String] = js.native
        
        /** Unique identifier of a Detailed Lead Report. */
        var leadId: js.UndefOr[String] = js.native
        
        /** Price of the lead (available only after it has been charged). */
        var leadPrice: js.UndefOr[Double] = js.native
        
        /** Lead type. */
        var leadType: js.UndefOr[String] = js.native
        
        /** More information associated to only message leads. */
        var messageLead: js.UndefOr[GoogleAdsHomeservicesLocalservicesV1MessageLead] = js.native
        
        /** More information associated to only phone leads. */
        var phoneLead: js.UndefOr[GoogleAdsHomeservicesLocalservicesV1PhoneLead] = js.native
        
        /** Timezone of the particular provider associated to a lead. */
        var timezone: js.UndefOr[GoogleTypeTimeZone] = js.native
      }
      object GoogleAdsHomeservicesLocalservicesV1DetailedLeadReport {
        
        @scala.inline
        def apply(): GoogleAdsHomeservicesLocalservicesV1DetailedLeadReport = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[GoogleAdsHomeservicesLocalservicesV1DetailedLeadReport]
        }
        
        @scala.inline
        implicit class GoogleAdsHomeservicesLocalservicesV1DetailedLeadReportMutableBuilder[Self <: GoogleAdsHomeservicesLocalservicesV1DetailedLeadReport] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
          
          @scala.inline
          def setAggregatorInfo(value: GoogleAdsHomeservicesLocalservicesV1AggregatorInfo): Self = StObject.set(x, "aggregatorInfo", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setAggregatorInfoUndefined: Self = StObject.set(x, "aggregatorInfo", js.undefined)
          
          @scala.inline
          def setBusinessName(value: String): Self = StObject.set(x, "businessName", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setBusinessNameUndefined: Self = StObject.set(x, "businessName", js.undefined)
          
          @scala.inline
          def setChargeStatus(value: String): Self = StObject.set(x, "chargeStatus", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setChargeStatusUndefined: Self = StObject.set(x, "chargeStatus", js.undefined)
          
          @scala.inline
          def setCurrencyCode(value: String): Self = StObject.set(x, "currencyCode", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setCurrencyCodeUndefined: Self = StObject.set(x, "currencyCode", js.undefined)
          
          @scala.inline
          def setDisputeStatus(value: String): Self = StObject.set(x, "disputeStatus", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setDisputeStatusUndefined: Self = StObject.set(x, "disputeStatus", js.undefined)
          
          @scala.inline
          def setGeo(value: String): Self = StObject.set(x, "geo", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setGeoUndefined: Self = StObject.set(x, "geo", js.undefined)
          
          @scala.inline
          def setLeadCategory(value: String): Self = StObject.set(x, "leadCategory", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setLeadCategoryUndefined: Self = StObject.set(x, "leadCategory", js.undefined)
          
          @scala.inline
          def setLeadCreationTimestamp(value: String): Self = StObject.set(x, "leadCreationTimestamp", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setLeadCreationTimestampUndefined: Self = StObject.set(x, "leadCreationTimestamp", js.undefined)
          
          @scala.inline
          def setLeadId(value: String): Self = StObject.set(x, "leadId", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setLeadIdUndefined: Self = StObject.set(x, "leadId", js.undefined)
          
          @scala.inline
          def setLeadPrice(value: Double): Self = StObject.set(x, "leadPrice", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setLeadPriceUndefined: Self = StObject.set(x, "leadPrice", js.undefined)
          
          @scala.inline
          def setLeadType(value: String): Self = StObject.set(x, "leadType", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setLeadTypeUndefined: Self = StObject.set(x, "leadType", js.undefined)
          
          @scala.inline
          def setMessageLead(value: GoogleAdsHomeservicesLocalservicesV1MessageLead): Self = StObject.set(x, "messageLead", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setMessageLeadUndefined: Self = StObject.set(x, "messageLead", js.undefined)
          
          @scala.inline
          def setPhoneLead(value: GoogleAdsHomeservicesLocalservicesV1PhoneLead): Self = StObject.set(x, "phoneLead", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setPhoneLeadUndefined: Self = StObject.set(x, "phoneLead", js.undefined)
          
          @scala.inline
          def setTimezone(value: GoogleTypeTimeZone): Self = StObject.set(x, "timezone", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setTimezoneUndefined: Self = StObject.set(x, "timezone", js.undefined)
        }
      }
      
      @js.native
      trait GoogleAdsHomeservicesLocalservicesV1MessageLead extends StObject {
        
        /** Consumer phone number associated with the message lead. */
        var consumerPhoneNumber: js.UndefOr[String] = js.native
        
        /** Name of the customer who created the lead. */
        var customerName: js.UndefOr[String] = js.native
        
        /** The job type of the specified lead. */
        var jobType: js.UndefOr[String] = js.native
        
        /** The postal code of the customer who created the lead. */
        var postalCode: js.UndefOr[String] = js.native
      }
      object GoogleAdsHomeservicesLocalservicesV1MessageLead {
        
        @scala.inline
        def apply(): GoogleAdsHomeservicesLocalservicesV1MessageLead = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[GoogleAdsHomeservicesLocalservicesV1MessageLead]
        }
        
        @scala.inline
        implicit class GoogleAdsHomeservicesLocalservicesV1MessageLeadMutableBuilder[Self <: GoogleAdsHomeservicesLocalservicesV1MessageLead] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setConsumerPhoneNumber(value: String): Self = StObject.set(x, "consumerPhoneNumber", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setConsumerPhoneNumberUndefined: Self = StObject.set(x, "consumerPhoneNumber", js.undefined)
          
          @scala.inline
          def setCustomerName(value: String): Self = StObject.set(x, "customerName", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setCustomerNameUndefined: Self = StObject.set(x, "customerName", js.undefined)
          
          @scala.inline
          def setJobType(value: String): Self = StObject.set(x, "jobType", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setJobTypeUndefined: Self = StObject.set(x, "jobType", js.undefined)
          
          @scala.inline
          def setPostalCode(value: String): Self = StObject.set(x, "postalCode", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setPostalCodeUndefined: Self = StObject.set(x, "postalCode", js.undefined)
        }
      }
      
      @js.native
      trait GoogleAdsHomeservicesLocalservicesV1PhoneLead extends StObject {
        
        /** Timestamp of the phone call which resulted in a charged phone lead. */
        var chargedCallTimestamp: js.UndefOr[String] = js.native
        
        /** Duration of the charged phone call in seconds. */
        var chargedConnectedCallDurationSeconds: js.UndefOr[String] = js.native
        
        /** Consumer phone number associated with the phone lead. */
        var consumerPhoneNumber: js.UndefOr[String] = js.native
      }
      object GoogleAdsHomeservicesLocalservicesV1PhoneLead {
        
        @scala.inline
        def apply(): GoogleAdsHomeservicesLocalservicesV1PhoneLead = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[GoogleAdsHomeservicesLocalservicesV1PhoneLead]
        }
        
        @scala.inline
        implicit class GoogleAdsHomeservicesLocalservicesV1PhoneLeadMutableBuilder[Self <: GoogleAdsHomeservicesLocalservicesV1PhoneLead] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setChargedCallTimestamp(value: String): Self = StObject.set(x, "chargedCallTimestamp", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setChargedCallTimestampUndefined: Self = StObject.set(x, "chargedCallTimestamp", js.undefined)
          
          @scala.inline
          def setChargedConnectedCallDurationSeconds(value: String): Self = StObject.set(x, "chargedConnectedCallDurationSeconds", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setChargedConnectedCallDurationSecondsUndefined: Self = StObject.set(x, "chargedConnectedCallDurationSeconds", js.undefined)
          
          @scala.inline
          def setConsumerPhoneNumber(value: String): Self = StObject.set(x, "consumerPhoneNumber", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setConsumerPhoneNumberUndefined: Self = StObject.set(x, "consumerPhoneNumber", js.undefined)
        }
      }
      
      @js.native
      trait GoogleAdsHomeservicesLocalservicesV1SearchAccountReportsResponse extends StObject {
        
        /** List of account reports which maps 1:1 to a particular linked GLS account. */
        var accountReports: js.UndefOr[js.Array[GoogleAdsHomeservicesLocalservicesV1AccountReport]] = js.native
        
        /** Pagination token to retrieve the next page of results. When `next_page_token` is not filled in, there is no next page and the list returned is the last page in the result set. */
        var nextPageToken: js.UndefOr[String] = js.native
      }
      object GoogleAdsHomeservicesLocalservicesV1SearchAccountReportsResponse {
        
        @scala.inline
        def apply(): GoogleAdsHomeservicesLocalservicesV1SearchAccountReportsResponse = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[GoogleAdsHomeservicesLocalservicesV1SearchAccountReportsResponse]
        }
        
        @scala.inline
        implicit class GoogleAdsHomeservicesLocalservicesV1SearchAccountReportsResponseMutableBuilder[Self <: GoogleAdsHomeservicesLocalservicesV1SearchAccountReportsResponse] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setAccountReports(value: js.Array[GoogleAdsHomeservicesLocalservicesV1AccountReport]): Self = StObject.set(x, "accountReports", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setAccountReportsUndefined: Self = StObject.set(x, "accountReports", js.undefined)
          
          @scala.inline
          def setAccountReportsVarargs(value: GoogleAdsHomeservicesLocalservicesV1AccountReport*): Self = StObject.set(x, "accountReports", js.Array(value :_*))
          
          @scala.inline
          def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
        }
      }
      
      @js.native
      trait GoogleAdsHomeservicesLocalservicesV1SearchDetailedLeadReportsResponse extends StObject {
        
        /** List of detailed lead reports uniquely identified by external lead id. */
        var detailedLeadReports: js.UndefOr[js.Array[GoogleAdsHomeservicesLocalservicesV1DetailedLeadReport]] = js.native
        
        /** Pagination token to retrieve the next page of results. When `next_page_token` is not filled in, there is no next page and the list returned is the last page in the result set. */
        var nextPageToken: js.UndefOr[String] = js.native
      }
      object GoogleAdsHomeservicesLocalservicesV1SearchDetailedLeadReportsResponse {
        
        @scala.inline
        def apply(): GoogleAdsHomeservicesLocalservicesV1SearchDetailedLeadReportsResponse = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[GoogleAdsHomeservicesLocalservicesV1SearchDetailedLeadReportsResponse]
        }
        
        @scala.inline
        implicit class GoogleAdsHomeservicesLocalservicesV1SearchDetailedLeadReportsResponseMutableBuilder[Self <: GoogleAdsHomeservicesLocalservicesV1SearchDetailedLeadReportsResponse] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setDetailedLeadReports(value: js.Array[GoogleAdsHomeservicesLocalservicesV1DetailedLeadReport]): Self = StObject.set(x, "detailedLeadReports", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setDetailedLeadReportsUndefined: Self = StObject.set(x, "detailedLeadReports", js.undefined)
          
          @scala.inline
          def setDetailedLeadReportsVarargs(value: GoogleAdsHomeservicesLocalservicesV1DetailedLeadReport*): Self = StObject.set(x, "detailedLeadReports", js.Array(value :_*))
          
          @scala.inline
          def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
        }
      }
      
      @js.native
      trait GoogleTypeTimeZone extends StObject {
        
        /** IANA Time Zone Database time zone, e.g. "America/New_York". */
        var id: js.UndefOr[String] = js.native
        
        /** Optional. IANA Time Zone Database version number, e.g. "2019a". */
        var version: js.UndefOr[String] = js.native
      }
      object GoogleTypeTimeZone {
        
        @scala.inline
        def apply(): GoogleTypeTimeZone = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[GoogleTypeTimeZone]
        }
        
        @scala.inline
        implicit class GoogleTypeTimeZoneMutableBuilder[Self <: GoogleTypeTimeZone] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
          
          @scala.inline
          def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
        }
      }
    }
  }
}
