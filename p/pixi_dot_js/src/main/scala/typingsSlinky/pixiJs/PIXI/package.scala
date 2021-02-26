package typingsSlinky.pixiJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object PIXI {
  
  /**
    * {@link PIXI.Loader Loader} middleware for loading
    * bitmap-based fonts suitable for using with {@link PIXI.BitmapText}.
    * @class
    * @memberof PIXI
    * @implements PIXI.ILoaderPlugin
    */
  type BitmapFontLoader = typingsSlinky.pixiJs.PIXI.ILoaderPlugin
  
  /**
    * @memberof PIXI
    * @typedef {number} GD8Symmetry
    * @see PIXI.groupD8
    */
  type GD8Symmetry = scala.Double
  
  type IResourceDictionary = org.scalablytyped.runtime.StringDictionary[typingsSlinky.pixiJs.PIXI.LoaderResource]
  
  type ITextureDictionary = org.scalablytyped.runtime.StringDictionary[typingsSlinky.pixiJs.PIXI.Texture]
  
  /**
    * {@link PIXI.Loader Loader} middleware for loading texture atlases that have been created with
    * TexturePacker or similar JSON-based spritesheet.
    *
    * This middleware automatically generates Texture resources.
    *
    * @class
    * @memberof PIXI
    * @implements PIXI.ILoaderPlugin
    */
  type SpritesheetLoader = typingsSlinky.pixiJs.PIXI.ILoaderPlugin
  
  /**
    * Loader plugin for handling Texture resources.
    * @class
    * @memberof PIXI
    * @implements PIXI.ILoaderPlugin
    */
  type TextureLoader = typingsSlinky.pixiJs.PIXI.ILoaderPlugin
}
