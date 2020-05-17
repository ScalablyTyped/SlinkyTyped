package typingsSlinky.kiiCloudSdk.KiiCloud

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.kiiCloudSdk.KiiCloud.KiiGroup
  - typingsSlinky.kiiCloudSdk.KiiCloud.KiiUser
  - typingsSlinky.kiiCloudSdk.KiiCloud.KiiAnyAuthenticatedUser
  - typingsSlinky.kiiCloudSdk.KiiCloud.KiiAnonymousUser
  - typingsSlinky.kiiCloudSdk.KiiCloud.KiiThing
*/
trait KiiACLSubject extends js.Object

object KiiACLSubject {
  @scala.inline
  implicit def apply(value: KiiAnonymousUser): KiiACLSubject = value.asInstanceOf[KiiACLSubject]
  @scala.inline
  implicit def apply(value: KiiAnyAuthenticatedUser): KiiACLSubject = value.asInstanceOf[KiiACLSubject]
  @scala.inline
  implicit def apply(value: KiiGroup): KiiACLSubject = value.asInstanceOf[KiiACLSubject]
  @scala.inline
  implicit def apply(value: KiiThing): KiiACLSubject = value.asInstanceOf[KiiACLSubject]
  @scala.inline
  implicit def apply(value: KiiUser): KiiACLSubject = value.asInstanceOf[KiiACLSubject]
}

