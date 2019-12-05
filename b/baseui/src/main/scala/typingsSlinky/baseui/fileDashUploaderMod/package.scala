package typingsSlinky.baseui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object fileDashUploaderMod {
  import org.scalajs.dom.raw.Event
  import org.scalajs.dom.raw.File
  import org.scalajs.dom.raw.HTMLElement
  import slinky.core.SyntheticEvent
  import typingsSlinky.std.DataTransferItem

  type DropFileEventHandler = js.Function2[
    /* acceptedOrRejected */ js.Array[File], 
    /* event */ SyntheticEvent[Event, HTMLElement], 
    js.Any
  ]
  type DropFilesEventHandler = js.Function3[
    /* accepted */ js.Array[File], 
    /* rejected */ js.Array[File], 
    /* event */ SyntheticEvent[Event, HTMLElement], 
    js.Any
  ]
  type GetDataTransferItems = js.Function1[
    /* event */ SyntheticEvent[Event, js.Any], 
    js.Promise[js.Array[File | DataTransferItem]]
  ]
}
