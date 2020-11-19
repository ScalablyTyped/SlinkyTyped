package typingsSlinky.angularCompiler.compilerFacadeInterfaceMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ViewEncapsulation extends js.Object
@JSImport("@angular/compiler/src/compiler_facade_interface", "ViewEncapsulation")
@js.native
object ViewEncapsulation extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ViewEncapsulation with Double] = js.native
  
  @js.native
  sealed trait Emulated extends ViewEncapsulation
  /* 0 */ @js.native
  object Emulated extends TopLevel[Emulated with Double]
  
  @js.native
  sealed trait Native extends ViewEncapsulation
  /* 1 */ @js.native
  object Native extends TopLevel[Native with Double]
  
  @js.native
  sealed trait None extends ViewEncapsulation
  /* 2 */ @js.native
  object None extends TopLevel[None with Double]
  
  @js.native
  sealed trait ShadowDom extends ViewEncapsulation
  /* 3 */ @js.native
  object ShadowDom extends TopLevel[ShadowDom with Double]
}
