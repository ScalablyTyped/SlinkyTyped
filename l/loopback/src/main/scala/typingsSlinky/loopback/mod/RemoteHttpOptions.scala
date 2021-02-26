package typingsSlinky.loopback.mod

import typingsSlinky.loopback.loopbackStrings.all
import typingsSlinky.loopback.loopbackStrings.del
import typingsSlinky.loopback.loopbackStrings.get
import typingsSlinky.loopback.loopbackStrings.patch
import typingsSlinky.loopback.loopbackStrings.post
import typingsSlinky.loopback.loopbackStrings.put
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @interface
  * @property {string} path HTTP path (relative to the model) at which the method is exposed.
  * @property {'get' | 'post' | 'patch' | 'put' | 'del' | 'all'} verb HTTP method (verb) at which the method is available.
  * @property {number} status    Default HTTP status set when the callback is called without an error.
  * @property {number} errorStatus    Default HTTP status set when the callback is called with an error.
  */
@js.native
trait RemoteHttpOptions extends StObject {
  
  /**
    * errorStatus    Default HTTP status set when the callback is called with an error.
    * ```
    * {errorStatus: 400}
    * ```
    */
  var errorStatus: js.UndefOr[Double] = js.native
  
  /**
    * HTTP path (relative to the model) at which the method is exposed.
    * ```
    * http: {path: '/sayhi'}
    * ```
    */
  var path: String = js.native
  
  /**
    * status    Default HTTP status set when the callback is called without an error.
    * ```
    * {status: 201}
    * ```
    */
  var status: js.UndefOr[Double] = js.native
  
  /**
    * HTTP method (verb) at which the method is available.
    * ```
    * http: {path: '/sayhi', verb: 'get'}
    * ```
    * default = post
    */
  var verb: get | post | patch | put | del | all = js.native
}
object RemoteHttpOptions {
  
  @scala.inline
  def apply(path: String, verb: get | post | patch | put | del | all): RemoteHttpOptions = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], verb = verb.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoteHttpOptions]
  }
  
  @scala.inline
  implicit class RemoteHttpOptionsMutableBuilder[Self <: RemoteHttpOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setErrorStatus(value: Double): Self = StObject.set(x, "errorStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorStatusUndefined: Self = StObject.set(x, "errorStatus", js.undefined)
    
    @scala.inline
    def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    @scala.inline
    def setVerb(value: get | post | patch | put | del | all): Self = StObject.set(x, "verb", value.asInstanceOf[js.Any])
  }
}
