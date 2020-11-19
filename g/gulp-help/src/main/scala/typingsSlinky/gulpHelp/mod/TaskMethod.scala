package typingsSlinky.gulpHelp.mod

import typingsSlinky.gulp.mod.TaskCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TaskMethod extends js.Object {
  
  /**
    * Define a task.
    *
    * @param name the name of the task. Tasks that you want to run from the command line should not have spaces in them.
    * @param fn the function that performs the task's operations. Generally this takes the form of gulp.src().pipe(someplugin()).
    * @param option task options
    */
  def apply(name: String): js.Any = js.native
  /**
    * Define a task.
    *
    * @param name the name of the task. Tasks that you want to run from the command line should not have spaces in them.
    * @param deps an array of tasks to be executed and completed before your task will run.
    * @param fn the function that performs the task's operations. Generally this takes the form of gulp.src().pipe(someplugin()).
    * @param option task options
    */
  def apply(name: String, deps: js.Array[String]): js.Any = js.native
  def apply(name: String, deps: js.Array[String], fn: js.UndefOr[scala.Nothing], option: TaskOptions): js.Any = js.native
  def apply(name: String, deps: js.Array[String], fn: TaskCallback): js.Any = js.native
  def apply(name: String, deps: js.Array[String], fn: TaskCallback, option: TaskOptions): js.Any = js.native
  def apply(name: String, fn: js.UndefOr[scala.Nothing], option: TaskOptions): js.Any = js.native
  def apply(name: String, fn: TaskCallback): js.Any = js.native
  def apply(name: String, fn: TaskCallback, option: TaskOptions): js.Any = js.native
  /**
    * Define a task.
    *
    * @param name the name of the task. Tasks that you want to run from the command line should not have spaces in them.
    * @param help Custom help message as a string. If you want to hide the task from the help menu, supply false
    * @param fn the function that performs the task's operations. Generally this takes the form of gulp.src().pipe(someplugin()).
    * @param option task options
    */
  def apply(name: String, help: HelpOption): js.Any = js.native
  /**
    * Define a task.
    *
    * @param name the name of the task. Tasks that you want to run from the command line should not have spaces in them.
    * @param help Custom help message as a string. If you want to hide the task from the help menu, supply false
    * @param deps an array of tasks to be executed and completed before your task will run.
    * @param fn the function that performs the task's operations. Generally this takes the form of gulp.src().pipe(someplugin()).
    * @param option task options
    */
  def apply(name: String, help: HelpOption, deps: js.Array[String]): js.Any = js.native
  def apply(
    name: String,
    help: HelpOption,
    deps: js.Array[String],
    fn: js.UndefOr[scala.Nothing],
    option: TaskOptions
  ): js.Any = js.native
  def apply(name: String, help: HelpOption, deps: js.Array[String], fn: TaskCallback): js.Any = js.native
  def apply(name: String, help: HelpOption, deps: js.Array[String], fn: TaskCallback, option: TaskOptions): js.Any = js.native
  def apply(name: String, help: HelpOption, fn: js.UndefOr[scala.Nothing], option: TaskOptions): js.Any = js.native
  def apply(name: String, help: HelpOption, fn: TaskCallback): js.Any = js.native
  def apply(name: String, help: HelpOption, fn: TaskCallback, option: TaskOptions): js.Any = js.native
}
