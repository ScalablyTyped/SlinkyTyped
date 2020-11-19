package typingsSlinky.ckeditor.CKEDITOR.fileTools

import org.scalajs.dom.raw.Blob
import typingsSlinky.ckeditor.CKEDITOR.event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait uploadRepository extends event {
  
  def create(fileOrData: String, fileName: String): fileLoader = js.native
  def create(fileOrData: String, fileName: String, loaderType: js.Any): fileLoader = js.native
  def create(fileOrData: Blob, fileName: String): fileLoader = js.native
  def create(fileOrData: Blob, fileName: String, loaderType: js.Any): fileLoader = js.native
  
  def isFinished(): Boolean = js.native
  
  val loaders: js.Array[fileLoader] = js.native
}
