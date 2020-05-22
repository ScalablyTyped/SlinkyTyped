package typingsSlinky.cypress.cypressMod.Cypress

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.BeforeUnloadEvent
import org.scalajs.dom.raw.Document
import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.HTMLSelectElement
import org.scalajs.dom.raw.Window
import typingsSlinky.cypress.JQuery
import typingsSlinky.cypress.JQuery.PlainObject
import typingsSlinky.cypress.JQuery.Selector
import typingsSlinky.cypress.JQuery.htmlString
import typingsSlinky.cypress.JQueryStatic
import typingsSlinky.cypress.Mocha.IRunnable
import typingsSlinky.cypress.Mocha.ITest
import typingsSlinky.cypress.anon.Add
import typingsSlinky.cypress.anon.Debug
import typingsSlinky.cypress.anon.Defaults
import typingsSlinky.cypress.anon.IsHidden
import typingsSlinky.cypress.anon.Name
import typingsSlinky.cypress.anon.PartialConfigOptions
import typingsSlinky.cypress.anon.PartialLogConfig
import typingsSlinky.cypress.anon.`0`
import typingsSlinky.cypress.cyBlobUtilMod.BlobUtilStatic
import typingsSlinky.cypress.cyBluebirdMod.BluebirdStatic
import typingsSlinky.cypress.cyMinimatchMod.MinimatchOptions
import typingsSlinky.cypress.cyMomentMod.MomentStatic
import typingsSlinky.cypress.cypressBooleans.`false`
import typingsSlinky.cypress.cypressStrings.animationDistanceThreshold
import typingsSlinky.cypress.cypressStrings.baseUrl
import typingsSlinky.cypress.cypressStrings.bundled
import typingsSlinky.cypress.cypressStrings.chromeWebSecurity
import typingsSlinky.cypress.cypressStrings.commandColonend
import typingsSlinky.cypress.cypressStrings.commandColonenqueued
import typingsSlinky.cypress.cypressStrings.commandColonretry
import typingsSlinky.cypress.cypressStrings.commandColonstart
import typingsSlinky.cypress.cypressStrings.defaultCommandTimeout
import typingsSlinky.cypress.cypressStrings.env
import typingsSlinky.cypress.cypressStrings.execTimeout
import typingsSlinky.cypress.cypressStrings.fail
import typingsSlinky.cypress.cypressStrings.fileServerFolder
import typingsSlinky.cypress.cypressStrings.fixturesFolder
import typingsSlinky.cypress.cypressStrings.ignoreTestFiles
import typingsSlinky.cypress.cypressStrings.integrationFolder
import typingsSlinky.cypress.cypressStrings.logColonadded
import typingsSlinky.cypress.cypressStrings.logColonchanged
import typingsSlinky.cypress.cypressStrings.nodeVersion
import typingsSlinky.cypress.cypressStrings.numTestsKeptInMemory
import typingsSlinky.cypress.cypressStrings.pageLoadTimeout
import typingsSlinky.cypress.cypressStrings.pluginsFile
import typingsSlinky.cypress.cypressStrings.port
import typingsSlinky.cypress.cypressStrings.reporter
import typingsSlinky.cypress.cypressStrings.requestTimeout
import typingsSlinky.cypress.cypressStrings.resolvedNodePath
import typingsSlinky.cypress.cypressStrings.resolvedNodeVersion
import typingsSlinky.cypress.cypressStrings.responseTimeout
import typingsSlinky.cypress.cypressStrings.screenshotsFolder
import typingsSlinky.cypress.cypressStrings.scrolled
import typingsSlinky.cypress.cypressStrings.supportFile
import typingsSlinky.cypress.cypressStrings.system
import typingsSlinky.cypress.cypressStrings.testColonafterColonrun
import typingsSlinky.cypress.cypressStrings.testColonbeforeColonrun
import typingsSlinky.cypress.cypressStrings.trashAssetsBeforeRuns
import typingsSlinky.cypress.cypressStrings.uncaughtColonexception
import typingsSlinky.cypress.cypressStrings.urlColonchanged
import typingsSlinky.cypress.cypressStrings.video
import typingsSlinky.cypress.cypressStrings.videoCompression
import typingsSlinky.cypress.cypressStrings.videoUploadOnPasses
import typingsSlinky.cypress.cypressStrings.videosFolder
import typingsSlinky.cypress.cypressStrings.viewportColonchanged
import typingsSlinky.cypress.cypressStrings.viewportHeight
import typingsSlinky.cypress.cypressStrings.viewportWidth
import typingsSlinky.cypress.cypressStrings.waitForAnimations
import typingsSlinky.cypress.cypressStrings.watchForFileChanges
import typingsSlinky.cypress.cypressStrings.windowColonalert
import typingsSlinky.cypress.cypressStrings.windowColonbeforeColonload
import typingsSlinky.cypress.cypressStrings.windowColonbeforeColonunload
import typingsSlinky.cypress.cypressStrings.windowColonconfirm
import typingsSlinky.cypress.cypressStrings.windowColonload
import typingsSlinky.cypress.cypressStrings.windowColonunload
import typingsSlinky.cypress.lodashMod.LoDashImplicitWrapper
import typingsSlinky.cypress.lodashMod.LoDashStatic
import typingsSlinky.cypress.sinonMod.SinonSpy
import typingsSlinky.cypress.sinonMod.SinonStub
import typingsSlinky.moment.mod.Moment
import typingsSlinky.moment.mod.MomentFormatSpecification
import typingsSlinky.moment.mod.MomentInput
import typingsSlinky.std.ArrayLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Several libraries are bundled with Cypress by default.
  *
  * @see https://on.cypress.io/api
  */
