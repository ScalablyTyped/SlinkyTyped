package typingsSlinky.photonui.photonui

import org.scalajs.dom.raw.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

//Widgets
@js.native
trait FileManager extends Base {
  
  var acceptedExts: js.Array[String] = js.native
  
  var acceptedMimes: js.Array[String] = js.native
  
  var dropZone: HTMLElement = js.native
  
  var multiselect: Boolean = js.native
  
  def open(): Unit = js.native
}
object FileManager {
  
  @scala.inline
  def apply(
    acceptedExts: js.Array[String],
    acceptedMimes: js.Array[String],
    destroy: () => Unit,
    dropZone: HTMLElement,
    multiselect: Boolean,
    open: () => Unit,
    registerCallback: (String, String, js.Function, js.Any) => Unit,
    removeCallback: String => Unit
  ): FileManager = {
    val __obj = js.Dynamic.literal(acceptedExts = acceptedExts.asInstanceOf[js.Any], acceptedMimes = acceptedMimes.asInstanceOf[js.Any], destroy = js.Any.fromFunction0(destroy), dropZone = dropZone.asInstanceOf[js.Any], multiselect = multiselect.asInstanceOf[js.Any], open = js.Any.fromFunction0(open), registerCallback = js.Any.fromFunction4(registerCallback), removeCallback = js.Any.fromFunction1(removeCallback))
    __obj.asInstanceOf[FileManager]
  }
  
  @scala.inline
  implicit class FileManagerMutableBuilder[Self <: FileManager] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAcceptedExts(value: js.Array[String]): Self = StObject.set(x, "acceptedExts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAcceptedExtsVarargs(value: String*): Self = StObject.set(x, "acceptedExts", js.Array(value :_*))
    
    @scala.inline
    def setAcceptedMimes(value: js.Array[String]): Self = StObject.set(x, "acceptedMimes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAcceptedMimesVarargs(value: String*): Self = StObject.set(x, "acceptedMimes", js.Array(value :_*))
    
    @scala.inline
    def setDropZone(value: HTMLElement): Self = StObject.set(x, "dropZone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMultiselect(value: Boolean): Self = StObject.set(x, "multiselect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpen(value: () => Unit): Self = StObject.set(x, "open", js.Any.fromFunction0(value))
  }
}
