package typingsSlinky.ecmarkup

import org.scalajs.dom.raw.Document
import typingsSlinky.ecmarkup.anon.Alg
import typingsSlinky.ecmarkup.anon.Contents
import typingsSlinky.ecmarkup.anon.Element
import typingsSlinky.ecmarkup.anon.Grammar
import typingsSlinky.ecmarkup.anon.Source
import typingsSlinky.ecmarkup.ecmarkupBooleans.`false`
import typingsSlinky.ecmarkup.ecmarkupBooleans.`true`
import typingsSlinky.ecmarkup.specMod.Spec
import typingsSlinky.ecmarkup.specMod.Warning
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object collectNodesMod {
  
  @JSImport("ecmarkup/lib/lint/collect-nodes", "collectNodes")
  @js.native
  def collectNodes(report: js.Function1[/* e */ Warning, Unit], mainSource: String, spec: Spec, document: Document): CollectNodesReturnType = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.ecmarkup.anon.Algorithms
    - typingsSlinky.ecmarkup.anon.Success
  */
  trait CollectNodesReturnType extends StObject
  object CollectNodesReturnType {
    
    @scala.inline
    def Algorithms(
      algorithms: js.Array[Element],
      earlyErrors: js.Array[Grammar],
      headers: js.Array[Contents],
      mainGrammar: js.Array[Source],
      sdos: js.Array[Alg],
      success: `true`
    ): typingsSlinky.ecmarkup.anon.Algorithms = {
      val __obj = js.Dynamic.literal(algorithms = algorithms.asInstanceOf[js.Any], earlyErrors = earlyErrors.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], mainGrammar = mainGrammar.asInstanceOf[js.Any], sdos = sdos.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.ecmarkup.anon.Algorithms]
    }
    
    @scala.inline
    def Success(success: `false`): typingsSlinky.ecmarkup.anon.Success = {
      val __obj = js.Dynamic.literal(success = success.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.ecmarkup.anon.Success]
    }
  }
}
