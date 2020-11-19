package typingsSlinky.graphql

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.graphql.astMod.ASTNode
import typingsSlinky.graphql.locationMod.SourceLocation
import typingsSlinky.graphql.maybeMod.Maybe
import typingsSlinky.graphql.sourceMod.Source
import typingsSlinky.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("graphql/error/GraphQLError", JSImport.Namespace)
@js.native
object graphQLErrorMod extends js.Object {
  
  def printError(error: GraphQLError): String = js.native
  
  @js.native
  class GraphQLError protected () extends Error {
    def this(
      message: String,
      nodes: js.UndefOr[Maybe[js.Array[ASTNode] | ASTNode]],
      source: js.UndefOr[Maybe[Source]],
      positions: js.UndefOr[Maybe[js.Array[Double]]],
      path: js.UndefOr[Maybe[js.Array[String | Double]]],
      originalError: js.UndefOr[Maybe[js.Error]],
      extensions: js.UndefOr[Maybe[StringDictionary[_]]]
    ) = this()
    
    /**
      * Extension fields to add to the formatted error.
      */
    val extensions: js.UndefOr[StringDictionary[js.Any]] = js.native
    
    /**
      * An array of { line, column } locations within the source GraphQL document
      * which correspond to this error.
      *
      * Errors during validation often contain multiple locations, for example to
      * point out two things with the same name. Errors during execution include a
      * single location, the field which produced the error.
      *
      * Enumerable, and appears in the result of JSON.stringify().
      */
    val locations: js.UndefOr[js.Array[SourceLocation]] = js.native
    
    /**
      * An array of GraphQL AST Nodes corresponding to this error.
      */
    val nodes: js.UndefOr[js.Array[ASTNode]] = js.native
    
    /**
      * The original error thrown from a field resolver during execution.
      */
    val originalError: Maybe[js.Error] = js.native
    
    /**
      * An array describing the JSON-path into the execution response which
      * corresponds to this error. Only included for errors during execution.
      *
      * Enumerable, and appears in the result of JSON.stringify().
      */
    val path: js.UndefOr[js.Array[String | Double]] = js.native
    
    /**
      * An array of character offsets within the source GraphQL document
      * which correspond to this error.
      */
    val positions: js.UndefOr[js.Array[Double]] = js.native
    
    /**
      * The source GraphQL document corresponding to this error.
      *
      * Note that if this Error represents more than one node, the source may not
      * represent nodes after the first node.
      */
    val source: js.UndefOr[Source] = js.native
  }
}
