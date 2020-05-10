package typingsSlinky.dojo.dojo.base.kernel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojo/_base/kernel.config.html
  *
  * This module defines the user configuration during bootstrap.
  * By defining user configuration as a module value, an entire configuration can be specified in a build,
  * thereby eliminating the need for sniffing and or explicitly setting in the global variable dojoConfig.
  * Also, when multiple instances of dojo exist in a single application, each will necessarily be located
  * at an unique absolute module identifier as given by the package configuration. Implementing configuration
  * as a module allows for specifying unique, per-instance configurations.
  *
  */
@js.native
trait config extends js.Object {
  /**
    * Adds a callback via dojo/ready. Useful when Dojo is added after
    * the page loads and djConfig.afterOnLoad is true. Supports the same
    * arguments as dojo/ready. When using a function reference, use
    * djConfig.addOnLoad = function(){};. For object with function name use
    * djConfig.addOnLoad = [myObject, "functionName"]; and for object with
    * function reference use
    * djConfig.addOnLoad = [myObject, function(){}];
    *
    */
  var addOnLoad: js.Function = js.native
  /**
    *
    */
  var afterOnLoad: Boolean = js.native
  /**
    *
    */
  var baseUrl: js.Object = js.native
  /**
    * Defines a callback to be used when dependencies are defined before
    * the loader has been loaded. When provided, they cause the loader to
    * execute require(deps, callback) once it has finished loading.
    * Should be used with deps.
    *
    */
  var callback: js.Function = js.native
  /**
    *
    */
  var debugContainerId: String = js.native
  /**
    *
    */
  var debugHeight: Double = js.native
  /**
    * Default duration, in milliseconds, for wipe and fade animations within dijits.
    * Assigned to dijit.defaultDuration.
    *
    */
  var defaultDuration: Double = js.native
  /**
    * Whether deferred instrumentation should be loaded or included
    * in builds.
    *
    */
  var deferredInstrumentation: Boolean = js.native
  /**
    * Defines dependencies to be used before the loader has been loaded.
    * When provided, they cause the loader to execute require(deps, callback)
    * once it has finished loading. Should be used with callback.
    *
    */
  var deps: js.Function = js.native
  /**
    * Used by some modules to configure an empty iframe. Used by dojo/io/iframe and
    * dojo/back, and dijit/popup support in IE where an iframe is needed to make sure native
    * controls do not bleed through the popups. Normally this configuration variable
    * does not need to be set, except when using cross-domain/CDN Dojo builds.
    * Save dojo/resources/blank.html to your domain and set djConfig.dojoBlankHtmlUrl
    * to the path on your domain your copy of blank.html.
    *
    */
  var dojoBlankHtmlUrl: String = js.native
  /**
    * No default value. Specifies additional locales whose
    * resources should also be loaded alongside the default locale when
    * calls to dojo.requireLocalization() are processed.
    *
    */
  var extraLocale: js.Array[_] = js.native
  /**
    * Set this to true to enable publishing of topics for the different phases of
    * IO operations. Publishing is done via dojo/topic.publish(). See dojo/main.__IoPublish for a list
    * of topics that are published.
    *
    */
  var ioPublish: js.Object = js.native
  /**
    * Defaults to false. If set to true, ensures that Dojo provides
    * extended debugging feedback via Firebug. If Firebug is not available
    * on your platform, setting isDebug to true will force Dojo to
    * pull in (and display) the version of Firebug Lite which is
    * integrated into the Dojo distribution, thereby always providing a
    * debugging/logging console when isDebug is enabled. Note that
    * Firebug's console.* methods are ALWAYS defined by Dojo. If
    * isDebug is false and you are on a platform without Firebug, these
    * methods will be defined as no-ops.
    *
    */
  var isDebug: Boolean = js.native
  /**
    * The locale to assume for loading localized resources in this page,
    * specified according to RFC 3066.
    * Must be specified entirely in lowercase, e.g. en-us and zh-cn.
    * See the documentation for dojo.i18n and dojo.requireLocalization
    * for details on loading localized resources. If no locale is specified,
    * Dojo assumes the locale of the user agent, according to navigator.userLanguage
    * or navigator.language properties.
    *
    */
  var locale: String = js.native
  /**
    * A map of module names to paths relative to dojo.baseUrl. The
    * key/value pairs correspond directly to the arguments which
    * dojo.registerModulePath accepts. Specifying
    * djConfig.modulePaths = { "foo": "../../bar" } is the equivalent
    * of calling dojo.registerModulePath("foo", "../../bar");. Multiple
    * modules may be configured via djConfig.modulePaths.
    *
    */
  var modulePaths: js.Object = js.native
  /**
    * Run the parser after the page is loaded
    *
    */
  var parseOnLoad: Boolean = js.native
  /**
    * An array of module names to be loaded immediately after dojo.js has been included
    * in a page.
    *
    */
  var require: js.Object = js.native
  /**
    * Array containing the r, g, b components used as transparent color in dojo.Color;
    * if undefined, [255,255,255] (white) will be used.
    *
    */
  var transparentColor: js.Array[_] = js.native
  /**
    * Used by dojox.analytics.Urchin as the default UA-123456-7 account
    * number used when being created. Alternately, you can pass an acct:""
    * parameter to the constructor a la: new dojox.analytics.Urchin({ acct:"UA-123456-7" });
    *
    */
  var urchin: String = js.native
  /**
    * If set to a value that evaluates to true such as a string or array and
    * isDebug is true and Firebug is not available or running, then it bypasses
    * the creation of Firebug Lite allowing you to define your own console object.
    *
    */
  var useCustomLogger: js.Object = js.native
  /**
    * Whether the deferred instrumentation should be used.
    *
    * "report-rejections": report each rejection as it occurs.
    * true or 1 or "report-unhandled-rejections": wait 1 second
    *   in an attempt to detect unhandled rejections.
    *
    */
  var useDeferredInstrumentation: Boolean = js.native
}

