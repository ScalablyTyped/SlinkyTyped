package typingsSlinky.googleAuthLibrary

import typingsSlinky.gaxios.commonMod.GaxiosOptions
import typingsSlinky.gaxios.commonMod.GaxiosPromise
import typingsSlinky.gaxios.commonMod.GaxiosResponse
import typingsSlinky.gaxios.mod.GaxiosError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("google-auth-library/build/src/transporters", JSImport.Namespace)
@js.native
object transportersMod extends js.Object {
  
  @js.native
  class DefaultTransporter () extends js.Object {
    
    /**
      * Configures request options before making a request.
      * @param opts GaxiosOptions options.
      * @return Configured options.
      */
    def configure(): GaxiosOptions = js.native
    def configure(opts: GaxiosOptions): GaxiosOptions = js.native
    
    /**
      * Changes the error to include details from the body.
      */
    var processError: js.Any = js.native
    
    def request[T](opts: GaxiosOptions): Unit = js.native
    def request[T](opts: GaxiosOptions, callback: BodyResponseCallback[T]): Unit = js.native
    /**
      * Makes a request using Gaxios with given options.
      * @param opts GaxiosOptions options.
      * @param callback optional callback that contains GaxiosResponse object.
      * @return GaxiosPromise, assuming no callback is passed.
      */
    @JSName("request")
    def request_T_GaxiosPromise[T](opts: GaxiosOptions): GaxiosPromise[T] = js.native
  }
  /* static members */
  @js.native
  object DefaultTransporter extends js.Object {
    
    /**
      * Default user agent.
      */
    val USER_AGENT: String = js.native
  }
  
  @js.native
  trait RequestError
    extends GaxiosError[js.Any] {
    
    var errors: js.Array[js.Error] = js.native
  }
  
  @js.native
  trait Transporter extends js.Object {
    
    def request[T](opts: GaxiosOptions): GaxiosPromise[_] | Unit = js.native
    def request[T](opts: GaxiosOptions, callback: BodyResponseCallback[T]): GaxiosPromise[_] | Unit = js.native
    @JSName("request")
    def request_T_GaxiosPromise[T](opts: GaxiosOptions): GaxiosPromise[T] = js.native
    @JSName("request")
    def request_T_Unit[T](opts: GaxiosOptions): Unit = js.native
    @JSName("request")
    def request_T_Unit[T](opts: GaxiosOptions, callback: BodyResponseCallback[T]): Unit = js.native
  }
  
  type BodyResponseCallback[T] = js.Function2[/* err */ js.Error | Null, /* res */ js.UndefOr[GaxiosResponse[T] | Null], Unit]
}
