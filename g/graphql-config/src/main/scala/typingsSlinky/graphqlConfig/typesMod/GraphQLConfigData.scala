package typingsSlinky.graphqlConfig.typesMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined graphql-config.graphql-config/lib/types.GraphQLResolvedConfigData & {  projects ? :{[projectName: string] : graphql-config.graphql-config/lib/types.GraphQLResolvedConfigData}} */
@js.native
trait GraphQLConfigData extends js.Object {
  var excludes: js.UndefOr[js.Array[String]] = js.native
  var extensions: js.UndefOr[GraphQLConfigExtensions] = js.native
  var includes: js.UndefOr[js.Array[String]] = js.native
  var projects: js.UndefOr[StringDictionary[GraphQLResolvedConfigData]] = js.native
  var schemaPath: String = js.native
}

object GraphQLConfigData {
  @scala.inline
  def apply(schemaPath: String): GraphQLConfigData = {
    val __obj = js.Dynamic.literal(schemaPath = schemaPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[GraphQLConfigData]
  }
  @scala.inline
  implicit class GraphQLConfigDataOps[Self <: GraphQLConfigData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSchemaPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("schemaPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExcludes(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("excludes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExcludes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("excludes")(js.undefined)
        ret
    }
    @scala.inline
    def withExtensions(value: GraphQLConfigExtensions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extensions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExtensions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extensions")(js.undefined)
        ret
    }
    @scala.inline
    def withIncludes(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncludes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includes")(js.undefined)
        ret
    }
    @scala.inline
    def withProjects(value: StringDictionary[GraphQLResolvedConfigData]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("projects")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProjects: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("projects")(js.undefined)
        ret
    }
  }
  
}

