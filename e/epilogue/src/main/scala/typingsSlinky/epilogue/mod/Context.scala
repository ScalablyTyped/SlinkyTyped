package typingsSlinky.epilogue.mod

import typingsSlinky.epilogue.mod.Errors.EpilogueError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Context extends js.Object {
  
  var attributes: js.Any = js.native
  
  def continue(): Unit = js.native
  
  var criteria: js.Any = js.native
  
  def error(status: Double): Unit = js.native
  def error(
    status: Double,
    message: js.UndefOr[scala.Nothing],
    errorList: js.UndefOr[scala.Nothing],
    cause: js.Error
  ): Unit = js.native
  def error(status: Double, message: js.UndefOr[scala.Nothing], errorList: js.Array[String]): Unit = js.native
  def error(status: Double, message: js.UndefOr[scala.Nothing], errorList: js.Array[String], cause: js.Error): Unit = js.native
  def error(status: Double, message: String): Unit = js.native
  def error(status: Double, message: String, errorList: js.UndefOr[scala.Nothing], cause: js.Error): Unit = js.native
  def error(status: Double, message: String, errorList: js.Array[String]): Unit = js.native
  def error(status: Double, message: String, errorList: js.Array[String], cause: js.Error): Unit = js.native
  def error(status: EpilogueError): Unit = js.native
  def error(
    status: EpilogueError,
    message: js.UndefOr[scala.Nothing],
    errorList: js.UndefOr[scala.Nothing],
    cause: js.Error
  ): Unit = js.native
  def error(status: EpilogueError, message: js.UndefOr[scala.Nothing], errorList: js.Array[String]): Unit = js.native
  def error(
    status: EpilogueError,
    message: js.UndefOr[scala.Nothing],
    errorList: js.Array[String],
    cause: js.Error
  ): Unit = js.native
  def error(status: EpilogueError, message: String): Unit = js.native
  def error(status: EpilogueError, message: String, errorList: js.UndefOr[scala.Nothing], cause: js.Error): Unit = js.native
  def error(status: EpilogueError, message: String, errorList: js.Array[String]): Unit = js.native
  def error(status: EpilogueError, message: String, errorList: js.Array[String], cause: js.Error): Unit = js.native
  
  var instance: Resource_ = js.native
  
  var options: js.Any = js.native
  
  def skip(): Unit = js.native
  
  def stop(): Unit = js.native
}
