package typingsSlinky.reactNativeAnimatable.mod

import typingsSlinky.react.mod.ClassicComponentClass
import typingsSlinky.reactNative.mod.NativeMethods
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AnimatableComponent[P /* <: js.Object */, S /* <: js.Object */]
  extends ClassicComponentClass[AnimatableProperties[S] with P]
     with NativeMethods
     with AnimatableAnimationMethods {
  
  def stopAnimation(): Unit = js.native
  
  def transition[T /* <: S */](fromValues: T, toValues: T): Unit = js.native
  def transition[T /* <: S */](fromValues: T, toValues: T, duration: js.UndefOr[scala.Nothing], easing: Easing): Unit = js.native
  def transition[T /* <: S */](fromValues: T, toValues: T, duration: Double): Unit = js.native
  def transition[T /* <: S */](fromValues: T, toValues: T, duration: Double, easing: Easing): Unit = js.native
  
  def transitionTo[T /* <: S */](toValues: T): Unit = js.native
  def transitionTo[T /* <: S */](toValues: T, duration: js.UndefOr[scala.Nothing], easing: Easing): Unit = js.native
  def transitionTo[T /* <: S */](toValues: T, duration: Double): Unit = js.native
  def transitionTo[T /* <: S */](toValues: T, duration: Double, easing: Easing): Unit = js.native
}
