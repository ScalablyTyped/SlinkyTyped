package typingsSlinky.compressionWebpackPlugin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Algorithm[O] = js.Function3[
    /* source */ java.lang.String, 
    /* options */ O, 
    /* callback */ typingsSlinky.compressionWebpackPlugin.mod.AlgorithmCallback, 
    scala.Unit
  ]
  type AlgorithmCallback = js.Function2[
    /* error */ js.Error | scala.Null, 
    /* result */ typingsSlinky.node.Buffer, 
    scala.Unit
  ]
  /**
    * Prepare compressed versions of assets to serve them with Content-Encoding.
    */
  type CompressionPlugin[O] = typingsSlinky.std.Plugin
  type FilenameFunction = js.Function1[/* info */ typingsSlinky.compressionWebpackPlugin.mod.FileInfo, java.lang.String]
  /** Filtering rule as regex or string */
  type Rule = java.lang.String | js.RegExp
  /** Filtering rules. */
  type Rules = typingsSlinky.compressionWebpackPlugin.mod.Rule | js.Array[typingsSlinky.compressionWebpackPlugin.mod.Rule]
}
