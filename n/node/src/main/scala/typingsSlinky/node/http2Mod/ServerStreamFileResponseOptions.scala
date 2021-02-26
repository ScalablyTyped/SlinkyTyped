package typingsSlinky.node.http2Mod

import typingsSlinky.node.fsMod.Stats
import typingsSlinky.node.httpMod.OutgoingHttpHeaders
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ServerStreamFileResponseOptions extends StObject {
  
  var length: js.UndefOr[Double] = js.native
  
  var offset: js.UndefOr[Double] = js.native
  
  var statCheck: js.UndefOr[
    js.Function3[
      /* stats */ Stats, 
      /* headers */ OutgoingHttpHeaders, 
      /* statOptions */ StatOptions, 
      Unit | Boolean
    ]
  ] = js.native
  
  var waitForTrailers: js.UndefOr[Boolean] = js.native
}
object ServerStreamFileResponseOptions {
  
  @scala.inline
  def apply(): ServerStreamFileResponseOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServerStreamFileResponseOptions]
  }
  
  @scala.inline
  implicit class ServerStreamFileResponseOptionsMutableBuilder[Self <: ServerStreamFileResponseOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
    
    @scala.inline
    def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    @scala.inline
    def setStatCheck(
      value: (/* stats */ Stats, /* headers */ OutgoingHttpHeaders, /* statOptions */ StatOptions) => Unit | Boolean
    ): Self = StObject.set(x, "statCheck", js.Any.fromFunction3(value))
    
    @scala.inline
    def setStatCheckUndefined: Self = StObject.set(x, "statCheck", js.undefined)
    
    @scala.inline
    def setWaitForTrailers(value: Boolean): Self = StObject.set(x, "waitForTrailers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWaitForTrailersUndefined: Self = StObject.set(x, "waitForTrailers", js.undefined)
  }
}
