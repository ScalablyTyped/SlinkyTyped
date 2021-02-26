package typingsSlinky.reactReconciler

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  @scala.inline
  def apply[Type, Props, Container, Instance, TextInstance, HydratableInstance, PublicInstance, HostContext, UpdatePayload, ChildSet, TimeoutHandle, NoTimeout](
    // tslint:disable-next-line:no-unnecessary-generics
  config: typingsSlinky.reactReconciler.mod.HostConfig[
      Type, 
      Props, 
      Container, 
      Instance, 
      TextInstance, 
      HydratableInstance, 
      PublicInstance, 
      HostContext, 
      UpdatePayload, 
      ChildSet, 
      TimeoutHandle, 
      NoTimeout
    ]
  ): typingsSlinky.reactReconciler.mod.Reconciler[Instance, TextInstance, Container, PublicInstance] = typingsSlinky.reactReconciler.mod.^.asInstanceOf[js.Dynamic].apply(config.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.reactReconciler.mod.Reconciler[Instance, TextInstance, Container, PublicInstance]]
  
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
