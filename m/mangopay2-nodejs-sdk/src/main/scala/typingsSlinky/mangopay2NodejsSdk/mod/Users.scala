package typingsSlinky.mangopay2NodejsSdk.mod

import typingsSlinky.mangopay2NodejsSdk.mod.bankAccount.CAData
import typingsSlinky.mangopay2NodejsSdk.mod.bankAccount.CADetails
import typingsSlinky.mangopay2NodejsSdk.mod.bankAccount.Data
import typingsSlinky.mangopay2NodejsSdk.mod.bankAccount.GBData
import typingsSlinky.mangopay2NodejsSdk.mod.bankAccount.GBDetails
import typingsSlinky.mangopay2NodejsSdk.mod.bankAccount.IBANData
import typingsSlinky.mangopay2NodejsSdk.mod.bankAccount.IBANDetails
import typingsSlinky.mangopay2NodejsSdk.mod.bankAccount.OtherData
import typingsSlinky.mangopay2NodejsSdk.mod.bankAccount.OtherDetails
import typingsSlinky.mangopay2NodejsSdk.mod.bankAccount.USData
import typingsSlinky.mangopay2NodejsSdk.mod.bankAccount.USDetails
import typingsSlinky.mangopay2NodejsSdk.mod.card.CardData
import typingsSlinky.mangopay2NodejsSdk.mod.cardPreAuthorization.CardPreAuthorizationData
import typingsSlinky.mangopay2NodejsSdk.mod.eMoney.EMoneyData
import typingsSlinky.mangopay2NodejsSdk.mod.kycDocument.CreateKycDocument
import typingsSlinky.mangopay2NodejsSdk.mod.kycDocument.CreateKycPage
import typingsSlinky.mangopay2NodejsSdk.mod.kycDocument.KycDocumentData
import typingsSlinky.mangopay2NodejsSdk.mod.kycDocument.SubmitKycDocument
import typingsSlinky.mangopay2NodejsSdk.mod.models.UserLegal
import typingsSlinky.mangopay2NodejsSdk.mod.models.UserNatural
import typingsSlinky.mangopay2NodejsSdk.mod.transaction.TransactionData
import typingsSlinky.mangopay2NodejsSdk.mod.uboDeclaration.CreateUboDeclaration
import typingsSlinky.mangopay2NodejsSdk.mod.uboDeclaration.UboDeclarationData
import typingsSlinky.mangopay2NodejsSdk.mod.user.CreateUserLegalData
import typingsSlinky.mangopay2NodejsSdk.mod.user.CreateUserNaturalData
import typingsSlinky.mangopay2NodejsSdk.mod.user.UpdateUserLegalData
import typingsSlinky.mangopay2NodejsSdk.mod.user.UpdateUserNaturalData
import typingsSlinky.mangopay2NodejsSdk.mod.user.UserLegalData
import typingsSlinky.mangopay2NodejsSdk.mod.user.UserNaturalData
import typingsSlinky.mangopay2NodejsSdk.mod.wallet.WalletData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mangopay2-nodejs-sdk", "Users")
@js.native
class Users () extends StObject {
  
  /**
    * Create a new user
    * @param user
    */
  def create(data: CreateUserLegalData): js.Promise[UserLegalData] = js.native
  /**
    * Create a new user
    * @param user
    */
  def create(data: CreateUserLegalData, callback: js.Function1[/* data */ UserLegalData, Unit]): Unit = js.native
  /**
    * Create a new user
    * @param user
    */
  def create(
    data: CreateUserLegalData,
    callback: js.Function1[/* data */ WithResponse[UserLegalData], Unit],
    options: MethodOptionWithResponse
  ): Unit = js.native
  def create(
    data: CreateUserLegalData,
    callback: js.Function1[/* data */ UserLegalData, Unit],
    options: MethodOptionWithoutResponse
  ): Unit = js.native
  /**
    * Create a new user
    * @param user
    */
  def create(data: CreateUserLegalData, options: MethodOptionWithResponse): js.Promise[WithResponse[UserLegalData]] = js.native
  def create(data: CreateUserLegalData, options: MethodOptionWithoutResponse): js.Promise[UserLegalData] = js.native
  /**
    * Create a new user
    * @param user
    */
  def create(data: CreateUserNaturalData): js.Promise[UserNaturalData] = js.native
  /**
    * Create a new user
    * @param user
    */
  def create(data: CreateUserNaturalData, callback: js.Function1[/* data */ UserNaturalData, Unit]): Unit = js.native
  /**
    * Create a new user
    * @param user
    */
  def create(
    data: CreateUserNaturalData,
    callback: js.Function1[/* data */ WithResponse[UserNaturalData], Unit],
    options: MethodOptionWithResponse
  ): Unit = js.native
  def create(
    data: CreateUserNaturalData,
    callback: js.Function1[/* data */ UserNaturalData, Unit],
    options: MethodOptionWithoutResponse
  ): Unit = js.native
  /**
    * Create a new user
    * @param user
    */
  def create(data: CreateUserNaturalData, options: MethodOptionWithResponse): js.Promise[WithResponse[UserNaturalData]] = js.native
  def create(data: CreateUserNaturalData, options: MethodOptionWithoutResponse): js.Promise[UserNaturalData] = js.native
  
