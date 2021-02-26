package typingsSlinky.mangopay2NodejsSdk.mod

import typingsSlinky.mangopay2NodejsSdk.mod.entityBase.EntityBaseData
import typingsSlinky.mangopay2NodejsSdk.typesMod.CurrencyISO
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object wallet {
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.FEES
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CREDIT
  */
  trait ClientFundsType extends StObject
  object ClientFundsType {
    
    @scala.inline
    def CREDIT: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CREDIT = "CREDIT".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CREDIT]
    
    @scala.inline
    def FEES: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.FEES = "FEES".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.FEES]
  }
  
  /* Inlined parent mangopay2-nodejs-sdk.mangopay2-nodejs-sdk/types.Omit<mangopay2-nodejs-sdk.mangopay2-nodejs-sdk.wallet.WalletData, 'Owners' | 'Description'> */
  @js.native
  trait ClientWalletData extends StObject {
    
    var Balance: MoneyData = js.native
    
    var CreationDate: Double = js.native
    
    var Currency: CurrencyISO = js.native
    
    var FundsType: ClientFundsType = js.native
    
    var Id: String = js.native
    
    var Tag: String = js.native
  }
  object ClientWalletData {
    
    @scala.inline
    def apply(
      Balance: MoneyData,
      CreationDate: Double,
      Currency: CurrencyISO,
      FundsType: ClientFundsType,
      Id: String,
      Tag: String
    ): ClientWalletData = {
      val __obj = js.Dynamic.literal(Balance = Balance.asInstanceOf[js.Any], CreationDate = CreationDate.asInstanceOf[js.Any], Currency = Currency.asInstanceOf[js.Any], FundsType = FundsType.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], Tag = Tag.asInstanceOf[js.Any])
      __obj.asInstanceOf[ClientWalletData]
    }
    
    @scala.inline
    implicit class ClientWalletDataMutableBuilder[Self <: ClientWalletData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBalance(value: MoneyData): Self = StObject.set(x, "Balance", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCreationDate(value: Double): Self = StObject.set(x, "CreationDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCurrency(value: CurrencyISO): Self = StObject.set(x, "Currency", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFundsType(value: ClientFundsType): Self = StObject.set(x, "FundsType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTag(value: String): Self = StObject.set(x, "Tag", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined mangopay2-nodejs-sdk.mangopay2-nodejs-sdk.wallet.UpdateWallet & std.Pick<mangopay2-nodejs-sdk.mangopay2-nodejs-sdk.wallet.WalletData, 'Owners' | 'Currency' | 'Description'> */
  @js.native
  trait CreateWallet extends StObject {
    
    var Currency: CurrencyISO = js.native
    
    var Description: js.UndefOr[String] with String = js.native
    
    var Owners: js.Array[String] = js.native
    
    var Tag: js.UndefOr[String] = js.native
  }
  object CreateWallet {
    
    @scala.inline
    def apply(Currency: CurrencyISO, Description: js.UndefOr[String] with String, Owners: js.Array[String]): CreateWallet = {
      val __obj = js.Dynamic.literal(Currency = Currency.asInstanceOf[js.Any], Description = Description.asInstanceOf[js.Any], Owners = Owners.asInstanceOf[js.Any])
      __obj.asInstanceOf[CreateWallet]
    }
    
    @scala.inline
    implicit class CreateWalletMutableBuilder[Self <: CreateWallet] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCurrency(value: CurrencyISO): Self = StObject.set(x, "Currency", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescription(value: js.UndefOr[String] with String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOwners(value: js.Array[String]): Self = StObject.set(x, "Owners", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOwnersVarargs(value: String*): Self = StObject.set(x, "Owners", js.Array(value :_*))
      
      @scala.inline
      def setTag(value: String): Self = StObject.set(x, "Tag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagUndefined: Self = StObject.set(x, "Tag", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DEFAULT
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.FEES
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CREDIT
  */
  trait FundsType extends StObject
  object FundsType {
    
    @scala.inline
    def CREDIT: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CREDIT = "CREDIT".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CREDIT]
    
    @scala.inline
    def DEFAULT: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DEFAULT = "DEFAULT".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DEFAULT]
    
    @scala.inline
    def FEES: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.FEES = "FEES".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.FEES]
  }
  
  /* Inlined mangopay2-nodejs-sdk.mangopay2-nodejs-sdk/types.PickPartial<mangopay2-nodejs-sdk.mangopay2-nodejs-sdk.wallet.WalletData, 'Tag' | 'Description'> */
  @js.native
  trait UpdateWallet extends StObject {
    
    var Description: js.UndefOr[String] = js.native
    
    var Tag: js.UndefOr[String] = js.native
  }
  object UpdateWallet {
    
    @scala.inline
    def apply(): UpdateWallet = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UpdateWallet]
    }
    
    @scala.inline
    implicit class UpdateWalletMutableBuilder[Self <: UpdateWallet] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
      
      @scala.inline
      def setTag(value: String): Self = StObject.set(x, "Tag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagUndefined: Self = StObject.set(x, "Tag", js.undefined)
    }
  }
  
  @js.native
  trait WalletData extends EntityBaseData {
    
    /**
      * The current balance of the wallet
      */
    var Balance: MoneyData = js.native
    
    /**
      * The currency - should be ISO_4217 format
      */
    var Currency: CurrencyISO = js.native
    
    /**
      * A desciption of the wallet
      */
    var Description: String = js.native
    
    /**
      * The type of funds in the wallet
      */
    var FundsType: typingsSlinky.mangopay2NodejsSdk.mod.wallet.FundsType = js.native
    
    /**
      * An array of userIDs of who own's the wallet. For now, you only can set up a unique owner.
      */
    var Owners: js.Array[String] = js.native
  }
  object WalletData {
    
    @scala.inline
    def apply(
      Balance: MoneyData,
      CreationDate: Double,
      Currency: CurrencyISO,
      Description: String,
      FundsType: FundsType,
      Id: String,
      Owners: js.Array[String],
      Tag: String
    ): WalletData = {
      val __obj = js.Dynamic.literal(Balance = Balance.asInstanceOf[js.Any], CreationDate = CreationDate.asInstanceOf[js.Any], Currency = Currency.asInstanceOf[js.Any], Description = Description.asInstanceOf[js.Any], FundsType = FundsType.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], Owners = Owners.asInstanceOf[js.Any], Tag = Tag.asInstanceOf[js.Any])
      __obj.asInstanceOf[WalletData]
    }
    
    @scala.inline
    implicit class WalletDataMutableBuilder[Self <: WalletData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBalance(value: MoneyData): Self = StObject.set(x, "Balance", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCurrency(value: CurrencyISO): Self = StObject.set(x, "Currency", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFundsType(value: FundsType): Self = StObject.set(x, "FundsType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOwners(value: js.Array[String]): Self = StObject.set(x, "Owners", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOwnersVarargs(value: String*): Self = StObject.set(x, "Owners", js.Array(value :_*))
    }
  }
}
