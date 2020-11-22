package typingsSlinky.intlMessageformat

import typingsSlinky.intlMessageformat.srcErrorMod.ErrorCode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object intlMessageformatStrings {
  
  @scala.inline
  def INVALID_VALUE: INVALID_VALUE = "INVALID_VALUE".asInstanceOf[INVALID_VALUE]
  
  @scala.inline
  def MISSING_INTL_API: MISSING_INTL_API = "MISSING_INTL_API".asInstanceOf[MISSING_INTL_API]
  
  @scala.inline
  def MISSING_VALUE: MISSING_VALUE = "MISSING_VALUE".asInstanceOf[MISSING_VALUE]
  
  @js.native
  sealed trait INVALID_VALUE
    extends ErrorCode
       with typingsSlinky.intlMessageformat.errorMod.ErrorCode
  
  @js.native
  sealed trait MISSING_INTL_API
    extends ErrorCode
       with typingsSlinky.intlMessageformat.errorMod.ErrorCode
  
  @js.native
  sealed trait MISSING_VALUE
    extends ErrorCode
       with typingsSlinky.intlMessageformat.errorMod.ErrorCode
}
