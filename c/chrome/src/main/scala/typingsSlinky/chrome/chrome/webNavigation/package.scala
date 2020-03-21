package typingsSlinky.chrome.chrome

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object webNavigation {
  type WebNavigationFramedErrorEvent = typingsSlinky.chrome.chrome.webNavigation.WebNavigationEvent[
    typingsSlinky.chrome.chrome.webNavigation.WebNavigationFramedErrorCallbackDetails
  ]
  type WebNavigationFramedEvent = typingsSlinky.chrome.chrome.webNavigation.WebNavigationEvent[typingsSlinky.chrome.chrome.webNavigation.WebNavigationFramedCallbackDetails]
  type WebNavigationParentedEvent = typingsSlinky.chrome.chrome.webNavigation.WebNavigationEvent[typingsSlinky.chrome.chrome.webNavigation.WebNavigationParentedCallbackDetails]
  type WebNavigationReplacementEvent = typingsSlinky.chrome.chrome.webNavigation.WebNavigationEvent[
    typingsSlinky.chrome.chrome.webNavigation.WebNavigationReplacementCallbackDetails
  ]
  type WebNavigationSourceEvent = typingsSlinky.chrome.chrome.webNavigation.WebNavigationEvent[typingsSlinky.chrome.chrome.webNavigation.WebNavigationSourceCallbackDetails]
  type WebNavigationTransitionalEvent = typingsSlinky.chrome.chrome.webNavigation.WebNavigationEvent[typingsSlinky.chrome.chrome.webNavigation.WebNavigationTransitionCallbackDetails]
}
