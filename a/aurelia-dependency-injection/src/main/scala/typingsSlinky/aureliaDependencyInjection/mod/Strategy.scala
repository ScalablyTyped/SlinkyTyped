package typingsSlinky.aureliaDependencyInjection.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait Strategy extends StObject
@JSImport("aurelia-dependency-injection", "Strategy")
@js.native
object Strategy extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Strategy with Double] = js.native
  
  @js.native
  sealed trait alias extends Strategy
  /* 5 */ val alias: typingsSlinky.aureliaDependencyInjection.mod.Strategy.alias with Double = js.native
  
  @js.native
  sealed trait array extends Strategy
  /* 4 */ val array: typingsSlinky.aureliaDependencyInjection.mod.Strategy.array with Double = js.native
  
  @js.native
  sealed trait function extends Strategy
  /* 3 */ val function: typingsSlinky.aureliaDependencyInjection.mod.Strategy.function with Double = js.native
  
  @js.native
  sealed trait instance extends Strategy
  /* 0 */ val instance: typingsSlinky.aureliaDependencyInjection.mod.Strategy.instance with Double = js.native
  
  @js.native
  sealed trait singleton extends Strategy
  /* 1 */ val singleton: typingsSlinky.aureliaDependencyInjection.mod.Strategy.singleton with Double = js.native
  
  @js.native
  sealed trait transient extends Strategy
  /* 2 */ val transient: typingsSlinky.aureliaDependencyInjection.mod.Strategy.transient with Double = js.native
}
