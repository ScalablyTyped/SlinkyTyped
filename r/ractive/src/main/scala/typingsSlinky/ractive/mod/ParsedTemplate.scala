package typingsSlinky.ractive.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParsedTemplate extends StObject {
  
  /** If csp mode was used to parse, the map of expression string -> expression functions. */
  var e: js.UndefOr[StringDictionary[js.Function]] = js.native
  
  /** If the template includes any partials, the map of partial name -> template nodes. */
  var p: js.UndefOr[StringDictionary[js.Array[_]]] = js.native
  
  /** The array of template nodes. */
  var t: js.Array[_] = js.native
  
  /** The version of the template spec that produced this template. */
  var v: Double = js.native
}
object ParsedTemplate {
  
  @scala.inline
  def apply(t: js.Array[_], v: Double): ParsedTemplate = {
    val __obj = js.Dynamic.literal(t = t.asInstanceOf[js.Any], v = v.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParsedTemplate]
  }
  
  @scala.inline
  implicit class ParsedTemplateMutableBuilder[Self <: ParsedTemplate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setE(value: StringDictionary[js.Function]): Self = StObject.set(x, "e", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEUndefined: Self = StObject.set(x, "e", js.undefined)
    
    @scala.inline
    def setP(value: StringDictionary[js.Array[_]]): Self = StObject.set(x, "p", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPUndefined: Self = StObject.set(x, "p", js.undefined)
    
    @scala.inline
    def setT(value: js.Array[_]): Self = StObject.set(x, "t", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTVarargs(value: js.Any*): Self = StObject.set(x, "t", js.Array(value :_*))
    
    @scala.inline
    def setV(value: Double): Self = StObject.set(x, "v", value.asInstanceOf[js.Any])
  }
}
