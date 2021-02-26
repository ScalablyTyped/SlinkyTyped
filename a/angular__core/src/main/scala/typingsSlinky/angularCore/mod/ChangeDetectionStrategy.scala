package typingsSlinky.angularCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ChangeDetectionStrategy extends StObject
@JSImport("@angular/core", "ChangeDetectionStrategy")
@js.native
object ChangeDetectionStrategy extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ChangeDetectionStrategy with Double] = js.native
  
  /**
    * Use the default `CheckAlways` strategy, in which change detection is automatic until
    * explicitly deactivated.
    */
  @js.native
  sealed trait Default extends ChangeDetectionStrategy
  /* 1 */ val Default: typingsSlinky.angularCore.mod.ChangeDetectionStrategy.Default with Double = js.native
  
  /**
    * Use the `CheckOnce` strategy, meaning that automatic change detection is deactivated
    * until reactivated by setting the strategy to `Default` (`CheckAlways`).
    * Change detection can still be explicitly invoked.
    * This strategy applies to all child directives and cannot be overridden.
    */
  @js.native
  sealed trait OnPush extends ChangeDetectionStrategy
  /* 0 */ val OnPush: typingsSlinky.angularCore.mod.ChangeDetectionStrategy.OnPush with Double = js.native
}
