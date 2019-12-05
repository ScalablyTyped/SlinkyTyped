package typingsSlinky.gaxios

import typingsSlinky.gaxios.buildSrcCommonMod.GaxiosOptions
import typingsSlinky.gaxios.buildSrcCommonMod.GaxiosResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gaxios", JSImport.Namespace)
@js.native
object gaxiosMod extends js.Object {
  @js.native
  /**
    * The Gaxios class is responsible for making HTTP requests.
    * @param defaults The default set of options to be used for this instance.
    */
  class Gaxios ()
    extends typingsSlinky.gaxios.buildSrcGaxiosMod.Gaxios {
    def this(defaults: GaxiosOptions) = this()
  }
  
  @js.native
  class GaxiosError[T] protected ()
    extends typingsSlinky.gaxios.buildSrcCommonMod.GaxiosError[T] {
    def this(message: String, options: GaxiosOptions, response: GaxiosResponse[T]) = this()
  }
  
  val instance: typingsSlinky.gaxios.buildSrcGaxiosMod.Gaxios = js.native
  def request[T](opts: GaxiosOptions): js.Promise[GaxiosResponse[T]] = js.native
}

