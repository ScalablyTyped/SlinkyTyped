package typingsSlinky.angularCore

import typingsSlinky.angularCore.ngQueryVisitorMod.ClassMetadataMap
import typingsSlinky.angularCore.timingStrategyMod.TimingStrategy
import typingsSlinky.typescript.mod.TypeChecker
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object usageStrategyMod {
  
  @JSImport("@angular/core/schematics/migrations/static-queries/strategies/usage_strategy/usage_strategy", "QueryUsageStrategy")
  @js.native
  class QueryUsageStrategy protected () extends TimingStrategy {
    def this(classMetadata: ClassMetadataMap, typeChecker: TypeChecker) = this()
    
    /**
      * Checks whether a given query is used statically within the given class, its super
      * class or derived classes.
      */
    var analyzeQueryUsage: js.Any = js.native
    
    var classMetadata: js.Any = js.native
    
    var typeChecker: js.Any = js.native
  }
}
