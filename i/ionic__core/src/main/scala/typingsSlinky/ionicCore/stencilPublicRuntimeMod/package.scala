package typingsSlinky.ionicCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object stencilPublicRuntimeMod {
  
  @scala.inline
  def Build: typingsSlinky.ionicCore.stencilPublicRuntimeMod.UserBuildConditionals = typingsSlinky.ionicCore.stencilPublicRuntimeMod.^.asInstanceOf[js.Dynamic].selectDynamic("Build").asInstanceOf[typingsSlinky.ionicCore.stencilPublicRuntimeMod.UserBuildConditionals]
  
  @scala.inline
  def Component: typingsSlinky.ionicCore.stencilPublicRuntimeMod.ComponentDecorator = typingsSlinky.ionicCore.stencilPublicRuntimeMod.^.asInstanceOf[js.Dynamic].selectDynamic("Component").asInstanceOf[typingsSlinky.ionicCore.stencilPublicRuntimeMod.ComponentDecorator]
  
  type ComponentDecorator = js.Function1[
    /* opts */ js.UndefOr[typingsSlinky.ionicCore.stencilPublicRuntimeMod.ComponentOptions], 
    typingsSlinky.std.ClassDecorator
  ]
  
  type CustomMethodDecorator[T] = js.Function3[
    /* target */ js.Object, 
    /* propertyKey */ java.lang.String | js.Symbol, 
    /* descriptor */ typingsSlinky.std.TypedPropertyDescriptor[T], 
    typingsSlinky.std.TypedPropertyDescriptor[T] | scala.Unit
  ]
  
  @scala.inline
  def Element: typingsSlinky.ionicCore.stencilPublicRuntimeMod.ElementDecorator = typingsSlinky.ionicCore.stencilPublicRuntimeMod.^.asInstanceOf[js.Dynamic].selectDynamic("Element").asInstanceOf[typingsSlinky.ionicCore.stencilPublicRuntimeMod.ElementDecorator]
  
  type ElementDecorator = js.Function0[typingsSlinky.std.PropertyDecorator]
  
  type ErrorHandler = js.Function2[
    /* err */ js.Any, 
    /* element */ js.UndefOr[org.scalajs.dom.raw.HTMLElement], 
    scala.Unit
  ]
  
  @scala.inline
  def Event: typingsSlinky.ionicCore.stencilPublicRuntimeMod.EventDecorator = typingsSlinky.ionicCore.stencilPublicRuntimeMod.^.asInstanceOf[js.Dynamic].selectDynamic("Event").asInstanceOf[typingsSlinky.ionicCore.stencilPublicRuntimeMod.EventDecorator]
  
  type EventDecorator = js.Function1[
    /* opts */ js.UndefOr[typingsSlinky.ionicCore.stencilPublicRuntimeMod.EventOptions], 
    typingsSlinky.std.PropertyDecorator
  ]
  
  @scala.inline
  def Fragment: typingsSlinky.ionicCore.stencilPublicRuntimeMod.FunctionalComponent[js.Object] = typingsSlinky.ionicCore.stencilPublicRuntimeMod.^.asInstanceOf[js.Dynamic].selectDynamic("Fragment").asInstanceOf[typingsSlinky.ionicCore.stencilPublicRuntimeMod.FunctionalComponent[js.Object]]
  
  type FunctionalComponent[T] = js.Function3[
    /* props */ T, 
    /* children */ js.Array[typingsSlinky.ionicCore.stencilPublicRuntimeMod.VNode], 
    /* utils */ typingsSlinky.ionicCore.stencilPublicRuntimeMod.FunctionalUtilities, 
    typingsSlinky.ionicCore.stencilPublicRuntimeMod.VNode | js.Array[typingsSlinky.ionicCore.stencilPublicRuntimeMod.VNode]
  ]
  
  @scala.inline
  def Host: typingsSlinky.ionicCore.stencilPublicRuntimeMod.FunctionalComponent[typingsSlinky.ionicCore.stencilPublicRuntimeMod.HostAttributes] = typingsSlinky.ionicCore.stencilPublicRuntimeMod.^.asInstanceOf[js.Dynamic].selectDynamic("Host").asInstanceOf[typingsSlinky.ionicCore.stencilPublicRuntimeMod.FunctionalComponent[typingsSlinky.ionicCore.stencilPublicRuntimeMod.HostAttributes]]
  
  @scala.inline
  def Listen: typingsSlinky.ionicCore.stencilPublicRuntimeMod.ListenDecorator = typingsSlinky.ionicCore.stencilPublicRuntimeMod.^.asInstanceOf[js.Dynamic].selectDynamic("Listen").asInstanceOf[typingsSlinky.ionicCore.stencilPublicRuntimeMod.ListenDecorator]
  
  type ListenDecorator = js.Function2[
    /* eventName */ java.lang.String, 
    /* opts */ js.UndefOr[typingsSlinky.ionicCore.stencilPublicRuntimeMod.ListenOptions], 
    typingsSlinky.ionicCore.stencilPublicRuntimeMod.CustomMethodDecorator[js.Any]
  ]
  
  @scala.inline
  def Method: typingsSlinky.ionicCore.stencilPublicRuntimeMod.MethodDecorator = typingsSlinky.ionicCore.stencilPublicRuntimeMod.^.asInstanceOf[js.Dynamic].selectDynamic("Method").asInstanceOf[typingsSlinky.ionicCore.stencilPublicRuntimeMod.MethodDecorator]
  
  type MethodDecorator = js.Function1[
    /* opts */ js.UndefOr[typingsSlinky.ionicCore.stencilPublicRuntimeMod.MethodOptions], 
    typingsSlinky.ionicCore.stencilPublicRuntimeMod.CustomMethodDecorator[js.Any]
  ]
  
  type ModeStyles = org.scalablytyped.runtime.StringDictionary[java.lang.String | js.Array[java.lang.String]]
  
  @scala.inline
  def Prop: typingsSlinky.ionicCore.stencilPublicRuntimeMod.PropDecorator = typingsSlinky.ionicCore.stencilPublicRuntimeMod.^.asInstanceOf[js.Dynamic].selectDynamic("Prop").asInstanceOf[typingsSlinky.ionicCore.stencilPublicRuntimeMod.PropDecorator]
  
  type PropDecorator = js.Function1[
    /* opts */ js.UndefOr[typingsSlinky.ionicCore.stencilPublicRuntimeMod.PropOptions], 
    typingsSlinky.std.PropertyDecorator
  ]
  
  type RafCallback = js.Function1[/* timeStamp */ scala.Double, scala.Unit]
  
  type ResolutionHandler = js.Function1[
    /* elm */ org.scalajs.dom.raw.HTMLElement, 
    js.UndefOr[java.lang.String | scala.Null]
  ]
  
  @scala.inline
  def State: typingsSlinky.ionicCore.stencilPublicRuntimeMod.StateDecorator = typingsSlinky.ionicCore.stencilPublicRuntimeMod.^.asInstanceOf[js.Dynamic].selectDynamic("State").asInstanceOf[typingsSlinky.ionicCore.stencilPublicRuntimeMod.StateDecorator]
  
  type StateDecorator = js.Function0[typingsSlinky.std.PropertyDecorator]
  
  @scala.inline
  def Watch: typingsSlinky.ionicCore.stencilPublicRuntimeMod.WatchDecorator = typingsSlinky.ionicCore.stencilPublicRuntimeMod.^.asInstanceOf[js.Dynamic].selectDynamic("Watch").asInstanceOf[typingsSlinky.ionicCore.stencilPublicRuntimeMod.WatchDecorator]
  
  type WatchDecorator = js.Function1[
    /* propName */ java.lang.String, 
    typingsSlinky.ionicCore.stencilPublicRuntimeMod.CustomMethodDecorator[js.Any]
  ]
  
  @scala.inline
  def forceUpdate(ref: js.Any): scala.Unit = typingsSlinky.ionicCore.stencilPublicRuntimeMod.^.asInstanceOf[js.Dynamic].applyDynamic("forceUpdate")(ref.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  
  @scala.inline
  def getAssetPath(path: java.lang.String): java.lang.String = typingsSlinky.ionicCore.stencilPublicRuntimeMod.^.asInstanceOf[js.Dynamic].applyDynamic("getAssetPath")(path.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
  
  @scala.inline
  def getElement(ref: js.Any): typingsSlinky.ionicCore.stencilPublicRuntimeMod.HTMLStencilElement = typingsSlinky.ionicCore.stencilPublicRuntimeMod.^.asInstanceOf[js.Dynamic].applyDynamic("getElement")(ref.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.ionicCore.stencilPublicRuntimeMod.HTMLStencilElement]
  
  @scala.inline
  def getMode[T](ref: js.Any): T = typingsSlinky.ionicCore.stencilPublicRuntimeMod.^.asInstanceOf[js.Dynamic].applyDynamic("getMode")(ref.asInstanceOf[js.Any]).asInstanceOf[T]
  
  @scala.inline
  def getRenderingRef(): js.Any = typingsSlinky.ionicCore.stencilPublicRuntimeMod.^.asInstanceOf[js.Dynamic].applyDynamic("getRenderingRef")().asInstanceOf[js.Any]
  
  @scala.inline
  def readTask(task: typingsSlinky.ionicCore.stencilPublicRuntimeMod.RafCallback): scala.Unit = typingsSlinky.ionicCore.stencilPublicRuntimeMod.^.asInstanceOf[js.Dynamic].applyDynamic("readTask")(task.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  
  @scala.inline
  def setAssetPath(path: java.lang.String): java.lang.String = typingsSlinky.ionicCore.stencilPublicRuntimeMod.^.asInstanceOf[js.Dynamic].applyDynamic("setAssetPath")(path.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
  
  @scala.inline
  def setErrorHandler(handler: typingsSlinky.ionicCore.stencilPublicRuntimeMod.ErrorHandler): scala.Unit = typingsSlinky.ionicCore.stencilPublicRuntimeMod.^.asInstanceOf[js.Dynamic].applyDynamic("setErrorHandler")(handler.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  
  @scala.inline
  def setMode(handler: typingsSlinky.ionicCore.stencilPublicRuntimeMod.ResolutionHandler): scala.Unit = typingsSlinky.ionicCore.stencilPublicRuntimeMod.^.asInstanceOf[js.Dynamic].applyDynamic("setMode")(handler.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  
  @scala.inline
  def writeTask(task: typingsSlinky.ionicCore.stencilPublicRuntimeMod.RafCallback): scala.Unit = typingsSlinky.ionicCore.stencilPublicRuntimeMod.^.asInstanceOf[js.Dynamic].applyDynamic("writeTask")(task.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
}