  /**
    * Create bank account for user
    * @param userId
    * @param bankAccount
    * @param options
    */
  def createBankAccount(data: String, extra: CADetails): js.Promise[CAData] = js.native
  /**
    * Create bank account for user
    * @param userId
    * @param bankAccount
    * @param options
    */
  def createBankAccount(
    data: String,
    extra: CADetails,
    callback: js.Function1[(/* data */ CAData) | (/* data */ WithResponse[CAData]), Unit]
  ): Unit = js.native
  def createBankAccount(
    data: String,
    extra: CADetails,
    callback: js.Function1[/* data */ WithResponse[CAData], Unit],
    options: MethodOptionWithResponse
  ): Unit = js.native
  def createBankAccount(
    data: String,
    extra: CADetails,
    callback: js.Function1[/* data */ CAData, Unit],
    options: MethodOptionWithoutResponse
  ): Unit = js.native
  /**
    * Create bank account for user
    * @param userId
    * @param bankAccount
    * @param options
    */
  def createBankAccount(data: String, extra: CADetails, options: MethodOptionWithResponse): js.Promise[WithResponse[CAData]] = js.native
  def createBankAccount(data: String, extra: CADetails, options: MethodOptionWithoutResponse): js.Promise[CAData] = js.native
  /**
    * Create bank account for user
    * @param userId
    * @param bankAccount
    * @param options
    */
  def createBankAccount(data: String, extra: GBDetails): js.Promise[GBData] = js.native
  /**
    * Create bank account for user
    * @param userId
    * @param bankAccount
    * @param options
    */
  def createBankAccount(
    data: String,
    extra: GBDetails,
    callback: js.Function1[(/* data */ GBData) | (/* data */ WithResponse[GBData]), Unit]
  ): Unit = js.native
  def createBankAccount(
    data: String,
    extra: GBDetails,
    callback: js.Function1[/* data */ WithResponse[GBData], Unit],
    options: MethodOptionWithResponse
  ): Unit = js.native
  def createBankAccount(
    data: String,
    extra: GBDetails,
    callback: js.Function1[/* data */ GBData, Unit],
    options: MethodOptionWithoutResponse
  ): Unit = js.native
  /**
    * Create bank account for user
    * @param userId
    * @param bankAccount
    * @param options
    */
  def createBankAccount(data: String, extra: GBDetails, options: MethodOptionWithResponse): js.Promise[WithResponse[GBData]] = js.native
  def createBankAccount(data: String, extra: GBDetails, options: MethodOptionWithoutResponse): js.Promise[GBData] = js.native
  /**
    * Create bank account for user
    * @param userId
    * @param bankAccount
    * @param options
    */
  def createBankAccount(data: String, extra: IBANDetails): js.Promise[IBANData] = js.native
  /**
    * Create bank account for user
    * @param userId
    * @param bankAccount
    * @param options
    */
  def createBankAccount(
    data: String,
    extra: IBANDetails,
    callback: js.Function1[(/* data */ IBANData) | (/* data */ WithResponse[IBANData]), Unit]
  ): Unit = js.native
  def createBankAccount(
    data: String,
    extra: IBANDetails,
    callback: js.Function1[/* data */ WithResponse[IBANData], Unit],
    options: MethodOptionWithResponse
  ): Unit = js.native
  def createBankAccount(
    data: String,
    extra: IBANDetails,
    callback: js.Function1[/* data */ IBANData, Unit],
    options: MethodOptionWithoutResponse
  ): Unit = js.native
  /**
    * Create bank account for user
    * @param userId
    * @param bankAccount
    * @param options
    */
  def createBankAccount(data: String, extra: IBANDetails, options: MethodOptionWithResponse): js.Promise[WithResponse[IBANData]] = js.native
  def createBankAccount(data: String, extra: IBANDetails, options: MethodOptionWithoutResponse): js.Promise[IBANData] = js.native
  /**
    * Create bank account for user
    * @param userId
    * @param bankAccount
    * @param options
    */
  def createBankAccount(data: String, extra: OtherDetails): js.Promise[OtherData] = js.native
  /**
    * Create bank account for user
    * @param userId
    * @param bankAccount
    * @param options
    */
  def createBankAccount(
    data: String,
    extra: OtherDetails,
    callback: js.Function1[(/* data */ OtherData) | (/* data */ WithResponse[OtherData]), Unit]
  ): Unit = js.native
  def createBankAccount(
    data: String,
    extra: OtherDetails,
    callback: js.Function1[/* data */ WithResponse[OtherData], Unit],
    options: MethodOptionWithResponse
  ): Unit = js.native
  def createBankAccount(
    data: String,
    extra: OtherDetails,
    callback: js.Function1[/* data */ OtherData, Unit],
    options: MethodOptionWithoutResponse
  ): Unit = js.native
  /**
    * Create bank account for user
    * @param userId
    * @param bankAccount
    * @param options
    */
  def createBankAccount(data: String, extra: OtherDetails, options: MethodOptionWithResponse): js.Promise[WithResponse[OtherData]] = js.native
  def createBankAccount(data: String, extra: OtherDetails, options: MethodOptionWithoutResponse): js.Promise[OtherData] = js.native
  /**
    * Create bank account for user
    * @param userId
    * @param bankAccount
    * @param options
    */
  def createBankAccount(data: String, extra: USDetails): js.Promise[USData] = js.native
  /**
    * Create bank account for user
    * @param userId
    * @param bankAccount
    * @param options
    */
  def createBankAccount(
    data: String,
    extra: USDetails,
    callback: js.Function1[(/* data */ USData) | (/* data */ WithResponse[USData]), Unit]
  ): Unit = js.native
  def createBankAccount(
    data: String,
    extra: USDetails,
    callback: js.Function1[/* data */ WithResponse[USData], Unit],
    options: MethodOptionWithResponse
  ): Unit = js.native
  def createBankAccount(
    data: String,
    extra: USDetails,
    callback: js.Function1[/* data */ USData, Unit],
    options: MethodOptionWithoutResponse
  ): Unit = js.native
  /**
    * Create bank account for user
    * @param userId
    * @param bankAccount
    * @param options
    */
  def createBankAccount(data: String, extra: USDetails, options: MethodOptionWithResponse): js.Promise[WithResponse[USData]] = js.native
  def createBankAccount(data: String, extra: USDetails, options: MethodOptionWithoutResponse): js.Promise[USData] = js.native
  /**
    * Create bank account for user
    * @param userId
    * @param bankAccount
    * @param options
    */
  @JSName("createBankAccount")
  var createBankAccount_Original: (TwoArgsMethodOverload[String, USDetails, USData]) with (TwoArgsMethodOverload[String, OtherDetails, OtherData]) with (TwoArgsMethodOverload[String, IBANDetails, IBANData]) with (TwoArgsMethodOverload[String, GBDetails, GBData]) with (TwoArgsMethodOverload[String, CADetails, CAData]) = js.native
  
