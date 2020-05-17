package typingsSlinky.chromedriver

import typingsSlinky.chromedriver.chromedriverBooleans.`false`
import typingsSlinky.chromedriver.chromedriverBooleans.`true`
import typingsSlinky.node.childProcessMod.ChildProcess
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("chromedriver", JSImport.Namespace)
@js.native
object mod extends js.Object {
  val defaultInstance: js.UndefOr[ChildProcess] = js.native
  val path: String = js.native
  val version: String = js.native
  def start(): ChildProcess = js.native
  def start(args: js.Array[String]): ChildProcess = js.native
  @JSName("start")
  def start_false(args: js.Array[String], returnPromise: `false`): ChildProcess = js.native
  @JSName("start")
  def start_true(args: js.UndefOr[js.Array[String] | Null], returnPromise: `true`): js.Promise[ChildProcess] = js.native
  def stop(): Unit = js.native
}

