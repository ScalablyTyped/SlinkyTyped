package typingsSlinky.reactDaterangePicker

import typingsSlinky.moment.mod.Moment
import typingsSlinky.moment.mod.MomentFormatSpecification
import typingsSlinky.moment.mod.MomentInput
import typingsSlinky.moment.mod.unitOfTime.Diff
import typingsSlinky.momentRange.mod.DateRange
import typingsSlinky.momentRange.mod.MomentRangeStaticMethods
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined moment-range.moment-range.MomentRange & {None (inp : undefined, format : undefined, language : undefined, strict : boolean): moment.moment.Moment, None (inp : moment.moment.MomentInput, format : undefined, language : undefined, strict : boolean): moment.moment.Moment, None (inp : undefined, format : moment.moment.MomentFormatSpecification, language : undefined, strict : boolean): moment.moment.Moment, None (inp : moment.moment.MomentInput, format : moment.moment.MomentFormatSpecification, language : undefined, strict : boolean): moment.moment.Moment, None (inp : undefined, format : undefined, language : string, strict : boolean): moment.moment.Moment, None (inp : moment.moment.MomentInput, format : undefined, language : string, strict : boolean): moment.moment.Moment, None (inp : undefined, format : moment.moment.MomentFormatSpecification, language : string, strict : boolean): moment.moment.Moment, None (inp : moment.moment.MomentInput, format : moment.moment.MomentFormatSpecification, language : string, strict : boolean): moment.moment.Moment, None (inp : undefined, format : undefined, language : string): moment.moment.Moment, None (inp : moment.moment.MomentInput, format : undefined, language : string): moment.moment.Moment, None (inp : undefined, format : moment.moment.MomentFormatSpecification, language : string): moment.moment.Moment, None (inp : moment.moment.MomentInput, format : moment.moment.MomentFormatSpecification, language : string): moment.moment.Moment, None (inp : undefined, format : moment.moment.MomentFormatSpecification): moment.moment.Moment, None (inp : moment.moment.MomentInput, format : moment.moment.MomentFormatSpecification): moment.moment.Moment, None (inp : moment.moment.MomentInput): moment.moment.Moment, None (): moment.moment.Moment, None (inp : undefined, format : undefined, strict : boolean): moment.moment.Moment, None (inp : moment.moment.MomentInput, format : undefined, strict : boolean): moment.moment.Moment, None (inp : undefined, format : moment.moment.MomentFormatSpecification, strict : boolean): moment.moment.Moment, None (inp : moment.moment.MomentInput, format : moment.moment.MomentFormatSpecification, strict : boolean): moment.moment.Moment, None (inp : undefined, format : moment.moment.MomentFormatSpecification): moment.moment.Moment, None (inp : moment.moment.MomentInput, format : moment.moment.MomentFormatSpecification): moment.moment.Moment, None (inp : moment.moment.MomentInput): moment.moment.Moment, None (): moment.moment.Moment, None (inp : undefined, strict : boolean): moment.moment.Moment, None (inp : moment.moment.MomentInput, strict : boolean): moment.moment.Moment, None (inp : moment.moment.MomentInput): moment.moment.Moment, None (): moment.moment.Moment} */
  @js.native
  trait MomentRangeNoneinpundefin extends StObject {
    
    def apply(): Moment = js.native
    def apply(args: js.Any*): MomentRangeStaticMethods with Moment = js.native
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
    
    // @deprecated 4.0.0
    def parseZoneRange(isoTimeInterval: String): DateRange = js.native
    
    def range(): DateRange = js.native
    def range(range: String): DateRange = js.native
    def range(range: js.Tuple2[js.Date | Moment, js.Date | Moment]): DateRange = js.native
    def range(start: js.Date, end: js.Date): DateRange = js.native
    def range(start: js.Date, end: Moment): DateRange = js.native
    def range(start: Moment, end: js.Date): DateRange = js.native
    def range(start: Moment, end: Moment): DateRange = js.native
    
    def rangeFromISOString(isoTimeInterval: String): DateRange = js.native
    
    def rangeFromInterval(interval: Diff): DateRange = js.native
    def rangeFromInterval(interval: Diff, count: js.UndefOr[scala.Nothing], date: js.Date): DateRange = js.native
    def rangeFromInterval(interval: Diff, count: js.UndefOr[scala.Nothing], date: Moment): DateRange = js.native
    def rangeFromInterval(interval: Diff, count: Double): DateRange = js.native
    def rangeFromInterval(interval: Diff, count: Double, date: js.Date): DateRange = js.native
    def rangeFromInterval(interval: Diff, count: Double, date: Moment): DateRange = js.native
  }
}
