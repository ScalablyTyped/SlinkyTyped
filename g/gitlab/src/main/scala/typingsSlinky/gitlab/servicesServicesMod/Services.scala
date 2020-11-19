package typingsSlinky.gitlab.servicesServicesMod

import typingsSlinky.gitlab.infrastructureMod.BaseService
import typingsSlinky.gitlab.requestHelperMod.BaseRequestOptions
import typingsSlinky.gitlab.requestHelperMod.GetResponse
import typingsSlinky.gitlab.requestHelperMod.Sudo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("gitlab/dist/types/core/services/Services", "Services")
@js.native
class Services () extends BaseService {
  
  def edit(projectId: String, serviceName: SupportedService): js.Promise[js.Object] = js.native
  def edit(projectId: String, serviceName: SupportedService, options: BaseRequestOptions): js.Promise[js.Object] = js.native
  def edit(projectId: Double, serviceName: SupportedService): js.Promise[js.Object] = js.native
  def edit(projectId: Double, serviceName: SupportedService, options: BaseRequestOptions): js.Promise[js.Object] = js.native
  
  def remove(projectId: String, serviceName: SupportedService): js.Promise[js.Object] = js.native
  def remove(projectId: String, serviceName: SupportedService, options: Sudo): js.Promise[js.Object] = js.native
  def remove(projectId: Double, serviceName: SupportedService): js.Promise[js.Object] = js.native
  def remove(projectId: Double, serviceName: SupportedService, options: Sudo): js.Promise[js.Object] = js.native
  
  def show(projectId: String, serviceName: SupportedService): js.Promise[GetResponse] = js.native
  def show(projectId: String, serviceName: SupportedService, options: Sudo): js.Promise[GetResponse] = js.native
  def show(projectId: Double, serviceName: SupportedService): js.Promise[GetResponse] = js.native
  def show(projectId: Double, serviceName: SupportedService, options: Sudo): js.Promise[GetResponse] = js.native
}
