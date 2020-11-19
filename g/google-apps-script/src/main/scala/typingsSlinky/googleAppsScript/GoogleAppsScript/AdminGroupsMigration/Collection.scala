package typingsSlinky.googleAppsScript.GoogleAppsScript.AdminGroupsMigration

import typingsSlinky.googleAppsScript.GoogleAppsScript.AdminGroupsMigration.Schema.Groups
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("GoogleAppsScript.AdminGroupsMigration.Collection")
@js.native
object Collection extends js.Object {
  
  @js.native
  trait ArchiveCollection extends js.Object {
    
    // Inserts a new mail into the archive of the Google group.
    def insert(groupId: String): Groups = js.native
    // Inserts a new mail into the archive of the Google group.
    def insert(groupId: String, mediaData: js.Any): Groups = js.native
  }
}
