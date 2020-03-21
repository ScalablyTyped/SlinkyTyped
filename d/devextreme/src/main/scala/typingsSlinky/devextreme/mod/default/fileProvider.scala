package typingsSlinky.devextreme.mod.default

import typingsSlinky.devextreme.mod.DevExpress.fileProvider.AjaxFileProviderOptions
import typingsSlinky.devextreme.mod.DevExpress.fileProvider.ArrayFileProviderOptions
import typingsSlinky.devextreme.mod.DevExpress.fileProvider.CustomFileProviderOptions
import typingsSlinky.devextreme.mod.DevExpress.fileProvider.FileProviderOptions
import typingsSlinky.devextreme.mod.DevExpress.fileProvider.RemoteFileProviderOptions
import typingsSlinky.devextreme.mod._Global_.JQueryPromise
import typingsSlinky.devextreme.mod._Global_.Promise
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
    /** Gets the specified items' content. */
    /* CompleteClass */
    override def getItemContent(items: js.Array[_]): Promise[_] with JQueryPromise[_] = js.native
  }
  
  @js.native
  class ArrayFileProvider ()
    extends typingsSlinky.devextreme.mod.DevExpress.fileProvider.FileProvider {
    def this(options: ArrayFileProviderOptions) = this()
    /** Gets the specified items' content. */
    /* CompleteClass */
    override def getItemContent(items: js.Array[_]): Promise[_] with JQueryPromise[_] = js.native
  }
  
  @js.native
  class CustomFileProvider ()
    extends typingsSlinky.devextreme.mod.DevExpress.fileProvider.FileProvider {
    def this(options: CustomFileProviderOptions) = this()
    /** Gets the specified items' content. */
    /* CompleteClass */
    override def getItemContent(items: js.Array[_]): Promise[_] with JQueryPromise[_] = js.native
  }
  
  @js.native
  class FileProvider ()
    extends typingsSlinky.devextreme.mod.DevExpress.fileProvider.FileProvider {
    def this(options: FileProviderOptions[typingsSlinky.devextreme.mod.DevExpress.fileProvider.FileProvider]) = this()
    /** Gets the specified items' content. */
    /* CompleteClass */
    override def getItemContent(items: js.Array[_]): Promise[_] with JQueryPromise[_] = js.native
  }
  
  @js.native
  class RemoteFileProvider ()
    extends typingsSlinky.devextreme.mod.DevExpress.fileProvider.FileProvider {
    def this(options: RemoteFileProviderOptions) = this()
    /** Gets the specified items' content. */
    /* CompleteClass */
    override def getItemContent(items: js.Array[_]): Promise[_] with JQueryPromise[_] = js.native
  }
  
}

