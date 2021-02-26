package typingsSlinky.dynogels.mod.AWS

import typingsSlinky.awsSdk.pollyMod.ClientConfiguration
import typingsSlinky.awsSdk.presignerMod.Presigner.PresignerOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("dynogels", "AWS.Polly")
@js.native
/**
  * Constructs a service object. This object has one method for each API operation.
  */
class Polly ()
  extends typingsSlinky.awsSdk.mod.Polly {
  def this(options: ClientConfiguration) = this()
}
object Polly {
  
  @JSImport("dynogels", "AWS.Polly.Presigner")
  @js.native
  /**
    * Creates a presigner object with a set of configuration options.
    */
  class Presigner ()
    extends typingsSlinky.awsSdk.mod.Polly.Presigner {
    def this(options: PresignerOptions) = this()
  }
}
