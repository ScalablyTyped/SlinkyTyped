package typingsSlinky.jestTypes

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object circusMod {
  type BlockFn = typingsSlinky.jestTypes.globalMod.BlockFn
  type BlockName = typingsSlinky.jestTypes.globalMod.BlockName
  type DoneFn = typingsSlinky.jestTypes.globalMod.DoneFn
  type EventHandler = js.Function2[
    /* event */ typingsSlinky.jestTypes.circusMod.Event, 
    /* state */ typingsSlinky.jestTypes.circusMod.State, 
    scala.Unit
  ]
  type Exception = js.Any
  type FormattedError = java.lang.String
  type HookFn = js.Function1[
    /* done */ js.UndefOr[typingsSlinky.jestTypes.circusMod.DoneFn], 
    js.UndefOr[js.Promise[js.Any] | scala.Null]
  ]
  type Process = typingsSlinky.node.NodeJS.Process
  type TestContext = typingsSlinky.std.Record[java.lang.String, js.Any]
  type TestFn = typingsSlinky.jestTypes.globalMod.TestFn
  type TestMode = typingsSlinky.jestTypes.circusMod.BlockMode
  type TestName = typingsSlinky.jestTypes.globalMod.TestName
  type TestResults = js.Array[typingsSlinky.jestTypes.circusMod.TestResult]
}
