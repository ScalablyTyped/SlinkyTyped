package typingsSlinky.awsSdk.route53domainsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExtraParam extends js.Object {
  
  /**
    * The name of an additional parameter that is required by a top-level domain. Here are the top-level domains that require additional parameters and the names of the parameters that they require:  .com.au and .net.au     AU_ID_NUMBER     AU_ID_TYPE  Valid values include the following:    ABN (Australian business number)    ACN (Australian company number)    TM (Trademark number)      .ca     BRAND_NUMBER     CA_BUSINESS_ENTITY_TYPE  Valid values include the following:    BANK (Bank)    COMMERCIAL_COMPANY (Commercial company)    COMPANY (Company)    COOPERATION (Cooperation)    COOPERATIVE (Cooperative)    COOPRIX (Cooprix)    CORP (Corporation)    CREDIT_UNION (Credit union)    FOMIA (Federation of mutual insurance associations)    INC (Incorporated)    LTD (Limited)    LTEE (Limitée)    LLC (Limited liability corporation)    LLP (Limited liability partnership)    LTE (Lte.)    MBA (Mutual benefit association)    MIC (Mutual insurance company)    NFP (Not-for-profit corporation)    SA (S.A.)    SAVINGS_COMPANY (Savings company)    SAVINGS_UNION (Savings union)    SARL (Société à responsabilité limitée)    TRUST (Trust)    ULC (Unlimited liability corporation)      CA_LEGAL_TYPE  When ContactType is PERSON, valid values include the following:    ABO (Aboriginal Peoples indigenous to Canada)    CCT (Canadian citizen)    LGR (Legal Representative of a Canadian Citizen or Permanent Resident)    RES (Permanent resident of Canada)   When ContactType is a value other than PERSON, valid values include the following:    ASS (Canadian unincorporated association)    CCO (Canadian corporation)    EDU (Canadian educational institution)    GOV (Government or government entity in Canada)    HOP (Canadian Hospital)    INB (Indian Band recognized by the Indian Act of Canada)    LAM (Canadian Library, Archive, or Museum)    MAJ (Her/His Majesty the Queen/King)    OMK (Official mark registered in Canada)    PLT (Canadian Political Party)    PRT (Partnership Registered in Canada)    TDM (Trademark registered in Canada)    TRD (Canadian Trade Union)    TRS (Trust established in Canada)      .es     ES_IDENTIFICATION  Specify the applicable value:    For contacts inside Spain: Enter your passport ID.    For contacts outside of Spain: Enter the VAT identification number for the company.  For .es domains, the value of ContactType must be PERSON.       ES_IDENTIFICATION_TYPE  Valid values include the following:    DNI_AND_NIF (For Spanish contacts)    NIE (For foreigners with legal residence)    OTHER (For contacts outside of Spain)      ES_LEGAL_FORM  Valid values include the following:    ASSOCIATION     CENTRAL_GOVERNMENT_BODY     CIVIL_SOCIETY     COMMUNITY_OF_OWNERS     COMMUNITY_PROPERTY     CONSULATE     COOPERATIVE     DESIGNATION_OF_ORIGIN_SUPERVISORY_COUNCIL     ECONOMIC_INTEREST_GROUP     EMBASSY     ENTITY_MANAGING_NATURAL_AREAS     FARM_PARTNERSHIP     FOUNDATION     GENERAL_AND_LIMITED_PARTNERSHIP     GENERAL_PARTNERSHIP     INDIVIDUAL     LIMITED_COMPANY     LOCAL_AUTHORITY     LOCAL_PUBLIC_ENTITY     MUTUAL_INSURANCE_COMPANY     NATIONAL_PUBLIC_ENTITY     ORDER_OR_RELIGIOUS_INSTITUTION     OTHERS (Only for contacts outside of Spain)     POLITICAL_PARTY     PROFESSIONAL_ASSOCIATION     PUBLIC_LAW_ASSOCIATION     PUBLIC_LIMITED_COMPANY     REGIONAL_GOVERNMENT_BODY     REGIONAL_PUBLIC_ENTITY     SAVINGS_BANK     SPANISH_OFFICE     SPORTS_ASSOCIATION     SPORTS_FEDERATION     SPORTS_LIMITED_COMPANY     TEMPORARY_ALLIANCE_OF_ENTERPRISES     TRADE_UNION     WORKER_OWNED_COMPANY     WORKER_OWNED_LIMITED_COMPANY       .fi     BIRTH_DATE_IN_YYYY_MM_DD     FI_BUSINESS_NUMBER     FI_ID_NUMBER     FI_NATIONALITY  Valid values include the following:    FINNISH     NOT_FINNISH       FI_ORGANIZATION_TYPE  Valid values include the following:    COMPANY     CORPORATION     GOVERNMENT     INSTITUTION     POLITICAL_PARTY     PUBLIC_COMMUNITY     TOWNSHIP       .fr     BIRTH_CITY     BIRTH_COUNTRY     BIRTH_DATE_IN_YYYY_MM_DD     BIRTH_DEPARTMENT: Specify the INSEE code that corresponds with the department where the contact was born. If the contact was born somewhere other than France or its overseas departments, specify 99. For more information, including a list of departments and the corresponding INSEE numbers, see the Wikipedia entry Departments of France.    BRAND_NUMBER     .it     IT_NATIONALITY     IT_PIN     IT_REGISTRANT_ENTITY_TYPE  Valid values include the following:    FOREIGNERS     FREELANCE_WORKERS (Freelance workers and professionals)    ITALIAN_COMPANIES (Italian companies and one-person companies)    NON_PROFIT_ORGANIZATIONS     OTHER_SUBJECTS     PUBLIC_ORGANIZATIONS       .ru     BIRTH_DATE_IN_YYYY_MM_DD     RU_PASSPORT_DATA     .se     BIRTH_COUNTRY     SE_ID_NUMBER     .sg     SG_ID_NUMBER     .co.uk, .me.uk, and .org.uk     UK_CONTACT_TYPE  Valid values include the following:    CRC (UK Corporation by Royal Charter)    FCORP (Non-UK Corporation)    FIND (Non-UK Individual, representing self)    FOTHER (Non-UK Entity that does not fit into any other category)    GOV (UK Government Body)    IND (UK Individual (representing self))    IP (UK Industrial/Provident Registered Company)    LLP (UK Limited Liability Partnership)    LTD (UK Limited Company)    OTHER (UK Entity that does not fit into any other category)    PLC (UK Public Limited Company)    PTNR (UK Partnership)    RCHAR (UK Registered Charity)    SCH (UK School)    STAT (UK Statutory Body)    STRA (UK Sole Trader)      UK_COMPANY_NUMBER      In addition, many TLDs require a VAT_NUMBER.
    */
  var Name: ExtraParamName = js.native
  
  /**
    * The value that corresponds with the name of an extra parameter.
    */
  var Value: ExtraParamValue = js.native
}
object ExtraParam {
  
  @scala.inline
  def apply(Name: ExtraParamName, Value: ExtraParamValue): ExtraParam = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtraParam]
  }
  
  @scala.inline
  implicit class ExtraParamOps[Self <: ExtraParam] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setName(value: ExtraParamName): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: ExtraParamValue): Self = this.set("Value", value.asInstanceOf[js.Any])
  }
}
