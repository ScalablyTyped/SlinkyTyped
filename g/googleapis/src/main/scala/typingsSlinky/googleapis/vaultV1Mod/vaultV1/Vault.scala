package typingsSlinky.googleapis.vaultV1Mod.vaultV1

import typingsSlinky.googleapisCommon.apiMod.APIRequestContext
import typingsSlinky.googleapisCommon.apiMod.GlobalOptions
import typingsSlinky.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * G Suite Vault API
  *
  * Archiving and eDiscovery for G Suite.
  *
  * @example
  * const {google} = require('googleapis');
  * const vault = google.vault('v1');
  *
  * @namespace vault
  * @type {Function}
  * @version v1
  * @variation v1
  * @param {object=} options Options for Vault
  */
@JSImport("googleapis/build/src/apis/vault/v1", "vault_v1.Vault")
@js.native
class Vault protected () extends StObject {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  
  var context: APIRequestContext = js.native
  
  var matters: ResourceMatters = js.native
}
