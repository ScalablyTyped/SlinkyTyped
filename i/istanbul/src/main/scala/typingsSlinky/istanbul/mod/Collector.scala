package typingsSlinky.istanbul.mod

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Collector
  extends Instantiable0[Collector]
     with Instantiable1[/* options */ js.Any, Collector] {
  
  def add(coverage: js.Any): Unit = js.native
  def add(coverage: js.Any, testName: String): Unit = js.native
  
  def getFinalCoverage(): js.Any = js.native
}
