package typingsSlinky.officeRuntime

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object OfficeRuntime {
  
  /**
    * Interface that contains functions for checking API requirement-set support.
    */
  @js.native
  trait ApiInformation extends StObject {
    
    /**
      * Check if the specified requirement set is supported by the host Office application.
      * @param name - Set name; e.g., "MatrixBindings".
      * @param minVersion - The minimum required version; e.g., "1.4".
      */
    def isSetSupported(name: String): Boolean = js.native
    def isSetSupported(name: String, minVersion: String): Boolean = js.native
  }
  
  /**
    * Interface that contains authorization related APIs.
    */
  @js.native
  trait Auth extends StObject {
    
    /**
      * Calls the Azure Active Directory V 2.0 endpoint to get an access token to your add-in's web application. Enables add-ins to identify users.
      * Server-side code can use this token to access Microsoft Graph for the add-in's web application by using the
      * {@link https://docs.microsoft.com/azure/active-directory/develop/active-directory-v2-protocols-oauth-on-behalf-of | "on behalf of" OAuth flow}.
      * This API requires a single sign-on configuration that bridges the add-in to an Azure application. Office users sign-in with Organizational
      * Accounts and Microsoft Accounts. Microsoft Azure returns tokens intended for both user account types to access resources in the Microsoft Graph.
      *
      * **Important**: In Outlook, this API is not supported if the add-in is loaded in an Outlook.com or Gmail mailbox.
      *
      * @remarks
      *
      * **Hosts**: Excel, Outlook, PowerPoint, Word
      *
      * @param options - Optional. Accepts an `AuthOptions` object to define sign-on behaviors.
      * @returns Promise to the access token.
      */
    def getAccessToken(): js.Promise[String] = js.native
    def getAccessToken(options: AuthOptions): js.Promise[String] = js.native
  }
  
  /**
    * Provides options for the user experience when Office obtains an access token to the add-in from AAD v. 2.0 with the `getAccessToken` method.
    */
  @js.native
  trait AuthOptions extends StObject {
    
    /**
      * Allows Office to get an access token silently or through interactive consent, if one is required. Default value is `false`.
      * If set to `false`, Office will silently try to get an access token. If it fails to do so, Office will return a descriptive error.
      * If set to `true`, Office will show an interactive consent UI after it fails to silently get an access token.
      * The prompt will only allow consent to the AAD profile scope, not to any Microsoft Graph scopes.
      */
    var allowConsentPrompt: js.UndefOr[Boolean] = js.native
    
    /**
      * Allows Office to get an access token silently provided consent is present or show interactive UI to sign in the user. Default value is `false`.
      * If set to `false`, Office will silently try to get an access token. If it fails to do so, Office will return a descriptive error.
      * If set to `true`, Office will show an interactive sign-in UI after it fails to silently get an access token.
      */
    var allowSignInPrompt: js.UndefOr[Boolean] = js.native
    
    /**
      * A user-defined item of any type that is returned, unchanged, in the `asyncContext` property of the `AsyncResult` object that is passed to a callback.
      */
    var asyncContext: js.UndefOr[js.Any] = js.native
    
    /**
      * Causes Office to prompt the user to provide the additional factor when the tenancy being targeted by Microsoft Graph requires multifactor
      * authentication. The string value identifies the type of additional factor that is required. In most cases, you won't know at development
      * time whether the user's tenant requires an additional factor or what the string should be. So this option would be used in a "second try"
      * call of `getAccessToken` after Microsoft Graph has sent an error requesting the additional factor and containing the string that should
      * be used with the `authChallenge` option.
      */
    var authChallenge: js.UndefOr[String] = js.native
    
    /**
      * Causes Office to return a descriptive error when the add-in wants to access Microsoft Graph and the user/admin has not granted consent to Graph scopes. Default value is `false`.
      * Office only supports consent to Graph scopes when the add-in has been deployed by a tenant admin. This information will not be available during development.
      * Setting this option to `true` will cause Office to inform your add-in beforehand (by returning a descriptive error) if Graph access will fail.
      */
    var forMSGraphAccess: js.UndefOr[Boolean] = js.native
    
    /**
      * Prompts the user to add their Office account (or to switch to it, if it is already added). Default value is `false`.
      *
      * @deprecated Use `allowSignInPrompt` instead.
      */
    var forceAddAccount: js.UndefOr[Boolean] = js.native
    
    /**
      * Causes Office to display the add-in consent experience. Useful if the add-in's Azure permissions have changed or if the user's consent has
      * been revoked. Default value is `false`.
      *
      * @deprecated Use `allowConsentPrompt` instead.
      */
    var forceConsent: js.UndefOr[Boolean] = js.native
  }
  object AuthOptions {
    
    @scala.inline
    def apply(): AuthOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AuthOptions]
    }
    
    @scala.inline
    implicit class AuthOptionsMutableBuilder[Self <: AuthOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllowConsentPrompt(value: Boolean): Self = StObject.set(x, "allowConsentPrompt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowConsentPromptUndefined: Self = StObject.set(x, "allowConsentPrompt", js.undefined)
      
      @scala.inline
      def setAllowSignInPrompt(value: Boolean): Self = StObject.set(x, "allowSignInPrompt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowSignInPromptUndefined: Self = StObject.set(x, "allowSignInPrompt", js.undefined)
      
      @scala.inline
      def setAsyncContext(value: js.Any): Self = StObject.set(x, "asyncContext", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAsyncContextUndefined: Self = StObject.set(x, "asyncContext", js.undefined)
      
      @scala.inline
      def setAuthChallenge(value: String): Self = StObject.set(x, "authChallenge", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAuthChallengeUndefined: Self = StObject.set(x, "authChallenge", js.undefined)
      
      @scala.inline
      def setForMSGraphAccess(value: Boolean): Self = StObject.set(x, "forMSGraphAccess", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setForMSGraphAccessUndefined: Self = StObject.set(x, "forMSGraphAccess", js.undefined)
      
      @scala.inline
      def setForceAddAccount(value: Boolean): Self = StObject.set(x, "forceAddAccount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setForceAddAccountUndefined: Self = StObject.set(x, "forceAddAccount", js.undefined)
      
      @scala.inline
      def setForceConsent(value: Boolean): Self = StObject.set(x, "forceConsent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setForceConsentUndefined: Self = StObject.set(x, "forceConsent", js.undefined)
    }
  }
  
  /** Object representing the dialog box. */
  @js.native
  trait Dialog extends StObject {
    
    /**
      * Method to close a dialog box. Returns a Promise.
      *
      * [Api set: SharedRuntime 1.1]
      *
      */
    def close(): js.Promise[Unit] = js.native
  }
  object Dialog {
    
    @scala.inline
    def apply(close: () => js.Promise[Unit]): Dialog = {
      val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close))
      __obj.asInstanceOf[Dialog]
    }
    
    @scala.inline
    implicit class DialogMutableBuilder[Self <: Dialog] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClose(value: () => js.Promise[Unit]): Self = StObject.set(x, "close", js.Any.fromFunction0(value))
    }
  }
  
  /** Provides display options and actions a dialog box may take. */
  @js.native
  trait DisplayWebDialogOptions extends StObject {
    
    /**
      * Optional parameter that determines whether the dialog box displays as a popup (false) or within an IFrame (true).
      * This setting is only applicable to custom functions running on Excel Online.
      *
      * [Api set: SharedRuntime 1.1]
      *
      */
    var displayInIFrame: js.UndefOr[Boolean] = js.native
    
    /**
      * Optional parameter that defines the height of the dialog box as a percentage of the current display.
      * For example, accepts strings such as: '50%', '50'.
      *
      * [Api set: SharedRuntime 1.1]
      *
      */
    var height: js.UndefOr[String] = js.native
    
    /**
      * Optional callback that runs when the dialog box is closed.
      *
      * [Api set: SharedRuntime 1.1]
      *
      */
    var onClose: js.UndefOr[js.Function0[Unit]] = js.native
    
    /**
      * Optional callback that runs when the dialog box sends a message to its parent.
      *
      * [Api set: SharedRuntime 1.1]
      *
      */
    var onMessage: js.UndefOr[js.Function2[/* message */ String, /* dialog */ js.UndefOr[Dialog], Unit]] = js.native
    
    /**
      * Optional callback that runs when the dialog box sends an error.
      *
      * [Api set: SharedRuntime 1.1]
      *
      */
    var onRuntimeError: js.UndefOr[js.Function2[/* error */ js.Error, /* dialog */ js.UndefOr[Dialog], Unit]] = js.native
    
    /**
      * Optional parameter that defines the width of dialog as a percentage of window.
      * For example, accepts strings such as: '50%', '50'.
      *
      * [Api set: SharedRuntime 1.1]
      *
      */
    var width: js.UndefOr[String] = js.native
  }
  object DisplayWebDialogOptions {
    
    @scala.inline
    def apply(): DisplayWebDialogOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DisplayWebDialogOptions]
    }
    
    @scala.inline
    implicit class DisplayWebDialogOptionsMutableBuilder[Self <: DisplayWebDialogOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDisplayInIFrame(value: Boolean): Self = StObject.set(x, "displayInIFrame", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisplayInIFrameUndefined: Self = StObject.set(x, "displayInIFrame", js.undefined)
      
      @scala.inline
      def setHeight(value: String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setOnClose(value: () => Unit): Self = StObject.set(x, "onClose", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnCloseUndefined: Self = StObject.set(x, "onClose", js.undefined)
      
      @scala.inline
      def setOnMessage(value: (/* message */ String, /* dialog */ js.UndefOr[Dialog]) => Unit): Self = StObject.set(x, "onMessage", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnMessageUndefined: Self = StObject.set(x, "onMessage", js.undefined)
      
      @scala.inline
      def setOnRuntimeError(value: (/* error */ js.Error, /* dialog */ js.UndefOr[Dialog]) => Unit): Self = StObject.set(x, "onRuntimeError", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnRuntimeErrorUndefined: Self = StObject.set(x, "onRuntimeError", js.undefined)
      
      @scala.inline
      def setWidth(value: String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  /**
    * Asynchronous, global, and persistent key-value storage.
    *
    * [Api set: SharedRuntime 1.1]
    *
    * @remarks
    * Storage limit is 10 MB per domain, which may be shared by multiple add-ins.
    */
  @js.native
  trait Storage extends StObject {
    
    /**
      * Retrieves an item from storage based on its key.
      * Returns a Promise. In the event the Promise does not resolve, returns null.
      *
      * [Api set: SharedRuntime 1.1]
      *
      * @param key Key of item to be retrieved. Must be a string.
      */
    def getItem(key: String): js.Promise[String | Null] = js.native
    
    /**
      * Retrieves multiple items from storage based on their key.
      * Returns a Promise. In the event the Promise does not resolve, returns null.
      *
      * [Api set: SharedRuntime 1.1]
      *
      * @param keys Keys of items to be removed. Must be an array of strings.
      */
    def getItems(keys: js.Array[String]): js.Promise[StringDictionary[String | Null]] = js.native
    
    /**
      * Retrieves an array of all keys from storage.
      *  Returns a Promise.
      *
      * [Api set: SharedRuntime 1.1]
      *
      */
    def getKeys(): js.Promise[js.Array[String]] = js.native
    
    /**
      * Removes an item from storage based on its key.
      * Returns a Promise.
      *
      * [Api set: SharedRuntime 1.1]
      *
      * @param key Key of item to be removed. Must be a string.
      */
    def removeItem(key: String): js.Promise[Unit] = js.native
    
    /**
      * Removes multiple items from storage.
      * Returns a Promise.
      *
      * [Api set: SharedRuntime 1.1]
      *
      * @param keys Keys of items to be removed. Must be an array of strings.
      */
    def removeItems(keys: js.Array[String]): js.Promise[Unit] = js.native
    
    /**
      * Sets a key-value pair into storage or updates an existing key-value pair.
      * Returns a Promise.
      *
      * [Api set: SharedRuntime 1.1]
      *
      * @param key Key of item to be set. Must be a string.
      * @param value Must be a string.
      */
    def setItem(key: String, value: String): js.Promise[Unit] = js.native
    
    /**
      * Sets multiple items into storage or updates multiple items within storage.
      * Returns a Promise.
      *
      * [Api set: SharedRuntime 1.1]
      *
      * @param keyValues Key-value pairs to be set. Must be strings.
      */
    def setItems(keyValues: StringDictionary[String]): js.Promise[Unit] = js.native
  }
  object Storage {
    
    @scala.inline
    def apply(
      getItem: String => js.Promise[String | Null],
      getItems: js.Array[String] => js.Promise[StringDictionary[String | Null]],
      getKeys: () => js.Promise[js.Array[String]],
      removeItem: String => js.Promise[Unit],
      removeItems: js.Array[String] => js.Promise[Unit],
      setItem: (String, String) => js.Promise[Unit],
      setItems: StringDictionary[String] => js.Promise[Unit]
    ): Storage = {
      val __obj = js.Dynamic.literal(getItem = js.Any.fromFunction1(getItem), getItems = js.Any.fromFunction1(getItems), getKeys = js.Any.fromFunction0(getKeys), removeItem = js.Any.fromFunction1(removeItem), removeItems = js.Any.fromFunction1(removeItems), setItem = js.Any.fromFunction2(setItem), setItems = js.Any.fromFunction1(setItems))
      __obj.asInstanceOf[Storage]
    }
    
    @scala.inline
    implicit class StorageMutableBuilder[Self <: Storage] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetItem(value: String => js.Promise[String | Null]): Self = StObject.set(x, "getItem", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetItems(value: js.Array[String] => js.Promise[StringDictionary[String | Null]]): Self = StObject.set(x, "getItems", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetKeys(value: () => js.Promise[js.Array[String]]): Self = StObject.set(x, "getKeys", js.Any.fromFunction0(value))
      
      @scala.inline
      def setRemoveItem(value: String => js.Promise[Unit]): Self = StObject.set(x, "removeItem", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRemoveItems(value: js.Array[String] => js.Promise[Unit]): Self = StObject.set(x, "removeItems", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetItem(value: (String, String) => js.Promise[Unit]): Self = StObject.set(x, "setItem", js.Any.fromFunction2(value))
      
      @scala.inline
      def setSetItems(value: StringDictionary[String] => js.Promise[Unit]): Self = StObject.set(x, "setItems", js.Any.fromFunction1(value))
    }
  }
}
