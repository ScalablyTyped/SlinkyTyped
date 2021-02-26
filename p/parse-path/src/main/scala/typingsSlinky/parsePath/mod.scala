package typingsSlinky.parsePath

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("parse-path", JSImport.Namespace)
  @js.native
  def apply(url: String): ParsedPath = js.native
  
  @js.native
  trait ParsedPath extends StObject {
    
    /** The url hash. */
    var hash: String = js.native
    
    /** The input url. */
    var href: String = js.native
    
    /** The url pathname. */
    var pathname: String = js.native
    
    /** The domain port. */
    var port: Null | Double = js.native
    
    /** The first protocol, `"ssh"` (if the url is a ssh url) or `"file"`. */
    var protocol: Protocol = js.native
    
    /** An array with the url protocols (usually it has one element). */
    var protocols: js.Array[Protocol] = js.native
    
    /** The url querystring, parsed as object. */
    var query: js.Any = js.native
    
    /** The url domain (including subdomains). */
    var resource: String = js.native
    
    /** The url querystring value. */
    var search: String = js.native
    
    /** The authentication user (usually for ssh urls). */
    var user: String = js.native
  }
  object ParsedPath {
    
    @scala.inline
    def apply(
      hash: String,
      href: String,
      pathname: String,
      protocol: Protocol,
      protocols: js.Array[Protocol],
      query: js.Any,
      resource: String,
      search: String,
      user: String
    ): ParsedPath = {
      val __obj = js.Dynamic.literal(hash = hash.asInstanceOf[js.Any], href = href.asInstanceOf[js.Any], pathname = pathname.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any], protocols = protocols.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any], resource = resource.asInstanceOf[js.Any], search = search.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
      __obj.asInstanceOf[ParsedPath]
    }
    
    @scala.inline
    implicit class ParsedPathMutableBuilder[Self <: ParsedPath] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHash(value: String): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHref(value: String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathname(value: String): Self = StObject.set(x, "pathname", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPortNull: Self = StObject.set(x, "port", null)
      
      @scala.inline
      def setProtocol(value: Protocol): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProtocols(value: js.Array[Protocol]): Self = StObject.set(x, "protocols", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProtocolsVarargs(value: Protocol*): Self = StObject.set(x, "protocols", js.Array(value :_*))
      
      @scala.inline
      def setQuery(value: js.Any): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResource(value: String): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSearch(value: String): Self = StObject.set(x, "search", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUser(value: String): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.parsePath.parsePathStrings.http
    - typingsSlinky.parsePath.parsePathStrings.https
    - typingsSlinky.parsePath.parsePathStrings.ssh
    - typingsSlinky.parsePath.parsePathStrings.file
    - typingsSlinky.parsePath.parsePathStrings.git
  */
  trait Protocol extends StObject
  object Protocol {
    
    @scala.inline
    def file: typingsSlinky.parsePath.parsePathStrings.file = "file".asInstanceOf[typingsSlinky.parsePath.parsePathStrings.file]
    
    @scala.inline
    def git: typingsSlinky.parsePath.parsePathStrings.git = "git".asInstanceOf[typingsSlinky.parsePath.parsePathStrings.git]
    
    @scala.inline
    def http: typingsSlinky.parsePath.parsePathStrings.http = "http".asInstanceOf[typingsSlinky.parsePath.parsePathStrings.http]
    
    @scala.inline
    def https: typingsSlinky.parsePath.parsePathStrings.https = "https".asInstanceOf[typingsSlinky.parsePath.parsePathStrings.https]
    
    @scala.inline
    def ssh: typingsSlinky.parsePath.parsePathStrings.ssh = "ssh".asInstanceOf[typingsSlinky.parsePath.parsePathStrings.ssh]
  }
}
