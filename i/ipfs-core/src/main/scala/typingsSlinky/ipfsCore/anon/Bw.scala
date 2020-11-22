package typingsSlinky.ipfsCore.anon

import typingsSlinky.ipfsCore.srcUtilsMod.AbortOptions
import typingsSlinky.ipfsCore.statMod.BitswapStats
import typingsSlinky.std.AsyncGenerator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Bw extends js.Object {
  
  def bitswap(): js.Promise[BitswapStats] = js.native
  def bitswap(_options: AbortOptions): js.Promise[BitswapStats] = js.native
  
  var bw: (js.Function1[/* options */ js.UndefOr[js.Any], AsyncGenerator[RateIn, Unit, _]]) | js.Function0[js.Promise[scala.Nothing]] = js.native
  
  def repo(): js.Promise[NumObjects] = js.native
  def repo(options: js.Any): js.Promise[NumObjects] = js.native
}
