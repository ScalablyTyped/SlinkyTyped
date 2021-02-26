package typingsSlinky.maximMazurokGapiClientVault.gapi.client.vault

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Query extends StObject {
  
  /** When 'ACCOUNT' is chosen as search method, account_info needs to be specified. */
  var accountInfo: js.UndefOr[AccountInfo] = js.native
  
  /** The corpus to search. */
  var corpus: js.UndefOr[String] = js.native
  
  /** The data source to search from. */
  var dataScope: js.UndefOr[String] = js.native
  
  /** For Drive search, specify more options in this field. */
  var driveOptions: js.UndefOr[DriveOptions] = js.native
  
  /** The end time range for the search query. These timestamps are in GMT and rounded down to the start of the given date. */
  var endTime: js.UndefOr[String] = js.native
  
  /** When 'ROOM' is chosen as search method, hangout_chats_info needs to be specified. (read-only) */
  var hangoutsChatInfo: js.UndefOr[HangoutsChatInfo] = js.native
  
  /** For hangouts chat search, specify more options in this field. (read-only) */
  var hangoutsChatOptions: js.UndefOr[HangoutsChatOptions] = js.native
  
  /** For mail search, specify more options in this field. */
  var mailOptions: js.UndefOr[MailOptions] = js.native
  
  /**
    * The search method to use. This field is similar to the search_method field but is introduced to support shared drives. It supports all search method types. In case the search_method
    * is TEAM_DRIVE the response of this field will be SHARED_DRIVE only.
    */
  var method: js.UndefOr[String] = js.native
  
  /** When 'ORG_UNIT' is chosen as as search method, org_unit_info needs to be specified. */
  var orgUnitInfo: js.UndefOr[OrgUnitInfo] = js.native
  
  /** The search method to use. */
  var searchMethod: js.UndefOr[String] = js.native
  
  /** When 'SHARED_DRIVE' is chosen as search method, shared_drive_info needs to be specified. */
  var sharedDriveInfo: js.UndefOr[SharedDriveInfo] = js.native
  
  /** The start time range for the search query. These timestamps are in GMT and rounded down to the start of the given date. */
  var startTime: js.UndefOr[String] = js.native
  
  /** When 'TEAM_DRIVE' is chosen as search method, team_drive_info needs to be specified. */
  var teamDriveInfo: js.UndefOr[TeamDriveInfo] = js.native
  
  /** The corpus-specific search operators used to generate search results. */
  var terms: js.UndefOr[String] = js.native
  
  /** The time zone name. It should be an IANA TZ name, such as "America/Los_Angeles". For more information, see Time Zone. */
  var timeZone: js.UndefOr[String] = js.native
}
object Query {
  
  @scala.inline
  def apply(): Query = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Query]
  }
  
  @scala.inline
  implicit class QueryMutableBuilder[Self <: Query] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccountInfo(value: AccountInfo): Self = StObject.set(x, "accountInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccountInfoUndefined: Self = StObject.set(x, "accountInfo", js.undefined)
    
    @scala.inline
    def setCorpus(value: String): Self = StObject.set(x, "corpus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCorpusUndefined: Self = StObject.set(x, "corpus", js.undefined)
    
    @scala.inline
    def setDataScope(value: String): Self = StObject.set(x, "dataScope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataScopeUndefined: Self = StObject.set(x, "dataScope", js.undefined)
    
    @scala.inline
    def setDriveOptions(value: DriveOptions): Self = StObject.set(x, "driveOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDriveOptionsUndefined: Self = StObject.set(x, "driveOptions", js.undefined)
    
    @scala.inline
    def setEndTime(value: String): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
    
    @scala.inline
    def setHangoutsChatInfo(value: HangoutsChatInfo): Self = StObject.set(x, "hangoutsChatInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHangoutsChatInfoUndefined: Self = StObject.set(x, "hangoutsChatInfo", js.undefined)
    
    @scala.inline
    def setHangoutsChatOptions(value: HangoutsChatOptions): Self = StObject.set(x, "hangoutsChatOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHangoutsChatOptionsUndefined: Self = StObject.set(x, "hangoutsChatOptions", js.undefined)
    
    @scala.inline
    def setMailOptions(value: MailOptions): Self = StObject.set(x, "mailOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMailOptionsUndefined: Self = StObject.set(x, "mailOptions", js.undefined)
    
    @scala.inline
    def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
    
    @scala.inline
    def setOrgUnitInfo(value: OrgUnitInfo): Self = StObject.set(x, "orgUnitInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrgUnitInfoUndefined: Self = StObject.set(x, "orgUnitInfo", js.undefined)
    
    @scala.inline
    def setSearchMethod(value: String): Self = StObject.set(x, "searchMethod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSearchMethodUndefined: Self = StObject.set(x, "searchMethod", js.undefined)
    
    @scala.inline
    def setSharedDriveInfo(value: SharedDriveInfo): Self = StObject.set(x, "sharedDriveInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSharedDriveInfoUndefined: Self = StObject.set(x, "sharedDriveInfo", js.undefined)
    
    @scala.inline
    def setStartTime(value: String): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
    
    @scala.inline
    def setTeamDriveInfo(value: TeamDriveInfo): Self = StObject.set(x, "teamDriveInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTeamDriveInfoUndefined: Self = StObject.set(x, "teamDriveInfo", js.undefined)
    
    @scala.inline
    def setTerms(value: String): Self = StObject.set(x, "terms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTermsUndefined: Self = StObject.set(x, "terms", js.undefined)
    
    @scala.inline
    def setTimeZone(value: String): Self = StObject.set(x, "timeZone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeZoneUndefined: Self = StObject.set(x, "timeZone", js.undefined)
  }
}
