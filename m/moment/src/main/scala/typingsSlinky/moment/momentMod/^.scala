package typingsSlinky.moment.momentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("moment/ts3.1-typings/moment", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  /**
    * @param strict Strict parsing requires that the format and input match exactly, including delimiters.
    * Strict parsing is frequently the best parsing option. For more information about choosing strict vs
    * forgiving parsing, see the [parsing guide](https://momentjs.com/guides/#/parsing/).
    */
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
  
  var deprecationHandler: js.UndefOr[(js.Function2[/* name */ String | Null, /* msg */ String, Unit]) | Null] = js.native
  
  var fn: Moment = js.native
  
  var suppressDeprecationWarnings: Boolean = js.native
  
  var version: String = js.native
}
