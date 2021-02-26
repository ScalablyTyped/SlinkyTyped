package typingsSlinky.activexMsxml2.MSXML2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Microsoft HTML Writer 6.0 */
@js.native
trait MXHTMLWriter60 extends StObject {
  
  @JSName("MSXML2.MXHTMLWriter60_typekey")
  var MSXML2DotMXHTMLWriter60_typekey: MXHTMLWriter60 = js.native
  
  /** Determine whether or not to write the byte order mark */
  var byteOrderMark: Boolean = js.native
  
  /** When enabled, the writer no longer escapes out its input when writing it out. */
  var disableOutputEscaping: Boolean = js.native
  
  /** Set or get the output encoding. */
  var encoding: String = js.native
  
  /** Flushes all writer buffers forcing the writer to write to the underlying output object */
  def flush(): Unit = js.native
  
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
}
object MXHTMLWriter60 {
  
  @scala.inline
  def apply(
    MSXML2DotMXHTMLWriter60_typekey: MXHTMLWriter60,
    byteOrderMark: Boolean,
    disableOutputEscaping: Boolean,
    encoding: String,
    flush: () => Unit,
    indent: Boolean,
    omitXMLDeclaration: Boolean,
    output: js.Any,
    standalone: Boolean,
    version: String
  ): MXHTMLWriter60 = {
    val __obj = js.Dynamic.literal(byteOrderMark = byteOrderMark.asInstanceOf[js.Any], disableOutputEscaping = disableOutputEscaping.asInstanceOf[js.Any], encoding = encoding.asInstanceOf[js.Any], flush = js.Any.fromFunction0(flush), indent = indent.asInstanceOf[js.Any], omitXMLDeclaration = omitXMLDeclaration.asInstanceOf[js.Any], output = output.asInstanceOf[js.Any], standalone = standalone.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.updateDynamic("MSXML2.MXHTMLWriter60_typekey")(MSXML2DotMXHTMLWriter60_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[MXHTMLWriter60]
  }
  
  @scala.inline
  implicit class MXHTMLWriter60MutableBuilder[Self <: MXHTMLWriter60] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setByteOrderMark(value: Boolean): Self = StObject.set(x, "byteOrderMark", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableOutputEscaping(value: Boolean): Self = StObject.set(x, "disableOutputEscaping", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncoding(value: String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlush(value: () => Unit): Self = StObject.set(x, "flush", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIndent(value: Boolean): Self = StObject.set(x, "indent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMSXML2DotMXHTMLWriter60_typekey(value: MXHTMLWriter60): Self = StObject.set(x, "MSXML2.MXHTMLWriter60_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOmitXMLDeclaration(value: Boolean): Self = StObject.set(x, "omitXMLDeclaration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutput(value: js.Any): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStandalone(value: Boolean): Self = StObject.set(x, "standalone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
