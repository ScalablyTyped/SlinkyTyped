package typingsSlinky.ecmarkup.anon

import typingsSlinky.ecmarkup.collectNodesMod.CollectNodesReturnType
import typingsSlinky.ecmarkup.ecmarkupBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Algorithms extends CollectNodesReturnType {
  
  var algorithms: js.Array[Element] = js.native
  
  var earlyErrors: js.Array[Grammar] = js.native
  
  var headers: js.Array[Contents] = js.native
  
  var mainGrammar: js.Array[Source] = js.native
  
  var sdos: js.Array[Alg] = js.native
  
  var success: `true` = js.native
}
object Algorithms {
  
  @scala.inline
  def apply(
    algorithms: js.Array[Element],
    earlyErrors: js.Array[Grammar],
    headers: js.Array[Contents],
    mainGrammar: js.Array[Source],
    sdos: js.Array[Alg],
    success: `true`
  ): Algorithms = {
    val __obj = js.Dynamic.literal(algorithms = algorithms.asInstanceOf[js.Any], earlyErrors = earlyErrors.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], mainGrammar = mainGrammar.asInstanceOf[js.Any], sdos = sdos.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
    __obj.asInstanceOf[Algorithms]
  }
  
  @scala.inline
  implicit class AlgorithmsMutableBuilder[Self <: Algorithms] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlgorithms(value: js.Array[Element]): Self = StObject.set(x, "algorithms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlgorithmsVarargs(value: Element*): Self = StObject.set(x, "algorithms", js.Array(value :_*))
    
    @scala.inline
    def setEarlyErrors(value: js.Array[Grammar]): Self = StObject.set(x, "earlyErrors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEarlyErrorsVarargs(value: Grammar*): Self = StObject.set(x, "earlyErrors", js.Array(value :_*))
    
    @scala.inline
    def setHeaders(value: js.Array[Contents]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeadersVarargs(value: Contents*): Self = StObject.set(x, "headers", js.Array(value :_*))
    
    @scala.inline
    def setMainGrammar(value: js.Array[Source]): Self = StObject.set(x, "mainGrammar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMainGrammarVarargs(value: Source*): Self = StObject.set(x, "mainGrammar", js.Array(value :_*))
    
    @scala.inline
    def setSdos(value: js.Array[Alg]): Self = StObject.set(x, "sdos", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSdosVarargs(value: Alg*): Self = StObject.set(x, "sdos", js.Array(value :_*))
    
    @scala.inline
    def setSuccess(value: `true`): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
  }
}
