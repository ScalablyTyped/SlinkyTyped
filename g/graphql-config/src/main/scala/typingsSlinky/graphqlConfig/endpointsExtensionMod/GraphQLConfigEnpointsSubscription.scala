package typingsSlinky.graphqlConfig.endpointsExtensionMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GraphQLConfigEnpointsSubscription extends js.Object {
  var connectionParams: js.UndefOr[StringDictionary[js.UndefOr[String]]] = js.native
  var url: String = js.native
}

object GraphQLConfigEnpointsSubscription {
  @scala.inline
  def apply(url: String): GraphQLConfigEnpointsSubscription = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[GraphQLConfigEnpointsSubscription]
  }
  @scala.inline
  implicit class GraphQLConfigEnpointsSubscriptionOps[Self <: GraphQLConfigEnpointsSubscription] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConnectionParams(value: StringDictionary[js.UndefOr[String]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectionParams")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConnectionParams: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectionParams")(js.undefined)
        ret
    }
  }
  
}

