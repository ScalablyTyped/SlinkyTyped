package typingsSlinky.memFsEditor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Callback = js.Function1[/* err */ js.Any, js.Any]
  type ProcessingFunc = js.Function2[
    /* contents */ typingsSlinky.node.Buffer, 
    /* path */ java.lang.String, 
    typingsSlinky.memFsEditor.mod.Contents
  ]
  type ReplacerFunc = js.Function2[/* key */ java.lang.String, /* value */ js.Any, js.Any]
}
