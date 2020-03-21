package typingsSlinky.rrule

import typingsSlinky.rrule.iterresultMod.default
import typingsSlinky.rrule.typesMod.IterResultType
import typingsSlinky.rrule.typesMod.ParsedOptions
import typingsSlinky.rrule.typesMod.QueryMethodTypes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rrule/dist/esm/src/iter", JSImport.Namespace)
@js.native
object iterMod extends js.Object {
  def iter[M /* <: QueryMethodTypes */](iterResult: default[M], options: ParsedOptions): IterResultType[M] = js.native
}

