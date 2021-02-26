package typingsSlinky.angularCompiler.compilerFacadeInterfaceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait R3FactoryTarget extends StObject
@JSImport("@angular/compiler/src/compiler_facade_interface", "R3FactoryTarget")
@js.native
object R3FactoryTarget extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[R3FactoryTarget with Double] = js.native
  
  @js.native
  sealed trait Component extends R3FactoryTarget
  /* 1 */ val Component: typingsSlinky.angularCompiler.compilerFacadeInterfaceMod.R3FactoryTarget.Component with Double = js.native
  
  @js.native
  sealed trait Directive extends R3FactoryTarget
  /* 0 */ val Directive: typingsSlinky.angularCompiler.compilerFacadeInterfaceMod.R3FactoryTarget.Directive with Double = js.native
  
  @js.native
  sealed trait Injectable extends R3FactoryTarget
  /* 2 */ val Injectable: typingsSlinky.angularCompiler.compilerFacadeInterfaceMod.R3FactoryTarget.Injectable with Double = js.native
  
  @js.native
  sealed trait NgModule extends R3FactoryTarget
  /* 4 */ val NgModule: typingsSlinky.angularCompiler.compilerFacadeInterfaceMod.R3FactoryTarget.NgModule with Double = js.native
  
  @js.native
  sealed trait Pipe extends R3FactoryTarget
  /* 3 */ val Pipe: typingsSlinky.angularCompiler.compilerFacadeInterfaceMod.R3FactoryTarget.Pipe with Double = js.native
}
