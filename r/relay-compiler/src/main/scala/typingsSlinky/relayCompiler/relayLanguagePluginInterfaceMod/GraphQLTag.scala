package typingsSlinky.relayCompiler.relayLanguagePluginInterfaceMod

import typingsSlinky.relayCompiler.anon.Column
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GraphQLTag extends js.Object {
  /**
    * In the case this tag was part of a fragment container and it used a node
    * map as fragment spec, rather than a single tagged node, this should hold
    * the prop key to which the node is assigned.
    *
    * @example
    *
    *  createFragmentContainer(
    *    MyComponent,
    *    {
    *      keyName: graphql`fragment MyComponent_keyName { … }`
    *    }
    *  )
    *
    */
  var keyName: Null | String = js.native
  /**
    * The location in the source file that the tag is placed at.
    */
  var sourceLocationOffset: Column = js.native
  /**
    * Should hold the string content of the `graphql` tagged template literal,
    * which is either an operation or fragment.
    *
    * @example
    *
    *  grapqhl`query MyQuery { … }`
    *  grapqhl`fragment MyFragment on MyType { … }`
    */
  var template: String = js.native
}

object GraphQLTag {
  @scala.inline
  def apply(sourceLocationOffset: Column, template: String): GraphQLTag = {
    val __obj = js.Dynamic.literal(sourceLocationOffset = sourceLocationOffset.asInstanceOf[js.Any], template = template.asInstanceOf[js.Any])
    __obj.asInstanceOf[GraphQLTag]
  }
  @scala.inline
  implicit class GraphQLTagOps[Self <: GraphQLTag] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSourceLocationOffset(value: Column): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceLocationOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTemplate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("template")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKeyName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKeyNameNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyName")(null)
        ret
    }
  }
  
}

