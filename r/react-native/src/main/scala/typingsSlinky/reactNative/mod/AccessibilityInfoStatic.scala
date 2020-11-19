package typingsSlinky.reactNative.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AccessibilityInfoStatic extends js.Object {
  
  def addEventListener(
    eventName: AccessibilityAnnouncementEventName,
    handler: AccessibilityAnnouncementFinishedEventHandler
  ): Unit = js.native
  /**
    * Add an event handler. Supported events:
    * - announcementFinished: iOS-only event. Fires when the screen reader has finished making an announcement.
    *                         The argument to the event handler is a dictionary with these keys:
    *                          - announcement: The string announced by the screen reader.
    *                          - success: A boolean indicating whether the announcement was successfully made.
    * - AccessibilityEventName constants other than announcementFinished: Fires on accessibility feature change.
    *            The argument to the event handler is a boolean.
    *            The boolean is true when the related event's feature is enabled and false otherwise.
    *
    */
  def addEventListener(eventName: AccessibilityChangeEventName, handler: AccessibilityChangeEventHandler): Unit = js.native
  
  /**
    * Post a string to be announced by the screen reader.
    */
  def announceForAccessibility(announcement: String): Unit = js.native
  
  /**
    * Query whether a screen reader is currently enabled.
    *
    * @deprecated use isScreenReaderChanged instead
    */
  def fetch(): js.Promise[Boolean] = js.native
  
  /**
    * Query whether bold text is currently enabled.
    *
    * @platform ios
    */
  def isBoldTextEnabled(): js.Promise[Boolean] = js.native
  
  /**
    * Query whether grayscale is currently enabled.
    *
    * @platform ios
    */
  def isGrayscaleEnabled(): js.Promise[Boolean] = js.native
  
  /**
    * Query whether invert colors is currently enabled.
    *
    * @platform ios
    */
  def isInvertColorsEnabled(): js.Promise[Boolean] = js.native
  
  /**
    * Query whether reduce motion is currently enabled.
    */
  def isReduceMotionEnabled(): js.Promise[Boolean] = js.native
  
  /**
    * Query whether reduce transparency is currently enabled.
    *
    * @platform ios
    */
  def isReduceTransparencyEnabled(): js.Promise[Boolean] = js.native
  
  /**
    * Query whether a screen reader is currently enabled.
    */
  def isScreenReaderEnabled(): js.Promise[Boolean] = js.native
  
  def removeEventListener(
    eventName: AccessibilityAnnouncementEventName,
    handler: AccessibilityAnnouncementFinishedEventHandler
  ): Unit = js.native
  /**
    * Remove an event handler.
    */
  def removeEventListener(eventName: AccessibilityChangeEventName, handler: AccessibilityChangeEventHandler): Unit = js.native
  
  /**
    * Set accessibility focus to a react component.
    */
  def setAccessibilityFocus(reactTag: Double): Unit = js.native
}
