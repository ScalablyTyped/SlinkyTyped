package typingsSlinky.officeRuntime

import typingsSlinky.officeRuntime.OfficeRuntime.ApiInformation
import typingsSlinky.officeRuntime.OfficeRuntime.Auth
import typingsSlinky.officeRuntime.OfficeRuntime.Dialog
import typingsSlinky.officeRuntime.OfficeRuntime.DisplayWebDialogOptions
import typingsSlinky.officeRuntime.OfficeRuntime.Storage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object OfficeRuntime {
    
    /**
      * Provides information about what Requirement Sets are supported in current environment.
      */
    @JSGlobal("OfficeRuntime.apiInformation")
    @js.native
    val apiInformation: ApiInformation = js.native
    
    /**
      * Contains authorization related APIs.
      */
    @JSGlobal("OfficeRuntime.auth")
    @js.native
    val auth: Auth = js.native
    
    /**
      * Method that enables a pop up web dialog box.
      *
      * [Api set: SharedRuntime 1.1]
      *
      * @param url Must be a string.
      * @param options Optional parameter. Must be of type DisplayWebDialogOptions.
      */
    @JSGlobal("OfficeRuntime.displayWebDialog")
    @js.native
    def displayWebDialog(url: String): js.Promise[Dialog] = js.native
    @JSGlobal("OfficeRuntime.displayWebDialog")
    @js.native
    def displayWebDialog(url: String, options: DisplayWebDialogOptions): js.Promise[Dialog] = js.native
    
    /**
      * Asynchronous, global, and persistent key-value storage.
      */
    @JSGlobal("OfficeRuntime.storage")
    @js.native
    val storage: Storage = js.native
  }
}
