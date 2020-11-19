package typingsSlinky.ionicReact

import slinky.core.ReactComponentClass
import typingsSlinky.ionicReact.anon.Instantiable
import typingsSlinky.ionicReact.ionLifeCycleContextMod.LifeCycleCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@ionic/react/dist/types/lifecycle", JSImport.Namespace)
@js.native
object lifecycleMod extends js.Object {
  
  def useIonViewDidEnter(callback: LifeCycleCallback): Unit = js.native
  def useIonViewDidEnter(callback: LifeCycleCallback, deps: js.Array[_]): Unit = js.native
  
  def useIonViewDidLeave(callback: LifeCycleCallback): Unit = js.native
  def useIonViewDidLeave(callback: LifeCycleCallback, deps: js.Array[_]): Unit = js.native
  
  def useIonViewWillEnter(callback: LifeCycleCallback): Unit = js.native
  def useIonViewWillEnter(callback: LifeCycleCallback, deps: js.Array[_]): Unit = js.native
  
  def useIonViewWillLeave(callback: LifeCycleCallback): Unit = js.native
  def useIonViewWillLeave(callback: LifeCycleCallback, deps: js.Array[_]): Unit = js.native
  
  def withIonLifeCycle(WrappedComponent: ReactComponentClass[_]): Instantiable = js.native
}
