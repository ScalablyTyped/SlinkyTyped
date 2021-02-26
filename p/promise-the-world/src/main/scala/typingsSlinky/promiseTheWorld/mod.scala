package typingsSlinky.promiseTheWorld

import typingsSlinky.promiseTheWorld.anon.FnCall
import typingsSlinky.promiseTheWorld.deferMod.Deferred
import typingsSlinky.promiseTheWorld.mutexMod.Mutex
import typingsSlinky.promiseTheWorld.queueMod.Queue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("promise-the-world", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("promise-the-world", "defer")
  @js.native
  def defer[T](): Deferred[T] = js.native
  @JSImport("promise-the-world", "defer")
  @js.native
  def defer_Fmod: FnCall = js.native
  
  @scala.inline
  def defer_Fmod_=(x: FnCall): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defer")(x.asInstanceOf[js.Any])
  
  @JSImport("promise-the-world", "delay")
  @js.native
  def delay: js.Function1[/* ms */ Double, js.Promise[Unit]] = js.native
  @JSImport("promise-the-world", "delay")
  @js.native
  def delay(ms: Double): js.Promise[Unit] = js.native
  @scala.inline
  def delay_=(x: js.Function1[/* ms */ Double, js.Promise[Unit]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("delay")(x.asInstanceOf[js.Any])
  
  @JSImport("promise-the-world", "mutex")
  @js.native
  def mutex(): Mutex = js.native
  @JSImport("promise-the-world", "mutex")
  @js.native
  def mutex_Fmod: js.Function0[Mutex] = js.native
  
  @scala.inline
  def mutex_Fmod_=(x: js.Function0[Mutex]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("mutex")(x.asInstanceOf[js.Any])
  
  @JSImport("promise-the-world", "queue")
  @js.native
  def queue(): Queue = js.native
  @JSImport("promise-the-world", "queue")
  @js.native
  def queue(maxPending: js.UndefOr[scala.Nothing], maxQueued: Double): Queue = js.native
  @JSImport("promise-the-world", "queue")
  @js.native
  def queue(maxPending: Double): Queue = js.native
  @JSImport("promise-the-world", "queue")
  @js.native
  def queue(maxPending: Double, maxQueued: Double): Queue = js.native
  @JSImport("promise-the-world", "queue")
  @js.native
  def queue_Fmod: js.Function2[/* maxPending */ js.UndefOr[Double], /* maxQueued */ js.UndefOr[Double], Queue] = js.native
  
  @scala.inline
  def queue_Fmod_=(x: js.Function2[/* maxPending */ js.UndefOr[Double], /* maxQueued */ js.UndefOr[Double], Queue]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("queue")(x.asInstanceOf[js.Any])
}
