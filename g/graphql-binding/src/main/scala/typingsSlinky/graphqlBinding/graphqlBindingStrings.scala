package typingsSlinky.graphqlBinding

import typingsSlinky.graphqlBinding.distTypesMod.Operation
import typingsSlinky.graphqlBinding.distTypesMod.QueryOrMutation
import typingsSlinky.graphqlBinding.typesMod.GeneratorType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object graphqlBindingStrings {
  
  @scala.inline
  def javascript: javascript = "javascript".asInstanceOf[javascript]
  
  @scala.inline
  def mutation: mutation = "mutation".asInstanceOf[mutation]
  
  @scala.inline
  def query: query = "query".asInstanceOf[query]
  
  @scala.inline
  def subscription: subscription = "subscription".asInstanceOf[subscription]
  
  @scala.inline
  def typescript: typescript = "typescript".asInstanceOf[typescript]
  
  @js.native
  sealed trait javascript extends GeneratorType
  
  @js.native
  sealed trait mutation
    extends Operation
       with QueryOrMutation
  
  @js.native
  sealed trait query
    extends Operation
       with QueryOrMutation
  
  @js.native
  sealed trait subscription extends Operation
  
  @js.native
  sealed trait typescript extends GeneratorType
}
