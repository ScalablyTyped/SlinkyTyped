package typingsSlinky.jake.mod.global

import typingsSlinky.jake.mod.global.jake.Task
import typingsSlinky.jake.mod.global.jake.TaskOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("task")
@js.native
object task extends js.Object {
  
  /**
    * @param name The name of the Task
    * @param prereqs Prerequisites to be run before this task
    * @param action The action to perform for this task
    * @param opts
    */
  def apply(name: String): Task = js.native
  def apply(name: String, action: js.UndefOr[scala.Nothing], opts: TaskOptions): Task = js.native
  def apply(name: String, action: js.ThisFunction1[/* this */ Task, /* repeated */ js.Any, _]): Task = js.native
  def apply(
    name: String,
    action: js.ThisFunction1[/* this */ Task, /* repeated */ js.Any, _],
    opts: TaskOptions
  ): Task = js.native
  def apply(name: String, opts: TaskOptions): Task = js.native
  def apply(
    name: String,
    opts: TaskOptions,
    action: js.ThisFunction1[/* this */ Task, /* repeated */ js.Any, _]
  ): Task = js.native
  def apply(
    name: String,
    prereqs: js.UndefOr[scala.Nothing],
    action: js.UndefOr[scala.Nothing],
    opts: TaskOptions
  ): Task = js.native
  def apply(
    name: String,
    prereqs: js.UndefOr[scala.Nothing],
    action: js.ThisFunction1[/* this */ Task, /* repeated */ js.Any, _]
  ): Task = js.native
  def apply(
    name: String,
    prereqs: js.UndefOr[scala.Nothing],
    action: js.ThisFunction1[/* this */ Task, /* repeated */ js.Any, _],
    opts: TaskOptions
  ): Task = js.native
  def apply(name: String, prereqs: js.Array[String]): Task = js.native
  def apply(name: String, prereqs: js.Array[String], action: js.UndefOr[scala.Nothing], opts: TaskOptions): Task = js.native
  def apply(
    name: String,
    prereqs: js.Array[String],
    action: js.ThisFunction1[/* this */ Task, /* repeated */ js.Any, _]
  ): Task = js.native
  def apply(
    name: String,
    prereqs: js.Array[String],
    action: js.ThisFunction1[/* this */ Task, /* repeated */ js.Any, _],
    opts: TaskOptions
  ): Task = js.native
}
