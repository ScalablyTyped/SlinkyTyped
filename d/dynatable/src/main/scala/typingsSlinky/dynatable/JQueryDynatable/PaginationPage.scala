package typingsSlinky.dynatable.JQueryDynatable

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PaginationPage extends StObject {
  
  /** Parse the current window.location in order to determine the target page */
  def init(): Unit = js.native
  
  /**
    * Check if the paginate feature is enabled in `settings.features`
    *
    * @return A boolean
    */
  def initOnLoad(): Boolean = js.native
  
  /**
    * Set the page in the dataset
    *
    * @param page The new page number
    */
  def set(page: Double): Unit = js.native
}
object PaginationPage {
  
  @scala.inline
  def apply(init: () => Unit, initOnLoad: () => Boolean, set: Double => Unit): PaginationPage = {
    val __obj = js.Dynamic.literal(init = js.Any.fromFunction0(init), initOnLoad = js.Any.fromFunction0(initOnLoad), set = js.Any.fromFunction1(set))
    __obj.asInstanceOf[PaginationPage]
  }
  
  @scala.inline
  implicit class PaginationPageMutableBuilder[Self <: PaginationPage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInit(value: () => Unit): Self = StObject.set(x, "init", js.Any.fromFunction0(value))
    
    @scala.inline
    def setInitOnLoad(value: () => Boolean): Self = StObject.set(x, "initOnLoad", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSet(value: Double => Unit): Self = StObject.set(x, "set", js.Any.fromFunction1(value))
  }
}
