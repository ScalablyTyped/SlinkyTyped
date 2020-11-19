package typingsSlinky.ky

import org.scalajs.dom.experimental.Response
import typingsSlinky.ky.anon.Call
import typingsSlinky.ky.mod.Input
import typingsSlinky.ky.mod.Options
import typingsSlinky.ky.mod.ResponsePromise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ky/umd", JSImport.Namespace)
@js.native
object umdMod extends js.Object {
  
  @js.native
  class HTTPError protected ()
    extends typingsSlinky.ky.mod.HTTPError {
    def this(response: Response) = this()
  }
  
  @js.native
  class TimeoutError ()
    extends typingsSlinky.ky.mod.TimeoutError
  
  @js.native
  object default extends js.Object {
    
    /**
    	Fetch the given `url`.
    	@param url - `Request` object, `URL` object, or URL string.
    	@returns A promise with `Body` method added.
    	@example
    	```
    	import ky from 'ky';
    	(async () => {
    		const parsed = await ky('https://example.com', {json: {foo: true}}).json();
    		console.log(parsed);
    		//=> `{data: '🦄'}`
    	})();
    	```
    	*/
    def apply(url: Input): ResponsePromise = js.native
    def apply(url: Input, options: Options): ResponsePromise = js.native
    
    /**
    	Create a new Ky instance with complete new defaults.
    	@returns A new Ky instance.
    	*/
    def create(defaultOptions: Options): Call = js.native
    
    /**
    	Fetch the given `url` using the option `{method: 'delete'}`.
    	@param url - `Request` object, `URL` object, or URL string.
    	@returns A promise with `Body` methods added.
    	*/
    def delete(url: Input): ResponsePromise = js.native
    def delete(url: Input, options: Options): ResponsePromise = js.native
    
    /**
    	Create a new Ky instance with some defaults overridden with your own.
    	In contrast to `ky.create()`, `ky.extend()` inherits defaults from its parent.
    	@returns A new Ky instance.
    	*/
    def extend(defaultOptions: Options): Call = js.native
    
    /**
    	Fetch the given `url` using the option `{method: 'get'}`.
    	@param url - `Request` object, `URL` object, or URL string.
    	@returns A promise with `Body` methods added.
    	*/
    def get(url: Input): ResponsePromise = js.native
    def get(url: Input, options: Options): ResponsePromise = js.native
    
    /**
    	Fetch the given `url` using the option `{method: 'head'}`.
    	@param url - `Request` object, `URL` object, or URL string.
    	@returns A promise with `Body` methods added.
    	*/
    def head(url: Input): ResponsePromise = js.native
    def head(url: Input, options: Options): ResponsePromise = js.native
    
    /**
    	Fetch the given `url` using the option `{method: 'patch'}`.
    	@param url - `Request` object, `URL` object, or URL string.
    	@returns A promise with `Body` methods added.
    	*/
    def patch(url: Input): ResponsePromise = js.native
    def patch(url: Input, options: Options): ResponsePromise = js.native
    
    /**
    	Fetch the given `url` using the option `{method: 'post'}`.
    	@param url - `Request` object, `URL` object, or URL string.
    	@returns A promise with `Body` methods added.
    	*/
    def post(url: Input): ResponsePromise = js.native
    def post(url: Input, options: Options): ResponsePromise = js.native
    
    /**
    	Fetch the given `url` using the option `{method: 'put'}`.
    	@param url - `Request` object, `URL` object, or URL string.
    	@returns A promise with `Body` methods added.
    	*/
    def put(url: Input): ResponsePromise = js.native
    def put(url: Input, options: Options): ResponsePromise = js.native
    
    /**
    	A `Symbol` that can be returned by a `beforeRetry` hook to stop the retry.
    	This will also short circuit the remaining `beforeRetry` hooks.
    	@example
    	```
    	import ky from 'ky';
    	(async () => {
    		await ky('https://example.com', {
    			hooks: {
    				beforeRetry: [
    					async (request, options, errors, retryCount) => {
    						const shouldStopRetry = await ky('https://example.com/api');
    						if (shouldStopRetry) {
    							return ky.stop;
    						}
    					}
    				]
    			}
    		});
    	})();
    	```
    	*/
    val stop: js.Symbol = js.native
  }
}
