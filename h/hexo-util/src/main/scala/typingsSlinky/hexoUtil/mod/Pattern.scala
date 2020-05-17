package typingsSlinky.hexoUtil.mod

import org.scalablytyped.runtime.Instantiable1
import typingsSlinky.hexoUtil.anon.Dictindex
import typingsSlinky.std.RegExpMatchArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Pattern[T] extends js.Object {
  def `match`(str: String): T = js.native
  def test(str: String): Boolean = js.native
}

@JSImport("hexo-util", "Pattern")
@js.native
object Pattern
  extends Instantiable1[
      (/* rule */ js.Function1[/* str */ String, js.Object]) | (/* rule */ Pattern[js.Object]) | (/* rule */ js.RegExp) | (/* rule */ String), 
      Pattern[js.UndefOr[Dictindex | Null | js.Object | RegExpMatchArray]]
    ]

