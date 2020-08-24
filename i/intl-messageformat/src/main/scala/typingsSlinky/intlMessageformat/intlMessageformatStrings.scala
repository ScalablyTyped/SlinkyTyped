package typingsSlinky.intlMessageformat

import typingsSlinky.intlMessageformat.mod.ErrorCode
import typingsSlinky.intlMessageformat.mod._ValidPluralRule
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object intlMessageformatStrings {
  @js.native
  sealed trait INVALID_VALUE
    extends ErrorCode
       with typingsSlinky.intlMessageformat.srcErrorMod.ErrorCode
       with typingsSlinky.intlMessageformat.errorMod.ErrorCode
  
  @js.native
  sealed trait MISSING_INTL_API
    extends ErrorCode
       with typingsSlinky.intlMessageformat.srcErrorMod.ErrorCode
       with typingsSlinky.intlMessageformat.errorMod.ErrorCode
  
  @js.native
  sealed trait MISSING_VALUE
    extends ErrorCode
       with typingsSlinky.intlMessageformat.srcErrorMod.ErrorCode
       with typingsSlinky.intlMessageformat.errorMod.ErrorCode
  
  @js.native
  sealed trait few extends _ValidPluralRule
  
  @js.native
  sealed trait many extends _ValidPluralRule
  
  @js.native
  sealed trait one extends _ValidPluralRule
  
  @js.native
  sealed trait other extends _ValidPluralRule
  
  @js.native
  sealed trait two extends _ValidPluralRule
  
  @js.native
  sealed trait zero extends _ValidPluralRule
  
  @scala.inline
  def INVALID_VALUE: INVALID_VALUE = "INVALID_VALUE".asInstanceOf[INVALID_VALUE]
  @scala.inline
  def MISSING_INTL_API: MISSING_INTL_API = "MISSING_INTL_API".asInstanceOf[MISSING_INTL_API]
  @scala.inline
  def MISSING_VALUE: MISSING_VALUE = "MISSING_VALUE".asInstanceOf[MISSING_VALUE]
  @scala.inline
  def few: few = "few".asInstanceOf[few]
  @scala.inline
  def many: many = "many".asInstanceOf[many]
  @scala.inline
  def one: one = "one".asInstanceOf[one]
  @scala.inline
  def other: other = "other".asInstanceOf[other]
  @scala.inline
  def two: two = "two".asInstanceOf[two]
  @scala.inline
  def zero: zero = "zero".asInstanceOf[zero]
}

