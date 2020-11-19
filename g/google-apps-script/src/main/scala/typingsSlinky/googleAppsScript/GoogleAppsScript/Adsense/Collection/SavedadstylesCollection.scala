package typingsSlinky.googleAppsScript.GoogleAppsScript.Adsense.Collection

import typingsSlinky.googleAppsScript.GoogleAppsScript.Adsense.Schema.SavedAdStyle
import typingsSlinky.googleAppsScript.GoogleAppsScript.Adsense.Schema.SavedAdStyles
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SavedadstylesCollection extends js.Object {
  
  // Get a specific saved ad style from the user's account.
  def get(savedAdStyleId: String): SavedAdStyle = js.native
  
  // List all saved ad styles in the user's account.
  def list(): SavedAdStyles = js.native
  // List all saved ad styles in the user's account.
  def list(optionalArgs: js.Object): SavedAdStyles = js.native
}
