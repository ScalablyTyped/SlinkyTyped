package typingsSlinky.proxyVerifier

import typingsSlinky.proxyVerifier.mod.AnonymityLevel
import typingsSlinky.proxyVerifier.mod.Protocol
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object proxyVerifierStrings {
  
  @js.native
  sealed trait anonymous extends AnonymityLevel
  @scala.inline
  def anonymous: anonymous = "anonymous".asInstanceOf[anonymous]
  
  @js.native
  sealed trait elite extends AnonymityLevel
  @scala.inline
  def elite: elite = "elite".asInstanceOf[elite]
  
  @js.native
  sealed trait http extends Protocol
  @scala.inline
  def http: http = "http".asInstanceOf[http]
  
  @js.native
  sealed trait https extends Protocol
  @scala.inline
  def https: https = "https".asInstanceOf[https]
  
  @js.native
  sealed trait socks4 extends Protocol
  @scala.inline
  def socks4: socks4 = "socks4".asInstanceOf[socks4]
  
  @js.native
  sealed trait socks5 extends Protocol
  @scala.inline
  def socks5: socks5 = "socks5".asInstanceOf[socks5]
  
  @js.native
  sealed trait transparent extends AnonymityLevel
  @scala.inline
  def transparent: transparent = "transparent".asInstanceOf[transparent]
}
