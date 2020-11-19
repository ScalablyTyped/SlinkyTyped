package typingsSlinky.proxyAddr

import typingsSlinky.proxyAddr.mod._Address
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object proxyAddrStrings {
  
  @scala.inline
  def linklocal: linklocal = "linklocal".asInstanceOf[linklocal]
  
  @scala.inline
  def loopback: loopback = "loopback".asInstanceOf[loopback]
  
  @scala.inline
  def uniquelocal: uniquelocal = "uniquelocal".asInstanceOf[uniquelocal]
  
  @js.native
  sealed trait linklocal extends _Address
  
  @js.native
  sealed trait loopback extends _Address
  
  @js.native
  sealed trait uniquelocal extends _Address
}