@js.native
trait Cypress extends js.Object {
  /**
    * jQuery library
    *
    * @see https://on.cypress.io/$
    * @example
    *    Cypress.$('p')
    */
  @JSName("$")
  var $_Original: JQueryStatic = js.native
  /**
    * Cypress automatically includes a Blob library and exposes it as Cypress.Blob.
    *
    * @see https://on.cypress.io/blob
    * @see https://github.com/nolanlawson/blob-util
    * @example
    *    Cypress.Blob.method()
    */
  var Blob: BlobUtilStatic = js.native
  /**
    * @see https://on.cypress.io/api/commands
    */
  var Commands: Add = js.native
  /**
    * @see https://on.cypress.io/cookies
    */
  var Cookies: Debug = js.native
  /**
    * Internal class for LocalStorage management.
    */
  var LocalStorage: typingsSlinky.cypress.cypressMod.Cypress.LocalStorage = js.native
  /**
    * Cypress automatically includes Bluebird and exposes it as Cypress.Promise.
    *
    * @see https://on.cypress.io/promise
    * @see https://github.com/petkaantonov/bluebird
    * @example
    *   new Cypress.Promise((resolve, reject) => { ... })
    */
  var Promise: BluebirdStatic = js.native
  /**
    * @see https://on.cypress.io/api/screenshot-api
    */
  var Screenshot: `0` = js.native
  /**
    * @see https://on.cypress.io/api/api-server
    */
  var Server: Defaults = js.native
  /**
    * Lodash library
    *
    * @see https://on.cypress.io/_
    * @example
    *    Cypress._.keys(obj)
    */
  @JSName("_")
  var _underscore_Original: LoDashStatic = js.native
  /**
    * CPU architecture, from Node `os.arch()`
    *
    * @see https://nodejs.org/api/os.html#os_os_arch
    * @example
    *    Cypress.arch // "x64"
    */
  var arch: String = js.native
  /**
    * Information about the browser currently running the tests
    */
  var browser: Browser = js.native
  /**
    * @see https://on.cypress.io/dom
    */
  var dom: IsHidden = js.native
  /**
    * Cypress automatically includes minimatch and exposes it as Cypress.minimatch.
    *
    * @see https://on.cypress.io/minimatch
    */
  @JSName("minimatch")
  var minimatch_Original: js.Function3[
    /* target */ String, 
    /* pattern */ String, 
    /* options */ js.UndefOr[MinimatchOptions], 
    Boolean
  ] = js.native
  /**
    * Cypress automatically includes moment.js and exposes it as Cypress.moment.
    *
    * @see https://on.cypress.io/moment
    * @see http://momentjs.com/
    * @example
    *    const todaysDate = Cypress.moment().format("MMM DD, YYYY")
    */
  @JSName("moment")
  var moment_Original: MomentStatic = js.native
  /**
    * These events come from Cypress as it issues commands and reacts to their state. These are all useful to listen to for debugging purposes.
    * @see https://on.cypress.io/catalog-of-events#App-Events
    */
  @JSName("off")
  var off_Original: Actions = js.native
  /**
    * These events come from Cypress as it issues commands and reacts to their state. These are all useful to listen to for debugging purposes.
    * @see https://on.cypress.io/catalog-of-events#App-Events
    */
  @JSName("on")
  var on_Original: Actions = js.native
  /**
    * These events come from Cypress as it issues commands and reacts to their state. These are all useful to listen to for debugging purposes.
    * @see https://on.cypress.io/catalog-of-events#App-Events
    */
  @JSName("once")
  var once_Original: Actions = js.native
  /**
    * OS platform name, from Node `os.platform()`
    *
    * @see https://nodejs.org/api/os.html#os_os_platform
    * @example
    *    Cypress.platform // "darwin"
    */
  var platform: String = js.native
  /**
    * Currently executing spec file.
    * @example
    ```
    Cypress.spec
    // {
    //  name: "config_passing_spec.coffee",
    //  relative: "cypress/integration/config_passing_spec.coffee",
    //  absolute: "/users/smith/projects/web/cypress/integration/config_passing_spec.coffee"
    // }
    ```
    */
  var spec: Name = js.native
  /**
    * Cypress version string. i.e. "1.1.2"
    * @see https://on.cypress.io/version
    * @example
    ```
    expect(Cypress.version).to.be.a('string')
    if (Cypress.version === '1.2.0') {
    // test something specific
    }
    ```
    */
  var version: String = js.native
  /**
    * Return a collection of matched elements either found in the DOM based on passed argument(s) or created by passing an HTML string.
    * @param element A DOM element to wrap in a jQuery object.
    * @see \`{@link https://api.jquery.com/jQuery/ }\`
    * @since 1.0
    * @example ​ ````Set the background color of the page to black.
  ```javascript
  $( document.body ).css( "background", "black" );
  ```
    */
  // NOTE: `HTMLSelectElement` is both an Element and an Array-Like Object but jQuery treats it as an Element.
  /**
    * jQuery library
    *
    * @see https://on.cypress.io/$
    * @example
    *    Cypress.$('p')
    */
  @JSName("$")
  def $(element: HTMLSelectElement): JQuery[HTMLSelectElement] = js.native
  // HACK: This is the factory function returned when importing jQuery without a DOM. Declaring it separately breaks using the type parameter on JQueryStatic.
  // HACK: The discriminator parameter handles the edge case of passing a Window object to JQueryStatic. It doesn't actually exist on the factory function.
  /**
    * jQuery library
    *
    * @see https://on.cypress.io/$
    * @example
    *    Cypress.$('p')
    */
  @JSName("$")
  def $(window: Window, discriminator: Boolean): JQueryStatic = js.native
  /**
    * Returns an empty jQuery set.
    * @see \`{@link https://api.jquery.com/jQuery/ }\`
    * @since 1.4
    */
  // tslint:disable-next-line:no-unnecessary-generics
  /**
    * jQuery library
    *
    * @see https://on.cypress.io/$
    * @example
    *    Cypress.$('p')
    */
  @JSName("$")
  def $[TElement](): JQuery[TElement] = js.native
  /**
    * Binds a function to be executed when the DOM has finished loading.
    * @param callback The function to execute when the DOM is ready.
    * @see \`{@link https://api.jquery.com/jQuery/ }\`
    * @since 1.0
    * @example ​ ````Execute the function when the DOM is ready to be used.
  ```javascript
  $(function() {
    // Document is ready
  });
  ```
    * @example ​ ````Use both the shortcut for $(document).ready() and the argument to write failsafe jQuery code using the $ alias, without relying on the global alias.
  ```javascript
  jQuery(function( $ ) {
    // Your code using failsafe $ alias here...
  });
  ```
    */
  // tslint:disable-next-line:no-unnecessary-generics unified-signatures
  /**
    * jQuery library
    *
    * @see https://on.cypress.io/$
    * @example
    *    Cypress.$('p')
    */
  @JSName("$")
  def $[TElement](callback: js.ThisFunction1[/* this */ Document, /* $ */ this.type, Unit]): JQuery[TElement] = js.native
  @JSName("$")
  def $[T /* <: Element */](element_elementArray: ArrayLike[T]): JQuery[T] = js.native
  /**
    * Creates DOM elements on the fly from the provided string of raw HTML.
    * @param html _&#x40;param_ `html`
    * <br>
    * * `html (ownerDocument)` — A string of HTML to create on the fly. Note that this parses HTML, not XML. <br>
    * * `html (attributes)` — A string defining a single, standalone, HTML element (e.g. &lt;div/&gt; or &lt;div&gt;&lt;/div&gt;).
    * @param ownerDocument_attributes _&#x40;param_ `ownerDocument_attributes`
    * <br>
    * * `ownerDocument` — A document in which the new elements will be created. <br>
    * * `attributes` — An object of attributes, events, and methods to call on the newly-created element.
    * @see \`{@link https://api.jquery.com/jQuery/ }\`
    * @since 1.0
    * @since 1.4
    * @example ​ ````Create a div element (and all of its contents) dynamically and append it to the body element. Internally, an element is created and its innerHTML property set to the given markup.
  ```javascript
  $( "<div><p>Hello</p></div>" ).appendTo( "body" )
  ```
    * @example ​ ````Create some DOM elements.
  ```javascript
  $( "<div/>", {
    "class": "test",
    text: "Click me!",
    click: function() {
    $( this ).toggleClass( "test" );
    }
  })
    .appendTo( "body" );
  ```
    */
  // tslint:disable-next-line:no-unnecessary-generics
  /**
    * jQuery library
    *
    * @see https://on.cypress.io/$
    * @example
    *    Cypress.$('p')
    */
  @JSName("$")
  def $[TElement /* <: HTMLElement */](html: htmlString): JQuery[TElement] = js.native
  @JSName("$")
  def $[TElement /* <: HTMLElement */](html: htmlString, ownerDocument_attributes: PlainObject[_]): JQuery[TElement] = js.native
  @JSName("$")
  def $[TElement /* <: HTMLElement */](html: htmlString, ownerDocument_attributes: Document): JQuery[TElement] = js.native
  /**
    * Return a collection of matched elements either found in the DOM based on passed argument(s) or created by passing an HTML string.
    * @param object A plain object to wrap in a jQuery object.
    * @see \`{@link https://api.jquery.com/jQuery/ }\`
    * @since 1.0
    */
  /**
    * jQuery library
    *
    * @see https://on.cypress.io/$
    * @example
    *    Cypress.$('p')
    */
  @JSName("$")
  def $[T /* <: PlainObject[_] */](`object`: T): JQuery[T] = js.native
  /**
    * Return a collection of matched elements either found in the DOM based on passed argument(s) or created by passing an HTML string.
    * @param selection An existing jQuery object to clone.
    * @see \`{@link https://api.jquery.com/jQuery/ }\`
    * @since 1.0
    */
  /**
    * jQuery library
    *
    * @see https://on.cypress.io/$
    * @example
    *    Cypress.$('p')
    */
  @JSName("$")
  def $[T](selection: JQuery[T]): JQuery[T] = js.native
  @JSName("$")
  def $[TElement /* <: Element */](selector: Selector, context: JQuery[HTMLElement]): JQuery[TElement] = js.native
  @JSName("$")
  def $[TElement /* <: Element */](selector: Selector, context: Element): JQuery[TElement] = js.native
  /**
    * Accepts a string containing a CSS selector which is then used to match a set of elements.
    * @param selector A string containing a selector expression
    * @param context A DOM Element, Document, or jQuery to use as context
    * @see \`{@link https://api.jquery.com/jQuery/ }\`
    * @since 1.0
    * @example ​ ````Find all p elements that are children of a div element and apply a border to them.
  ```html
  <!doctype html>
  <html lang="en">
  <head>
    <meta charset="utf-8">
    <title>jQuery demo</title>
    <script src="https://code.jquery.com/jquery-3.3.1.js"></script>
  </head>
  <body>
  ​
  <p>one</p>
  <div><p>two</p></div>
  <p>three</p>
  ​
  <script>
  $( "div > p" ).css( "border", "1px solid gray" );
  </script>
  </body>
  </html>
  ```
    * @example ​ ````Find all inputs of type radio within the first form in the document.
  ```javascript
  $( "input:radio", document.forms[ 0 ] );
  ```
    * @example ​ ````Find all div elements within an XML document from an Ajax response.
  ```javascript
  $( "div", xml.responseXML );
  ```
  ​
    */
  // tslint:disable-next-line:no-unnecessary-generics
  /**
    * jQuery library
    *
    * @see https://on.cypress.io/$
    * @example
    *    Cypress.$('p')
    */
  @JSName("$")
  def $_TElement_Element[TElement /* <: Element */](selector: Selector): JQuery[TElement] = js.native
  @JSName("$")
  def $_TElement_Element[TElement /* <: Element */](selector: Selector, context: Document): JQuery[TElement] = js.native
  /**
    * Return a collection of matched elements either found in the DOM based on passed argument(s) or created by passing an HTML string.
    * @param element_elementArray _&#x40;param_ `element_elementArray`
    * <br>
    * * `element` — A DOM element to wrap in a jQuery object. <br>
    * * `elementArray` — An array containing a set of DOM elements to wrap in a jQuery object.
    * @see \`{@link https://api.jquery.com/jQuery/ }\`
    * @since 1.0
    * @example ​ ````Set the background color of the page to black.
  ```javascript
  $( document.body ).css( "background", "black" );
  ```
    * @example ​ ````Hide all the input elements within a form.
  ```javascript
  $( myForm.elements ).hide();
  ```
    */
  /**
    * jQuery library
    *
    * @see https://on.cypress.io/$
    * @example
    *    Cypress.$('p')
    */
  @JSName("$")
  def $_T_Element[T /* <: Element */](element_elementArray: T): JQuery[T] = js.native
  /**
    * Creates a lodash object which wraps value to enable implicit method chain sequences.
    * Methods that operate on and return arrays, collections, and functions can be chained together.
    * Methods that retrieve a single value or may return a primitive value will automatically end the
    * chain sequence and return the unwrapped value. Otherwise, the value must be unwrapped with value().
    *
    * Explicit chain sequences, which must be unwrapped with value(), may be enabled using _.chain.
    *
    * The execution of chained methods is lazy, that is, it's deferred until value() is
    * implicitly or explicitly called.
    *
    * Lazy evaluation allows several methods to support shortcut fusion. Shortcut fusion
    * is an optimization to merge iteratee calls; this avoids the creation of intermediate
    * arrays and can greatly reduce the number of iteratee executions. Sections of a chain
    * sequence qualify for shortcut fusion if the section is applied to an array and iteratees
    * accept only one argument. The heuristic for whether a section qualifies for shortcut
    * fusion is subject to change.
    *
    * Chaining is supported in custom builds as long as the value() method is directly or
    * indirectly included in the build.
    *
    * In addition to lodash methods, wrappers have Array and String methods.
    * The wrapper Array methods are:
    * concat, join, pop, push, shift, sort, splice, and unshift.
    * The wrapper String methods are:
    * replace and split.
    *
    * The wrapper methods that support shortcut fusion are:
    * at, compact, drop, dropRight, dropWhile, filter, find, findLast, head, initial, last,
    * map, reject, reverse, slice, tail, take, takeRight, takeRightWhile, takeWhile, and toArray
    *
    * The chainable wrapper methods are:
    * after, ary, assign, assignIn, assignInWith, assignWith, at, before, bind, bindAll, bindKey,
    * castArray, chain, chunk, commit, compact, concat, conforms, constant, countBy, create,
    * curry, debounce, defaults, defaultsDeep, defer, delay, difference, differenceBy, differenceWith,
    * drop, dropRight, dropRightWhile, dropWhile, extend, extendWith, fill, filter, flatMap,
    * flatMapDeep, flatMapDepth, flatten, flattenDeep, flattenDepth, flip, flow, flowRight,
    * fromPairs, functions, functionsIn, groupBy, initial, intersection, intersectionBy, intersectionWith,
    * invert, invertBy, invokeMap, iteratee, keyBy, keys, keysIn, map, mapKeys, mapValues,
    * matches, matchesProperty, memoize, merge, mergeWith, method, methodOf, mixin, negate,
    * nthArg, omit, omitBy, once, orderBy, over, overArgs, overEvery, overSome, partial, partialRight,
    * partition, pick, pickBy, plant, property, propertyOf, pull, pullAll, pullAllBy, pullAllWith, pullAt,
    * push, range, rangeRight, rearg, reject, remove, rest, reverse, sampleSize, set, setWith,
    * shuffle, slice, sort, sortBy, sortedUniq, sortedUniqBy, splice, spread, tail, take,
    * takeRight, takeRightWhile, takeWhile, tap, throttle, thru, toArray, toPairs, toPairsIn,
    * toPath, toPlainObject, transform, unary, union, unionBy, unionWith, uniq, uniqBy, uniqWith,
    * unset, unshift, unzip, unzipWith, update, updateWith, values, valuesIn, without, wrap,
    * xor, xorBy, xorWith, zip, zipObject, zipObjectDeep, and zipWith.
    *
    * The wrapper methods that are not chainable by default are:
    * add, attempt, camelCase, capitalize, ceil, clamp, clone, cloneDeep, cloneDeepWith, cloneWith,
    * conformsTo, deburr, defaultTo, divide, each, eachRight, endsWith, eq, escape, escapeRegExp,
    * every, find, findIndex, findKey, findLast, findLastIndex, findLastKey, first, floor, forEach,
    * forEachRight, forIn, forInRight, forOwn, forOwnRight, get, gt, gte, has, hasIn, head,
    * identity, includes, indexOf, inRange, invoke, isArguments, isArray, isArrayBuffer,
    * isArrayLike, isArrayLikeObject, isBoolean, isBuffer, isDate, isElement, isEmpty, isEqual, isEqualWith,
    * isError, isFinite, isFunction, isInteger, isLength, isMap, isMatch, isMatchWith, isNaN,
    * isNative, isNil, isNull, isNumber, isObject, isObjectLike, isPlainObject, isRegExp,
    * isSafeInteger, isSet, isString, isUndefined, isTypedArray, isWeakMap, isWeakSet, join,
    * kebabCase, last, lastIndexOf, lowerCase, lowerFirst, lt, lte, max, maxBy, mean, meanBy,
    * min, minBy, multiply, noConflict, noop, now, nth, pad, padEnd, padStart, parseInt, pop,
    * random, reduce, reduceRight, repeat, result, round, runInContext, sample, shift, size,
    * snakeCase, some, sortedIndex, sortedIndexBy, sortedLastIndex, sortedLastIndexBy, startCase,
    * startsWith, stubArray, stubFalse, stubObject, stubString, stubTrue, subtract, sum, sumBy,
    * template, times, toFinite, toInteger, toJSON, toLength, toLower, toNumber, toSafeInteger,
    * toString, toUpper, trim, trimEnd, trimStart, truncate, unescape, uniqueId, upperCase,
    * upperFirst, value, and words.
    **/
  /**
    * Lodash library
    *
    * @see https://on.cypress.io/_
    * @example
    *    Cypress._.keys(obj)
    */
  @JSName("_")
  def _underscore[T](value: T): LoDashImplicitWrapper[T] = js.native
  /**
    * Returns all configuration objects.
    * @see https://on.cypress.io/config
    * @example
    ```
    Cypress.config()
    // {defaultCommandTimeout: 10000, pageLoadTimeout: 30000, ...}
    ```
    */
  def config(): ConfigOptions = js.native
  /**
    * Sets multiple configuration values at once.
    * @see https://on.cypress.io/config
    * @example
    ```
    Cypress.config({
    defaultCommandTimeout: 10000,
    viewportHeight: 900
    })
    ```
    */
  def config(Object: PartialConfigOptions): Unit = js.native
  def config(key: nodeVersion, value: bundled): Unit = js.native
  def config(key: nodeVersion, value: system): Unit = js.native
  @JSName("config")
  def config_animationDistanceThreshold(key: animationDistanceThreshold): Double = js.native
  @JSName("config")
  def config_animationDistanceThreshold(key: animationDistanceThreshold, value: Double): Unit = js.native
  /**
    * Returns one configuration value.
    * @see https://on.cypress.io/config
    * @example
    ```
    Cypress.config('pageLoadTimeout')
    // 60000
    ```
    */
  @JSName("config")
  def config_baseUrl(key: baseUrl): String | Null = js.native
  /**
    * Sets one configuration value.
    * @see https://on.cypress.io/config
    * @example
    ```
    Cypress.config('viewportWidth', 800)
    ```
    */
  @JSName("config")
  def config_baseUrl(key: baseUrl, value: String): Unit = js.native
  @JSName("config")
  def config_baseUrl_Unit(key: baseUrl): Unit = js.native
  @JSName("config")
  def config_chromeWebSecurity(key: chromeWebSecurity): Boolean = js.native
  @JSName("config")
  def config_chromeWebSecurity(key: chromeWebSecurity, value: Boolean): Unit = js.native
  @JSName("config")
  def config_defaultCommandTimeout(key: defaultCommandTimeout): Double = js.native
  @JSName("config")
  def config_defaultCommandTimeout(key: defaultCommandTimeout, value: Double): Unit = js.native
  @JSName("config")
  def config_env(key: env): StringDictionary[js.Any] = js.native
  @JSName("config")
  def config_env(key: env, value: StringDictionary[js.Any]): Unit = js.native
  @JSName("config")
  def config_execTimeout(key: execTimeout): Double = js.native
  @JSName("config")
  def config_execTimeout(key: execTimeout, value: Double): Unit = js.native
  @JSName("config")
  def config_fileServerFolder(key: fileServerFolder): String = js.native
  @JSName("config")
  def config_fileServerFolder(key: fileServerFolder, value: String): Unit = js.native
  @JSName("config")
  def config_fixturesFolder(key: fixturesFolder): String = js.native
  @JSName("config")
  def config_fixturesFolder(key: fixturesFolder, value: String): Unit = js.native
  @JSName("config")
  def config_ignoreTestFiles(key: ignoreTestFiles): String | js.Array[String] = js.native
  @JSName("config")
  def config_ignoreTestFiles(key: ignoreTestFiles, value: String): Unit = js.native
  @JSName("config")
  def config_ignoreTestFiles(key: ignoreTestFiles, value: js.Array[String]): Unit = js.native
  @JSName("config")
  def config_integrationFolder(key: integrationFolder): String = js.native
  @JSName("config")
  def config_integrationFolder(key: integrationFolder, value: String): Unit = js.native
  @JSName("config")
  def config_nodeVersion(key: nodeVersion): system | bundled = js.native
  @JSName("config")
  def config_numTestsKeptInMemory(key: numTestsKeptInMemory): Double = js.native
  @JSName("config")
  def config_numTestsKeptInMemory(key: numTestsKeptInMemory, value: Double): Unit = js.native
  @JSName("config")
  def config_pageLoadTimeout(key: pageLoadTimeout): Double = js.native
  @JSName("config")
  def config_pageLoadTimeout(key: pageLoadTimeout, value: Double): Unit = js.native
  @JSName("config")
  def config_pluginsFile(key: pluginsFile): String = js.native
  @JSName("config")
  def config_pluginsFile(key: pluginsFile, value: String): Unit = js.native
  @JSName("config")
  def config_port(key: port): Double | Null = js.native
  @JSName("config")
  def config_port(key: port, value: Double): Unit = js.native
  @JSName("config")
  def config_port_Unit(key: port): Unit = js.native
  @JSName("config")
  def config_reporter(key: reporter): String = js.native
  @JSName("config")
  def config_reporter(key: reporter, value: String): Unit = js.native
  @JSName("config")
  def config_requestTimeout(key: requestTimeout): Double = js.native
  @JSName("config")
  def config_requestTimeout(key: requestTimeout, value: Double): Unit = js.native
  @JSName("config")
  def config_resolvedNodePath(key: resolvedNodePath): String = js.native
  @JSName("config")
  def config_resolvedNodePath(key: resolvedNodePath, value: String): Unit = js.native
  @JSName("config")
  def config_resolvedNodeVersion(key: resolvedNodeVersion): String = js.native
  @JSName("config")
  def config_resolvedNodeVersion(key: resolvedNodeVersion, value: String): Unit = js.native
  @JSName("config")
  def config_responseTimeout(key: responseTimeout): Double = js.native
  @JSName("config")
  def config_responseTimeout(key: responseTimeout, value: Double): Unit = js.native
  @JSName("config")
  def config_screenshotsFolder(key: screenshotsFolder): String = js.native
  @JSName("config")
  def config_screenshotsFolder(key: screenshotsFolder, value: String): Unit = js.native
  @JSName("config")
  def config_supportFile(key: supportFile): String = js.native
  @JSName("config")
  def config_supportFile(key: supportFile, value: String): Unit = js.native
  @JSName("config")
  def config_trashAssetsBeforeRuns(key: trashAssetsBeforeRuns): Boolean = js.native
  @JSName("config")
  def config_trashAssetsBeforeRuns(key: trashAssetsBeforeRuns, value: Boolean): Unit = js.native
  @JSName("config")
  def config_video(key: video): Boolean = js.native
  @JSName("config")
  def config_video(key: video, value: Boolean): Unit = js.native
  @JSName("config")
  def config_videoCompression(key: videoCompression): Double = js.native
  @JSName("config")
  def config_videoCompression(key: videoCompression, value: Double): Unit = js.native
  @JSName("config")
  def config_videoUploadOnPasses(key: videoUploadOnPasses): Boolean = js.native
  @JSName("config")
  def config_videoUploadOnPasses(key: videoUploadOnPasses, value: Boolean): Unit = js.native
  @JSName("config")
  def config_videosFolder(key: videosFolder): String = js.native
  @JSName("config")
  def config_videosFolder(key: videosFolder, value: String): Unit = js.native
  @JSName("config")
  def config_viewportHeight(key: viewportHeight): Double = js.native
  @JSName("config")
  def config_viewportHeight(key: viewportHeight, value: Double): Unit = js.native
  @JSName("config")
  def config_viewportWidth(key: viewportWidth): Double = js.native
  @JSName("config")
  def config_viewportWidth(key: viewportWidth, value: Double): Unit = js.native
  @JSName("config")
  def config_waitForAnimations(key: waitForAnimations): Boolean = js.native
  @JSName("config")
  def config_waitForAnimations(key: waitForAnimations, value: Boolean): Unit = js.native
  @JSName("config")
  def config_watchForFileChanges(key: watchForFileChanges): Boolean = js.native
  @JSName("config")
  def config_watchForFileChanges(key: watchForFileChanges, value: Boolean): Unit = js.native
  // no real way to type without generics
  /**
    * Returns all environment variables set with CYPRESS_ prefix or in "env" object in "cypress.json"
    *
    * @see https://on.cypress.io/env
    */
  def env(): ObjectLike = js.native
  /**
    * Returns specific environment variable or undefined
    * @see https://on.cypress.io/env
    * @example
    *    // cypress.json
    *    { "env": { "foo": "bar" } }
    *    Cypress.env("foo") // => bar
    */
  def env(key: String): js.Any = js.native
  /**
    * Set value for a variable.
    * Any value you change will be permanently changed for the remainder of your tests.
    * @see https://on.cypress.io/env
    * @example
    *    Cypress.env("host", "http://server.dev.local")
    */
  def env(key: String, value: js.Any): Unit = js.native
  /**
    * Set values for multiple variables at once. Values are merged with existing values.
    * @see https://on.cypress.io/env
    * @example
    *    Cypress.env({ host: "http://server.dev.local", foo: "foo" })
    */
  def env(`object`: ObjectLike): Unit = js.native
  def isCy(obj: js.Any): /* is cypress.cypress.Cypress.Chainable<any> */ Boolean = js.native
  /**
    * Checks if a variable is a valid instance of `cy` or a `cy` chainable.
    *
    * @see https://on.cypress.io/iscy
    * @example
    *    Cypress.isCy(cy) // => true
    */
  def isCy[TSubject](obj: Chainable[TSubject]): /* is cypress.cypress.Cypress.Chainable<TSubject> */ Boolean = js.native
  /**
    * Internal options for "cy.log" used in custom commands.
    *
    * @see https://on.cypress.io/cypress-log
    */
  def log(options: PartialLogConfig): Log = js.native
  /**
    * Cypress automatically includes minimatch and exposes it as Cypress.minimatch.
    *
    * @see https://on.cypress.io/minimatch
    */
  def minimatch(target: String, pattern: String): Boolean = js.native
  def minimatch(target: String, pattern: String, options: MinimatchOptions): Boolean = js.native
  /**
    * Cypress automatically includes moment.js and exposes it as Cypress.moment.
    *
    * @see https://on.cypress.io/moment
    * @see http://momentjs.com/
    * @example
    *    const todaysDate = Cypress.moment().format("MMM DD, YYYY")
    */
  def moment(): Moment = js.native
  /**
    * Cypress automatically includes moment.js and exposes it as Cypress.moment.
    *
    * @see https://on.cypress.io/moment
    * @see http://momentjs.com/
    * @example
    *    const todaysDate = Cypress.moment().format("MMM DD, YYYY")
    */
  def moment(inp: MomentInput): Moment = js.native
  /**
    * Cypress automatically includes moment.js and exposes it as Cypress.moment.
    *
    * @see https://on.cypress.io/moment
    * @see http://momentjs.com/
    * @example
    *    const todaysDate = Cypress.moment().format("MMM DD, YYYY")
    */
  def moment(inp: MomentInput, format: MomentFormatSpecification): Moment = js.native
  /**
    * Cypress automatically includes moment.js and exposes it as Cypress.moment.
    *
    * @see https://on.cypress.io/moment
    * @see http://momentjs.com/
    * @example
    *    const todaysDate = Cypress.moment().format("MMM DD, YYYY")
    */
  def moment(inp: MomentInput, format: MomentFormatSpecification, language: String): Moment = js.native
  /**
    * Cypress automatically includes moment.js and exposes it as Cypress.moment.
    *
    * @see https://on.cypress.io/moment
    * @see http://momentjs.com/
    * @example
    *    const todaysDate = Cypress.moment().format("MMM DD, YYYY")
    */
  def moment(inp: MomentInput, format: MomentFormatSpecification, language: String, strict: Boolean): Moment = js.native
  /**
    * Cypress automatically includes moment.js and exposes it as Cypress.moment.
    *
    * @see https://on.cypress.io/moment
    * @see http://momentjs.com/
    * @example
    *    const todaysDate = Cypress.moment().format("MMM DD, YYYY")
    */
  def moment(inp: MomentInput, format: MomentFormatSpecification, strict: Boolean): Moment = js.native
  /**
    * Cypress automatically includes moment.js and exposes it as Cypress.moment.
    *
    * @see https://on.cypress.io/moment
    * @see http://momentjs.com/
    * @example
    *    const todaysDate = Cypress.moment().format("MMM DD, YYYY")
    */
  def moment(inp: MomentInput, strict: Boolean): Moment = js.native
  /**
    * Fires when an uncaught exception occurs in your application.
    * Cypress will fail the test when this fires.
    * Return `false` from this event and Cypress will not fail the test. Also useful for debugging purposes because the actual `error` instance is provided to you.
    * @see https://on.cypress.io/catalog-of-events#App-Events
    * @example
    ```
    // likely want to do this in a support file
    // so it's applied to all spec files
    // cypress/support/index.js
    Cypress.on('uncaught:exception', (err, runnable) => {
    // returning false here prevents Cypress from
    // failing the test
    return false
    })
    // stub "window.alert" in a single test
    it('shows alert', () => {
    const stub = cy.stub()
    cy.on('window:alert', stub)
    // trigger application code that calls alert(...)
    .then(() => {
    expect(stub).to.have.been.calledOnce
    })
    })
    ```
    */
  /**
    * These events come from Cypress as it issues commands and reacts to their state. These are all useful to listen to for debugging purposes.
    * @see https://on.cypress.io/catalog-of-events#App-Events
    */
  def off(
    action: uncaughtColonexception,
    fn: js.Function2[/* error */ js.Error, /* runnable */ IRunnable, `false` | Unit]
  ): Unit = js.native
  /**
    * Fires when your app calls the global `window.confirm()` method.
    * Cypress will auto accept confirmations. Return `false` from this event and the confirmation will be canceled.
    * @see https://on.cypress.io/catalog-of-events#App-Events
    * @example
    ```
    cy.on('window:confirm', (str) => {
    console.log(str)
    return false // simulate "Cancel"
    })
    ```
    */
  /**
    * These events come from Cypress as it issues commands and reacts to their state. These are all useful to listen to for debugging purposes.
    * @see https://on.cypress.io/catalog-of-events#App-Events
    */
  def off(action: windowColonconfirm, fn: js.Function1[/* text */ String, `false` | Unit]): Unit = js.native
  /**
    * Fires when cy finishes running and executing your command. Useful for debugging and understanding how commands are handled.
    * @see https://on.cypress.io/catalog-of-events#App-Events
    */
  /**
    * These events come from Cypress as it issues commands and reacts to their state. These are all useful to listen to for debugging purposes.
    * @see https://on.cypress.io/catalog-of-events#App-Events
    */
  @JSName("off")
  def off_commandend(action: commandColonend, fn: js.Function1[/* command */ CommandQueue, Unit]): Unit = js.native
  /**
    * Fires when a cy command is first invoked and enqueued to be run later. Useful for debugging purposes if you're confused about the order in which commands will execute.
    * @see https://on.cypress.io/catalog-of-events#App-Events
    */
  /**
    * These events come from Cypress as it issues commands and reacts to their state. These are all useful to listen to for debugging purposes.
    * @see https://on.cypress.io/catalog-of-events#App-Events
    */
  @JSName("off")
  def off_commandenqueued(action: commandColonenqueued, fn: js.Function1[/* command */ EnqueuedCommand, Unit]): Unit = js.native
  /**
    * Fires whenever a command begins its retrying routines. This is called on the trailing edge after Cypress has internally waited for the retry interval. Useful to understand **why** a command is retrying, and generally includes the actual error causing the retry to happen. When commands fail the final error is the one that actually bubbles up to fail the test. This event is essentially to debug why Cypress is failing.
    * @see https://on.cypress.io/catalog-of-events#App-Events
    */
  /**
    * These events come from Cypress as it issues commands and reacts to their state. These are all useful to listen to for debugging purposes.
    * @see https://on.cypress.io/catalog-of-events#App-Events
    */
  @JSName("off")
  def off_commandretry(action: commandColonretry, fn: js.Function1[/* command */ CommandQueue, Unit]): Unit = js.native
  /**
    * Fires when cy begins actually running and executing your command. Useful for debugging and understanding how the command queue is async.
    * @see https://on.cypress.io/catalog-of-events#App-Events
    */
  /**
    * These events come from Cypress as it issues commands and reacts to their state. These are all useful to listen to for debugging purposes.
    * @see https://on.cypress.io/catalog-of-events#App-Events
    */
  @JSName("off")
  def off_commandstart(action: commandColonstart, fn: js.Function1[/* command */ CommandQueue, Unit]): Unit = js.native
  /**
    * Fires when the test has failed. It is technically possible to prevent the test from actually failing by binding to this event and invoking an async `done` callback. However this is **strongly discouraged**. Tests should never legitimately fail. This event exists because it's extremely useful for debugging purposes.
    * @see https://on.cypress.io/catalog-of-events#App-Events
    */
  /**
    * These events come from Cypress as it issues commands and reacts to their state. These are all useful to listen to for debugging purposes.
    * @see https://on.cypress.io/catalog-of-events#App-Events
    */
  @JSName("off")
  def off_fail(action: fail, fn: js.Function2[/* error */ js.Error, /* mocha */ IRunnable, Unit]): Unit = js.native
  /**
    * Fires whenever a command emits this event so it can be displayed in the Command Log. Useful to see how internal cypress commands utilize the {% url 'Cypress.log()' cypress-log %} API.
    * @see https://on.cypress.io/catalog-of-events#App-Events
    */
  /**
    * These events come from Cypress as it issues commands and reacts to their state. These are all useful to listen to for debugging purposes.
    * @see https://on.cypress.io/catalog-of-events#App-Events
    */
  @JSName("off")
  def off_logadded(action: logColonadded, fn: js.Function2[/* log */ js.Any, /* interactive */ Boolean, Unit]): Unit = js.native
  /**
    * Fires whenever a command's attributes changes. This event is debounced to prevent it from firing too quickly and too often. Useful to see how internal cypress commands utilize the {% url 'Cypress.log()' cypress-log %} API.
    * @see https://on.cypress.io/catalog-of-events#App-Events
    */
  /**
    * These events come from Cypress as it issues commands and reacts to their state. These are all useful to listen to for debugging purposes.
    * @see https://on.cypress.io/catalog-of-events#App-Events
    */
  @JSName("off")
  def off_logchanged(action: logColonchanged, fn: js.Function2[/* log */ js.Any, /* interactive */ Boolean, Unit]): Unit = js.native
  /**
    * Fires whenever **Cypress** is scrolling your application. This event is fired when Cypress is {% url 'waiting for and calculating actionability' interacting-with-elements %}. It will scroll to 'uncover' elements currently being covered. This event is extremely useful to debug why Cypress may think an element is not interactive.
    * @see https://on.cypress.io/catalog-of-events#App-Events
    */
  /**
    * These events come from Cypress as it issues commands and reacts to their state. These are all useful to listen to for debugging purposes.
    * @see https://on.cypress.io/catalog-of-events#App-Events
    */
  @JSName("off")
  def off_scrolled(action: scrolled, fn: js.Function1[/* $el */ JQuery[HTMLElement], Unit]): Unit = js.native
  /**
    * Fires after the test and all **afterEach** and **after** hooks run.
    * @see https://on.cypress.io/catalog-of-events#App-Events
    */
  /**
    * These events come from Cypress as it issues commands and reacts to their state. These are all useful to listen to for debugging purposes.
    * @see https://on.cypress.io/catalog-of-events#App-Events
    */
  @JSName("off")
  def off_testafterrun(
    action: testColonafterColonrun,
    fn: js.Function2[/* attributes */ ObjectLike, /* test */ ITest, Unit]
  ): Unit = js.native
  /**
    * Fires before the test and all **before** and **beforeEach** hooks run.
    * @see https://on.cypress.io/catalog-of-events#App-Events
    */
  /**
    * These events come from Cypress as it issues commands and reacts to their state. These are all useful to listen to for debugging purposes.
    * @see https://on.cypress.io/catalog-of-events#App-Events
    */
  @JSName("off")
  def off_testbeforerun(
    action: testColonbeforeColonrun,
    fn: js.Function2[/* attributes */ ObjectLike, /* test */ ITest, Unit]
  ): Unit = js.native
  /**
    * Fires whenever Cypress detects that your application's URL has changed.
    * @see https://on.cypress.io/catalog-of-events#App-Events
    */
  /**
    * These events come from Cypress as it issues commands and reacts to their state. These are all useful to listen to for debugging purposes.
    * @see https://on.cypress.io/catalog-of-events#App-Events
    */
  @JSName("off")
  def off_urlchanged(action: urlColonchanged, fn: js.Function1[/* url */ String, Unit]): Unit = js.native
  /**
    * Fires whenever the viewport changes via a `cy.viewport()` or naturally when Cypress resets the viewport to the default between tests. Useful for debugging purposes.
    * @see https://on.cypress.io/catalog-of-events#App-Events
    */
  /**
    * These events come from Cypress as it issues commands and reacts to their state. These are all useful to listen to for debugging purposes.
    * @see https://on.cypress.io/catalog-of-events#App-Events
    */
  @JSName("off")
  def off_viewportchanged(action: viewportColonchanged, fn: js.Function1[/* viewport */ Viewport, Unit]): Unit = js.native
  /**
    * Fires when your app calls the global `window.alert()` method.
    * Cypress will auto accept alerts. You cannot change this behavior.
    * @example
    ```
    const stub = cy.stub()
    cy.on('window:alert', stub)
    // assume the button calls window.alert()
    cy.get('.my-button')
    .click()
    .then(() => {
    expect(stub).to.have.been.calledOnce
    })
    ```
    * @see https://on.cypress.io/catalog-of-events#App-Events
    */
  /**
    * These events come from Cypress as it issues commands and reacts to their state. These are all useful to listen to for debugging purposes.
    * @see https://on.cypress.io/catalog-of-events#App-Events
    */
  @JSName("off")
  def off_windowalert(action: windowColonalert, fn: js.Function1[/* text */ String, Unit]): Unit = js.native
  @JSName("off")
  def off_windowalert(action: windowColonalert, fn: SinonSpyAgent[SinonSpy | SinonStub]): Unit = js.native
  /**
    * Fires as the page begins to load, but before any of your applications JavaScript has executed. This fires at the exact same time as `cy.visit()` `onBeforeLoad` callback. Useful to modify the window on a page transition.
    * @see https://on.cypress.io/catalog-of-events#App-Events
    */
  /**
    * These events come from Cypress as it issues commands and reacts to their state. These are all useful to listen to for debugging purposes.
    * @see https://on.cypress.io/catalog-of-events#App-Events
    */
  @JSName("off")
  def off_windowbeforeload(action: windowColonbeforeColonload, fn: js.Function1[/* win */ Window, Unit]): Unit = js.native
  /**
    * Fires when your application is about to navigate away. The real event object is provided to you. Your app may have set a `returnValue` on the event, which is useful to assert on.
    * @see https://on.cypress.io/catalog-of-events#App-Events
    */
  /**
    * These events come from Cypress as it issues commands and reacts to their state. These are all useful to listen to for debugging purposes.
    * @see https://on.cypress.io/catalog-of-events#App-Events
    */
  @JSName("off")
  def off_windowbeforeunload(action: windowColonbeforeColonunload, fn: js.Function1[/* event */ BeforeUnloadEvent, Unit]): Unit = js.native
  @JSName("off")
  def off_windowconfirm(action: windowColonconfirm, fn: SinonSpyAgent[SinonSpy | SinonStub]): Unit = js.native
  /**
    * Fires after all your resources have finished loading after a page transition. This fires at the exact same time as a `cy.visit()` `onLoad` callback.
    * @see https://on.cypress.io/catalog-of-events#App-Events
    */
  /**
    * These events come from Cypress as it issues commands and reacts to their state. These are all useful to listen to for debugging purposes.
    * @see https://on.cypress.io/catalog-of-events#App-Events
    */
  @JSName("off")
  def off_windowload(action: windowColonload, fn: js.Function1[/* win */ Window, Unit]): Unit = js.native
  /**
    * Fires when your application is has unloaded and is navigating away. The real event object is provided to you. This event is not cancelable.
    * @see https://on.cypress.io/catalog-of-events#App-Events
    */
  /**
    * These events come from Cypress as it issues commands and reacts to their state. These are all useful to listen to for debugging purposes.
    * @see https://on.cypress.io/catalog-of-events#App-Events
    */
  @JSName("off")
  def off_windowunload(action: windowColonunload, fn: js.Function1[/* event */ Event, Unit]): Unit = js.native
  /**
    * Fires when an uncaught exception occurs in your application.
    * Cypress will fail the test when this fires.
    * Return `false` from this event and Cypress will not fail the test. Also useful for debugging purposes because the actual `error` instance is provided to you.
    * @see https://on.cypress.io/catalog-of-events#App-Events
    * @example
    ```
    // likely want to do this in a support file
    // so it's applied to all spec files
    // cypress/support/index.js
    Cypress.on('uncaught:exception', (err, runnable) => {
    // returning false here prevents Cypress from
    // failing the test
    return false
    })
    // stub "window.alert" in a single test
    it('shows alert', () => {
    const stub = cy.stub()
    cy.on('window:alert', stub)
    // trigger application code that calls alert(...)
    .then(() => {
    expect(stub).to.have.been.calledOnce
    })
    })
    ```
    */
  /**
    * These events come from Cypress as it issues commands and reacts to their state. These are all useful to listen to for debugging purposes.
    * @see https://on.cypress.io/catalog-of-events#App-Events
    */
  def on(
    action: uncaughtColonexception,
    fn: js.Function2[/* error */ js.Error, /* runnable */ IRunnable, `false` | Unit]
  ): Unit = js.native
  /**
    * Fires when your app calls the global `window.confirm()` method.
    * Cypress will auto accept confirmations. Return `false` from this event and the confirmation will be canceled.
    * @see https://on.cypress.io/catalog-of-events#App-Events
    * @example
    ```
    cy.on('window:confirm', (str) => {
    console.log(str)
    return false // simulate "Cancel"
    })
    ```
    */
  /**
    * These events come from Cypress as it issues commands and reacts to their state. These are all useful to listen to for debugging purposes.
    * @see https://on.cypress.io/catalog-of-events#App-Events
    */
  def on(action: windowColonconfirm, fn: js.Function1[/* text */ String, `false` | Unit]): Unit = js.native
  /**
    * Fires when cy finishes running and executing your command. Useful for debugging and understanding how commands are handled.
    * @see https://on.cypress.io/catalog-of-events#App-Events
    */
  /**
    * These events come from Cypress as it issues commands and reacts to their state. These are all useful to listen to for debugging purposes.
    * @see https://on.cypress.io/catalog-of-events#App-Events
    */
  @JSName("on")
  def on_commandend(action: commandColonend, fn: js.Function1[/* command */ CommandQueue, Unit]): Unit = js.native
  /**
    * Fires when a cy command is first invoked and enqueued to be run later. Useful for debugging purposes if you're confused about the order in which commands will execute.
    * @see https://on.cypress.io/catalog-of-events#App-Events
    */
  /**
    * These events come from Cypress as it issues commands and reacts to their state. These are all useful to listen to for debugging purposes.
    * @see https://on.cypress.io/catalog-of-events#App-Events
    */
  @JSName("on")
  def on_commandenqueued(action: commandColonenqueued, fn: js.Function1[/* command */ EnqueuedCommand, Unit]): Unit = js.native
  /**
    * Fires whenever a command begins its retrying routines. This is called on the trailing edge after Cypress has internally waited for the retry interval. Useful to understand **why** a command is retrying, and generally includes the actual error causing the retry to happen. When commands fail the final error is the one that actually bubbles up to fail the test. This event is essentially to debug why Cypress is failing.
    * @see https://on.cypress.io/catalog-of-events#App-Events
    */
  /**
    * These events come from Cypress as it issues commands and reacts to their state. These are all useful to listen to for debugging purposes.
    * @see https://on.cypress.io/catalog-of-events#App-Events
    */
  @JSName("on")
  def on_commandretry(action: commandColonretry, fn: js.Function1[/* command */ CommandQueue, Unit]): Unit = js.native
  /**
    * Fires when cy begins actually running and executing your command. Useful for debugging and understanding how the command queue is async.
    * @see https://on.cypress.io/catalog-of-events#App-Events
    */
  /**
    * These events come from Cypress as it issues commands and reacts to their state. These are all useful to listen to for debugging purposes.
    * @see https://on.cypress.io/catalog-of-events#App-Events
    */
  @JSName("on")
  def on_commandstart(action: commandColonstart, fn: js.Function1[/* command */ CommandQueue, Unit]): Unit = js.native
  /**
    * Fires when the test has failed. It is technically possible to prevent the test from actually failing by binding to this event and invoking an async `done` callback. However this is **strongly discouraged**. Tests should never legitimately fail. This event exists because it's extremely useful for debugging purposes.
    * @see https://on.cypress.io/catalog-of-events#App-Events
    */
  /**
    * These events come from Cypress as it issues commands and reacts to their state. These are all useful to listen to for debugging purposes.
    * @see https://on.cypress.io/catalog-of-events#App-Events
    */
  @JSName("on")
  def on_fail(action: fail, fn: js.Function2[/* error */ js.Error, /* mocha */ IRunnable, Unit]): Unit = js.native
  /**
    * Fires whenever a command emits this event so it can be displayed in the Command Log. Useful to see how internal cypress commands utilize the {% url 'Cypress.log()' cypress-log %} API.
    * @see https://on.cypress.io/catalog-of-events#App-Events
    */
  /**
    * These events come from Cypress as it issues commands and reacts to their state. These are all useful to listen to for debugging purposes.
    * @see https://on.cypress.io/catalog-of-events#App-Events
    */
  @JSName("on")
  def on_logadded(action: logColonadded, fn: js.Function2[/* log */ js.Any, /* interactive */ Boolean, Unit]): Unit = js.native
  /**
    * Fires whenever a command's attributes changes. This event is debounced to prevent it from firing too quickly and too often. Useful to see how internal cypress commands utilize the {% url 'Cypress.log()' cypress-log %} API.
    * @see https://on.cypress.io/catalog-of-events#App-Events
    */
  /**
    * These events come from Cypress as it issues commands and reacts to their state. These are all useful to listen to for debugging purposes.
    * @see https://on.cypress.io/catalog-of-events#App-Events
    */
  @JSName("on")
  def on_logchanged(action: logColonchanged, fn: js.Function2[/* log */ js.Any, /* interactive */ Boolean, Unit]): Unit = js.native
  /**
    * Fires whenever **Cypress** is scrolling your application. This event is fired when Cypress is {% url 'waiting for and calculating actionability' interacting-with-elements %}. It will scroll to 'uncover' elements currently being covered. This event is extremely useful to debug why Cypress may think an element is not interactive.
    * @see https://on.cypress.io/catalog-of-events#App-Events
    */
  /**
    * These events come from Cypress as it issues commands and reacts to their state. These are all useful to listen to for debugging purposes.
    * @see https://on.cypress.io/catalog-of-events#App-Events
    */
  @JSName("on")
  def on_scrolled(action: scrolled, fn: js.Function1[/* $el */ JQuery[HTMLElement], Unit]): Unit = js.native
  /**
    * Fires after the test and all **afterEach** and **after** hooks run.
    * @see https://on.cypress.io/catalog-of-events#App-Events
    */
  /**
    * These events come from Cypress as it issues commands and reacts to their state. These are all useful to listen to for debugging purposes.
    * @see https://on.cypress.io/catalog-of-events#App-Events
    */
  @JSName("on")
  def on_testafterrun(
    action: testColonafterColonrun,
    fn: js.Function2[/* attributes */ ObjectLike, /* test */ ITest, Unit]
  ): Unit = js.native
  /**
    * Fires before the test and all **before** and **beforeEach** hooks run.
    * @see https://on.cypress.io/catalog-of-events#App-Events
    */
  /**
    * These events come from Cypress as it issues commands and reacts to their state. These are all useful to listen to for debugging purposes.
    * @see https://on.cypress.io/catalog-of-events#App-Events
    */
  @JSName("on")
  def on_testbeforerun(
    action: testColonbeforeColonrun,
    fn: js.Function2[/* attributes */ ObjectLike, /* test */ ITest, Unit]
  ): Unit = js.native
  /**
    * Fires whenever Cypress detects that your application's URL has changed.
    * @see https://on.cypress.io/catalog-of-events#App-Events
    */
  /**
    * These events come from Cypress as it issues commands and reacts to their state. These are all useful to listen to for debugging purposes.
    * @see https://on.cypress.io/catalog-of-events#App-Events
    */
  @JSName("on")
  def on_urlchanged(action: urlColonchanged, fn: js.Function1[/* url */ String, Unit]): Unit = js.native
  /**
    * Fires whenever the viewport changes via a `cy.viewport()` or naturally when Cypress resets the viewport to the default between tests. Useful for debugging purposes.
    * @see https://on.cypress.io/catalog-of-events#App-Events
    */
  /**
    * These events come from Cypress as it issues commands and reacts to their state. These are all useful to listen to for debugging purposes.
    * @see https://on.cypress.io/catalog-of-events#App-Events
    */
  @JSName("on")
  def on_viewportchanged(action: viewportColonchanged, fn: js.Function1[/* viewport */ Viewport, Unit]): Unit = js.native
  /**
    * Fires when your app calls the global `window.alert()` method.
    * Cypress will auto accept alerts. You cannot change this behavior.
    * @example
    ```
    const stub = cy.stub()
    cy.on('window:alert', stub)
    // assume the button calls window.alert()
    cy.get('.my-button')
    .click()
    .then(() => {
    expect(stub).to.have.been.calledOnce
    })
    ```
    * @see https://on.cypress.io/catalog-of-events#App-Events
    */
  /**
    * These events come from Cypress as it issues commands and reacts to their state. These are all useful to listen to for debugging purposes.
    * @see https://on.cypress.io/catalog-of-events#App-Events
    */
  @JSName("on")
  def on_windowalert(action: windowColonalert, fn: js.Function1[/* text */ String, Unit]): Unit = js.native
  @JSName("on")
  def on_windowalert(action: windowColonalert, fn: SinonSpyAgent[SinonSpy | SinonStub]): Unit = js.native
  /**
    * Fires as the page begins to load, but before any of your applications JavaScript has executed. This fires at the exact same time as `cy.visit()` `onBeforeLoad` callback. Useful to modify the window on a page transition.
    * @see https://on.cypress.io/catalog-of-events#App-Events
    */
  /**
    * These events come from Cypress as it issues commands and reacts to their state. These are all useful to listen to for debugging purposes.
    * @see https://on.cypress.io/catalog-of-events#App-Events
    */
  @JSName("on")
  def on_windowbeforeload(action: windowColonbeforeColonload, fn: js.Function1[/* win */ Window, Unit]): Unit = js.native
  /**
    * Fires when your application is about to navigate away. The real event object is provided to you. Your app may have set a `returnValue` on the event, which is useful to assert on.
    * @see https://on.cypress.io/catalog-of-events#App-Events
    */
  /**
    * These events come from Cypress as it issues commands and reacts to their state. These are all useful to listen to for debugging purposes.
    * @see https://on.cypress.io/catalog-of-events#App-Events
    */
  @JSName("on")
  def on_windowbeforeunload(action: windowColonbeforeColonunload, fn: js.Function1[/* event */ BeforeUnloadEvent, Unit]): Unit = js.native
  @JSName("on")
  def on_windowconfirm(action: windowColonconfirm, fn: SinonSpyAgent[SinonSpy | SinonStub]): Unit = js.native
  /**
    * Fires after all your resources have finished loading after a page transition. This fires at the exact same time as a `cy.visit()` `onLoad` callback.
    * @see https://on.cypress.io/catalog-of-events#App-Events
    */
  /**
    * These events come from Cypress as it issues commands and reacts to their state. These are all useful to listen to for debugging purposes.
    * @see https://on.cypress.io/catalog-of-events#App-Events
    */
  @JSName("on")
  def on_windowload(action: windowColonload, fn: js.Function1[/* win */ Window, Unit]): Unit = js.native
  /**
    * Fires when your application is has unloaded and is navigating away. The real event object is provided to you. This event is not cancelable.
    * @see https://on.cypress.io/catalog-of-events#App-Events
    */
  /**
    * These events come from Cypress as it issues commands and reacts to their state. These are all useful to listen to for debugging purposes.
    * @see https://on.cypress.io/catalog-of-events#App-Events
    */
  @JSName("on")
  def on_windowunload(action: windowColonunload, fn: js.Function1[/* event */ Event, Unit]): Unit = js.native
  /**
    * Fires when an uncaught exception occurs in your application.
    * Cypress will fail the test when this fires.
    * Return `false` from this event and Cypress will not fail the test. Also useful for debugging purposes because the actual `error` instance is provided to you.
    * @see https://on.cypress.io/catalog-of-events#App-Events
    * @example
    ```
    // likely want to do this in a support file
    // so it's applied to all spec files
    // cypress/support/index.js
    Cypress.on('uncaught:exception', (err, runnable) => {
    // returning false here prevents Cypress from
    // failing the test
    return false
    })
    // stub "window.alert" in a single test
    it('shows alert', () => {
    const stub = cy.stub()
    cy.on('window:alert', stub)
    // trigger application code that calls alert(...)
    .then(() => {
    expect(stub).to.have.been.calledOnce
    })
    })
    ```
    */
  /**
    * These events come from Cypress as it issues commands and reacts to their state. These are all useful to listen to for debugging purposes.
    * @see https://on.cypress.io/catalog-of-events#App-Events
    */
  def once(
    action: uncaughtColonexception,
    fn: js.Function2[/* error */ js.Error, /* runnable */ IRunnable, `false` | Unit]
  ): Unit = js.native
  /**
    * Fires when your app calls the global `window.confirm()` method.
    * Cypress will auto accept confirmations. Return `false` from this event and the confirmation will be canceled.
    * @see https://on.cypress.io/catalog-of-events#App-Events
    * @example
    ```
    cy.on('window:confirm', (str) => {
    console.log(str)
    return false // simulate "Cancel"
    })
    ```
    */
  /**
    * These events come from Cypress as it issues commands and reacts to their state. These are all useful to listen to for debugging purposes.
    * @see https://on.cypress.io/catalog-of-events#App-Events
    */
  def once(action: windowColonconfirm, fn: js.Function1[/* text */ String, `false` | Unit]): Unit = js.native
  /**
    * Fires when cy finishes running and executing your command. Useful for debugging and understanding how commands are handled.
    * @see https://on.cypress.io/catalog-of-events#App-Events
    */
  /**
    * These events come from Cypress as it issues commands and reacts to their state. These are all useful to listen to for debugging purposes.
    * @see https://on.cypress.io/catalog-of-events#App-Events
    */
  @JSName("once")
  def once_commandend(action: commandColonend, fn: js.Function1[/* command */ CommandQueue, Unit]): Unit = js.native
  /**
    * Fires when a cy command is first invoked and enqueued to be run later. Useful for debugging purposes if you're confused about the order in which commands will execute.
    * @see https://on.cypress.io/catalog-of-events#App-Events
    */
  /**
    * These events come from Cypress as it issues commands and reacts to their state. These are all useful to listen to for debugging purposes.
    * @see https://on.cypress.io/catalog-of-events#App-Events
    */
  @JSName("once")
  def once_commandenqueued(action: commandColonenqueued, fn: js.Function1[/* command */ EnqueuedCommand, Unit]): Unit = js.native
  /**
    * Fires whenever a command begins its retrying routines. This is called on the trailing edge after Cypress has internally waited for the retry interval. Useful to understand **why** a command is retrying, and generally includes the actual error causing the retry to happen. When commands fail the final error is the one that actually bubbles up to fail the test. This event is essentially to debug why Cypress is failing.
    * @see https://on.cypress.io/catalog-of-events#App-Events
    */
  /**
    * These events come from Cypress as it issues commands and reacts to their state. These are all useful to listen to for debugging purposes.
    * @see https://on.cypress.io/catalog-of-events#App-Events
    */
  @JSName("once")
  def once_commandretry(action: commandColonretry, fn: js.Function1[/* command */ CommandQueue, Unit]): Unit = js.native
  /**
    * Fires when cy begins actually running and executing your command. Useful for debugging and understanding how the command queue is async.
    * @see https://on.cypress.io/catalog-of-events#App-Events
    */
  /**
    * These events come from Cypress as it issues commands and reacts to their state. These are all useful to listen to for debugging purposes.
    * @see https://on.cypress.io/catalog-of-events#App-Events
    */
  @JSName("once")
  def once_commandstart(action: commandColonstart, fn: js.Function1[/* command */ CommandQueue, Unit]): Unit = js.native
  /**
    * Fires when the test has failed. It is technically possible to prevent the test from actually failing by binding to this event and invoking an async `done` callback. However this is **strongly discouraged**. Tests should never legitimately fail. This event exists because it's extremely useful for debugging purposes.
    * @see https://on.cypress.io/catalog-of-events#App-Events
    */
  /**
    * These events come from Cypress as it issues commands and reacts to their state. These are all useful to listen to for debugging purposes.
    * @see https://on.cypress.io/catalog-of-events#App-Events
    */
  @JSName("once")
  def once_fail(action: fail, fn: js.Function2[/* error */ js.Error, /* mocha */ IRunnable, Unit]): Unit = js.native
  /**
    * Fires whenever a command emits this event so it can be displayed in the Command Log. Useful to see how internal cypress commands utilize the {% url 'Cypress.log()' cypress-log %} API.
    * @see https://on.cypress.io/catalog-of-events#App-Events
    */
  /**
    * These events come from Cypress as it issues commands and reacts to their state. These are all useful to listen to for debugging purposes.
    * @see https://on.cypress.io/catalog-of-events#App-Events
    */
  @JSName("once")
  def once_logadded(action: logColonadded, fn: js.Function2[/* log */ js.Any, /* interactive */ Boolean, Unit]): Unit = js.native
  /**
    * Fires whenever a command's attributes changes. This event is debounced to prevent it from firing too quickly and too often. Useful to see how internal cypress commands utilize the {% url 'Cypress.log()' cypress-log %} API.
    * @see https://on.cypress.io/catalog-of-events#App-Events
    */
  /**
    * These events come from Cypress as it issues commands and reacts to their state. These are all useful to listen to for debugging purposes.
    * @see https://on.cypress.io/catalog-of-events#App-Events
    */
  @JSName("once")
  def once_logchanged(action: logColonchanged, fn: js.Function2[/* log */ js.Any, /* interactive */ Boolean, Unit]): Unit = js.native
  /**
    * Fires whenever **Cypress** is scrolling your application. This event is fired when Cypress is {% url 'waiting for and calculating actionability' interacting-with-elements %}. It will scroll to 'uncover' elements currently being covered. This event is extremely useful to debug why Cypress may think an element is not interactive.
    * @see https://on.cypress.io/catalog-of-events#App-Events
    */
  /**
    * These events come from Cypress as it issues commands and reacts to their state. These are all useful to listen to for debugging purposes.
    * @see https://on.cypress.io/catalog-of-events#App-Events
    */
  @JSName("once")
  def once_scrolled(action: scrolled, fn: js.Function1[/* $el */ JQuery[HTMLElement], Unit]): Unit = js.native
  /**
    * Fires after the test and all **afterEach** and **after** hooks run.
    * @see https://on.cypress.io/catalog-of-events#App-Events
    */
  /**
    * These events come from Cypress as it issues commands and reacts to their state. These are all useful to listen to for debugging purposes.
    * @see https://on.cypress.io/catalog-of-events#App-Events
    */
  @JSName("once")
  def once_testafterrun(
    action: testColonafterColonrun,
    fn: js.Function2[/* attributes */ ObjectLike, /* test */ ITest, Unit]
  ): Unit = js.native
  /**
    * Fires before the test and all **before** and **beforeEach** hooks run.
    * @see https://on.cypress.io/catalog-of-events#App-Events
    */
  /**
    * These events come from Cypress as it issues commands and reacts to their state. These are all useful to listen to for debugging purposes.
    * @see https://on.cypress.io/catalog-of-events#App-Events
    */
  @JSName("once")
  def once_testbeforerun(
    action: testColonbeforeColonrun,
    fn: js.Function2[/* attributes */ ObjectLike, /* test */ ITest, Unit]
  ): Unit = js.native
  /**
    * Fires whenever Cypress detects that your application's URL has changed.
    * @see https://on.cypress.io/catalog-of-events#App-Events
    */
  /**
    * These events come from Cypress as it issues commands and reacts to their state. These are all useful to listen to for debugging purposes.
    * @see https://on.cypress.io/catalog-of-events#App-Events
    */
  @JSName("once")
  def once_urlchanged(action: urlColonchanged, fn: js.Function1[/* url */ String, Unit]): Unit = js.native
  /**
    * Fires whenever the viewport changes via a `cy.viewport()` or naturally when Cypress resets the viewport to the default between tests. Useful for debugging purposes.
    * @see https://on.cypress.io/catalog-of-events#App-Events
    */
  /**
    * These events come from Cypress as it issues commands and reacts to their state. These are all useful to listen to for debugging purposes.
    * @see https://on.cypress.io/catalog-of-events#App-Events
    */
  @JSName("once")
  def once_viewportchanged(action: viewportColonchanged, fn: js.Function1[/* viewport */ Viewport, Unit]): Unit = js.native
  /**
    * Fires when your app calls the global `window.alert()` method.
    * Cypress will auto accept alerts. You cannot change this behavior.
    * @example
    ```
    const stub = cy.stub()
    cy.on('window:alert', stub)
    // assume the button calls window.alert()
    cy.get('.my-button')
    .click()
    .then(() => {
    expect(stub).to.have.been.calledOnce
    })
    ```
    * @see https://on.cypress.io/catalog-of-events#App-Events
    */
  /**
    * These events come from Cypress as it issues commands and reacts to their state. These are all useful to listen to for debugging purposes.
    * @see https://on.cypress.io/catalog-of-events#App-Events
    */
  @JSName("once")
  def once_windowalert(action: windowColonalert, fn: js.Function1[/* text */ String, Unit]): Unit = js.native
  @JSName("once")
  def once_windowalert(action: windowColonalert, fn: SinonSpyAgent[SinonSpy | SinonStub]): Unit = js.native
  /**
    * Fires as the page begins to load, but before any of your applications JavaScript has executed. This fires at the exact same time as `cy.visit()` `onBeforeLoad` callback. Useful to modify the window on a page transition.
    * @see https://on.cypress.io/catalog-of-events#App-Events
    */
  /**
    * These events come from Cypress as it issues commands and reacts to their state. These are all useful to listen to for debugging purposes.
    * @see https://on.cypress.io/catalog-of-events#App-Events
    */
  @JSName("once")
  def once_windowbeforeload(action: windowColonbeforeColonload, fn: js.Function1[/* win */ Window, Unit]): Unit = js.native
  /**
    * Fires when your application is about to navigate away. The real event object is provided to you. Your app may have set a `returnValue` on the event, which is useful to assert on.
    * @see https://on.cypress.io/catalog-of-events#App-Events
    */
  /**
    * These events come from Cypress as it issues commands and reacts to their state. These are all useful to listen to for debugging purposes.
    * @see https://on.cypress.io/catalog-of-events#App-Events
    */
  @JSName("once")
  def once_windowbeforeunload(action: windowColonbeforeColonunload, fn: js.Function1[/* event */ BeforeUnloadEvent, Unit]): Unit = js.native
  @JSName("once")
  def once_windowconfirm(action: windowColonconfirm, fn: SinonSpyAgent[SinonSpy | SinonStub]): Unit = js.native
  /**
    * Fires after all your resources have finished loading after a page transition. This fires at the exact same time as a `cy.visit()` `onLoad` callback.
    * @see https://on.cypress.io/catalog-of-events#App-Events
    */
  /**
    * These events come from Cypress as it issues commands and reacts to their state. These are all useful to listen to for debugging purposes.
    * @see https://on.cypress.io/catalog-of-events#App-Events
    */
  @JSName("once")
  def once_windowload(action: windowColonload, fn: js.Function1[/* win */ Window, Unit]): Unit = js.native
  /**
    * Fires when your application is has unloaded and is navigating away. The real event object is provided to you. This event is not cancelable.
    * @see https://on.cypress.io/catalog-of-events#App-Events
    */
  /**
    * These events come from Cypress as it issues commands and reacts to their state. These are all useful to listen to for debugging purposes.
    * @see https://on.cypress.io/catalog-of-events#App-Events
    */
  @JSName("once")
  def once_windowunload(action: windowColonunload, fn: js.Function1[/* event */ Event, Unit]): Unit = js.native
}

