package typingsSlinky.node

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object zlibMod {
  type CompressCallback = js.Function2[
    /* error */ js.Error | scala.Null, 
    /* result */ typingsSlinky.node.Buffer, 
    scala.Unit
  ]
  type InputType = java.lang.String | scala.scalajs.js.typedarray.ArrayBuffer | typingsSlinky.node.NodeJS.ArrayBufferView
}
