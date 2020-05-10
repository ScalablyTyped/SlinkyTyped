package typingsSlinky.apolloClient.apolloClientMod

import typingsSlinky.apolloCache.mod.ApolloCache
import typingsSlinky.apolloClient.localStateMod.FragmentMatcher
import typingsSlinky.apolloClient.typesMod.Resolvers
import typingsSlinky.apolloLink.mod.ApolloLink
import typingsSlinky.graphql.astMod.DocumentNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ApolloClientOptions[TCacheShape] extends js.Object {
  var assumeImmutableResults: js.UndefOr[Boolean] = js.native
  var cache: ApolloCache[TCacheShape] = js.native
  var connectToDevTools: js.UndefOr[Boolean] = js.native
  var defaultOptions: js.UndefOr[DefaultOptions] = js.native
  var fragmentMatcher: js.UndefOr[FragmentMatcher] = js.native
  var link: js.UndefOr[ApolloLink] = js.native
  var name: js.UndefOr[String] = js.native
  var queryDeduplication: js.UndefOr[Boolean] = js.native
  var resolvers: js.UndefOr[Resolvers | js.Array[Resolvers]] = js.native
  var ssrForceFetchDelay: js.UndefOr[Double] = js.native
  var ssrMode: js.UndefOr[Boolean] = js.native
  var typeDefs: js.UndefOr[String | (js.Array[DocumentNode | String]) | DocumentNode] = js.native
  var version: js.UndefOr[String] = js.native
}

object ApolloClientOptions {
  @scala.inline
  def apply[TCacheShape](cache: ApolloCache[TCacheShape]): ApolloClientOptions[TCacheShape] = {
    val __obj = js.Dynamic.literal(cache = cache.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApolloClientOptions[TCacheShape]]
  }
  @scala.inline
  implicit class ApolloClientOptionsOps[Self[tcacheshape] <: ApolloClientOptions[tcacheshape], TCacheShape] (val x: Self[TCacheShape]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TCacheShape] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TCacheShape]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[TCacheShape] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[TCacheShape] with Other]
    @scala.inline
    def withCache(value: ApolloCache[TCacheShape]): Self[TCacheShape] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cache")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAssumeImmutableResults(value: Boolean): Self[TCacheShape] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("assumeImmutableResults")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAssumeImmutableResults: Self[TCacheShape] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("assumeImmutableResults")(js.undefined)
        ret
    }
    @scala.inline
    def withConnectToDevTools(value: Boolean): Self[TCacheShape] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectToDevTools")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConnectToDevTools: Self[TCacheShape] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectToDevTools")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultOptions(value: DefaultOptions): Self[TCacheShape] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultOptions: Self[TCacheShape] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withFragmentMatcher(value: (/* rootValue */ js.Any, /* typeCondition */ String, /* context */ js.Any) => Boolean): Self[TCacheShape] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fragmentMatcher")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutFragmentMatcher: Self[TCacheShape] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fragmentMatcher")(js.undefined)
        ret
    }
    @scala.inline
    def withLink(value: ApolloLink): Self[TCacheShape] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("link")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLink: Self[TCacheShape] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("link")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self[TCacheShape] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self[TCacheShape] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withQueryDeduplication(value: Boolean): Self[TCacheShape] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queryDeduplication")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQueryDeduplication: Self[TCacheShape] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queryDeduplication")(js.undefined)
        ret
    }
    @scala.inline
    def withResolvers(value: Resolvers | js.Array[Resolvers]): Self[TCacheShape] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolvers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResolvers: Self[TCacheShape] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolvers")(js.undefined)
        ret
    }
    @scala.inline
    def withSsrForceFetchDelay(value: Double): Self[TCacheShape] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ssrForceFetchDelay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSsrForceFetchDelay: Self[TCacheShape] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ssrForceFetchDelay")(js.undefined)
        ret
    }
    @scala.inline
    def withSsrMode(value: Boolean): Self[TCacheShape] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ssrMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSsrMode: Self[TCacheShape] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ssrMode")(js.undefined)
        ret
    }
    @scala.inline
    def withTypeDefs(value: String | (js.Array[DocumentNode | String]) | DocumentNode): Self[TCacheShape] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("typeDefs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTypeDefs: Self[TCacheShape] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("typeDefs")(js.undefined)
        ret
    }
    @scala.inline
    def withVersion(value: String): Self[TCacheShape] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVersion: Self[TCacheShape] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(js.undefined)
        ret
    }
  }
  
}

