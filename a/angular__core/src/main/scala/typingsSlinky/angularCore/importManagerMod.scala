package typingsSlinky.angularCore

import typingsSlinky.typescript.mod.Expression
import typingsSlinky.typescript.mod.NamedImports
import typingsSlinky.typescript.mod.Printer
import typingsSlinky.typescript.mod.SourceFile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object importManagerMod {
  
  @JSImport("@angular/core/schematics/utils/import_manager", "ImportManager")
  @js.native
  class ImportManager protected () extends StObject {
    def this(
      getUpdateRecorder: js.Function1[/* sf */ SourceFile, ImportManagerUpdateRecorder],
      printer: Printer
    ) = this()
    
    /**
      * Determines the full end of a given node. By default the end position of a node is
      * before all trailing comments. This could mean that generated imports shift comments.
      */
    var _getEndPositionOfNode: js.Any = js.native
    
    /** Gets an unique identifier with a base name for the given source file. */
    var _getUniqueIdentifier: js.Any = js.native
    
    var _recordUsedIdentifier: js.Any = js.native
    
    /**
      * Adds an import to the given source-file and returns the TypeScript
      * identifier that can be used to access the newly imported symbol.
      */
    def addImportToSourceFile(sourceFile: SourceFile, symbolName: String, moduleName: String): Expression = js.native
    def addImportToSourceFile(sourceFile: SourceFile, symbolName: String, moduleName: String, typeImport: Boolean): Expression = js.native
    def addImportToSourceFile(sourceFile: SourceFile, symbolName: Null, moduleName: String): Expression = js.native
    def addImportToSourceFile(sourceFile: SourceFile, symbolName: Null, moduleName: String, typeImport: Boolean): Expression = js.native
    
    var getUpdateRecorder: js.Any = js.native
    
    /**
      * Array of previously resolved symbol imports. Cache can be re-used to return
      * the same identifier without checking the source-file again.
      */
    var importCache: js.Any = js.native
    
    /**
      * Checks whether the specified identifier name is used within the given
      * source file.
      */
    var isUniqueIdentifierName: js.Any = js.native
    
    var printer: js.Any = js.native
    
    /**
      * Stores the collected import changes within the appropriate update recorders. The
      * updated imports can only be updated *once* per source-file because previous updates
      * could otherwise shift the source-file offsets.
      */
    def recordChanges(): Unit = js.native
    
    /** Map of import declarations that need to be updated to include the given symbols. */
    var updatedImports: js.Any = js.native
    
    /** Map of source-files and their previously used identifier names. */
    var usedIdentifierNames: js.Any = js.native
  }
  
  @js.native
  trait ImportManagerUpdateRecorder extends StObject {
    
    def addNewImport(start: Double, importText: String): Unit = js.native
    
    def updateExistingImport(namedBindings: NamedImports, newNamedBindings: String): Unit = js.native
  }
  object ImportManagerUpdateRecorder {
    
    @scala.inline
    def apply(addNewImport: (Double, String) => Unit, updateExistingImport: (NamedImports, String) => Unit): ImportManagerUpdateRecorder = {
      val __obj = js.Dynamic.literal(addNewImport = js.Any.fromFunction2(addNewImport), updateExistingImport = js.Any.fromFunction2(updateExistingImport))
      __obj.asInstanceOf[ImportManagerUpdateRecorder]
    }
    
    @scala.inline
    implicit class ImportManagerUpdateRecorderMutableBuilder[Self <: ImportManagerUpdateRecorder] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddNewImport(value: (Double, String) => Unit): Self = StObject.set(x, "addNewImport", js.Any.fromFunction2(value))
      
      @scala.inline
      def setUpdateExistingImport(value: (NamedImports, String) => Unit): Self = StObject.set(x, "updateExistingImport", js.Any.fromFunction2(value))
    }
  }
}
