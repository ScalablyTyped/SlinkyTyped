package typingsSlinky.angularCore.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ɵChangeDetectorStatus extends js.Object
@JSImport("@angular/core", "\u0275ChangeDetectorStatus")
@js.native
object ɵChangeDetectorStatus extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ɵChangeDetectorStatus with Double] = js.native
  
  /**
    * A state in which change detection continues automatically until explicitly
    * deactivated.
    */
  @js.native
  sealed trait CheckAlways extends ɵChangeDetectorStatus
  /* 2 */ @js.native
  object CheckAlways extends TopLevel[CheckAlways with Double]
  
  /**
    * A state in which, after calling `detectChanges()`, the change detector
    * state becomes `Checked`, and must be explicitly invoked or reactivated.
    */
  @js.native
  sealed trait CheckOnce extends ɵChangeDetectorStatus
  /* 0 */ @js.native
  object CheckOnce extends TopLevel[CheckOnce with Double]
  
  /**
    * A state in which change detection is skipped until the change detector mode
    * becomes `CheckOnce`.
    */
  @js.native
  sealed trait Checked extends ɵChangeDetectorStatus
  /* 1 */ @js.native
  object Checked extends TopLevel[Checked with Double]
  
  /**
    * Indicates that the change detector has been destroyed.
    */
  @js.native
  sealed trait Destroyed extends ɵChangeDetectorStatus
  /* 5 */ @js.native
  object Destroyed extends TopLevel[Destroyed with Double]
  
  /**
    * A state in which a change detector sub tree is not a part of the main tree and
    * should be skipped.
    */
  @js.native
  sealed trait Detached extends ɵChangeDetectorStatus
  /* 3 */ @js.native
  object Detached extends TopLevel[Detached with Double]
  
  /**
    * Indicates that the change detector encountered an error checking a binding
    * or calling a directive lifecycle method and is now in an inconsistent state. Change
    * detectors in this state do not detect changes.
    */
  @js.native
  sealed trait Errored extends ɵChangeDetectorStatus
  /* 4 */ @js.native
  object Errored extends TopLevel[Errored with Double]
}
