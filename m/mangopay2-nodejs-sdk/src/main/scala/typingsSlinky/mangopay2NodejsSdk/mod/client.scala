package typingsSlinky.mangopay2NodejsSdk.mod

import typingsSlinky.mangopay2NodejsSdk.mod.address.AddressType
import typingsSlinky.mangopay2NodejsSdk.mod.entityBase.EntityBaseData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object client {
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MARKETPLACE
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CROWDFUNDING
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.FRANCHISE
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.OTHER
  */
  trait BusinessType extends StObject
  object BusinessType {
    
    @scala.inline
    def CROWDFUNDING: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CROWDFUNDING = "CROWDFUNDING".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CROWDFUNDING]
    
    @scala.inline
    def FRANCHISE: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.FRANCHISE = "FRANCHISE".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.FRANCHISE]
    
    @scala.inline
    def MARKETPLACE: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MARKETPLACE = "MARKETPLACE".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MARKETPLACE]
    
    @scala.inline
    def OTHER: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.OTHER = "OTHER".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.OTHER]
  }
  
  @js.native
  trait ClientData extends EntityBaseData {
    
    /**
      * A list of email addresses to use when contacting you for admin/commercial issues/communications
      */
    var AdminEmails: js.Array[String] = js.native
    
    /**
      * A list of email addresses to use when contacting you for billing issues/communications
      */
    var BillingEmails: js.Array[String] = js.native
    
    /**
      * An ID for the client (i.e. url friendly, lowercase etc - sort of namespace identifier)
      */
    var ClientId: String = js.native
    
    /**
      * Your unique MANGOPAY reference which you should use when contacting us
      */
    var CompanyReference: String = js.native
    
    /**
      * A list of email addresses to use when contacting you for fraud/compliance issues/communications
      */
    var FraudEmails: js.Array[String] = js.native
    
    /**
      * The address of the company’s headquarters
      */
    var HeadquartersAddress: AddressType = js.native
    
    /**
      * The URL of the logo of your client
      */
    var Logo: String = js.native
    
    /**
      * The pretty name for the client
      */
    var Name: String = js.native
    
    /**
      * The Categorization of your platform, in terms of Business Type and Sector
      */
    var PlatformCategorization: typingsSlinky.mangopay2NodejsSdk.mod.client.PlatformCategorization = js.native
    
    /**
      * A description of what your platform does
      */
    var PlatformDescription: String = js.native
    
    /**
      * The URL for your website
      */
    var PlatformURL: String = js.native
    
    /**
      * The primary branding colour to use for buttons for your merchant
      */
    var PrimaryButtonColour: String = js.native
    
    /**
      * The primary branding colour to use for your merchant
      */
    var PrimaryThemeColour: String = js.native
    
    /**
      * The registered name of your company
      */
    var RegisteredName: String = js.native
    
    /**
      * The tax (or VAT) number for your company
      */
    var TaxNumber: String = js.native
    
    /**
      * A list of email addresses to use when contacting you for technical issues/communications
      */
    var TechEmails: js.Array[String] = js.native
  }
  object ClientData {
    
    @scala.inline
    def apply(
      AdminEmails: js.Array[String],
      BillingEmails: js.Array[String],
      ClientId: String,
      CompanyReference: String,
      CreationDate: Double,
      FraudEmails: js.Array[String],
      HeadquartersAddress: AddressType,
      Id: String,
      Logo: String,
      Name: String,
      PlatformCategorization: PlatformCategorization,
      PlatformDescription: String,
      PlatformURL: String,
      PrimaryButtonColour: String,
      PrimaryThemeColour: String,
      RegisteredName: String,
      Tag: String,
      TaxNumber: String,
      TechEmails: js.Array[String]
    ): ClientData = {
      val __obj = js.Dynamic.literal(AdminEmails = AdminEmails.asInstanceOf[js.Any], BillingEmails = BillingEmails.asInstanceOf[js.Any], ClientId = ClientId.asInstanceOf[js.Any], CompanyReference = CompanyReference.asInstanceOf[js.Any], CreationDate = CreationDate.asInstanceOf[js.Any], FraudEmails = FraudEmails.asInstanceOf[js.Any], HeadquartersAddress = HeadquartersAddress.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], Logo = Logo.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], PlatformCategorization = PlatformCategorization.asInstanceOf[js.Any], PlatformDescription = PlatformDescription.asInstanceOf[js.Any], PlatformURL = PlatformURL.asInstanceOf[js.Any], PrimaryButtonColour = PrimaryButtonColour.asInstanceOf[js.Any], PrimaryThemeColour = PrimaryThemeColour.asInstanceOf[js.Any], RegisteredName = RegisteredName.asInstanceOf[js.Any], Tag = Tag.asInstanceOf[js.Any], TaxNumber = TaxNumber.asInstanceOf[js.Any], TechEmails = TechEmails.asInstanceOf[js.Any])
      __obj.asInstanceOf[ClientData]
    }
    
    @scala.inline
    implicit class ClientDataMutableBuilder[Self <: ClientData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAdminEmails(value: js.Array[String]): Self = StObject.set(x, "AdminEmails", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAdminEmailsVarargs(value: String*): Self = StObject.set(x, "AdminEmails", js.Array(value :_*))
      
      @scala.inline
      def setBillingEmails(value: js.Array[String]): Self = StObject.set(x, "BillingEmails", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBillingEmailsVarargs(value: String*): Self = StObject.set(x, "BillingEmails", js.Array(value :_*))
      
      @scala.inline
      def setClientId(value: String): Self = StObject.set(x, "ClientId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCompanyReference(value: String): Self = StObject.set(x, "CompanyReference", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFraudEmails(value: js.Array[String]): Self = StObject.set(x, "FraudEmails", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFraudEmailsVarargs(value: String*): Self = StObject.set(x, "FraudEmails", js.Array(value :_*))
      
      @scala.inline
      def setHeadquartersAddress(value: AddressType): Self = StObject.set(x, "HeadquartersAddress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLogo(value: String): Self = StObject.set(x, "Logo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlatformCategorization(value: PlatformCategorization): Self = StObject.set(x, "PlatformCategorization", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlatformDescription(value: String): Self = StObject.set(x, "PlatformDescription", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlatformURL(value: String): Self = StObject.set(x, "PlatformURL", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrimaryButtonColour(value: String): Self = StObject.set(x, "PrimaryButtonColour", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrimaryThemeColour(value: String): Self = StObject.set(x, "PrimaryThemeColour", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRegisteredName(value: String): Self = StObject.set(x, "RegisteredName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTaxNumber(value: String): Self = StObject.set(x, "TaxNumber", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTechEmails(value: js.Array[String]): Self = StObject.set(x, "TechEmails", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTechEmailsVarargs(value: String*): Self = StObject.set(x, "TechEmails", js.Array(value :_*))
    }
  }
  
  @js.native
  trait PlatformCategorization extends StObject {
    
    var BusinessType: typingsSlinky.mangopay2NodejsSdk.mod.client.BusinessType = js.native
    
    var Sector: typingsSlinky.mangopay2NodejsSdk.mod.client.Sector = js.native
  }
  object PlatformCategorization {
    
    @scala.inline
    def apply(BusinessType: BusinessType, Sector: Sector): PlatformCategorization = {
      val __obj = js.Dynamic.literal(BusinessType = BusinessType.asInstanceOf[js.Any], Sector = Sector.asInstanceOf[js.Any])
      __obj.asInstanceOf[PlatformCategorization]
    }
    
    @scala.inline
    implicit class PlatformCategorizationMutableBuilder[Self <: PlatformCategorization] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBusinessType(value: BusinessType): Self = StObject.set(x, "BusinessType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSector(value: Sector): Self = StObject.set(x, "Sector", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined mangopay2-nodejs-sdk.mangopay2-nodejs-sdk/types.ValueOf<mangopay2-nodejs-sdk.mangopay2-nodejs-sdk.IPlatformType> */
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CROWDFUNDING_LOAN
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.NotSpecified
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CROWDFUNDING_EQUITY
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CROWDFUNDING_REWARD
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CROWDFUNDING_DONATION
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.P2P_PAYMENT
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.OTHER
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MARKETPLACE
  */
  trait PlatformType extends StObject
  object PlatformType {
    
    @scala.inline
    def CROWDFUNDING_DONATION: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CROWDFUNDING_DONATION = "CROWDFUNDING_DONATION".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CROWDFUNDING_DONATION]
    
    @scala.inline
    def CROWDFUNDING_EQUITY: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CROWDFUNDING_EQUITY = "CROWDFUNDING_EQUITY".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CROWDFUNDING_EQUITY]
    
    @scala.inline
    def CROWDFUNDING_LOAN: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CROWDFUNDING_LOAN = "CROWDFUNDING_LOAN".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CROWDFUNDING_LOAN]
    
    @scala.inline
    def CROWDFUNDING_REWARD: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CROWDFUNDING_REWARD = "CROWDFUNDING_REWARD".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CROWDFUNDING_REWARD]
    
    @scala.inline
    def MARKETPLACE: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MARKETPLACE = "MARKETPLACE".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MARKETPLACE]
    
    @scala.inline
    def NotSpecified: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.NotSpecified = "NotSpecified".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.NotSpecified]
    
    @scala.inline
    def OTHER: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.OTHER = "OTHER".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.OTHER]
    
    @scala.inline
    def P2P_PAYMENT: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.P2P_PAYMENT = "P2P_PAYMENT".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.P2P_PAYMENT]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.RENTALS
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.STORES_FASHION_ACCESSORIES_OBJECTS
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BEAUTY_COSMETICS_HEALTH
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.FOOD_WINE_RESTAURANTS
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.HOSPITALITY_TRAVEL_CORIDING
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.ART_MUSIC_ENTERTAINMENT
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.FURNITURE_GARDEN
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SERVICES_JOBBING_EDUCATION
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SPORT_RECREATION_ACTIVITIES
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.TICKETING
  */
  trait Sector extends StObject
  object Sector {
    
    @scala.inline
    def ART_MUSIC_ENTERTAINMENT: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.ART_MUSIC_ENTERTAINMENT = "ART_MUSIC_ENTERTAINMENT".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.ART_MUSIC_ENTERTAINMENT]
    
    @scala.inline
    def BEAUTY_COSMETICS_HEALTH: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BEAUTY_COSMETICS_HEALTH = "BEAUTY_COSMETICS_HEALTH".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BEAUTY_COSMETICS_HEALTH]
    
    @scala.inline
    def FOOD_WINE_RESTAURANTS: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.FOOD_WINE_RESTAURANTS = "FOOD_WINE_RESTAURANTS".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.FOOD_WINE_RESTAURANTS]
    
    @scala.inline
    def FURNITURE_GARDEN: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.FURNITURE_GARDEN = "FURNITURE_GARDEN".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.FURNITURE_GARDEN]
    
    @scala.inline
    def HOSPITALITY_TRAVEL_CORIDING: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.HOSPITALITY_TRAVEL_CORIDING = "HOSPITALITY_TRAVEL_CORIDING".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.HOSPITALITY_TRAVEL_CORIDING]
    
    @scala.inline
    def RENTALS: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.RENTALS = "RENTALS".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.RENTALS]
    
    @scala.inline
    def SERVICES_JOBBING_EDUCATION: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SERVICES_JOBBING_EDUCATION = "SERVICES_JOBBING_EDUCATION".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SERVICES_JOBBING_EDUCATION]
    
    @scala.inline
    def SPORT_RECREATION_ACTIVITIES: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SPORT_RECREATION_ACTIVITIES = "SPORT_RECREATION_ACTIVITIES".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SPORT_RECREATION_ACTIVITIES]
    
    @scala.inline
    def STORES_FASHION_ACCESSORIES_OBJECTS: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.STORES_FASHION_ACCESSORIES_OBJECTS = "STORES_FASHION_ACCESSORIES_OBJECTS".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.STORES_FASHION_ACCESSORIES_OBJECTS]
    
    @scala.inline
    def TICKETING: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.TICKETING = "TICKETING".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.TICKETING]
  }
  
  @js.native
  trait UpdateClient extends StObject {
    
    /**
      * A list of email addresses to use when contacting you for admin/commercial issues/communications
      */
    var AdminEmails: js.UndefOr[js.Array[String]] = js.native
    
    /**
      * A list of email addresses to use when contacting you for billing issues/communications
      */
    var BillingEmails: js.UndefOr[js.Array[String]] = js.native
    
    /**
      * A list of email addresses to use when contacting you for fraud/compliance issues/communications
      */
    var FraudEmails: js.UndefOr[js.Array[String]] = js.native
    
    /**
      * The address of the company’s headquarters
      */
    var HeadquartersAddress: js.UndefOr[AddressType] = js.native
    
    /**
      * A description of what your platform does
      */
    var PlatformDescription: js.UndefOr[String] = js.native
    
    /**
      * The type of platform
      */
    var PlatformType: js.UndefOr[typingsSlinky.mangopay2NodejsSdk.mod.client.PlatformType] = js.native
    
    /**
      * The URL for your website
      */
    var PlatformURL: js.UndefOr[String] = js.native
    
    /**
      * The primary branding colour to use for buttons for your merchant
      */
    var PrimaryButtonColour: js.UndefOr[String] = js.native
    
    /**
      * The primary branding colour to use for your merchant
      */
    var PrimaryThemeColour: js.UndefOr[String] = js.native
    
    /**
      * The tax (or VAT) number for your company
      */
    var TaxNumber: js.UndefOr[String] = js.native
    
    /**
      * A list of email addresses to use when contacting you for technical issues/communications
      */
    var TechEmails: js.UndefOr[js.Array[String]] = js.native
  }
  object UpdateClient {
    
    @scala.inline
    def apply(): UpdateClient = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UpdateClient]
    }
    
    @scala.inline
    implicit class UpdateClientMutableBuilder[Self <: UpdateClient] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAdminEmails(value: js.Array[String]): Self = StObject.set(x, "AdminEmails", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAdminEmailsUndefined: Self = StObject.set(x, "AdminEmails", js.undefined)
      
      @scala.inline
      def setAdminEmailsVarargs(value: String*): Self = StObject.set(x, "AdminEmails", js.Array(value :_*))
      
      @scala.inline
      def setBillingEmails(value: js.Array[String]): Self = StObject.set(x, "BillingEmails", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBillingEmailsUndefined: Self = StObject.set(x, "BillingEmails", js.undefined)
      
      @scala.inline
      def setBillingEmailsVarargs(value: String*): Self = StObject.set(x, "BillingEmails", js.Array(value :_*))
      
      @scala.inline
      def setFraudEmails(value: js.Array[String]): Self = StObject.set(x, "FraudEmails", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFraudEmailsUndefined: Self = StObject.set(x, "FraudEmails", js.undefined)
      
      @scala.inline
      def setFraudEmailsVarargs(value: String*): Self = StObject.set(x, "FraudEmails", js.Array(value :_*))
      
      @scala.inline
      def setHeadquartersAddress(value: AddressType): Self = StObject.set(x, "HeadquartersAddress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeadquartersAddressUndefined: Self = StObject.set(x, "HeadquartersAddress", js.undefined)
      
      @scala.inline
      def setPlatformDescription(value: String): Self = StObject.set(x, "PlatformDescription", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlatformDescriptionUndefined: Self = StObject.set(x, "PlatformDescription", js.undefined)
      
      @scala.inline
      def setPlatformType(value: PlatformType): Self = StObject.set(x, "PlatformType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlatformTypeUndefined: Self = StObject.set(x, "PlatformType", js.undefined)
      
      @scala.inline
      def setPlatformURL(value: String): Self = StObject.set(x, "PlatformURL", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlatformURLUndefined: Self = StObject.set(x, "PlatformURL", js.undefined)
      
      @scala.inline
      def setPrimaryButtonColour(value: String): Self = StObject.set(x, "PrimaryButtonColour", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrimaryButtonColourUndefined: Self = StObject.set(x, "PrimaryButtonColour", js.undefined)
      
      @scala.inline
      def setPrimaryThemeColour(value: String): Self = StObject.set(x, "PrimaryThemeColour", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrimaryThemeColourUndefined: Self = StObject.set(x, "PrimaryThemeColour", js.undefined)
      
      @scala.inline
      def setTaxNumber(value: String): Self = StObject.set(x, "TaxNumber", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTaxNumberUndefined: Self = StObject.set(x, "TaxNumber", js.undefined)
      
      @scala.inline
      def setTechEmails(value: js.Array[String]): Self = StObject.set(x, "TechEmails", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTechEmailsUndefined: Self = StObject.set(x, "TechEmails", js.undefined)
      
      @scala.inline
      def setTechEmailsVarargs(value: String*): Self = StObject.set(x, "TechEmails", js.Array(value :_*))
    }
  }
  
  @js.native
  trait UpdateClientLogo extends StObject {
    
    /**
      * The base64 encoded file which needs to be uploaded
      */
    var File: String = js.native
  }
  object UpdateClientLogo {
    
    @scala.inline
    def apply(File: String): UpdateClientLogo = {
      val __obj = js.Dynamic.literal(File = File.asInstanceOf[js.Any])
      __obj.asInstanceOf[UpdateClientLogo]
    }
    
    @scala.inline
    implicit class UpdateClientLogoMutableBuilder[Self <: UpdateClientLogo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFile(value: String): Self = StObject.set(x, "File", value.asInstanceOf[js.Any])
    }
  }
}
