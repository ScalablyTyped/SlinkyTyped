package typingsSlinky.azdata.mod.nb

import typingsSlinky.azdata.mod.IConnectionProfile
import typingsSlinky.vscode.Thenable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ISession extends StObject {
  
  /**
    * Is change of kernels supported for this session?
    */
  var canChangeKernels: Boolean = js.native
  
  def changeKernel(kernelInfo: IKernelSpec): Thenable[IKernel] = js.native
  
  def configureConnection(connection: IConnectionProfile): Thenable[Unit] = js.native
  
  def configureKernel(kernelInfo: IKernelSpec): Thenable[Unit] = js.native
  
  /**
    * Tracks whether the default kernel failed to load
    * This could be for a reason such as the kernel name not being recognized as a valid kernel;
    */
  var defaultKernelLoaded: js.UndefOr[Boolean] = js.native
  
  /*
    * Unique id of the session.
    */
  val id: String = js.native
  
  /**
    * The kernel.
    *
    * #### Notes
    * This is a read-only property, and can be altered by [changeKernel].
    */
  val kernel: IKernel = js.native
  
  /**
    * The current name associated with the session.
    */
  val name: String = js.native
  
  /**
    * The current path associated with the session.
    */
  val path: String = js.native
  
  /**
    * The status indicates if the kernel is healthy, dead, starting, etc.
    */
  val status: KernelStatus = js.native
  
  /**
    * The type of the session.
    */
  val `type`: String = js.native
}
object ISession {
  
  @scala.inline
  def apply(
    canChangeKernels: Boolean,
    changeKernel: IKernelSpec => Thenable[IKernel],
    configureConnection: IConnectionProfile => Thenable[Unit],
    configureKernel: IKernelSpec => Thenable[Unit],
    id: String,
    kernel: IKernel,
    name: String,
    path: String,
    status: KernelStatus,
    `type`: String
  ): ISession = {
    val __obj = js.Dynamic.literal(canChangeKernels = canChangeKernels.asInstanceOf[js.Any], changeKernel = js.Any.fromFunction1(changeKernel), configureConnection = js.Any.fromFunction1(configureConnection), configureKernel = js.Any.fromFunction1(configureKernel), id = id.asInstanceOf[js.Any], kernel = kernel.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISession]
  }
  
  @scala.inline
  implicit class ISessionMutableBuilder[Self <: ISession] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCanChangeKernels(value: Boolean): Self = StObject.set(x, "canChangeKernels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChangeKernel(value: IKernelSpec => Thenable[IKernel]): Self = StObject.set(x, "changeKernel", js.Any.fromFunction1(value))
    
    @scala.inline
    def setConfigureConnection(value: IConnectionProfile => Thenable[Unit]): Self = StObject.set(x, "configureConnection", js.Any.fromFunction1(value))
    
    @scala.inline
    def setConfigureKernel(value: IKernelSpec => Thenable[Unit]): Self = StObject.set(x, "configureKernel", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDefaultKernelLoaded(value: Boolean): Self = StObject.set(x, "defaultKernelLoaded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultKernelLoadedUndefined: Self = StObject.set(x, "defaultKernelLoaded", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKernel(value: IKernel): Self = StObject.set(x, "kernel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: KernelStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
