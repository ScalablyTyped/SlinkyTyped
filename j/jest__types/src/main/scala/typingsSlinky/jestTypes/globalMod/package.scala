package typingsSlinky.jestTypes

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object globalMod {
  
  type ArrayTable = typingsSlinky.jestTypes.globalMod.Table | typingsSlinky.jestTypes.globalMod.Row
  
  type BlockFn = js.Function0[scala.Unit]
  
  type BlockName = java.lang.String
  
  type Col = js.Any
  
  type ConcurrentTestFn = js.Function1[
    /* done */ js.UndefOr[typingsSlinky.jestTypes.globalMod.DoneFn], 
    js.Promise[js.UndefOr[scala.Unit | js.Any]]
  ]
  
  type DoneFn = js.Function1[/* reason */ js.UndefOr[java.lang.String | js.Error], scala.Unit]
  
  type Each[EachCallback /* <: typingsSlinky.jestTypes.globalMod.TestCallback */] = (js.Function2[
    /* table */ typingsSlinky.jestTypes.globalMod.EachTable, 
    /* repeated */ js.Any, 
    js.Function3[
      /* title */ java.lang.String, 
      /* test */ typingsSlinky.jestTypes.globalMod.EachTestFn[EachCallback], 
      /* timeout */ js.UndefOr[scala.Double], 
      scala.Unit
    ]
  ]) | js.Function0[js.Function0[scala.Unit]]
  
  type EachTable = typingsSlinky.jestTypes.globalMod.ArrayTable | typingsSlinky.jestTypes.globalMod.TemplateTable
  
  type EachTestFn[EachCallback /* <: typingsSlinky.jestTypes.globalMod.TestCallback */] = js.Function1[/* repeated */ js.Any, typingsSlinky.std.ReturnType[EachCallback]]
  
  type HookBase = js.Function2[
    /* fn */ typingsSlinky.jestTypes.globalMod.HookFn, 
    /* timeout */ js.UndefOr[scala.Double], 
    scala.Unit
  ]
  
  type HookFn = typingsSlinky.jestTypes.globalMod.TestFn
  
  type Row = js.Array[typingsSlinky.jestTypes.globalMod.Col]
  
  type Table = js.Array[typingsSlinky.jestTypes.globalMod.Row]
  
  type TemplateData = js.Array[js.Any]
  
  type TemplateTable = typingsSlinky.std.TemplateStringsArray
  
  type TestCallback = typingsSlinky.jestTypes.globalMod.BlockFn | typingsSlinky.jestTypes.globalMod.TestFn | typingsSlinky.jestTypes.globalMod.ConcurrentTestFn
  
  type TestFn = js.Function1[
    /* done */ js.UndefOr[typingsSlinky.jestTypes.globalMod.DoneFn], 
    js.UndefOr[(js.Promise[js.UndefOr[scala.Unit | js.Any]]) | scala.Unit]
  ]
  
  type TestName = java.lang.String
}
