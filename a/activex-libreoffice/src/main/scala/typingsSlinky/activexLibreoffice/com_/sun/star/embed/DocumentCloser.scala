package typingsSlinky.activexLibreoffice.com_.sun.star.embed

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.frame.XFrame
import typingsSlinky.activexLibreoffice.com_.sun.star.lang.XComponent
import typingsSlinky.activexLibreoffice.com_.sun.star.lang.XEventListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The main task of this service is to close an office document frame embedded in an application running in another process correctly.
  *
  * The usual usage of this service is to create it, initialize with document frame, and to dispose the service. While disposing the service will do all
  * the required actions to let the frame be closed using com::sun::star::util::XCloseable::close( true ). Thus in case there is a code that prevents
  * closing of the frame the code automatically becomes the owner of the frame.
  *
  * In addition the code will disconnect the VCL window the frame is based on from the container system window.
  */
@js.native
trait DocumentCloser extends XComponent {
  
  /**
    * is used to initialize the object on it's creation.
    * @param xFrame the frame of the document that should be closed.
    */
  def DocumentCloserCtor1(xFrame: XFrame): Unit = js.native
}
object DocumentCloser {
  
  @scala.inline
  def apply(
    DocumentCloserCtor1: XFrame => Unit,
    acquire: () => Unit,
    addEventListener: XEventListener => Unit,
    dispose: () => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeEventListener: XEventListener => Unit
  ): DocumentCloser = {
    val __obj = js.Dynamic.literal(DocumentCloserCtor1 = js.Any.fromFunction1(DocumentCloserCtor1), acquire = js.Any.fromFunction0(acquire), addEventListener = js.Any.fromFunction1(addEventListener), dispose = js.Any.fromFunction0(dispose), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeEventListener = js.Any.fromFunction1(removeEventListener))
    __obj.asInstanceOf[DocumentCloser]
  }
  
  @scala.inline
  implicit class DocumentCloserOps[Self <: DocumentCloser] (val x: Self) extends AnyVal {
    
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
    def setDocumentCloserCtor1(value: XFrame => Unit): Self = this.set("DocumentCloserCtor1", js.Any.fromFunction1(value))
  }
}