  /**
    * Create new KYC document
    * @param  userId
    * @param  kycDocument
    * @param  options
    */
  def createKycDocument(data: String, extra: CreateKycDocument): js.Promise[KycDocumentData] = js.native
  /**
    * Create new KYC document
    * @param  userId
    * @param  kycDocument
    * @param  options
    */
  def createKycDocument(
    data: String,
    extra: CreateKycDocument,
    callback: js.Function1[(/* data */ KycDocumentData) | (/* data */ WithResponse[KycDocumentData]), Unit]
  ): Unit = js.native
  def createKycDocument(
    data: String,
    extra: CreateKycDocument,
    callback: js.Function1[/* data */ WithResponse[KycDocumentData], Unit],
    options: MethodOptionWithResponse
  ): Unit = js.native
  def createKycDocument(
    data: String,
    extra: CreateKycDocument,
    callback: js.Function1[/* data */ KycDocumentData, Unit],
    options: MethodOptionWithoutResponse
  ): Unit = js.native
  /**
    * Create new KYC document
    * @param  userId
    * @param  kycDocument
    * @param  options
    */
  def createKycDocument(data: String, extra: CreateKycDocument, options: MethodOptionWithResponse): js.Promise[WithResponse[KycDocumentData]] = js.native
  def createKycDocument(data: String, extra: CreateKycDocument, options: MethodOptionWithoutResponse): js.Promise[KycDocumentData] = js.native
  /**
    * Create new KYC document
    * @param  userId
    * @param  kycDocument
    * @param  options
    */
  @JSName("createKycDocument")
  var createKycDocument_Original: TwoArgsMethodOverload[String, CreateKycDocument, KycDocumentData] = js.native
  
  /**
    * Create page for KYC document
    * @param userId
    * @param kycDocumentId
    * @param kycPage
    * @param options
    */
  def createKycPage(data: String, extra: String, lastArg: CreateKycPage): js.Promise[KycDocumentData] = js.native
  /**
    * Create page for KYC document
    * @param userId
    * @param kycDocumentId
    * @param kycPage
    * @param options
    */
  def createKycPage(
    data: String,
    extra: String,
    lastArg: CreateKycPage,
    callback: js.Function1[(/* data */ KycDocumentData) | (/* data */ WithResponse[KycDocumentData]), Unit]
  ): Unit = js.native
  def createKycPage(
    data: String,
    extra: String,
    lastArg: CreateKycPage,
    callback: js.Function1[/* data */ WithResponse[KycDocumentData], Unit],
    options: MethodOptionWithResponse
  ): Unit = js.native
  def createKycPage(
    data: String,
    extra: String,
    lastArg: CreateKycPage,
    callback: js.Function1[/* data */ KycDocumentData, Unit],
    options: MethodOptionWithoutResponse
  ): Unit = js.native
  /**
    * Create page for KYC document
    * @param userId
    * @param kycDocumentId
    * @param kycPage
    * @param options
    */
  def createKycPage(data: String, extra: String, lastArg: CreateKycPage, options: MethodOptionWithResponse): js.Promise[WithResponse[KycDocumentData]] = js.native
  def createKycPage(data: String, extra: String, lastArg: CreateKycPage, options: MethodOptionWithoutResponse): js.Promise[KycDocumentData] = js.native
  
  /**
    * Create page for KYC document
    * @param userId
    * @param kycDocumentId
    * @param filePath
    * @param options
    */
  def createKycPageFromFile(data: String, extra: String, lastArg: String): js.Promise[KycDocumentData] = js.native
  /**
    * Create page for KYC document
    * @param userId
    * @param kycDocumentId
    * @param filePath
    * @param options
    */
  def createKycPageFromFile(
    data: String,
    extra: String,
    lastArg: String,
    callback: js.Function1[(/* data */ KycDocumentData) | (/* data */ WithResponse[KycDocumentData]), Unit]
  ): Unit = js.native
  def createKycPageFromFile(
    data: String,
    extra: String,
    lastArg: String,
    callback: js.Function1[/* data */ WithResponse[KycDocumentData], Unit],
    options: MethodOptionWithResponse
  ): Unit = js.native
  def createKycPageFromFile(
    data: String,
    extra: String,
    lastArg: String,
    callback: js.Function1[/* data */ KycDocumentData, Unit],
    options: MethodOptionWithoutResponse
  ): Unit = js.native
  /**
    * Create page for KYC document
    * @param userId
    * @param kycDocumentId
    * @param filePath
    * @param options
    */
  def createKycPageFromFile(data: String, extra: String, lastArg: String, options: MethodOptionWithResponse): js.Promise[WithResponse[KycDocumentData]] = js.native
  def createKycPageFromFile(data: String, extra: String, lastArg: String, options: MethodOptionWithoutResponse): js.Promise[KycDocumentData] = js.native
  /**
    * Create page for KYC document
    * @param userId
    * @param kycDocumentId
    * @param filePath
    * @param options
    */
  @JSName("createKycPageFromFile")
  var createKycPageFromFile_Original: ThreeArgsMethodOverload[String, String, String, KycDocumentData] = js.native
  
