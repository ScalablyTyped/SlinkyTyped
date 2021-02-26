package typingsSlinky.activexLibreoffice.com_.sun.star.task

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import typingsSlinky.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Allows to store and retrieve URLs. URLs can be stored persistently or until end of OOo session.
  * @since OOo 3.2
  */
@js.native
trait XUrlContainer extends XInterface {
  
  /**
    * Add a URL to the container.
    * @param Url URL to add to the container
    * @param MakePersistent indicates whether the URL shall be stored persistently or just in memory (until end of OOo session)
    */
  def addUrl(Url: String, MakePersistent: Boolean): Unit = js.native
  
  /**
    * Lookup a URL in the container.
    * @param Url URL to lookup.
    * @returns Best matched URL or empty string.
    */
  def findUrl(Url: String): String = js.native
  
  /**
    * Get all URLs.
    * @param OnlyPersistent Only URLs that are stored persistently shall be returned.
    * @returns List of URLs.
    */
  def getUrls(OnlyPersistent: Boolean): SafeArray[String] = js.native
  
  /**
    * Remove a URL from the container.
    * @param Url URL to remove.
    */
  def removeUrl(Url: String): Unit = js.native
}
object XUrlContainer {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    addUrl: (String, Boolean) => Unit,
    findUrl: String => String,
    getUrls: Boolean => SafeArray[String],
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeUrl: String => Unit
  ): XUrlContainer = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), addUrl = js.Any.fromFunction2(addUrl), findUrl = js.Any.fromFunction1(findUrl), getUrls = js.Any.fromFunction1(getUrls), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeUrl = js.Any.fromFunction1(removeUrl))
    __obj.asInstanceOf[XUrlContainer]
  }
  
  @scala.inline
  implicit class XUrlContainerMutableBuilder[Self <: XUrlContainer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddUrl(value: (String, Boolean) => Unit): Self = StObject.set(x, "addUrl", js.Any.fromFunction2(value))
    
    @scala.inline
    def setFindUrl(value: String => String): Self = StObject.set(x, "findUrl", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetUrls(value: Boolean => SafeArray[String]): Self = StObject.set(x, "getUrls", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemoveUrl(value: String => Unit): Self = StObject.set(x, "removeUrl", js.Any.fromFunction1(value))
  }
}
