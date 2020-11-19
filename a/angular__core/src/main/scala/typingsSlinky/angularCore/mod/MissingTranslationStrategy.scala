package typingsSlinky.angularCore.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait MissingTranslationStrategy extends js.Object
@JSImport("@angular/core", "MissingTranslationStrategy")
@js.native
object MissingTranslationStrategy extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[MissingTranslationStrategy with Double] = js.native
  
  @js.native
  sealed trait Error extends MissingTranslationStrategy
  /* 0 */ @js.native
  object Error extends TopLevel[Error with Double]
  
  @js.native
  sealed trait Ignore extends MissingTranslationStrategy
  /* 2 */ @js.native
  object Ignore extends TopLevel[Ignore with Double]
  
  @js.native
  sealed trait Warning extends MissingTranslationStrategy
  /* 1 */ @js.native
  object Warning extends TopLevel[Warning with Double]
}