  /**
    * Create page for KYC document
    * @param userId
    * @param kycDocumentId
    * @param kycPage
    * @param options
    */
  @JSName("createKycPage")
  var createKycPage_Original: ThreeArgsMethodOverload[String, String, CreateKycPage, KycDocumentData] = js.native
  
  /**
    * Create an UboDeclaration for the user
    * @param userId
    * @param uboDeclaration
    * @param options
    */
  def createUboDeclaration(data: String, extra: CreateUboDeclaration): js.Promise[UboDeclarationData] = js.native
  /**
    * Create an UboDeclaration for the user
    * @param userId
    * @param uboDeclaration
    * @param options
    */
  def createUboDeclaration(
    data: String,
    extra: CreateUboDeclaration,
    callback: js.Function1[
      (/* data */ UboDeclarationData) | (/* data */ WithResponse[UboDeclarationData]), 
      Unit
    ]
  ): Unit = js.native
  def createUboDeclaration(
    data: String,
    extra: CreateUboDeclaration,
    callback: js.Function1[/* data */ WithResponse[UboDeclarationData], Unit],
    options: MethodOptionWithResponse
  ): Unit = js.native
  def createUboDeclaration(
    data: String,
    extra: CreateUboDeclaration,
    callback: js.Function1[/* data */ UboDeclarationData, Unit],
    options: MethodOptionWithoutResponse
  ): Unit = js.native
  /**
    * Create an UboDeclaration for the user
    * @param userId
    * @param uboDeclaration
    * @param options
    */
  def createUboDeclaration(data: String, extra: CreateUboDeclaration, options: MethodOptionWithResponse): js.Promise[WithResponse[UboDeclarationData]] = js.native
  def createUboDeclaration(data: String, extra: CreateUboDeclaration, options: MethodOptionWithoutResponse): js.Promise[UboDeclarationData] = js.native
  /**
    * Create an UboDeclaration for the user
    * @param userId
    * @param uboDeclaration
    * @param options
    */
  @JSName("createUboDeclaration")
  var createUboDeclaration_Original: TwoArgsMethodOverload[String, CreateUboDeclaration, UboDeclarationData] = js.native
  
  /**
    * Create a new user
    * @param user
    */
  @JSName("create")
  var create_Original: (MethodOverload[CreateUserLegalData, UserLegalData]) with (MethodOverload[CreateUserNaturalData, UserNaturalData]) = js.native
  
  /**
    * Deactivate a bank account
    *
    * Note that once deactivated, a bank account can't be reactivated afterwards
    * @param userId
    * @param bankAccountId
    * @param options
    */
  def deactivateBankAccount(data: String, extra: String): js.Promise[Unit] = js.native
  /**
    * Deactivate a bank account
    *
    * Note that once deactivated, a bank account can't be reactivated afterwards
    * @param userId
    * @param bankAccountId
    * @param options
    */
  def deactivateBankAccount(
    data: String,
    extra: String,
    callback: js.Function1[(/* data */ Unit) | (/* data */ WithResponse[Unit]), Unit]
  ): Unit = js.native
  def deactivateBankAccount(
    data: String,
    extra: String,
    callback: js.Function1[/* data */ WithResponse[Unit], Unit],
    options: MethodOptionWithResponse
  ): Unit = js.native
  def deactivateBankAccount(
    data: String,
    extra: String,
    callback: js.Function1[/* data */ Unit, Unit],
    options: MethodOptionWithoutResponse
  ): Unit = js.native
  /**
    * Deactivate a bank account
    *
    * Note that once deactivated, a bank account can't be reactivated afterwards
    * @param userId
    * @param bankAccountId
    * @param options
    */
  def deactivateBankAccount(data: String, extra: String, options: MethodOptionWithResponse): js.Promise[WithResponse[Unit]] = js.native
  def deactivateBankAccount(data: String, extra: String, options: MethodOptionWithoutResponse): js.Promise[Unit] = js.native
  /**
    * Deactivate a bank account
    *
    * Note that once deactivated, a bank account can't be reactivated afterwards
    * @param userId
    * @param bankAccountId
    * @param options
    */
  @JSName("deactivateBankAccount")
  var deactivateBankAccount_Original: TwoArgsMethodOverload[String, String, Unit] = js.native
  
  /**
    * Get natural or legal user by ID
    * @param userId
    * @param options
    */
  def get(data: String): js.Promise[UserLegalData | UserNaturalData] = js.native
  /**
    * Get natural or legal user by ID
    * @param userId
    * @param options
    */
  def get(data: String, callback: js.Function1[/* data */ UserLegalData | UserNaturalData, Unit]): Unit = js.native
  /**
    * Get natural or legal user by ID
    * @param userId
    * @param options
    */
  def get(
    data: String,
    callback: js.Function1[/* data */ WithResponse[UserLegalData | UserNaturalData], Unit],
    options: MethodOptionWithResponse
  ): Unit = js.native
  def get(
    data: String,
    callback: js.Function1[/* data */ UserLegalData | UserNaturalData, Unit],
    options: MethodOptionWithoutResponse
  ): Unit = js.native
  /**
    * Get natural or legal user by ID
    * @param userId
    * @param options
    */
  def get(data: String, options: MethodOptionWithResponse): js.Promise[WithResponse[UserLegalData | UserNaturalData]] = js.native
  def get(data: String, options: MethodOptionWithoutResponse): js.Promise[UserLegalData | UserNaturalData] = js.native
  
