package typingsSlinky.angularCore

import typingsSlinky.typescript.mod.Identifier
import typingsSlinky.typescript.mod.ImportDeclaration
import typingsSlinky.typescript.mod.ImportSpecifier
import typingsSlinky.typescript.mod.NamedImports
import typingsSlinky.typescript.mod.SourceFile
import typingsSlinky.typescript.mod.TypeChecker
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object importsMod {
  
  @JSImport("@angular/core/schematics/utils/typescript/imports", "getImportOfIdentifier")
  @js.native
  def getImportOfIdentifier(typeChecker: TypeChecker, node: Identifier): Import | Null = js.native
  
  @JSImport("@angular/core/schematics/utils/typescript/imports", "getImportSpecifier")
  @js.native
  def getImportSpecifier(sourceFile: SourceFile, moduleName: String, specifierName: String): ImportSpecifier | Null = js.native
  
  @JSImport("@angular/core/schematics/utils/typescript/imports", "replaceImport")
  @js.native
  def replaceImport(node: NamedImports, existingImport: String, newImportName: String): NamedImports = js.native
  
  @js.native
  trait Import extends StObject {
    
    var importModule: String = js.native
    
    var name: String = js.native
    
    var node: ImportDeclaration = js.native
  }
  object Import {
    
    @scala.inline
    def apply(importModule: String, name: String, node: ImportDeclaration): Import = {
      val __obj = js.Dynamic.literal(importModule = importModule.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any])
      __obj.asInstanceOf[Import]
    }
    
    @scala.inline
    implicit class ImportMutableBuilder[Self <: Import] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setImportModule(value: String): Self = StObject.set(x, "importModule", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNode(value: ImportDeclaration): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
    }
  }
}
