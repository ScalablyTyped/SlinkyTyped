package typingsSlinky.easyXHeaders.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Ares extends StObject {
  
  var ares: String = js.native
  
  var http_parser: String = js.native
  
  var node: String = js.native
  
  var openssl: String = js.native
  
  var uv: String = js.native
  
  var v8: String = js.native
  
  var zlib: String = js.native
}
object Ares {
  
  @scala.inline
  def apply(
    ares: String,
    http_parser: String,
    node: String,
    openssl: String,
    uv: String,
    v8: String,
    zlib: String
  ): Ares = {
    val __obj = js.Dynamic.literal(ares = ares.asInstanceOf[js.Any], http_parser = http_parser.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], openssl = openssl.asInstanceOf[js.Any], uv = uv.asInstanceOf[js.Any], v8 = v8.asInstanceOf[js.Any], zlib = zlib.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ares]
  }
  
  @scala.inline
  implicit class AresMutableBuilder[Self <: Ares] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAres(value: String): Self = StObject.set(x, "ares", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHttp_parser(value: String): Self = StObject.set(x, "http_parser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNode(value: String): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpenssl(value: String): Self = StObject.set(x, "openssl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUv(value: String): Self = StObject.set(x, "uv", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setV8(value: String): Self = StObject.set(x, "v8", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZlib(value: String): Self = StObject.set(x, "zlib", value.asInstanceOf[js.Any])
  }
}
