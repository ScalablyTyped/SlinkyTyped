package typingsSlinky.gatsby.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GatsbySSR extends js.Object {
  /**
    * Called after every page Gatsby server renders while building HTML so you can
    * replace head components to be rendered in your `html.js`. This is useful if
    * you need to reorder scripts or styles added by other plugins.
    * @example
    * // Move Typography.js styles to the top of the head section so they're loaded first.
    * exports.onPreRenderHTML = ({ getHeadComponents, replaceHeadComponents }) => {
    *   const headComponents = getHeadComponents()
    *   headComponents.sort((x, y) => {
    *     if (x.key === 'TypographyStyle') {
    *       return -1
    *     } else if (y.key === 'TypographyStyle') {
    *       return 1
    *     }
    *     return 0
    *   })
    *   replaceHeadComponents(headComponents)
    * }
    */
  var onPreRenderHTML: js.UndefOr[
    (js.Function2[/* args */ PreRenderHTMLArgs, /* options */ PluginOptions, _]) with (js.Function2[/* args */ PreRenderHTMLArgs, /* options */ PluginOptions, js.Promise[_]]) with (js.Function3[
      /* args */ PreRenderHTMLArgs, 
      /* options */ PluginOptions, 
      /* callback */ PluginCallback, 
      Unit
    ])
  ] = js.native
  /**
    * Called after every page Gatsby server renders while building HTML so you can
    * set head and body components to be rendered in your `html.js`.
    *
    * Gatsby does a two-pass render for HTML. It loops through your pages first
    * rendering only the body and then takes the result body HTML string and
    * passes it as the `body` prop to your `html.js` to complete the render.
    *
    * It's often handy to be able to send custom components to your `html.js`.
    * For example, it's a very common pattern for React.js libraries that
    * support server rendering to pull out data generated during the render to
    * add to your HTML.
    *
    * Using this API over `replaceRenderer` is preferable as
    * multiple plugins can implement this API where only one plugin can take
    * over server rendering. However, if your plugin requires taking over server
    * rendering then that's the one to use
    * @example
    * const { Helmet } = require("react-helmet")
    *
    * exports.onRenderBody = (
    *   { setHeadComponents, setHtmlAttributes, setBodyAttributes },
    *   pluginOptions
    * ) => {
    *   const helmet = Helmet.renderStatic()
    *   setHtmlAttributes(helmet.htmlAttributes.toComponent())
    *   setBodyAttributes(helmet.bodyAttributes.toComponent())
    *   setHeadComponents([
    *     helmet.title.toComponent(),
    *     helmet.link.toComponent(),
    *     helmet.meta.toComponent(),
    *     helmet.noscript.toComponent(),
    *     helmet.script.toComponent(),
    *     helmet.style.toComponent(),
    *   ])
    * }
    */
  var onRenderBody: js.UndefOr[
    (js.Function2[/* args */ RenderBodyArgs, /* options */ PluginOptions, _]) with (js.Function2[/* args */ RenderBodyArgs, /* options */ PluginOptions, js.Promise[_]]) with (js.Function3[
      /* args */ RenderBodyArgs, 
      /* options */ PluginOptions, 
      /* callback */ PluginCallback, 
      Unit
    ])
  ] = js.native
  /**
    * Replace the default server renderer. This is useful for integration with
    * Redux, css-in-js libraries, etc. that need custom setups for server
    * rendering.
    * @example
    * // From gatsby-plugin-glamor
    * const { renderToString } = require("react-dom/server")
    * const inline = require("glamor-inline")
    *
    * exports.replaceRenderer = ({ bodyComponent, replaceBodyHTMLString }) => {
    *   const bodyHTML = renderToString(bodyComponent)
    *   const inlinedHTML = inline(bodyHTML)
    *
    *   replaceBodyHTMLString(inlinedHTML)
    * }
    */
  var replaceRenderer: js.UndefOr[
    (js.Function2[/* args */ ReplaceRendererArgs, /* options */ PluginOptions, _]) with (js.Function2[/* args */ ReplaceRendererArgs, /* options */ PluginOptions, js.Promise[_]]) with (js.Function3[
      /* args */ ReplaceRendererArgs, 
      /* options */ PluginOptions, 
      /* callback */ PluginCallback, 
      Unit
    ])
  ] = js.native
  /**
    * Allow a plugin to wrap the page element.
    *
    * This is useful for setting wrapper component around pages that won't get
    * unmounted on page change. For setting Provider components use `wrapRootElement`.
    *
    * _Note:_ [There is equivalent hook in Browser API](https://www.gatsbyjs.org/docs/browser-apis/#wrapPageElement)
    * @example
    * const React = require("react")
    * const Layout = require("./src/components/layout")
    *
    * exports.wrapPageElement = ({ element, props }) => {
    *   // props provide same data to Layout as Page element will get
    *   // including location, data, etc - you don't need to pass it
    *   return <Layout {...props}>{element}</Layout>
    * }
    */
  var wrapPageElement: js.UndefOr[
    (js.Function2[
      /* args */ WrapPageElementNodeArgs[js.Object, js.Object], 
      /* options */ PluginOptions, 
      _
    ]) with (js.Function2[
      /* args */ WrapPageElementNodeArgs[js.Object, js.Object], 
      /* options */ PluginOptions, 
      js.Promise[_]
    ]) with (js.Function3[
      /* args */ WrapPageElementNodeArgs[js.Object, js.Object], 
      /* options */ PluginOptions, 
      /* callback */ PluginCallback, 
      Unit
    ])
  ] = js.native
  /**
    * Allow a plugin to wrap the root element.
    *
    * This is useful to setup any Providers component that will wrap your application.
    * For setting persistent UI elements around pages use `wrapPageElement`.
    *
    * _Note:_ [There is equivalent hook in Browser API](https://www.gatsbyjs.org/docs/browser-apis/#wrapRootElement)
    * @example
    * const React = require("react")
    * const { Provider } = require("react-redux")
    *
    * const createStore = require("./src/state/createStore")
    * const store = createStore()
    *
    * exports.wrapRootElement = ({ element }) => {
    *   return (
    *     <Provider store={store}>
    *       {element}
    *     </Provider>
    *   )
    * }
    */
  var wrapRootElement: js.UndefOr[
    (js.Function2[/* args */ WrapRootElementNodeArgs, /* options */ PluginOptions, _]) with (js.Function2[/* args */ WrapRootElementNodeArgs, /* options */ PluginOptions, js.Promise[_]]) with (js.Function3[
      /* args */ WrapRootElementNodeArgs, 
      /* options */ PluginOptions, 
      /* callback */ PluginCallback, 
      Unit
    ])
  ] = js.native
}

