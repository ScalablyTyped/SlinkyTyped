package typingsSlinky.reactBootstrapTableNext.mod

import typingsSlinky.reactBootstrapTableNext.anon.Text
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SizePerPageRendererOptions extends StObject {
  
  /**
    * current size per page
    */
  var currentSizePerPage: Double = js.native
  
  /**
    * call it when you need to change size per page
    */
  def onSizePerPageChange(page: Double, sizePerPage: Double): Unit = js.native
  
  /**
    * dropdown options
    */
  var options: js.Array[Text] = js.native
}
object SizePerPageRendererOptions {
  
  @scala.inline
  def apply(currentSizePerPage: Double, onSizePerPageChange: (Double, Double) => Unit, options: js.Array[Text]): SizePerPageRendererOptions = {
    val __obj = js.Dynamic.literal(currentSizePerPage = currentSizePerPage.asInstanceOf[js.Any], onSizePerPageChange = js.Any.fromFunction2(onSizePerPageChange), options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[SizePerPageRendererOptions]
  }
  
  @scala.inline
  implicit class SizePerPageRendererOptionsMutableBuilder[Self <: SizePerPageRendererOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCurrentSizePerPage(value: Double): Self = StObject.set(x, "currentSizePerPage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnSizePerPageChange(value: (Double, Double) => Unit): Self = StObject.set(x, "onSizePerPageChange", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOptions(value: js.Array[Text]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionsVarargs(value: Text*): Self = StObject.set(x, "options", js.Array(value :_*))
  }
}
