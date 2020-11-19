package typingsSlinky.angularCommon.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TranslationWidth extends js.Object
@JSImport("@angular/common", "TranslationWidth")
@js.native
object TranslationWidth extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TranslationWidth with Double] = js.native
  
  /** 3 characters for `en-US`. For example: 'Sun' */
  @js.native
  sealed trait Abbreviated extends TranslationWidth
  /* 1 */ @js.native
  object Abbreviated extends TopLevel[Abbreviated with Double]
  
  /** 1 character for `en-US`. For example: 'S' */
  @js.native
  sealed trait Narrow extends TranslationWidth
  /* 0 */ @js.native
  object Narrow extends TopLevel[Narrow with Double]
  
  /** 2 characters for `en-US`, For example: "Su" */
  @js.native
  sealed trait Short extends TranslationWidth
  /* 3 */ @js.native
  object Short extends TopLevel[Short with Double]
  
  /** Full length for `en-US`. For example: "Sunday" */
  @js.native
  sealed trait Wide extends TranslationWidth
  /* 2 */ @js.native
  object Wide extends TopLevel[Wide with Double]
}
