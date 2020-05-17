package typingsSlinky.activexMsxml2.MSXML2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Microsoft XML Writer 6.0 */
@js.native
trait MXXMLWriter60 extends js.Object {
  @JSName("MSXML2.MXXMLWriter60_typekey")
  var MSXML2DotMXXMLWriter60_typekey: MXXMLWriter60 = js.native
  /** Determine whether or not to write the byte order mark */
  var byteOrderMark: Boolean = js.native
  /** When enabled, the writer no longer escapes out its input when writing it out. */
  var disableOutputEscaping: Boolean = js.native
  /** Set or get the output encoding. */
  var encoding: String = js.native
  /** Enable or disable auto indent mode. */
  var indent: Boolean = js.native
  /** Determine whether or not to omit the XML declaration. */
  var omitXMLDeclaration: Boolean = js.native
  /** Set or get the output. */
  var output: js.Any = js.native
  /** Set or get the standalone document declaration. */
  var standalone: Boolean = js.native
  /** Set or get the xml version info. */
  var version: String = js.native
  /** Flushes all writer buffers forcing the writer to write to the underlying output object */
  def flush(): Unit = js.native
}

object MXXMLWriter60 {
  @scala.inline
  def apply(
    MSXML2DotMXXMLWriter60_typekey: MXXMLWriter60,
    byteOrderMark: Boolean,
    disableOutputEscaping: Boolean,
    encoding: String,
    flush: () => Unit,
    indent: Boolean,
    omitXMLDeclaration: Boolean,
    output: js.Any,
    standalone: Boolean,
    version: String
  ): MXXMLWriter60 = {
    val __obj = js.Dynamic.literal(byteOrderMark = byteOrderMark.asInstanceOf[js.Any], disableOutputEscaping = disableOutputEscaping.asInstanceOf[js.Any], encoding = encoding.asInstanceOf[js.Any], flush = js.Any.fromFunction0(flush), indent = indent.asInstanceOf[js.Any], omitXMLDeclaration = omitXMLDeclaration.asInstanceOf[js.Any], output = output.asInstanceOf[js.Any], standalone = standalone.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.updateDynamic("MSXML2.MXXMLWriter60_typekey")(MSXML2DotMXXMLWriter60_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[MXXMLWriter60]
  }
  @scala.inline
  implicit class MXXMLWriter60Ops[Self <: MXXMLWriter60] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMSXML2DotMXXMLWriter60_typekey(value: MXXMLWriter60): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MSXML2.MXXMLWriter60_typekey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withByteOrderMark(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("byteOrderMark")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisableOutputEscaping(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableOutputEscaping")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEncoding(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encoding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFlush(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flush")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIndent(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOmitXMLDeclaration(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("omitXMLDeclaration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOutput(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("output")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStandalone(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("standalone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

