package typingsSlinky.jestTypes.globalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeBase extends js.Object {
  
  def apply(blockName: BlockName, blockFn: BlockFn): Unit = js.native
  
  def each(table: EachTable, taggedTemplateData: js.Any*): js.Function3[/* title */ String, /* test */ EachTestFn, /* timeout */ js.UndefOr[Double], Unit] = js.native
  @JSName("each")
  var each_Original: Each = js.native
}
