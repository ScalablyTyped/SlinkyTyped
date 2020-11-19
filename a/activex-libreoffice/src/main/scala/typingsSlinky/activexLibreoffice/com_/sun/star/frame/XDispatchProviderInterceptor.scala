package typingsSlinky.activexLibreoffice.com_.sun.star.frame

import typingsSlinky.activexLibreoffice.LibreOffice.SeqEquiv
import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.util.URL
import typingsSlinky.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * makes it possible to intercept request of {@link XDispatch} .
  *
  * Can be registered as an interceptor by using interface {@link XDispatchProviderInterception} .
  * @see XDispatchProviderInterception
  */
@js.native
trait XDispatchProviderInterceptor extends XDispatchProvider {
  
  /**
    * access to the master {@link XDispatchProvider} of this interceptor
    * @returns the master of this interceptor
    * @see XDispatchProviderInterceptor.setMasterDispatchProvider()
    */
  var MasterDispatchProvider: XDispatchProvider = js.native
  
  /**
    * access to the slave {@link XDispatchProvider} of this interceptor
    * @returns the slave of this interceptor
    * @see XDispatchProviderInterceptor.setSlaveDispatchProvider()
    */
  var SlaveDispatchProvider: XDispatchProvider = js.native
  
  /**
    * access to the master {@link XDispatchProvider} of this interceptor
    * @returns the master of this interceptor
    * @see XDispatchProviderInterceptor.setMasterDispatchProvider()
    */
  def getMasterDispatchProvider(): XDispatchProvider = js.native
  
  /**
    * access to the slave {@link XDispatchProvider} of this interceptor
    * @returns the slave of this interceptor
    * @see XDispatchProviderInterceptor.setSlaveDispatchProvider()
    */
  def getSlaveDispatchProvider(): XDispatchProvider = js.native
  
  /**
    * sets the master {@link XDispatchProvider} , which may forward calls to its {@link XDispatchProvider.queryDispatch()} to this dispatch provider.
    * @param NewSupplier the master of this interceptor
    * @see XDispatchProviderInterceptor.getMasterDispatchProvider()
    */
  def setMasterDispatchProvider(NewSupplier: XDispatchProvider): Unit = js.native
  
  /**
    * sets the slave {@link XDispatchProvider} to which calls to {@link XDispatchProvider.queryDispatch()} can be forwarded under control of this dispatch
    * provider.
    * @param NewDispatchProvider the new slave of this interceptor
    * @see XDispatchProviderInterceptor.getSlaveDispatchProvider()
    */
  def setSlaveDispatchProvider(NewDispatchProvider: XDispatchProvider): Unit = js.native
}
object XDispatchProviderInterceptor {
  
  @scala.inline
  def apply(
    MasterDispatchProvider: XDispatchProvider,
    SlaveDispatchProvider: XDispatchProvider,
    acquire: () => Unit,
    getMasterDispatchProvider: () => XDispatchProvider,
    getSlaveDispatchProvider: () => XDispatchProvider,
    queryDispatch: (URL, String, Double) => XDispatch,
    queryDispatches: SeqEquiv[DispatchDescriptor] => SafeArray[XDispatch],
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setMasterDispatchProvider: XDispatchProvider => Unit,
    setSlaveDispatchProvider: XDispatchProvider => Unit
  ): XDispatchProviderInterceptor = {
    val __obj = js.Dynamic.literal(MasterDispatchProvider = MasterDispatchProvider.asInstanceOf[js.Any], SlaveDispatchProvider = SlaveDispatchProvider.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getMasterDispatchProvider = js.Any.fromFunction0(getMasterDispatchProvider), getSlaveDispatchProvider = js.Any.fromFunction0(getSlaveDispatchProvider), queryDispatch = js.Any.fromFunction3(queryDispatch), queryDispatches = js.Any.fromFunction1(queryDispatches), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setMasterDispatchProvider = js.Any.fromFunction1(setMasterDispatchProvider), setSlaveDispatchProvider = js.Any.fromFunction1(setSlaveDispatchProvider))
    __obj.asInstanceOf[XDispatchProviderInterceptor]
  }
  
  @scala.inline
  implicit class XDispatchProviderInterceptorOps[Self <: XDispatchProviderInterceptor] (val x: Self) extends AnyVal {
    
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
    def setMasterDispatchProvider(value: XDispatchProvider): Self = this.set("MasterDispatchProvider", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSlaveDispatchProvider(value: XDispatchProvider): Self = this.set("SlaveDispatchProvider", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetMasterDispatchProvider(value: () => XDispatchProvider): Self = this.set("getMasterDispatchProvider", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetSlaveDispatchProvider(value: () => XDispatchProvider): Self = this.set("getSlaveDispatchProvider", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetMasterDispatchProvider(value: XDispatchProvider => Unit): Self = this.set("setMasterDispatchProvider", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetSlaveDispatchProvider(value: XDispatchProvider => Unit): Self = this.set("setSlaveDispatchProvider", js.Any.fromFunction1(value))
  }
}
