package typingsSlinky.angularCompiler.coreMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ViewEncapsulation extends StObject
@JSImport("@angular/compiler/src/core", "ViewEncapsulation")
@js.native
object ViewEncapsulation extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ViewEncapsulation with Double] = js.native
  
  @js.native
  sealed trait Emulated extends ViewEncapsulation
  /* 0 */ val Emulated: typingsSlinky.angularCompiler.coreMod.ViewEncapsulation.Emulated with Double = js.native
  
  @js.native
  sealed trait None extends ViewEncapsulation
  /* 2 */ val None: typingsSlinky.angularCompiler.coreMod.ViewEncapsulation.None with Double = js.native
  
  @js.native
  sealed trait ShadowDom extends ViewEncapsulation
  /* 3 */ val ShadowDom: typingsSlinky.angularCompiler.coreMod.ViewEncapsulation.ShadowDom with Double = js.native
}
