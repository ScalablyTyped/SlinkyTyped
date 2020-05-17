package typingsSlinky.proxyAddr

import typingsSlinky.proxyAddr.mod.Address
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object proxyAddrStrings {
  @js.native
  sealed trait linklocal extends Address
  
  @js.native
  sealed trait loopback extends Address
  
  @js.native
  sealed trait uniquelocal extends Address
  
  @scala.inline
  def linklocal: linklocal = "linklocal".asInstanceOf[linklocal]
  @scala.inline
  def loopback: loopback = "loopback".asInstanceOf[loopback]
  @scala.inline
  def uniquelocal: uniquelocal = "uniquelocal".asInstanceOf[uniquelocal]
}

