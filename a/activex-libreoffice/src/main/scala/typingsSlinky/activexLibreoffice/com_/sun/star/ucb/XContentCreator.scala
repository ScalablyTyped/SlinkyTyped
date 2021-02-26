package typingsSlinky.activexLibreoffice.com_.sun.star.ucb

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import typingsSlinky.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A creator for new (persistent) contents, like file system folders.
  *
  * Creation of a new (persistent) content:  1. creatabletypes = creator.queryCreatableContentsInfo() 2. choose a suitable type from creatabletypes 3.
  * newObject = creator.createNewContent( type ) 4. initialize the new object (i.e. newObject.Property1 = ...) 5. let the new content execute the command
  * "insert". That command commits the data and makes the new content persistent.
  * @author Kai Sommerfeld
  * @deprecated Deprecated  This interface is deprecated. Use {@link Content} property "CreatableContentsInfo" and command "createNewContent" instead.
  * @see XContent
  * @see XCommandProcessor
  * @version 1.0
  */
@js.native
trait XContentCreator extends XInterface {
  
  /**
    * creates a new content of given type.
    * @param Info the content information.
    * @returns the new content, if operation was successful.
    */
  def createNewContent(Info: ContentInfo): XContent = js.native
  
  /**
    * returns a list with information about the creatable contents.
    * @returns the list with information about the creatable contents.
    */
  def queryCreatableContentsInfo(): SafeArray[ContentInfo] = js.native
}
object XContentCreator {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    createNewContent: ContentInfo => XContent,
    queryCreatableContentsInfo: () => SafeArray[ContentInfo],
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XContentCreator = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), createNewContent = js.Any.fromFunction1(createNewContent), queryCreatableContentsInfo = js.Any.fromFunction0(queryCreatableContentsInfo), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XContentCreator]
  }
  
  @scala.inline
  implicit class XContentCreatorMutableBuilder[Self <: XContentCreator] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreateNewContent(value: ContentInfo => XContent): Self = StObject.set(x, "createNewContent", js.Any.fromFunction1(value))
    
    @scala.inline
    def setQueryCreatableContentsInfo(value: () => SafeArray[ContentInfo]): Self = StObject.set(x, "queryCreatableContentsInfo", js.Any.fromFunction0(value))
  }
}
