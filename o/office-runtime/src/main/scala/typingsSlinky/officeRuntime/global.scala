package typingsSlinky.officeRuntime

import typingsSlinky.officeRuntime.OfficeRuntime.ApiInformation
import typingsSlinky.officeRuntime.OfficeRuntime.Auth
import typingsSlinky.officeRuntime.OfficeRuntime.Dialog
import typingsSlinky.officeRuntime.OfficeRuntime.DisplayWebDialogOptions
import typingsSlinky.officeRuntime.OfficeRuntime.Storage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object global extends js.Object {
  @js.native
  object OfficeRuntime extends js.Object {
    /**
      * Provides information about what Requirement Sets are supported in current environment.
      */
    val apiInformation: ApiInformation = js.native
    /**
      * Contains authorization related APIs.
      * @beta
      */
    val auth: Auth = js.native
    /**
      * Asynchronous, global, and persistent key-value storage.
      */
    val storage: Storage = js.native
    /**
      * Method that enables a pop up web dialog box.
      *
      * [Api set: SharedRuntime 1.1]
      *
      * @param url Must be a string.
      * @param options Optional parameter. Must be of type DisplayWebDialogOptions.
      */
    def displayWebDialog(url: String): js.Promise[Dialog] = js.native
    def displayWebDialog(url: String, options: DisplayWebDialogOptions): js.Promise[Dialog] = js.native
  }
  
}