  /**
    * Get all users
    */
  def getAll(): js.Promise[js.Array[UserLegalData | UserNaturalData]] = js.native
  /**
    * Get all users
    */
  def getAll(
    callback: js.Function1[
      (/* data */ js.Array[UserLegalData | UserNaturalData]) | (/* data */ WithResponse[js.Array[UserLegalData | UserNaturalData]]), 
      Unit
    ]
  ): Unit = js.native
  def getAll(
    callback: js.Function1[/* data */ WithResponse[js.Array[UserLegalData | UserNaturalData]], Unit],
    options: MethodOptionWithResponse
  ): Unit = js.native
  def getAll(
    callback: js.Function1[/* data */ js.Array[UserLegalData | UserNaturalData], Unit],
    options: MethodOptionWithoutResponse
  ): Unit = js.native
  /**
    * Get all users
    */
  def getAll(options: MethodOptionWithResponse): js.Promise[WithResponse[js.Array[UserLegalData | UserNaturalData]]] = js.native
  def getAll(options: MethodOptionWithoutResponse): js.Promise[js.Array[UserLegalData | UserNaturalData]] = js.native
  /**
    * Get all users
    */
  @JSName("getAll")
  var getAll_Original: NoArgMethodOverload[js.Array[UserLegalData | UserNaturalData]] = js.native
  
  /**
    * Get all bank accounts for user
    * @param userId
    * @param bankAccountId
    * @param options
    */
  def getBankAccount(data: String, extra: String): js.Promise[Data] = js.native
  /**
    * Get all bank accounts for user
    * @param userId
    * @param bankAccountId
    * @param options
    */
  def getBankAccount(
    data: String,
    extra: String,
    callback: js.Function1[(/* data */ Data) | (/* data */ WithResponse[Data]), Unit]
  ): Unit = js.native
  def getBankAccount(
    data: String,
    extra: String,
    callback: js.Function1[/* data */ WithResponse[Data], Unit],
    options: MethodOptionWithResponse
  ): Unit = js.native
  def getBankAccount(
    data: String,
    extra: String,
    callback: js.Function1[/* data */ Data, Unit],
    options: MethodOptionWithoutResponse
  ): Unit = js.native
  /**
    * Get all bank accounts for user
    * @param userId
    * @param bankAccountId
    * @param options
    */
  def getBankAccount(data: String, extra: String, options: MethodOptionWithResponse): js.Promise[WithResponse[Data]] = js.native
  def getBankAccount(data: String, extra: String, options: MethodOptionWithoutResponse): js.Promise[Data] = js.native
  /**
    * Get all bank accounts for user
    * @param userId
    * @param bankAccountId
    * @param options
    */
  @JSName("getBankAccount")
  var getBankAccount_Original: TwoArgsMethodOverload[String, String, Data] = js.native
  
  /**
    * Get all bank accounts for user
    * @param userId
    * @param options
    */
  def getBankAccounts(data: String): js.Promise[js.Array[Data]] = js.native
  /**
    * Get all bank accounts for user
    * @param userId
    * @param options
    */
  def getBankAccounts(data: String, callback: js.Function1[/* data */ js.Array[Data], Unit]): Unit = js.native
  /**
    * Get all bank accounts for user
    * @param userId
    * @param options
    */
  def getBankAccounts(
    data: String,
    callback: js.Function1[/* data */ WithResponse[js.Array[Data]], Unit],
    options: MethodOptionWithResponse
  ): Unit = js.native
  def getBankAccounts(
    data: String,
    callback: js.Function1[/* data */ js.Array[Data], Unit],
    options: MethodOptionWithoutResponse
  ): Unit = js.native
  /**
    * Get all bank accounts for user
    * @param userId
    * @param options
    */
  def getBankAccounts(data: String, options: MethodOptionWithResponse): js.Promise[WithResponse[js.Array[Data]]] = js.native
  def getBankAccounts(data: String, options: MethodOptionWithoutResponse): js.Promise[js.Array[Data]] = js.native
  /**
    * Get all bank accounts for user
    * @param userId
    * @param options
    */
  @JSName("getBankAccounts")
  var getBankAccounts_Original: MethodOverload[String, js.Array[Data]] = js.native
  
  /**
    * Get all cards for user
    * @param userId
    * @param options
    */
  def getCards(data: String): js.Promise[js.Array[CardData]] = js.native
  /**
    * Get all cards for user
    * @param userId
    * @param options
    */
  def getCards(data: String, callback: js.Function1[/* data */ js.Array[CardData], Unit]): Unit = js.native
  /**
    * Get all cards for user
    * @param userId
    * @param options
    */
  def getCards(
    data: String,
    callback: js.Function1[/* data */ WithResponse[js.Array[CardData]], Unit],
    options: MethodOptionWithResponse
  ): Unit = js.native
  def getCards(
    data: String,
    callback: js.Function1[/* data */ js.Array[CardData], Unit],
    options: MethodOptionWithoutResponse
  ): Unit = js.native
  /**
    * Get all cards for user
    * @param userId
    * @param options
    */
  def getCards(data: String, options: MethodOptionWithResponse): js.Promise[WithResponse[js.Array[CardData]]] = js.native
  def getCards(data: String, options: MethodOptionWithoutResponse): js.Promise[js.Array[CardData]] = js.native
  /**
    * Get all cards for user
    * @param userId
    * @param options
    */
  @JSName("getCards")
  var getCards_Original: MethodOverload[String, js.Array[CardData]] = js.native
  
