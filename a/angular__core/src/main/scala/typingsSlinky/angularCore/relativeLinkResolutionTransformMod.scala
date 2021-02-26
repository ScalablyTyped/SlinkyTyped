package typingsSlinky.angularCore

import typingsSlinky.angularCore.relativeLinkResolutionUpdateRecorderMod.UpdateRecorder
import typingsSlinky.typescript.mod.CallExpression
import typingsSlinky.typescript.mod.ObjectLiteralExpression
import typingsSlinky.typescript.mod.SourceFile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object relativeLinkResolutionTransformMod {
  
  @JSImport("@angular/core/schematics/migrations/relative-link-resolution/transform", "RelativeLinkResolutionTransform")
  @js.native
  class RelativeLinkResolutionTransform protected () extends StObject {
    def this(getUpdateRecorder: js.Function1[/* sf */ SourceFile, UpdateRecorder]) = this()
    
    var _getMigratedLiteralExpression: js.Any = js.native
    
    var _maybeUpdateLiteral: js.Any = js.native
    
    var _updateCallExpressionWithoutExtraOptions: js.Any = js.native
    
    var _updateNode: js.Any = js.native
    
    var getUpdateRecorder: js.Any = js.native
    
    def migrateObjectLiterals(vars: js.Array[ObjectLiteralExpression]): Unit = js.native
    
    /** Migrate the ExtraOptions#RelativeLinkResolution property assignments. */
    def migrateRouterModuleForRootCalls(calls: js.Array[CallExpression]): Unit = js.native
    
    var printer: js.Any = js.native
  }
}
