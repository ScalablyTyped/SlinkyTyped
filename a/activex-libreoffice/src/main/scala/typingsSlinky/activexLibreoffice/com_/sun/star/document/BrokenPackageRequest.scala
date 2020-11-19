package typingsSlinky.activexLibreoffice.com_.sun.star.document

import typingsSlinky.activexLibreoffice.com_.sun.star.uno.Exception
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Is used for interaction handle in case package is broken.
  * @since OOo 1.1.2
  */
@js.native
trait BrokenPackageRequest extends Exception {
  
  /** The name of the document that is broken */
  var aName: String = js.native
}
object BrokenPackageRequest {
  
  @scala.inline
  def apply(Context: XInterface, Message: String, aName: String): BrokenPackageRequest = {
    val __obj = js.Dynamic.literal(Context = Context.asInstanceOf[js.Any], Message = Message.asInstanceOf[js.Any], aName = aName.asInstanceOf[js.Any])
    __obj.asInstanceOf[BrokenPackageRequest]
  }
  
  @scala.inline
  implicit class BrokenPackageRequestOps[Self <: BrokenPackageRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAName(value: String): Self = this.set("aName", value.asInstanceOf[js.Any])
  }
}
