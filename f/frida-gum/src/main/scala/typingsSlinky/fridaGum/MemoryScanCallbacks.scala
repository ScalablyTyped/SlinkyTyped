package typingsSlinky.fridaGum

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MemoryScanCallbacks extends StObject {
  
  /**
    * Called when the memory range has been fully scanned.
    */
  def onComplete(): Unit = js.native
  
  /**
    * Called when there was a memory access error while scanning.
    *
    * @param reason Why the memory access failed.
    */
  var onError: js.UndefOr[js.Function1[/* reason */ String, Unit]] = js.native
  
  /**
    * Called with each occurence that was found.
    *
    * @param address Memory address where a match was found.
    * @param size Size of this match.
    */
  def onMatch(address: NativePointer, size: Double): Unit | EnumerateAction = js.native
}
object MemoryScanCallbacks {
  
  @scala.inline
  def apply(onComplete: () => Unit, onMatch: (NativePointer, Double) => Unit | EnumerateAction): MemoryScanCallbacks = {
    val __obj = js.Dynamic.literal(onComplete = js.Any.fromFunction0(onComplete), onMatch = js.Any.fromFunction2(onMatch))
    __obj.asInstanceOf[MemoryScanCallbacks]
  }
  
  @scala.inline
  implicit class MemoryScanCallbacksMutableBuilder[Self <: MemoryScanCallbacks] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOnComplete(value: () => Unit): Self = StObject.set(x, "onComplete", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnError(value: /* reason */ String => Unit): Self = StObject.set(x, "onError", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
    
    @scala.inline
    def setOnMatch(value: (NativePointer, Double) => Unit | EnumerateAction): Self = StObject.set(x, "onMatch", js.Any.fromFunction2(value))
  }
}
