package typingsSlinky.nodeDir.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("node-dir", "readFiles")
@js.native
object readFiles extends js.Object {
  
  def apply(dir: String, fileCallback: FileCallback): Unit = js.native
  def apply(dir: String, fileCallback: FileCallback, finishedCallback: FinishedCallback): Unit = js.native
  def apply(dir: String, fileCallback: FileNamedCallback): Unit = js.native
  def apply(dir: String, fileCallback: FileNamedCallback, finishedCallback: FinishedCallback): Unit = js.native
  def apply(dir: String, options: Options, fileCallback: FileCallback): Unit = js.native
  def apply(dir: String, options: Options, fileCallback: FileCallback, finishedCallback: FinishedCallback): Unit = js.native
  def apply(dir: String, options: Options, fileCallback: FileNamedCallback): Unit = js.native
  def apply(dir: String, options: Options, fileCallback: FileNamedCallback, finishedCallback: FinishedCallback): Unit = js.native
}
