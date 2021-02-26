package typingsSlinky.mangopay2NodejsSdk.mod

import typingsSlinky.mangopay2NodejsSdk.typesMod.ApiMethod
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MangoPay extends StObject {
  
  var BankAccounts: typingsSlinky.mangopay2NodejsSdk.mod.BankAccounts = js.native
  
  var BankingAliases: typingsSlinky.mangopay2NodejsSdk.mod.BankingAliases = js.native
  
  var CardPreAuthorizations: typingsSlinky.mangopay2NodejsSdk.mod.CardPreAuthorizations = js.native
  
  var CardRegistrations: typingsSlinky.mangopay2NodejsSdk.mod.CardRegistrations = js.native
  
  var Cards: typingsSlinky.mangopay2NodejsSdk.mod.Cards = js.native
  
  var Clients: typingsSlinky.mangopay2NodejsSdk.mod.Clients = js.native
  
  var DisputeDocuments: typingsSlinky.mangopay2NodejsSdk.mod.DisputeDocuments = js.native
  
  var Disputes: typingsSlinky.mangopay2NodejsSdk.mod.Disputes = js.native
  
  var Events: typingsSlinky.mangopay2NodejsSdk.mod.Events = js.native
  
  var Hooks: typingsSlinky.mangopay2NodejsSdk.mod.Hooks = js.native
  
  var KycDocuments: typingsSlinky.mangopay2NodejsSdk.mod.KycDocuments = js.native
  
  def Log(args: js.Any*): Unit = js.native
  
  var Mandates: typingsSlinky.mangopay2NodejsSdk.mod.Mandates = js.native
  
  var PayIns: typingsSlinky.mangopay2NodejsSdk.mod.PayIns = js.native
  
  var PayOuts: typingsSlinky.mangopay2NodejsSdk.mod.PayOuts = js.native
  
  var Refunds: typingsSlinky.mangopay2NodejsSdk.mod.Refunds = js.native
  
  var Reports: typingsSlinky.mangopay2NodejsSdk.mod.Reports = js.native
  
  var Repudiations: typingsSlinky.mangopay2NodejsSdk.mod.Repudiations = js.native
  
  var Responses: typingsSlinky.mangopay2NodejsSdk.mod.Responses = js.native
  
  var Transfers: typingsSlinky.mangopay2NodejsSdk.mod.Transfers = js.native
  
  var UboDeclarations: typingsSlinky.mangopay2NodejsSdk.mod.UboDeclarations = js.native
  
  var Users: typingsSlinky.mangopay2NodejsSdk.mod.Users = js.native
  
  var Wallets: typingsSlinky.mangopay2NodejsSdk.mod.Wallets = js.native
  
  def authorize(): js.Promise[AuthorizationData] = js.native
  def authorize(callback: js.Function1[/* data */ AuthorizationData, Unit]): Unit = js.native
  
  def buildRequestData(entity: js.Any): js.Any = js.native
  
  def canReadSubRequestData(entity: js.Any, propertyName: js.Any): Boolean = js.native
  
  var config: Config = js.native
  
  def isExpired(): Boolean = js.native
  
  def method(method: ApiMethod, callback: js.Function1[/* repeated */ js.Any, Unit], options: RequestOptions): js.Any = js.native
  
  var models: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof MangoPay.models */ js.Any = js.native
  
  var requestOptions: RequestOptions = js.native
}
