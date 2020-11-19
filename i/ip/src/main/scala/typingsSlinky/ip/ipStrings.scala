package typingsSlinky.ip

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ipStrings {
  
  @scala.inline
  def ipv4: ipv4 = "ipv4".asInstanceOf[ipv4]
  
  @scala.inline
  def ipv6: ipv6 = "ipv6".asInstanceOf[ipv6]
  
  @scala.inline
  def `private`: `private` = "private".asInstanceOf[`private`]
  
  @scala.inline
  def public: public = "public".asInstanceOf[public]
  
  @js.native
  sealed trait ipv4 extends js.Object
  
  @js.native
  sealed trait ipv6 extends js.Object
  
  @js.native
  sealed trait `private` extends js.Object
  
  @js.native
  sealed trait public extends js.Object
}
