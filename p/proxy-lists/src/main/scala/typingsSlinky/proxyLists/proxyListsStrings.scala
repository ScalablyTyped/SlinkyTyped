package typingsSlinky.proxyLists

import typingsSlinky.proxyLists.mod.AnonymityLevel
import typingsSlinky.proxyLists.mod.IPType
import typingsSlinky.proxyLists.mod.Protocol
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object proxyListsStrings {
  
  @js.native
  sealed trait anonymous extends AnonymityLevel
  @scala.inline
  def anonymous: anonymous = "anonymous".asInstanceOf[anonymous]
  
  @js.native
  sealed trait data extends StObject
  @scala.inline
  def data: data = "data".asInstanceOf[data]
  
  @js.native
  sealed trait elite extends AnonymityLevel
  @scala.inline
  def elite: elite = "elite".asInstanceOf[elite]
  
  @js.native
  sealed trait end extends StObject
  @scala.inline
  def end: end = "end".asInstanceOf[end]
  
  @js.native
  sealed trait error extends StObject
  @scala.inline
  def error: error = "error".asInstanceOf[error]
  
  @js.native
  sealed trait http extends Protocol
  @scala.inline
  def http: http = "http".asInstanceOf[http]
  
  @js.native
  sealed trait https extends Protocol
  @scala.inline
  def https: https = "https".asInstanceOf[https]
  
  @js.native
  sealed trait ipv4 extends IPType
  @scala.inline
  def ipv4: ipv4 = "ipv4".asInstanceOf[ipv4]
  
  @js.native
  sealed trait ipv6 extends IPType
  @scala.inline
  def ipv6: ipv6 = "ipv6".asInstanceOf[ipv6]
  
  @js.native
  sealed trait loose extends StObject
  @scala.inline
  def loose: loose = "loose".asInstanceOf[loose]
  
  @js.native
  sealed trait socks4 extends Protocol
  @scala.inline
  def socks4: socks4 = "socks4".asInstanceOf[socks4]
  
  @js.native
  sealed trait socks5 extends Protocol
  @scala.inline
  def socks5: socks5 = "socks5".asInstanceOf[socks5]
  
  @js.native
  sealed trait strict extends StObject
  @scala.inline
  def strict: strict = "strict".asInstanceOf[strict]
  
  @js.native
  sealed trait transparent extends AnonymityLevel
  @scala.inline
  def transparent: transparent = "transparent".asInstanceOf[transparent]
}
