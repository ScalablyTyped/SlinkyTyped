package typingsSlinky.navigation.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.navigation.anon.Crumbs
import typingsSlinky.navigation.navigationStrings.add
import typingsSlinky.navigation.navigationStrings.none
import typingsSlinky.navigation.navigationStrings.replace
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("navigation", "StateNavigator")
@js.native
/**
  * Initializes a new instance of the StateNavigator class
  * @param stateInfos A collection of State Infos or another State Navigator
  * @param historyManager The manager of the browser Url
  */
class StateNavigator () extends js.Object {
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
