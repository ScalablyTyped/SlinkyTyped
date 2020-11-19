package typingsSlinky.devextreme.mod.default

import typingsSlinky.devextreme.mod.DevExpress.fileManagement.CustomFileSystemProviderOptions
import typingsSlinky.devextreme.mod.DevExpress.fileManagement.FileSystemProviderBaseOptions
import typingsSlinky.devextreme.mod.DevExpress.fileManagement.ObjectFileSystemProviderOptions
import typingsSlinky.devextreme.mod.DevExpress.fileManagement.RemoteFileSystemProviderOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("devextreme", "fileManagement")
@js.native
object fileManagement extends js.Object {
  
  @js.native
  class CustomFileSystemProvider ()
    extends typingsSlinky.devextreme.mod.DevExpress.fileManagement.FileSystemProviderBase {
    def this(options: CustomFileSystemProviderOptions) = this()
  }
  
  @js.native
  class FileSystemItem ()
    extends typingsSlinky.devextreme.mod.DevExpress.fileManagement.FileSystemItem
  
  @js.native
  class FileSystemProviderBase ()
    extends typingsSlinky.devextreme.mod.DevExpress.fileManagement.FileSystemProviderBase {
    def this(options: FileSystemProviderBaseOptions[typingsSlinky.devextreme.mod.DevExpress.fileManagement.FileSystemProviderBase]) = this()
  }
  
  @js.native
  class ObjectFileSystemProvider ()
    extends typingsSlinky.devextreme.mod.DevExpress.fileManagement.FileSystemProviderBase {
    def this(options: ObjectFileSystemProviderOptions) = this()
  }
  
  @js.native
  class RemoteFileSystemProvider ()
    extends typingsSlinky.devextreme.mod.DevExpress.fileManagement.FileSystemProviderBase {
    def this(options: RemoteFileSystemProviderOptions) = this()
  }
}
