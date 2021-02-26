package typingsSlinky.activexLibreoffice.com_.sun.star.script

import typingsSlinky.activexLibreoffice.LibreOffice.SeqEquiv
import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.container.XNameContainer
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Interface representing a library and provides access to its modules
  * @deprecated Deprecated
  */
@js.native
trait XStarBasicAccess extends XInterface {
  
  /** returns the library container giving access to the libraries stored in a document or basic library file. */
  val LibraryContainer: XNameContainer = js.native
  
  /**
    * Adds an old style basic dialog (SI controls) to an existing (e.g., created by createLibrary) library. By using this method together with createLibrary
    * the caller does not have to implement {@link XStarBasicLibraryInfo} and {@link XStarBasicDialogInfo}
    * @throws NoSuchElementException if the library doesn't exist.
    */
  def addDialog(LibraryName: String, DialogName: String, Data: SeqEquiv[Double]): Unit = js.native
  
  /**
    * Adds a module to an existing (e.g., created by createLibrary) library. By using this method together with createLibrary the caller does not have to
    * implement {@link XStarBasicLibraryInfo} and XModuleInfo.
    * @throws NoSuchElementException if the library doesn't exist.
    */
  def addModule(LibraryName: String, ModuleName: String, Language: String, Source: String): Unit = js.native
  
  /**
    * Creates an empty library. This method can be called alternatively to accessing directly the NameContainer returned by getLibraryContainer. By using
    * this method together with addModule and addStarBasicDialog the caller does not have to implement {@link XStarBasicLibraryInfo} , XModuleInfo, and
    * {@link XStarBasicDialogInfo}
    */
  def createLibrary(LibName: String, Password: String, ExternalSourceURL: String, LinkTargetURL: String): Unit = js.native
  
  /** returns the library container giving access to the libraries stored in a document or basic library file. */
  def getLibraryContainer(): XNameContainer = js.native
}
object XStarBasicAccess {
  
  @scala.inline
  def apply(
    LibraryContainer: XNameContainer,
    acquire: () => Unit,
    addDialog: (String, String, SeqEquiv[Double]) => Unit,
    addModule: (String, String, String, String) => Unit,
    createLibrary: (String, String, String, String) => Unit,
    getLibraryContainer: () => XNameContainer,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XStarBasicAccess = {
    val __obj = js.Dynamic.literal(LibraryContainer = LibraryContainer.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addDialog = js.Any.fromFunction3(addDialog), addModule = js.Any.fromFunction4(addModule), createLibrary = js.Any.fromFunction4(createLibrary), getLibraryContainer = js.Any.fromFunction0(getLibraryContainer), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XStarBasicAccess]
  }
  
  @scala.inline
  implicit class XStarBasicAccessMutableBuilder[Self <: XStarBasicAccess] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddDialog(value: (String, String, SeqEquiv[Double]) => Unit): Self = StObject.set(x, "addDialog", js.Any.fromFunction3(value))
    
    @scala.inline
    def setAddModule(value: (String, String, String, String) => Unit): Self = StObject.set(x, "addModule", js.Any.fromFunction4(value))
    
    @scala.inline
    def setCreateLibrary(value: (String, String, String, String) => Unit): Self = StObject.set(x, "createLibrary", js.Any.fromFunction4(value))
    
    @scala.inline
    def setGetLibraryContainer(value: () => XNameContainer): Self = StObject.set(x, "getLibraryContainer", js.Any.fromFunction0(value))
    
    @scala.inline
    def setLibraryContainer(value: XNameContainer): Self = StObject.set(x, "LibraryContainer", value.asInstanceOf[js.Any])
  }
}
