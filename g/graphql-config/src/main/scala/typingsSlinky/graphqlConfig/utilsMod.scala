package typingsSlinky.graphqlConfig

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.graphql.mod.GraphQLSchema
import typingsSlinky.graphqlConfig.anon.IntrospectionQueryerrorsu
import typingsSlinky.graphqlConfig.typesMod.GraphQLConfigData
import typingsSlinky.graphqlConfig.typesMod.IntrospectionResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("graphql-config/lib/utils", JSImport.Namespace)
@js.native
object utilsMod extends js.Object {
  
  def getSchemaExtensions(path: String): StringDictionary[String] = js.native
  
  def introspectionToSchema(introspection: IntrospectionQueryerrorsu): GraphQLSchema = js.native
  def introspectionToSchema(introspection: IntrospectionResult): GraphQLSchema = js.native
  
  def matchesGlobs(filePath: String, configDir: String): Boolean = js.native
  def matchesGlobs(filePath: String, configDir: String, globs: js.Array[String]): Boolean = js.native
  
  def mergeConfigs(dest: GraphQLConfigData, src: GraphQLConfigData): GraphQLConfigData = js.native
  
  def normalizeGlob(glob: String): String = js.native
  
  def readConfig(configPath: String): GraphQLConfigData = js.native
  
  def readSchema(path: js.Any): GraphQLSchema = js.native
  
  def schemaToIntrospection(schema: GraphQLSchema): js.Promise[IntrospectionResult] = js.native
  
  def validateConfig(config: GraphQLConfigData): Unit = js.native
  
  def writeConfig(configPath: String, config: GraphQLConfigData): Unit = js.native
  
  def writeSchema(path: String, schema: GraphQLSchema): js.Promise[Unit] = js.native
  def writeSchema(path: String, schema: GraphQLSchema, schemaExtensions: StringDictionary[String]): js.Promise[Unit] = js.native
}
