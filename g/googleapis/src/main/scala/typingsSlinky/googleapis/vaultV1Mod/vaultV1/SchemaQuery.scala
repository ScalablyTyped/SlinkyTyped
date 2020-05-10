package typingsSlinky.googleapis.vaultV1Mod.vaultV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A query definition relevant for search &amp; export.
  */
@js.native
trait SchemaQuery extends js.Object {
  /**
    * When &#39;ACCOUNT&#39; is chosen as search method, account_info needs to
    * be specified.
    */
  var accountInfo: js.UndefOr[SchemaAccountInfo] = js.native
  /**
    * The corpus to search.
    */
  var corpus: js.UndefOr[String] = js.native
  /**
    * The data source to search from.
    */
  var dataScope: js.UndefOr[String] = js.native
  /**
    * For Drive search, specify more options in this field.
    */
  var driveOptions: js.UndefOr[SchemaDriveOptions] = js.native
  /**
    * The end time range for the search query. These timestamps are in GMT and
    * rounded down to the start of the given date.
    */
  var endTime: js.UndefOr[String] = js.native
  /**
    * When &#39;ROOM&#39; is chosen as search method, hangout_chats_info needs
    * to be specified. (read-only)
    */
  var hangoutsChatInfo: js.UndefOr[SchemaHangoutsChatInfo] = js.native
  /**
    * For hangouts chat search, specify more options in this field. (read-only)
    */
  var hangoutsChatOptions: js.UndefOr[SchemaHangoutsChatOptions] = js.native
  /**
    * For mail search, specify more options in this field.
    */
  var mailOptions: js.UndefOr[SchemaMailOptions] = js.native
  /**
    * When &#39;ORG_UNIT&#39; is chosen as as search method, org_unit_info
    * needs to be specified.
    */
  var orgUnitInfo: js.UndefOr[SchemaOrgUnitInfo] = js.native
  /**
    * The search method to use.
    */
  var searchMethod: js.UndefOr[String] = js.native
  /**
    * The start time range for the search query. These timestamps are in GMT
    * and rounded down to the start of the given date.
    */
  var startTime: js.UndefOr[String] = js.native
  /**
    * When &#39;TEAM_DRIVE&#39; is chosen as search method, team_drive_info
    * needs to be specified.
    */
  var teamDriveInfo: js.UndefOr[SchemaTeamDriveInfo] = js.native
  /**
    * The corpus-specific &lt;a
    * href=&quot;https://support.google.com/vault/answer/2474474&quot;&gt;search
    * operators&lt;/a&gt; used to generate search results.
    */
  var terms: js.UndefOr[String] = js.native
  /**
    * The time zone name. It should be an IANA TZ name, such as
    * &quot;America/Los_Angeles&quot;. For more information, see &lt;a
    * href=&quot;https://en.wikipedia.org/wiki/List_of_tz_database_time_zones&quot;&gt;Time
    * Zone&lt;/a&gt;.
    */
  var timeZone: js.UndefOr[String] = js.native
}

object SchemaQuery {
  @scala.inline
  def apply(): SchemaQuery = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaQuery]
  }
  @scala.inline
  implicit class SchemaQueryOps[Self <: SchemaQuery] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccountInfo(value: SchemaAccountInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accountInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccountInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accountInfo")(js.undefined)
        ret
    }
    @scala.inline
    def withCorpus(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("corpus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCorpus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("corpus")(js.undefined)
        ret
    }
    @scala.inline
    def withDataScope(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataScope")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataScope: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataScope")(js.undefined)
        ret
    }
    @scala.inline
    def withDriveOptions(value: SchemaDriveOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("driveOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDriveOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("driveOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withEndTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endTime")(js.undefined)
        ret
    }
    @scala.inline
    def withHangoutsChatInfo(value: SchemaHangoutsChatInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hangoutsChatInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHangoutsChatInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hangoutsChatInfo")(js.undefined)
        ret
    }
    @scala.inline
    def withHangoutsChatOptions(value: SchemaHangoutsChatOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hangoutsChatOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHangoutsChatOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hangoutsChatOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withMailOptions(value: SchemaMailOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mailOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMailOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mailOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withOrgUnitInfo(value: SchemaOrgUnitInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orgUnitInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrgUnitInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orgUnitInfo")(js.undefined)
        ret
    }
    @scala.inline
    def withSearchMethod(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchMethod")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSearchMethod: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchMethod")(js.undefined)
        ret
    }
    @scala.inline
    def withStartTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startTime")(js.undefined)
        ret
    }
    @scala.inline
    def withTeamDriveInfo(value: SchemaTeamDriveInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("teamDriveInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTeamDriveInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("teamDriveInfo")(js.undefined)
        ret
    }
    @scala.inline
    def withTerms(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("terms")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTerms: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("terms")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeZone(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeZone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeZone: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeZone")(js.undefined)
        ret
    }
  }
  
}

