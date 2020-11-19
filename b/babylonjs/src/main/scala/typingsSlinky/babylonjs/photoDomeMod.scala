package typingsSlinky.babylonjs

import typingsSlinky.babylonjs.anon.FaceForward
import typingsSlinky.babylonjs.backgroundMaterialMod.BackgroundMaterial
import typingsSlinky.babylonjs.meshMod.Mesh
import typingsSlinky.babylonjs.observableMod.Observable
import typingsSlinky.babylonjs.sceneMod.Scene
import typingsSlinky.babylonjs.textureMod.Texture
import typingsSlinky.babylonjs.transformNodeMod.TransformNode
import typingsSlinky.babylonjs.typesMod.Nullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Helpers/photoDome", JSImport.Namespace)
@js.native
object photoDomeMod extends js.Object {
  
  @js.native
  class PhotoDome protected () extends TransformNode {
    /**
      * Create an instance of this class and pass through the parameters to the relevant classes, Texture, StandardMaterial, and Mesh.
      * @param name Element's name, child elements will append suffixes for their own names.
      * @param urlsOfPhoto defines the url of the photo to display
      * @param options defines an object containing optional or exposed sub element properties
      * @param onError defines a callback called when an error occured while loading the texture
      */
    def this(name: String, urlOfPhoto: String, options: FaceForward, scene: Scene) = this()
    def this(
      name: String,
      urlOfPhoto: String,
      options: FaceForward,
      scene: Scene,
      onError: Nullable[
            js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[_], Unit]
          ]
    ) = this()
    
    var _changeImageMode: js.Any = js.native
    
    var _imageMode: js.Any = js.native
    
    /**
      * The skybox material
      */
    var _material: BackgroundMaterial = js.native
    
    /**
      * The surface used for the skybox
      */
    var _mesh: Mesh = js.native
    
    var _onBeforeCameraRenderObserver: js.Any = js.native
    
    /**
      * The texture being displayed on the sphere
      */
    var _photoTexture: Texture = js.native
    
    var _useDirectMapping: js.Any = js.native
    
    /**
      * The current fov(field of view) multiplier, 0.0 - 2.0. Defaults to 1.0. Lower values "zoom in" and higher values "zoom out".
      * Also see the options.resolution property.
      */
    def fovMultiplier: Double = js.native
    def fovMultiplier_=(value: Double): Unit = js.native
    
    /**
      * Gets or set the current video mode for the video. It can be:
      * * PhotoDome.MODE_MONOSCOPIC : Define the image as a Monoscopic panoramic 360 image.
      * * PhotoDome.MODE_TOPBOTTOM  : Define the image as a Stereoscopic TopBottom/OverUnder panoramic 360 image.
      * * PhotoDome.MODE_SIDEBYSIDE : Define the image as a Stereoscopic Side by Side panoramic 360 image.
      */
    def imageMode: Double = js.native
    def imageMode_=(value: Double): Unit = js.native
    
    /**
      * Gets the mesh used for the skybox.
      */
    def mesh: Mesh = js.native
    
    /**
      * Observable raised when an error occured while loading the 360 image
      */
    var onLoadErrorObservable: Observable[String] = js.native
    
    /**
      * Gets or sets the texture being displayed on the sphere
      */
    def photoTexture: Texture = js.native
    def photoTexture_=(value: Texture): Unit = js.native
  }
  /* static members */
  @js.native
  object PhotoDome extends js.Object {
    
    /**
      * Define the image as a Monoscopic panoramic 360 image.
      */
    val MODE_MONOSCOPIC: Double = js.native
    
    /**
      * Define the image as a Stereoscopic Side by Side panoramic 360 image.
      */
    val MODE_SIDEBYSIDE: Double = js.native
    
    /**
      * Define the image as a Stereoscopic TopBottom/OverUnder panoramic 360 image.
      */
    val MODE_TOPBOTTOM: Double = js.native
  }
}
