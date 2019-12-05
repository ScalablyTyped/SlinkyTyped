package typingsSlinky.pgDashMinify.pgDashMinifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait parsingErrorCode extends js.Object

@JSImport("pg-minify", "parsingErrorCode")
@js.native
object parsingErrorCode extends js.Object {
  @js.native
  sealed trait multiLineQI extends parsingErrorCode
  
      // Unclosed multi-line comment.
  @js.native
  sealed trait unclosedMLC extends parsingErrorCode
  
       // Unclosed quoted identifier.
  @js.native
  sealed trait unclosedQI extends parsingErrorCode
  
     // Unclosed text block.
  @js.native
  sealed trait unclosedText extends parsingErrorCode
  
  /* 3 */ val multiLineQI: typingsSlinky.pgDashMinify.pgDashMinifyMod.parsingErrorCode.multiLineQI with Double = js.native
  /* 0 */ val unclosedMLC: typingsSlinky.pgDashMinify.pgDashMinifyMod.parsingErrorCode.unclosedMLC with Double = js.native
  /* 2 */ val unclosedQI: typingsSlinky.pgDashMinify.pgDashMinifyMod.parsingErrorCode.unclosedQI with Double = js.native
  /* 1 */ val unclosedText: typingsSlinky.pgDashMinify.pgDashMinifyMod.parsingErrorCode.unclosedText with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[parsingErrorCode with Double] = js.native
}

