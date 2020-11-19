package typingsSlinky.registryAuthToken.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("registry-auth-token", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  /**
    *
    * @param registryUrl - Either the registry url used
    * for matching or a configuration object describing the contents of the .npmrc file
    * @param [options] - a configuration object describing the
    * contents of the .npmrc file.  If an `npmrc` config object was passed in as the
    * first parameter, this parameter is ignored.
    * @returns The `NpmCredentials` object or undefined if no match found.
    */
  def apply(registryUrl: String): NpmCredentials = js.native
  def apply(registryUrl: String, options: AuthOptions): NpmCredentials = js.native
  def apply(registryUrl: AuthOptions): NpmCredentials = js.native
  def apply(registryUrl: AuthOptions, options: AuthOptions): NpmCredentials = js.native
}
