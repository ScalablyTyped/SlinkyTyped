package typingsSlinky.devexpressWeb.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientFileManager.ItemsCopied event.
  */
@JSGlobal("ASPxClientFileManagerItemsCopiedEventArgs")
@js.native
class ASPxClientFileManagerItemsCopiedEventArgs protected ()
  extends typingsSlinky.devexpressWeb.ASPxClientFileManagerItemsCopiedEventArgs {
  /**
    * Initializes a new instance of the ASPxClientFileManagerItemsCopiedEventArgs object with the specified parameters.
    * @param items An array of ASPxClientFileManagerItem objects that are items currently being processed.
    * @param oldFolderFullName A string value that specifies the folder's full name.
    */
  def this(items: js.Array[typingsSlinky.devexpressWeb.ASPxClientFileManagerItem], oldFolderFullName: String) = this()
  /**
    * Gets an array of the currently processed items.
    */
  /* CompleteClass */
  override var items: js.Array[typingsSlinky.devexpressWeb.ASPxClientFileManagerItem] = js.native
  /**
    * Gets the full name of the folder from which items are copied.
    */
  /* CompleteClass */
  override var oldFolderFullName: String = js.native
}

