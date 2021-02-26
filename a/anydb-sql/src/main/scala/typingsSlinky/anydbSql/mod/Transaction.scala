package typingsSlinky.anydbSql.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Transaction extends DatabaseConnection {
  
  def commitAsync(): typingsSlinky.bluebird.mod.^[Unit] = js.native
  
  def rollback(): Unit = js.native
}