  /**
    * Get users's EMoney
    * @param userId
    * @param options
    */
  def getEMoney(data: String): js.Promise[EMoneyData] = js.native
  /**
    * Get users's EMoney
    * @param userId
    * @param options
    */
  def getEMoney(data: String, callback: js.Function1[/* data */ EMoneyData, Unit]): Unit = js.native
  /**
    * Get users's EMoney
    * @param userId
    * @param options
    */
  def getEMoney(
    data: String,
    callback: js.Function1[/* data */ WithResponse[EMoneyData], Unit],
    options: MethodOptionWithResponse
  ): Unit = js.native
  def getEMoney(
    data: String,
    callback: js.Function1[/* data */ EMoneyData, Unit],
    options: MethodOptionWithoutResponse
  ): Unit = js.native
  /**
    * Get users's EMoney
    * @param userId
    * @param options
    */
  def getEMoney(data: String, options: MethodOptionWithResponse): js.Promise[WithResponse[EMoneyData]] = js.native
  def getEMoney(data: String, options: MethodOptionWithoutResponse): js.Promise[EMoneyData] = js.native
  /**
    * Get users's EMoney
    * @param userId
    * @param options
    */
  @JSName("getEMoney")
  var getEMoney_Original: MethodOverload[String, EMoneyData] = js.native
  
  /**
    * Get KYC document
    * @param userId
    * @param kycDocumentId
    * @param options
    */
  def getKycDocument(data: String, extra: String): js.Promise[KycDocumentData] = js.native
  /**
    * Get KYC document
    * @param userId
    * @param kycDocumentId
    * @param options
    */
  def getKycDocument(
    data: String,
    extra: String,
    callback: js.Function1[(/* data */ KycDocumentData) | (/* data */ WithResponse[KycDocumentData]), Unit]
  ): Unit = js.native
  def getKycDocument(
    data: String,
    extra: String,
    callback: js.Function1[/* data */ WithResponse[KycDocumentData], Unit],
    options: MethodOptionWithResponse
  ): Unit = js.native
  def getKycDocument(
    data: String,
    extra: String,
    callback: js.Function1[/* data */ KycDocumentData, Unit],
    options: MethodOptionWithoutResponse
  ): Unit = js.native
  /**
    * Get KYC document
    * @param userId
    * @param kycDocumentId
    * @param options
    */
  def getKycDocument(data: String, extra: String, options: MethodOptionWithResponse): js.Promise[WithResponse[KycDocumentData]] = js.native
  def getKycDocument(data: String, extra: String, options: MethodOptionWithoutResponse): js.Promise[KycDocumentData] = js.native
  /**
    * Get KYC document
    * @param userId
    * @param kycDocumentId
    * @param options
    */
  @JSName("getKycDocument")
  var getKycDocument_Original: TwoArgsMethodOverload[String, String, KycDocumentData] = js.native
  
  /**
    * Get all KYC documents for user
    * @param userId
    * @param options
    */
  def getKycDocuments(data: String): js.Promise[js.Array[KycDocumentData]] = js.native
  /**
    * Get all KYC documents for user
    * @param userId
    * @param options
    */
  def getKycDocuments(data: String, callback: js.Function1[/* data */ js.Array[KycDocumentData], Unit]): Unit = js.native
  /**
    * Get all KYC documents for user
    * @param userId
    * @param options
    */
  def getKycDocuments(
    data: String,
    callback: js.Function1[/* data */ WithResponse[js.Array[KycDocumentData]], Unit],
    options: MethodOptionWithResponse
  ): Unit = js.native
  def getKycDocuments(
    data: String,
    callback: js.Function1[/* data */ js.Array[KycDocumentData], Unit],
    options: MethodOptionWithoutResponse
  ): Unit = js.native
  /**
    * Get all KYC documents for user
    * @param userId
    * @param options
    */
  def getKycDocuments(data: String, options: MethodOptionWithResponse): js.Promise[WithResponse[js.Array[KycDocumentData]]] = js.native
  def getKycDocuments(data: String, options: MethodOptionWithoutResponse): js.Promise[js.Array[KycDocumentData]] = js.native
  /**
    * Get all KYC documents for user
    * @param userId
    * @param options
    */
  @JSName("getKycDocuments")
  var getKycDocuments_Original: MethodOverload[String, js.Array[KycDocumentData]] = js.native
  
  /**
    * Get legal user by ID
    * @param userId
    * @param options
    */
  def getLegal(data: String): js.Promise[UserLegalData] = js.native
  /**
    * Get legal user by ID
    * @param userId
    * @param options
    */
  def getLegal(data: String, callback: js.Function1[/* data */ UserLegalData, Unit]): Unit = js.native
  /**
    * Get legal user by ID
    * @param userId
    * @param options
    */
  def getLegal(
    data: String,
    callback: js.Function1[/* data */ WithResponse[UserLegalData], Unit],
    options: MethodOptionWithResponse
  ): Unit = js.native
  def getLegal(
    data: String,
    callback: js.Function1[/* data */ UserLegalData, Unit],
    options: MethodOptionWithoutResponse
  ): Unit = js.native
  /**
    * Get legal user by ID
    * @param userId
    * @param options
    */
  def getLegal(data: String, options: MethodOptionWithResponse): js.Promise[WithResponse[UserLegalData]] = js.native
  def getLegal(data: String, options: MethodOptionWithoutResponse): js.Promise[UserLegalData] = js.native
  /**
    * Get legal user by ID
    * @param userId
    * @param options
    */
  @JSName("getLegal")
  var getLegal_Original: MethodOverload[String, UserLegalData] = js.native
  
