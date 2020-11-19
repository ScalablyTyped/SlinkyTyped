package typingsSlinky.activexLibreoffice.com_.sun.star.script

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.task.XInteractionHandler
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Extension of {@link XLibraryContainer} to provide functionality to store a library to a location represented by a URL. */
@js.native
trait XLibraryContainerExport extends XInterface {
  
  /**
    * Exports a library specified by Name to the location specified by the passed URL string.
    *
    * An interaction handler can be passed to be used for internal ucb operations. Exceptions not processed by this handler will be passed as {@link
    * com.sun.star.uno.Exception} . If this parameter is null this applies to all exceptions thrown by ucb.
    * @see com.sun.star.task.InteractionHandler If a library with the this name doesn't exist a {@link com.sun.star.container.NoSuchElementException} is thrown.
    */
  def exportLibrary(Name: String, URL: String, Handler: XInteractionHandler): Unit = js.native
}
object XLibraryContainerExport {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    exportLibrary: (String, String, XInteractionHandler) => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XLibraryContainerExport = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), exportLibrary = js.Any.fromFunction3(exportLibrary), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XLibraryContainerExport]
  }
  
  @scala.inline
  implicit class XLibraryContainerExportOps[Self <: XLibraryContainerExport] (val x: Self) extends AnyVal {
    
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
    def setExportLibrary(value: (String, String, XInteractionHandler) => Unit): Self = this.set("exportLibrary", js.Any.fromFunction3(value))
  }
}
