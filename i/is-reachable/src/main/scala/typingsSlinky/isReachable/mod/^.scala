package typingsSlinky.isReachable.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("is-reachable", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  /**
  Check if servers are reachable.
  The Node.js version will do a TCP handshake with the target's port. It attempts to detect cases where a router redirects the request to itself.
  The browser version is limited by the fact that browsers cannot connect to arbitrary ports. It only supports HTTP and HTTPS and the check relies on the `/favicon.ico` path being present.
  @param targets - One or more targets to check. Can either be `hostname:port`, a URL like `https://hostname:port` or even just `hostname`. `port` must be specified if protocol is not `http:` or `https:` and defaults to `443`. Protocols other than `http:` and `https:` are not supported.
  @returns Whether any of the `targets` are reachable.
  @example
  ```
  import isReachable = require('is-reachable');
  (async () => {
  	console.log(await isReachable('sindresorhus.com'));
  	//=> true
  	console.log(await isReachable('google.com:80'));
  	//=> true
  })();
  ```
  */
  def apply(targets: String): js.Promise[Boolean] = js.native
  def apply(targets: String, options: Options): js.Promise[Boolean] = js.native
  def apply(targets: js.Array[String]): js.Promise[Boolean] = js.native
  def apply(targets: js.Array[String], options: Options): js.Promise[Boolean] = js.native
}
