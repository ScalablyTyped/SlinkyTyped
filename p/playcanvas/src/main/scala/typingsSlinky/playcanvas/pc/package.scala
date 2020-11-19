package typingsSlinky.playcanvas

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object pc {
  
  /**
    * Create an AnimationComponentSystem.
    * @param app - The application managing this system.
    */
  type AnimationComponentSystem = typingsSlinky.playcanvas.pc.ComponentSystem
  
  /**
    * Resource handler used for loading {@link pc.Animation} resources.
    */
  type AnimationHandler = typingsSlinky.playcanvas.pc.ResourceHandler
  
  /**
    * Resource handler used for loading {@link pc.Sound} resources.
    * @param manager - The sound manager.
    */
  type AudioHandler = typingsSlinky.playcanvas.pc.ResourceHandler
  
  /**
    * Create new AudioListenerComponent.
    * @param system - The ComponentSystem that created this Component.
    * @param entity - The Entity that this Component is attached to.
    */
  type AudioListenerComponent = typingsSlinky.playcanvas.pc.Component
  
  /**
    * Create a new AudioListenerComponentSystem.
    * @param app - The application managing this system.
    * @param manager - A sound manager instance.
    */
  type AudioListenerComponentSystem = typingsSlinky.playcanvas.pc.ComponentSystem
  
  /**
    * Parser for basis files.
    */
  type BasisParser = typingsSlinky.playcanvas.pc.TextureParser
  
  /**
    * Create a new ButtonComponentSystem.
    * @param app - The application.
    */
  type ButtonComponentSystem = typingsSlinky.playcanvas.pc.ComponentSystem
  
  /**
    * Creates a new CollisionComponentSystem.
    * @param app - The running {pc.Application}.
    */
  type CollisionComponentSystem = typingsSlinky.playcanvas.pc.ComponentSystem
  
  /**
    * Component Systems contain the logic and functionality to update all Components of a particular type.
    * @param app - The application managing this system.
    */
  type ComponentSystem = typingsSlinky.playcanvas.pc.EventHandler
  
  /**
    * Loads files that contain multiple resources. For example glTF files can contain
    * textures, models and animations.
    * The asset options object can be used to pass load time callbacks for handling the various resources
    * at different stages of loading. The table below lists the resource types and the corresponding
    * supported process functions.
    * ```
    * |---------------------------------------------------------------------|
    * |  resource   |  preprocess |   process   |processAsync | postprocess |
    * |-------------+-------------+-------------+-------------+-------------|
    * | global      |      x      |             |             |      x      |
    * | node        |      x      |      x      |             |      x      |
    * | animation   |      x      |             |             |      x      |
    * | material    |      x      |      x      |             |      x      |
    * | image       |      x      |             |      x      |      x      |
    * | texture     |      x      |             |      x      |      x      |
    * | buffer      |      x      |             |      x      |      x      |
    * | bufferView  |      x      |             |      x      |      x      |
    * |---------------------------------------------------------------------|
    * ```
    * For example, to receive a texture preprocess callback:
    * ```javascript
    * var containerAsset = new pc.Asset(filename, 'container', { url: url, filename: filename }, null, {
    *     texture: {
    *         preprocess: function (gltfTexture) { console.log("texture preprocess"); }
    *     },
    * });
    * ```
    * @param device - The graphics device that will be rendering.
    * @param defaultMaterial - The shared default material that is used in any place that a material is not specified.
    */
  type ContainerHandler = typingsSlinky.playcanvas.pc.ResourceHandler
  
  /**
    * Resource handler used for loading cubemap {@link pc.Texture} resources.
    * @param device - The graphics device.
    * @param assets - The asset registry.
    * @param loader - The resource loader.
    */
  type CubemapHandler = typingsSlinky.playcanvas.pc.ResourceHandler
  
  /**
    * Texture parser for dds files.
    */
  type DdsParser = typingsSlinky.playcanvas.pc.TextureParser
  
  /**
    * Manages creation of {@link pc.ElementComponent}s.
    * @param app - The application.
    */
  type ElementComponentSystem = typingsSlinky.playcanvas.pc.ComponentSystem
  
  /**
    * Create a new ElementDragHelper.
    * @param element - The Element that should become draggable.
    * @param [axis] - Optional axis to constrain to, either 'x', 'y' or null.
    */
  type ElementDragHelper = typingsSlinky.playcanvas.pc.EventHandler
  
  /**
    * Resource handler used for loading {@link pc.Font} resources.
    * @param loader - The resource loader.
    */
  type FontHandler = typingsSlinky.playcanvas.pc.ResourceHandler
  
  /**
    * Parser for browser-supported image formats.
    */
  type ImgParser = typingsSlinky.playcanvas.pc.TextureParser
  
  /**
    * Texture parser for ktx files.
    */
  type KtxParser = typingsSlinky.playcanvas.pc.TextureParser
  
  /**
    * Create a new LayoutChildComponentSystem.
    * @param app - The application.
    */
  type LayoutChildComponentSystem = typingsSlinky.playcanvas.pc.ComponentSystem
  
  /**
    * Create a new LayoutGroupComponentSystem.
    * @param app - The application.
    */
  type LayoutGroupComponentSystem = typingsSlinky.playcanvas.pc.ComponentSystem
  
  /**
    * Legacy texture parser for dds files.
    */
  type LegacyDdsParser = typingsSlinky.playcanvas.pc.TextureParser
  
  /**
    * Create a new LightComponentSystem.
    * @param app - The application.
    */
  type LightComponentSystem = typingsSlinky.playcanvas.pc.ComponentSystem
  
  /**
    * Resource handler used for loading {@link pc.Material} resources.
    * @param app - The running {@link pc.Application}.
    */
  type MaterialHandler = typingsSlinky.playcanvas.pc.ResourceHandler
  
  /**
    * Create a new ModelComponentSystem.
    * @param app - The Application.
    */
  type ModelComponentSystem = typingsSlinky.playcanvas.pc.ComponentSystem
  
  /**
    * Create a new ParticleSystemComponentSystem.
    * @param app - The Application.
    */
  type ParticleSystemComponentSystem = typingsSlinky.playcanvas.pc.ComponentSystem
  
  /**
    * Resource handler used for loading {@link pc.Scene} resources.
    * @param app - The running {@link pc.Application}.
    */
  type SceneHandler = typingsSlinky.playcanvas.pc.ResourceHandler
  
  /**
    * Create a new ScreenComponentSystem.
    * @param app - The application.
    */
  type ScreenComponentSystem = typingsSlinky.playcanvas.pc.ComponentSystem
  
  /**
    * Create a new ScriptComponentSystem.
    * @param app - The application.
    */
  type ScriptComponentSystem = typingsSlinky.playcanvas.pc.ComponentSystem
  
  /**
    * Resource handler for loading JavaScript files dynamically
    Two types of JavaScript files can be loaded, PlayCanvas scripts which contain calls to {@link pc.createScript},
    or regular JavaScript files, such as third-party libraries.
    * @param app - The running {@link pc.Application}.
    */
  type ScriptHandler = typingsSlinky.playcanvas.pc.ResourceHandler
  
  /**
    * Create a new ScrollViewComponentSystem.
    * @param app - The application.
    */
  type ScrollViewComponentSystem = typingsSlinky.playcanvas.pc.ComponentSystem
  
  /**
    * Create a new ScrollbarComponentSystem.
    * @param app - The application.
    */
  type ScrollbarComponentSystem = typingsSlinky.playcanvas.pc.ComponentSystem
  
  /**
    * Manages creation of {@link pc.SpriteComponent}s.
    * @param app - The application.
    */
  type SpriteComponentSystem = typingsSlinky.playcanvas.pc.ComponentSystem
  
  /**
    * Resource handler used for loading {@link pc.Sprite} resources.
    * @param assets - The asset registry.
    * @param device - The graphics device.
    */
  type SpriteHandler = typingsSlinky.playcanvas.pc.ResourceHandler
  
  /**
    * Resource handler used for loading {@link pc.TextureAtlas} resources.
    * @param loader - The resource loader.
    */
  type TextureAtlasHandler = typingsSlinky.playcanvas.pc.ResourceHandler
  
  /**
    * Resource handler used for loading 2D and 3D {@link pc.Texture} resources.
    * @param device - The graphics device.
    * @param assets - The asset registry.
    * @param loader - The resource loader.
    */
  type TextureHandler = typingsSlinky.playcanvas.pc.ResourceHandler
}
