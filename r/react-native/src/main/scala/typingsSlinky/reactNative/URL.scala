package typingsSlinky.reactNative

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Based on definition from lib.dom but using class syntax.
  * The properties are mutable to support users that use a `URL` polyfill, but the implementation
  * built into React Native (as of 0.63) does not implement all the properties.
  */
@js.native
trait URL extends StObject {
  
  var hash: String = js.native
  
  var host: String = js.native
  
  var hostname: String = js.native
  
  var href: String = js.native
  
  val origin: String = js.native
  
  var password: String = js.native
  
  var pathname: String = js.native
  
  var port: String = js.native
  
  var protocol: String = js.native
  
  var search: String = js.native
  
  val searchParams: URLSearchParams = js.native
  
  def toJSON(): String = js.native
  
  var username: String = js.native
}
object URL {
  
  @scala.inline
  def apply(
    hash: String,
    host: String,
    hostname: String,
    href: String,
    origin: String,
    password: String,
    pathname: String,
    port: String,
    protocol: String,
    search: String,
    searchParams: URLSearchParams,
    toJSON: () => String,
    username: String
  ): URL = {
    val __obj = js.Dynamic.literal(hash = hash.asInstanceOf[js.Any], host = host.asInstanceOf[js.Any], hostname = hostname.asInstanceOf[js.Any], href = href.asInstanceOf[js.Any], origin = origin.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any], pathname = pathname.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any], search = search.asInstanceOf[js.Any], searchParams = searchParams.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON), username = username.asInstanceOf[js.Any])
    __obj.asInstanceOf[URL]
  }
  
  @scala.inline
  implicit class URLMutableBuilder[Self <: URL] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHash(value: String): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHostname(value: String): Self = StObject.set(x, "hostname", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHref(value: String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrigin(value: String): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathname(value: String): Self = StObject.set(x, "pathname", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPort(value: String): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSearch(value: String): Self = StObject.set(x, "search", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSearchParams(value: URLSearchParams): Self = StObject.set(x, "searchParams", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToJSON(value: () => String): Self = StObject.set(x, "toJSON", js.Any.fromFunction0(value))
    
    @scala.inline
    def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
  }
}
