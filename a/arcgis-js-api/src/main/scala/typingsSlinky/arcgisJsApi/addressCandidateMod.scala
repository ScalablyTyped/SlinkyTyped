package typingsSlinky.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typingsSlinky.arcgisJsApi.esri.AddressCandidate
import typingsSlinky.arcgisJsApi.esri.AddressCandidateConstructor
import typingsSlinky.arcgisJsApi.esri.AddressCandidateProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object addressCandidateMod extends Shortcut {
  
  @JSImport("esri/tasks/support/AddressCandidate", JSImport.Namespace)
  @js.native
  val ^ : AddressCandidateConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/tasks/support/AddressCandidate", JSImport.Namespace)
  @js.native
  class Class () extends AddressCandidate {
    def this(properties: AddressCandidateProperties) = this()
  }
  
  type _To = AddressCandidateConstructor
  
  /* This means you don't have to write `^`, but can instead just say `addressCandidateMod.foo` */
  override def _to: AddressCandidateConstructor = ^
}
