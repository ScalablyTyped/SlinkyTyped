package typingsSlinky.angularCompiler.r3FactoryMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait R3ResolvedDependencyType extends js.Object
@JSImport("@angular/compiler/src/render3/r3_factory", "R3ResolvedDependencyType")
@js.native
object R3ResolvedDependencyType extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[R3ResolvedDependencyType with Double] = js.native
  
  /**
    * The dependency is for an attribute.
    *
    * The token expression is a string representing the attribute name.
    */
  @js.native
  sealed trait Attribute extends R3ResolvedDependencyType
  /* 1 */ @js.native
  object Attribute extends TopLevel[Attribute with Double]
  
  /**
    * Injecting the `ChangeDetectorRef` token. Needs special handling when injected into a pipe.
    */
  @js.native
  sealed trait ChangeDetectorRef extends R3ResolvedDependencyType
  /* 2 */ @js.native
  object ChangeDetectorRef extends TopLevel[ChangeDetectorRef with Double]
  
  /**
    * An invalid dependency (no token could be determined). An error should be thrown at runtime.
    */
  @js.native
  sealed trait Invalid extends R3ResolvedDependencyType
  /* 3 */ @js.native
  object Invalid extends TopLevel[Invalid with Double]
  
  /**
    * A normal token dependency.
    */
  @js.native
  sealed trait Token extends R3ResolvedDependencyType
  /* 0 */ @js.native
  object Token extends TopLevel[Token with Double]
}
