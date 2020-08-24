package typingsSlinky.memFsEditor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  //#endregion
  //#region Editor#commit
  type CommitCallback = js.Function1[/* err */ js.Any, scala.Unit]
  type FilePaths = java.lang.String | js.Array[java.lang.String]
  type ProcessingFunction = js.Function2[
    /* contents */ typingsSlinky.node.Buffer, 
    /* path */ java.lang.String, 
    typingsSlinky.memFsEditor.mod.WriteContents
  ]
  type ReadRawContents = typingsSlinky.std.Exclude[
    typingsSlinky.node.Buffer | typingsSlinky.node.NodeJS.ReadableStream | scala.Null, 
    scala.Null
  ]
  //#endregion
  //#region Editor#write
  type WriteContents = java.lang.String | typingsSlinky.node.Buffer
  //#endregion
  //#region Editor#writeJSON
  type WriteJsonReplacer = (js.Function2[/* key */ java.lang.String, /* value */ js.Any, js.Any]) | (js.Array[java.lang.String | scala.Double])
  type WriteJsonSpace = scala.Double | java.lang.String
}
