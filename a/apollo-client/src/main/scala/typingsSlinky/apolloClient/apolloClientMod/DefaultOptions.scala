package typingsSlinky.apolloClient.apolloClientMod

import typingsSlinky.apolloClient.anon.PartialMutationOptionskey
import typingsSlinky.apolloClient.anon.PartialQueryOptionsOperat
import typingsSlinky.apolloClient.anon.PartialWatchQueryOptionsO
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DefaultOptions extends js.Object {
  var mutate: js.UndefOr[PartialMutationOptionskey] = js.native
  var query: js.UndefOr[PartialQueryOptionsOperat] = js.native
  var watchQuery: js.UndefOr[PartialWatchQueryOptionsO] = js.native
}

object DefaultOptions {
  @scala.inline
  def apply(): DefaultOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DefaultOptions]
  }
  @scala.inline
  implicit class DefaultOptionsOps[Self <: DefaultOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMutate(value: PartialMutationOptionskey): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mutate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMutate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mutate")(js.undefined)
        ret
    }
    @scala.inline
    def withQuery(value: PartialQueryOptionsOperat): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("query")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQuery: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("query")(js.undefined)
        ret
    }
    @scala.inline
    def withWatchQuery(value: PartialWatchQueryOptionsO): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("watchQuery")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWatchQuery: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("watchQuery")(js.undefined)
        ret
    }
  }
  
}

