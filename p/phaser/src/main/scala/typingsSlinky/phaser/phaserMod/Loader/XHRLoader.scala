package typingsSlinky.phaser.phaserMod.Loader

import org.scalajs.dom.raw.XMLHttpRequest
import typingsSlinky.phaser.Phaser.Types.Loader.XHRSettingsObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("phaser", "Loader.XHRLoader")
@js.native
object XHRLoader extends js.Object {
  
  /**
    * Creates a new XMLHttpRequest (xhr) object based on the given File and XHRSettings
    * and starts the download of it. It uses the Files own XHRSettings and merges them
    * with the global XHRSettings object to set the xhr values before download.
    * @param file The File to download.
    * @param globalXHRSettings The global XHRSettings object.
    */
  def apply(file: typingsSlinky.phaser.Phaser.Loader.File, globalXHRSettings: XHRSettingsObject): XMLHttpRequest = js.native
}
