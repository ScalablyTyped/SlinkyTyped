package typingsSlinky.reactReconciler

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  // react-reconciler/ReactFiberExpirationTime
  type ExpirationTime = scala.Double
  
  type FiberRoot = typingsSlinky.reactReconciler.mod.BaseFiberRootProperties with typingsSlinky.reactReconciler.mod.ProfilingOnlyFiberRootProperties
  
  // react-reconciler/ReactFiberReconciler
  type OpaqueHandle = typingsSlinky.reactReconciler.mod.Fiber
  
  type OpaqueRoot = typingsSlinky.reactReconciler.mod.FiberRoot
  
  type PendingInteractionMap = typingsSlinky.std.Map[
    typingsSlinky.reactReconciler.mod.ExpirationTime, 
    typingsSlinky.std.Set[typingsSlinky.reactReconciler.mod.Interaction]
  ]
  
  // shared/ReactTypes
  type ReactEmpty = js.UndefOr[scala.Null | scala.Boolean]
  
  type ReactNodeList = typingsSlinky.reactReconciler.mod.ReactEmpty | slinky.core.facade.ReactElement
  
  // shared/ReactSideEffectTags
  type SideEffectTag = scala.Double
  
  // react-reconciler/ReactTypeOfMode
  type TypeOfMode = scala.Double
}
