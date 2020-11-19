package typingsSlinky.graphqlCompose.mod

import typingsSlinky.graphqlCompose.schemaComposerMod.SchemaComposer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Type storage and type generator from `Schema Definition Language` (`SDL`).
  * This is slightly rewritten [buildASTSchema](https://github.com/graphql/graphql-js/blob/master/src/utilities/buildASTSchema.js)
  * utility from `graphql-js` that allows to create type from a string (SDL).
  */
@JSImport("graphql-compose", "TypeMapper")
@js.native
class TypeMapper[TContext] protected ()
  extends typingsSlinky.graphqlCompose.typeMapperMod.TypeMapper[TContext] {
  def this(schemaComposer: SchemaComposer[TContext]) = this()
}
/* static members */
@JSImport("graphql-compose", "TypeMapper")
@js.native
object TypeMapper extends js.Object {
  
  /**
    * Checks that string is EnumType SDL definition
    * eg. `enum Sort { ASC DESC }`
    */
  def isEnumTypeDefinitionString(str: String): Boolean = js.native
  
  /**
    * Checks that string is InputType SDL definition
    * eg. `input Filter { minAge: Int }`
    */
  def isInputTypeDefinitionString(str: String): Boolean = js.native
  
  /**
    * Checks that string is InterfaceType SDL definition
    * eg. `interface User { name: String }`
    */
  def isInterfaceTypeDefinitionString(str: String): Boolean = js.native
  
  /**
    * Checks that string is OutputType SDL definition
    * eg. `type Out { name: String! }`
    */
  def isOutputTypeDefinitionString(str: String): Boolean = js.native
  
  /**
    * Checks that string is ScalarType SDL definition
    * eg. `scalar UInt`
    */
  def isScalarTypeDefinitionString(str: String): Boolean = js.native
  
  /**
    * Checks that string is SDL definition of some type
    * eg. `type Out { name: String! }` or `input Filter { minAge: Int }` etc.
    */
  def isTypeDefinitionString(str: String): Boolean = js.native
  
  /**
    * Check that string is a valid GraphQL Type name.
    * According to spec valid mask is `/^[_A-Za-z][_0-9A-Za-z]*$/`.
    */
  def isTypeNameString(str: String): Boolean = js.native
}
