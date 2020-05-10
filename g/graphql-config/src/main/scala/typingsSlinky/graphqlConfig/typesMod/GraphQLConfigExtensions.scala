package typingsSlinky.graphqlConfig.typesMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.graphqlConfig.endpointsExtensionMod.GraphQLConfigEnpointsData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GraphQLConfigExtensions
  extends /* name */ StringDictionary[js.Any] {
  var endpoints: js.UndefOr[GraphQLConfigEnpointsData] = js.native
}

object GraphQLConfigExtensions {
  @scala.inline
  def apply(): GraphQLConfigExtensions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GraphQLConfigExtensions]
  }
  @scala.inline
  implicit class GraphQLConfigExtensionsOps[Self <: GraphQLConfigExtensions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEndpoints(value: GraphQLConfigEnpointsData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endpoints")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndpoints: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endpoints")(js.undefined)
        ret
    }
  }
  
}

