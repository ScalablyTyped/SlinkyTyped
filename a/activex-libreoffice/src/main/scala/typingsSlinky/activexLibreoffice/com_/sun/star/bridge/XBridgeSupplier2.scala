package typingsSlinky.activexLibreoffice.com_.sun.star.bridge

import typingsSlinky.activexLibreoffice.LibreOffice.SeqEquiv
import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * defines the interface for creating bridges to other object models.
  *
  * The created bridges are transparent to the user. That is, if one maps an interface into the target model, then the resulting target interface is a
  * bridge implementation, that is not being noticed by an user. During a call on that interface, the bridge is invoked to convert the arguments and carry
  * out a call according to the rules of the source model. Return values are automatically mapped to the types of the target model.
  *
  * Simple types are mapped to simple target types. That is, there is no additional bridging code involved when those types are being used.
  *
  * Sometimes a bridge cannot be created, depending on whether a programm uses the {@link XBridgeSupplier2} interface remotely. Assuming one wants to
  * bridge an OLE Automation object to UNO by calling createBridge on a proxy, then the UNO remote bridge would not recognise that the Any argument
  * contains an IDispatch interface. Therefore it cannot marshal it as COM requires it and the bridgeing would fail. To prevent this, implementations of
  * this interface should be aware of this scenario and if necessary take the appropriate steps. The process ID argument to the createBridge function
  * represents the calling process and may be used by the implementation to determine if it is being accessed remotely.
  *
  * All objects, whether they are part of the UNO object model or not, are carried in an `any` . The representation of this object is heavily
  * model-dependent and has to be specified in the following list:
  *
  * **UNO:  **: The any carries normal UNO types, which can be any base type, struct, sequence, enum or interface.;
  *
  * **OLE:  **: The any carries an `unsigned long` (on 32-bit systems) or an `unsigned hyper` (on 64-bit systems), which is interpreted as a variant
  * pointer. The any does not control the lifetime of the represented variant. That implies that the caller has the responsibility of freeing the OLE
  * resources represented by the any value.;
  *
  * **JAVA:  **: not specified yet.;
  *
  * **CORBA:  **: not specified yet.
  *
  *
  *
  * Any implementation can supply its own bridges to other object models by implementing this interface and returning the bridge when the method {@link
  * XBridgeSupplier2.createBridge()} is called with itself as the first parameter.
  * @see com.sun.star.bridge.OleBridgeSupplier2
  */
@js.native
trait XBridgeSupplier2 extends XInterface {
  
  /** creates a bridge to provide an object of one object model with another. */
  def createBridge(
    aModelDepObject: js.Any,
    aProcessId: SeqEquiv[Double],
    nSourceModelType: Double,
    nDestModelType: Double
  ): js.Any = js.native
}
object XBridgeSupplier2 {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    createBridge: (js.Any, SeqEquiv[Double], Double, Double) => js.Any,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XBridgeSupplier2 = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), createBridge = js.Any.fromFunction4(createBridge), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XBridgeSupplier2]
  }
  
  @scala.inline
  implicit class XBridgeSupplier2Ops[Self <: XBridgeSupplier2] (val x: Self) extends AnyVal {
    
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
    def setCreateBridge(value: (js.Any, SeqEquiv[Double], Double, Double) => js.Any): Self = this.set("createBridge", js.Any.fromFunction4(value))
  }
}