  /**
    * Get natural user by ID
    * @param userId
    * @param options
    */
  def getNatural(data: String): js.Promise[UserNaturalData] = js.native
  /**
    * Get natural user by ID
    * @param userId
    * @param options
    */
  def getNatural(data: String, callback: js.Function1[/* data */ UserNaturalData, Unit]): Unit = js.native
  /**
    * Get natural user by ID
    * @param userId
    * @param options
    */
  def getNatural(
    data: String,
    callback: js.Function1[/* data */ WithResponse[UserNaturalData], Unit],
    options: MethodOptionWithResponse
  ): Unit = js.native
  def getNatural(
    data: String,
    callback: js.Function1[/* data */ UserNaturalData, Unit],
    options: MethodOptionWithoutResponse
  ): Unit = js.native
  /**
    * Get natural user by ID
    * @param userId
    * @param options
    */
  def getNatural(data: String, options: MethodOptionWithResponse): js.Promise[WithResponse[UserNaturalData]] = js.native
  def getNatural(data: String, options: MethodOptionWithoutResponse): js.Promise[UserNaturalData] = js.native
  /**
    * Get natural user by ID
    * @param userId
    * @param options
    */
  @JSName("getNatural")
  var getNatural_Original: MethodOverload[String, UserNaturalData] = js.native
  
  /**
    * Get all user preauthorizations
    * @param userId
    * @param options
    */
  def getPreAuthorizations(data: String): js.Promise[js.Array[CardPreAuthorizationData]] = js.native
  /**
    * Get all user preauthorizations
    * @param userId
    * @param options
    */
  def getPreAuthorizations(data: String, callback: js.Function1[/* data */ js.Array[CardPreAuthorizationData], Unit]): Unit = js.native
  /**
    * Get all user preauthorizations
    * @param userId
    * @param options
    */
  def getPreAuthorizations(
    data: String,
    callback: js.Function1[/* data */ WithResponse[js.Array[CardPreAuthorizationData]], Unit],
    options: MethodOptionWithResponse
  ): Unit = js.native
  def getPreAuthorizations(
    data: String,
    callback: js.Function1[/* data */ js.Array[CardPreAuthorizationData], Unit],
    options: MethodOptionWithoutResponse
  ): Unit = js.native
  /**
    * Get all user preauthorizations
    * @param userId
    * @param options
    */
  def getPreAuthorizations(data: String, options: MethodOptionWithResponse): js.Promise[WithResponse[js.Array[CardPreAuthorizationData]]] = js.native
  def getPreAuthorizations(data: String, options: MethodOptionWithoutResponse): js.Promise[js.Array[CardPreAuthorizationData]] = js.native
  /**
    * Get all user preauthorizations
    * @param userId
    * @param options
    */
  @JSName("getPreAuthorizations")
  var getPreAuthorizations_Original: MethodOverload[String, js.Array[CardPreAuthorizationData]] = js.native
  
  /**
    * Get all transactions for user
    * @param userId
    * @param options
    */
  def getTransactions(data: String): js.Promise[js.Array[TransactionData]] = js.native
  /**
    * Get all transactions for user
    * @param userId
    * @param options
    */
  def getTransactions(data: String, callback: js.Function1[/* data */ js.Array[TransactionData], Unit]): Unit = js.native
  /**
    * Get all transactions for user
    * @param userId
    * @param options
    */
  def getTransactions(
    data: String,
    callback: js.Function1[/* data */ WithResponse[js.Array[TransactionData]], Unit],
    options: MethodOptionWithResponse
  ): Unit = js.native
  def getTransactions(
    data: String,
    callback: js.Function1[/* data */ js.Array[TransactionData], Unit],
    options: MethodOptionWithoutResponse
  ): Unit = js.native
  /**
    * Get all transactions for user
    * @param userId
    * @param options
    */
  def getTransactions(data: String, options: MethodOptionWithResponse): js.Promise[WithResponse[js.Array[TransactionData]]] = js.native
  def getTransactions(data: String, options: MethodOptionWithoutResponse): js.Promise[js.Array[TransactionData]] = js.native
  /**
    * Get all transactions for user
    * @param userId
    * @param options
    */
  @JSName("getTransactions")
  var getTransactions_Original: MethodOverload[String, js.Array[TransactionData]] = js.native
  
  /**
    * Get all wallets accounts for user
    */
  def getWallets(data: String): js.Promise[js.Array[WalletData]] = js.native
  /**
    * Get all wallets accounts for user
    */
  def getWallets(data: String, callback: js.Function1[/* data */ js.Array[WalletData], Unit]): Unit = js.native
  /**
    * Get all wallets accounts for user
    */
  def getWallets(
    data: String,
    callback: js.Function1[/* data */ WithResponse[js.Array[WalletData]], Unit],
    options: MethodOptionWithResponse
  ): Unit = js.native
  def getWallets(
    data: String,
    callback: js.Function1[/* data */ js.Array[WalletData], Unit],
    options: MethodOptionWithoutResponse
  ): Unit = js.native
  /**
    * Get all wallets accounts for user
    */
  def getWallets(data: String, options: MethodOptionWithResponse): js.Promise[WithResponse[js.Array[WalletData]]] = js.native
  def getWallets(data: String, options: MethodOptionWithoutResponse): js.Promise[js.Array[WalletData]] = js.native
  /**
    * Get all wallets accounts for user
    */
  @JSName("getWallets")
  var getWallets_Original: MethodOverload[String, js.Array[WalletData]] = js.native
  
  /**
    * Get natural or legal user by ID
    * @param userId
    * @param options
    */
  @JSName("get")
  var get_Original: MethodOverload[String, UserLegalData | UserNaturalData] = js.native
  
