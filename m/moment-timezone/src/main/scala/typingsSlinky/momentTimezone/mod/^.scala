package typingsSlinky.momentTimezone.mod

import typingsSlinky.moment.mod.Moment
import typingsSlinky.moment.mod.MomentBuiltinFormat
import typingsSlinky.moment.mod.MomentFormatSpecification
import typingsSlinky.moment.mod.MomentInput
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("moment-timezone", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
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
  def apply(inp: js.UndefOr[MomentInput], strict: Boolean): Moment = js.native
  def apply(inp: MomentInput): Moment = js.native
  
  var ISO_8601: MomentBuiltinFormat = js.native
  
  var RFC_2822: MomentBuiltinFormat = js.native
  
  var defaultFormat: String = js.native
  
  var defaultFormatUtc: String = js.native
  
  var fn: Moment = js.native
  
  var version: String = js.native
}
