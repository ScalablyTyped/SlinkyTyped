package typingsSlinky.jestTypes

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object circusMod {
  type AsyncFn = typingsSlinky.jestTypes.circusMod.TestFn | typingsSlinky.jestTypes.circusMod.HookFn
  type BlockFn = typingsSlinky.jestTypes.globalMod.BlockFn
  /* Rewritten from type alias, can be one of: 
    - scala.Unit
    - typingsSlinky.jestTypes.jestTypesStrings.skip
    - typingsSlinky.jestTypes.jestTypesStrings.only
    - typingsSlinky.jestTypes.jestTypesStrings.todo
  */
  type BlockMode = typingsSlinky.jestTypes.circusMod._BlockMode | scala.Unit
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
  type Process = typingsSlinky.node.processMod.global.NodeJS.Process
  type TestContext = typingsSlinky.std.Record[java.lang.String, js.Any]
  type TestError = typingsSlinky.jestTypes.circusMod.Exception | (js.Array[
    js.Tuple2[
      js.UndefOr[typingsSlinky.jestTypes.circusMod.Exception], 
      typingsSlinky.jestTypes.circusMod.Exception
    ]
  ])
  type TestFn = typingsSlinky.jestTypes.globalMod.TestFn
  type TestMode = typingsSlinky.jestTypes.circusMod.BlockMode
  type TestName = typingsSlinky.jestTypes.globalMod.TestName
  type TestResults = js.Array[typingsSlinky.jestTypes.circusMod.TestResult]
}
