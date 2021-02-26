package typingsSlinky.reduxSentryMiddleware

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.sentryBrowser.anon.TypeofBreadcrumbs
import typingsSlinky.sentryBrowser.anon.TypeofCoreIntegrations
import typingsSlinky.sentryBrowser.anon.TypeofCoreIntegrationsInstantiable
import typingsSlinky.sentryBrowser.anon.TypeofGlobalHandlers
import typingsSlinky.sentryBrowser.anon.TypeofLinkedErrors
import typingsSlinky.sentryBrowser.anon.TypeofTryCatch
import typingsSlinky.sentryBrowser.anon.TypeofUserAgent
import typingsSlinky.sentryBrowser.backendMod.BrowserOptions
import typingsSlinky.sentryBrowser.helpersMod.ReportDialogOptions
import typingsSlinky.sentryBrowser.integrationsMod.Breadcrumbs
import typingsSlinky.sentryBrowser.integrationsMod.GlobalHandlers
import typingsSlinky.sentryBrowser.integrationsMod.LinkedErrors
import typingsSlinky.sentryBrowser.integrationsMod.TryCatch
import typingsSlinky.sentryBrowser.integrationsMod.UserAgent
import typingsSlinky.sentryBrowser.mod.Scope
import typingsSlinky.sentryBrowser.mod.Transports.BaseTransport
import typingsSlinky.sentryBrowser.mod.Transports.FetchTransport
import typingsSlinky.sentryBrowser.mod.Transports.XHRTransport
import typingsSlinky.sentryCore.mod.Integrations.FunctionToString
import typingsSlinky.sentryCore.mod.Integrations.InboundFilters
import typingsSlinky.sentryHub.hubMod.Hub
import typingsSlinky.sentryHub.interfacesMod.Carrier
import typingsSlinky.sentryTypes.breadcrumbMod.Breadcrumb
import typingsSlinky.sentryTypes.eventMod.Event
import typingsSlinky.sentryTypes.eventMod.EventHint
import typingsSlinky.sentryTypes.eventprocessorMod.EventProcessor
import typingsSlinky.sentryTypes.extraMod.Extra
import typingsSlinky.sentryTypes.extraMod.Extras
import typingsSlinky.sentryTypes.optionsMod.Options
import typingsSlinky.sentryTypes.scopeMod.CaptureContext
import typingsSlinky.sentryTypes.severityMod.Severity
import typingsSlinky.sentryTypes.statusMod.Status
import typingsSlinky.sentryTypes.transactionMod.CustomSamplingContext
import typingsSlinky.sentryTypes.transactionMod.Transaction
import typingsSlinky.sentryTypes.transactionMod.TransactionContext
import typingsSlinky.sentryTypes.transportMod.TransportOptions
import typingsSlinky.sentryTypes.userMod.User
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Typeof extends StObject {
    
    var Breadcrumbs: TypeofBreadcrumbs = js.native
    
    var FunctionToString: TypeofCoreIntegrations = js.native
    
    var GlobalHandlers: TypeofGlobalHandlers = js.native
    
    var InboundFilters: TypeofCoreIntegrationsInstantiable = js.native
    
    var LinkedErrors: TypeofLinkedErrors = js.native
    
    var TryCatch: TypeofTryCatch = js.native
    
    var UserAgent: TypeofUserAgent = js.native
  }
  object Typeof {
    
    @scala.inline
    def apply(
      Breadcrumbs: TypeofBreadcrumbs,
      FunctionToString: TypeofCoreIntegrations,
      GlobalHandlers: TypeofGlobalHandlers,
      InboundFilters: TypeofCoreIntegrationsInstantiable,
      LinkedErrors: TypeofLinkedErrors,
      TryCatch: TypeofTryCatch,
      UserAgent: TypeofUserAgent
    ): Typeof = {
      val __obj = js.Dynamic.literal(Breadcrumbs = Breadcrumbs.asInstanceOf[js.Any], FunctionToString = FunctionToString.asInstanceOf[js.Any], GlobalHandlers = GlobalHandlers.asInstanceOf[js.Any], InboundFilters = InboundFilters.asInstanceOf[js.Any], LinkedErrors = LinkedErrors.asInstanceOf[js.Any], TryCatch = TryCatch.asInstanceOf[js.Any], UserAgent = UserAgent.asInstanceOf[js.Any])
      __obj.asInstanceOf[Typeof]
    }
    
    @scala.inline
    implicit class TypeofMutableBuilder[Self <: Typeof] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBreadcrumbs(value: TypeofBreadcrumbs): Self = StObject.set(x, "Breadcrumbs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFunctionToString(value: TypeofCoreIntegrations): Self = StObject.set(x, "FunctionToString", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGlobalHandlers(value: TypeofGlobalHandlers): Self = StObject.set(x, "GlobalHandlers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInboundFilters(value: TypeofCoreIntegrationsInstantiable): Self = StObject.set(x, "InboundFilters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLinkedErrors(value: TypeofLinkedErrors): Self = StObject.set(x, "LinkedErrors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTryCatch(value: TypeofTryCatch): Self = StObject.set(x, "TryCatch", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUserAgent(value: TypeofUserAgent): Self = StObject.set(x, "UserAgent", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait TypeofIntegrations extends Typeof
  
  @js.native
  trait TypeofScope extends Instantiable0[Scope] {
    
    def clone(scope: typingsSlinky.sentryHub.scopeMod.Scope): typingsSlinky.sentryHub.scopeMod.Scope = js.native
  }
  
  @js.native
  trait TypeofSentry extends StObject {
    
    var BrowserClient: Instantiable0[typingsSlinky.sentryBrowser.mod.BrowserClient] = js.native
    
    var Hub: Instantiable0[typingsSlinky.sentryBrowser.mod.Hub] = js.native
    
    val Integrations: TypeofIntegrations = js.native
    
    val SDK_NAME: /* "sentry.javascript.browser" */ String = js.native
    
    val SDK_VERSION: /* "5.27.4" */ String = js.native
    
    var Scope: TypeofScope = js.native
    
    val Severity: TypeofSeverity = js.native
    
    val Status: TypeofStatus = js.native
    
    val Transports: TypeofTransports = js.native
    
    def addBreadcrumb(breadcrumb: Breadcrumb): Unit = js.native
    
    def addGlobalEventProcessor(callback: EventProcessor): Unit = js.native
    
    def captureEvent(event: Event): String = js.native
    
    def captureException(exception: js.Any): String = js.native
    def captureException(exception: js.Any, captureContext: CaptureContext): String = js.native
    
    def captureMessage(message: String): String = js.native
    def captureMessage(message: String, captureContext: CaptureContext): String = js.native
    def captureMessage(message: String, captureContext: typingsSlinky.sentryTypes.severityMod.Severity): String = js.native
    
    def close(): js.Thenable[Boolean] = js.native
    def close(timeout: Double): js.Thenable[Boolean] = js.native
    
    def configureScope(callback: js.Function1[/* scope */ typingsSlinky.sentryHub.mod.Scope, Unit]): Unit = js.native
    
    val defaultIntegrations: js.Array[
        FunctionToString | InboundFilters | GlobalHandlers | TryCatch | Breadcrumbs | LinkedErrors | UserAgent
      ] = js.native
    
    def eventFromException(options: Options, exception: js.Any): js.Thenable[Event] = js.native
    def eventFromException(options: Options, exception: js.Any, hint: EventHint): js.Thenable[Event] = js.native
    
    def eventFromMessage(options: Options, message: String): js.Thenable[Event] = js.native
    def eventFromMessage(options: Options, message: String, level: js.UndefOr[scala.Nothing], hint: EventHint): js.Thenable[Event] = js.native
    def eventFromMessage(options: Options, message: String, level: typingsSlinky.sentryTypes.severityMod.Severity): js.Thenable[Event] = js.native
    def eventFromMessage(
      options: Options,
      message: String,
      level: typingsSlinky.sentryTypes.severityMod.Severity,
      hint: EventHint
    ): js.Thenable[Event] = js.native
    
    def flush(): js.Thenable[Boolean] = js.native
    def flush(timeout: Double): js.Thenable[Boolean] = js.native
    
    def forceLoad(): Unit = js.native
    
    def getCurrentHub(): Hub = js.native
    
    def getHubFromCarrier(carrier: Carrier): Hub = js.native
    
    def init(): Unit = js.native
    def init(options: BrowserOptions): Unit = js.native
    
    def injectReportDialog(): Unit = js.native
    def injectReportDialog(options: ReportDialogOptions): Unit = js.native
    
    def lastEventId(): js.UndefOr[String] = js.native
    
    def makeMain(hub: Hub): Hub = js.native
    
    def onLoad(callback: js.Function0[Unit]): Unit = js.native
    
    def setContext(name: String): Unit = js.native
    def setContext(name: String, context: StringDictionary[js.Any]): Unit = js.native
    
    def setExtra(key: String, extra: Extra): Unit = js.native
    
    def setExtras(extras: Extras): Unit = js.native
    
    def setTag(key: String, value: String): Unit = js.native
    
    def setTags(tags: StringDictionary[String]): Unit = js.native
    
    def setUser(): Unit = js.native
    def setUser(user: User): Unit = js.native
    
    def showReportDialog(): Unit = js.native
    def showReportDialog(options: ReportDialogOptions): Unit = js.native
    
    def startTransaction(context: TransactionContext): Transaction = js.native
    def startTransaction(context: TransactionContext, customSamplingContext: CustomSamplingContext): Transaction = js.native
    
    def withScope(callback: js.Function1[/* scope */ typingsSlinky.sentryHub.mod.Scope, Unit]): Unit = js.native
    
    def wrap(fn: js.Function1[/* args */ js.Any, _]): js.Any = js.native
  }
  
  @js.native
  trait TypeofSeverity extends StObject {
    
    /**
      * Converts a string-based level into a {@link Severity}.
      *
      * @param level string representation of Severity
      * @returns Severity
      */
    def fromString(level: String): Severity = js.native
  }
  object TypeofSeverity {
    
    @scala.inline
    def apply(fromString: String => Severity): TypeofSeverity = {
      val __obj = js.Dynamic.literal(fromString = js.Any.fromFunction1(fromString))
      __obj.asInstanceOf[TypeofSeverity]
    }
    
    @scala.inline
    implicit class TypeofSeverityMutableBuilder[Self <: TypeofSeverity] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFromString(value: String => Severity): Self = StObject.set(x, "fromString", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait TypeofStatus extends StObject {
    
    /**
      * Converts a HTTP status code into a {@link Status}.
      *
      * @param code The HTTP response status code.
      * @returns The send status or {@link Status.Unknown}.
      */
    def fromHttpCode(code: Double): Status = js.native
  }
  object TypeofStatus {
    
    @scala.inline
    def apply(fromHttpCode: Double => Status): TypeofStatus = {
      val __obj = js.Dynamic.literal(fromHttpCode = js.Any.fromFunction1(fromHttpCode))
      __obj.asInstanceOf[TypeofStatus]
    }
    
    @scala.inline
    implicit class TypeofStatusMutableBuilder[Self <: TypeofStatus] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFromHttpCode(value: Double => Status): Self = StObject.set(x, "fromHttpCode", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait TypeofTransports extends StObject {
    
    var BaseTransport: Instantiable1[
        /* options */ TransportOptions, 
        typingsSlinky.sentryBrowser.mod.Transports.BaseTransport
      ] = js.native
    
    var FetchTransport: Instantiable1[
        /* options */ TransportOptions, 
        typingsSlinky.sentryBrowser.mod.Transports.FetchTransport
      ] = js.native
    
    var XHRTransport: Instantiable1[
        /* options */ TransportOptions, 
        typingsSlinky.sentryBrowser.mod.Transports.XHRTransport
      ] = js.native
  }
  object TypeofTransports {
    
    @scala.inline
    def apply(
      BaseTransport: Instantiable1[/* options */ TransportOptions, BaseTransport],
      FetchTransport: Instantiable1[/* options */ TransportOptions, FetchTransport],
      XHRTransport: Instantiable1[/* options */ TransportOptions, XHRTransport]
    ): TypeofTransports = {
      val __obj = js.Dynamic.literal(BaseTransport = BaseTransport.asInstanceOf[js.Any], FetchTransport = FetchTransport.asInstanceOf[js.Any], XHRTransport = XHRTransport.asInstanceOf[js.Any])
      __obj.asInstanceOf[TypeofTransports]
    }
    
    @scala.inline
    implicit class TypeofTransportsMutableBuilder[Self <: TypeofTransports] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBaseTransport(value: Instantiable1[/* options */ TransportOptions, BaseTransport]): Self = StObject.set(x, "BaseTransport", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFetchTransport(value: Instantiable1[/* options */ TransportOptions, FetchTransport]): Self = StObject.set(x, "FetchTransport", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXHRTransport(value: Instantiable1[/* options */ TransportOptions, XHRTransport]): Self = StObject.set(x, "XHRTransport", value.asInstanceOf[js.Any])
    }
  }
}
