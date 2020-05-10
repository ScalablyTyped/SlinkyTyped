package typingsSlinky.naja.mod

import org.scalajs.dom.raw.EventListenerOptions
import typingsSlinky.naja.najaStrings.afterUpdate
import typingsSlinky.naja.najaStrings.beforeUpdate
import typingsSlinky.std.EventTarget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SnippetHandler extends EventTarget {
  @JSName("addEventListener")
  def addEventListener_afterUpdate(`type`: afterUpdate, listener: SnippetUpdateListener): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_afterUpdate(`type`: afterUpdate, listener: SnippetUpdateListener, options: Boolean): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_afterUpdate(`type`: afterUpdate, listener: SnippetUpdateListener, options: EventListenerOptions): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_beforeUpdate(`type`: beforeUpdate, listener: SnippetUpdateListener): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_beforeUpdate(`type`: beforeUpdate, listener: SnippetUpdateListener, options: Boolean): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_beforeUpdate(`type`: beforeUpdate, listener: SnippetUpdateListener, options: EventListenerOptions): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_afterUpdate(`type`: afterUpdate, listener: SnippetUpdateListener): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_afterUpdate(`type`: afterUpdate, listener: SnippetUpdateListener, options: Boolean): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_afterUpdate(`type`: afterUpdate, listener: SnippetUpdateListener, options: EventListenerOptions): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_beforeUpdate(`type`: beforeUpdate, listener: SnippetUpdateListener): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_beforeUpdate(`type`: beforeUpdate, listener: SnippetUpdateListener, options: Boolean): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_beforeUpdate(`type`: beforeUpdate, listener: SnippetUpdateListener, options: EventListenerOptions): Unit = js.native
}

