package typingsSlinky.oracleOraclejet.anon

import typingsSlinky.oracleOraclejet.ojsunburstMod.ojSunburst.TooltipContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `19`[K, D] extends StObject {
  
  def renderer(context: TooltipContext[K, D]): Insert | PreventDefault = js.native
}
object `19` {
  
  @scala.inline
  def apply[K, D](renderer: TooltipContext[K, D] => Insert | PreventDefault): `19`[K, D] = {
    val __obj = js.Dynamic.literal(renderer = js.Any.fromFunction1(renderer))
    __obj.asInstanceOf[`19`[K, D]]
  }
  
  @scala.inline
  implicit class `19MutableBuilder`[Self <: `19`[_, _], K, D] (val x: Self with (`19`[K, D])) extends AnyVal {
    
    @scala.inline
    def setRenderer(value: TooltipContext[K, D] => Insert | PreventDefault): Self = StObject.set(x, "renderer", js.Any.fromFunction1(value))
  }
}
