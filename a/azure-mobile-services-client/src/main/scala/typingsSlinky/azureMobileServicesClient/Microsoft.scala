package typingsSlinky.azureMobileServicesClient

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Microsoft {
  
  object WindowsAzure {
    
    // Interface to describe Query object fluent creation based on Microsoft Azure documentation: http://msdn.microsoft.com/en-us/library/windowsazure/jj613353.aspx
    @js.native
    trait IQuery extends StObject {
      
      def includeTotalCount(): IQuery = js.native
      
      def orderBy(propName: String*): IQuery = js.native
      
      def orderByDescending(propName: String*): IQuery = js.native
      
      def read(): asyncPromise = js.native
      def read(paramsQS: js.Object): asyncPromise = js.native
      
      def select(funcProjectionFromThis: js.Function0[_]): IQuery = js.native
      def select(propNameSelected: String*): IQuery = js.native
      
      def skip(n: Double): IQuery = js.native
      
      def take(n: Double): IQuery = js.native
      
      def where(funcPredicateOnThis: js.Function1[/* repeated */ js.Any, Boolean], qValues: js.Any*): IQuery = js.native
      def where(mapObjFilterCriteria: js.Any): IQuery = js.native
    }
    
    @js.native
    trait InvokeApiOptions extends StObject {
      
      var body: js.UndefOr[js.Any] = js.native
      
      var headers: js.UndefOr[js.Object] = js.native
      
      var method: js.UndefOr[String] = js.native
      
      var parameters: js.UndefOr[js.Object] = js.native
    }
    object InvokeApiOptions {
      
      @scala.inline
      def apply(): InvokeApiOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[InvokeApiOptions]
      }
      
      @scala.inline
      implicit class InvokeApiOptionsMutableBuilder[Self <: InvokeApiOptions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setBody(value: js.Any): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
        
        @scala.inline
        def setHeaders(value: js.Object): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
        
        @scala.inline
        def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
        
        @scala.inline
        def setParameters(value: js.Object): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
      }
    }
    
    // MobileServiceClient object based on Microsoft Azure documentation: http://msdn.microsoft.com/en-us/library/windowsazure/jj554219.aspx
    @js.native
    trait MobileServiceClient
      extends Instantiable1[/* applicationUrl */ String, MobileServiceClient]
         with Instantiable2[/* applicationUrl */ String, /* applicationKey */ String, MobileServiceClient] {
      
      var applicationKey: String = js.native
      
      var applicationUrl: String = js.native
      
      var currentUser: User = js.native
      
      def getTable(tableName: String): MobileServiceTable = js.native
      
      /**
        * Invokes the specified custom api and returns a response object.
        *
        * @param apiName The custom api to invoke.
        * @param options Contains additional parameter information, valid values are:
        *     body: The body of the HTTP request.
        *     method: The HTTP method to use in the request, with the default being POST,
        *     parameters: Any additional query string parameters, 
        *     headers: HTTP request headers, specified as an object.
        * @param callback Optional callback accepting (error, results) parameters.
        */
      def invokeApi(apiName: String): asyncPromise = js.native
      def invokeApi(
        apiName: String,
        options: js.UndefOr[scala.Nothing],
        callback: js.Function2[/* error */ js.Any, /* results */ js.Any, Unit]
      ): asyncPromise = js.native
      def invokeApi(apiName: String, options: InvokeApiOptions): asyncPromise = js.native
      def invokeApi(
        apiName: String,
        options: InvokeApiOptions,
        callback: js.Function2[/* error */ js.Any, /* results */ js.Any, Unit]
      ): asyncPromise = js.native
      
      def login(provider: String): asyncPromise = js.native
      def login(provider: String, callback: js.Function2[/* error */ js.Any, /* user */ User, Unit]): Unit = js.native
      def login(provider: String, token: String): asyncPromise = js.native
      //for provider:string use one of ProviderEnum: 'microsoftaccount', 'facebook', 'twitter', 'google'
      def login(provider: String, token: String, callback: js.Function2[/* error */ js.Any, /* user */ User, Unit]): Unit = js.native
      
      def logout(): asyncPromise = js.native
      
      var push: Push = js.native
      
      def withFilter(
        serviceFilter: js.Function3[
              /* request */ js.Any, 
              /* next */ js.Function2[
                /* request */ js.Any, 
                /* callback */ js.Function2[/* error */ js.Any, /* response */ js.Any, Unit], 
                Unit
              ], 
              /* callback */ js.Function2[/* error */ js.Any, /* response */ js.Any, Unit], 
              Unit
            ]
      ): MobileServiceClient = js.native
    }
    
    // MobileServiceTable object based on Microsoft Azure documentation: http://msdn.microsoft.com/en-us/library/windowsazure/jj554239.aspx
    @js.native
    trait MobileServiceTable
      extends IQuery
         with Instantiable2[/* tableName */ String, /* client */ MobileServiceClient, MobileServiceTable] {
      
      def del(instance: js.Any): asyncPromise = js.native
      def del(instance: js.Any, paramsQS: js.Object): asyncPromise = js.native
      def del(
        instance: js.Any,
        paramsQS: js.Object,
        callback: js.Function1[/* error */ js.UndefOr[js.Any], Unit]
      ): Unit = js.native
      
      def getMobileServiceClient(): MobileServiceClient = js.native
      
      def getTableName(): String = js.native
      
      def insert(instance: js.Any): asyncPromise = js.native
      def insert(instance: js.Any, paramsQS: js.Object): asyncPromise = js.native
      def insert(
        instance: js.Any,
        paramsQS: js.Object,
        callback: js.Function2[/* error */ js.Any, /* retInserted */ js.Any, _]
      ): Unit = js.native
      
      def lookup(id: Double): asyncPromise = js.native
      def lookup(id: Double, paramsQS: js.Object): asyncPromise = js.native
      def lookup(
        id: Double,
        paramsQS: js.Object,
        callback: js.Function2[/* error */ js.Any, /* retValue */ js.Any, _]
      ): Unit = js.native
      
      def read(query: IQuery): asyncPromise = js.native
      def read(query: IQuery, paramsQS: js.Object): asyncPromise = js.native
      def read(
        query: IQuery,
        paramsQS: js.Object,
        callback: js.Function2[/* error */ js.Any, /* retValues */ js.Any, _]
      ): Unit = js.native
      
      def update(instance: js.Any): asyncPromise = js.native
      def update(instance: js.Any, paramsQS: js.Object): asyncPromise = js.native
      def update(
        instance: js.Any,
        paramsQS: js.Object,
        callback: js.Function2[/* error */ js.Any, /* retUpdated */ js.Any, _]
      ): Unit = js.native
    }
    
    @js.native
    trait Push extends StObject {
      
      /**
        * Register a push channel with the Mobile Apps backend to start receiving notifications.
        *
        * @param platform The device platform being used - wns, gcm or apns.
        * @param pushChannel The push channel identifier or URI.
        * @param templates An object containing template definitions. Template objects should contain body, headers and tags properties.
        * @param secondaryTiles An object containing template definitions to be used with secondary tiles when using WNS.
        * @param callback Optional callback accepting (error, results) parameters.
        */
      def register(platform: String, pushChannel: String): Unit = js.native
      def register(
        platform: String,
        pushChannel: String,
        templates: js.UndefOr[scala.Nothing],
        secondaryTiles: js.UndefOr[scala.Nothing],
        callback: js.Function2[/* error */ js.Any, /* results */ js.Any, Unit]
      ): Unit = js.native
      def register(
        platform: String,
        pushChannel: String,
        templates: js.UndefOr[scala.Nothing],
        secondaryTiles: js.Any
      ): Unit = js.native
      def register(
        platform: String,
        pushChannel: String,
        templates: js.UndefOr[scala.Nothing],
        secondaryTiles: js.Any,
        callback: js.Function2[/* error */ js.Any, /* results */ js.Any, Unit]
      ): Unit = js.native
      def register(platform: String, pushChannel: String, templates: js.Any): Unit = js.native
      def register(
        platform: String,
        pushChannel: String,
        templates: js.Any,
        secondaryTiles: js.UndefOr[scala.Nothing],
        callback: js.Function2[/* error */ js.Any, /* results */ js.Any, Unit]
      ): Unit = js.native
      def register(platform: String, pushChannel: String, templates: js.Any, secondaryTiles: js.Any): Unit = js.native
      def register(
        platform: String,
        pushChannel: String,
        templates: js.Any,
        secondaryTiles: js.Any,
        callback: js.Function2[/* error */ js.Any, /* results */ js.Any, Unit]
      ): Unit = js.native
      
      /**
        * Invokes the specified custom api and returns a response object.
        *
        * @param pushChannel The push channel identifier or URI.
        * @param callback Optional callback accepting (error, results) parameters.
        */
      def unregister(pushChannel: String): Unit = js.native
      def unregister(pushChannel: String, callback: js.Function2[/* error */ js.Any, /* results */ js.Any, Unit]): Unit = js.native
    }
    
    // User object based on Microsoft Azure documentation: http://msdn.microsoft.com/en-us/library/windowsazure/jj554220.aspx
    @js.native
    trait User extends StObject {
      
      // { [providerName: string]: { userId: string, accessToken: string, accessTokenSecret?: string }; };
      var accessTokens: js.Any = js.native
      
      def getIdentities(): js.Any = js.native
      
      // { [providerName: string]: string; }
      var level: String = js.native
      
      var mobileServiceAuthenticationToken: String = js.native
      
      //for level:string use one of LevelEnum: 'admin','anonymous','authenticated'
      var userId: String = js.native
    }
    object User {
      
      @scala.inline
      def apply(
        accessTokens: js.Any,
        getIdentities: () => js.Any,
        level: String,
        mobileServiceAuthenticationToken: String,
        userId: String
      ): User = {
        val __obj = js.Dynamic.literal(accessTokens = accessTokens.asInstanceOf[js.Any], getIdentities = js.Any.fromFunction0(getIdentities), level = level.asInstanceOf[js.Any], mobileServiceAuthenticationToken = mobileServiceAuthenticationToken.asInstanceOf[js.Any], userId = userId.asInstanceOf[js.Any])
        __obj.asInstanceOf[User]
      }
      
      @scala.inline
      implicit class UserMutableBuilder[Self <: User] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAccessTokens(value: js.Any): Self = StObject.set(x, "accessTokens", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setGetIdentities(value: () => js.Any): Self = StObject.set(x, "getIdentities", js.Any.fromFunction0(value))
        
        @scala.inline
        def setLevel(value: String): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMobileServiceAuthenticationToken(value: String): Self = StObject.set(x, "mobileServiceAuthenticationToken", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setUserId(value: String): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
      }
    }
    
    @js.native
    trait WindowsAzureStatic extends StObject {
      
      var MobileServiceClient: typingsSlinky.azureMobileServicesClient.Microsoft.WindowsAzure.MobileServiceClient = js.native
    }
    object WindowsAzureStatic {
      
      @scala.inline
      def apply(MobileServiceClient: MobileServiceClient): WindowsAzureStatic = {
        val __obj = js.Dynamic.literal(MobileServiceClient = MobileServiceClient.asInstanceOf[js.Any])
        __obj.asInstanceOf[WindowsAzureStatic]
      }
      
      @scala.inline
      implicit class WindowsAzureStaticMutableBuilder[Self <: WindowsAzureStatic] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setMobileServiceClient(value: MobileServiceClient): Self = StObject.set(x, "MobileServiceClient", value.asInstanceOf[js.Any])
      }
    }
    
    // Interface to Platform.async(func) => Platform.Promise based on code MobileServices.Web-1.0.0.js
    @js.native
    trait asyncPromise extends StObject {
      
      def done(): Unit = js.native
      def done(onSuccess: js.UndefOr[scala.Nothing], onError: js.Function1[/* error */ js.Any, Unit]): Unit = js.native
      def done(onSuccess: js.Function1[/* result */ js.Any, Unit]): Unit = js.native
      def done(
        onSuccess: js.Function1[/* result */ js.Any, Unit],
        onError: js.Function1[/* error */ js.Any, Unit]
      ): Unit = js.native
      
      def `then`(onSuccess: js.Function1[/* result */ js.Any, _]): asyncPromise = js.native
      def `then`(onSuccess: js.Function1[/* result */ js.Any, _], onError: js.Function1[/* error */ js.Any, _]): asyncPromise = js.native
    }
  }
}
