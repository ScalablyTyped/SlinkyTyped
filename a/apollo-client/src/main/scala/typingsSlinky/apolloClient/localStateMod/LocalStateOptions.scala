package typingsSlinky.apolloClient.localStateMod

import typingsSlinky.apolloCache.mod.ApolloCache
import typingsSlinky.apolloClient.apolloClientMod.default
import typingsSlinky.apolloClient.typesMod.Resolvers
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LocalStateOptions[TCacheShape] extends js.Object {
  var cache: ApolloCache[TCacheShape] = js.native
  var client: js.UndefOr[default[TCacheShape]] = js.native
  var fragmentMatcher: js.UndefOr[FragmentMatcher] = js.native
  var resolvers: js.UndefOr[Resolvers | js.Array[Resolvers]] = js.native
}

object LocalStateOptions {
  @scala.inline
  def apply[TCacheShape](cache: ApolloCache[TCacheShape]): LocalStateOptions[TCacheShape] = {
    val __obj = js.Dynamic.literal(cache = cache.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocalStateOptions[TCacheShape]]
  }
  @scala.inline
  implicit class LocalStateOptionsOps[Self[tcacheshape] <: LocalStateOptions[tcacheshape], TCacheShape] (val x: Self[TCacheShape]) extends AnyVal {
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
    def withClient(value: default[TCacheShape]): Self[TCacheShape] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("client")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClient: Self[TCacheShape] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("client")(js.undefined)
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
  }
  
}

