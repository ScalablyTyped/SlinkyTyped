package typingsSlinky.jestTestResult

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object typesMod {
  
  type Bytes = scala.Double
  
  type CodeCoverageFormatter = js.Function2[
    /* coverage */ js.UndefOr[typingsSlinky.istanbulLibCoverage.mod.CoverageMapData | scala.Null], 
    /* reporter */ typingsSlinky.jestTestResult.typesMod.CodeCoverageReporter, 
    js.UndefOr[(typingsSlinky.std.Record[java.lang.String, js.Any]) | scala.Null]
  ]
  
  type CodeCoverageReporter = js.Any
  
  type Milliseconds = scala.Double
}
