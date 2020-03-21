package typingsSlinky.mrmlncReaddirEnhanced

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Callback[T] = js.Function2[/* err */ typingsSlinky.node.NodeJS.ErrnoException, /* result */ T, scala.Unit]
  type CallbackEntry = typingsSlinky.mrmlncReaddirEnhanced.mod.Callback[js.Array[typingsSlinky.mrmlncReaddirEnhanced.mod.Entry]]
  type CallbackString = typingsSlinky.mrmlncReaddirEnhanced.mod.Callback[js.Array[java.lang.String]]
  type FilterFunction = js.Function1[/* stat */ typingsSlinky.mrmlncReaddirEnhanced.mod.Entry, scala.Boolean]
}
