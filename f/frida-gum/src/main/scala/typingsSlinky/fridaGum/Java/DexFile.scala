package typingsSlinky.fridaGum.Java

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DexFile extends StObject {
  
  /**
    * Determines available class names.
    */
  def getClassNames(): js.Array[String] = js.native
  
  /**
    * Loads the contained classes into the VM.
    */
  def load(): Unit = js.native
}
object DexFile {
  
  @scala.inline
  def apply(getClassNames: () => js.Array[String], load: () => Unit): DexFile = {
    val __obj = js.Dynamic.literal(getClassNames = js.Any.fromFunction0(getClassNames), load = js.Any.fromFunction0(load))
    __obj.asInstanceOf[DexFile]
  }
  
  @scala.inline
  implicit class DexFileMutableBuilder[Self <: DexFile] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetClassNames(value: () => js.Array[String]): Self = StObject.set(x, "getClassNames", js.Any.fromFunction0(value))
    
    @scala.inline
    def setLoad(value: () => Unit): Self = StObject.set(x, "load", js.Any.fromFunction0(value))
  }
}
