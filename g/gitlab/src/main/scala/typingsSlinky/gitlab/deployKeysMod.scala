package typingsSlinky.gitlab

import typingsSlinky.gitlab.anon.projectIdstringnumberunde
import typingsSlinky.gitlab.baseServiceMod.BaseServiceOptions
import typingsSlinky.gitlab.infrastructureMod.BaseService
import typingsSlinky.gitlab.requestHelperMod.BaseRequestOptions
import typingsSlinky.gitlab.requestHelperMod.GetResponse
import typingsSlinky.gitlab.requestHelperMod.Sudo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object deployKeysMod {
  
  @JSImport("gitlab/dist/types/core/services/DeployKeys", "DeployKeys")
  @js.native
  class DeployKeys () extends BaseService {
    def this(hasTokenJobTokenOauthTokenSudoProfileTokenProfileModeHostUrlVersionCamelizeRejectUnauthorizedRequesterRequestTimeout: BaseServiceOptions) = this()
    
    def add(projectId: String): js.Promise[js.Object] = js.native
    def add(projectId: String, options: Sudo): js.Promise[js.Object] = js.native
    def add(projectId: Double): js.Promise[js.Object] = js.native
    def add(projectId: Double, options: Sudo): js.Promise[js.Object] = js.native
    
    def all(hasProjectIdOptions: projectIdstringnumberunde): js.Promise[GetResponse] = js.native
    
    def edit(projectId: String, keyId: String): js.Promise[js.Object] = js.native
    def edit(projectId: String, keyId: String, options: BaseRequestOptions): js.Promise[js.Object] = js.native
    def edit(projectId: Double, keyId: String): js.Promise[js.Object] = js.native
    def edit(projectId: Double, keyId: String, options: BaseRequestOptions): js.Promise[js.Object] = js.native
    
    def enable(projectId: String, keyId: String): js.Promise[js.Object] = js.native
    def enable(projectId: String, keyId: String, options: Sudo): js.Promise[js.Object] = js.native
    def enable(projectId: Double, keyId: String): js.Promise[js.Object] = js.native
    def enable(projectId: Double, keyId: String, options: Sudo): js.Promise[js.Object] = js.native
    
    def remove(projectId: String, keyId: String): js.Promise[js.Object] = js.native
    def remove(projectId: String, keyId: String, options: Sudo): js.Promise[js.Object] = js.native
    def remove(projectId: Double, keyId: String): js.Promise[js.Object] = js.native
    def remove(projectId: Double, keyId: String, options: Sudo): js.Promise[js.Object] = js.native
    
    def show(projectId: String, keyId: String): js.Promise[GetResponse] = js.native
    def show(projectId: String, keyId: String, options: Sudo): js.Promise[GetResponse] = js.native
    def show(projectId: Double, keyId: String): js.Promise[GetResponse] = js.native
    def show(projectId: Double, keyId: String, options: Sudo): js.Promise[GetResponse] = js.native
  }
}
