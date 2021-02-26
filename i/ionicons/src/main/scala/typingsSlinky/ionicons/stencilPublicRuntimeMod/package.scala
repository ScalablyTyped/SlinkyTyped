package typingsSlinky.ionicons

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object stencilPublicRuntimeMod {
  
  @scala.inline
  def Build: typingsSlinky.ionicons.stencilPublicRuntimeMod.UserBuildConditionals = typingsSlinky.ionicons.stencilPublicRuntimeMod.^.asInstanceOf[js.Dynamic].selectDynamic("Build").asInstanceOf[typingsSlinky.ionicons.stencilPublicRuntimeMod.UserBuildConditionals]
  
  @scala.inline
  def Component: typingsSlinky.ionicons.stencilPublicRuntimeMod.ComponentDecorator = typingsSlinky.ionicons.stencilPublicRuntimeMod.^.asInstanceOf[js.Dynamic].selectDynamic("Component").asInstanceOf[typingsSlinky.ionicons.stencilPublicRuntimeMod.ComponentDecorator]
  
  type ComponentDecorator = js.Function1[
    /* opts */ js.UndefOr[typingsSlinky.ionicons.stencilPublicRuntimeMod.ComponentOptions], 
    typingsSlinky.std.ClassDecorator
  ]
  
  type CustomMethodDecorator[T] = js.Function3[
    /* target */ js.Object, 
    /* propertyKey */ java.lang.String | js.Symbol, 
    /* descriptor */ typingsSlinky.std.TypedPropertyDescriptor[T], 
    typingsSlinky.std.TypedPropertyDescriptor[T] | scala.Unit
  ]
  
  @scala.inline
  def Element: typingsSlinky.ionicons.stencilPublicRuntimeMod.ElementDecorator = typingsSlinky.ionicons.stencilPublicRuntimeMod.^.asInstanceOf[js.Dynamic].selectDynamic("Element").asInstanceOf[typingsSlinky.ionicons.stencilPublicRuntimeMod.ElementDecorator]
  
  type ElementDecorator = js.Function0[typingsSlinky.std.PropertyDecorator]
  
  @scala.inline
  def Event: typingsSlinky.ionicons.stencilPublicRuntimeMod.EventDecorator = typingsSlinky.ionicons.stencilPublicRuntimeMod.^.asInstanceOf[js.Dynamic].selectDynamic("Event").asInstanceOf[typingsSlinky.ionicons.stencilPublicRuntimeMod.EventDecorator]
  
  type EventDecorator = js.Function1[
    /* opts */ js.UndefOr[typingsSlinky.ionicons.stencilPublicRuntimeMod.EventOptions], 
    typingsSlinky.std.PropertyDecorator
  ]
  
  type FunctionalComponent[T] = js.Function3[
    /* props */ T, 
    /* children */ js.Array[typingsSlinky.ionicons.stencilPublicRuntimeMod.VNode], 
    /* utils */ typingsSlinky.ionicons.stencilPublicRuntimeMod.FunctionalUtilities, 
    typingsSlinky.ionicons.stencilPublicRuntimeMod.VNode | js.Array[typingsSlinky.ionicons.stencilPublicRuntimeMod.VNode]
  ]
  
  @scala.inline
  def Host: typingsSlinky.ionicons.stencilPublicRuntimeMod.FunctionalComponent[typingsSlinky.ionicons.stencilPublicRuntimeMod.HostAttributes] = typingsSlinky.ionicons.stencilPublicRuntimeMod.^.asInstanceOf[js.Dynamic].selectDynamic("Host").asInstanceOf[typingsSlinky.ionicons.stencilPublicRuntimeMod.FunctionalComponent[typingsSlinky.ionicons.stencilPublicRuntimeMod.HostAttributes]]
  
  @scala.inline
  def Listen: typingsSlinky.ionicons.stencilPublicRuntimeMod.ListenDecorator = typingsSlinky.ionicons.stencilPublicRuntimeMod.^.asInstanceOf[js.Dynamic].selectDynamic("Listen").asInstanceOf[typingsSlinky.ionicons.stencilPublicRuntimeMod.ListenDecorator]
  
  type ListenDecorator = js.Function2[
    /* eventName */ java.lang.String, 
    /* opts */ js.UndefOr[typingsSlinky.ionicons.stencilPublicRuntimeMod.ListenOptions], 
    typingsSlinky.ionicons.stencilPublicRuntimeMod.CustomMethodDecorator[js.Any]
  ]
  
  @scala.inline
  def Method: typingsSlinky.ionicons.stencilPublicRuntimeMod.MethodDecorator = typingsSlinky.ionicons.stencilPublicRuntimeMod.^.asInstanceOf[js.Dynamic].selectDynamic("Method").asInstanceOf[typingsSlinky.ionicons.stencilPublicRuntimeMod.MethodDecorator]
  
  type MethodDecorator = js.Function1[
    /* opts */ js.UndefOr[typingsSlinky.ionicons.stencilPublicRuntimeMod.MethodOptions], 
    typingsSlinky.ionicons.stencilPublicRuntimeMod.CustomMethodDecorator[js.Any]
  ]
  
  type ModeStyles = org.scalablytyped.runtime.StringDictionary[java.lang.String | js.Array[java.lang.String]]
  
  @scala.inline
  def Prop: typingsSlinky.ionicons.stencilPublicRuntimeMod.PropDecorator = typingsSlinky.ionicons.stencilPublicRuntimeMod.^.asInstanceOf[js.Dynamic].selectDynamic("Prop").asInstanceOf[typingsSlinky.ionicons.stencilPublicRuntimeMod.PropDecorator]
  
  type PropDecorator = js.Function1[
    /* opts */ js.UndefOr[typingsSlinky.ionicons.stencilPublicRuntimeMod.PropOptions], 
    typingsSlinky.std.PropertyDecorator
  ]
  
  type RafCallback = js.Function1[/* timeStamp */ scala.Double, scala.Unit]
  
  type ResolutionHandler = js.Function1[
    /* elm */ org.scalajs.dom.raw.HTMLElement, 
    js.UndefOr[java.lang.String | scala.Null]
  ]
  
  @scala.inline
  def State: typingsSlinky.ionicons.stencilPublicRuntimeMod.StateDecorator = typingsSlinky.ionicons.stencilPublicRuntimeMod.^.asInstanceOf[js.Dynamic].selectDynamic("State").asInstanceOf[typingsSlinky.ionicons.stencilPublicRuntimeMod.StateDecorator]
  
  type StateDecorator = js.Function0[typingsSlinky.std.PropertyDecorator]
  
  @scala.inline
  def Watch: typingsSlinky.ionicons.stencilPublicRuntimeMod.WatchDecorator = typingsSlinky.ionicons.stencilPublicRuntimeMod.^.asInstanceOf[js.Dynamic].selectDynamic("Watch").asInstanceOf[typingsSlinky.ionicons.stencilPublicRuntimeMod.WatchDecorator]
  
  type WatchDecorator = js.Function1[
    /* propName */ java.lang.String, 
    typingsSlinky.ionicons.stencilPublicRuntimeMod.CustomMethodDecorator[js.Any]
  ]
  
  @scala.inline
  def forceUpdate(ref: js.Any): scala.Unit = typingsSlinky.ionicons.stencilPublicRuntimeMod.^.asInstanceOf[js.Dynamic].applyDynamic("forceUpdate")(ref.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  
  @scala.inline
  def getAssetPath(path: java.lang.String): java.lang.String = typingsSlinky.ionicons.stencilPublicRuntimeMod.^.asInstanceOf[js.Dynamic].applyDynamic("getAssetPath")(path.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
  
  @scala.inline
  def getElement(ref: js.Any): typingsSlinky.ionicons.stencilPublicRuntimeMod.HTMLStencilElement = typingsSlinky.ionicons.stencilPublicRuntimeMod.^.asInstanceOf[js.Dynamic].applyDynamic("getElement")(ref.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.ionicons.stencilPublicRuntimeMod.HTMLStencilElement]
  
  @scala.inline
  def getMode[T](ref: js.Any): T = typingsSlinky.ionicons.stencilPublicRuntimeMod.^.asInstanceOf[js.Dynamic].applyDynamic("getMode")(ref.asInstanceOf[js.Any]).asInstanceOf[T]
  
  @scala.inline
  def getRenderingRef(): js.Any = typingsSlinky.ionicons.stencilPublicRuntimeMod.^.asInstanceOf[js.Dynamic].applyDynamic("getRenderingRef")().asInstanceOf[js.Any]
  
  @scala.inline
  def readTask(task: typingsSlinky.ionicons.stencilPublicRuntimeMod.RafCallback): scala.Unit = typingsSlinky.ionicons.stencilPublicRuntimeMod.^.asInstanceOf[js.Dynamic].applyDynamic("readTask")(task.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  
  @scala.inline
  def setMode(handler: typingsSlinky.ionicons.stencilPublicRuntimeMod.ResolutionHandler): scala.Unit = typingsSlinky.ionicons.stencilPublicRuntimeMod.^.asInstanceOf[js.Dynamic].applyDynamic("setMode")(handler.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  
  @scala.inline
  def writeTask(task: typingsSlinky.ionicons.stencilPublicRuntimeMod.RafCallback): scala.Unit = typingsSlinky.ionicons.stencilPublicRuntimeMod.^.asInstanceOf[js.Dynamic].applyDynamic("writeTask")(task.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
}
