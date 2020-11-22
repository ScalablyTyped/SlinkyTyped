package typingsSlinky.cryptoJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type CipherParams = typingsSlinky.cryptoJs.mod.global.CryptoJS.lib.CipherParams
  
  type HasherHelper = js.Function2[
    /* message */ typingsSlinky.cryptoJs.mod.WordArray | java.lang.String, 
    /* cfg */ js.UndefOr[js.Object], 
    typingsSlinky.cryptoJs.mod.WordArray
  ]
  
  type HmacHasherHelper = js.Function2[
    /* message */ typingsSlinky.cryptoJs.mod.WordArray | java.lang.String, 
    /* key */ typingsSlinky.cryptoJs.mod.WordArray | java.lang.String, 
    typingsSlinky.cryptoJs.mod.WordArray
  ]
  
  type WordArray = typingsSlinky.cryptoJs.mod.global.CryptoJS.lib.WordArray
  
  type X64Word = typingsSlinky.cryptoJs.mod.global.CryptoJS.x64.Word
}
