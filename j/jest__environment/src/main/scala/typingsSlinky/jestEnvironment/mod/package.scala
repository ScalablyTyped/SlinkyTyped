package typingsSlinky.jestEnvironment

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type JestMockFn = /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof jestMock.fn */ js.Any
  
  type JestMockSpyOn = /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof jestMock.spyOn */ js.Any
  
  type Module = typingsSlinky.node.NodeModule
  
  type ModuleWrapper = js.ThisFunction8[
    /* import warning: importer.ImportType#apply Failed type conversion: @jest/environment.@jest/environment.Module['exports'] */ /* this */ js.Any, 
    /* module */ typingsSlinky.jestEnvironment.mod.Module, 
    /* import warning: importer.ImportType#apply Failed type conversion: @jest/environment.@jest/environment.Module['exports'] */ /* exports */ js.Any, 
    /* require */ typingsSlinky.node.NodeJS.Require with (js.Function1[/* id */ java.lang.String, _]), 
    /* __dirname */ java.lang.String, 
    /* __filename */ java.lang.String, 
    /* global */ typingsSlinky.jestTypes.globalMod.Global, 
    /* jest */ typingsSlinky.jestEnvironment.mod.Jest, 
    js.UndefOr[
      /* repeated */ /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 52 */ js.Any
    ], 
    js.Any
  ]
}
