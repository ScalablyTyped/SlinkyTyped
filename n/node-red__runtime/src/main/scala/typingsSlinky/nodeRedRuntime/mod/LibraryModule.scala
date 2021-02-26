package typingsSlinky.nodeRedRuntime.mod

import typingsSlinky.nodeRedRuntime.anon.Body
import typingsSlinky.nodeRedRuntime.anon.Library
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LibraryModule extends StObject {
  
  /**
    * Gets an entry from the library.
    * @param opts
    * @param opts.library - the library
    * @param opts.type - the type of entry
    * @param opts.path - the path of the entry
    * @param opts.req - the request to log (optional)
    */
  def getEntry(opts: Library): js.Promise[String | js.Object] = js.native
  
  /**
    * Saves an entry to the library
    * @param opts
    * @param opts.library - the library
    * @param opts.type - the type of entry
    * @param opts.path - the path of the entry
    * @param opts.meta - any meta data associated with the entry
    * @param opts.body - the body of the entry
    * @param opts.req - the request to log (optional)
    */
  def saveEntry(opts: Body): js.Promise[Unit] = js.native
}
object LibraryModule {
  
  @scala.inline
  def apply(getEntry: Library => js.Promise[String | js.Object], saveEntry: Body => js.Promise[Unit]): LibraryModule = {
    val __obj = js.Dynamic.literal(getEntry = js.Any.fromFunction1(getEntry), saveEntry = js.Any.fromFunction1(saveEntry))
    __obj.asInstanceOf[LibraryModule]
  }
  
  @scala.inline
  implicit class LibraryModuleMutableBuilder[Self <: LibraryModule] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetEntry(value: Library => js.Promise[String | js.Object]): Self = StObject.set(x, "getEntry", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSaveEntry(value: Body => js.Promise[Unit]): Self = StObject.set(x, "saveEntry", js.Any.fromFunction1(value))
  }
}
