package typingsSlinky.playable

import typingsSlinky.playable.anon.LengthNumber
import typingsSlinky.std.RegExpExecArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsMod {
  
  @JSImport("playable/dist/src/modules/ui/core/element-queries/utils", "forEachMatch")
  @js.native
  def forEachMatch(string: String, pattern: js.RegExp, callback: js.Function1[/* match */ RegExpExecArray, Unit]): Unit = js.native
  
  @JSImport("playable/dist/src/modules/ui/core/element-queries/utils", "reduce")
  @js.native
  def reduce(arrayLike: LengthNumber, callback: js.Function1[/* repeated */ js.Any, Unit], initialValue: js.Any): js.Any = js.native
}
