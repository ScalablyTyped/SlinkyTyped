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
  type CompressionPlugin[O] = typingsSlinky.webpack.mod.Plugin
  type Pattern = java.lang.String | js.RegExp | (js.Array[js.RegExp | java.lang.String])
}
