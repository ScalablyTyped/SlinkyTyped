package typingsSlinky.sax.mod

import typingsSlinky.node.streamMod.Duplex
import typingsSlinky.node.streamMod.Readable
import typingsSlinky.sax.AnonBody
import typingsSlinky.sax.AnonName
import typingsSlinky.sax.AnonPrefix
import typingsSlinky.sax.saxStrings.attribute
import typingsSlinky.sax.saxStrings.cdata
import typingsSlinky.sax.saxStrings.close
import typingsSlinky.sax.saxStrings.closecdata
import typingsSlinky.sax.saxStrings.closenamespace
import typingsSlinky.sax.saxStrings.closetag
import typingsSlinky.sax.saxStrings.comment
import typingsSlinky.sax.saxStrings.data
import typingsSlinky.sax.saxStrings.doctype
import typingsSlinky.sax.saxStrings.drain
import typingsSlinky.sax.saxStrings.end
import typingsSlinky.sax.saxStrings.error
import typingsSlinky.sax.saxStrings.finish
import typingsSlinky.sax.saxStrings.opencdata
import typingsSlinky.sax.saxStrings.opennamespace
import typingsSlinky.sax.saxStrings.opentag
import typingsSlinky.sax.saxStrings.pipe
import typingsSlinky.sax.saxStrings.processinginstruction
import typingsSlinky.sax.saxStrings.readable
import typingsSlinky.sax.saxStrings.ready
import typingsSlinky.sax.saxStrings.script
import typingsSlinky.sax.saxStrings.text
import typingsSlinky.sax.saxStrings.unpipe
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sax", "SAXStream")
@js.native
class SAXStream () extends Duplex {
  def this(strict: Boolean) = this()
  def this(strict: Boolean, opt: SAXOptions) = this()
  var _parser: SAXParser = js.native
  def on(event: String, listener: js.ThisFunction1[/* this */ this.type, /* repeated */ js.Any, Unit]): this.type = js.native
  def on(event: js.Symbol, listener: js.ThisFunction1[/* this */ this.type, /* repeated */ js.Any, Unit]): this.type = js.native
  @JSName("on")
  def on_attribute(event: attribute, listener: js.ThisFunction1[/* this */ this.type, /* attr */ AnonName, Unit]): this.type = js.native
  @JSName("on")
  def on_cdata(event: cdata, listener: js.ThisFunction1[/* this */ this.type, /* cdata */ String, Unit]): this.type = js.native
  @JSName("on")
  def on_close(event: close, listener: js.ThisFunction0[/* this */ this.type, Unit]): this.type = js.native
  @JSName("on")
  def on_closecdata(event: closecdata, listener: js.ThisFunction0[/* this */ this.type, Unit]): this.type = js.native
  @JSName("on")
  def on_closenamespace(event: closenamespace, listener: js.ThisFunction1[/* this */ this.type, /* ns */ AnonPrefix, Unit]): this.type = js.native
  @JSName("on")
  def on_closetag(event: closetag, listener: js.ThisFunction1[/* this */ this.type, /* tagName */ String, Unit]): this.type = js.native
  @JSName("on")
  def on_comment(event: comment, listener: js.ThisFunction1[/* this */ this.type, /* comment */ String, Unit]): this.type = js.native
  @JSName("on")
  def on_data(event: data, listener: js.ThisFunction1[/* this */ this.type, /* chunk */ js.Any, Unit]): this.type = js.native
  @JSName("on")
  def on_doctype(event: doctype, listener: js.ThisFunction1[/* this */ this.type, /* doctype */ String, Unit]): this.type = js.native
  @JSName("on")
  def on_drain(event: drain, listener: js.ThisFunction0[/* this */ this.type, Unit]): this.type = js.native
  @JSName("on")
  def on_end(event: end, listener: js.ThisFunction0[/* this */ this.type, Unit]): this.type = js.native
  @JSName("on")
  def on_error(event: error, listener: js.ThisFunction1[/* this */ this.type, /* err */ js.Error, Unit]): this.type = js.native
  @JSName("on")
  def on_finish(event: finish, listener: js.ThisFunction0[/* this */ this.type, Unit]): this.type = js.native
  @JSName("on")
  def on_opencdata(event: opencdata, listener: js.ThisFunction0[/* this */ this.type, Unit]): this.type = js.native
  @JSName("on")
  def on_opennamespace(event: opennamespace, listener: js.ThisFunction1[/* this */ this.type, /* ns */ AnonPrefix, Unit]): this.type = js.native
  @JSName("on")
  def on_opentag(
    event: opentag,
    listener: js.ThisFunction1[/* this */ this.type, /* tag */ Tag | QualifiedTag, Unit]
  ): this.type = js.native
  @JSName("on")
  def on_pipe(event: pipe, listener: js.ThisFunction1[/* this */ this.type, /* src */ Readable, Unit]): this.type = js.native
  @JSName("on")
  def on_processinginstruction(
    event: processinginstruction,
    listener: js.ThisFunction1[/* this */ this.type, /* node */ AnonBody, Unit]
  ): this.type = js.native
  @JSName("on")
  def on_readable(event: readable, listener: js.ThisFunction0[/* this */ this.type, Unit]): this.type = js.native
  @JSName("on")
  def on_ready(event: ready, listener: js.ThisFunction0[/* this */ this.type, Unit]): this.type = js.native
  @JSName("on")
  def on_script(event: script, listener: js.ThisFunction1[/* this */ this.type, /* script */ String, Unit]): this.type = js.native
  @JSName("on")
  def on_text(event: text, listener: js.ThisFunction1[/* this */ this.type, /* text */ String, Unit]): this.type = js.native
  @JSName("on")
  def on_unpipe(event: unpipe, listener: js.ThisFunction1[/* this */ this.type, /* src */ Readable, Unit]): this.type = js.native
}

