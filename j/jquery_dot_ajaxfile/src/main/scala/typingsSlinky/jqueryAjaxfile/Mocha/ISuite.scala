package typingsSlinky.jqueryAjaxfile.Mocha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Partial interface for Mocha's `Suite` class. */
@js.native
trait ISuite extends js.Object {
  
  def fullTitle(): String = js.native
  
  var parent: ISuite = js.native
  
  var title: String = js.native
}
object ISuite {
  
  @scala.inline
  def apply(fullTitle: () => String, parent: ISuite, title: String): ISuite = {
    val __obj = js.Dynamic.literal(fullTitle = js.Any.fromFunction0(fullTitle), parent = parent.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISuite]
  }
  
  @scala.inline
  implicit class ISuiteOps[Self <: ISuite] (val x: Self) extends AnyVal {
    
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
    def setFullTitle(value: () => String): Self = this.set("fullTitle", js.Any.fromFunction0(value))
    
    @scala.inline
    def setParent(value: ISuite): Self = this.set("parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
  }
}
