package typingsSlinky.phaser.Phaser.Cache

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.phaser.Phaser.Game
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The Cache Manager is the global cache owned and maintained by the Game instance.
  * 
  * Various systems, such as the file Loader, rely on this cache in order to store the files
  * it has loaded. The manager itself doesn't store any files, but instead owns multiple BaseCache
  * instances, one per type of file. You can also add your own custom caches.
  */
@js.native
trait CacheManager extends js.Object {
  /**
    * A Cache storing all non-streaming audio files, typically added via the Loader.
    */
  var audio: BaseCache = js.native
  /**
    * A Cache storing all binary files, typically added via the Loader.
    */
  var binary: BaseCache = js.native
  /**
    * A Cache storing all bitmap font data files, typically added via the Loader.
    * Only the font data is stored in this cache, the textures are part of the Texture Manager.
    */
  var bitmapFont: BaseCache = js.native
  /**
    * An object that contains your own custom BaseCache entries.
    * Add to this via the `addCustom` method.
    */
  var custom: StringDictionary[BaseCache] = js.native
  /**
    * A reference to the Phaser.Game instance that owns this CacheManager.
    */
  var game: Game = js.native
  /**
    * A Cache storing all html files, typically added via the Loader.
    */
  var html: BaseCache = js.native
  /**
    * A Cache storing all JSON data files, typically added via the Loader.
    */
  var json: BaseCache = js.native
  /**
    * A Cache storing all WaveFront OBJ files, typically added via the Loader.
    */
  var obj: BaseCache = js.native
  /**
    * A Cache storing all physics data files, typically added via the Loader.
    */
  var physics: BaseCache = js.native
  /**
    * A Cache storing all shader source files, typically added via the Loader.
    */
  var shader: BaseCache = js.native
  /**
    * A Cache storing all text files, typically added via the Loader.
    */
  var text: BaseCache = js.native
  /**
    * A Cache storing all tilemap data files, typically added via the Loader.
    * Only the data is stored in this cache, the textures are part of the Texture Manager.
    */
  var tilemap: BaseCache = js.native
  /**
    * A Cache storing all non-streaming video files, typically added via the Loader.
    */
  var video: BaseCache = js.native
  /**
    * A Cache storing all xml data files, typically added via the Loader.
    */
  var xml: BaseCache = js.native
  /**
    * Add your own custom Cache for storing your own files.
    * The cache will be available under `Cache.custom.key`.
    * The cache will only be created if the key is not already in use.
    * @param key The unique key of your custom cache.
    */
  def addCustom(key: String): BaseCache = js.native
  /**
    * Removes all entries from all BaseCaches and destroys all custom caches.
    */
  def destroy(): Unit = js.native
}

object CacheManager {
  @scala.inline
  def apply(
    addCustom: String => BaseCache,
    audio: BaseCache,
    binary: BaseCache,
    bitmapFont: BaseCache,
    custom: StringDictionary[BaseCache],
    destroy: () => Unit,
    game: Game,
    html: BaseCache,
    json: BaseCache,
    obj: BaseCache,
    physics: BaseCache,
    shader: BaseCache,
    text: BaseCache,
    tilemap: BaseCache,
    video: BaseCache,
    xml: BaseCache
  ): CacheManager = {
    val __obj = js.Dynamic.literal(addCustom = js.Any.fromFunction1(addCustom), audio = audio.asInstanceOf[js.Any], binary = binary.asInstanceOf[js.Any], bitmapFont = bitmapFont.asInstanceOf[js.Any], custom = custom.asInstanceOf[js.Any], destroy = js.Any.fromFunction0(destroy), game = game.asInstanceOf[js.Any], html = html.asInstanceOf[js.Any], json = json.asInstanceOf[js.Any], obj = obj.asInstanceOf[js.Any], physics = physics.asInstanceOf[js.Any], shader = shader.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], tilemap = tilemap.asInstanceOf[js.Any], video = video.asInstanceOf[js.Any], xml = xml.asInstanceOf[js.Any])
    __obj.asInstanceOf[CacheManager]
  }
  @scala.inline
  implicit class CacheManagerOps[Self <: CacheManager] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddCustom(value: String => BaseCache): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addCustom")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withAudio(value: BaseCache): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("audio")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBinary(value: BaseCache): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("binary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBitmapFont(value: BaseCache): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bitmapFont")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCustom(value: StringDictionary[BaseCache]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("custom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDestroy(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destroy")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGame(value: Game): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("game")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHtml(value: BaseCache): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("html")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withJson(value: BaseCache): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("json")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withObj(value: BaseCache): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("obj")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPhysics(value: BaseCache): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("physics")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShader(value: BaseCache): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shader")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withText(value: BaseCache): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTilemap(value: BaseCache): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tilemap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVideo(value: BaseCache): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("video")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withXml(value: BaseCache): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xml")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

