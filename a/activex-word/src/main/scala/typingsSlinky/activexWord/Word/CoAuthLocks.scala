package typingsSlinky.activexWord.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CoAuthLocks extends StObject {
  
  /** @param Word.WdLockType [Type=1] */
  def Add(Range: js.Any): CoAuthLock = js.native
  def Add(Range: js.Any, Type: WdLockType): CoAuthLock = js.native
  
  val Application: typingsSlinky.activexWord.Word.Application = js.native
  
  val Count: Double = js.native
  
  val Creator: Double = js.native
  
  def Item(Index: Double): CoAuthLock = js.native
  
  val Parent: js.Any = js.native
  
  def RemoveEphemeralLocks(): Unit = js.native
  
  @JSName("Word.CoAuthLocks_typekey")
  var WordDotCoAuthLocks_typekey: CoAuthLocks = js.native
}