  /**
    * Update a user
    * @param user
    * @param options
    */
  def update(data: UserLegal): js.Promise[UserLegalData] = js.native
  /**
    * Update a user
    * @param user
    * @param options
    */
  def update(data: UserLegal, callback: js.Function1[/* data */ UserLegalData, Unit]): Unit = js.native
  /**
    * Update a user
    * @param user
    * @param options
    */
  def update(
    data: UserLegal,
    callback: js.Function1[/* data */ WithResponse[UserLegalData], Unit],
    options: MethodOptionWithResponse
  ): Unit = js.native
  def update(
    data: UserLegal,
    callback: js.Function1[/* data */ UserLegalData, Unit],
    options: MethodOptionWithoutResponse
  ): Unit = js.native
  /**
    * Update a user
    * @param user
    * @param options
    */
  def update(data: UserLegal, options: MethodOptionWithResponse): js.Promise[WithResponse[UserLegalData]] = js.native
  def update(data: UserLegal, options: MethodOptionWithoutResponse): js.Promise[UserLegalData] = js.native
  /**
    * Update a user
    * @param user
    * @param options
    */
  def update(data: UserNatural): js.Promise[UserNaturalData] = js.native
  /**
    * Update a user
    * @param user
    * @param options
    */
  def update(data: UserNatural, callback: js.Function1[/* data */ UserNaturalData, Unit]): Unit = js.native
  /**
    * Update a user
    * @param user
    * @param options
    */
  def update(
    data: UserNatural,
    callback: js.Function1[/* data */ WithResponse[UserNaturalData], Unit],
    options: MethodOptionWithResponse
  ): Unit = js.native
  def update(
    data: UserNatural,
    callback: js.Function1[/* data */ UserNaturalData, Unit],
    options: MethodOptionWithoutResponse
  ): Unit = js.native
  /**
    * Update a user
    * @param user
    * @param options
    */
  def update(data: UserNatural, options: MethodOptionWithResponse): js.Promise[WithResponse[UserNaturalData]] = js.native
  def update(data: UserNatural, options: MethodOptionWithoutResponse): js.Promise[UserNaturalData] = js.native
  def update(data: UpdateUserLegalData): js.Promise[UserLegalData] = js.native
  def update(data: UpdateUserLegalData, callback: js.Function1[/* data */ UserLegalData, Unit]): Unit = js.native
  def update(
    data: UpdateUserLegalData,
    callback: js.Function1[/* data */ WithResponse[UserLegalData], Unit],
    options: MethodOptionWithResponse
  ): Unit = js.native
  def update(
    data: UpdateUserLegalData,
    callback: js.Function1[/* data */ UserLegalData, Unit],
    options: MethodOptionWithoutResponse
  ): Unit = js.native
  def update(data: UpdateUserLegalData, options: MethodOptionWithResponse): js.Promise[WithResponse[UserLegalData]] = js.native
  def update(data: UpdateUserLegalData, options: MethodOptionWithoutResponse): js.Promise[UserLegalData] = js.native
  def update(data: UpdateUserNaturalData): js.Promise[UserNaturalData] = js.native
  def update(data: UpdateUserNaturalData, callback: js.Function1[/* data */ UserNaturalData, Unit]): Unit = js.native
  def update(
    data: UpdateUserNaturalData,
    callback: js.Function1[/* data */ WithResponse[UserNaturalData], Unit],
    options: MethodOptionWithResponse
  ): Unit = js.native
  def update(
    data: UpdateUserNaturalData,
    callback: js.Function1[/* data */ UserNaturalData, Unit],
    options: MethodOptionWithoutResponse
  ): Unit = js.native
  def update(data: UpdateUserNaturalData, options: MethodOptionWithResponse): js.Promise[WithResponse[UserNaturalData]] = js.native
  def update(data: UpdateUserNaturalData, options: MethodOptionWithoutResponse): js.Promise[UserNaturalData] = js.native
  
  /**
    * Update status of KYC Document (Currently only allows for submitting the document)
    * @param userId
    * @param kycDocument
    * @param options
    */
  def updateKycDocument(data: String, extra: SubmitKycDocument): js.Promise[KycDocumentData] = js.native
  /**
    * Update status of KYC Document (Currently only allows for submitting the document)
    * @param userId
    * @param kycDocument
    * @param options
    */
  def updateKycDocument(
    data: String,
    extra: SubmitKycDocument,
    callback: js.Function1[(/* data */ KycDocumentData) | (/* data */ WithResponse[KycDocumentData]), Unit]
  ): Unit = js.native
  def updateKycDocument(
    data: String,
    extra: SubmitKycDocument,
    callback: js.Function1[/* data */ WithResponse[KycDocumentData], Unit],
    options: MethodOptionWithResponse
  ): Unit = js.native
  def updateKycDocument(
    data: String,
    extra: SubmitKycDocument,
    callback: js.Function1[/* data */ KycDocumentData, Unit],
    options: MethodOptionWithoutResponse
  ): Unit = js.native
  /**
    * Update status of KYC Document (Currently only allows for submitting the document)
    * @param userId
    * @param kycDocument
    * @param options
    */
  def updateKycDocument(data: String, extra: SubmitKycDocument, options: MethodOptionWithResponse): js.Promise[WithResponse[KycDocumentData]] = js.native
  def updateKycDocument(data: String, extra: SubmitKycDocument, options: MethodOptionWithoutResponse): js.Promise[KycDocumentData] = js.native
  /**
    * Update status of KYC Document (Currently only allows for submitting the document)
    * @param userId
    * @param kycDocument
    * @param options
    */
  @JSName("updateKycDocument")
  var updateKycDocument_Original: TwoArgsMethodOverload[String, SubmitKycDocument, KycDocumentData] = js.native
  
  /**
    * Update a user
    * @param user
    * @param options
    */
  @JSName("update")
  var update_Original: (MethodOverload[UserLegal | UpdateUserLegalData, UserLegalData]) with (MethodOverload[UserNatural | UpdateUserNaturalData, UserNaturalData]) = js.native
}
