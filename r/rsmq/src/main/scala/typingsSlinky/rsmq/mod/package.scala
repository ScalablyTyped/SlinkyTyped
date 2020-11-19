package typingsSlinky.rsmq

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type Callback[T] = js.Function2[/* err */ js.Any, /* response */ T, scala.Unit]
  
  type DeleteQueueOptions = typingsSlinky.rsmq.mod.BaseOptions
  
  type GetQueueAttributesOptions = typingsSlinky.rsmq.mod.BaseOptions
  
  type PopMessageOptions = typingsSlinky.rsmq.mod.BaseOptions
}
