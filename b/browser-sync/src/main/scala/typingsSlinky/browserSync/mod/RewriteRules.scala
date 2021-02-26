package typingsSlinky.browserSync.mod

import typingsSlinky.node.httpMod.IncomingMessage
import typingsSlinky.node.httpMod.ServerResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RewriteRules extends StObject {
  
  var fn: js.UndefOr[
    js.Function3[/* req */ IncomingMessage, /* res */ ServerResponse, /* match */ String, String]
  ] = js.native
  
  var `match`: js.RegExp = js.native
  
  var replace: js.UndefOr[String] = js.native
}
object RewriteRules {
  
  @scala.inline
  def apply(`match`: js.RegExp): RewriteRules = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("match")(`match`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RewriteRules]
  }
  
  @scala.inline
  implicit class RewriteRulesMutableBuilder[Self <: RewriteRules] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFn(value: (/* req */ IncomingMessage, /* res */ ServerResponse, /* match */ String) => String): Self = StObject.set(x, "fn", js.Any.fromFunction3(value))
    
    @scala.inline
    def setFnUndefined: Self = StObject.set(x, "fn", js.undefined)
    
    @scala.inline
    def setMatch(value: js.RegExp): Self = StObject.set(x, "match", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplace(value: String): Self = StObject.set(x, "replace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplaceUndefined: Self = StObject.set(x, "replace", js.undefined)
  }
}
