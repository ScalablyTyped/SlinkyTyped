package typingsSlinky.reactThreeFiber

import org.scalablytyped.runtime.StringDictionary
import slinky.core.facade.ReactElement
import typingsSlinky.react.mod.MutableRefObject
import typingsSlinky.reactReconciler.mod.Reconciler
import typingsSlinky.reactThreeFiber.anon.Children
import typingsSlinky.reactThreeFiber.canvasMod.CanvasContext
import typingsSlinky.three.mod.Object3D
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-three-fiber/renderer", JSImport.Namespace)
@js.native
object rendererMod extends js.Object {
  
  val Renderer: Reconciler[js.Any, js.Any, js.Any, js.Any] = js.native
  
  def addAfterEffect(callback: GlobalRenderCallback): js.Function0[Unit] = js.native
  
  def addEffect(callback: GlobalRenderCallback): js.Function0[Unit] = js.native
  
  def addTail(callback: GlobalRenderCallback): js.Function0[Unit] = js.native
  
  def applyProps(instance: js.Any, newProps: js.Any): Unit = js.native
  def applyProps(instance: js.Any, newProps: js.Any, oldProps: js.UndefOr[scala.Nothing], accumulative: Boolean): Unit = js.native
  def applyProps(instance: js.Any, newProps: js.Any, oldProps: js.Any): Unit = js.native
  def applyProps(instance: js.Any, newProps: js.Any, oldProps: js.Any, accumulative: Boolean): Unit = js.native
  
  def createPortal(children: ReactElement, containerInfo: js.Any): Children = js.native
  def createPortal(
    children: ReactElement,
    containerInfo: js.Any,
    implementation: js.UndefOr[scala.Nothing],
    key: js.Any
  ): Children = js.native
  def createPortal(children: ReactElement, containerInfo: js.Any, implementation: js.Any): Children = js.native
  def createPortal(children: ReactElement, containerInfo: js.Any, implementation: js.Any, key: js.Any): Children = js.native
  
  def extend(objects: js.Object): Unit = js.native
  
  def forceResize(): Unit = js.native
  
  def invalidate(): Unit = js.native
  def invalidate(state: js.UndefOr[scala.Nothing], frames: Double): Unit = js.native
  def invalidate(state: Boolean): Unit = js.native
  def invalidate(state: Boolean, frames: Double): Unit = js.native
  def invalidate(state: MutableRefObject[CanvasContext]): Unit = js.native
  def invalidate(state: MutableRefObject[CanvasContext], frames: Double): Unit = js.native
  
  def render(element: ReactElement, container: Object3D): js.Any = js.native
  def render(element: ReactElement, container: Object3D, state: MutableRefObject[CanvasContext]): js.Any = js.native
  
  def renderGl(state: MutableRefObject[CanvasContext], timestamp: Double): Double = js.native
  def renderGl(
    state: MutableRefObject[CanvasContext],
    timestamp: Double,
    repeat: js.UndefOr[scala.Nothing],
    runGlobalEffects: Boolean
  ): Double = js.native
  def renderGl(state: MutableRefObject[CanvasContext], timestamp: Double, repeat: Double): Double = js.native
  def renderGl(
    state: MutableRefObject[CanvasContext],
    timestamp: Double,
    repeat: Double,
    runGlobalEffects: Boolean
  ): Double = js.native
  
  def unmountComponentAtNode(container: Object3D): Unit = js.native
  def unmountComponentAtNode(container: Object3D, callback: js.Function1[/* c */ Object3D, Unit]): Unit = js.native
  
  type GlobalRenderCallback = js.Function1[/* timeStamp */ Double, Boolean]
  
  type ObjectHash = StringDictionary[js.Object]
}
