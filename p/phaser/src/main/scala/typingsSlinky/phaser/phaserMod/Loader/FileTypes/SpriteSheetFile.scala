package typingsSlinky.phaser.phaserMod.Loader.FileTypes

import typingsSlinky.phaser.Phaser.Loader.LoaderPlugin
import typingsSlinky.phaser.Phaser.Types.Loader.FileTypes.ImageFrameConfig
import typingsSlinky.phaser.Phaser.Types.Loader.FileTypes.SpriteSheetFileConfig
import typingsSlinky.phaser.Phaser.Types.Loader.XHRSettingsObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A single Sprite Sheet Image File suitable for loading by the Loader.
  * 
  * These are created when you use the Phaser.Loader.LoaderPlugin#spritesheet method and are not typically created directly.
  * 
  * For documentation about what all the arguments and configuration options mean please see Phaser.Loader.LoaderPlugin#spritesheet.
  */
@JSImport("phaser", "Loader.FileTypes.SpriteSheetFile")
@js.native
class SpriteSheetFile protected ()
  extends typingsSlinky.phaser.Phaser.Loader.FileTypes.SpriteSheetFile {
  /**
    * 
    * @param loader A reference to the Loader that is responsible for this file.
    * @param key The key to use for this file, or a file configuration object.
    * @param url The absolute or relative URL to load this file from. If undefined or `null` it will be set to `<key>.png`, i.e. if `key` was "alien" then the URL will be "alien.png".
    * @param frameConfig The frame configuration object.
    * @param xhrSettings Extra XHR Settings specifically for this file.
    */
  def this(loader: LoaderPlugin, key: String) = this()
  def this(loader: LoaderPlugin, key: SpriteSheetFileConfig) = this()
  def this(loader: LoaderPlugin, key: String, url: String) = this()
  def this(loader: LoaderPlugin, key: String, url: js.Array[String]) = this()
  def this(loader: LoaderPlugin, key: SpriteSheetFileConfig, url: String) = this()
  def this(loader: LoaderPlugin, key: SpriteSheetFileConfig, url: js.Array[String]) = this()
  def this(loader: LoaderPlugin, key: String, url: js.UndefOr[scala.Nothing], frameConfig: ImageFrameConfig) = this()
  def this(loader: LoaderPlugin, key: String, url: String, frameConfig: ImageFrameConfig) = this()
  def this(loader: LoaderPlugin, key: String, url: js.Array[String], frameConfig: ImageFrameConfig) = this()
  def this(
    loader: LoaderPlugin,
    key: SpriteSheetFileConfig,
    url: js.UndefOr[scala.Nothing],
    frameConfig: ImageFrameConfig
  ) = this()
  def this(loader: LoaderPlugin, key: SpriteSheetFileConfig, url: String, frameConfig: ImageFrameConfig) = this()
  def this(
    loader: LoaderPlugin,
    key: SpriteSheetFileConfig,
    url: js.Array[String],
    frameConfig: ImageFrameConfig
  ) = this()
  def this(
    loader: LoaderPlugin,
    key: String,
    url: js.UndefOr[scala.Nothing],
    frameConfig: js.UndefOr[scala.Nothing],
    xhrSettings: XHRSettingsObject
  ) = this()
  def this(
    loader: LoaderPlugin,
    key: String,
    url: js.UndefOr[scala.Nothing],
    frameConfig: ImageFrameConfig,
    xhrSettings: XHRSettingsObject
  ) = this()
  def this(
    loader: LoaderPlugin,
    key: String,
    url: String,
    frameConfig: js.UndefOr[scala.Nothing],
    xhrSettings: XHRSettingsObject
  ) = this()
  def this(
    loader: LoaderPlugin,
    key: String,
    url: String,
    frameConfig: ImageFrameConfig,
    xhrSettings: XHRSettingsObject
  ) = this()
  def this(
    loader: LoaderPlugin,
    key: String,
    url: js.Array[String],
    frameConfig: js.UndefOr[scala.Nothing],
    xhrSettings: XHRSettingsObject
  ) = this()
  def this(
    loader: LoaderPlugin,
    key: String,
    url: js.Array[String],
    frameConfig: ImageFrameConfig,
    xhrSettings: XHRSettingsObject
  ) = this()
  def this(
    loader: LoaderPlugin,
    key: SpriteSheetFileConfig,
    url: js.UndefOr[scala.Nothing],
    frameConfig: js.UndefOr[scala.Nothing],
    xhrSettings: XHRSettingsObject
  ) = this()
  def this(
    loader: LoaderPlugin,
    key: SpriteSheetFileConfig,
    url: js.UndefOr[scala.Nothing],
    frameConfig: ImageFrameConfig,
    xhrSettings: XHRSettingsObject
  ) = this()
  def this(
    loader: LoaderPlugin,
    key: SpriteSheetFileConfig,
    url: String,
    frameConfig: js.UndefOr[scala.Nothing],
    xhrSettings: XHRSettingsObject
  ) = this()
  def this(
    loader: LoaderPlugin,
    key: SpriteSheetFileConfig,
    url: String,
    frameConfig: ImageFrameConfig,
    xhrSettings: XHRSettingsObject
  ) = this()
  def this(
    loader: LoaderPlugin,
    key: SpriteSheetFileConfig,
    url: js.Array[String],
    frameConfig: js.UndefOr[scala.Nothing],
    xhrSettings: XHRSettingsObject
  ) = this()
  def this(
    loader: LoaderPlugin,
    key: SpriteSheetFileConfig,
    url: js.Array[String],
    frameConfig: ImageFrameConfig,
    xhrSettings: XHRSettingsObject
  ) = this()
}
