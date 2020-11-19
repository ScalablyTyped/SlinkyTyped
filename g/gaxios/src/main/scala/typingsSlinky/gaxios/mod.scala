package typingsSlinky.gaxios

import typingsSlinky.gaxios.commonMod.GaxiosOptions
import typingsSlinky.gaxios.commonMod.GaxiosResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("gaxios", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  val instance: typingsSlinky.gaxios.gaxiosMod.Gaxios = js.native
  
  def request[T](opts: GaxiosOptions): js.Promise[GaxiosResponse[T]] = js.native
  
  @js.native
  /**
    * The Gaxios class is responsible for making HTTP requests.
    * @param defaults The default set of options to be used for this instance.
    */
  class Gaxios ()
    extends typingsSlinky.gaxios.gaxiosMod.Gaxios {
    def this(defaults: GaxiosOptions) = this()
  }
  
  @js.native
  class GaxiosError[T] protected ()
    extends typingsSlinky.gaxios.commonMod.GaxiosError[T] {
    def this(message: String, options: GaxiosOptions, response: GaxiosResponse[T]) = this()
  }
}
