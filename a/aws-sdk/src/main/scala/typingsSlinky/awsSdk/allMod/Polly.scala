package typingsSlinky.awsSdk.allMod

import typingsSlinky.awsSdk.pollyMod.ClientConfiguration
import typingsSlinky.awsSdk.pollyMod.^
import typingsSlinky.awsSdk.presignerMod.Presigner.PresignerOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("aws-sdk/clients/all", "Polly")
@js.native
/**
  * Constructs a service object. This object has one method for each API operation.
  */
class Polly () extends ^ {
  def this(options: ClientConfiguration) = this()
}
object Polly {
  
  @JSImport("aws-sdk/clients/all", "Polly.Presigner")
  @js.native
  /**
    * Creates a presigner object with a set of configuration options.
    */
  class Presigner ()
    extends typingsSlinky.awsSdk.pollyMod.Presigner {
    def this(options: PresignerOptions) = this()
  }
}
