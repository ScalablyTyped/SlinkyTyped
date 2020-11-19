package typingsSlinky.bcryptjs

import typingsSlinky.bcryptjs.anon.ReadonlyArrayLikenumber
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("bcryptjs", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def compare(s: String, hash: String): Unit = js.native
  def compare(
    s: String,
    hash: String,
    callback: js.UndefOr[scala.Nothing],
    progressCallback: js.Function1[/* percent */ Double, Unit]
  ): Unit = js.native
  def compare(s: String, hash: String, callback: js.Function2[/* err */ js.Error, /* success */ Boolean, Unit]): Unit = js.native
  def compare(
    s: String,
    hash: String,
    callback: js.Function2[/* err */ js.Error, /* success */ Boolean, Unit],
    progressCallback: js.Function1[/* percent */ Double, Unit]
  ): Unit = js.native
  
  def compareSync(s: String, hash: String): Boolean = js.native
  
  @JSName("compare")
  def compare_Promise(s: String, hash: String): js.Promise[Boolean] = js.native
  
  def decodeBase64(s: String, len: Double): js.Array[Double] = js.native
  
  def encodeBase64(b: ReadonlyArrayLikenumber, len: Double): String = js.native
  
  def genSalt(): js.Promise[String] = js.native
  def genSalt(callback: js.Function2[/* err */ js.Error, /* salt */ String, Unit]): Unit = js.native
  def genSalt(rounds: Double): js.Promise[String] = js.native
  def genSalt(rounds: Double, callback: js.Function2[/* err */ js.Error, /* salt */ String, Unit]): Unit = js.native
  
  def genSaltSync(): String = js.native
  def genSaltSync(rounds: Double): String = js.native
  
  def getRounds(hash: String): Double = js.native
  
  def getSalt(hash: String): String = js.native
  
  def hash(s: String, salt: String): Unit = js.native
  def hash(
    s: String,
    salt: String,
    callback: js.UndefOr[scala.Nothing],
    progressCallback: js.Function1[/* percent */ Double, Unit]
  ): Unit = js.native
  def hash(s: String, salt: String, callback: js.Function2[/* err */ js.Error, /* hash */ String, Unit]): Unit = js.native
  def hash(
    s: String,
    salt: String,
    callback: js.Function2[/* err */ js.Error, /* hash */ String, Unit],
    progressCallback: js.Function1[/* percent */ Double, Unit]
  ): Unit = js.native
  def hash(s: String, salt: Double): Unit = js.native
  def hash(
    s: String,
    salt: Double,
    callback: js.UndefOr[scala.Nothing],
    progressCallback: js.Function1[/* percent */ Double, Unit]
  ): Unit = js.native
  def hash(s: String, salt: Double, callback: js.Function2[/* err */ js.Error, /* hash */ String, Unit]): Unit = js.native
  def hash(
    s: String,
    salt: Double,
    callback: js.Function2[/* err */ js.Error, /* hash */ String, Unit],
    progressCallback: js.Function1[/* percent */ Double, Unit]
  ): Unit = js.native
  
  def hashSync(s: String): String = js.native
  def hashSync(s: String, salt: String): String = js.native
  def hashSync(s: String, salt: Double): String = js.native
  
  @JSName("hash")
  def hash_Promise(s: String, salt: String): js.Promise[String] = js.native
  @JSName("hash")
  def hash_Promise(s: String, salt: Double): js.Promise[String] = js.native
  
  def setRandomFallback(random: js.Function1[/* random */ Double, js.Array[Double]]): Unit = js.native
}
