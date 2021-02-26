package typingsSlinky.activexLibreoffice.com_.sun.star.frame

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** an interface representing an entity with a modifyable title. */
@js.native
trait XTitle extends XInterface {
  
  /**
    * Returns the title of the object.
    * @returns The title.
    */
  var Title: String = js.native
  
  /**
    * Returns the title of the object.
    * @returns The title.
    */
  def getTitle(): String = js.native
  
  /**
    * Sets the title of the object.
    * @param sTitle The title.
    */
  def setTitle(sTitle: String): Unit = js.native
}
object XTitle {
  
  @scala.inline
  def apply(
    Title: String,
    acquire: () => Unit,
    getTitle: () => String,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setTitle: String => Unit
  ): XTitle = {
    val __obj = js.Dynamic.literal(Title = Title.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getTitle = js.Any.fromFunction0(getTitle), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setTitle = js.Any.fromFunction1(setTitle))
    __obj.asInstanceOf[XTitle]
  }
  
  @scala.inline
  implicit class XTitleMutableBuilder[Self <: XTitle] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetTitle(value: () => String): Self = StObject.set(x, "getTitle", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetTitle(value: String => Unit): Self = StObject.set(x, "setTitle", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "Title", value.asInstanceOf[js.Any])
  }
}