object GatsbySSR {
  @scala.inline
  def apply(): GatsbySSR = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GatsbySSR]
  }
  @scala.inline
  implicit class GatsbySSROps[Self <: GatsbySSR] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOnPreRenderHTML(
      value: (js.Function2[/* args */ PreRenderHTMLArgs, /* options */ PluginOptions, _]) with (js.Function2[/* args */ PreRenderHTMLArgs, /* options */ PluginOptions, js.Promise[_]]) with (js.Function3[
          /* args */ PreRenderHTMLArgs, 
          /* options */ PluginOptions, 
          /* callback */ PluginCallback, 
          Unit
        ])
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPreRenderHTML")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnPreRenderHTML: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPreRenderHTML")(js.undefined)
        ret
    }
    @scala.inline
    def withOnRenderBody(
      value: (js.Function2[/* args */ RenderBodyArgs, /* options */ PluginOptions, _]) with (js.Function2[/* args */ RenderBodyArgs, /* options */ PluginOptions, js.Promise[_]]) with (js.Function3[
          /* args */ RenderBodyArgs, 
          /* options */ PluginOptions, 
          /* callback */ PluginCallback, 
          Unit
        ])
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRenderBody")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnRenderBody: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRenderBody")(js.undefined)
        ret
    }
    @scala.inline
    def withReplaceRenderer(
      value: (js.Function2[/* args */ ReplaceRendererArgs, /* options */ PluginOptions, _]) with (js.Function2[/* args */ ReplaceRendererArgs, /* options */ PluginOptions, js.Promise[_]]) with (js.Function3[
          /* args */ ReplaceRendererArgs, 
          /* options */ PluginOptions, 
          /* callback */ PluginCallback, 
          Unit
        ])
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replaceRenderer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReplaceRenderer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replaceRenderer")(js.undefined)
        ret
    }
    @scala.inline
    def withWrapPageElement(
      value: (js.Function2[
          /* args */ WrapPageElementNodeArgs[js.Object, js.Object], 
          /* options */ PluginOptions, 
          _
        ]) with (js.Function2[
          /* args */ WrapPageElementNodeArgs[js.Object, js.Object], 
          /* options */ PluginOptions, 
          js.Promise[_]
        ]) with (js.Function3[
          /* args */ WrapPageElementNodeArgs[js.Object, js.Object], 
          /* options */ PluginOptions, 
          /* callback */ PluginCallback, 
          Unit
        ])
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrapPageElement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWrapPageElement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrapPageElement")(js.undefined)
        ret
    }
    @scala.inline
    def withWrapRootElement(
      value: (js.Function2[/* args */ WrapRootElementNodeArgs, /* options */ PluginOptions, _]) with (js.Function2[/* args */ WrapRootElementNodeArgs, /* options */ PluginOptions, js.Promise[_]]) with (js.Function3[
          /* args */ WrapRootElementNodeArgs, 
          /* options */ PluginOptions, 
          /* callback */ PluginCallback, 
          Unit
        ])
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrapRootElement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWrapRootElement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrapRootElement")(js.undefined)
        ret
    }
  }
  
}

