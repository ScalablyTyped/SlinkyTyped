package typingsSlinky.cradle.mod

import typingsSlinky.cradle.anon.Cancel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cradle", "Connection")
@js.native
class Connection () extends js.Object {
  def this(uri: String) = this()
  def this(uri: js.UndefOr[scala.Nothing], port: Double) = this()
  def this(uri: String, port: Double) = this()
  def this(uri: js.UndefOr[scala.Nothing], port: js.UndefOr[scala.Nothing], options: Options) = this()
  def this(uri: js.UndefOr[scala.Nothing], port: Double, options: Options) = this()
  def this(uri: String, port: js.UndefOr[scala.Nothing], options: Options) = this()
  def this(uri: String, port: Double, options: Options) = this()
  
  def activeTasks(callback: Callback): Unit = js.native
  
  def config(callback: Callback): Unit = js.native
  
  def database(name: String): Database = js.native
  
  def databases(Callback: Callback): Unit = js.native
  
  def info(callback: Callback): Unit = js.native
  
  def replicate(options: Cancel, callback: Callback): Unit = js.native
  
  def stats(callback: Callback): Unit = js.native
  
  def uuids(callback: Callback): Unit = js.native
  def uuids(count: Double, callback: Callback): Unit = js.native
}
