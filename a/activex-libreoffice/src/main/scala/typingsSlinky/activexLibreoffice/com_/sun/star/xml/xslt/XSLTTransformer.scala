package typingsSlinky.activexLibreoffice.com_.sun.star.xml.xslt

import typingsSlinky.activexLibreoffice.LibreOffice.SeqEquiv
import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.io.XActiveDataControl
import typingsSlinky.activexLibreoffice.com_.sun.star.io.XActiveDataSink
import typingsSlinky.activexLibreoffice.com_.sun.star.io.XActiveDataSource
import typingsSlinky.activexLibreoffice.com_.sun.star.io.XInputStream
import typingsSlinky.activexLibreoffice.com_.sun.star.io.XOutputStream
import typingsSlinky.activexLibreoffice.com_.sun.star.io.XStreamListener
import typingsSlinky.activexLibreoffice.com_.sun.star.lang.XInitialization
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Get unspecified XSLT filter transformer.
  *
  * It is not safe to expect support for any features except XSLT 1.0 .
  * @since LibreOffice 4.0
  */
@js.native
trait XSLTTransformer
  extends XActiveDataControl
     with XActiveDataSink
     with XActiveDataSource
     with XInitialization {
  
  def create(args: SeqEquiv[_]): Unit = js.native
}
object XSLTTransformer {
  
  @scala.inline
  def apply(
    InputStream: XInputStream,
    OutputStream: XOutputStream,
    acquire: () => Unit,
    addListener: XStreamListener => Unit,
    create: SeqEquiv[_] => Unit,
    getInputStream: () => XInputStream,
    getOutputStream: () => XOutputStream,
    initialize: SeqEquiv[_] => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeListener: XStreamListener => Unit,
    setInputStream: XInputStream => Unit,
    setOutputStream: XOutputStream => Unit,
    start: () => Unit,
    terminate: () => Unit
  ): XSLTTransformer = {
    val __obj = js.Dynamic.literal(InputStream = InputStream.asInstanceOf[js.Any], OutputStream = OutputStream.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addListener = js.Any.fromFunction1(addListener), create = js.Any.fromFunction1(create), getInputStream = js.Any.fromFunction0(getInputStream), getOutputStream = js.Any.fromFunction0(getOutputStream), initialize = js.Any.fromFunction1(initialize), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeListener = js.Any.fromFunction1(removeListener), setInputStream = js.Any.fromFunction1(setInputStream), setOutputStream = js.Any.fromFunction1(setOutputStream), start = js.Any.fromFunction0(start), terminate = js.Any.fromFunction0(terminate))
    __obj.asInstanceOf[XSLTTransformer]
  }
  
  @scala.inline
  implicit class XSLTTransformerOps[Self <: XSLTTransformer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCreate(value: SeqEquiv[_] => Unit): Self = this.set("create", js.Any.fromFunction1(value))
  }
}
