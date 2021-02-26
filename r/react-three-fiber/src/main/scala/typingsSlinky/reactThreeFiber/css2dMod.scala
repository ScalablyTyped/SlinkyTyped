package typingsSlinky.reactThreeFiber

import org.scalablytyped.runtime.Instantiable0
import org.scalajs.dom.raw.ProgressEvent
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import typingsSlinky.react.mod.Context
import typingsSlinky.react.mod.MutableRefObject
import typingsSlinky.reactReconciler.mod.Reconciler
import typingsSlinky.reactThreeFiber.anon.Children
import typingsSlinky.reactThreeFiber.canvasMod.CanvasContext
import typingsSlinky.reactThreeFiber.canvasMod.DomEventHandlers
import typingsSlinky.reactThreeFiber.canvasMod.RenderCallback
import typingsSlinky.reactThreeFiber.canvasMod.SharedCanvasContext
import typingsSlinky.reactThreeFiber.canvasMod.UseCanvasProps
import typingsSlinky.reactThreeFiber.hooksMod.Extensions
import typingsSlinky.reactThreeFiber.hooksMod.LoaderResult
import typingsSlinky.reactThreeFiber.hooksMod.ObjectMap
import typingsSlinky.reactThreeFiber.rendererMod.GlobalRenderCallback
import typingsSlinky.reactThreeFiber.resizeContainerMod.ContainerProps
import typingsSlinky.reactThreeFiber.resizeContainerMod.ResizeContainerProps
import typingsSlinky.three.mod.Camera
import typingsSlinky.three.mod.Object3D
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object css2dMod {
  
  @JSImport("react-three-fiber/targets/css2d", "Canvas")
  @js.native
  val Canvas: ReactComponentClass[js.Function1[/* hasChildrenProps */ ContainerProps, ReactElement]] = js.native
  
  @JSImport("react-three-fiber/targets/css2d", "Renderer")
  @js.native
  val Renderer: Reconciler[js.Any, js.Any, js.Any, js.Any] = js.native
  
  @JSImport("react-three-fiber/targets/css2d", "ResizeContainer")
  @js.native
  val ResizeContainer: ReactComponentClass[ResizeContainerProps] = js.native
  
  @JSImport("react-three-fiber/targets/css2d", "addAfterEffect")
  @js.native
  def addAfterEffect(callback: GlobalRenderCallback): js.Function0[Unit] = js.native
  
  @JSImport("react-three-fiber/targets/css2d", "addEffect")
  @js.native
  def addEffect(callback: GlobalRenderCallback): js.Function0[Unit] = js.native
  
  @JSImport("react-three-fiber/targets/css2d", "addTail")
  @js.native
  def addTail(callback: GlobalRenderCallback): js.Function0[Unit] = js.native
  
  @JSImport("react-three-fiber/targets/css2d", "applyProps")
  @js.native
  def applyProps(instance: js.Any, newProps: js.Any): Unit = js.native
  @JSImport("react-three-fiber/targets/css2d", "applyProps")
  @js.native
  def applyProps(instance: js.Any, newProps: js.Any, oldProps: js.UndefOr[scala.Nothing], accumulative: Boolean): Unit = js.native
  @JSImport("react-three-fiber/targets/css2d", "applyProps")
  @js.native
  def applyProps(instance: js.Any, newProps: js.Any, oldProps: js.Any): Unit = js.native
  @JSImport("react-three-fiber/targets/css2d", "applyProps")
  @js.native
  def applyProps(instance: js.Any, newProps: js.Any, oldProps: js.Any, accumulative: Boolean): Unit = js.native
  
  @JSImport("react-three-fiber/targets/css2d", "createPortal")
  @js.native
  def createPortal(children: ReactElement, containerInfo: js.Any): Children = js.native
  @JSImport("react-three-fiber/targets/css2d", "createPortal")
  @js.native
  def createPortal(
    children: ReactElement,
    containerInfo: js.Any,
    implementation: js.UndefOr[scala.Nothing],
    key: js.Any
  ): Children = js.native
  @JSImport("react-three-fiber/targets/css2d", "createPortal")
  @js.native
  def createPortal(children: ReactElement, containerInfo: js.Any, implementation: js.Any): Children = js.native
  @JSImport("react-three-fiber/targets/css2d", "createPortal")
  @js.native
  def createPortal(children: ReactElement, containerInfo: js.Any, implementation: js.Any, key: js.Any): Children = js.native
  
  @JSImport("react-three-fiber/targets/css2d", "extend")
  @js.native
  def extend(objects: js.Object): Unit = js.native
  
  @JSImport("react-three-fiber/targets/css2d", "forceResize")
  @js.native
  def forceResize(): Unit = js.native
  
  @JSImport("react-three-fiber/targets/css2d", "invalidate")
  @js.native
  def invalidate(): Unit = js.native
  @JSImport("react-three-fiber/targets/css2d", "invalidate")
  @js.native
  def invalidate(state: js.UndefOr[scala.Nothing], frames: Double): Unit = js.native
  @JSImport("react-three-fiber/targets/css2d", "invalidate")
  @js.native
  def invalidate(state: Boolean): Unit = js.native
  @JSImport("react-three-fiber/targets/css2d", "invalidate")
  @js.native
  def invalidate(state: Boolean, frames: Double): Unit = js.native
  @JSImport("react-three-fiber/targets/css2d", "invalidate")
  @js.native
  def invalidate(state: MutableRefObject[CanvasContext]): Unit = js.native
  @JSImport("react-three-fiber/targets/css2d", "invalidate")
  @js.native
  def invalidate(state: MutableRefObject[CanvasContext], frames: Double): Unit = js.native
  
  @JSImport("react-three-fiber/targets/css2d", "isOrthographicCamera")
  @js.native
  def isOrthographicCamera(`def`: Camera): /* is three.three.OrthographicCamera */ Boolean = js.native
  
  @JSImport("react-three-fiber/targets/css2d", "render")
  @js.native
  def render(element: ReactElement, container: Object3D): js.Any = js.native
  @JSImport("react-three-fiber/targets/css2d", "render")
  @js.native
  def render(element: ReactElement, container: Object3D, state: MutableRefObject[CanvasContext]): js.Any = js.native
  
  @JSImport("react-three-fiber/targets/css2d", "renderGl")
  @js.native
  def renderGl(state: MutableRefObject[CanvasContext], timestamp: Double): Double = js.native
  @JSImport("react-three-fiber/targets/css2d", "renderGl")
  @js.native
  def renderGl(
    state: MutableRefObject[CanvasContext],
    timestamp: Double,
    repeat: js.UndefOr[scala.Nothing],
    runGlobalEffects: Boolean
  ): Double = js.native
  @JSImport("react-three-fiber/targets/css2d", "renderGl")
  @js.native
  def renderGl(state: MutableRefObject[CanvasContext], timestamp: Double, repeat: Double): Double = js.native
  @JSImport("react-three-fiber/targets/css2d", "renderGl")
  @js.native
  def renderGl(
    state: MutableRefObject[CanvasContext],
    timestamp: Double,
    repeat: Double,
    runGlobalEffects: Boolean
  ): Double = js.native
  
  @JSImport("react-three-fiber/targets/css2d", "stateContext")
  @js.native
  val stateContext: Context[SharedCanvasContext] = js.native
  
  @JSImport("react-three-fiber/targets/css2d", "unmountComponentAtNode")
  @js.native
  def unmountComponentAtNode(container: Object3D): Unit = js.native
  @JSImport("react-three-fiber/targets/css2d", "unmountComponentAtNode")
  @js.native
  def unmountComponentAtNode(container: Object3D, callback: js.Function1[/* c */ Object3D, Unit]): Unit = js.native
  
  @JSImport("react-three-fiber/targets/css2d", "useCanvas")
  @js.native
  def useCanvas(props: UseCanvasProps): DomEventHandlers = js.native
  
  @JSImport("react-three-fiber/targets/css2d", "useFrame")
  @js.native
  def useFrame(callback: RenderCallback): Null = js.native
  @JSImport("react-three-fiber/targets/css2d", "useFrame")
  @js.native
  def useFrame(callback: RenderCallback, renderPriority: Double): Null = js.native
  
  @JSImport("react-three-fiber/targets/css2d", "useGraph")
  @js.native
  def useGraph(`object`: Object3D): ObjectMap = js.native
  
  object useLoader {
    
    @JSImport("react-three-fiber/targets/css2d", "useLoader")
    @js.native
    def apply[T](Proto: Instantiable0[LoaderResult[T]], input: String | js.Array[String]): T = js.native
    @JSImport("react-three-fiber/targets/css2d", "useLoader")
    @js.native
    def apply[T](
      Proto: Instantiable0[LoaderResult[T]],
      input: String | js.Array[String],
      extensions: js.UndefOr[scala.Nothing],
      onProgress: js.Function1[/* event */ ProgressEvent, Unit]
    ): T = js.native
    @JSImport("react-three-fiber/targets/css2d", "useLoader")
    @js.native
    def apply[T](Proto: Instantiable0[LoaderResult[T]], input: String | js.Array[String], extensions: Extensions): T = js.native
    @JSImport("react-three-fiber/targets/css2d", "useLoader")
    @js.native
    def apply[T](
      Proto: Instantiable0[LoaderResult[T]],
      input: String | js.Array[String],
      extensions: Extensions,
      onProgress: js.Function1[/* event */ ProgressEvent, Unit]
    ): T = js.native
    @JSImport("react-three-fiber/targets/css2d", "useLoader")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-three-fiber/targets/css2d", "useLoader.preload")
    @js.native
    def preload: js.Function3[
        /* Proto */ Instantiable0[LoaderResult[js.Any]], 
        /* url */ String | js.Array[String], 
        /* extensions */ js.UndefOr[Extensions], 
        js.UndefOr[scala.Nothing]
      ] = js.native
    @scala.inline
    def preload_=(
      x: js.Function3[
          /* Proto */ Instantiable0[LoaderResult[js.Any]], 
          /* url */ String | js.Array[String], 
          /* extensions */ js.UndefOr[Extensions], 
          js.UndefOr[scala.Nothing]
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("preload")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("react-three-fiber/targets/css2d", "useResource")
  @js.native
  def useResource[T](): MutableRefObject[T] = js.native
  @JSImport("react-three-fiber/targets/css2d", "useResource")
  @js.native
  def useResource[T](optionalRef: MutableRefObject[T]): MutableRefObject[T] = js.native
  
  @JSImport("react-three-fiber/targets/css2d", "useThree")
  @js.native
  def useThree(): SharedCanvasContext = js.native
  
  @JSImport("react-three-fiber/targets/css2d", "useUpdate")
  @js.native
  def useUpdate[T](callback: js.Function1[/* props */ T, Unit], dependents: js.Array[_]): MutableRefObject[js.UndefOr[T]] = js.native
  @JSImport("react-three-fiber/targets/css2d", "useUpdate")
  @js.native
  def useUpdate[T](
    callback: js.Function1[/* props */ T, Unit],
    dependents: js.Array[_],
    optionalRef: MutableRefObject[T]
  ): MutableRefObject[js.UndefOr[T]] = js.native
}
