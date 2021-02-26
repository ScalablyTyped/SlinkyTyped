package typingsSlinky.reactIntl.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactIntl.reactIntlStrings.buddhist
import typingsSlinky.reactIntl.reactIntlStrings.chinese
import typingsSlinky.reactIntl.reactIntlStrings.coptic
import typingsSlinky.reactIntl.reactIntlStrings.ethiopia
import typingsSlinky.reactIntl.reactIntlStrings.ethiopic
import typingsSlinky.reactIntl.reactIntlStrings.full
import typingsSlinky.reactIntl.reactIntlStrings.gregory
import typingsSlinky.reactIntl.reactIntlStrings.h11
import typingsSlinky.reactIntl.reactIntlStrings.h12
import typingsSlinky.reactIntl.reactIntlStrings.h23
import typingsSlinky.reactIntl.reactIntlStrings.h24
import typingsSlinky.reactIntl.reactIntlStrings.hebrew
import typingsSlinky.reactIntl.reactIntlStrings.indian
import typingsSlinky.reactIntl.reactIntlStrings.islamic
import typingsSlinky.reactIntl.reactIntlStrings.iso8601
import typingsSlinky.reactIntl.reactIntlStrings.japanese
import typingsSlinky.reactIntl.reactIntlStrings.long
import typingsSlinky.reactIntl.reactIntlStrings.medium
import typingsSlinky.reactIntl.reactIntlStrings.persian
import typingsSlinky.reactIntl.reactIntlStrings.roc
import typingsSlinky.reactIntl.reactIntlStrings.short
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@scala.inline
class SharedBuilder_DateTimeFormatOptionsCust276893233 (val args: js.Array[js.Any])
  extends AnyVal
     with StBuildingComponent[tag.type, scala.Nothing] {
  
  @scala.inline
  def calendar(
    value: buddhist | chinese | coptic | ethiopia | ethiopic | gregory | hebrew | indian | islamic | iso8601 | japanese | persian | roc
  ): this.type = set("calendar", value.asInstanceOf[js.Any])
  
  @scala.inline
  def dateStyle(value: full | long | medium | short): this.type = set("dateStyle", value.asInstanceOf[js.Any])
  
  @scala.inline
  def day(value: String): this.type = set("day", value.asInstanceOf[js.Any])
  
  @scala.inline
  def era(value: String): this.type = set("era", value.asInstanceOf[js.Any])
  
  @scala.inline
  def format(value: String): this.type = set("format", value.asInstanceOf[js.Any])
  
  @scala.inline
  def formatMatcher(value: String): this.type = set("formatMatcher", value.asInstanceOf[js.Any])
  
  @scala.inline
  def fractionalSecondDigits(value: Double): this.type = set("fractionalSecondDigits", value.asInstanceOf[js.Any])
  
  @scala.inline
  def hour(value: String): this.type = set("hour", value.asInstanceOf[js.Any])
  
  @scala.inline
  def hour12(value: Boolean): this.type = set("hour12", value.asInstanceOf[js.Any])
  
  @scala.inline
  def hourCycle(value: h11 | h12 | h23 | h24): this.type = set("hourCycle", value.asInstanceOf[js.Any])
  
  @scala.inline
  def localeMatcher(value: String): this.type = set("localeMatcher", value.asInstanceOf[js.Any])
  
  @scala.inline
  def minute(value: String): this.type = set("minute", value.asInstanceOf[js.Any])
  
  @scala.inline
  def month(value: String): this.type = set("month", value.asInstanceOf[js.Any])
  
  @scala.inline
  def numberingSystem(value: String): this.type = set("numberingSystem", value.asInstanceOf[js.Any])
  
  @scala.inline
  def second(value: String): this.type = set("second", value.asInstanceOf[js.Any])
  
  @scala.inline
  def timeStyle(value: full | long | medium | short): this.type = set("timeStyle", value.asInstanceOf[js.Any])
  
  @scala.inline
  def timeZone(value: String): this.type = set("timeZone", value.asInstanceOf[js.Any])
  
  @scala.inline
  def timeZoneName(value: String): this.type = set("timeZoneName", value.asInstanceOf[js.Any])
  
  @scala.inline
  def value(value: String | Double | js.Date): this.type = set("value", value.asInstanceOf[js.Any])
  
  @scala.inline
  def valueDate(value: js.Date): this.type = set("value", value.asInstanceOf[js.Any])
  
  @scala.inline
  def weekday(value: String): this.type = set("weekday", value.asInstanceOf[js.Any])
  
  @scala.inline
  def year(value: String): this.type = set("year", value.asInstanceOf[js.Any])
}
