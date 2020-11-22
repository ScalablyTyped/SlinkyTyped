package typingsSlinky.formatjsIntl

import typingsSlinky.formatjsIntl.errorMod.IntlErrorCode
import typingsSlinky.formatjsIntl.typesMod.FormatDisplayNameOptions
import typingsSlinky.formatjsIntl.typesMod.FormatListOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object formatjsIntlStrings {
  
  @scala.inline
  def FORMAT_ERROR: FORMAT_ERROR = "FORMAT_ERROR".asInstanceOf[FORMAT_ERROR]
  
  @scala.inline
  def INVALID_CONFIG: INVALID_CONFIG = "INVALID_CONFIG".asInstanceOf[INVALID_CONFIG]
  
  @scala.inline
  def MISSING_DATA: MISSING_DATA = "MISSING_DATA".asInstanceOf[MISSING_DATA]
  
  @scala.inline
  def MISSING_TRANSLATION: MISSING_TRANSLATION = "MISSING_TRANSLATION".asInstanceOf[MISSING_TRANSLATION]
  
  @scala.inline
  def UNSUPPORTED_FORMATTER: UNSUPPORTED_FORMATTER = "UNSUPPORTED_FORMATTER".asInstanceOf[UNSUPPORTED_FORMATTER]
  
  @scala.inline
  def date: date = "date".asInstanceOf[date]
  
  @scala.inline
  def fallback: fallback = "fallback".asInstanceOf[fallback]
  
  @scala.inline
  def localeMatcher: localeMatcher = "localeMatcher".asInstanceOf[localeMatcher]
  
  @scala.inline
  def number: number = "number".asInstanceOf[number]
  
  @scala.inline
  def relative: relative = "relative".asInstanceOf[relative]
  
  @scala.inline
  def style: style = "style".asInstanceOf[style]
  
  @scala.inline
  def time: time = "time".asInstanceOf[time]
  
  @scala.inline
  def `type`: `type` = "type".asInstanceOf[`type`]
  
  @js.native
  sealed trait FORMAT_ERROR extends IntlErrorCode
  
  @js.native
  sealed trait INVALID_CONFIG extends IntlErrorCode
  
  @js.native
  sealed trait MISSING_DATA extends IntlErrorCode
  
  @js.native
  sealed trait MISSING_TRANSLATION extends IntlErrorCode
  
  @js.native
  sealed trait UNSUPPORTED_FORMATTER extends IntlErrorCode
  
  @js.native
  sealed trait date extends js.Object
  
  @js.native
  sealed trait fallback extends FormatDisplayNameOptions
  
  @js.native
  sealed trait localeMatcher extends js.Object
  
  @js.native
  sealed trait number extends js.Object
  
  @js.native
  sealed trait relative extends js.Object
  
  @js.native
  sealed trait style
    extends FormatDisplayNameOptions
       with FormatListOptions
  
  @js.native
  sealed trait time extends js.Object
  
  @js.native
  sealed trait `type`
    extends FormatDisplayNameOptions
       with FormatListOptions
}
