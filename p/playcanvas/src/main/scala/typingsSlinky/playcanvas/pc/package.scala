package typingsSlinky.playcanvas

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object pc {
  /**
    * @class
    * @name pc.AnimationHandler
    * @implements {pc.ResourceHandler}
    * @classdesc Resource handler used for loading {@link pc.Animation} resources.
    */
  type AnimationHandler = typingsSlinky.playcanvas.pc.ResourceHandler
  /**
    * @class
    * @name pc.AudioHandler
    * @implements {pc.ResourceHandler}
    * @classdesc Resource handler used for loading {@link pc.Sound} resources.
    * @param {pc.SoundManager} manager - The sound manager.
    */
  type AudioHandler = typingsSlinky.playcanvas.pc.ResourceHandler
  /**
    * @class
    * @name pc.CubemapHandler
    * @implements {pc.ResourceHandler}
    * @classdesc Resource handler used for loading cubemap {@link pc.Texture} resources.
    * @param {pc.GraphicsDevice} device - The graphics device.
    * @param {pc.AssetRegistry} assets - The asset registry.
    * @param {pc.ResourceLoader} loader - The resource loader.
    */
  type CubemapHandler = typingsSlinky.playcanvas.pc.ResourceHandler
  /**
    * @class
    * @name pc.FontHandler
    * @implements {pc.ResourceHandler}
    * @classdesc Resource handler used for loading {@link pc.Font} resources.
    * @param {pc.ResourceLoader} loader - The resource loader.
    */
  type FontHandler = typingsSlinky.playcanvas.pc.ResourceHandler
  /**
    * @class
    * @name pc.MaterialHandler
    * @implements {pc.ResourceHandler}
    * @classdesc Resource handler used for loading {@link pc.Material} resources.
    * @param {pc.Application} app - The running {@link pc.Application}.
    */
  type MaterialHandler = typingsSlinky.playcanvas.pc.ResourceHandler
  /**
    * @class
    * @name pc.SceneHandler
    * @implements {pc.ResourceHandler}
    * @classdesc Resource handler used for loading {@link pc.Scene} resources.
    * @param {pc.Application} app - The running {@link pc.Application}.
    */
  type SceneHandler = typingsSlinky.playcanvas.pc.ResourceHandler
  /**
    * @class
    * @name pc.ScriptHandler
    * @implements {pc.ResourceHandler}
    * @classdesc Resource handler for loading JavaScript files dynamically
    * Two types of JavaScript files can be loaded, PlayCanvas scripts which contain calls to {@link pc.createScript},
    * or regular JavaScript files, such as third-party libraries.
    * @param {pc.Application} app - The running {@link pc.Application}.
    */
  type ScriptHandler = typingsSlinky.playcanvas.pc.ResourceHandler
  /**
    * @class
    * @name pc.SpriteHandler
    * @implements {pc.ResourceHandler}
    * @classdesc Resource handler used for loading {@link pc.Sprite} resources.
    * @param {pc.AssetRegistry} assets - The asset registry.
    * @param {pc.GraphicsDevice} device - The graphics device.
    */
  type SpriteHandler = typingsSlinky.playcanvas.pc.ResourceHandler
  /**
    * @class
    * @name pc.TextureAtlasHandler
    * @implements {pc.ResourceHandler}
    * @classdesc Resource handler used for loading {@link pc.TextureAtlas} resources.
    * @param {pc.ResourceLoader} loader - The resource loader.
    */
  type TextureAtlasHandler = typingsSlinky.playcanvas.pc.ResourceHandler
  /**
    * @class
    * @name pc.TextureHandler
    * @implements {pc.ResourceHandler}
    * @classdesc Resource handler used for loading 2D and 3D {@link pc.Texture} resources.
    * @param {pc.GraphicsDevice} device - The graphics device.
    * @param {pc.AssetRegistry} assets - The asset registry.
    * @param {pc.ResourceLoader} loader - The resource loader.
    */
  type TextureHandler = typingsSlinky.playcanvas.pc.ResourceHandler
}
