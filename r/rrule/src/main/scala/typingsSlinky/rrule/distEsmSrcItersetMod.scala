package typingsSlinky.rrule

import typingsSlinky.rrule.distEsmSrcIterresultMod.default
import typingsSlinky.rrule.distEsmSrcTypesMod.IterResultType
import typingsSlinky.rrule.distEsmSrcTypesMod.QueryMethodTypes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rrule/dist/esm/src/iterset", JSImport.Namespace)
@js.native
object distEsmSrcItersetMod extends js.Object {
  def iterSet[M /* <: QueryMethodTypes */](
    iterResult: default[M],
    _rrule: js.Array[typingsSlinky.rrule.distEsmSrcRruleMod.default],
    _exrule: js.Array[typingsSlinky.rrule.distEsmSrcRruleMod.default],
    _rdate: js.Array[js.Date],
    _exdate: js.Array[js.Date]
  ): IterResultType[M] = js.native
  def iterSet[M /* <: QueryMethodTypes */](
    iterResult: default[M],
    _rrule: js.Array[typingsSlinky.rrule.distEsmSrcRruleMod.default],
    _exrule: js.Array[typingsSlinky.rrule.distEsmSrcRruleMod.default],
    _rdate: js.Array[js.Date],
    _exdate: js.Array[js.Date],
    tzid: String
  ): IterResultType[M] = js.native
}

