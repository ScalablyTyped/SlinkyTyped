package typingsSlinky.instagramPrivateApi

import typingsSlinky.instagramPrivateApi.repositoryMod.Repository
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("instagram-private-api/dist/repositories/qe.repository", JSImport.Namespace)
@js.native
object qeRepositoryMod extends js.Object {
  
  @js.native
  class QeRepository () extends Repository {
    
    def sync(experiments: js.Any): js.Promise[_] = js.native
    
    def syncExperiments(): js.Promise[_] = js.native
    
    def syncLoginExperiments(): js.Promise[_] = js.native
  }
}
