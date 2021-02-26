package typingsSlinky.bcrypt

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("bcrypt", "compare")
  @js.native
  def compare(data: js.Any, encrypted: String): js.Promise[Boolean] = js.native
  @JSImport("bcrypt", "compare")
  @js.native
  def compare(
    data: js.Any,
    encrypted: String,
    callback: js.Function2[/* err */ js.Error, /* same */ Boolean, Unit]
  ): js.Promise[Boolean] = js.native
  
  @JSImport("bcrypt", "compareSync")
  @js.native
  def compareSync(data: js.Any, encrypted: String): Boolean = js.native
  
  @JSImport("bcrypt", "genSalt")
  @js.native
  def genSalt(): js.Promise[String] = js.native
  @JSImport("bcrypt", "genSalt")
  @js.native
  def genSalt(callback: js.Function2[/* err */ js.Error, /* salt */ String, Unit]): js.Promise[String] = js.native
  @JSImport("bcrypt", "genSalt")
  @js.native
  def genSalt(
    rounds: js.UndefOr[scala.Nothing],
    callback: js.Function2[/* err */ js.Error, /* salt */ String, Unit]
  ): js.Promise[String] = js.native
  @JSImport("bcrypt", "genSalt")
  @js.native
  def genSalt(
    rounds: js.UndefOr[scala.Nothing],
    minor: js.UndefOr[scala.Nothing],
    callback: js.Function2[/* err */ js.Error, /* salt */ String, Unit]
  ): js.Promise[String] = js.native
  @JSImport("bcrypt", "genSalt")
  @js.native
  def genSalt(rounds: js.UndefOr[scala.Nothing], minor: String): js.Promise[String] = js.native
  @JSImport("bcrypt", "genSalt")
  @js.native
  def genSalt(
    rounds: js.UndefOr[scala.Nothing],
    minor: String,
    callback: js.Function2[/* err */ js.Error, /* salt */ String, Unit]
  ): js.Promise[String] = js.native
  @JSImport("bcrypt", "genSalt")
  @js.native
  def genSalt(rounds: Double): js.Promise[String] = js.native
  @JSImport("bcrypt", "genSalt")
  @js.native
  def genSalt(rounds: Double, callback: js.Function2[/* err */ js.Error, /* salt */ String, Unit]): js.Promise[String] = js.native
  @JSImport("bcrypt", "genSalt")
  @js.native
  def genSalt(
    rounds: Double,
    minor: js.UndefOr[scala.Nothing],
    callback: js.Function2[/* err */ js.Error, /* salt */ String, Unit]
  ): js.Promise[String] = js.native
  @JSImport("bcrypt", "genSalt")
  @js.native
  def genSalt(rounds: Double, minor: String): js.Promise[String] = js.native
  @JSImport("bcrypt", "genSalt")
  @js.native
  def genSalt(rounds: Double, minor: String, callback: js.Function2[/* err */ js.Error, /* salt */ String, Unit]): js.Promise[String] = js.native
  
  @JSImport("bcrypt", "genSaltSync")
  @js.native
  def genSaltSync(): String = js.native
  @JSImport("bcrypt", "genSaltSync")
  @js.native
  def genSaltSync(rounds: js.UndefOr[scala.Nothing], minor: String): String = js.native
  @JSImport("bcrypt", "genSaltSync")
  @js.native
  def genSaltSync(rounds: Double): String = js.native
  @JSImport("bcrypt", "genSaltSync")
  @js.native
  def genSaltSync(rounds: Double, minor: String): String = js.native
  
  @JSImport("bcrypt", "getRounds")
  @js.native
  def getRounds(encrypted: String): Double = js.native
  
  @JSImport("bcrypt", "hash")
  @js.native
  def hash(data: js.Any, saltOrRounds: String): js.Promise[String] = js.native
  @JSImport("bcrypt", "hash")
  @js.native
  def hash(
    data: js.Any,
    saltOrRounds: String,
    callback: js.Function2[/* err */ js.Error, /* encrypted */ String, Unit]
  ): js.Promise[String] = js.native
  @JSImport("bcrypt", "hash")
  @js.native
  def hash(data: js.Any, saltOrRounds: Double): js.Promise[String] = js.native
  @JSImport("bcrypt", "hash")
  @js.native
  def hash(
    data: js.Any,
    saltOrRounds: Double,
    callback: js.Function2[/* err */ js.Error, /* encrypted */ String, Unit]
  ): js.Promise[String] = js.native
  
  @JSImport("bcrypt", "hashSync")
  @js.native
  def hashSync(data: js.Any, saltOrRounds: String): String = js.native
  @JSImport("bcrypt", "hashSync")
  @js.native
  def hashSync(data: js.Any, saltOrRounds: Double): String = js.native
}
