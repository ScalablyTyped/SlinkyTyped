package typingsSlinky.devextreme.mod.default

import typingsSlinky.devextreme.mod.DevExpress.fileManagement.CustomFileSystemProviderOptions
import typingsSlinky.devextreme.mod.DevExpress.fileManagement.FileSystemProviderBaseOptions
import typingsSlinky.devextreme.mod.DevExpress.fileManagement.ObjectFileSystemProviderOptions
import typingsSlinky.devextreme.mod.DevExpress.fileManagement.RemoteFileSystemProviderOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fileManagement {
  
  @JSImport("devextreme", "default.fileManagement.CustomFileSystemProvider")
  @js.native
  class CustomFileSystemProvider ()
    extends typingsSlinky.devextreme.mod.DevExpress.fileManagement.FileSystemProviderBase {
    def this(options: CustomFileSystemProviderOptions) = this()
  }
  
  @JSImport("devextreme", "default.fileManagement.FileSystemItem")
  @js.native
  class FileSystemItem ()
    extends typingsSlinky.devextreme.mod.DevExpress.fileManagement.FileSystemItem
  
  @JSImport("devextreme", "default.fileManagement.FileSystemProviderBase")
  @js.native
  class FileSystemProviderBase ()
    extends typingsSlinky.devextreme.mod.DevExpress.fileManagement.FileSystemProviderBase {
    def this(options: FileSystemProviderBaseOptions[typingsSlinky.devextreme.mod.DevExpress.fileManagement.FileSystemProviderBase]) = this()
  }
  
  @JSImport("devextreme", "default.fileManagement.ObjectFileSystemProvider")
  @js.native
  class ObjectFileSystemProvider ()
    extends typingsSlinky.devextreme.mod.DevExpress.fileManagement.FileSystemProviderBase {
    def this(options: ObjectFileSystemProviderOptions) = this()
  }
  
  @JSImport("devextreme", "default.fileManagement.RemoteFileSystemProvider")
  @js.native
  class RemoteFileSystemProvider ()
    extends typingsSlinky.devextreme.mod.DevExpress.fileManagement.FileSystemProviderBase {
    def this(options: RemoteFileSystemProviderOptions) = this()
  }
}
