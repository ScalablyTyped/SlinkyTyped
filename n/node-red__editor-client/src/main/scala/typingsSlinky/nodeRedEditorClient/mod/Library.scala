package typingsSlinky.nodeRedEditorClient.mod

import typingsSlinky.nodeRedEditorClient.anon.Container
import typingsSlinky.nodeRedEditorClient.anon.Data
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Library extends StObject {
  
  def create(options: typingsSlinky.nodeRedEditorClient.anon.Editor): Unit = js.native
  
  def createBrowser(options: Container): Data = js.native
  
  def init(): Unit = js.native
  
  def loadLibraryFolder(
    library: String,
    `type`: String,
    root: String,
    done: js.Function1[/* items */ js.Array[js.Object], Unit]
  ): Unit = js.native
}
object Library {
  
  @scala.inline
  def apply(
    create: typingsSlinky.nodeRedEditorClient.anon.Editor => Unit,
    createBrowser: Container => Data,
    init: () => Unit,
    loadLibraryFolder: (String, String, String, js.Function1[/* items */ js.Array[js.Object], Unit]) => Unit
  ): Library = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), createBrowser = js.Any.fromFunction1(createBrowser), init = js.Any.fromFunction0(init), loadLibraryFolder = js.Any.fromFunction4(loadLibraryFolder))
    __obj.asInstanceOf[Library]
  }
  
  @scala.inline
  implicit class LibraryMutableBuilder[Self <: Library] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreate(value: typingsSlinky.nodeRedEditorClient.anon.Editor => Unit): Self = StObject.set(x, "create", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCreateBrowser(value: Container => Data): Self = StObject.set(x, "createBrowser", js.Any.fromFunction1(value))
    
    @scala.inline
    def setInit(value: () => Unit): Self = StObject.set(x, "init", js.Any.fromFunction0(value))
    
    @scala.inline
    def setLoadLibraryFolder(value: (String, String, String, js.Function1[/* items */ js.Array[js.Object], Unit]) => Unit): Self = StObject.set(x, "loadLibraryFolder", js.Any.fromFunction4(value))
  }
}
