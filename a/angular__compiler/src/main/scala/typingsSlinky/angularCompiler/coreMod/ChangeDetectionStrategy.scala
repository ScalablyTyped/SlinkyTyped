package typingsSlinky.angularCompiler.coreMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ChangeDetectionStrategy extends StObject
@JSImport("@angular/compiler/src/core", "ChangeDetectionStrategy")
@js.native
object ChangeDetectionStrategy extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ChangeDetectionStrategy with Double] = js.native
  
  @js.native
  sealed trait Default extends ChangeDetectionStrategy
  /* 1 */ val Default: typingsSlinky.angularCompiler.coreMod.ChangeDetectionStrategy.Default with Double = js.native
  
  @js.native
  sealed trait OnPush extends ChangeDetectionStrategy
  /* 0 */ val OnPush: typingsSlinky.angularCompiler.coreMod.ChangeDetectionStrategy.OnPush with Double = js.native
}
