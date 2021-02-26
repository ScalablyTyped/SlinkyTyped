package typingsSlinky.rrule

import typingsSlinky.rrule.iterresultMod.default
import typingsSlinky.rrule.typesMod.IterResultType
import typingsSlinky.rrule.typesMod.QueryMethodTypes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object itersetMod {
  
  @JSImport("rrule/dist/esm/src/iterset", "iterSet")
  @js.native
  def iterSet[M /* <: QueryMethodTypes */](
    iterResult: default[M],
    _rrule: js.Array[typingsSlinky.rrule.rruleMod.default],
    _exrule: js.Array[typingsSlinky.rrule.rruleMod.default],
    _rdate: js.Array[js.Date],
    _exdate: js.Array[js.Date]
  ): IterResultType[M] = js.native
  @JSImport("rrule/dist/esm/src/iterset", "iterSet")
  @js.native
  def iterSet[M /* <: QueryMethodTypes */](
    iterResult: default[M],
    _rrule: js.Array[typingsSlinky.rrule.rruleMod.default],
    _exrule: js.Array[typingsSlinky.rrule.rruleMod.default],
    _rdate: js.Array[js.Date],
    _exdate: js.Array[js.Date],
    tzid: String
  ): IterResultType[M] = js.native
}
