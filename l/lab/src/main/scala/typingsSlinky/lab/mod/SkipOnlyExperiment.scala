package typingsSlinky.lab.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SkipOnlyExperiment extends js.Object {
  
  /** Only execute this test suite */
  def only(desc: String, cb: EmptyCallback): js.Object = js.native
  /** Only execute this test suite */
  def only(desc: String, options: ExperimentOptions, cb: EmptyCallback): js.Object = js.native
  /** Only execute this test suite */
  @JSName("only")
  var only_Original: ExperimentArgs with ExperimentWithOptionsArgs = js.native
  
  /** Skip this test suite */
  def skip(desc: String, cb: EmptyCallback): js.Object = js.native
  /** Skip this test suite */
  def skip(desc: String, options: ExperimentOptions, cb: EmptyCallback): js.Object = js.native
  /** Skip this test suite */
  @JSName("skip")
  var skip_Original: ExperimentArgs with ExperimentWithOptionsArgs = js.native
}
