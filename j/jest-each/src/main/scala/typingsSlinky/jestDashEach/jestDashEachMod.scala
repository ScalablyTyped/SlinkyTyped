package typingsSlinky.jestDashEach

import typingsSlinky.atJestTypes.buildGlobalMod.EachTable
import typingsSlinky.atJestTypes.buildGlobalMod.EachTestFn
import typingsSlinky.jestDashEach.buildBindMod.GlobalCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jest-each", JSImport.Namespace)
@js.native
object jestDashEachMod extends js.Object {
  def bind(cb: GlobalCallback): js.Function2[
    /* table */ EachTable, 
    /* repeated */ js.Any, 
    js.Function3[/* title */ String, /* test */ EachTestFn, /* timeout */ js.UndefOr[Double], Unit]
  ] = js.native
  def bind(cb: GlobalCallback, supportsDone: Boolean): js.Function2[
    /* table */ EachTable, 
    /* repeated */ js.Any, 
    js.Function3[/* title */ String, /* test */ EachTestFn, /* timeout */ js.UndefOr[Double], Unit]
  ] = js.native
  @js.native
  object default extends js.Object {
    def apply(table: EachTable, data: js.Any*): Anon_Describe = js.native
    def withGlobal(g: typingsSlinky.atJestTypes.buildGlobalMod.Global): js.Function2[/* table */ EachTable, /* repeated */ js.Any, Anon_Describe] = js.native
  }
  
  type Global = typingsSlinky.atJestTypes.buildGlobalMod.Global
}

