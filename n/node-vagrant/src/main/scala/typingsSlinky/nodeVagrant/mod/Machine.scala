package typingsSlinky.nodeVagrant.mod

import typingsSlinky.nodeVagrant.anon.Cb
import typingsSlinky.nodeVagrant.anon.Cwd
import typingsSlinky.nodeVagrant.anon.Host
import typingsSlinky.nodeVagrant.anon.Provider
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Machine extends MachineEmitter {
  var batch: js.Array[Cb] = js.native
  var opts: Cwd = js.native
  def boxRepackage(name: String, provider: String, version: String): Unit = js.native
  def boxRepackage(name: String, provider: String, version: String, cb: Callback): Unit = js.native
  def destroy(): Unit = js.native
  def destroy(args: String): Unit = js.native
  def destroy(args: String, cb: Callback): Unit = js.native
  def destroy(args: js.Array[String]): Unit = js.native
  def destroy(args: js.Array[String], cb: Callback): Unit = js.native
  def destroy(cb: Callback): Unit = js.native
  def halt(): Unit = js.native
  def halt(args: String): Unit = js.native
  def halt(args: String, cb: Callback): Unit = js.native
  def halt(args: js.Array[String]): Unit = js.native
  def halt(args: js.Array[String], cb: Callback): Unit = js.native
  def halt(cb: Callback): Unit = js.native
  def init(args: String, cb: Callback): Unit = js.native
  def init(args: String, config: js.Any, cb: Callback): Unit = js.native
  def init(args: js.Array[String], cb: Callback): Unit = js.native
  def init(args: js.Array[String], config: js.Any, cb: Callback): Unit = js.native
  def plugin(): Plugin = js.native
  def pluginRepair(): Unit = js.native
  def pluginRepair(cb: Callback): Unit = js.native
  def pluginUpdate(): Unit = js.native
  def pluginUpdate(cb: Callback): Unit = js.native
  def provision(): Unit = js.native
  def provision(cb: Callback): Unit = js.native
  def reload(): Unit = js.native
  def reload(args: String): Unit = js.native
  def reload(args: String, cb: Callback): Unit = js.native
  def reload(args: js.Array[String]): Unit = js.native
  def reload(args: js.Array[String], cb: Callback): Unit = js.native
  def reload(cb: Callback): Unit = js.native
  def resume(): Unit = js.native
  def resume(cb: Callback): Unit = js.native
  def snapshots(): Snapshots = js.native
  def sshConfig(cb: js.Function2[/* err */ ErrorArg, /* out */ js.UndefOr[Host], Unit]): Unit = js.native
  def status(cb: js.Function2[/* err */ ErrorArg, /* out */ js.UndefOr[js.Array[Provider]], Unit]): Unit = js.native
  def suspend(): Unit = js.native
  def suspend(cb: Callback): Unit = js.native
  def up(): Unit = js.native
  def up(args: String): Unit = js.native
  def up(args: String, cb: Callback): Unit = js.native
  def up(args: js.Array[String]): Unit = js.native
  def up(args: js.Array[String], cb: Callback): Unit = js.native
  def up(cb: Callback): Unit = js.native
}

