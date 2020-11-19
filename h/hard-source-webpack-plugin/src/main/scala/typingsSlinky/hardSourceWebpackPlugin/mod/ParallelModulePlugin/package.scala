package typingsSlinky.hardSourceWebpackPlugin.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object ParallelModulePlugin {
  
  // NOTE: not using `Parameters` and `ReturnType` on purpose to compatibility. better of code this below.
  //     type forkFn = (...args: Parameters<typeof fork>) => ReturnType<typeof fork>
  // this code working on supported versions of `infer` keyword (version 2.8 higher.
  type forkFn = js.Function3[
    /* modulePath */ java.lang.String, 
    /* args */ js.UndefOr[js.Array[java.lang.String]], 
    /* options */ js.UndefOr[typingsSlinky.node.childProcessMod.ForkOptions], 
    typingsSlinky.node.childProcessMod.ChildProcess
  ]
}
