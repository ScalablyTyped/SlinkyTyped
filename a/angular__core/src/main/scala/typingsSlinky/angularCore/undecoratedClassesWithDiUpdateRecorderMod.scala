package typingsSlinky.angularCore

import typingsSlinky.angularCore.importManagerMod.ImportManagerUpdateRecorder
import typingsSlinky.typescript.mod.ClassDeclaration
import typingsSlinky.typescript.mod.NamedImports
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object undecoratedClassesWithDiUpdateRecorderMod {
  
  @js.native
  trait UpdateRecorder extends ImportManagerUpdateRecorder {
    
    def addClassComment(node: ClassDeclaration, text: String): Unit = js.native
    
    def addClassDecorator(node: ClassDeclaration, text: String): Unit = js.native
    
    def commitUpdate(): Unit = js.native
  }
  object UpdateRecorder {
    
    @scala.inline
    def apply(
      addClassComment: (ClassDeclaration, String) => Unit,
      addClassDecorator: (ClassDeclaration, String) => Unit,
      addNewImport: (Double, String) => Unit,
      commitUpdate: () => Unit,
      updateExistingImport: (NamedImports, String) => Unit
    ): UpdateRecorder = {
      val __obj = js.Dynamic.literal(addClassComment = js.Any.fromFunction2(addClassComment), addClassDecorator = js.Any.fromFunction2(addClassDecorator), addNewImport = js.Any.fromFunction2(addNewImport), commitUpdate = js.Any.fromFunction0(commitUpdate), updateExistingImport = js.Any.fromFunction2(updateExistingImport))
      __obj.asInstanceOf[UpdateRecorder]
    }
    
    @scala.inline
    implicit class UpdateRecorderMutableBuilder[Self <: UpdateRecorder] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddClassComment(value: (ClassDeclaration, String) => Unit): Self = StObject.set(x, "addClassComment", js.Any.fromFunction2(value))
      
      @scala.inline
      def setAddClassDecorator(value: (ClassDeclaration, String) => Unit): Self = StObject.set(x, "addClassDecorator", js.Any.fromFunction2(value))
      
      @scala.inline
      def setCommitUpdate(value: () => Unit): Self = StObject.set(x, "commitUpdate", js.Any.fromFunction0(value))
    }
  }
}
