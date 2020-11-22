package typingsSlinky.restartHooks

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object useCustomEffectMod {
  
  type EffectHook = js.Function2[
    /* effect */ typingsSlinky.react.mod.EffectCallback, 
    /* deps */ js.UndefOr[typingsSlinky.react.mod.DependencyList], 
    scala.Unit
  ]
  
  type IsEqual[TDeps /* <: typingsSlinky.react.mod.DependencyList */] = js.Function2[/* nextDeps */ TDeps, /* prevDeps */ TDeps, scala.Boolean]
}
