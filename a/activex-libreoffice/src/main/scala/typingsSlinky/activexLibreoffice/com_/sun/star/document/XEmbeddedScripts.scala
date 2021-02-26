package typingsSlinky.activexLibreoffice.com_.sun.star.document

import typingsSlinky.activexLibreoffice.com_.sun.star.script.XStorageBasedLibraryContainer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * is supported by OfficeDocuments which allow to embed scripts
  * @since OOo 2.4
  */
@js.native
trait XEmbeddedScripts extends StObject {
  
  /**
    * determines whether executing macros from this document is allowed.
    *
    * Effectively, this attribute is an evaluation of the document's {@link MacroExecMode} against possibly applicable configuration settings, the document
    * location in relation to the trusted location, and the like.
    * @see MacroExecMode
    */
  var AllowMacroExecution: Boolean = js.native
  
  /** is the container of `StarBasic` macro libraries contained in the document */
  var BasicLibraries: XStorageBasedLibraryContainer = js.native
  
  /** is the container of dialogs libraries contained in the document */
  var DialogLibraries: XStorageBasedLibraryContainer = js.native
}
object XEmbeddedScripts {
  
  @scala.inline
  def apply(
    AllowMacroExecution: Boolean,
    BasicLibraries: XStorageBasedLibraryContainer,
    DialogLibraries: XStorageBasedLibraryContainer
  ): XEmbeddedScripts = {
    val __obj = js.Dynamic.literal(AllowMacroExecution = AllowMacroExecution.asInstanceOf[js.Any], BasicLibraries = BasicLibraries.asInstanceOf[js.Any], DialogLibraries = DialogLibraries.asInstanceOf[js.Any])
    __obj.asInstanceOf[XEmbeddedScripts]
  }
  
  @scala.inline
  implicit class XEmbeddedScriptsMutableBuilder[Self <: XEmbeddedScripts] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowMacroExecution(value: Boolean): Self = StObject.set(x, "AllowMacroExecution", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBasicLibraries(value: XStorageBasedLibraryContainer): Self = StObject.set(x, "BasicLibraries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDialogLibraries(value: XStorageBasedLibraryContainer): Self = StObject.set(x, "DialogLibraries", value.asInstanceOf[js.Any])
  }
}
