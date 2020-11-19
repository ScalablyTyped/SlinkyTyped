package typingsSlinky.gapiClientDrive

import typingsSlinky.gapiClientDrive.gapi.client.drive.AboutResource
import typingsSlinky.gapiClientDrive.gapi.client.drive.ChangesResource
import typingsSlinky.gapiClientDrive.gapi.client.drive.ChannelsResource
import typingsSlinky.gapiClientDrive.gapi.client.drive.CommentsResource
import typingsSlinky.gapiClientDrive.gapi.client.drive.DrivesResource
import typingsSlinky.gapiClientDrive.gapi.client.drive.FilesResource
import typingsSlinky.gapiClientDrive.gapi.client.drive.PermissionsResource
import typingsSlinky.gapiClientDrive.gapi.client.drive.RepliesResource
import typingsSlinky.gapiClientDrive.gapi.client.drive.RevisionsResource
import typingsSlinky.gapiClientDrive.gapi.client.drive.TeamdrivesResource
import typingsSlinky.gapiClientDrive.gapiClientDriveStrings.drive
import typingsSlinky.gapiClientDrive.gapiClientDriveStrings.v3
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobalScope
@js.native
object global extends js.Object {
  
  @js.native
  object gapi extends js.Object {
    
    @js.native
    object client extends js.Object {
      
      /** Load Drive API v3 */
      def load(name: drive, version: v3): js.Thenable[Unit] = js.native
      def load(name: drive, version: v3, callback: js.Function0[_]): Unit = js.native
      
      @js.native
      object drive extends js.Object {
        
        val about: AboutResource = js.native
        
        val changes: ChangesResource = js.native
        
        val channels: ChannelsResource = js.native
        
        val comments: CommentsResource = js.native
        
        val drives: DrivesResource = js.native
        
        val files: FilesResource = js.native
        
        val permissions: PermissionsResource = js.native
        
        val replies: RepliesResource = js.native
        
        val revisions: RevisionsResource = js.native
        
        val teamdrives: TeamdrivesResource = js.native
      }
    }
  }
}
