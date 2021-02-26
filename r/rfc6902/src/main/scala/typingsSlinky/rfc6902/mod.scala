package typingsSlinky.rfc6902

import typingsSlinky.rfc6902.diffMod.Operation
import typingsSlinky.rfc6902.diffMod.TestOperation
import typingsSlinky.rfc6902.diffMod.VoidableDiff
import typingsSlinky.rfc6902.patchMod.InvalidOperationError
import typingsSlinky.rfc6902.patchMod.MissingError
import typingsSlinky.rfc6902.patchMod.TestError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("rfc6902", "applyPatch")
  @js.native
  def applyPatch(`object`: js.Any, patch: js.Array[Operation]): js.Array[MissingError | TestError | InvalidOperationError] = js.native
  
  @JSImport("rfc6902", "createPatch")
  @js.native
  def createPatch(input: js.Any, output: js.Any): js.Array[Operation] = js.native
  @JSImport("rfc6902", "createPatch")
  @js.native
  def createPatch(input: js.Any, output: js.Any, diff: VoidableDiff): js.Array[Operation] = js.native
  
  @JSImport("rfc6902", "createTests")
  @js.native
  def createTests(input: js.Any, patch: js.Array[Operation]): js.Array[TestOperation] = js.native
  
  type Patch = js.Array[Operation]
}
