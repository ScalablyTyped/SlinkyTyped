package typingsSlinky.gapiDrive

import typingsSlinky.gapi.gapi.client.HttpRequest
import typingsSlinky.gapiDrive.gapi.client.drive.ChannelResource
import typingsSlinky.gapiDrive.gapi.client.drive.CopyParameters
import typingsSlinky.gapiDrive.gapi.client.drive.DeleteParameters
import typingsSlinky.gapiDrive.gapi.client.drive.ExportParameters
import typingsSlinky.gapiDrive.gapi.client.drive.FileListResource
import typingsSlinky.gapiDrive.gapi.client.drive.FileResource
import typingsSlinky.gapiDrive.gapi.client.drive.GenerateIdsParameters
import typingsSlinky.gapiDrive.gapi.client.drive.GetParameters
import typingsSlinky.gapiDrive.gapi.client.drive.IdsResource
import typingsSlinky.gapiDrive.gapi.client.drive.InsertParameters
import typingsSlinky.gapiDrive.gapi.client.drive.ListParameters
import typingsSlinky.gapiDrive.gapi.client.drive.PatchParameters
import typingsSlinky.gapiDrive.gapi.client.drive.TouchParameters
import typingsSlinky.gapiDrive.gapi.client.drive.TrashParameters
import typingsSlinky.gapiDrive.gapi.client.drive.UntrashParameters
import typingsSlinky.gapiDrive.gapi.client.drive.WatchParameters
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
      
      @js.native
      object drive extends js.Object {
        
        @js.native
        object files extends js.Object {
          
          def copy(parameters: CopyParameters): HttpRequest[FileResource] = js.native
          
          def delete(parameters: DeleteParameters): HttpRequest[_] = js.native
          
          def emptyTrash(): HttpRequest[_] = js.native
          
          def export(parameters: ExportParameters): HttpRequest[FileResource] = js.native
          
          def generateIds(parameters: GenerateIdsParameters): HttpRequest[IdsResource] = js.native
          
          def get(parameters: GetParameters): HttpRequest[FileResource] = js.native
          
          def insert(parameters: InsertParameters): HttpRequest[FileResource] = js.native
          
          def list(parameters: ListParameters): HttpRequest[FileListResource] = js.native
          
          def patch(parameters: PatchParameters): HttpRequest[FileResource] = js.native
          
          def touch(parameters: TouchParameters): HttpRequest[FileResource] = js.native
          
          def trash(parameters: TrashParameters): HttpRequest[FileResource] = js.native
          
          def untrash(parameters: UntrashParameters): HttpRequest[FileResource] = js.native
          
          def watch(parameters: WatchParameters): HttpRequest[ChannelResource] = js.native
        }
      }
    }
  }
}
