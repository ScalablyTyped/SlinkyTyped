package typingsSlinky.fridaGum.Java

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnumerateClassLoadersCallbacks extends StObject {
  
  /**
    * Called when all class loaders have been enumerated.
    */
  def onComplete(): Unit = js.native
  
  /**
    * Called with a `java.lang.ClassLoader` wrapper for each class loader
    * found in the VM.
    */
  def onMatch(loader: typingsSlinky.fridaGum.anon.Wrapper): Unit = js.native
}
object EnumerateClassLoadersCallbacks {
  
  @scala.inline
  def apply(onComplete: () => Unit, onMatch: typingsSlinky.fridaGum.anon.Wrapper => Unit): EnumerateClassLoadersCallbacks = {
    val __obj = js.Dynamic.literal(onComplete = js.Any.fromFunction0(onComplete), onMatch = js.Any.fromFunction1(onMatch))
    __obj.asInstanceOf[EnumerateClassLoadersCallbacks]
  }
  
  @scala.inline
  implicit class EnumerateClassLoadersCallbacksMutableBuilder[Self <: EnumerateClassLoadersCallbacks] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOnComplete(value: () => Unit): Self = StObject.set(x, "onComplete", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnMatch(value: typingsSlinky.fridaGum.anon.Wrapper => Unit): Self = StObject.set(x, "onMatch", js.Any.fromFunction1(value))
  }
}
