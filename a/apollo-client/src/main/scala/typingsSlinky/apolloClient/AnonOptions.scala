package typingsSlinky.apolloClient

import typingsSlinky.apolloClient.queryManagerMod.QueryManager
import typingsSlinky.apolloClient.watchQueryOptionsMod.WatchQueryOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonOptions[TVariables] extends js.Object {
  var options: WatchQueryOptions[TVariables] = js.native
  var queryManager: QueryManager[_] = js.native
  var shouldSubscribe: js.UndefOr[Boolean] = js.native
}

object AnonOptions {
  @scala.inline
  def apply[TVariables](options: WatchQueryOptions[TVariables], queryManager: QueryManager[_]): AnonOptions[TVariables] = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any], queryManager = queryManager.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonOptions[TVariables]]
  }
  @scala.inline
  implicit class AnonOptionsOps[Self[tvariables] <: AnonOptions[tvariables], TVariables] (val x: Self[TVariables]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TVariables] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TVariables]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[TVariables] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[TVariables] with Other]
    @scala.inline
    def withOptions(value: WatchQueryOptions[TVariables]): Self[TVariables] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQueryManager(value: QueryManager[_]): Self[TVariables] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queryManager")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShouldSubscribe(value: Boolean): Self[TVariables] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shouldSubscribe")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShouldSubscribe: Self[TVariables] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shouldSubscribe")(js.undefined)
        ret
    }
  }
  
}

