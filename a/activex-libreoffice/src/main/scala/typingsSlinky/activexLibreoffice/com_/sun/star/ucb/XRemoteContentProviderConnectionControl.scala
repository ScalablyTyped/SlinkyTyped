package typingsSlinky.activexLibreoffice.com_.sun.star.ucb

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A simple mechanism to find out if the connection between a remote content provider distributor and acceptor gets lost.
  *
  * This interface should be supported by the **DoneListener** parameter of {@link XRemoteContentProviderAcceptor.addRemoteContentProvider()} .
  * @author Stephan Bergmann
  * @version 1.0
  */
@js.native
trait XRemoteContentProviderConnectionControl extends XInterface {
  
  /**
    * Enable connection control, using as a token some object implemented on the remote content provider acceptor's side.
    *
    * The implementation of this interface must hold a reference to the supplied token. If the connection gets lost, the reference count of the token will
    * drop, which the remote content provider acceptor can observe.
    * @param Acceptor The remote content provider acceptor on the other side of the connection.
    * @param Token Some object implemented on the remote content provider acceptor's side of the connection.
    */
  def enableConnectionControl(Acceptor: XRemoteContentProviderAcceptor, Token: XInterface): Unit = js.native
}
object XRemoteContentProviderConnectionControl {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    enableConnectionControl: (XRemoteContentProviderAcceptor, XInterface) => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XRemoteContentProviderConnectionControl = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), enableConnectionControl = js.Any.fromFunction2(enableConnectionControl), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XRemoteContentProviderConnectionControl]
  }
  
  @scala.inline
  implicit class XRemoteContentProviderConnectionControlOps[Self <: XRemoteContentProviderConnectionControl] (val x: Self) extends AnyVal {
    
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
    def setEnableConnectionControl(value: (XRemoteContentProviderAcceptor, XInterface) => Unit): Self = this.set("enableConnectionControl", js.Any.fromFunction2(value))
  }
}
