package typingsSlinky.phaser.phaserMod.Loader.FileTypes

import typingsSlinky.phaser.Phaser.Loader.LoaderPlugin
import typingsSlinky.phaser.Phaser.Types.Loader.FileTypes.MultiAtlasFileConfig
import typingsSlinky.phaser.Phaser.Types.Loader.XHRSettingsObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A single Multi Texture Atlas File suitable for loading by the Loader.
  * 
  * These are created when you use the Phaser.Loader.LoaderPlugin#multiatlas method and are not typically created directly.
  * 
  * For documentation about what all the arguments and configuration options mean please see Phaser.Loader.LoaderPlugin#multiatlas.
  */
@JSImport("phaser", "Loader.FileTypes.MultiAtlasFile")
@js.native
class MultiAtlasFile protected ()
  extends typingsSlinky.phaser.Phaser.Loader.FileTypes.MultiAtlasFile {
  /**
    * 
    * @param loader A reference to the Loader that is responsible for this file.
    * @param key The key of the file. Must be unique within both the Loader and the Texture Manager. Or a config object.
    * @param atlasURL The absolute or relative URL to load the multi atlas json file from.
    * @param path Optional path to use when loading the textures defined in the atlas data.
    * @param baseURL Optional Base URL to use when loading the textures defined in the atlas data.
    * @param atlasXhrSettings Extra XHR Settings specifically for the atlas json file.
    * @param textureXhrSettings Extra XHR Settings specifically for the texture files.
    */
  def this(
    loader: LoaderPlugin,
    key: String | MultiAtlasFileConfig,
    atlasURL: js.UndefOr[String],
    path: js.UndefOr[String],
    baseURL: js.UndefOr[String],
    atlasXhrSettings: js.UndefOr[XHRSettingsObject],
    textureXhrSettings: js.UndefOr[XHRSettingsObject]
  ) = this()
}
