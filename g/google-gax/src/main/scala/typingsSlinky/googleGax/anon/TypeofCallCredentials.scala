package typingsSlinky.googleGax.anon

import org.scalablytyped.runtime.Instantiable0
import typingsSlinky.grpcGrpcJs.callCredentialsMod.CallMetadataGenerator
import typingsSlinky.grpcGrpcJs.mod.CallCredentials
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofCallCredentials extends Instantiable0[CallCredentials] {
  def createEmpty(): typingsSlinky.grpcGrpcJs.callCredentialsMod.CallCredentials = js.native
  /**
    * Creates a new CallCredentials object from a given function that generates
    * Metadata objects.
    * @param metadataGenerator A function that accepts a set of options, and
    * generates a Metadata object based on these options, which is passed back
    * to the caller via a supplied (err, metadata) callback.
    */
  def createFromMetadataGenerator(metadataGenerator: CallMetadataGenerator): typingsSlinky.grpcGrpcJs.callCredentialsMod.CallCredentials = js.native
}

