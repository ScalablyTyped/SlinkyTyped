package typingsSlinky.baseui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object fileUploaderMod {
  
  type DropFileEventHandler = js.Function2[
    /* acceptedOrRejected */ js.Array[org.scalajs.dom.raw.File], 
    /* event */ slinky.core.SyntheticEvent[org.scalajs.dom.raw.Event, org.scalajs.dom.raw.HTMLElement], 
    js.Any
  ]
  
  type DropFilesEventHandler = js.Function3[
    /* accepted */ js.Array[org.scalajs.dom.raw.File], 
    /* rejected */ js.Array[org.scalajs.dom.raw.File], 
    /* event */ slinky.core.SyntheticEvent[org.scalajs.dom.raw.Event, org.scalajs.dom.raw.HTMLElement], 
    js.Any
  ]
  
  type GetDataTransferItems = js.Function1[
    /* event */ slinky.core.SyntheticEvent[org.scalajs.dom.raw.Event, js.Any], 
    js.Promise[js.Array[org.scalajs.dom.raw.File | typingsSlinky.std.DataTransferItem]]
  ]
}
