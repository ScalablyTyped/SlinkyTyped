package typingsSlinky.devextreme.mod.default

import typingsSlinky.devextreme.mod.DevExpress.fileProvider.AjaxFileProviderOptions
import typingsSlinky.devextreme.mod.DevExpress.fileProvider.ArrayFileProviderOptions
import typingsSlinky.devextreme.mod.DevExpress.fileProvider.CustomFileProviderOptions
import typingsSlinky.devextreme.mod.DevExpress.fileProvider.FileProviderOptions
import typingsSlinky.devextreme.mod.DevExpress.fileProvider.RemoteFileProviderOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("devextreme", "fileProvider")
@js.native
object fileProvider extends js.Object {
  @js.native
  class AjaxFileProvider ()
    extends typingsSlinky.devextreme.mod.DevExpress.fileProvider.FileProvider {
    def this(options: AjaxFileProviderOptions) = this()
  }
  
  @js.native
  class ArrayFileProvider ()
    extends typingsSlinky.devextreme.mod.DevExpress.fileProvider.FileProvider {
    def this(options: ArrayFileProviderOptions) = this()
  }
  
  @js.native
  class CustomFileProvider ()
    extends typingsSlinky.devextreme.mod.DevExpress.fileProvider.FileProvider {
    def this(options: CustomFileProviderOptions) = this()
  }
  
  @js.native
  class FileProvider ()
    extends typingsSlinky.devextreme.mod.DevExpress.fileProvider.FileProvider {
    def this(options: FileProviderOptions[typingsSlinky.devextreme.mod.DevExpress.fileProvider.FileProvider]) = this()
  }
  
  @js.native
  class RemoteFileProvider ()
    extends typingsSlinky.devextreme.mod.DevExpress.fileProvider.FileProvider {
    def this(options: RemoteFileProviderOptions) = this()
  }
  
}

