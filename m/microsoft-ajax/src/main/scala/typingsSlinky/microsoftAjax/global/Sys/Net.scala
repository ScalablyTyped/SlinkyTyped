package typingsSlinky.microsoftAjax.global.Sys

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

//#endregion
//#region Exception Types
// Really not a types
///**
//* Raised when a function or method is invoked and at least one of the passed arguments does not meet the parameter specification of the called function or method.
//**/
//class ArgumentException {
//}
///**
//* Raised when an argument has an invalid value of null.
//**/
//class ArgumentNullException {
//}
///**
//* Raised when an argument value is outside an acceptable range.
//**/
//class ArgumentOutOfRangeException {
//}
///**
//* Raised when a parameter is not an allowed type.
//**/
//class ArgumentTypeException {
//}
///**
//* Raised when an argument for a required method parameter is undefined.
//**/
//class ArgumentUndefinedException {
//}
///**
//*
//**/
//class FormatException {
//}
///**
//* Raised when a call to a method has failed, but the reason was not invalid arguments.
//**/
//class InvalidOperationException {
//}
///**
//* Raised when a requested method is not supported by an object.
//**/
//class NotImplementedException {
//}
///**
//* Raised when an invalid number of arguments have been passed to a function.
//**/
//class ParameterCountException {
//}
///**
//* Raised by the Microsoft Ajax Library framework when a script does not load successfully. This exception should not be thrown by the developer.
//**/
//class ScriptLoadFailedException {
//}
//#endregion
//#region Sys.Net Namespace
/**
  * The Sys.Net namespace contains classes that manage communication between AJAX-enabled ASP.NET client applications and Web services on the server. For more information, see Using Web Services in ASP.NET AJAX. The Sys.Net namespace is part of the Microsoft Ajax Library.
  * @see {@link http://msdn.microsoft.com/en-us/library/bb310860(v=vs.100).aspx}
  */
object Net {
  
  @JSGlobal("Sys.Net")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Manages the flow of the Web requests issued by the Sys.Net.WebRequest object to the associated executor object.
    * @see {@link http://msdn.microsoft.com/en-us/library/bb397435(v=vs.100).aspx}
    */
  @JSGlobal("Sys.Net.IWebRequestManager")
  @js.native
  //#region Constructor
  /**
    * Initializes a new instance of the Sys.Net.WebRequestManager class when implemented in a derived class.
    */
  class IWebRequestManager ()
    extends typingsSlinky.microsoftAjax.Sys.Net.IWebRequestManager
  
  /**
    * Contains information about a Web request that is ready to be sent to the current Sys.Net.WebRequestExecutor instance.
    * This class represents the type for the second parameter of the callback function added by the add_invokingRequest method.
    * The callback function is called before the Web request is routed to the current instance of the WebRequestExecutor class.
    *
    * @see {@link http://msdn.microsoft.com/en-us/library/bb397488(v=vs.100).aspx}
    */
  @JSGlobal("Sys.Net.NetworkRequestEventArgs")
  @js.native
  class NetworkRequestEventArgs protected ()
    extends typingsSlinky.microsoftAjax.Sys.Net.NetworkRequestEventArgs {
    //#region Constructors
    /**
      * Initializes a new instance of the Sys.Net.NetworkRequestEventArgs. class.
      * @param value
      *      The current WebRequest instance.
      */
    def this(value: typingsSlinky.microsoftAjax.Sys.Net.WebRequest) = this()
  }
  
  /**
    * Provides the script API to make a Web request.
    * @see {@link http://msdn.microsoft.com/en-us/library/bb310979(v=vs.100).aspx}
    */
  @JSGlobal("Sys.Net.WebRequest")
  @js.native
  //#region Constructors
  /**
    * Initializes a new instance of the Sys.Net.WebRequest class.
    */
  class WebRequest ()
    extends typingsSlinky.microsoftAjax.Sys.Net.WebRequest
  
  /**
    * Provides the abstract base class from which network executors derive.
    * @see {@link http://msdn.microsoft.com/en-us/library/bb397434(v=vs.100).aspx}
    */
  @JSGlobal("Sys.Net.WebRequestExecutor")
  @js.native
  //#region Constructors
  /**
    * Initializes a Sys.Net.WebRequestExecutor instance when implemented in a derived class.
    */
  class WebRequestExecutor ()
    extends typingsSlinky.microsoftAjax.Sys.Net.WebRequestExecutor
  
  @JSGlobal("Sys.Net.WebRequestManager")
  @js.native
  def WebRequestManager: typingsSlinky.microsoftAjax.Sys.Net.IWebRequestManager = js.native
  @scala.inline
  def WebRequestManager_=(x: typingsSlinky.microsoftAjax.Sys.Net.IWebRequestManager): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("WebRequestManager")(x.asInstanceOf[js.Any])
  
  @JSGlobal("Sys.Net.WebServiceError")
  @js.native
  class WebServiceError ()
    extends typingsSlinky.microsoftAjax.Sys.Net.WebServiceError
  
  /**
    * Generated Proxy Classes
    * Enables your application to call Web services asynchronously by using ECMAScript (JavaScript).
    * @see {@link http://msdn.microsoft.com/en-us/library/bb310823(v=vs.100).aspx}
    */
  @JSGlobal("Sys.Net.WebServiceProxy")
  @js.native
  class WebServiceProxy ()
    extends typingsSlinky.microsoftAjax.Sys.Net.WebServiceProxy
  object WebServiceProxy {
    
    /* static member */
    @JSGlobal("Sys.Net.WebServiceProxy.invoke")
    @js.native
    def invoke(
      servicePath: String,
      methodName: String,
      useGet: js.UndefOr[Boolean],
      params: js.UndefOr[js.Any],
      onSuccess: js.UndefOr[
          js.Function2[/* result */ String, /* eventArgs */ typingsSlinky.microsoftAjax.Sys.EventArgs, Unit]
        ],
      onFailure: js.UndefOr[
          js.Function1[/* error */ typingsSlinky.microsoftAjax.Sys.Net.WebServiceError, Unit]
        ],
      userContext: js.UndefOr[js.Any],
      timeout: js.UndefOr[Double],
      enableJsonp: js.UndefOr[Boolean],
      jsonpCallbackParameter: js.UndefOr[String]
    ): typingsSlinky.microsoftAjax.Sys.Net.WebRequest = js.native
  }
}
