package typingsSlinky.graphqlTools

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.graphql.definitionMod.GraphQLField
import typingsSlinky.graphql.definitionMod.GraphQLNamedType
import typingsSlinky.graphql.definitionMod.GraphQLResolveInfo
import typingsSlinky.graphql.mod.GraphQLSchema
import typingsSlinky.graphqlTools.addArgumentsAsVariablesMod.default
import typingsSlinky.graphqlTools.anon.Field
import typingsSlinky.graphqlTools.anon.From
import typingsSlinky.graphqlTools.anon.GraphQLSchematransformsAr
import typingsSlinky.graphqlTools.filterRootFieldsMod.RootFilter
import typingsSlinky.graphqlTools.graphqlToolsStrings.Mutation
import typingsSlinky.graphqlTools.graphqlToolsStrings.Query
import typingsSlinky.graphqlTools.graphqlToolsStrings.Subscription
import typingsSlinky.graphqlTools.interfacesMod.Transform
import typingsSlinky.graphqlTools.renameTypesMod.RenameOptions
import typingsSlinky.graphqlTools.transformRootFieldsMod.RootTransformer
import typingsSlinky.graphqlTools.wrapQueryMod.QueryWrapper
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-tools/dist/transforms", JSImport.Namespace)
@js.native
object transformsMod extends js.Object {
  @js.native
  class AddArgumentsAsVariables protected () extends default {
    def this(schema: GraphQLSchema, args: StringDictionary[js.Any]) = this()
  }
  
  @js.native
  class AddTypenameToAbstract protected ()
    extends typingsSlinky.graphqlTools.addTypenameToAbstractMod.default {
    def this(targetSchema: GraphQLSchema) = this()
  }
  
  @js.native
  class CheckResultAndHandleErrors protected ()
    extends typingsSlinky.graphqlTools.checkResultAndHandleErrorsMod.default {
    def this(info: GraphQLResolveInfo) = this()
    def this(info: GraphQLResolveInfo, fieldName: String) = this()
  }
  
  @js.native
  class ExpandAbstractTypes protected ()
    extends typingsSlinky.graphqlTools.expandAbstractTypesMod.default {
    def this(transformedSchema: GraphQLSchema, targetSchema: GraphQLSchema) = this()
  }
  
  @js.native
  class ExtractField protected ()
    extends typingsSlinky.graphqlTools.extractFieldMod.default {
    def this(hasFromTo: From) = this()
  }
  
  @js.native
  class FilterRootFields protected ()
    extends typingsSlinky.graphqlTools.filterRootFieldsMod.default {
    def this(filter: RootFilter) = this()
  }
  
  @js.native
  class FilterToSchema protected ()
    extends typingsSlinky.graphqlTools.filterToSchemaMod.default {
    def this(targetSchema: GraphQLSchema) = this()
  }
  
  @js.native
  class FilterTypes protected ()
    extends typingsSlinky.graphqlTools.filterTypesMod.default {
    def this(filter: js.Function1[/* type */ GraphQLNamedType, Boolean]) = this()
  }
  
  @js.native
  class RenameRootFields protected ()
    extends typingsSlinky.graphqlTools.renameRootFieldsMod.default {
    def this(renamer: js.Function3[
            /* operation */ Query | Mutation | Subscription, 
            /* name */ String, 
            /* field */ GraphQLField[_, _, StringDictionary[_]], 
            String
          ]) = this()
  }
  
  @js.native
  class RenameTypes protected ()
    extends typingsSlinky.graphqlTools.renameTypesMod.default {
    def this(renamer: js.Function1[/* name */ String, js.UndefOr[String]]) = this()
    def this(renamer: js.Function1[/* name */ String, js.UndefOr[String]], options: RenameOptions) = this()
  }
  
  @js.native
  class ReplaceFieldWithFragment protected ()
    extends typingsSlinky.graphqlTools.replaceFieldWithFragmentMod.default {
    def this(targetSchema: GraphQLSchema, fragments: js.Array[Field]) = this()
  }
  
  @js.native
  class TransformRootFields protected ()
    extends typingsSlinky.graphqlTools.transformRootFieldsMod.default {
    def this(transform: RootTransformer) = this()
  }
  
  @js.native
  class WrapQuery protected ()
    extends typingsSlinky.graphqlTools.wrapQueryMod.default {
    def this(path: js.Array[String], wrapper: QueryWrapper, extractor: js.Function1[/* result */ js.Any, _]) = this()
  }
  
  def transformSchema(targetSchema: GraphQLSchema, transforms: js.Array[Transform]): GraphQLSchematransformsAr = js.native
}

