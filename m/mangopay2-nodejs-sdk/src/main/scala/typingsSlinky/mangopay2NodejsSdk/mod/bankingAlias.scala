package typingsSlinky.mangopay2NodejsSdk.mod

import typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.IBAN
import typingsSlinky.mangopay2NodejsSdk.mod.entityBase.EntityBaseData
import typingsSlinky.mangopay2NodejsSdk.typesMod.CountryISO
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object bankingAlias {
  
  @js.native
  trait BankingAliasData extends EntityBaseData {
    
    /**
      * Whether the banking alias is active or not
      */
    var Active: Boolean = js.native
    
    /**
      * The Country of the Address
      */
    var Country: CountryISO = js.native
    
    /**
      * The user ID who is credited (defaults to the owner of the wallet)
      */
    var CreditedUserId: String = js.native
    
    /**
      * The owner of the wallet/banking alias
      */
    var OwnerName: String = js.native
    
    /**
      * The type of banking alias (note that only IBAN is available at present)
      */
    var Type: BankingAliasType = js.native
    
    /**
      * The ID of a wallet
      */
    var WalletId: String = js.native
  }
  object BankingAliasData {
    
    @scala.inline
    def apply(
      Active: Boolean,
      Country: CountryISO,
      CreationDate: Double,
      CreditedUserId: String,
      Id: String,
      OwnerName: String,
      Tag: String,
      Type: BankingAliasType,
      WalletId: String
    ): BankingAliasData = {
      val __obj = js.Dynamic.literal(Active = Active.asInstanceOf[js.Any], Country = Country.asInstanceOf[js.Any], CreationDate = CreationDate.asInstanceOf[js.Any], CreditedUserId = CreditedUserId.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], OwnerName = OwnerName.asInstanceOf[js.Any], Tag = Tag.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any], WalletId = WalletId.asInstanceOf[js.Any])
      __obj.asInstanceOf[BankingAliasData]
    }
    
    @scala.inline
    implicit class BankingAliasDataMutableBuilder[Self <: BankingAliasData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActive(value: Boolean): Self = StObject.set(x, "Active", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCountry(value: CountryISO): Self = StObject.set(x, "Country", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCreditedUserId(value: String): Self = StObject.set(x, "CreditedUserId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOwnerName(value: String): Self = StObject.set(x, "OwnerName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: BankingAliasType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWalletId(value: String): Self = StObject.set(x, "WalletId", value.asInstanceOf[js.Any])
    }
  }
  
  type BankingAliasType = IBAN
  
  /* Inlined parent mangopay2-nodejs-sdk.mangopay2-nodejs-sdk/types.PickPartialRequired<mangopay2-nodejs-sdk.mangopay2-nodejs-sdk.bankingAlias.IBANBankingAliasData, 'Tag' | 'CreditedUserId', 'OwnerName' | 'Country'> */
  @js.native
  trait CreateIBANBankingAlias extends StObject {
    
    var Country: CountryISO = js.native
    
    var CreditedUserId: js.UndefOr[String] = js.native
    
    var OwnerName: String = js.native
    
    var Tag: js.UndefOr[String] = js.native
  }
  object CreateIBANBankingAlias {
    
    @scala.inline
    def apply(Country: CountryISO, OwnerName: String): CreateIBANBankingAlias = {
      val __obj = js.Dynamic.literal(Country = Country.asInstanceOf[js.Any], OwnerName = OwnerName.asInstanceOf[js.Any])
      __obj.asInstanceOf[CreateIBANBankingAlias]
    }
    
    @scala.inline
    implicit class CreateIBANBankingAliasMutableBuilder[Self <: CreateIBANBankingAlias] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCountry(value: CountryISO): Self = StObject.set(x, "Country", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCreditedUserId(value: String): Self = StObject.set(x, "CreditedUserId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCreditedUserIdUndefined: Self = StObject.set(x, "CreditedUserId", js.undefined)
      
      @scala.inline
      def setOwnerName(value: String): Self = StObject.set(x, "OwnerName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTag(value: String): Self = StObject.set(x, "Tag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagUndefined: Self = StObject.set(x, "Tag", js.undefined)
    }
  }
  
  @js.native
  trait IBANBankingAliasData extends BankingAliasData {
    
    /**
      * The BIC of the banking alias
      */
    var BIC: String = js.native
    
    /**
      * The IBAN of the banking alias
      */
    var IBAN: String = js.native
    
    /**
      * The type of banking alias (note that only IBAN is available at present)
      */
    @JSName("Type")
    var Type_IBANBankingAliasData: IBAN = js.native
  }
  object IBANBankingAliasData {
    
    @scala.inline
    def apply(
      Active: Boolean,
      BIC: String,
      Country: CountryISO,
      CreationDate: Double,
      CreditedUserId: String,
      IBAN: String,
      Id: String,
      OwnerName: String,
      Tag: String,
      Type: IBAN,
      WalletId: String
    ): IBANBankingAliasData = {
      val __obj = js.Dynamic.literal(Active = Active.asInstanceOf[js.Any], BIC = BIC.asInstanceOf[js.Any], Country = Country.asInstanceOf[js.Any], CreationDate = CreationDate.asInstanceOf[js.Any], CreditedUserId = CreditedUserId.asInstanceOf[js.Any], IBAN = IBAN.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], OwnerName = OwnerName.asInstanceOf[js.Any], Tag = Tag.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any], WalletId = WalletId.asInstanceOf[js.Any])
      __obj.asInstanceOf[IBANBankingAliasData]
    }
    
    @scala.inline
    implicit class IBANBankingAliasDataMutableBuilder[Self <: IBANBankingAliasData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBIC(value: String): Self = StObject.set(x, "BIC", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIBAN(value: String): Self = StObject.set(x, "IBAN", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: IBAN): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    }
  }
}
