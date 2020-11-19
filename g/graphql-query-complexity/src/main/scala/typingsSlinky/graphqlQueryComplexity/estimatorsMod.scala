package typingsSlinky.graphqlQueryComplexity

import typingsSlinky.graphqlQueryComplexity.anon.DefaultComplexity
import typingsSlinky.graphqlQueryComplexity.queryComplexityMod.ComplexityEstimator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("graphql-query-complexity/dist/estimators", JSImport.Namespace)
@js.native
object estimatorsMod extends js.Object {
  
  def directiveEstimator(): ComplexityEstimator = js.native
  def directiveEstimator(options: js.Object): ComplexityEstimator = js.native
  
  def fieldExtensionsEstimator(): ComplexityEstimator = js.native
  
  def simpleEstimator(): ComplexityEstimator = js.native
  def simpleEstimator(options: DefaultComplexity): ComplexityEstimator = js.native
}
