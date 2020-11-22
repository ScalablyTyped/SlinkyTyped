package typingsSlinky.jupyterlabDocregistry.registryMod.DocumentRegistry

import typingsSlinky.jupyterlabObservables.modeldbMod.IModelDB
import typingsSlinky.jupyterlabServices.contentsMod.Contents.ContentType
import typingsSlinky.jupyterlabServices.contentsMod.Contents.FileFormat
import typingsSlinky.luminoDisposable.mod.IDisposable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The interface for a model factory.
  */
@js.native
trait IModelFactory[T /* <: IModel */] extends IDisposable {
  
  /**
    * The content type of the file (defaults to `"file"`).
    */
  val contentType: ContentType = js.native
  
  /**
    * Create a new model for a given path.
    *
    * @param languagePreference - An optional kernel language preference.
    *
    * @returns A new document model.
    */
  def createNew(): T = js.native
  def createNew(languagePreference: js.UndefOr[scala.Nothing], modelDB: IModelDB): T = js.native
  def createNew(languagePreference: String): T = js.native
  def createNew(languagePreference: String, modelDB: IModelDB): T = js.native
  
  /**
    * The format of the file (defaults to `"text"`).
    */
  val fileFormat: FileFormat = js.native
  
  /**
    * The name of the model.
    */
  val name: String = js.native
  
  /**
    * Get the preferred kernel language given a file path.
    */
  def preferredLanguage(path: String): String = js.native
}
