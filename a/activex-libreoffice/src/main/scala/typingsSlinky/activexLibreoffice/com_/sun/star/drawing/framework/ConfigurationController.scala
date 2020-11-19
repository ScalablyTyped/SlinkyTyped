package typingsSlinky.activexLibreoffice.com_.sun.star.drawing.framework

import typingsSlinky.activexLibreoffice.com_.sun.star.frame.XController
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * See {@link XConfigurationController} for a description of the configuration controller.
  *
  * This service is used at the moment by the {@link XControllerManager} to create a configuration controller. This allows developers to replace the
  * default implementation of the configuration controller with their own. This may not be a useful feature. Furthermore the sub controllers may need a
  * tighter coupling than the interfaces allow. These are reasons for removing this service in the future and let the controller manager create the sub
  * controllers directly.
  */
@js.native
trait ConfigurationController extends XConfigurationController {
  
  def create(xController: XController): Unit = js.native
}
object ConfigurationController {
  
  @scala.inline
  def apply(
    CurrentConfiguration: XConfiguration,
    RequestedConfiguration: XConfiguration,
    addConfigurationChangeListener: (XConfigurationChangeListener, String, js.Any) => Unit,
    addResourceFactory: (String, XResourceFactory) => Unit,
    create: XController => Unit,
    getCurrentConfiguration: () => XConfiguration,
    getRequestedConfiguration: () => XConfiguration,
    getResource: XResourceId => XResource,
    getResourceFactory: String => XResourceFactory,
    hasPendingRequests: () => Boolean,
    lock: () => Unit,
    notifyEvent: ConfigurationChangeEvent => Unit,
    postChangeRequest: XConfigurationChangeRequest => Unit,
    removeConfigurationChangeListener: XConfigurationChangeListener => Unit,
    removeResourceFactoryForReference: XResourceFactory => Unit,
    removeResourceFactoryForURL: String => Unit,
    requestResourceActivation: (XResourceId, ResourceActivationMode) => Unit,
    requestResourceDeactivation: XResourceId => Unit,
    restoreConfiguration: XConfiguration => Unit,
    unlock: () => Unit,
    update: () => Unit
  ): ConfigurationController = {
    val __obj = js.Dynamic.literal(CurrentConfiguration = CurrentConfiguration.asInstanceOf[js.Any], RequestedConfiguration = RequestedConfiguration.asInstanceOf[js.Any], addConfigurationChangeListener = js.Any.fromFunction3(addConfigurationChangeListener), addResourceFactory = js.Any.fromFunction2(addResourceFactory), create = js.Any.fromFunction1(create), getCurrentConfiguration = js.Any.fromFunction0(getCurrentConfiguration), getRequestedConfiguration = js.Any.fromFunction0(getRequestedConfiguration), getResource = js.Any.fromFunction1(getResource), getResourceFactory = js.Any.fromFunction1(getResourceFactory), hasPendingRequests = js.Any.fromFunction0(hasPendingRequests), lock = js.Any.fromFunction0(lock), notifyEvent = js.Any.fromFunction1(notifyEvent), postChangeRequest = js.Any.fromFunction1(postChangeRequest), removeConfigurationChangeListener = js.Any.fromFunction1(removeConfigurationChangeListener), removeResourceFactoryForReference = js.Any.fromFunction1(removeResourceFactoryForReference), removeResourceFactoryForURL = js.Any.fromFunction1(removeResourceFactoryForURL), requestResourceActivation = js.Any.fromFunction2(requestResourceActivation), requestResourceDeactivation = js.Any.fromFunction1(requestResourceDeactivation), restoreConfiguration = js.Any.fromFunction1(restoreConfiguration), unlock = js.Any.fromFunction0(unlock), update = js.Any.fromFunction0(update))
    __obj.asInstanceOf[ConfigurationController]
  }
  
  @scala.inline
  implicit class ConfigurationControllerOps[Self <: ConfigurationController] (val x: Self) extends AnyVal {
    
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
    def setCreate(value: XController => Unit): Self = this.set("create", js.Any.fromFunction1(value))
  }
}