object config {
  @scala.inline
  def apply(
    addOnLoad: js.Function,
    afterOnLoad: Boolean,
    baseUrl: js.Object,
    callback: js.Function,
    debugContainerId: String,
    debugHeight: Double,
    defaultDuration: Double,
    deferredInstrumentation: Boolean,
    deps: js.Function,
    dojoBlankHtmlUrl: String,
    extraLocale: js.Array[_],
    ioPublish: js.Object,
    isDebug: Boolean,
    locale: String,
    modulePaths: js.Object,
    parseOnLoad: Boolean,
    require: js.Object,
    transparentColor: js.Array[_],
    urchin: String,
    useCustomLogger: js.Object,
    useDeferredInstrumentation: Boolean
  ): config = {
    val __obj = js.Dynamic.literal(addOnLoad = addOnLoad.asInstanceOf[js.Any], afterOnLoad = afterOnLoad.asInstanceOf[js.Any], baseUrl = baseUrl.asInstanceOf[js.Any], callback = callback.asInstanceOf[js.Any], debugContainerId = debugContainerId.asInstanceOf[js.Any], debugHeight = debugHeight.asInstanceOf[js.Any], defaultDuration = defaultDuration.asInstanceOf[js.Any], deferredInstrumentation = deferredInstrumentation.asInstanceOf[js.Any], deps = deps.asInstanceOf[js.Any], dojoBlankHtmlUrl = dojoBlankHtmlUrl.asInstanceOf[js.Any], extraLocale = extraLocale.asInstanceOf[js.Any], ioPublish = ioPublish.asInstanceOf[js.Any], isDebug = isDebug.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any], modulePaths = modulePaths.asInstanceOf[js.Any], parseOnLoad = parseOnLoad.asInstanceOf[js.Any], require = require.asInstanceOf[js.Any], transparentColor = transparentColor.asInstanceOf[js.Any], urchin = urchin.asInstanceOf[js.Any], useCustomLogger = useCustomLogger.asInstanceOf[js.Any], useDeferredInstrumentation = useDeferredInstrumentation.asInstanceOf[js.Any])
    __obj.asInstanceOf[config]
  }
  @scala.inline
  implicit class configOps[Self <: config] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddOnLoad(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addOnLoad")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAfterOnLoad(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterOnLoad")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBaseUrl(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCallback(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callback")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDebugContainerId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debugContainerId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDebugHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debugHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDefaultDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultDuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeferredInstrumentation(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deferredInstrumentation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeps(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDojoBlankHtmlUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dojoBlankHtmlUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExtraLocale(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extraLocale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIoPublish(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ioPublish")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsDebug(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isDebug")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLocale(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withModulePaths(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modulePaths")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParseOnLoad(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parseOnLoad")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRequire(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("require")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTransparentColor(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transparentColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUrchin(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("urchin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUseCustomLogger(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useCustomLogger")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUseDeferredInstrumentation(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useDeferredInstrumentation")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

