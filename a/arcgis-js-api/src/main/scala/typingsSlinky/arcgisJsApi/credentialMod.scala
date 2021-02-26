package typingsSlinky.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typingsSlinky.arcgisJsApi.esri.Credential
import typingsSlinky.arcgisJsApi.esri.CredentialConstructor
import typingsSlinky.arcgisJsApi.esri.CredentialProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object credentialMod extends Shortcut {
  
  @JSImport("esri/identity/Credential", JSImport.Namespace)
  @js.native
  val ^ : CredentialConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/identity/Credential", JSImport.Namespace)
  @js.native
  class Class () extends Credential {
    def this(properties: CredentialProperties) = this()
  }
  
  type _To = CredentialConstructor
  
  /* This means you don't have to write `^`, but can instead just say `credentialMod.foo` */
  override def _to: CredentialConstructor = ^
}
