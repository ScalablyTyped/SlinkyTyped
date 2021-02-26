package typingsSlinky.mobileMessagingCordova

import typingsSlinky.mobileMessagingCordova.MobileMessagingCordova.Event
import typingsSlinky.mobileMessagingCordova.MobileMessagingCordova.Gender
import typingsSlinky.mobileMessagingCordova.MobileMessagingCordova.OS
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mobileMessagingCordovaStrings {
  
  @js.native
  sealed trait Android extends OS
  @scala.inline
  def Android: Android = "Android".asInstanceOf[Android]
  
  @js.native
  sealed trait Female extends Gender
  @scala.inline
  def Female: Female = "Female".asInstanceOf[Female]
  
  @js.native
  sealed trait Male extends Gender
  @scala.inline
  def Male: Male = "Male".asInstanceOf[Male]
  
  @js.native
  sealed trait actionTapped extends Event
  @scala.inline
  def actionTapped: actionTapped = "actionTapped".asInstanceOf[actionTapped]
  
  @js.native
  sealed trait depersonalized extends Event
  @scala.inline
  def depersonalized: depersonalized = "depersonalized".asInstanceOf[depersonalized]
  
  @js.native
  sealed trait geofenceEntered extends Event
  @scala.inline
  def geofenceEntered: geofenceEntered = "geofenceEntered".asInstanceOf[geofenceEntered]
  
  @js.native
  sealed trait iOS extends OS
  @scala.inline
  def iOS: iOS = "iOS".asInstanceOf[iOS]
  
  @js.native
  sealed trait installationUpdated extends Event
  @scala.inline
  def installationUpdated: installationUpdated = "installationUpdated".asInstanceOf[installationUpdated]
  
  @js.native
  sealed trait messageReceived extends Event
  @scala.inline
  def messageReceived: messageReceived = "messageReceived".asInstanceOf[messageReceived]
  
  @js.native
  sealed trait notificationTapped extends Event
  @scala.inline
  def notificationTapped: notificationTapped = "notificationTapped".asInstanceOf[notificationTapped]
  
  @js.native
  sealed trait personalized extends Event
  @scala.inline
  def personalized: personalized = "personalized".asInstanceOf[personalized]
  
  @js.native
  sealed trait registrationUpdated extends Event
  @scala.inline
  def registrationUpdated: registrationUpdated = "registrationUpdated".asInstanceOf[registrationUpdated]
  
  @js.native
  sealed trait tokenReceived extends Event
  @scala.inline
  def tokenReceived: tokenReceived = "tokenReceived".asInstanceOf[tokenReceived]
  
  @js.native
  sealed trait userUpdated extends Event
  @scala.inline
  def userUpdated: userUpdated = "userUpdated".asInstanceOf[userUpdated]
}
