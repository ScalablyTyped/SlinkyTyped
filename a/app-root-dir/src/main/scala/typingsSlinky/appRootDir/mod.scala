package typingsSlinky.appRootDir

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("app-root-dir", JSImport.Namespace)
  @js.native
  val ^ : AppRootDir = js.native
  
  @js.native
  trait AppRootDir extends StObject {
    
    // Get the application's root directory
    def get(): String = js.native
    
    /**
      * Set the application's root directory
      *    this will set a global so that no matter
      *    how many instances of app-root-dir module are installed,
      *    they will all return the same directory
      */
    def set(dirname: String): Unit = js.native
  }
  object AppRootDir {
    
    @scala.inline
    def apply(get: () => String, set: String => Unit): AppRootDir = {
      val __obj = js.Dynamic.literal(get = js.Any.fromFunction0(get), set = js.Any.fromFunction1(set))
      __obj.asInstanceOf[AppRootDir]
    }
    
    @scala.inline
    implicit class AppRootDirMutableBuilder[Self <: AppRootDir] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGet(value: () => String): Self = StObject.set(x, "get", js.Any.fromFunction0(value))
      
      @scala.inline
      def setSet(value: String => Unit): Self = StObject.set(x, "set", js.Any.fromFunction1(value))
    }
  }
  
  type _To = AppRootDir
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: AppRootDir = ^
}
