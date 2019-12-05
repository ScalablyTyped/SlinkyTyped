package typingsSlinky.compressionDashWebpackDashPlugin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object compressionDashWebpackDashPluginMod {
  import typingsSlinky.node.Buffer
  import typingsSlinky.webpack.webpackMod.Plugin

  type Algorithm[O] = js.Function3[/* source */ String, /* options */ O, /* callback */ AlgorithmCallback, Unit]
  type AlgorithmCallback = js.Function2[/* error */ js.Error | Null, /* result */ Buffer, Unit]
  type CompressionPlugin[O] = Plugin
  type Pattern = String | js.RegExp | (js.Array[js.RegExp | String])
}
