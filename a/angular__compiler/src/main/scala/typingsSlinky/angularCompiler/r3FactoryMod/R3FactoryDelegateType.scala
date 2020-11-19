package typingsSlinky.angularCompiler.r3FactoryMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait R3FactoryDelegateType extends js.Object
@JSImport("@angular/compiler/src/render3/r3_factory", "R3FactoryDelegateType")
@js.native
object R3FactoryDelegateType extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[R3FactoryDelegateType with Double] = js.native
  
  @js.native
  sealed trait Class extends R3FactoryDelegateType
  /* 0 */ @js.native
  object Class extends TopLevel[Class with Double]
  
  @js.native
  sealed trait Factory extends R3FactoryDelegateType
  /* 2 */ @js.native
  object Factory extends TopLevel[Factory with Double]
  
  @js.native
  sealed trait Function extends R3FactoryDelegateType
  /* 1 */ @js.native
  object Function extends TopLevel[Function with Double]
}
