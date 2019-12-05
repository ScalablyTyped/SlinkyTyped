package typingsSlinky.graphqlDashTools

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.graphql.graphqlMod.GraphQLSchema
import typingsSlinky.graphql.typeDefinitionMod.GraphQLField
import typingsSlinky.graphql.typeDefinitionMod.GraphQLNamedType
import typingsSlinky.graphql.typeDefinitionMod.GraphQLResolveInfo
import typingsSlinky.graphqlDashTools.distInterfacesMod.Transform
import typingsSlinky.graphqlDashTools.distTransformsAddArgumentsAsVariablesMod.default
import typingsSlinky.graphqlDashTools.distTransformsFilterRootFieldsMod.RootFilter
import typingsSlinky.graphqlDashTools.distTransformsRenameTypesMod.RenameOptions
import typingsSlinky.graphqlDashTools.distTransformsTransformRootFieldsMod.RootTransformer
import typingsSlinky.graphqlDashTools.distTransformsWrapQueryMod.QueryWrapper
import typingsSlinky.graphqlDashTools.graphqlDashToolsStrings.Mutation
import typingsSlinky.graphqlDashTools.graphqlDashToolsStrings.Query
import typingsSlinky.graphqlDashTools.graphqlDashToolsStrings.Subscription
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-tools/dist/transforms", JSImport.Namespace)
@js.native
object distTransformsMod extends js.Object {
  @js.native
  class AddArgumentsAsVariables protected () extends default {
    def this(schema: GraphQLSchema, args: StringDictionary[js.Any]) = this()
  }
  
  @js.native
  class AddTypenameToAbstract protected ()
    extends typingsSlinky.graphqlDashTools.distTransformsAddTypenameToAbstractMod.default {
    def this(targetSchema: GraphQLSchema) = this()
  }
  
  @js.native
  class CheckResultAndHandleErrors protected ()
    extends typingsSlinky.graphqlDashTools.distTransformsCheckResultAndHandleErrorsMod.default {
    def this(info: GraphQLResolveInfo) = this()
    def this(info: GraphQLResolveInfo, fieldName: String) = this()
  }
  
  @js.native
  class ExpandAbstractTypes protected ()
    extends typingsSlinky.graphqlDashTools.distTransformsExpandAbstractTypesMod.default {
    def this(transformedSchema: GraphQLSchema, targetSchema: GraphQLSchema) = this()
  }
  
  @js.native
  class ExtractField protected ()
    extends typingsSlinky.graphqlDashTools.distTransformsExtractFieldMod.default {
    def this(hasFromTo: Anon_From) = this()
  }
  
  @js.native
  class FilterRootFields protected ()
    extends typingsSlinky.graphqlDashTools.distTransformsFilterRootFieldsMod.default {
    def this(filter: RootFilter) = this()
  }
  
  @js.native
  class FilterToSchema protected ()
    extends typingsSlinky.graphqlDashTools.distTransformsFilterToSchemaMod.default {
    def this(targetSchema: GraphQLSchema) = this()
  }
  
  @js.native
  class FilterTypes protected ()
    extends typingsSlinky.graphqlDashTools.distTransformsFilterTypesMod.default {
    def this(filter: js.Function1[/* type */ GraphQLNamedType, Boolean]) = this()
  }
  
  @js.native
  class RenameRootFields protected ()
    extends typingsSlinky.graphqlDashTools.distTransformsRenameRootFieldsMod.default {
    def this(renamer: js.Function3[
            /* operation */ Query | Mutation | Subscription, 
            /* name */ String, 
            /* field */ GraphQLField[_, _, StringDictionary[_]], 
            String
          ]) = this()
  }
  
  @js.native
  class RenameTypes protected ()
    extends typingsSlinky.graphqlDashTools.distTransformsRenameTypesMod.default {
    def this(renamer: js.Function1[/* name */ String, js.UndefOr[String]]) = this()
    def this(renamer: js.Function1[/* name */ String, js.UndefOr[String]], options: RenameOptions) = this()
  }
  
  @js.native
  class ReplaceFieldWithFragment protected ()
    extends typingsSlinky.graphqlDashTools.distTransformsReplaceFieldWithFragmentMod.default {
    def this(targetSchema: GraphQLSchema, fragments: js.Array[Anon_Field]) = this()
  }
  
  @js.native
  class TransformRootFields protected ()
    extends typingsSlinky.graphqlDashTools.distTransformsTransformRootFieldsMod.default {
    def this(transform: RootTransformer) = this()
  }
  
  @js.native
  class WrapQuery protected ()
    extends typingsSlinky.graphqlDashTools.distTransformsWrapQueryMod.default {
    def this(path: js.Array[String], wrapper: QueryWrapper, extractor: js.Function1[/* result */ js.Any, _]) = this()
  }
  
  def transformSchema(targetSchema: GraphQLSchema, transforms: js.Array[Transform]): GraphQLSchema with Anon_Transforms = js.native
}

