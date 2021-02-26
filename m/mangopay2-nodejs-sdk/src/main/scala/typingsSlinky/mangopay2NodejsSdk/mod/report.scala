package typingsSlinky.mangopay2NodejsSdk.mod

import typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CSV
import typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.Id_
import typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.TRANSACTIONS
import typingsSlinky.mangopay2NodejsSdk.mod.entityBase.EntityBaseData
import typingsSlinky.mangopay2NodejsSdk.mod.transaction.TransactionNature
import typingsSlinky.mangopay2NodejsSdk.mod.transaction.TransactionStatus
import typingsSlinky.mangopay2NodejsSdk.mod.transaction.TransactionType
import typingsSlinky.mangopay2NodejsSdk.typesMod.CurrencyISO
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object report {
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.Alias
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.AuthorId
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BankAccountId
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BankWireRef
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CardId
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CardType
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.Country
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CreationDate
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CreditedFundsAmount
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CreditedFundsCurrency
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CreditedUserId
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CreditedWalletId
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.Culture
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DebitedFundsAmount
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DebitedFundsCurrency
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DebitedWalletId
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DeclaredDebitedFundsAmount
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DeclaredDebitedFundsCurrency
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DeclaredFeesAmount
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DeclaredFeesCurrency
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.ExecutionDate
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.ExecutionType
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.ExpirationDate
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.FeesAmount
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.FeesCurrency
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.Id_
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.Nature
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PaymentType
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PreauthorizationId
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.ResultCode
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.ResultMessage
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.Status
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.Tag
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.Type
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.WireReference
  */
  trait Column extends StObject
  object Column {
    
    @scala.inline
    def Alias: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.Alias = "Alias".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.Alias]
    
    @scala.inline
    def AuthorId: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.AuthorId = "AuthorId".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.AuthorId]
    
    @scala.inline
    def BankAccountId: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BankAccountId = "BankAccountId".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BankAccountId]
    
    @scala.inline
    def BankWireRef: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BankWireRef = "BankWireRef".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BankWireRef]
    
    @scala.inline
    def CardId: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CardId = "CardId".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CardId]
    
    @scala.inline
    def CardType: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CardType = "CardType".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CardType]
    
    @scala.inline
    def Country: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.Country = "Country".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.Country]
    
    @scala.inline
    def CreationDate: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CreationDate = "CreationDate".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CreationDate]
    
    @scala.inline
    def CreditedFundsAmount: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CreditedFundsAmount = "CreditedFundsAmount".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CreditedFundsAmount]
    
    @scala.inline
    def CreditedFundsCurrency: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CreditedFundsCurrency = "CreditedFundsCurrency".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CreditedFundsCurrency]
    
    @scala.inline
    def CreditedUserId: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CreditedUserId = "CreditedUserId".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CreditedUserId]
    
    @scala.inline
    def CreditedWalletId: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CreditedWalletId = "CreditedWalletId".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CreditedWalletId]
    
    @scala.inline
    def Culture: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.Culture = "Culture".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.Culture]
    
    @scala.inline
    def DebitedFundsAmount: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DebitedFundsAmount = "DebitedFundsAmount".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DebitedFundsAmount]
    
    @scala.inline
    def DebitedFundsCurrency: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DebitedFundsCurrency = "DebitedFundsCurrency".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DebitedFundsCurrency]
    
    @scala.inline
    def DebitedWalletId: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DebitedWalletId = "DebitedWalletId".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DebitedWalletId]
    
    @scala.inline
    def DeclaredDebitedFundsAmount: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DeclaredDebitedFundsAmount = "DeclaredDebitedFundsAmount".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DeclaredDebitedFundsAmount]
    
    @scala.inline
    def DeclaredDebitedFundsCurrency: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DeclaredDebitedFundsCurrency = "DeclaredDebitedFundsCurrency".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DeclaredDebitedFundsCurrency]
    
    @scala.inline
    def DeclaredFeesAmount: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DeclaredFeesAmount = "DeclaredFeesAmount".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DeclaredFeesAmount]
    
    @scala.inline
    def DeclaredFeesCurrency: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DeclaredFeesCurrency = "DeclaredFeesCurrency".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DeclaredFeesCurrency]
    
    @scala.inline
    def ExecutionDate: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.ExecutionDate = "ExecutionDate".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.ExecutionDate]
    
    @scala.inline
    def ExecutionType: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.ExecutionType = "ExecutionType".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.ExecutionType]
    
    @scala.inline
    def ExpirationDate: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.ExpirationDate = "ExpirationDate".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.ExpirationDate]
    
    @scala.inline
    def FeesAmount: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.FeesAmount = "FeesAmount".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.FeesAmount]
    
    @scala.inline
    def FeesCurrency: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.FeesCurrency = "FeesCurrency".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.FeesCurrency]
    
    @scala.inline
    def Id: Id_ = "Id".asInstanceOf[Id_]
    
    @scala.inline
    def Nature: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.Nature = "Nature".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.Nature]
    
    @scala.inline
    def PaymentType: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PaymentType = "PaymentType".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PaymentType]
    
    @scala.inline
    def PreauthorizationId: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PreauthorizationId = "PreauthorizationId".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PreauthorizationId]
    
    @scala.inline
    def ResultCode: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.ResultCode = "ResultCode".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.ResultCode]
    
    @scala.inline
    def ResultMessage: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.ResultMessage = "ResultMessage".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.ResultMessage]
    
    @scala.inline
    def Status: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.Status = "Status".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.Status]
    
    @scala.inline
    def Tag: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.Tag = "Tag".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.Tag]
    
    @scala.inline
    def Type: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.Type = "Type".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.Type]
    
    @scala.inline
    def WireReference: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.WireReference = "WireReference".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.WireReference]
  }
  
  /* Inlined parent mangopay2-nodejs-sdk.mangopay2-nodejs-sdk/types.PickPartial<mangopay2-nodejs-sdk.mangopay2-nodejs-sdk.report.ReportData, 'Tag' | 'CallbackURL' | 'DownloadFormat' | 'Sort' | 'Preview' | 'Filters' | 'Columns'> */
  @js.native
  trait CreateReport extends StObject {
    
    var CallbackURL: js.UndefOr[String] = js.native
    
    var Columns: js.UndefOr[js.Array[Column]] = js.native
    
    var DownloadFormat: js.UndefOr[CSV] = js.native
    
    var Filters: js.UndefOr[typingsSlinky.mangopay2NodejsSdk.mod.report.Filters] = js.native
    
    var Preview: js.UndefOr[Boolean] = js.native
    
    var Sort: js.UndefOr[String] = js.native
    
    var Tag: js.UndefOr[String] = js.native
  }
  object CreateReport {
    
    @scala.inline
    def apply(): CreateReport = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CreateReport]
    }
    
    @scala.inline
    implicit class CreateReportMutableBuilder[Self <: CreateReport] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCallbackURL(value: String): Self = StObject.set(x, "CallbackURL", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCallbackURLUndefined: Self = StObject.set(x, "CallbackURL", js.undefined)
      
      @scala.inline
      def setColumns(value: js.Array[Column]): Self = StObject.set(x, "Columns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumnsUndefined: Self = StObject.set(x, "Columns", js.undefined)
      
      @scala.inline
      def setColumnsVarargs(value: Column*): Self = StObject.set(x, "Columns", js.Array(value :_*))
      
      @scala.inline
      def setDownloadFormat(value: CSV): Self = StObject.set(x, "DownloadFormat", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDownloadFormatUndefined: Self = StObject.set(x, "DownloadFormat", js.undefined)
      
      @scala.inline
      def setFilters(value: Filters): Self = StObject.set(x, "Filters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFiltersUndefined: Self = StObject.set(x, "Filters", js.undefined)
      
      @scala.inline
      def setPreview(value: Boolean): Self = StObject.set(x, "Preview", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreviewUndefined: Self = StObject.set(x, "Preview", js.undefined)
      
      @scala.inline
      def setSort(value: String): Self = StObject.set(x, "Sort", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSortUndefined: Self = StObject.set(x, "Sort", js.undefined)
      
      @scala.inline
      def setTag(value: String): Self = StObject.set(x, "Tag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagUndefined: Self = StObject.set(x, "Tag", js.undefined)
    }
  }
  
  @js.native
  trait Filters extends StObject {
    
    /**
      * To return only resources that have CreationDate AFTER this date
      */
    var AfterDate: Timestamp = js.native
    
    /**
      * A user's ID
      */
    var AuthorId: String = js.native
    
    /**
      * To return only resources that have CreationDate BEFORE this date
      */
    var BeforeDate: Timestamp = js.native
    
    /**
      * The maximum amount of DebitedFunds
      */
    var MaxDebitedFundsAmount: Double = js.native
    
    /**
      * The currency for the maximum amount of DebitedFunds
      */
    var MaxDebitedFundsCurrency: CurrencyISO = js.native
    
    /**
      * The maximum amount of Fees
      */
    var MaxFeesAmount: Double = js.native
    
    /**
      * The currency for the maximum amount of Fees
      */
    var MaxFeesCurrency: CurrencyISO = js.native
    
    /**
      * The minimum amount of DebitedFunds
      */
    var MinDebitedFundsAmount: Double = js.native
    
    /**
      * The currency for the minimum amount of DebitedFunds
      */
    var MinDebitedFundsCurrency: CurrencyISO = js.native
    
    /**
      * The minimum amount of Fees
      */
    var MinFeesAmount: Double = js.native
    
    /**
      * The currency for the minimum amount of Fees
      */
    var MinFeesCurrency: CurrencyISO = js.native
    
    /**
      * The nature of the transaction
      */
    var Nature: js.Array[TransactionNature] = js.native
    
    /**
      * The status of the transaction
      */
    var Status: js.Array[TransactionStatus] = js.native
    
    /**
      * The type of the transaction
      */
    var Type: js.Array[TransactionType] = js.native
    
    /**
      * The ID of a wallet
      */
    var WalletId: String = js.native
  }
  object Filters {
    
    @scala.inline
    implicit class FiltersMutableBuilder[Self <: Filters] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAfterDate(value: Timestamp): Self = StObject.set(x, "AfterDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAuthorId(value: String): Self = StObject.set(x, "AuthorId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBeforeDate(value: Timestamp): Self = StObject.set(x, "BeforeDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxDebitedFundsAmount(value: Double): Self = StObject.set(x, "MaxDebitedFundsAmount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxDebitedFundsCurrency(value: CurrencyISO): Self = StObject.set(x, "MaxDebitedFundsCurrency", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxFeesAmount(value: Double): Self = StObject.set(x, "MaxFeesAmount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxFeesCurrency(value: CurrencyISO): Self = StObject.set(x, "MaxFeesCurrency", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinDebitedFundsAmount(value: Double): Self = StObject.set(x, "MinDebitedFundsAmount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinDebitedFundsCurrency(value: CurrencyISO): Self = StObject.set(x, "MinDebitedFundsCurrency", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinFeesAmount(value: Double): Self = StObject.set(x, "MinFeesAmount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinFeesCurrency(value: CurrencyISO): Self = StObject.set(x, "MinFeesCurrency", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNature(value: js.Array[TransactionNature]): Self = StObject.set(x, "Nature", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNatureVarargs(value: TransactionNature*): Self = StObject.set(x, "Nature", js.Array(value :_*))
      
      @scala.inline
      def setStatus(value: js.Array[TransactionStatus]): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatusVarargs(value: TransactionStatus*): Self = StObject.set(x, "Status", js.Array(value :_*))
      
      @scala.inline
      def setType(value: js.Array[TransactionType]): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeVarargs(value: TransactionType*): Self = StObject.set(x, "Type", js.Array(value :_*))
      
      @scala.inline
      def setWalletId(value: String): Self = StObject.set(x, "WalletId", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ReportData extends EntityBaseData {
    
    /**
      * A URL that we will ping when the report is ready to download(works in a similar way to the hooks)
      */
    var CallbackURL: String = js.native
    
    /**
      * A list of columns / infos to show in the report
      */
    var Columns: js.Array[Column] = js.native
    
    /**
      * The format of the report download
      */
    var DownloadFormat: CSV = js.native
    
    /**
      * The URL to download the report
      */
    var DownloadURL: String = js.native
    
    /**
      * An object of various filters for the report
      */
    var Filters: typingsSlinky.mangopay2NodejsSdk.mod.report.Filters = js.native
    
    /**
      * Whether the report should be limited to the first 10 lines(and therefore quicker to execute)
      */
    var Preview: Boolean = js.native
    
    /**
      * The date when the report was executed
      */
    var ReportDate: Timestamp = js.native
    
    /**
      * The type of report
      */
    var ReportType: TRANSACTIONS = js.native
    
    /**
      * The result code
      */
    var ResultCode: String = js.native
    
    /**
      * A verbal explanation of the ResultCode
      */
    var ResultMessage: String = js.native
    
    /**
      * The column to sort against and direction seperate by a `:`
      */
    var Sort: String = js.native
  }
  object ReportData {
    
    @scala.inline
    def apply(
      CallbackURL: String,
      Columns: js.Array[Column],
      CreationDate: Double,
      DownloadFormat: CSV,
      DownloadURL: String,
      Filters: Filters,
      Id: String,
      Preview: Boolean,
      ReportDate: Timestamp,
      ReportType: TRANSACTIONS,
      ResultCode: String,
      ResultMessage: String,
      Sort: String,
      Tag: String
    ): ReportData = {
      val __obj = js.Dynamic.literal(CallbackURL = CallbackURL.asInstanceOf[js.Any], Columns = Columns.asInstanceOf[js.Any], CreationDate = CreationDate.asInstanceOf[js.Any], DownloadFormat = DownloadFormat.asInstanceOf[js.Any], DownloadURL = DownloadURL.asInstanceOf[js.Any], Filters = Filters.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], Preview = Preview.asInstanceOf[js.Any], ReportDate = ReportDate.asInstanceOf[js.Any], ReportType = ReportType.asInstanceOf[js.Any], ResultCode = ResultCode.asInstanceOf[js.Any], ResultMessage = ResultMessage.asInstanceOf[js.Any], Sort = Sort.asInstanceOf[js.Any], Tag = Tag.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReportData]
    }
    
    @scala.inline
    implicit class ReportDataMutableBuilder[Self <: ReportData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCallbackURL(value: String): Self = StObject.set(x, "CallbackURL", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumns(value: js.Array[Column]): Self = StObject.set(x, "Columns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumnsVarargs(value: Column*): Self = StObject.set(x, "Columns", js.Array(value :_*))
      
      @scala.inline
      def setDownloadFormat(value: CSV): Self = StObject.set(x, "DownloadFormat", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDownloadURL(value: String): Self = StObject.set(x, "DownloadURL", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilters(value: Filters): Self = StObject.set(x, "Filters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreview(value: Boolean): Self = StObject.set(x, "Preview", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReportDate(value: Timestamp): Self = StObject.set(x, "ReportDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReportType(value: TRANSACTIONS): Self = StObject.set(x, "ReportType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResultCode(value: String): Self = StObject.set(x, "ResultCode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResultMessage(value: String): Self = StObject.set(x, "ResultMessage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSort(value: String): Self = StObject.set(x, "Sort", value.asInstanceOf[js.Any])
    }
  }
}
