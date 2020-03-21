package typingsSlinky.jestTypes

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object globalMod {
  type ArrayTable = typingsSlinky.jestTypes.globalMod.Table | typingsSlinky.jestTypes.globalMod.Row
  type BlockFn = js.Function0[scala.Unit]
  type BlockName = java.lang.String
  type Col = js.Any
  type DoneFn = js.Function1[/* reason */ js.UndefOr[java.lang.String | js.Error], scala.Unit]
  type Each = js.Function2[
    /* table */ typingsSlinky.jestTypes.globalMod.EachTable, 
    /* repeated */ js.Any, 
    js.Function3[
      /* title */ java.lang.String, 
      /* test */ typingsSlinky.jestTypes.globalMod.EachTestFn, 
      /* timeout */ js.UndefOr[scala.Double], 
      scala.Unit
    ]
  ]
  type EachTable = typingsSlinky.jestTypes.globalMod.ArrayTable | typingsSlinky.jestTypes.globalMod.TemplateTable
  type EachTestFn = js.Function1[/* repeated */ js.Any, js.UndefOr[js.Promise[js.Any] | scala.Unit]]
  type ItConcurrentBase = js.Function3[
    /* testName */ java.lang.String, 
    /* testFn */ js.Function0[js.Promise[js.Any]], 
    /* timeout */ js.UndefOr[scala.Double], 
    scala.Unit
  ]
  type Row = js.Array[typingsSlinky.jestTypes.globalMod.Col]
  type Table = js.Array[typingsSlinky.jestTypes.globalMod.Row]
  type TemplateData = js.Array[js.Any]
  type TemplateTable = typingsSlinky.std.TemplateStringsArray
  type TestFn = js.Function1[
    /* done */ js.UndefOr[typingsSlinky.jestTypes.globalMod.DoneFn], 
    js.UndefOr[js.Promise[js.Any] | scala.Unit]
  ]
  type TestName = java.lang.String
}
