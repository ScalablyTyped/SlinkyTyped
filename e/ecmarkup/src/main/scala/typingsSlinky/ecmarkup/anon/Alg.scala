package typingsSlinky.ecmarkup.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Alg extends StObject {
  
  var alg: org.scalajs.dom.raw.Element = js.native
  
  var grammar: org.scalajs.dom.raw.Element = js.native
}
object Alg {
  
  @scala.inline
  def apply(alg: org.scalajs.dom.raw.Element, grammar: org.scalajs.dom.raw.Element): Alg = {
    val __obj = js.Dynamic.literal(alg = alg.asInstanceOf[js.Any], grammar = grammar.asInstanceOf[js.Any])
    __obj.asInstanceOf[Alg]
  }
  
  @scala.inline
  implicit class AlgMutableBuilder[Self <: Alg] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlg(value: org.scalajs.dom.raw.Element): Self = StObject.set(x, "alg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGrammar(value: org.scalajs.dom.raw.Element): Self = StObject.set(x, "grammar", value.asInstanceOf[js.Any])
  }
}
