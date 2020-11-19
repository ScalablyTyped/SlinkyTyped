package typingsSlinky.phaser.phaserMod.Loader.FileTypes

import typingsSlinky.phaser.Phaser.Loader.LoaderPlugin
import typingsSlinky.phaser.Phaser.Types.Loader.FileTypes.ImageFileConfig
import typingsSlinky.phaser.Phaser.Types.Loader.FileTypes.ImageFrameConfig
import typingsSlinky.phaser.Phaser.Types.Loader.XHRSettingsObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A single Image File suitable for loading by the Loader.
  * 
  * These are created when you use the Phaser.Loader.LoaderPlugin#image method and are not typically created directly.
  * 
  * For documentation about what all the arguments and configuration options mean please see Phaser.Loader.LoaderPlugin#image.
  */
@JSImport("phaser", "Loader.FileTypes.ImageFile")
@js.native
class ImageFile protected ()
  extends typingsSlinky.phaser.Phaser.Loader.FileTypes.ImageFile {
  /**
    * 
    * @param loader A reference to the Loader that is responsible for this file.
    * @param key The key to use for this file, or a file configuration object.
    * @param url The absolute or relative URL to load this file from. If undefined or `null` it will be set to `<key>.png`, i.e. if `key` was "alien" then the URL will be "alien.png".
    * @param xhrSettings Extra XHR Settings specifically for this file.
    * @param frameConfig The frame configuration object. Only provided for, and used by, Sprite Sheets.
    */
  def this(loader: LoaderPlugin, key: String) = this()
  def this(loader: LoaderPlugin, key: ImageFileConfig) = this()
  def this(loader: LoaderPlugin, key: String, url: String) = this()
  def this(loader: LoaderPlugin, key: String, url: js.Array[String]) = this()
  def this(loader: LoaderPlugin, key: ImageFileConfig, url: String) = this()
  def this(loader: LoaderPlugin, key: ImageFileConfig, url: js.Array[String]) = this()
  def this(loader: LoaderPlugin, key: String, url: js.UndefOr[scala.Nothing], xhrSettings: XHRSettingsObject) = this()
  def this(loader: LoaderPlugin, key: String, url: String, xhrSettings: XHRSettingsObject) = this()
  def this(loader: LoaderPlugin, key: String, url: js.Array[String], xhrSettings: XHRSettingsObject) = this()
  def this(
    loader: LoaderPlugin,
    key: ImageFileConfig,
    url: js.UndefOr[scala.Nothing],
    xhrSettings: XHRSettingsObject
  ) = this()
  def this(loader: LoaderPlugin, key: ImageFileConfig, url: String, xhrSettings: XHRSettingsObject) = this()
  def this(loader: LoaderPlugin, key: ImageFileConfig, url: js.Array[String], xhrSettings: XHRSettingsObject) = this()
  def this(
    loader: LoaderPlugin,
    key: String,
    url: js.UndefOr[scala.Nothing],
    xhrSettings: js.UndefOr[scala.Nothing],
    frameConfig: ImageFrameConfig
  ) = this()
  def this(
    loader: LoaderPlugin,
    key: String,
    url: js.UndefOr[scala.Nothing],
    xhrSettings: XHRSettingsObject,
    frameConfig: ImageFrameConfig
  ) = this()
  def this(
    loader: LoaderPlugin,
    key: String,
    url: String,
    xhrSettings: js.UndefOr[scala.Nothing],
    frameConfig: ImageFrameConfig
  ) = this()
  def this(
    loader: LoaderPlugin,
    key: String,
    url: String,
    xhrSettings: XHRSettingsObject,
    frameConfig: ImageFrameConfig
  ) = this()
  def this(
    loader: LoaderPlugin,
    key: String,
    url: js.Array[String],
    xhrSettings: js.UndefOr[scala.Nothing],
    frameConfig: ImageFrameConfig
  ) = this()
  def this(
    loader: LoaderPlugin,
    key: String,
    url: js.Array[String],
    xhrSettings: XHRSettingsObject,
    frameConfig: ImageFrameConfig
  ) = this()
  def this(
    loader: LoaderPlugin,
    key: ImageFileConfig,
    url: js.UndefOr[scala.Nothing],
    xhrSettings: js.UndefOr[scala.Nothing],
    frameConfig: ImageFrameConfig
  ) = this()
  def this(
    loader: LoaderPlugin,
    key: ImageFileConfig,
    url: js.UndefOr[scala.Nothing],
    xhrSettings: XHRSettingsObject,
    frameConfig: ImageFrameConfig
  ) = this()
  def this(
    loader: LoaderPlugin,
    key: ImageFileConfig,
    url: String,
    xhrSettings: js.UndefOr[scala.Nothing],
    frameConfig: ImageFrameConfig
  ) = this()
  def this(
    loader: LoaderPlugin,
    key: ImageFileConfig,
    url: String,
    xhrSettings: XHRSettingsObject,
    frameConfig: ImageFrameConfig
  ) = this()
  def this(
    loader: LoaderPlugin,
    key: ImageFileConfig,
    url: js.Array[String],
    xhrSettings: js.UndefOr[scala.Nothing],
    frameConfig: ImageFrameConfig
  ) = this()
  def this(
    loader: LoaderPlugin,
    key: ImageFileConfig,
    url: js.Array[String],
    xhrSettings: XHRSettingsObject,
    frameConfig: ImageFrameConfig
  ) = this()
}
