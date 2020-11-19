package typingsSlinky.openpgp.mod.enums

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait literal extends js.Object
/**
  * Data types in the literal packet
  */
@JSImport("openpgp", "enums.literal")
@js.native
object literal extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[literal with Double] = js.native
  
  /**
    * Binary data 'b'
    */
  @js.native
  sealed trait binary extends literal
  /* 98 */ @js.native
  object binary extends TopLevel[binary with Double]
  
  /**
    * MIME message body part 'm'
    */
  @js.native
  sealed trait mime extends literal
  /* 109 */ @js.native
  object mime extends TopLevel[mime with Double]
  
  /**
    * Text data 't'
    */
  @js.native
  sealed trait text extends literal
  /* 116 */ @js.native
  object text extends TopLevel[text with Double]
  
  /**
    * Utf8 data 'u'
    */
  @js.native
  sealed trait utf8 extends literal
  /* 117 */ @js.native
  object utf8 extends TopLevel[utf8 with Double]
}
