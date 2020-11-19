package typingsSlinky.pem

import typingsSlinky.pem.mod._HashFunction
import typingsSlinky.pem.mod._PrivateKeyCipher
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pemStrings {
  
  @scala.inline
  def aes128: aes128 = "aes128".asInstanceOf[aes128]
  
  @scala.inline
  def aes192: aes192 = "aes192".asInstanceOf[aes192]
  
  @scala.inline
  def aes256: aes256 = "aes256".asInstanceOf[aes256]
  
  @scala.inline
  def camellia128: camellia128 = "camellia128".asInstanceOf[camellia128]
  
  @scala.inline
  def camellia192: camellia192 = "camellia192".asInstanceOf[camellia192]
  
  @scala.inline
  def camellia256: camellia256 = "camellia256".asInstanceOf[camellia256]
  
  @scala.inline
  def des: des = "des".asInstanceOf[des]
  
  @scala.inline
  def des3: des3 = "des3".asInstanceOf[des3]
  
  @scala.inline
  def idea: idea = "idea".asInstanceOf[idea]
  
  @scala.inline
  def md5: md5 = "md5".asInstanceOf[md5]
  
  @scala.inline
  def sha1: sha1 = "sha1".asInstanceOf[sha1]
  
  @scala.inline
  def sha256: sha256 = "sha256".asInstanceOf[sha256]
  
  @js.native
  sealed trait aes128 extends _PrivateKeyCipher
  
  @js.native
  sealed trait aes192 extends _PrivateKeyCipher
  
  @js.native
  sealed trait aes256 extends _PrivateKeyCipher
  
  @js.native
  sealed trait camellia128 extends _PrivateKeyCipher
  
  @js.native
  sealed trait camellia192 extends _PrivateKeyCipher
  
  @js.native
  sealed trait camellia256 extends _PrivateKeyCipher
  
  @js.native
  sealed trait des extends _PrivateKeyCipher
  
  @js.native
  sealed trait des3 extends _PrivateKeyCipher
  
  @js.native
  sealed trait idea extends _PrivateKeyCipher
  
  @js.native
  sealed trait md5 extends _HashFunction
  
  @js.native
  sealed trait sha1 extends _HashFunction
  
  @js.native
  sealed trait sha256 extends _HashFunction
}
