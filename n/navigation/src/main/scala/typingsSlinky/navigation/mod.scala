package typingsSlinky.navigation

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLAnchorElement
import org.scalajs.dom.raw.Location
import typingsSlinky.navigation.anon.Crumbs
import typingsSlinky.navigation.navigationStrings.add
import typingsSlinky.navigation.navigationStrings.none
import typingsSlinky.navigation.navigationStrings.replace
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("navigation", "Crumb")
  @js.native
  class Crumb protected () extends StObject {
    /**
      * Initializes a new instance of the Crumb class
      * @param data The Context Data held at the time of navigating away
      * from this State
      * @param state The configuration information associated with this
      * navigation
      * @param link The link navigation to return to the State and pass the
      * associated Data
      * @param crumblessLink The link navigation without crumb trail to
      * return to the State and pass the associated Data
      * @param last A value indicating whether the Crumb is the last in the
      * crumb trail
      */
    def this(data: js.Any, state: State, link: String, crumblessLink: String, last: Boolean) = this()
    
    /**
      * Gets the link navigation without crumb trail to return to the State
      * and pass the associated Data
      */
    var crumblessUrl: String = js.native
    
    /**
      * Gets the Context Data held at the time of navigating away from this
      * State
      */
    var data: js.Any = js.native
    
    /**
      * Gets a value indicating whether the Crumb is the last in the crumb
      * trail
      */
    var last: Boolean = js.native
    
    /**
      * Gets the configuration information associated with this navigation
      */
    var state: State = js.native
    
    /**
      * Gets the State Title
      */
    var title: String = js.native
    
    /**
      * Gets the link navigation to return to the State and pass the
      * associated Data
      */
    var url: String = js.native
  }
  
  @JSImport("navigation", "HTML5HistoryManager")
  @js.native
  /**
    * Initializes a new instance of the HTML5HistoryManager class
    * @param applicationPath The application path
    */
  class HTML5HistoryManager () extends HistoryManager {
    def this(applicationPath: String) = this()
    
    /**
      * Sets the browser Url to the url using pushState
      * @param url The current url
      * @param replace A value indicating whether to replace the current
      * browser history entry
      */
    def addHistory(url: String, replace: Boolean): Unit = js.native
    
    /**
      * Registers a listener for the popstate event
      * @param navigateHistory The history navigation event handler
      */
    def init(navigateHistory: js.Function0[Unit]): Unit = js.native
  }
  
  @JSImport("navigation", "HashHistoryManager")
  @js.native
  /**
    * Initializes a new instance of the HashHistoryManager class
    * @param replaceQueryIdentifier a value indicating whether to use '#'
    * in place of '?'. Set to true for Internet explorer 6 and 7 support
    */
  class HashHistoryManager () extends HistoryManager {
    def this(replaceQueryIdentifier: Boolean) = this()
    
    /**
      * Sets the browser Url's hash to the url
      * @param url The current url
      * @param replace A value indicating whether to replace the current
      * browser history entry
      */
    def addHistory(url: String, replace: Boolean): Unit = js.native
    
    /**
      * Registers a listener for the hashchange event
      * @param navigateHistory The history navigation event handler
      */
    def init(navigateHistory: js.Any): Unit = js.native
  }
  
  @JSImport("navigation", "State")
  @js.native
  class State () extends StateInfo {
    
    /**
      * Gets the crumb trail key
      */
    var crumbTrailKey: String = js.native
    
    /**
      * Called on the old State after navigating to a different State
      */
    def dispose(): Unit = js.native
    
    /**
      * Gets the formatted default array NavigationData for this State
      */
    var formattedArrayDefaults: StringDictionary[js.Array[String]] = js.native
    
    /**
      * Gets the formatted default NavigationData for this State
      */
    var formattedDefaults: js.Any = js.native
    
    /**
      * Called on the current State after navigating to it
      * @param data The current NavigationData
      * @param asyncData The data passed asynchronously while navigating
      */
    def navigated(data: js.Any, asyncData: js.Any): Unit = js.native
    
    /**
      * Called on the new State before navigating to it
      * @param data The new NavigationData
      * @param url The new target location
      * @param navigate The function to call to continue to navigate
      * @param history A value indicating whether browser history was used
      */
    def navigating(
      data: js.Any,
      url: String,
      navigate: js.Function1[/* asyncData */ js.UndefOr[js.Any], Unit],
      history: Boolean
    ): Unit = js.native
    
    /**
      * Gets the route Url patterns
      */
    @JSName("route")
    var route_State: String | js.Array[String] = js.native
    
    /**
      * Gets the textual description of the state
      */
    @JSName("title")
    var title_State: String = js.native
    
    /**
      * Gets a value that indicates whether to maintain the crumb trail
      */
    @JSName("trackCrumbTrail")
    var trackCrumbTrail_State: Boolean = js.native
    
    /**
      * Gets a value that indicates whether NavigationData Types are
      * preserved when navigating
      */
    @JSName("trackTypes")
    var trackTypes_State: Boolean = js.native
    
    /**
      * Truncates the crumb trail whenever a repeated or initial State is
      * encountered
      * @param The State navigated to
      * @param The new NavigationData
      * @param The Crumb collection representing the crumb trail
      * @returns Truncated crumb trail
      */
    def truncateCrumbTrail(state: State, data: js.Any, crumbs: js.Array[Crumb]): js.Array[Crumb] = js.native
    
    /**
      * Called on the old State before navigating to a different State
      * @param state The new State
      * @param data The new NavigationData
      * @param url The new target location
      * @param unload The function to call to continue to navigate
      * @param history A value indicating whether browser history was used
      */
    def unloading(state: State, data: js.Any, url: String, unload: js.Function0[Unit]): Unit = js.native
    def unloading(state: State, data: js.Any, url: String, unload: js.Function0[Unit], history: Boolean): Unit = js.native
    
    /**
      * Decodes the Url value
      * @param state The State navigated to
      * @param key The key of the navigation data item
      * @param val The Url value of the navigation data item
      * @param queryString A value indicating the Url value's location
      */
    def urlDecode(state: State, key: String, `val`: String, queryString: Boolean): String = js.native
    
    /**
      * Encodes the Url value
      * @param state The State navigated to
      * @param key The key of the navigation data item
      * @param val The Url value of the navigation data item
      * @param queryString A value indicating the Url value's location
      * @param index The index of the navigation data array item
      */
    def urlEncode(state: State, key: String, `val`: String, queryString: Boolean): String = js.native
    def urlEncode(state: State, key: String, `val`: String, queryString: Boolean, index: Double): String = js.native
    
    /**
      * Validates the NavigationData before navigating to the new State
      * @param data The new NavigationData
      * @returns Validation success indicator
      */
    def validate(data: js.Any): Boolean = js.native
  }
  
  @JSImport("navigation", "StateContext")
  @js.native
  class StateContext () extends StObject {
    
    /**
      * Gets the current asynchronous data
      */
    var asyncData: js.Any = js.native
    
    /**
      * Clears the Context Data
      */
    def clear(): Unit = js.native
    
    /**
      * Gets a Crumb collection representing the crumb trail, ordered oldest
      * Crumb first
      */
    var crumbs: js.Array[Crumb] = js.native
    
    /**
      * Gets the NavigationData for the current State
      */
    var data: js.Any = js.native
    
    /**
      * Gets a value indicating whether browser history was used
      */
    var history: Boolean = js.native
    
    /**
      * Combines the data with a subset of the current NavigationData
      * @param The data to add to the current NavigationData
      * @returns The combined data
      */
    def includeCurrentData(data: js.Any): js.Any = js.native
    def includeCurrentData(data: js.Any, keys: js.Array[String]): js.Any = js.native
    
    /**
      * Gets the next crumb
      */
    var nextCrumb: Crumb = js.native
    
    /**
      * Gets the NavigationData for the last displayed State
      */
    var oldData: js.Any = js.native
    
    /**
      * Gets the last State displayed before the current State
      */
    var oldState: State = js.native
    
    /**
      * Gets the Url for the last displayed State
      */
    var oldUrl: String = js.native
    
    /**
      * Gets the NavigationData of the last Crumb in the crumb trail
      */
    var previousData: js.Any = js.native
    
    /**
      * Gets the State of the last Crumb in the crumb trail
      */
    var previousState: State = js.native
    
    /**
      * Gets the Url of the last Crumb in the crumb trail
      */
    var previousUrl: String = js.native
    
    /**
      * Gets the current State
      */
    var state: State = js.native
    
    /**
      * Gets or sets the current title
      */
    var title: String = js.native
    
    /**
      * Gets the current Url
      */
    var url: String = js.native
  }
  
  @JSImport("navigation", "StateNavigator")
  @js.native
  /**
    * Initializes a new instance of the StateNavigator class
    * @param stateInfos A collection of State Infos or another State Navigator
    * @param historyManager The manager of the browser Url
    */
  class StateNavigator () extends StObject {
    def this(stateInfos: js.Array[StateInfo]) = this()
    def this(stateInfos: StateNavigator) = this()
    def this(stateInfos: js.UndefOr[scala.Nothing], historyManager: HistoryManager) = this()
    def this(stateInfos: js.Array[StateInfo], historyManager: HistoryManager) = this()
    def this(stateInfos: StateNavigator, historyManager: HistoryManager) = this()
    
    /**
      * Determines if the distance specified is within the bounds of the
      * crumb trail represented by the Crumbs collection
      */
    def canNavigateBack(distance: Double): Boolean = js.native
    
    /**
      * Configures the StateNavigator
      * @param stateInfos A collection of State Infos or another State Navigator
      * @param historyManager The manager of the browser Url
      */
    def configure(stateInfos: js.Array[StateInfo]): Unit = js.native
    def configure(stateInfos: js.Array[StateInfo], historyManager: HistoryManager): Unit = js.native
    def configure(stateInfos: StateNavigator): Unit = js.native
    def configure(stateInfos: StateNavigator, historyManager: HistoryManager): Unit = js.native
    
    /**
      * Creates a FluentNavigator
      * @param withContext a value indicating whether to inherit the current
      * context
      * @returns A FluentNavigator
      */
    def fluent(): FluentNavigator = js.native
    def fluent(withContext: Boolean): FluentNavigator = js.native
    
    /**
      * Gets a Url to navigate back along the crumb trail
      * @param distance Starting at 1, the number of Crumb steps to go back
      * @throws canNavigateBack returns false for this distance
      */
    def getNavigationBackLink(distance: Double): String = js.native
    
    /**
      * Gets a Url to navigate to a State
      * @param stateKey The key of a State
      * @param navigationData The NavigationData to be passed to the next
      * State and stored in the StateContext
      * @returns Url that will navigate to State specified in the action
      * @throws state does not match the key of a State or there is
      * NavigationData that cannot be converted to a String
      */
    def getNavigationLink(stateKey: String): String = js.native
    def getNavigationLink(stateKey: String, navigationData: js.Any): String = js.native
    
    /**
      * Gets a Url to navigate to the current State
      * @param navigationData The NavigationData to be passed to the current
      * State and stored in the StateContext
      * @returns Url that will navigate to the current State
      * @throws There is NavigationData that cannot be converted to a String
      */
    def getRefreshLink(): String = js.native
    def getRefreshLink(navigationData: js.Any): String = js.native
    
    /**
      * Gets the browser Url manager
      */
    var historyManager: HistoryManager = js.native
    
    /**
      * Navigates to a State
      * @param stateKey The key of a State
      * @param navigationData The NavigationData to be passed to the next
      * State and stored in the StateContext
      * @param historyAction A value determining the effect on browser history
      * @throws state does not match the key of a State or there is
      * NavigationData that cannot be converted to a String
      * @throws A mandatory route parameter has not been supplied a value
      */
    def navigate(stateKey: String): Unit = js.native
    def navigate(stateKey: String, navigationData: js.Any): Unit = js.native
    
    /**
      * Navigates back along the crumb trail
      * @param distance Starting at 1, the number of Crumb steps to go back
      * @param historyAction A value determining the effect on browser history
      * @throws canNavigateBack returns false for this distance
      * @throws A mandatory route parameter has not been supplied a value
      */
    def navigateBack(distance: Double): Unit = js.native
    @JSName("navigateBack")
    def navigateBack_add(distance: Double, historyAction: add): Unit = js.native
    @JSName("navigateBack")
    def navigateBack_none(distance: Double, historyAction: none): Unit = js.native
    @JSName("navigateBack")
    def navigateBack_replace(distance: Double, historyAction: replace): Unit = js.native
    
    /**
      * Navigates to the url
      * @param url The target location
      * @param historyAction A value determining the effect on browser history
      * @param history A value indicating whether browser history was used
      * @param suspendNavigation Called before the navigation completes
      * @param currentContext The current StateContext
      */
    def navigateLink(url: String): Unit = js.native
    def navigateLink(
      url: String,
      historyAction: js.UndefOr[scala.Nothing],
      history: js.UndefOr[scala.Nothing],
      suspendNavigation: js.UndefOr[scala.Nothing],
      currentContext: StateContext
    ): Unit = js.native
    def navigateLink(
      url: String,
      historyAction: js.UndefOr[scala.Nothing],
      history: js.UndefOr[scala.Nothing],
      suspendNavigation: js.Function2[/* stateContext */ StateContext, /* resumeNavigation */ js.Function0[Unit], Unit]
    ): Unit = js.native
    def navigateLink(
      url: String,
      historyAction: js.UndefOr[scala.Nothing],
      history: js.UndefOr[scala.Nothing],
      suspendNavigation: js.Function2[/* stateContext */ StateContext, /* resumeNavigation */ js.Function0[Unit], Unit],
      currentContext: StateContext
    ): Unit = js.native
    def navigateLink(url: String, historyAction: js.UndefOr[scala.Nothing], history: Boolean): Unit = js.native
    def navigateLink(
      url: String,
      historyAction: js.UndefOr[scala.Nothing],
      history: Boolean,
      suspendNavigation: js.UndefOr[scala.Nothing],
      currentContext: StateContext
    ): Unit = js.native
    def navigateLink(
      url: String,
      historyAction: js.UndefOr[scala.Nothing],
      history: Boolean,
      suspendNavigation: js.Function2[/* stateContext */ StateContext, /* resumeNavigation */ js.Function0[Unit], Unit]
    ): Unit = js.native
    def navigateLink(
      url: String,
      historyAction: js.UndefOr[scala.Nothing],
      history: Boolean,
      suspendNavigation: js.Function2[/* stateContext */ StateContext, /* resumeNavigation */ js.Function0[Unit], Unit],
      currentContext: StateContext
    ): Unit = js.native
    @JSName("navigateLink")
    def navigateLink_add(url: String, historyAction: add): Unit = js.native
    @JSName("navigateLink")
    def navigateLink_add(
      url: String,
      historyAction: add,
      history: js.UndefOr[scala.Nothing],
      suspendNavigation: js.UndefOr[scala.Nothing],
      currentContext: StateContext
    ): Unit = js.native
    @JSName("navigateLink")
    def navigateLink_add(
      url: String,
      historyAction: add,
      history: js.UndefOr[scala.Nothing],
      suspendNavigation: js.Function2[/* stateContext */ StateContext, /* resumeNavigation */ js.Function0[Unit], Unit]
    ): Unit = js.native
    @JSName("navigateLink")
    def navigateLink_add(
      url: String,
      historyAction: add,
      history: js.UndefOr[scala.Nothing],
      suspendNavigation: js.Function2[/* stateContext */ StateContext, /* resumeNavigation */ js.Function0[Unit], Unit],
      currentContext: StateContext
    ): Unit = js.native
    @JSName("navigateLink")
    def navigateLink_add(url: String, historyAction: add, history: Boolean): Unit = js.native
    @JSName("navigateLink")
    def navigateLink_add(
      url: String,
      historyAction: add,
      history: Boolean,
      suspendNavigation: js.UndefOr[scala.Nothing],
      currentContext: StateContext
    ): Unit = js.native
    @JSName("navigateLink")
    def navigateLink_add(
      url: String,
      historyAction: add,
      history: Boolean,
      suspendNavigation: js.Function2[/* stateContext */ StateContext, /* resumeNavigation */ js.Function0[Unit], Unit]
    ): Unit = js.native
    @JSName("navigateLink")
    def navigateLink_add(
      url: String,
      historyAction: add,
      history: Boolean,
      suspendNavigation: js.Function2[/* stateContext */ StateContext, /* resumeNavigation */ js.Function0[Unit], Unit],
      currentContext: StateContext
    ): Unit = js.native
    @JSName("navigateLink")
    def navigateLink_none(url: String, historyAction: none): Unit = js.native
    @JSName("navigateLink")
    def navigateLink_none(
      url: String,
      historyAction: none,
      history: js.UndefOr[scala.Nothing],
      suspendNavigation: js.UndefOr[scala.Nothing],
      currentContext: StateContext
    ): Unit = js.native
    @JSName("navigateLink")
    def navigateLink_none(
      url: String,
      historyAction: none,
      history: js.UndefOr[scala.Nothing],
      suspendNavigation: js.Function2[/* stateContext */ StateContext, /* resumeNavigation */ js.Function0[Unit], Unit]
    ): Unit = js.native
    @JSName("navigateLink")
    def navigateLink_none(
      url: String,
      historyAction: none,
      history: js.UndefOr[scala.Nothing],
      suspendNavigation: js.Function2[/* stateContext */ StateContext, /* resumeNavigation */ js.Function0[Unit], Unit],
      currentContext: StateContext
    ): Unit = js.native
    @JSName("navigateLink")
    def navigateLink_none(url: String, historyAction: none, history: Boolean): Unit = js.native
    @JSName("navigateLink")
    def navigateLink_none(
      url: String,
      historyAction: none,
      history: Boolean,
      suspendNavigation: js.UndefOr[scala.Nothing],
      currentContext: StateContext
    ): Unit = js.native
    @JSName("navigateLink")
    def navigateLink_none(
      url: String,
      historyAction: none,
      history: Boolean,
      suspendNavigation: js.Function2[/* stateContext */ StateContext, /* resumeNavigation */ js.Function0[Unit], Unit]
    ): Unit = js.native
    @JSName("navigateLink")
    def navigateLink_none(
      url: String,
      historyAction: none,
      history: Boolean,
      suspendNavigation: js.Function2[/* stateContext */ StateContext, /* resumeNavigation */ js.Function0[Unit], Unit],
      currentContext: StateContext
    ): Unit = js.native
    @JSName("navigateLink")
    def navigateLink_replace(url: String, historyAction: replace): Unit = js.native
    @JSName("navigateLink")
    def navigateLink_replace(
      url: String,
      historyAction: replace,
      history: js.UndefOr[scala.Nothing],
      suspendNavigation: js.UndefOr[scala.Nothing],
      currentContext: StateContext
    ): Unit = js.native
    @JSName("navigateLink")
    def navigateLink_replace(
      url: String,
      historyAction: replace,
      history: js.UndefOr[scala.Nothing],
      suspendNavigation: js.Function2[/* stateContext */ StateContext, /* resumeNavigation */ js.Function0[Unit], Unit]
    ): Unit = js.native
    @JSName("navigateLink")
    def navigateLink_replace(
      url: String,
      historyAction: replace,
      history: js.UndefOr[scala.Nothing],
      suspendNavigation: js.Function2[/* stateContext */ StateContext, /* resumeNavigation */ js.Function0[Unit], Unit],
      currentContext: StateContext
    ): Unit = js.native
    @JSName("navigateLink")
    def navigateLink_replace(url: String, historyAction: replace, history: Boolean): Unit = js.native
    @JSName("navigateLink")
    def navigateLink_replace(
      url: String,
      historyAction: replace,
      history: Boolean,
      suspendNavigation: js.UndefOr[scala.Nothing],
      currentContext: StateContext
    ): Unit = js.native
    @JSName("navigateLink")
    def navigateLink_replace(
      url: String,
      historyAction: replace,
      history: Boolean,
      suspendNavigation: js.Function2[/* stateContext */ StateContext, /* resumeNavigation */ js.Function0[Unit], Unit]
    ): Unit = js.native
    @JSName("navigateLink")
    def navigateLink_replace(
      url: String,
      historyAction: replace,
      history: Boolean,
      suspendNavigation: js.Function2[/* stateContext */ StateContext, /* resumeNavigation */ js.Function0[Unit], Unit],
      currentContext: StateContext
    ): Unit = js.native
    
    @JSName("navigate")
    def navigate_add(stateKey: String, navigationData: js.UndefOr[scala.Nothing], historyAction: add): Unit = js.native
    @JSName("navigate")
    def navigate_add(stateKey: String, navigationData: js.Any, historyAction: add): Unit = js.native
    @JSName("navigate")
    def navigate_none(stateKey: String, navigationData: js.UndefOr[scala.Nothing], historyAction: none): Unit = js.native
    @JSName("navigate")
    def navigate_none(stateKey: String, navigationData: js.Any, historyAction: none): Unit = js.native
    @JSName("navigate")
    def navigate_replace(stateKey: String, navigationData: js.UndefOr[scala.Nothing], historyAction: replace): Unit = js.native
    @JSName("navigate")
    def navigate_replace(stateKey: String, navigationData: js.Any, historyAction: replace): Unit = js.native
    
    /**
      * Unregisters a before navigate event listener
      * @param handler The before navigate event listener
      */
    def offBeforeNavigate(
      handler: js.Function5[
          /* state */ State, 
          /* data */ js.Any, 
          /* url */ String, 
          /* history */ Boolean, 
          /* currentContext */ StateContext, 
          Boolean
        ]
    ): Unit = js.native
    
    /**
      * Unregisters a navigate event listener
      * @param handler The navigate event listener
      */
    def offNavigate(
      handler: js.Function5[
          /* oldState */ State, 
          /* state */ State, 
          /* data */ js.Any, 
          /* asyncData */ js.Any, 
          /* stateContext */ StateContext, 
          Unit
        ]
    ): Unit = js.native
    
    /**
      * Registers a before navigate event listener
      * @param handler The before navigate event listener
      */
    def onBeforeNavigate(
      handler: js.Function5[
          /* state */ State, 
          /* data */ js.Any, 
          /* url */ String, 
          /* history */ Boolean, 
          /* currentContext */ StateContext, 
          Boolean
        ]
    ): Unit = js.native
    
    /**
      * Registers a navigate event listener
      * @param handler The navigate event listener
      */
    def onNavigate(
      handler: js.Function5[
          /* oldState */ State, 
          /* state */ State, 
          /* data */ js.Any, 
          /* asyncData */ js.Any, 
          /* stateContext */ StateContext, 
          Unit
        ]
    ): Unit = js.native
    
    /**
      * Parses the url out into State and Navigation Data
      * @param url The url to parse
      */
    def parseLink(url: String): Crumbs = js.native
    
    /**
      * Navigates to the current State
      * @param navigationData The NavigationData to be passed to the current
      * State and stored in the StateContext
      * @param historyAction A value determining the effect on browser history
      * @throws There is NavigationData that cannot be converted to a String
      * @throws A mandatory route parameter has not been supplied a value
      */
    def refresh(): Unit = js.native
    def refresh(navigationData: js.Any): Unit = js.native
    @JSName("refresh")
    def refresh_add(navigationData: js.UndefOr[scala.Nothing], historyAction: add): Unit = js.native
    @JSName("refresh")
    def refresh_add(navigationData: js.Any, historyAction: add): Unit = js.native
    @JSName("refresh")
    def refresh_none(navigationData: js.UndefOr[scala.Nothing], historyAction: none): Unit = js.native
    @JSName("refresh")
    def refresh_none(navigationData: js.Any, historyAction: none): Unit = js.native
    @JSName("refresh")
    def refresh_replace(navigationData: js.UndefOr[scala.Nothing], historyAction: replace): Unit = js.native
    @JSName("refresh")
    def refresh_replace(navigationData: js.Any, historyAction: replace): Unit = js.native
    
    /**
      * Navigates to the passed in url
      * @param url The url to navigate to
      */
    def start(): Unit = js.native
    def start(url: String): Unit = js.native
    
    /**
      * Provides access to context sensitive navigation information
      */
    var stateContext: StateContext = js.native
    
    /**
      * Gets a list of States
      */
    var states: StringDictionary[State] = js.native
  }
  
  @js.native
  trait FluentNavigator extends StObject {
    
    /**
      * Navigates to a State
      * @param stateKey The key of a State
      * @param navigationData The NavigationData to be passed to the next
      * State and stored in the StateContext
      * @throws state does not match the key of a State or there is
      * NavigationData that cannot be converted to a String
      * @throws A mandatory route parameter has not been supplied a value
      */
    def navigate(stateKey: String): FluentNavigator = js.native
    def navigate(stateKey: String, navigationData: js.Any): FluentNavigator = js.native
    
    /**
      * Navigates back along the crumb trail
      * @param distance Starting at 1, the number of Crumb steps to go back
      * @throws canNavigateBack returns false for this distance
      * @throws A mandatory route parameter has not been supplied a value
      */
    def navigateBack(distance: Double): FluentNavigator = js.native
    
    /**
      * Navigates to the current State
      * @param navigationData The NavigationData to be passed to the current
      * State and stored in the StateContext
      * @param A value determining the effect on browser history
      * @throws There is NavigationData that cannot be converted to a String
      * @throws A mandatory route parameter has not been supplied a value
      */
    def refresh(): FluentNavigator = js.native
    def refresh(navigationData: js.Any): FluentNavigator = js.native
    
    /**
      * Gets the current Url
      */
    var url: String = js.native
  }
  
  @js.native
  trait HistoryManager extends StObject {
    
    /**
      * Adds browser history
      * @param url The current url
      * @param replace A value indicating whether to replace the current
      * @param stateContext The current StateContext
      * browser history entry
      */
    def addHistory(url: String, replace: Boolean, stateContext: StateContext): Unit = js.native
    
    /**
      * Gets or sets a value indicating whether to disable browser history
      */
    var disabled: Boolean = js.native
    
    /**
      * Gets the current location
      */
    def getCurrentUrl(): String = js.native
    
    /**
      * Gets an Href from the url
      */
    def getHref(url: String): String = js.native
    
    /**
      * Gets a Url from the anchor or location
      */
    def getUrl(hrefElement: HTMLAnchorElement): String = js.native
    def getUrl(hrefElement: Location): String = js.native
    
    /**
      * Registers browser history event listeners
      * @param navigateHistory The history navigation event handler
      */
    def init(navigateHistory: js.Function1[/* url */ js.UndefOr[String], Unit]): Unit = js.native
    
    /**
      * Removes browser history event listeners
      */
    def stop(): Unit = js.native
  }
  
  @js.native
  trait StateInfo
    extends /**
    * Gets the additional state attributes
    */
  /* extras */ StringDictionary[js.Any] {
    
    /**
      * Gets the default NavigationData Types for  this State
      */
    var defaultTypes: js.UndefOr[js.Any] = js.native
    
    /**
      * Gets the default NavigationData for this State
      */
    var defaults: js.UndefOr[js.Any] = js.native
    
    /**
      * Gets the unique key
      */
    var key: String = js.native
    
    /**
      * Gets the route Url patterns
      */
    var route: js.UndefOr[String | js.Array[String]] = js.native
    
    /**
      * Gets the textual description of the state
      */
    var title: js.UndefOr[String] = js.native
    
    /**
      * Gets a value that indicates whether to maintain the crumb trail
      */
    var trackCrumbTrail: js.UndefOr[Boolean | String] = js.native
    
    /**
      * Gets a value that indicates whether NavigationData Types are
      * preserved when navigating
      */
    var trackTypes: js.UndefOr[Boolean] = js.native
  }
  object StateInfo {
    
    @scala.inline
    def apply(key: String): StateInfo = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
      __obj.asInstanceOf[StateInfo]
    }
    
    @scala.inline
    implicit class StateInfoMutableBuilder[Self <: StateInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDefaultTypes(value: js.Any): Self = StObject.set(x, "defaultTypes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultTypesUndefined: Self = StObject.set(x, "defaultTypes", js.undefined)
      
      @scala.inline
      def setDefaults(value: js.Any): Self = StObject.set(x, "defaults", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultsUndefined: Self = StObject.set(x, "defaults", js.undefined)
      
      @scala.inline
      def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoute(value: String | js.Array[String]): Self = StObject.set(x, "route", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRouteUndefined: Self = StObject.set(x, "route", js.undefined)
      
      @scala.inline
      def setRouteVarargs(value: String*): Self = StObject.set(x, "route", js.Array(value :_*))
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      @scala.inline
      def setTrackCrumbTrail(value: Boolean | String): Self = StObject.set(x, "trackCrumbTrail", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTrackCrumbTrailUndefined: Self = StObject.set(x, "trackCrumbTrail", js.undefined)
      
      @scala.inline
      def setTrackTypes(value: Boolean): Self = StObject.set(x, "trackTypes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTrackTypesUndefined: Self = StObject.set(x, "trackTypes", js.undefined)
    }
  }
}
