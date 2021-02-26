package typingsSlinky.nodegit

import typingsSlinky.nodegit.certMod.Cert.TYPE
import typingsSlinky.nodegit.nodegitNumbers.`0`
import typingsSlinky.nodegit.nodegitNumbers.`1`
import typingsSlinky.nodegit.nodegitNumbers.`2`
import typingsSlinky.nodegit.nodegitNumbers.`3`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object certMod {
  
  @JSImport("nodegit/cert", "Cert")
  @js.native
  class Cert () extends StObject {
    
    var certType: TYPE = js.native
  }
  object Cert {
    
    /* Rewritten from type alias, can be one of: 
      - typingsSlinky.nodegit.nodegitNumbers.`1`
      - typingsSlinky.nodegit.nodegitNumbers.`2`
    */
    trait SSH extends StObject
    object SSH {
      
      @scala.inline
      def MD5: `1` = 1.asInstanceOf[`1`]
      
      @scala.inline
      def SHA1: `2` = 2.asInstanceOf[`2`]
    }
    
    /* Rewritten from type alias, can be one of: 
      - typingsSlinky.nodegit.nodegitNumbers.`0`
      - typingsSlinky.nodegit.nodegitNumbers.`1`
      - typingsSlinky.nodegit.nodegitNumbers.`2`
      - typingsSlinky.nodegit.nodegitNumbers.`3`
    */
    trait TYPE extends StObject
    object TYPE {
      
      @scala.inline
      def HOSTKEY_LIBSSH2: `2` = 2.asInstanceOf[`2`]
      
      @scala.inline
      def NONE: `0` = 0.asInstanceOf[`0`]
      
      @scala.inline
      def STRARRAY: `3` = 3.asInstanceOf[`3`]
      
      @scala.inline
      def X509: `1` = 1.asInstanceOf[`1`]
    }
  }
}
