package typingsSlinky.algoliasearch.algoliasearchMod

import typingsSlinky.algoliasearch.algoliasearchStrings.end
import typingsSlinky.algoliasearch.algoliasearchStrings.error
import typingsSlinky.algoliasearch.algoliasearchStrings.result
import typingsSlinky.algoliasearch.algoliasearchStrings.stop
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Browser extends js.Object {
  @JSName("on")
  def on_end(`type`: end, cb: js.Function0[Unit]): Unit = js.native
  @JSName("on")
  def on_error(`type`: error, cb: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
  @JSName("on")
  def on_result(`type`: result, cb: js.Function1[/* content */ BrowseResponse, Unit]): Unit = js.native
  @JSName("on")
  def on_stop(`type`: stop, cb: js.Function0[Unit]): Unit = js.native
  def stop(): Unit = js.native
}

