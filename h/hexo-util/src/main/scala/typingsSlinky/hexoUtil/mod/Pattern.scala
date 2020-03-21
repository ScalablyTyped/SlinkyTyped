package typingsSlinky.hexoUtil.mod

import org.scalablytyped.runtime.Instantiable1
import typingsSlinky.hexoUtil.AnonDictindex
import typingsSlinky.std.RegExp
import typingsSlinky.std.RegExpMatchArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Pattern[T] extends js.Object {
  def `match`(str: String): T
  def test(str: String): Boolean
}

@JSImport("hexo-util", "Pattern")
@js.native
object Pattern
  extends Instantiable1[
      (/* rule */ js.Function1[/* str */ String, js.Object]) | (/* rule */ Pattern[js.Object]) | (/* rule */ RegExp) | (/* rule */ String), 
      Pattern[js.UndefOr[AnonDictindex | Null | js.Object | RegExpMatchArray]]
    ]

