package typingsSlinky.atJestTypes

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object buildCircusMod {
  import typingsSlinky.std.Record

  type AsyncFn = TestFn | HookFn
  type BlockFn = typingsSlinky.atJestTypes.buildGlobalMod.BlockFn
  /* Rewritten from type alias, can be one of: 
    - scala.Unit
    - typings.atJestTypes.atJestTypesStrings.skip
    - typings.atJestTypes.atJestTypesStrings.only
    - typings.atJestTypes.atJestTypesStrings.todo
  */
  type BlockMode = _BlockMode | Unit
  type BlockName = typingsSlinky.atJestTypes.buildGlobalMod.BlockName
  type DoneFn = typingsSlinky.atJestTypes.buildGlobalMod.DoneFn
  type EventHandler = js.Function2[/* event */ Event, /* state */ State, Unit]
  type Exception = js.Any
  type FormattedError = String
  type HookFn = js.Function1[/* done */ js.UndefOr[DoneFn], js.UndefOr[js.Promise[js.Any] | Null]]
  type Process = typingsSlinky.node.NodeJS.Process
  type TestContext = Record[String, js.Any]
  type TestError = Exception | (js.Array[js.Tuple2[js.UndefOr[Exception], Exception]])
  type TestFn = typingsSlinky.atJestTypes.buildGlobalMod.TestFn
  type TestMode = BlockMode
  type TestName = typingsSlinky.atJestTypes.buildGlobalMod.TestName
  type TestResults = js.Array[TestResult]
}
