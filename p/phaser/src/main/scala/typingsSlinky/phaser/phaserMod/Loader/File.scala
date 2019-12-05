package typingsSlinky.phaser.phaserMod.Loader

import org.scalajs.dom.raw.Blob
import org.scalajs.dom.raw.HTMLImageElement
import typingsSlinky.phaser.Phaser.Types.Loader.FileConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The base File class used by all File Types that the Loader can support.
  * You shouldn't create an instance of a File directly, but should extend it with your own class, setting a custom type and processing methods.
  */
@JSImport("phaser", "Loader.File")
@js.native
class File protected ()
  extends typingsSlinky.phaser.Phaser.Loader.File {
  /**
    * 
    * @param loader The Loader that is going to load this File.
    * @param fileConfig The file configuration object, as created by the file type.
    */
  def this(loader: typingsSlinky.phaser.Phaser.Loader.LoaderPlugin, fileConfig: FileConfig) = this()
}

/* static members */
@JSImport("phaser", "Loader.File")
@js.native
object File extends js.Object {
  /**
    * Static method for creating object URL using URL API and setting it as image 'src' attribute.
    * If URL API is not supported (usually on old browsers) it falls back to creating Base64 encoded url using FileReader.
    * @param image Image object which 'src' attribute should be set to object URL.
    * @param blob A Blob object to create an object URL for.
    * @param defaultType Default mime type used if blob type is not available.
    */
  def createObjectURL(image: HTMLImageElement, blob: Blob, defaultType: String): Unit = js.native
  /**
    * Static method for releasing an existing object URL which was previously created
    * by calling {@link File#createObjectURL} method.
    * @param image Image object which 'src' attribute should be revoked.
    */
  def revokeObjectURL(image: HTMLImageElement): Unit = js.native
}

