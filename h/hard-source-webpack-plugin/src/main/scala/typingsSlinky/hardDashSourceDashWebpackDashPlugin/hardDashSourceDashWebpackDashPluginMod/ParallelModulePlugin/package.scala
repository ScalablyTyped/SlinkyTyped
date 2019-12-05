package typingsSlinky.hardDashSourceDashWebpackDashPlugin.hardDashSourceDashWebpackDashPluginMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ParallelModulePlugin {
  import typingsSlinky.node.childUnderscoreProcessMod.ChildProcess
  import typingsSlinky.node.childUnderscoreProcessMod.ForkOptions

  // NOTE: not using `Parameters` and `ReturnType` on purpose to compatibility. better of code this below.
  //     type forkFn = (...args: Parameters<typeof fork>) => ReturnType<typeof fork>
  // this code working on supported versions of `infer` keyword (version 2.8 higher.
  type forkFn = js.Function3[
    /* modulePath */ String, 
    /* args */ js.UndefOr[js.Array[String]], 
    /* options */ js.UndefOr[ForkOptions], 
    ChildProcess
  ]
}
