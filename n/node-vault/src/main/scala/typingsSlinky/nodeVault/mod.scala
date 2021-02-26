package typingsSlinky.nodeVault

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.nodeVault.anon.Body
import typingsSlinky.nodeVault.anon.Method
import typingsSlinky.nodeVault.anon.Query
import typingsSlinky.request.mod.CoreOptions
import typingsSlinky.std.PromiseConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("node-vault", JSImport.Namespace)
  @js.native
  def apply(): client = js.native
  @JSImport("node-vault", JSImport.Namespace)
  @js.native
  def apply(options: VaultOptions): client = js.native
  
  type Option = StringDictionary[js.Any]
  
  @js.native
  trait RequestOption extends Option {
    
    var method: String = js.native
    
    var path: String = js.native
  }
  object RequestOption {
    
    @scala.inline
    def apply(method: String, path: String): RequestOption = {
      val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[RequestOption]
    }
    
    @scala.inline
    implicit class RequestOptionMutableBuilder[Self <: RequestOption] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait VaultOptions extends StObject {
    
    var Promise: js.UndefOr[PromiseConstructor] = js.native
    
    var apiVersion: js.UndefOr[String] = js.native
    
    var commands: js.UndefOr[js.Array[Method]] = js.native
    
    var debug: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.native
    
    var endpoint: js.UndefOr[String] = js.native
    
    var mustache: js.UndefOr[js.Any] = js.native
    
    var namespace: js.UndefOr[String] = js.native
    
    var noCustomHTTPVerbs: js.UndefOr[Boolean] = js.native
    
    var pathPrefix: js.UndefOr[String] = js.native
    
    var `request-promise`: js.UndefOr[js.Any] = js.native
    
    var requestOptions: js.UndefOr[CoreOptions] = js.native
    
    var token: js.UndefOr[String] = js.native
    
    var tv4: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.native
  }
  object VaultOptions {
    
    @scala.inline
    def apply(): VaultOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[VaultOptions]
    }
    
    @scala.inline
    implicit class VaultOptionsMutableBuilder[Self <: VaultOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApiVersion(value: String): Self = StObject.set(x, "apiVersion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setApiVersionUndefined: Self = StObject.set(x, "apiVersion", js.undefined)
      
      @scala.inline
      def setCommands(value: js.Array[Method]): Self = StObject.set(x, "commands", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCommandsUndefined: Self = StObject.set(x, "commands", js.undefined)
      
      @scala.inline
      def setCommandsVarargs(value: Method*): Self = StObject.set(x, "commands", js.Array(value :_*))
      
      @scala.inline
      def setDebug(value: /* repeated */ js.Any => _): Self = StObject.set(x, "debug", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
      
      @scala.inline
      def setEndpoint(value: String): Self = StObject.set(x, "endpoint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndpointUndefined: Self = StObject.set(x, "endpoint", js.undefined)
      
      @scala.inline
      def setMustache(value: js.Any): Self = StObject.set(x, "mustache", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMustacheUndefined: Self = StObject.set(x, "mustache", js.undefined)
      
      @scala.inline
      def setNamespace(value: String): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNamespaceUndefined: Self = StObject.set(x, "namespace", js.undefined)
      
      @scala.inline
      def setNoCustomHTTPVerbs(value: Boolean): Self = StObject.set(x, "noCustomHTTPVerbs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoCustomHTTPVerbsUndefined: Self = StObject.set(x, "noCustomHTTPVerbs", js.undefined)
      
      @scala.inline
      def setPathPrefix(value: String): Self = StObject.set(x, "pathPrefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathPrefixUndefined: Self = StObject.set(x, "pathPrefix", js.undefined)
      
      @scala.inline
      def setPromise(value: PromiseConstructor): Self = StObject.set(x, "Promise", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPromiseUndefined: Self = StObject.set(x, "Promise", js.undefined)
      
      @scala.inline
      def `setRequest-promise`(value: js.Any): Self = StObject.set(x, "request-promise", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setRequest-promiseUndefined`: Self = StObject.set(x, "request-promise", js.undefined)
      
      @scala.inline
      def setRequestOptions(value: CoreOptions): Self = StObject.set(x, "requestOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequestOptionsUndefined: Self = StObject.set(x, "requestOptions", js.undefined)
      
      @scala.inline
      def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTokenUndefined: Self = StObject.set(x, "token", js.undefined)
      
      @scala.inline
      def setTv4(value: /* repeated */ js.Any => _): Self = StObject.set(x, "tv4", js.Any.fromFunction1(value))
      
      @scala.inline
      def setTv4Undefined: Self = StObject.set(x, "tv4", js.undefined)
    }
  }
  
  @js.native
  trait client extends StObject {
    
    def addApproleRole(): js.Promise[_] = js.native
    def addApproleRole(options: Option): js.Promise[_] = js.native
    
    def addPolicy(): js.Promise[_] = js.native
    def addPolicy(options: Option): js.Promise[_] = js.native
    
    def addTokenRole(): js.Promise[_] = js.native
    def addTokenRole(options: Option): js.Promise[_] = js.native
    
    var apiVersion: String = js.native
    
    def approleLogin(): js.Promise[_] = js.native
    def approleLogin(options: Option): js.Promise[_] = js.native
    
    def approleRoles(): js.Promise[_] = js.native
    def approleRoles(options: Option): js.Promise[_] = js.native
    
    def approleSecretAccessorDestroy(): js.Promise[_] = js.native
    def approleSecretAccessorDestroy(options: Option): js.Promise[_] = js.native
    
    def approleSecretAccessorLookup(): js.Promise[_] = js.native
    def approleSecretAccessorLookup(options: Option): js.Promise[_] = js.native
    
    def approleSecretAccessors(): js.Promise[_] = js.native
    def approleSecretAccessors(options: Option): js.Promise[_] = js.native
    
    def approleSecretDestroy(): js.Promise[_] = js.native
    def approleSecretDestroy(options: Option): js.Promise[_] = js.native
    
    def approleSecretLookup(): js.Promise[_] = js.native
    def approleSecretLookup(options: Option): js.Promise[_] = js.native
    
    def audits(): js.Promise[_] = js.native
    def audits(options: Option): js.Promise[_] = js.native
    
    def auths(): js.Promise[_] = js.native
    def auths(options: Option): js.Promise[_] = js.native
    
    def awsIamLogin(): js.Promise[_] = js.native
    def awsIamLogin(options: Option): js.Promise[_] = js.native
    
    def decryptData(): js.Promise[_] = js.native
    def decryptData(options: Option): js.Promise[_] = js.native
    
    def delete(path: String): js.Promise[_] = js.native
    def delete(path: String, requestOptions: Option): js.Promise[_] = js.native
    
    def deleteApproleRole(): js.Promise[_] = js.native
    def deleteApproleRole(options: Option): js.Promise[_] = js.native
    
    def disableAudit(): js.Promise[_] = js.native
    def disableAudit(options: Option): js.Promise[_] = js.native
    
    def disableAuth(): js.Promise[_] = js.native
    def disableAuth(options: Option): js.Promise[_] = js.native
    
    def enableAudit(): js.Promise[_] = js.native
    def enableAudit(options: Option): js.Promise[_] = js.native
    
    def enableAuth(): js.Promise[_] = js.native
    def enableAuth(options: Option): js.Promise[_] = js.native
    
    def encryptData(): js.Promise[_] = js.native
    def encryptData(options: Option): js.Promise[_] = js.native
    
    var endpoint: String = js.native
    
    def generateDatabaseCredentials(): js.Promise[_] = js.native
    def generateDatabaseCredentials(options: Option): js.Promise[_] = js.native
    
    def generateFunction(name: String, conf: functionConf): Unit = js.native
    
    def generateRootCancel(): js.Promise[_] = js.native
    def generateRootCancel(options: Option): js.Promise[_] = js.native
    
    def generateRootInit(): js.Promise[_] = js.native
    def generateRootInit(options: Option): js.Promise[_] = js.native
    
    def generateRootStatus(): js.Promise[_] = js.native
    def generateRootStatus(options: Option): js.Promise[_] = js.native
    
    def generateRootUpdate(): js.Promise[_] = js.native
    def generateRootUpdate(options: Option): js.Promise[_] = js.native
    
    def getApproleRole(): js.Promise[_] = js.native
    def getApproleRole(options: Option): js.Promise[_] = js.native
    
    def getApproleRoleId(): js.Promise[_] = js.native
    def getApproleRoleId(options: Option): js.Promise[_] = js.native
    
    def getApproleRoleSecret(): js.Promise[_] = js.native
    def getApproleRoleSecret(options: Option): js.Promise[_] = js.native
    
    def getPolicy(): js.Promise[_] = js.native
    def getPolicy(options: Option): js.Promise[_] = js.native
    
    def getTokenRole(): js.Promise[_] = js.native
    def getTokenRole(options: Option): js.Promise[_] = js.native
    
    def githubLogin(): js.Promise[_] = js.native
    def githubLogin(options: Option): js.Promise[_] = js.native
    
    def handleVaultResponse(): js.Promise[_] = js.native
    def handleVaultResponse(res: Body): js.Promise[_] = js.native
    
    def health(): js.Promise[_] = js.native
    def health(options: Option): js.Promise[_] = js.native
    
    def help(path: String): js.Promise[_] = js.native
    def help(path: String, requestOptions: Option): js.Promise[_] = js.native
    
    def init(): js.Promise[_] = js.native
    def init(options: Option): js.Promise[_] = js.native
    
    def initialized(): js.Promise[_] = js.native
    def initialized(options: Option): js.Promise[_] = js.native
    
    def kubernetesLogin(): js.Promise[_] = js.native
    def kubernetesLogin(options: Option): js.Promise[_] = js.native
    
    def leader(): js.Promise[_] = js.native
    def leader(options: Option): js.Promise[_] = js.native
    
    def list(path: String): js.Promise[_] = js.native
    def list(path: String, requestOptions: Option): js.Promise[_] = js.native
    
    def mount(): js.Promise[_] = js.native
    def mount(options: Option): js.Promise[_] = js.native
    
    def mounts(): js.Promise[_] = js.native
    def mounts(options: Option): js.Promise[_] = js.native
    
    def policies(): js.Promise[_] = js.native
    def policies(options: Option): js.Promise[_] = js.native
    
    def read(path: String): js.Promise[_] = js.native
    def read(path: String, requestOptions: Option): js.Promise[_] = js.native
    
    def remount(): js.Promise[_] = js.native
    def remount(options: Option): js.Promise[_] = js.native
    
    def removePolicy(): js.Promise[_] = js.native
    def removePolicy(options: Option): js.Promise[_] = js.native
    
    def removeTokenRole(): js.Promise[_] = js.native
    def removeTokenRole(options: Option): js.Promise[_] = js.native
    
    def renew(): js.Promise[_] = js.native
    def renew(options: Option): js.Promise[_] = js.native
    
    def request(requestOptions: RequestOption): js.Promise[_] = js.native
    
    def revoke(): js.Promise[_] = js.native
    def revoke(options: Option): js.Promise[_] = js.native
    
    def revokePrefix(): js.Promise[_] = js.native
    def revokePrefix(options: Option): js.Promise[_] = js.native
    
    def rotate(): js.Promise[_] = js.native
    def rotate(options: Option): js.Promise[_] = js.native
    
    def seal(): js.Promise[_] = js.native
    def seal(options: Option): js.Promise[_] = js.native
    
    def status(): js.Promise[_] = js.native
    def status(options: Option): js.Promise[_] = js.native
    
    def stepDown(): js.Promise[_] = js.native
    def stepDown(options: Option): js.Promise[_] = js.native
    
    var token: String = js.native
    
    def tokenAccessors(): js.Promise[_] = js.native
    def tokenAccessors(options: Option): js.Promise[_] = js.native
    
    def tokenCreate(): js.Promise[_] = js.native
    def tokenCreate(options: Option): js.Promise[_] = js.native
    
    def tokenCreateOrphan(): js.Promise[_] = js.native
    def tokenCreateOrphan(options: Option): js.Promise[_] = js.native
    
    def tokenCreateRole(): js.Promise[_] = js.native
    def tokenCreateRole(options: Option): js.Promise[_] = js.native
    
    def tokenLookup(): js.Promise[_] = js.native
    def tokenLookup(options: Option): js.Promise[_] = js.native
    
    def tokenLookupAccessor(): js.Promise[_] = js.native
    def tokenLookupAccessor(options: Option): js.Promise[_] = js.native
    
    def tokenLookupSelf(): js.Promise[_] = js.native
    def tokenLookupSelf(options: Option): js.Promise[_] = js.native
    
    def tokenRenew(): js.Promise[_] = js.native
    def tokenRenew(options: Option): js.Promise[_] = js.native
    
    def tokenRenewSelf(): js.Promise[_] = js.native
    def tokenRenewSelf(options: Option): js.Promise[_] = js.native
    
    def tokenRevoke(): js.Promise[_] = js.native
    def tokenRevoke(options: Option): js.Promise[_] = js.native
    
    def tokenRevokeAccessor(): js.Promise[_] = js.native
    def tokenRevokeAccessor(options: Option): js.Promise[_] = js.native
    
    def tokenRevokeOrphan(): js.Promise[_] = js.native
    def tokenRevokeOrphan(options: Option): js.Promise[_] = js.native
    
    def tokenRevokeSelf(): js.Promise[_] = js.native
    def tokenRevokeSelf(options: Option): js.Promise[_] = js.native
    
    def tokenRoles(): js.Promise[_] = js.native
    def tokenRoles(options: Option): js.Promise[_] = js.native
    
    def unmount(): js.Promise[_] = js.native
    def unmount(options: Option): js.Promise[_] = js.native
    
    def unseal(): js.Promise[_] = js.native
    def unseal(options: Option): js.Promise[_] = js.native
    
    def updateApproleRoleId(): js.Promise[_] = js.native
    def updateApproleRoleId(options: Option): js.Promise[_] = js.native
    
    def userpassLogin(): js.Promise[_] = js.native
    def userpassLogin(options: Option): js.Promise[_] = js.native
    
    def write(path: String, data: js.Any): js.Promise[_] = js.native
    def write(path: String, data: js.Any, requestOptions: Option): js.Promise[_] = js.native
  }
  
  @js.native
  trait functionConf extends StObject {
    
    var method: String = js.native
    
    var path: String = js.native
    
    var schema: js.UndefOr[Query] = js.native
  }
  object functionConf {
    
    @scala.inline
    def apply(method: String, path: String): functionConf = {
      val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[functionConf]
    }
    
    @scala.inline
    implicit class functionConfMutableBuilder[Self <: functionConf] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSchema(value: Query): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSchemaUndefined: Self = StObject.set(x, "schema", js.undefined)
    }
  }
}
