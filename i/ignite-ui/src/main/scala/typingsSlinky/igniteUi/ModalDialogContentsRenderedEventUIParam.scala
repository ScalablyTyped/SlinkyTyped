package typingsSlinky.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ModalDialogContentsRenderedEventUIParam extends StObject {
  
  /**
    * Gets a reference to the modal dialog element. This is a jQuery object.
    */
  var modalDialogElement: js.UndefOr[String] = js.native
  
  /**
    * Gets access the GroupBy widget object.
    */
  var owner: js.UndefOr[js.Any] = js.native
}
object ModalDialogContentsRenderedEventUIParam {
  
  @scala.inline
  def apply(): ModalDialogContentsRenderedEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModalDialogContentsRenderedEventUIParam]
  }
  
  @scala.inline
  implicit class ModalDialogContentsRenderedEventUIParamMutableBuilder[Self <: ModalDialogContentsRenderedEventUIParam] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setModalDialogElement(value: String): Self = StObject.set(x, "modalDialogElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModalDialogElementUndefined: Self = StObject.set(x, "modalDialogElement", js.undefined)
    
    @scala.inline
    def setOwner(value: js.Any): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
  }
}
