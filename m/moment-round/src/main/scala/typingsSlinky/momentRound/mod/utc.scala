package typingsSlinky.momentRound.mod

import typingsSlinky.moment.mod.Moment
import typingsSlinky.moment.mod.MomentFormatSpecification
import typingsSlinky.moment.mod.MomentInput
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("moment-round", "utc")
@js.native
object utc extends js.Object {
  
  def apply(): Moment = js.native
  def apply(
    inp: js.UndefOr[MomentInput],
    format: js.UndefOr[MomentFormatSpecification],
    language: js.UndefOr[scala.Nothing],
    strict: Boolean
  ): Moment = js.native
  def apply(inp: js.UndefOr[MomentInput], format: js.UndefOr[MomentFormatSpecification], language: String): Moment = js.native
  def apply(
    inp: js.UndefOr[MomentInput],
    format: js.UndefOr[MomentFormatSpecification],
    language: String,
    strict: Boolean
  ): Moment = js.native
  def apply(inp: js.UndefOr[MomentInput], format: js.UndefOr[MomentFormatSpecification], strict: Boolean): Moment = js.native
  def apply(inp: js.UndefOr[MomentInput], format: MomentFormatSpecification): Moment = js.native
  def apply(inp: MomentInput): Moment = js.native
}
