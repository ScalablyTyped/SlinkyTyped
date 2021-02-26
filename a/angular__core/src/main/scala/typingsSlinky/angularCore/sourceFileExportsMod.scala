package typingsSlinky.angularCore

import typingsSlinky.typescript.mod.Identifier
import typingsSlinky.typescript.mod.SourceFile
import typingsSlinky.typescript.mod.Symbol
import typingsSlinky.typescript.mod.TypeChecker
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sourceFileExportsMod {
  
  @JSImport("@angular/core/schematics/migrations/undecorated-classes-with-di/decorator_rewrite/source_file_exports", "getExportSymbolsOfFile")
  @js.native
  def getExportSymbolsOfFile(sf: SourceFile, typeChecker: TypeChecker): js.Array[ResolvedExport] = js.native
  
  @js.native
  trait ResolvedExport extends StObject {
    
    var exportName: String = js.native
    
    var identifier: Identifier = js.native
    
    var symbol: Symbol = js.native
  }
  object ResolvedExport {
    
    @scala.inline
    def apply(exportName: String, identifier: Identifier, symbol: Symbol): ResolvedExport = {
      val __obj = js.Dynamic.literal(exportName = exportName.asInstanceOf[js.Any], identifier = identifier.asInstanceOf[js.Any], symbol = symbol.asInstanceOf[js.Any])
      __obj.asInstanceOf[ResolvedExport]
    }
    
    @scala.inline
    implicit class ResolvedExportMutableBuilder[Self <: ResolvedExport] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExportName(value: String): Self = StObject.set(x, "exportName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdentifier(value: Identifier): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSymbol(value: Symbol): Self = StObject.set(x, "symbol", value.asInstanceOf[js.Any])
    }
  }
}
