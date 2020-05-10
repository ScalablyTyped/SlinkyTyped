package typingsSlinky.apolloClient

import typingsSlinky.apolloClient.localStateMod.LocalState
import typingsSlinky.apolloClient.storeMod.DataStore
import typingsSlinky.apolloLink.mod.ApolloLink
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAssumeImmutableResults[TStore] extends js.Object {
  var assumeImmutableResults: js.UndefOr[Boolean] = js.native
  var clientAwareness: js.UndefOr[Record[String, String]] = js.native
  var link: ApolloLink = js.native
  var localState: js.UndefOr[LocalState[TStore]] = js.native
  var onBroadcast: js.UndefOr[js.Function0[Unit]] = js.native
  var queryDeduplication: js.UndefOr[Boolean] = js.native
  var ssrMode: js.UndefOr[Boolean] = js.native
  var store: DataStore[TStore] = js.native
}

object AnonAssumeImmutableResults {
  @scala.inline
  def apply[TStore](link: ApolloLink, store: DataStore[TStore]): AnonAssumeImmutableResults[TStore] = {
    val __obj = js.Dynamic.literal(link = link.asInstanceOf[js.Any], store = store.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAssumeImmutableResults[TStore]]
  }
  @scala.inline
  implicit class AnonAssumeImmutableResultsOps[Self[tstore] <: AnonAssumeImmutableResults[tstore], TStore] (val x: Self[TStore]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TStore] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TStore]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[TStore] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[TStore] with Other]
    @scala.inline
    def withLink(value: ApolloLink): Self[TStore] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("link")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStore(value: DataStore[TStore]): Self[TStore] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("store")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAssumeImmutableResults(value: Boolean): Self[TStore] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("assumeImmutableResults")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAssumeImmutableResults: Self[TStore] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("assumeImmutableResults")(js.undefined)
        ret
    }
    @scala.inline
    def withClientAwareness(value: Record[String, String]): Self[TStore] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientAwareness")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClientAwareness: Self[TStore] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientAwareness")(js.undefined)
        ret
    }
    @scala.inline
    def withLocalState(value: LocalState[TStore]): Self[TStore] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("localState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocalState: Self[TStore] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("localState")(js.undefined)
        ret
    }
    @scala.inline
    def withOnBroadcast(value: () => Unit): Self[TStore] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBroadcast")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnBroadcast: Self[TStore] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBroadcast")(js.undefined)
        ret
    }
    @scala.inline
    def withQueryDeduplication(value: Boolean): Self[TStore] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queryDeduplication")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQueryDeduplication: Self[TStore] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queryDeduplication")(js.undefined)
        ret
    }
    @scala.inline
    def withSsrMode(value: Boolean): Self[TStore] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ssrMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSsrMode: Self[TStore] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ssrMode")(js.undefined)
        ret
    }
  }
  
}

