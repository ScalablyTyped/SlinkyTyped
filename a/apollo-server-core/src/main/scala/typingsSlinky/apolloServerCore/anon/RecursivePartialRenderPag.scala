package typingsSlinky.apolloServerCore.anon

import typingsSlinky.apolloServerCore.playgroundMod.PlaygroundConfig
import typingsSlinky.apolloServerCore.playgroundMod.RecursivePartial
import typingsSlinky.apollographqlGraphqlPlaygroundHtml.renderPlaygroundPageMod.EditorColours
import typingsSlinky.apollographqlGraphqlPlaygroundHtml.renderPlaygroundPageMod.ISettings
import typingsSlinky.apollographqlGraphqlPlaygroundHtml.renderPlaygroundPageMod.IntrospectionResult
import typingsSlinky.apollographqlGraphqlPlaygroundHtml.renderPlaygroundPageMod.Tab
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined apollo-server-core.apollo-server-core/dist/playground.RecursivePartial<@apollographql/graphql-playground-html.@apollographql/graphql-playground-html/dist/render-playground-page.RenderPageOptions> */
@js.native
trait RecursivePartialRenderPag extends PlaygroundConfig {
  var cdnUrl: js.UndefOr[String | RecursivePartial[js.UndefOr[String]] | js.Array[RecursivePartial[_]]] = js.native
  var codeTheme: js.UndefOr[
    EditorColours | RecursivePartial[js.UndefOr[EditorColours]] | js.Array[RecursivePartial[_]]
  ] = js.native
  var config: js.UndefOr[js.Any | RecursivePartial[js.UndefOr[_]] | js.Array[RecursivePartial[_]]] = js.native
  var endpoint: js.UndefOr[String | RecursivePartial[js.UndefOr[String]] | js.Array[RecursivePartial[_]]] = js.native
  var env: js.UndefOr[js.Any | RecursivePartial[js.UndefOr[_]] | js.Array[RecursivePartial[_]]] = js.native
  var faviconUrl: js.UndefOr[
    String | Null | (RecursivePartial[js.UndefOr[String | Null]]) | js.Array[RecursivePartial[_]]
  ] = js.native
  var schema: js.UndefOr[
    IntrospectionResult | RecursivePartial[js.UndefOr[IntrospectionResult]] | js.Array[RecursivePartial[_]]
  ] = js.native
  var settings: js.UndefOr[
    ISettings | RecursivePartial[js.UndefOr[ISettings]] | js.Array[RecursivePartial[_]]
  ] = js.native
  var subscriptionEndpoint: js.UndefOr[String | RecursivePartial[js.UndefOr[String]] | js.Array[RecursivePartial[_]]] = js.native
  var tabs: js.UndefOr[
    (js.Array[RecursivePartial[_] | Tab]) | RecursivePartial[js.UndefOr[js.Array[Tab]]]
  ] = js.native
  var title: js.UndefOr[String | RecursivePartial[js.UndefOr[String]] | js.Array[RecursivePartial[_]]] = js.native
  var version: js.UndefOr[String | RecursivePartial[js.UndefOr[String]] | js.Array[RecursivePartial[_]]] = js.native
  var workspaceName: js.UndefOr[String | RecursivePartial[js.UndefOr[String]] | js.Array[RecursivePartial[_]]] = js.native
}

object RecursivePartialRenderPag {
  @scala.inline
  def apply(): RecursivePartialRenderPag = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RecursivePartialRenderPag]
  }
  @scala.inline
  implicit class RecursivePartialRenderPagOps[Self <: RecursivePartialRenderPag] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCdnUrl(value: String | RecursivePartial[js.UndefOr[String]] | js.Array[RecursivePartial[_]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cdnUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCdnUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cdnUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withCodeTheme(value: EditorColours | RecursivePartial[js.UndefOr[EditorColours]] | js.Array[RecursivePartial[_]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("codeTheme")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCodeTheme: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("codeTheme")(js.undefined)
        ret
    }
    @scala.inline
    def withConfig(value: js.Any | RecursivePartial[js.UndefOr[_]] | js.Array[RecursivePartial[_]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("config")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("config")(js.undefined)
        ret
    }
    @scala.inline
    def withEndpoint(value: String | RecursivePartial[js.UndefOr[String]] | js.Array[RecursivePartial[_]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endpoint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndpoint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endpoint")(js.undefined)
        ret
    }
    @scala.inline
    def withEnv(value: js.Any | RecursivePartial[js.UndefOr[_]] | js.Array[RecursivePartial[_]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("env")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnv: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("env")(js.undefined)
        ret
    }
    @scala.inline
    def withFaviconUrl(value: String | (RecursivePartial[js.UndefOr[String | Null]]) | js.Array[RecursivePartial[_]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("faviconUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFaviconUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("faviconUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withFaviconUrlNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("faviconUrl")(null)
        ret
    }
    @scala.inline
    def withSchema(
      value: IntrospectionResult | RecursivePartial[js.UndefOr[IntrospectionResult]] | js.Array[RecursivePartial[_]]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("schema")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSchema: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("schema")(js.undefined)
        ret
    }
    @scala.inline
    def withSettings(value: ISettings | RecursivePartial[js.UndefOr[ISettings]] | js.Array[RecursivePartial[_]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("settings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("settings")(js.undefined)
        ret
    }
    @scala.inline
    def withSubscriptionEndpoint(value: String | RecursivePartial[js.UndefOr[String]] | js.Array[RecursivePartial[_]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subscriptionEndpoint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubscriptionEndpoint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subscriptionEndpoint")(js.undefined)
        ret
    }
    @scala.inline
    def withTabs(value: (js.Array[RecursivePartial[_] | Tab]) | RecursivePartial[js.UndefOr[js.Array[Tab]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTabs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabs")(js.undefined)
        ret
    }
    @scala.inline
    def withTitle(value: String | RecursivePartial[js.UndefOr[String]] | js.Array[RecursivePartial[_]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(js.undefined)
        ret
    }
    @scala.inline
    def withVersion(value: String | RecursivePartial[js.UndefOr[String]] | js.Array[RecursivePartial[_]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(js.undefined)
        ret
    }
    @scala.inline
    def withWorkspaceName(value: String | RecursivePartial[js.UndefOr[String]] | js.Array[RecursivePartial[_]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workspaceName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWorkspaceName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workspaceName")(js.undefined)
        ret
    }
  }
  
}

