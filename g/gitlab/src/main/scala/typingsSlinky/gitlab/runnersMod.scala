package typingsSlinky.gitlab

import typingsSlinky.gitlab.anon.projectIdstringnumberPagi
import typingsSlinky.gitlab.baseServiceMod.BaseServiceOptions
import typingsSlinky.gitlab.infrastructureMod.BaseService
import typingsSlinky.gitlab.requestHelperMod.BaseRequestOptions
import typingsSlinky.gitlab.requestHelperMod.GetResponse
import typingsSlinky.gitlab.requestHelperMod.Sudo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object runnersMod {
  
  @JSImport("gitlab/dist/types/core/services/Runners", "Runners")
  @js.native
  class Runners () extends BaseService {
    def this(hasTokenJobTokenOauthTokenSudoProfileTokenProfileModeHostUrlVersionCamelizeRejectUnauthorizedRequesterRequestTimeout: BaseServiceOptions) = this()
    
    def all(hasProjectIdOptions: projectIdstringnumberPagi): js.Promise[GetResponse] = js.native
    
    def allOwned(): js.Promise[GetResponse] = js.native
    def allOwned(options: BaseRequestOptions): js.Promise[GetResponse] = js.native
    
    def disable(projectId: String, runnerId: Double): js.Promise[js.Object] = js.native
    def disable(projectId: String, runnerId: Double, options: Sudo): js.Promise[js.Object] = js.native
    def disable(projectId: Double, runnerId: Double): js.Promise[js.Object] = js.native
    def disable(projectId: Double, runnerId: Double, options: Sudo): js.Promise[js.Object] = js.native
    
    def edit(runnerId: Double): js.Promise[js.Object] = js.native
    def edit(runnerId: Double, options: BaseRequestOptions): js.Promise[js.Object] = js.native
    
    def enable(projectId: String, runnerId: Double): js.Promise[js.Object] = js.native
    def enable(projectId: String, runnerId: Double, options: Sudo): js.Promise[js.Object] = js.native
    def enable(projectId: Double, runnerId: Double): js.Promise[js.Object] = js.native
    def enable(projectId: Double, runnerId: Double, options: Sudo): js.Promise[js.Object] = js.native
    
    def jobs(runnerId: Double): js.Promise[GetResponse] = js.native
    def jobs(runnerId: Double, options: Sudo): js.Promise[GetResponse] = js.native
    
    def remove(runnerId: Double): js.Promise[js.Object] = js.native
    def remove(runnerId: Double, options: Sudo): js.Promise[js.Object] = js.native
    
    def show(runnerId: Double): js.Promise[GetResponse] = js.native
    def show(runnerId: Double, options: Sudo): js.Promise[GetResponse] = js.native
  }
  
  @js.native
  trait RunnerSchema extends StObject {
    
    var active: Boolean = js.native
    
    var description: String = js.native
    
    var id: Double = js.native
    
    var ip_address: String = js.native
    
    var is_shared: Boolean = js.native
    
    var name: String = js.native
    
    var online: Boolean = js.native
    
    var status: String = js.native
  }
  object RunnerSchema {
    
    @scala.inline
    def apply(
      active: Boolean,
      description: String,
      id: Double,
      ip_address: String,
      is_shared: Boolean,
      name: String,
      online: Boolean,
      status: String
    ): RunnerSchema = {
      val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], ip_address = ip_address.asInstanceOf[js.Any], is_shared = is_shared.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], online = online.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[RunnerSchema]
    }
    
    @scala.inline
    implicit class RunnerSchemaMutableBuilder[Self <: RunnerSchema] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIp_address(value: String): Self = StObject.set(x, "ip_address", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIs_shared(value: Boolean): Self = StObject.set(x, "is_shared", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnline(value: Boolean): Self = StObject.set(x, "online", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    }
  }
}
